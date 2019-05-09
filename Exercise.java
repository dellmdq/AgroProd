import java.util.Scanner;

public class Exercise {
    public void ProductExercise() {
        /***TESTING AREA*/
        ///FreshProduct freshProd = generateFreshProduct();|1
        ///System.out.println(freshProd.toString());
        RefrigeratedProduct refriProd= generateRefrigeratedProduct();
        System.out.println(refriProd.toString());
        ///AirFrozenProd airFrozenP=generateAirFrozenProduct();
        ///System.out.println(airFrozenP.toString());
        ///WaterFrozen waterFrozenProd=generateWaterFrozenProduct();
        ///System.out.println(waterFrozenProd.toString());
        ///NitrogenFrozen nitroProd = generateNitrogenFrozenProduct();
        ///System.out.println(nitroProd.toString());

        /**END OF TESTING AREA*/


        String cont="s";
        Scanner reader=new Scanner(System.in);
        FreshProduct freshProduct1=null;
        FreshProduct freshProduct2=null;
        FreshProduct freshProduct3=null;
        FreshProduct freshProduct4=null;
        FreshProduct freshProduct5=null;
        RefrigeratedProduct refrigeratedProduct1=null;
        RefrigeratedProduct refrigeratedProduct2=null;
        RefrigeratedProduct refrigeratedProduct3=null;
        RefrigeratedProduct refrigeratedProduct4=null;
        RefrigeratedProduct refrigeratedProduct5=null;
        FrozenProduct frozenProduct1=null;
        FrozenProduct frozenProduct2=null;
        FrozenProduct frozenProduct3=null;
        FrozenProduct frozenProduct4=null;
        FrozenProduct frozenProduct5=null;

        while(cont.equals('s')||cont.equals('S')){
            System.out.println("STOCK INPUTS SYSTEM\n");
            System.out.println("Please select Product Type to Insert.\n" +
                    "1) FRESH PRODUCT.\n" +
                    "2) REFRIGERATED PRODUCT.\n" +
                    "3) FROZEN PRODUCT.\n");

            int option=reader.nextInt();

            switch(option){
                case(1):{
                    freshProduct1=generateFreshProduct();
                    System.out.println(freshProduct1.toString());
                    break;
                }
                case(2):{
                    refrigeratedProduct1=generateRefrigeratedProduct();
                    System.out.println(refrigeratedProduct1.toString());
                    break;
                }
                case(3):{
                    System.out.println("Please select FROZEN PRODUCT TYPE: \n"+
                            "1) AIR FROZEN.\n"+
                            "2) NITROGEN FROZEN.\n+"+
                            "3) WATER FROZEN.\n");
                    int option2=reader.nextInt();
                    switch(option2){
                        case(1):{
                            frozenProduct1=generateAirFrozenProduct();
                            System.out.println(frozenProduct1.toString());
                            break;
                        }
                        case(2):{
                            frozenProduct2=generateNitrogenFrozenProduct();
                            System.out.println(frozenProduct2.toString());
                            break;
                        }
                        case(3):{
                            frozenProduct3=generateNitrogenFrozenProduct();
                            System.out.println(frozenProduct3.toString());
                            break;
                        }
                    }
                }
                default: {
                    System.out.println("Incorrect option.");
                    break;
                }
            }
            System.out.println("Do you want to continue?");
            cont=reader.next();
        }
    }

    public Exercise() {
    }

    private FreshProduct generateFreshProduct(){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter expiration date(integer with no symbols and no leading zero): ");
        int expirDate=reader.nextInt();
        System.out.println("Enter lot number: ");
        int lotNumber=reader.nextInt();
        System.out.println("Enter packing date(integer with no symbols and no leading zero): ");
        int packingDate=reader.nextInt();
        System.out.println("Enter Country of Origin: ");
        String country=reader.next();

        return new FreshProduct(expirDate,lotNumber,packingDate,country);
    }

