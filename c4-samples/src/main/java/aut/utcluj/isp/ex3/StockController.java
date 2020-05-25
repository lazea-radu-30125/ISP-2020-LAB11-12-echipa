package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author stefan
 */
public class StockController {
    private Map<String, List<Product>> catalogue;
    /**
     * Add product to catalogue
     *
     * @param product  - product information
     * @param quantity - number of times the product should be added
     * @apiNote: if products with the same products id already exists, assume that @param product has the same data
     */
    public void addProductToCatalogue(final Product product, final int quantity) {
        if (!catalogue.containsKey(product.getId())){
            catalogue.put(product.getId(),new ArrayList<>());
        }
        for(int i = 0; i < quantity; i++){
            catalogue.get(product.getId()).add(product);
        }
    }

    /**
     * Return catalogue information
     *
     * @return dictionary where the key is the product id and the value is an array of products with the same id
     */
    public Map<String, List<Product>> getCatalogue() {
        return catalogue;
    }

    /**
     * Return all the products with particular id
     *
     * @param productId - unique product id
     * @return - list of existing products with same id or null if not found
     */
    public List<Product> getProductsWithSameId(final String productId) {
        return catalogue.get(productId);
    }

    /**
     * Get total number of products from catalogue
     *
     * @return
     */
    public int getTotalNumberOfProducts() {
        int totalNumber = 0;
        for( List<Product>products : catalogue.values()){
            totalNumber += products.size();
        }
        return totalNumber;
    }

    /**
     * Remove all products with same product id
     *
     * @param productId - unique product id
     * @return true if at least one product was deleted or false instead
     */
    public boolean removeAllProductsWitProductId(final String productId) {
        if(catalogue.containsKey(productId)){
            catalogue.remove(productId);
            return true;
        } else{
            return false;
        }
    }

    /**
     * Update the price for all the products with same product id
     *
     * @param productId - unique product id
     * @param price     - new price to be added
     * @return true if at least one product was updated or false instead
     */
    public boolean updateProductPriceByProductId(final String productId, final Double price) {
        if(catalogue.containsKey(productId)){
            for (Product products : catalogue.get(productId)) {
                products.setPrice(price);
            }
            return true;
        } else {
            return false;
        }
    }
}
