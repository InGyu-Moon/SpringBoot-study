package org.example.springbootjpaupload.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDao {

    @Autowired
    BoardDaoInter daoInter;

    public void insertBoard(BoardDto dto){
        daoInter.save(dto);
    }

    public List<BoardDto> getAllDatas(){
        return daoInter.findAll(Sort.by(Sort.Direction.DESC,"num"));
    }
    public BoardDto getData(Long num){
        return daoInter.getReferenceById(num);
    }

    public void updateBoard(BoardDto dto) {
        daoInter.save(dto);
    }

    public void deleteBoard(Long num) {
        daoInter.deleteById(num);
    }


}
