import java.util.Scanner;

public class NitrogenFrozen extends FrozenProduct{
    ///private attributes
    private int exposureTime;
    private String FrozeMethod;

    ///getters setters
    public int getExposureTime(){return exposureTime;}
    public void setExposureTime(int exposureTime){this.exposureTime = exposureTime;}
    public String getFrozeMethod(){return FrozeMethod;}
    public void setFrozeMethod(String frozeMethod){FrozeMethod = frozeMethod;}

    ///constructor
    public NitrogenFrozen(int expirDate, int lotNumber, int packingDate, String countryOrigin, int maintenanceTemp, int exposureTime, String frozeMethod) {
        super(expirDate, lotNumber, packingDate, countryOrigin, maintenanceTemp);
        setExposureTime(exposureTime);
        setFrozeMethod(frozeMethod);
    }

    public String toString(){
        String baseDescription=super.toString();
        String messageFormat="\nNITROGEN FROZEN PRODUCT.\nExposure Time: %d seconds.\nMethod: "+getFrozeMethod();

        return baseDescription.concat(String.format(messageFormat,getExposureTime()));
    }
}