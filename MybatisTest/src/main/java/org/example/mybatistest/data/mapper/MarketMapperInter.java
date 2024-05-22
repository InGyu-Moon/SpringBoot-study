package org.example.mybatistest.data.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.mybatistest.data.dto.MarketDto;

import java.util.List;

@Mapper
public interface MarketMapperInter {
    public int getTotalCount();
    public void insertMarket(MarketDto dto);
    public List<MarketDto> getAllDatas();
    public MarketDto getData(int num);
    public void updateMarket(MarketDto dto);
    public void deleteMarket(int num);

}
