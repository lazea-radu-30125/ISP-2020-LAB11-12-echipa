package aut.utcluj.isp.ex4;

public interface ICartDetails {

    private String CartDetails;
    private String productId;
    private Double price;

    public interface ICartDetails(String CartDetails, String productId, Double price;){
        this.CartDetails = CartDetails;
        this.productId  = productId;
        this.price = price;
    }
    public void setCartDetails(String CartDetails){this.CartDetails = CartDetails;}
    public void setproduct(String productId){this.product = productId;}
    public void setprice(Double price){this.price = price;}
}
    String getCartDetails();
}
