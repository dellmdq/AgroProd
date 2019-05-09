import java.util.Scanner;

public class AirComposition {
    private int oxygen;
    private int nitrogen;
    private int carbonDioxide;
    private int steam;


    ///getters and setters
    public int getOxygen(){return oxygen;}
    public void setOxygen(int oxygen){this.oxygen = oxygen;}

    public int getNitrogen(){return nitrogen;}
    public void setNitrogen(int nitrogen){this.nitrogen = nitrogen;}

    public int getCarbonDioxide(){return carbonDioxide;}
    public void setCarbonDioxide(int carbonDioxide){this.carbonDioxide = carbonDioxide;}

    public int getSteam(){return steam;}
    public void setSteam(int steam){this.steam = steam;}

    ///constructor
    public AirComposition(int oxygen, int nitrogen, int carbonDioxide, int steam) {
        setOxygen(oxygen);
        setNitrogen(nitrogen);
        setCarbonDioxide(carbonDioxide);
        setSteam(steam);
    }


    @Override
    public String toString(){
        String messageFormat="Air Composition: \n %d percent Oxygen\n %d percent Nitrogen\n %d percent CO2\n %d percent Steam";

        return String.format(messageFormat,getOxygen(),getNitrogen(),getCarbonDioxide(),getSteam());
    }

}
