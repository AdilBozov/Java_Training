package tasks;

/**
 * Created by Adil Bozov on 29.11.2016 г..
 */


//        XYY,YYX и ZXZ са цели положителни числа,
//        записани в седмична бройна система.
//        С X,Y,Z са отбелязани неизвестни цифри от тези числа,
//        различни от нула.
//        Различните букви имат различно значение.
//        Известно е, че X>Y и XYY-YYX=ZXZ.
//        Намерете стойностите на X, Y и Z - необходимият отговор е техните стойности,
//        не цялото решение.

public class SerarchNumbers {

    public static void main(String[] args) {

        for (int z = 1; z <= 6; z++) {
            for (int x = 2; x <= 6; x++) {
                for (int y = 1; y <= 5; y++) {
                    String strXYY = String.valueOf(x) + String.valueOf(y) + String.valueOf(y);
                    //System.out.println(strXYY);
                    int xyy = Integer.parseInt(strXYY);
                   // System.out.println(xyy);
                    String strYYX = String.valueOf(y) + String.valueOf(y) + String.valueOf(x);
                    int yyx = Integer.parseInt(strYYX);
                    String strZXZ = String.valueOf(z) + String.valueOf(x) + String.valueOf(z);
                    int zxz = Integer.parseInt(strZXZ);

                    if ((xyy - yyx) == zxz){
                        System.out.println("True "+"XYY = " + xyy
                        + " YYX = " + yyx
                        + " ZXZ = " + zxz);
                    }
//                    else {
//                        System.out.println("False "+"XYY = " + xyy
//                                + " YYX = " + yyx
//                                + " ZXZ = " + zxz);
//                    }
                }

            }
        }
    }
}
