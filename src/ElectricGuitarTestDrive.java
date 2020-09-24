public class ElectricGuitarTestDrive {
    public static void main(String [] args){
        ElectricGuitar EG = new ElectricGuitar();
        System.out.println("The brand of the guitar is: "+EG.getBrand());
        System.out.println("The number of pickups is: "+EG.getNumOfPickups());
        System.out.println("Dose any RockStar use it? "+EG.getRockStarUsesIt());
        EG.setBrand("SB");
        EG.setNumOfPickups(5);
        EG.setRockStarUsesIt(true);
        System.out.println("The brand of the guitar is: "+EG.getBrand());
        System.out.println("The number of pickups is: "+EG.getNumOfPickups());
        System.out.println("Dose any RockStar use it? "+EG.getRockStarUsesIt());
    }
}
