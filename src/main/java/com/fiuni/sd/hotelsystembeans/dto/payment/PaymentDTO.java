package com.fiuni.sd.hotelsystembeans.dto.payment;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fiuni.sd.hotelsystembeans.dto.base.BaseDTO;

@XmlRootElement(name = "payment")
public class PaymentDTO extends BaseDTO {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer totalPay;
    private LocalDate paymentDate;
    @XmlElement
    public Integer getTotalPay() {
        return totalPay;
    }
    public void setTotalPay(Integer totalPay) {
        this.totalPay = totalPay;
    }
    @XmlElement
    public LocalDate getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }




}
