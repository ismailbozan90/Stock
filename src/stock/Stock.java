package stock;

/**
 *
 * @author ismail
 */
public class Stock {

    private String productCode;
    private String productName;
    private int stockCount;
    private int dataID;

    public Stock(String productCode, String productName, int stockCount, int dataID) {
       this.productCode = productCode;
       this.productName = productName;
       this.stockCount = stockCount;
       this.dataID = dataID;
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

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }
    
    public int getDataID() {
        return dataID;
    }

    public void setDataID(int dataID) {
        this.dataID = dataID;
    }
}
