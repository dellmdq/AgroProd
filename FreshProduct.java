public class FreshProduct extends Product {

    public FreshProduct(int expirDate, int lotNumber, int packingDate, String countryOrigin) {
        super(expirDate, lotNumber, packingDate, countryOrigin);
    }

    @Override
    public String toString() {
        String baseDescriptionFP=super.toString()+"\nFRESH PRODUCT";
        return baseDescriptionFP;
    }
}
