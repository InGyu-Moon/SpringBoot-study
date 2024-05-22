package org.example.mybatistest.data.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.sql.Timestamp;

@Data
@Alias("mdto")
public class MarketDto {
    private String num;
    private String sang;
    private int dan;
    private String photoname;
    private Timestamp ipgoday;
}
