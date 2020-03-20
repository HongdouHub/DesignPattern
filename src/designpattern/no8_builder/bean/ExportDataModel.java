package designpattern.no8_builder.bean;

public class ExportDataModel {

    /**
     * 产品编号
     */
    private String productId;

    /**
     * 销售价格
     */
    private double price;

    /**
     * 销售数量
     */
    private double amount;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public ExportDataModel() {
        //
    }

    public ExportDataModel(String productId, double price, double amount) {
        this.productId = productId;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return productId + "," + price + "," + amount + "\n";
    }
}
