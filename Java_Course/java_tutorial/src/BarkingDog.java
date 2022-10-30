package Java_Course.java_tutorial.src;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean ifBarking, int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23){
            return false;
        }else if((hourOfDay<8 || hourOfDay >22) && ifBarking){
            return true;
        }else{
            return false;
        }
    }
}