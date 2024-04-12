package com.atguigu.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ClassName: PayDTO
 * Package: com.atguigu.cloud.entities
 * Description:
 *
 * @Author Mr.Hou
 * @Create 2024/4/5 16:44
 * @Version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PayDTO implements Serializable {
    private Integer id;
    //支付流水号
    private String payNo;
    //订单流水号
    private String orderNo;
    //用户账号id
    private Integer userId;
    //交易金额
    private BigDecimal amount;
}
