public class RefrigeratedProduct extends Product{
    private int codSenasa;
    private int maintenanceTemp;

    public int getCodSenasa(){return codSenasa;}
    public void setCodSenasa(int codSenasa) {this.codSenasa = codSenasa;}

    public int getMaintenanceTemp(){return maintenanceTemp;}
    public void setMaintenanceTemp(int maintenanceTemp){this.maintenanceTemp = maintenanceTemp;}

    public RefrigeratedProduct(int expirDate, int lotNumber, int packingDate, String countryOrigin, int codSenasa, int maintenanceTemp) {
        super(expirDate, lotNumber, packingDate, countryOrigin);
        setCodSenasa(codSenasa);
        setMaintenanceTemp(maintenanceTemp);
    }

    @Override
    public String toString() {
        String baseDescription=super.toString();///+"REFRIGERATED PRODUCT.\nCode Senana: "+this.codSenasa+"Maintenance Temp: "+this.maintenanceTemp;
        String messageFormat="\nREFRIGERATED PRODUCT.\nSenasa code: %d \nMaintenance Temperature: C° %d \n";
        return baseDescription.concat(String.format(messageFormat,getCodSenasa(),getMaintenanceTemp()));
    }
}
