package JavaSelfeduOOP.l12;

public class Point3D {
    int x,y,z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void printCoords(){
        System.out.printf("x=%d%ny=%d%nz=%d%n",x,y,z);
    }
}
