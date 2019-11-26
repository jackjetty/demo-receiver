package com.csde.demo.receiver.pojo.vo;

import com.csde.demo.receiver.base.BaseVo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Getter
@Builder
public class OrderVo extends BaseVo{

    private static final long serialVersionUID = 3137906105516636165L;
    private String id;
    private int status;
    private String customer;
}