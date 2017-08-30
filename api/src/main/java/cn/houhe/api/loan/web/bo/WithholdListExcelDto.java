package cn.houhe.api.loan.web.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/27.
 */
public class WithholdListExcelDto {
    //订单号
    private String number;
    //姓名
    private  String bank_user_name;
    //手机号
    private String user_mobile;
    //扣款金额
    private BigDecimal repay_amount;
    //支付平台
    private String  pay_platform;
    //扣款时间
    private Date pay_time;
    //扣款状态0待还款1成功2失败
    private String status;

    public WithholdListExcelDto()
    {
    }

    public WithholdListExcelDto(String number, String bank_user_name, String user_mobile, BigDecimal repay_amount, String  pay_platform, Date pay_time, String status){
        this.number = number;
        this.bank_user_name = bank_user_name;
        this.user_mobile = user_mobile;
        this.repay_amount = repay_amount;
        this.pay_platform = pay_platform;
        this.pay_time = pay_time;
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBank_user_name() {
        return bank_user_name;
    }

    public void setBank_user_name(String bank_user_name) {
        this.bank_user_name = bank_user_name;
    }

    public String getUser_mobile() {
        return user_mobile;
    }

    public void setUser_mobile(String user_mobile) {
        this.user_mobile = user_mobile;
    }

    public BigDecimal getRepay_amount() {
        return repay_amount;
    }

    public void setRepay_amount(BigDecimal repay_amount) {
        this.repay_amount = repay_amount;
    }

    public String getPay_platform() {
        return pay_platform;
    }

    public void setPay_platform(String pay_platform) {
        this.pay_platform = pay_platform;
    }

    public Date getPay_time() {
        return pay_time;
    }

    public void setPay_time(Date pay_time) {
        this.pay_time = pay_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
