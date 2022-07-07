package student;

public class Main {
    public static void main(String[] args){
        System.out.println("Created student package");
        int milestone = 100000;
        int radius = 200;
        double area = 3.167 * radius * radius;

        System.out.println("Area = " + area);
        System.out.println("Difference : " + (area-milestone));
//        explicit and implicit conversion
        byte byteVal = 7;
        long longVal = 5;
        short result1 = byteVal;

        short result2 = (short) longVal;  ///this is explicit conversion / casting conversion

        boolean result = milestone > area ? true : false;

        System.out.println(result);

    }
}
