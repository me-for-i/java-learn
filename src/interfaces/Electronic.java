package interfaces;

public interface Electronic {
    String LED = "LED";

    int getElectricityUse();

    static boolean isEnergyEfficient(String electronicType){
        System.out.println(electronicType);
        return electronicType.equals(LED);
    }

    default void printDescription(){
        System.out.printf("电子");
    }
}
