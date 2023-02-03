package lk.ijse.studentsmanagement.dto;

import lk.ijse.studentsmanagement.entity.SuperEntity;

import java.sql.Date;

public class PaymentDTO implements SuperDTO{
    String id;
    String registrationId;
    String type;
    String remark;
    double amount;
    Date date;

    public PaymentDTO(String id, String type, String remark, double amount, Date date) {
        this.id = id;
        this.type = type;
        this.remark = remark;
        this.amount = amount;
        this.date = date;
    }

    public PaymentDTO(String id, String registrationId, String type, String remark, double amount, Date date) {
        this.id = id;
        this.registrationId = registrationId;
        this.type = type;
        this.remark = remark;
        this.amount = amount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public String getType() {
        return type;
    }

    public String getRemark() {
        return remark;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", registrationId='" + registrationId + '\'' +
                ", type='" + type + '\'' +
                ", remark='" + remark + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
