public class HW1 {
    public static boolean getUp(boolean squawking, int currentHour) {
        if(squawking == true && (currentHour < 6 || currentHour > 22)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        System.out.println(getUp(true, 7));
    }
}
