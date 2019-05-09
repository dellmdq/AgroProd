public abstract class FrozenProduct extends Product {
    private int maintenanceTemp;

    public int getMaintenanceTemp() {return maintenanceTemp;}
    public void setMaintenanceTemp(int temp){this.maintenanceTemp=temp;}

    public FrozenProduct(int expirDate, int lotNumber, int packingDate, String countryOrigin, int maintenanceTemp) {
        super(expirDate, lotNumber, packingDate, countryOrigin);
        setMaintenanceTemp(maintenanceTemp);
    }

    @Override
    public String toString() {
        String baseDescription=super.toString();
        String messageFormat="FROZEN PRODUCT.\nMaintenance Temperature: C° %d .";

        return baseDescription.concat(String.format(messageFormat,getMaintenanceTemp()));
    }
}
