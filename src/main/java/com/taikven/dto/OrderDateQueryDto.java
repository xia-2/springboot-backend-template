package com.taikven.dto;

import lombok.Data;

import java.util.Date;

/**
 * @Date: 2023/4/12
 * @Version: 1.0
 */
@Data
public class OrderDateQueryDto {
    private Integer uid;
    private Integer hid;
    private String startDate;
    private String endDate;
}
