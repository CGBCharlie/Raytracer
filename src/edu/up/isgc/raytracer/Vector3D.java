/**
 * [1968] - [2021] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package edu.up.isgc.raytracer;

/**
 *
 * @author Jafet Rodríguez
 */

/**
 * This class is used to map the scene in 3D with vectors, it was created from scratch and it is used
 * to check where all the objects are going to be placed, and the way all the rays travel through the scene,
 * it also adds ways to multiply these vectors, add them, subtract them, normalize them and get a magnitude,
 * all these formulas are necessary to calculate which way the rays will be going using the formulas needed
 * for the light, the refraction and reflection methods.
 */
public class Vector3D {

    private static final Vector3D ZERO = new Vector3D(0.0, 0.0, 0.0);
    private double x, y, z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector3D(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    /**
     * This method multiplies each value of two vectors and adds them to return a scalar.
     * @param vectorA
     * @param vectorB
     * @return
     */
    public static double dotProduct(Vector3D vectorA, Vector3D vectorB){
        return (vectorA.getX() * vectorB.getX()) + (vectorA.getY() * vectorB.getY()) + (vectorA.getZ() * vectorB.getZ());
    }

    /**
     * This method turns the formula of multiplying to vectors, Cross Product and returns the resulting vector.
     * @param vectorA
     * @param vectorB
     * @return
     */
   public static Vector3D crossProduct(Vector3D vectorA, Vector3D vectorB){
        return new Vector3D((vectorA.getY() * vectorB.getZ()) - (vectorA.getZ() * vectorB.getY()),
                (vectorA.getZ() * vectorB.getX()) - (vectorA.getX() * vectorB.getZ()),
                (vectorA.getX() * vectorB.getY()) - (vectorA.getY() * vectorB.getX()));
    }

    /**
     * This method returns a double known as a scalar which grabs each value from the vector, add them and returns the square root.
     * @param vectorA
     * @return
     */
    public static double magnitude(Vector3D vectorA){
        return Math.sqrt(dotProduct(vectorA, vectorA));
    }

    /**
     * This method grabs each value from two vectors and adds them to return a new vector.
     * @param vectorA
     * @param vectorB
     * @return
     */
    public static Vector3D add(Vector3D vectorA, Vector3D vectorB){
        return new Vector3D(vectorA.getX() + vectorB.getX(), vectorA.getY() + vectorB.getY(), vectorA.getZ() + vectorB.getZ());
    }

    /**
     * This method grabs each value from two vectors and substracts them to return a new vector.
     * @param vectorA
     * @param vectorB
     * @return
     */
    public static Vector3D substract(Vector3D vectorA, Vector3D vectorB){
        return new Vector3D(vectorA.getX() - vectorB.getX(), vectorA.getY() - vectorB.getY(), vectorA.getZ() - vectorB.getZ());
    }

    /**
     * This method grabs each individual value from the vector and divides it by the magnitude it returns the resulting vector
     * @param vectorA
     * @return
     */
    public static Vector3D normalize(Vector3D vectorA){
        double mag = Vector3D.magnitude(vectorA);
        return new Vector3D(vectorA.getX() / mag, vectorA.getY() / mag, vectorA.getZ() / mag);
    }

    /**
     * This method grabs each individual value from the vector and multiplies them by a an scalar and returns the vector
     * @param vectorA
     * @param scalar
     * @return
     */
    public static Vector3D scalarMultiplication(Vector3D vectorA, double scalar){
        return new Vector3D(vectorA.getX() * scalar, vectorA.getY() * scalar, vectorA.getZ() * scalar);
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }

    public Vector3D clone(){
        return new Vector3D(getX(), getY(), getZ());
    }

    public static Vector3D ZERO(){
        return ZERO.clone();
    }
}
