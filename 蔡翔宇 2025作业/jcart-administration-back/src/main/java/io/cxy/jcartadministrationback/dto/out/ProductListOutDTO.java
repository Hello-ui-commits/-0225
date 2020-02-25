package io.cxy.jcartadministrationback.dto.out;

public class ProductListOutDTO {
    private Integer ProductId;

    private  String mainPicUrl;

    private String productCode;

    private String productName;

    private String productAbstrale;

    private double peice;

    private byte status;

    private Integer rewordPoints;

    private Integer stockQuantity;

    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer productId) {
        ProductId = productId;
    }

    public String getMainPicUrl() {
        return mainPicUrl;
    }

    public void setMainPicUrl(String mainPicUrl) {
        this.mainPicUrl = mainPicUrl;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductAbstrale() {
        return productAbstrale;
    }

    public void setProductAbstrale(String productAbstrale) {
        this.productAbstrale = productAbstrale;
    }

    public double getPeice() {
        return peice;
    }

    public void setPeice(double peice) {
        this.peice = peice;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Integer getRewordPoints() {
        return rewordPoints;
    }

    public void setRewordPoints(Integer rewordPoints) {
        this.rewordPoints = rewordPoints;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}
