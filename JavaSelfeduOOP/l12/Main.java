package JavaSelfeduOOP.l12;

public class Main {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(2, 5),
                new Line(6, 7),
                new Line(10, 23)
        };

        Point3D [] point3DS = {
                new Point3D(10,11,12),
                new Point3D(11,15,23),
                new Point3D(76,56,34)
        };

        for (Point3D point3D : point3DS) {
            point3D.printCoords();

        }

        for (Line line : lines) {
            line.printCoords();

        }


    }
}
