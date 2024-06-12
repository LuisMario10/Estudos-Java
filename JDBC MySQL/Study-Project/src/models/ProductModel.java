package models;
public class ProductModel {
    private int id;
    private String nameProduct;
    private float price;
    private int quantity;
    private boolean isPromotion;

    public int getId() {
        return id;
    }
    public void setId() {
    }
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isPromotion() {
        return isPromotion;
    }

    public void setPromotion(boolean value) {
        isPromotion = value;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
