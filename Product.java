public abstract class Product {
    private int expirDate;
    private int lotNumber;
    private int packingDate;
    private String countryOrigin;

    public int getExpirDate() {
        return expirDate;
    }

    public void setExpirDate(int expirDate) {
        this.expirDate = expirDate;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotnumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    public int getPackingDate() {
        return packingDate;
    }

    public void setPackingDate(int packingDate) {
        this.packingDate = packingDate;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    ///CONSTRUCTOR
    public Product(int expirDate, int lotNumber, int packingDate, String countryOrigin) {
        setExpirDate(expirDate);
        setLotnumber(lotNumber);
        setPackingDate(packingDate);
        setCountryOrigin(countryOrigin);
    }

    @Override
    public String toString() {
        return "Product{" +
                "expirDate=" + expirDate +
                ", lotNumber=" + lotNumber +
                ", packingDate=" + packingDate +
                ", countryOrigin='" + countryOrigin +
                '}'+'\n';
    }
}
