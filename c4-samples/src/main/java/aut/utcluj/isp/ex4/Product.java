package aut.utcluj.isp.ex4;

public class Product {
    private String productId;
    private Double price;

            public Product(String productId, Double price) {

                this.productid = productid;
                this.price = price;
            }
            public void productId(String productid) {
                this.productid = productid;
            }
            public void setPrice(Double Price) {
                this.price = price;
            }

        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getProductId() {
        return productId;
    }

    public Double getPrice() {
        return price;
    }
}
