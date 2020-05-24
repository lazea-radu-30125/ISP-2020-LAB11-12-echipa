package aut.utcluj.isp.ex2;

/**
 * @author stefan
 */
public class OnlineShop extends Shop{
    private String webAddress;
    private Shop shop;

    public OnlineShop(String name, String city, String webAddress) {
        super(name,city);
        this.shop = new Shop(name,city);
        this.webAddress = webAddress;
    }

    public String getWebAddress() {
        return webAddress;
    }
}
