package org.example.mybatistest.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.mybatistest.data.dto.MarketDto;
import org.example.mybatistest.data.mapper.MarketMapperInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class MarketController {

    @Autowired
    MarketMapperInter mapper;

    @GetMapping("/")
    public String start() {
        return "redirect:market/list";
    }

    @GetMapping("/market/list")
    public ModelAndView list() {
        ModelAndView mview = new ModelAndView();

        int totalCount = mapper.getTotalCount();
        List<MarketDto> list = mapper.getAllDatas();
        mview.addObject("list", list);
        mview.addObject("totalCount", totalCount);
        mview.setViewName("market/marketlist");
        return mview;
    }

    @GetMapping("/market/addform")
    public String form() {
        return "market/addform";
    }

    @PostMapping("/market/insert")
    public String insert(
            @ModelAttribute MarketDto dto,
            @RequestParam MultipartFile photo,
            HttpServletRequest request) {
        String path = request.getServletContext().getRealPath("/photo");
        if (photo.getOriginalFilename().equals("")) {
            dto.setPhotoname(null);
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String photoname = sdf.format(new Date()) + photo.getOriginalFilename();
            dto.setPhotoname(photoname);

            try {
                photo.transferTo(new File(path + "\\" + photoname));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        mapper.insertMarket(dto);

        return "redirect:list";
    }

    @GetMapping("/market/updateform")
    public ModelAndView updateform(@RequestParam int num) {
        MarketDto dto = mapper.getData(num);
        ModelAndView mview = new ModelAndView();
        mview.addObject("dto", dto);
        mview.setViewName("market/updateform");
        return mview;
    }
    @PostMapping("/market/update")
    public String update(
            @ModelAttribute MarketDto dto,
            @RequestParam MultipartFile photo,
            HttpServletRequest request) {
        String path = request.getServletContext().getRealPath("/photo");
        if(!photo.getOriginalFilename().equals("")){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String photoname = sdf.format(new Date()) + photo.getOriginalFilename();
            dto.setPhotoname(photoname);
            try {
                photo.transferTo(new File(path + "\\" + photoname));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        mapper.updateMarket(dto);
        return "redirect:list";
    }
    @GetMapping("/market/delete")
    public String delete(@RequestParam int num, HttpServletRequest request){
        String photoname = mapper.getData(num).getPhotoname();
        if(!photoname.equals(null)){
            String path = request.getServletContext().getRealPath("/photo");
            File file = new File(path + "\\" + photoname);
            if(file.exists()){
                file.delete();
            }
        }
        mapper.deleteMarket(num);
        return "redirect:list";
    }
}
