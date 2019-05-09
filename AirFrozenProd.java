public class AirFrozenProd extends FrozenProduct{
    ///private atributes
    private AirComposition airComp;

    ///constructor
    public AirFrozenProd(int expirDate, int lotNumber, int packingDate, String countryOrigin, int maintenanceTemp, AirComposition airComp) {
        super(expirDate, lotNumber, packingDate, countryOrigin, maintenanceTemp);
        setAirComp(airComp);
    }

    public AirComposition getAirComp(){return airComp;}
    public void setAirComp(AirComposition airComp){this.airComp = airComp;}

    public String toString(){
        String baseDescription=super.toString();

        return baseDescription.concat("FROZEN BY AIR\n"+getAirComp().toString());
    }

}
