package io.cxy.jcartadministrationback.dto.out;

public class OrderHistoryListOutDTO {
    private Integer OrderHistorId;

    private Integer orderId;

    private String time;

    private Byte orderStatus;

    private String comment;

    private Byte customerNotified;

    public Integer getOrderHistorId() {
        return OrderHistorId;
    }

    public void setOrderHistorId(Integer orderHistorId) {
        OrderHistorId = orderHistorId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Byte getCustomerNotified() {
        return customerNotified;
    }

    public void setCustomerNotified(Byte customerNotified) {
        this.customerNotified = customerNotified;
    }
}
