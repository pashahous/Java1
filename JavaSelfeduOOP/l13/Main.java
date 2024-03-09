package JavaSelfeduOOP.l13;

public class Main {
    public static void main(String[] args) {
        Triangle[] arrayOfTriangle = {
                new Triangle(476, 949, 917, 98, 271, 496),
                new Triangle(),
                new Triangle(34, 370, 720, 178, 1, 437)};
        for (Triangle triangle : arrayOfTriangle) {
            System.out.println(triangle);

        }


    }



}