    private RefrigeratedProduct generateRefrigeratedProduct(){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter expiration date(integer with no symbols and no leading zero): ");
        int expirDate=reader.nextInt();
        System.out.println("Enter lot number: ");
        int lotNumber=reader.nextInt();
        System.out.println("Enter packing date(integer with no symbols and no leading zero): ");
        int packingDate=reader.nextInt();
        System.out.println("Enter Country of Origin: ");
        String country=reader.next();
        System.out.println("Enter Senasa Code: ");
        int senasaCode=reader.nextInt();
        System.out.println("Set Recommended Temperature: ");
        int recomendTemp=reader.nextInt();

        return new RefrigeratedProduct(expirDate,lotNumber,packingDate,country,senasaCode,recomendTemp);
    }

    private AirFrozenProd generateAirFrozenProduct(){
        Scanner reader=new Scanner(System.in);
        AirFrozenProd airFrozenP=null;
        AirComposition airComp=null;

        System.out.println("Enter expiration date(integer with no symbols and no leading zero): ");
        int expirDate=reader.nextInt();
        System.out.println("Enter lot number: ");
        int lotNumber=reader.nextInt();
        System.out.println("Enter packing date(integer with no symbols and no leading zero): ");
        int packingDate=reader.nextInt();
        System.out.println("Enter Country of Origin: ");
        String country=reader.next();
        System.out.println("Set Recommended Temperature: ");
        int recomendTemp=reader.nextInt();
        airComp=generateAirComposition();

        return airFrozenP=new AirFrozenProd(expirDate,lotNumber,packingDate,country,recomendTemp,airComp);
    }

    private AirComposition generateAirComposition(){
        Scanner reader=new Scanner(System.in);
        AirComposition airComp=null;
        int flag=0;

        while(flag==0) {
            System.out.println("AIR COMPOSITION SETTING.\n");
            System.out.println("Enter Oxygen percentage: ");
            int oxygen = reader.nextInt();
            System.out.println("Enter Nitrogen percentage: ");
            int nitro = reader.nextInt();
            System.out.println("Enter CO2 percentage: ");
            int co2 = reader.nextInt();
            System.out.println("Enter Steam percentage: ");
            int steam=reader.nextInt();
            int total=oxygen+nitro+co2+steam;
            if(total==100) {
                flag = 1;
                airComp = new AirComposition(oxygen, nitro, co2, steam);
            }
            else
                System.out.println("Air Composition must reach 100%\n");
        }
        return airComp;
    }

    private WaterFrozen generateWaterFrozenProduct(){
        Scanner reader=new Scanner(System.in);

        System.out.println("Enter expiration date(integer with no symbols and no leading zero): ");
        int expirDate=reader.nextInt();
        System.out.println("Enter lot number: ");
        int lotNumber=reader.nextInt();
        System.out.println("Enter packing date(integer with no symbols and no leading zero): ");
        int packingDate=reader.nextInt();
        System.out.println("Enter Country of Origin: ");
        String country=reader.next();
        System.out.println("Set Recommended Temperature: ");
        int recomendTemp=reader.nextInt();
        System.out.println("Enter Water Salinity: ");
        int waterSalinity=reader.nextInt();

        return new WaterFrozen(expirDate,lotNumber,packingDate,country,recomendTemp,waterSalinity);
    }
    private NitrogenFrozen generateNitrogenFrozenProduct(){
        Scanner reader=new Scanner(System.in);

        System.out.println("Enter expiration date(integer with no symbols and no leading zero): ");
        int expirDate=reader.nextInt();
        System.out.println("Enter lot number: ");
        int lotNumber=reader.nextInt();
        System.out.println("Enter packing date(integer with no symbols and no leading zero): ");
        int packingDate=reader.nextInt();
        System.out.println("Enter Country of Origin: ");
        String country=reader.next();
        System.out.println("Set Recommended Temperature: ");
        int recomendTemp=reader.nextInt();
        System.out.println("Enter exposure time: ");
        int exposureTime=reader.nextInt();
        System.out.println("Enter exposure method: ");
        String method=reader.next();

        return new NitrogenFrozen(expirDate,lotNumber,packingDate,country,recomendTemp,exposureTime,method);

    }

}
