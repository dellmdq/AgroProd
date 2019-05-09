public class WaterFrozen extends FrozenProduct {
    ///private attributes
    private int waterSalinity;

    public int getWaterSalinity() {
        return waterSalinity;
    }

    public void setWaterSalinity(int waterSalinity) {
        this.waterSalinity = waterSalinity;
    }

    public WaterFrozen(int expirDate, int lotNumber, int packingDate, String countryOrigin, int maintenanceTemp, int waterSalinity) {
        super(expirDate, lotNumber, packingDate, countryOrigin, maintenanceTemp);
        setWaterSalinity(waterSalinity);
    }

    @Override
    public String toString() {
        String baseDescription = super.toString();
        String messageFormat = "\nWATER FROZEN PRODUCT.\nWater Salinity: %d percent.";

        return baseDescription.concat(String.format(messageFormat, getWaterSalinity()));
    }
}
