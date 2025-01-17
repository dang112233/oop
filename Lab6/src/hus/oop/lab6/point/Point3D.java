package hus.oop.lab6.point;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }


    public float[] getXYZ() {
        float[] xyz = {x, y, z};
        return xyz;
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + ", " + z + '}';
    }
}
