public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double myFirst, double mySecond){
        int x = (int)(myFirst * 1000);
        int y = (int)(mySecond * 1000);


        if(x == y){
            System.out.println("this is true");
            return true;
        }else{
            System.out.println("this is false");
            return false;
        }
    }
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
    }
}