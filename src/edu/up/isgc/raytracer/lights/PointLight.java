/**
 * [1968] - [2021] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package edu.up.isgc.raytracer.lights;

import edu.up.isgc.raytracer.Intersection;
import edu.up.isgc.raytracer.Vector3D;

import java.awt.*;

/**
 *
 * @author Jafet Rodríguez
 */

/**
 * A class that receives attributes from the Light class to create a new light that
 * will start from the assigned direction vector, it can be created from the raytracer main method, that will assign the position,
 * a color and its intensity.
 */
public class PointLight extends Light {

    public PointLight(Vector3D position, Color color, double intensity){
        super(position, color, intensity);
    }

    @Override
    public float getNDotL(Intersection intersection) {
        return (float) Math.max(Vector3D.dotProduct(intersection.getNormal(), Vector3D.normalize(Vector3D.substract(getPosition(), intersection.getPosition()))), 0.0);
    }
}