/**
 * [1968] - [2021] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package edu.up.isgc.raytracer;

import edu.up.isgc.raytracer.lights.DirectionalLight;
import edu.up.isgc.raytracer.lights.Light;
import edu.up.isgc.raytracer.lights.PointLight;
import edu.up.isgc.raytracer.objects.*;
import edu.up.isgc.raytracer.objects.Polygon;
import edu.up.isgc.raytracer.tools.OBJReader;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Jafet Rodríguez and Carlos García
 */

/**
 * mainRunner class for the raytracer, inside the main class all objects are created with the desired position, the material, and where all scenes
 * will be created and then rendered, inside the scene a camera must be created with the attributes needed to create the space for the raytraces,
 * including field of view, width and height, starting position, and near and far planes for objects to be rendered in, this class makes use of most
 * classes in the project, lights, objects and tools.
 */

public class Raytracer {
    public static void main(String[] args) {
        System.out.println(new Date());
        Scene scene01 = new Scene();
        Material reflective = new Material(.035, 80, true, 1.5, false);
        Material nonReflective = new Material(.035, 80, false, 1.5, false);
        Material refractive = new Material(.035, 80, false, 1.5, true);
        scene01.setCamera(new Camera(new Vector3D(0, 0, -8), 160, 160, 2500, 2500, 0f, 50f));

        //// tetera test
//        scene01.addLight(new PointLight(new Vector3D(-2, 1, 1), Color.WHITE, 1));
//        scene01.addLight(new PointLight(new Vector3D(2, 1, 1), Color.BLUE, 1));
//        scene01.addObject(OBJReader.GetPolygon("SmallTeapot.obj", new Vector3D(0f, -1f, 4f), Color.CYAN, reflective));
//        scene01.addObject(new Sphere(new Vector3D(0f, 0.3f, 0f), 0.5f, Color.WHITE, refractive));
//        scene01.addObject(new Polygon(new Vector3D(0, -1, 0), new Triangle[]{new Triangle(new Vector3D(-7, 0, -7), new Vector3D(7, 0, -7), new Vector3D(7, 0, 7)), new Triangle(new Vector3D(7, 0, 7), new Vector3D(-7, 0, 7), new Vector3D(-7, 0, -7))}, Color.WHITE, reflective));

        // first render tree
//        scene01.addObject(OBJReader.GetPolygon("treeBranch.obj", new Vector3D(0f, -5f, 17f), new Color(53, 35, 14), nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("treeLeaves.obj", new Vector3D(0f, -5f, 17f), Color.GREEN, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("walls.obj", new Vector3D(0f, -5f, 17f), new Color(194, 234, 186), reflective));
//        scene01.addObject(new Sphere(new Vector3D(0f, .2f, 0f), 1f, Color.BLACK, refractive));
//        scene01.addLight(new PointLight(new Vector3D(-5, 0, -2), new Color(197, 244, 224), 3));
//        scene01.addLight(new PointLight(new Vector3D(5, 0, -2), new Color(197, 244, 224), 3));
//        scene01.addObject(new Polygon(new Vector3D(0, -5, 0), new Triangle[]{new Triangle(new Vector3D(-25, 0, -25), new Vector3D(25, 0, -25), new Vector3D(25, 0, 25)), new Triangle(new Vector3D(25, 0, 25), new Vector3D(-25, 0, 25), new Vector3D(-25, 0, -25))}, new Color(194, 234, 186), nonReflective));
//        scene01.addObject(new Polygon(new Vector3D(0, 8, 0), new Triangle[]{new Triangle(new Vector3D(-25, 0, -25), new Vector3D(25, 0, -25), new Vector3D(25, 0, 25)), new Triangle(new Vector3D(25, 0, 25), new Vector3D(-25, 0, 25), new Vector3D(-25, 0, -25))}, new Color(194, 234, 186), nonReflective));
//        scene01.addLight(new DirectionalLight(Vector3D.ZERO(), new Vector3D(0, 0, 20), new Color(197, 244, 224), .1));

        // second render stars
//        scene01.addObject(OBJReader.GetPolygon("pyramid.obj", new Vector3D(0f, 0, 3f), Color.BLACK, refractive));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-7.65f, 5.9f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-5.95f, 5.9f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-4.25f, 5.9f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-2.55f, 5.9f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-.85f, 5.9f, 9.5f), Color.YELLOW, nonReflective));
//            // line 5
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-7.65f, 4.5f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-5.95f, 4.5f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-4.25f, 4.5f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-2.55f, 4.5f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-.85f, 4.5f, 9.5f), Color.YELLOW, nonReflective));
//            //line 4
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-7.65f, 3.1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-5.95f, 3.1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-4.25f, 3.1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-2.55f, 3.1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-.85f, 3.1f, 9.5f), Color.YELLOW, nonReflective));
//            // line 3
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-7.65f, 1.7f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-5.95f, 1.7f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-4.25f, 1.7f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-2.55f, 1.7f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-.85f, 1.7f, 9.5f), Color.YELLOW, nonReflective));
//            // line 2
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-7.65f, .3f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-5.95f, .3f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-4.25f, .3f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-2.55f, .3f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-.85f, .3f, 9.5f), Color.YELLOW, nonReflective));
//            // line 1
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-7.65f, -1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-5.95f, -1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-4.25f, -1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-2.55f, -1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(-.85f, -1f, 9.5f), Color.YELLOW, nonReflective));
//           // center
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(.85f, -1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(2.55f, -1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(4.25f, -1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(5.95f, -1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(7.65f, -1f, 9.5f), Color.YELLOW, nonReflective));
//            // line 1
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(.85f, .3f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(2.55f, .3f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(4.25f, .3f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(5.95f, .3f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(7.65f, .3f, 9.5f), Color.YELLOW, nonReflective));
//            // line 2
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(.85f, 1.7f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(2.55f, 1.7f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(4.25f, 1.7f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(5.95f, 1.7f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(7.65f, 1.7f, 9.5f), Color.YELLOW, nonReflective));
//            // line 3
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(.85f, 3.1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(2.55f, 3.1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(4.25f, 3.1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(5.95f, 3.1f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(7.65f, 3.1f, 9.5f), Color.YELLOW, nonReflective));
//            // line 4
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(.85f, 4.5f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(2.55f, 4.5f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(4.25f, 4.5f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(5.95f, 4.5f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(7.65f, 4.5f, 9.5f), Color.YELLOW, nonReflective));
//            // line 5
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(.85f, 5.9f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(2.55f, 5.9f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(4.25f, 5.9f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(5.95f, 5.9f, 9.5f), Color.YELLOW, nonReflective));
//        scene01.addObject(OBJReader.GetPolygon("star.obj", new Vector3D(7.65f, 5.9f, 9.5f), Color.YELLOW, nonReflective));
//
//        scene01.addLight(new PointLight(new Vector3D(4, 4, -4), Color.BLUE, 1));
//        scene01.addLight(new PointLight(new Vector3D(-4, 4, -4), Color.RED, 1));
//        scene01.addLight(new PointLight(new Vector3D(4, -4, -4), Color.GREEN, 1));
//        scene01.addLight(new PointLight(new Vector3D(-4, -4, -4), Color.MAGENTA, 1));
//        scene01.addLight(new DirectionalLight(Vector3D.ZERO(), new Vector3D(0, -1, 5), Color.WHITE, 1));
//
//        scene01.addObject(new Polygon(new Vector3D(0, -1, 0), new Triangle[]{new Triangle(new Vector3D(-10, 0, -10), new Vector3D(10, 0, -10), new Vector3D(10, 0, 10)), new Triangle(new Vector3D(10, 0, 10), new Vector3D(-10, 0, 10), new Vector3D(-10, 0, -10))}, Color.WHITE, reflective));

        // third render
        scene01.addObject(new Polygon(new Vector3D(0, -3, 0), new Triangle[]{new Triangle(new Vector3D(-10, 0, -10), new Vector3D(10, 0, -10), new Vector3D(10, 0, 10)), new Triangle(new Vector3D(10, 0, 10), new Vector3D(-10, 0, 10), new Vector3D(-10, 0, -10))}, new Color(200, 193, 174), reflective));
        scene01.addLight(new PointLight(new Vector3D(-3, 4, -5), Color.WHITE, 1.3));
        scene01.addLight(new PointLight(new Vector3D(3, 4, -5), Color.WHITE, 1.3));
        scene01.addLight(new PointLight(new Vector3D(0, 4, -5), Color.WHITE, 1.3));
        scene01.addObject(OBJReader.GetPolygon("chair.obj", new Vector3D(0f, -3f, 5f), new Color(183,168,148), nonReflective));
        scene01.addObject(OBJReader.GetPolygon("desk.obj", new Vector3D(0f, -3f, 5f), new Color(76,52,35), nonReflective));
        scene01.addObject(OBJReader.GetPolygon("laptop.obj", new Vector3D(0f, -3f, 5f), Color.GRAY, nonReflective));
        scene01.addObject(OBJReader.GetPolygon("wallDesk.obj", new Vector3D(0f, -3f, 5f), new Color(76, 62, 53), nonReflective));
        scene01.addObject(OBJReader.GetPolygon("window.obj", new Vector3D(0f, -3, 5f), new Color(135, 206, 235), reflective));
        scene01.addObject(OBJReader.GetPolygon("clouds.obj", new Vector3D(0f, -3, 5f), Color.WHITE, nonReflective));

        BufferedImage image = raytrace(scene01);
        File outputImage = new File("image.png");
        try {
            ImageIO.write(image, "png", outputImage);
        } catch (IOException ioe) {
            System.out.println("Something failed");
        }
        System.out.println(new Date());
    }

    /**
     * The raytrace method receives a scene from the main method of the project that has a camera, objects, planes, and all lights
     * It creates an empty image with the parameters given from the camera and goes through every single pixel and throws a ray to the pixel
     * using the method raycast that return either an intersection with the object or null if it doesn't collide and then checks if there was
     * a collision in that pixel, if there was it will proceed to use light by light to see what color to add to that pixel, starting with
     * its color and adding different types of color depending on the material and the intensity of the light it will add specular, diffuse,
     * ambient, a light falloff and finally it will throw another ray from the object to the light and if it collides with another object
     * the pixel will change to black to create a shadow
     */
    public static BufferedImage raytrace(Scene scene) {
        Camera mainCamera = scene.getCamera();
        ArrayList<Light> lights = scene.getLights();
        float[] nearFarPlanes = mainCamera.getNearFarPlanes();
        BufferedImage image = new BufferedImage(mainCamera.getResolutionWidth(), mainCamera.getResolutionHeight(), BufferedImage.TYPE_INT_RGB);
        ArrayList<Object3D> objects = scene.getObjects();

        Vector3D[][] positionsToRaytrace = mainCamera.calculatePositionsToRay();
        for (int i = 0; i < positionsToRaytrace.length; i++) {
//            System.out.println(i + "/" + positionsToRaytrace.length);
            for (int j = 0; j < positionsToRaytrace[i].length; j++) {
                double x = positionsToRaytrace[i][j].getX() + mainCamera.getPosition().getX();
                double y = positionsToRaytrace[i][j].getY() + mainCamera.getPosition().getY();
                double z = positionsToRaytrace[i][j].getZ() + mainCamera.getPosition().getZ();

                Ray ray = new Ray(mainCamera.getPosition(), new Vector3D(x, y, z));
                float cameraZ = (float) mainCamera.getPosition().getZ();
                // Throws a ray from the camera to the pixel that it is checking and returns the intersection with an object of the scene or a null
                Intersection closestIntersection = raycast(ray, objects, null, new float[]{cameraZ + nearFarPlanes[0], cameraZ + nearFarPlanes[1]});

                //Background color
                Color pixelColor = Color.BLACK;
                if (closestIntersection != null) {
                    pixelColor = Color.BLACK;
                    for (Light light : lights) {
                        // shadows
                        // throws a ray from the object to the light to search for another collision which would mean the object is not getting any light, and will change to a shadow
                        Ray shadowsRay = new Ray(closestIntersection.getPosition(), Vector3D.normalize(Vector3D.substract(light.getPosition(), closestIntersection.getPosition())));
                        if (light instanceof DirectionalLight) {
                            shadowsRay = new Ray(closestIntersection.getPosition(), Vector3D.normalize(Vector3D.scalarMultiplication(((DirectionalLight) light).getDirection(), -1)));
                        }
                        Intersection shadows = raycast(shadowsRay, objects, closestIntersection.getObject(), new float[]{cameraZ + nearFarPlanes[0], cameraZ + nearFarPlanes[1]});

                        Color lightColor = light.getColor();
                        Color objColor = closestIntersection.getObject().getColor();
                        float[] lightColors = new float[]{lightColor.getRed() / 255.0f, lightColor.getGreen() / 255.0f, lightColor.getBlue() / 255.0f};
                        float[] objColors = new float[]{objColor.getRed() / 255.0f, objColor.getGreen() / 255.0f, objColor.getBlue() / 255.0f};

                        // light Falloff
                        float nDotL = light.getNDotL(closestIntersection);
                        float intensity = (float) light.getIntensity() * nDotL;
                        intensity = (float) (intensity / Math.pow(Vector3D.magnitude(Vector3D.substract(closestIntersection.getPosition(), light.getPosition())), 1));
                        for (int colorIndex = 0; colorIndex < objColors.length; colorIndex++) {
                            objColors[colorIndex] *= (intensity) * lightColors[colorIndex];
                        }

                        // diffuse
                        Color diffuse = new Color(clamp(objColors[0], 0, 1),clamp(objColors[1], 0, 1),clamp(objColors[2], 0, 1));
                        pixelColor = addColor(pixelColor, diffuse);

                        // ambient
                        lightColors = new float[]{lightColor.getRed() / 255.0f, lightColor.getGreen() / 255.0f, lightColor.getBlue() / 255.0f};
                        objColors = new float[]{objColor.getRed() / 255.0f, objColor.getGreen() / 255.0f, objColor.getBlue() / 255.0f};
                        double ambientValue = closestIntersection.getObject().getMaterial().getAmbientValue();
                        for (int colorIndex = 0; colorIndex < objColors.length; colorIndex++) {
                            objColors[colorIndex] *= (ambientValue) * lightColors[colorIndex];
                        }
                        Color ambient = new Color(clamp(objColors[0], 0, 1),clamp(objColors[1], 0, 1),clamp(objColors[2], 0, 1));
                        pixelColor = addColor(pixelColor, ambient);

                        // specular
                        lightColors = new float[]{lightColor.getRed() / 255.0f, lightColor.getGreen() / 255.0f, lightColor.getBlue() / 255.0f};
                        objColors = new float[]{objColor.getRed() / 255.0f, objColor.getGreen() / 255.0f, objColor.getBlue() / 255.0f};
                        Vector3D H = Vector3D.scalarMultiplication(Vector3D.add(light.getPosition(), mainCamera.getPosition()), 1 / Vector3D.magnitude(Vector3D.add(light.getPosition(), mainCamera.getPosition())));
                        double shininess = closestIntersection.getObject().getMaterial().getShininess();
                        double specularValue = Math.pow(Vector3D.dotProduct(closestIntersection.getNormal(), H), shininess);
                        for (int colorIndex = 0; colorIndex < objColors.length; colorIndex++) {
                            objColors[colorIndex] *= (specularValue) * lightColors[colorIndex];
                        }
                        Color specular = new Color(clamp(objColors[0], 0, 1), clamp(objColors[1], 0, 1), clamp(objColors[2], 0, 1));
                        pixelColor = addColor(pixelColor, specular);

                        if (shadows != null) {
                            pixelColor = Color.BLACK;
                        }

                        // reflection
                        // calls the reflection method if the material was a reflective material by creating a ray from the camera to the object and adds it to the pixel color, and repeats the process of refractiveness
                        Ray startingRay = new Ray(mainCamera.getPosition(), Vector3D.substract(closestIntersection.getPosition(), mainCamera.getPosition()));
                        if (closestIntersection.getObject().getMaterial().isReflective()) {
                            int count = 0;
                            pixelColor = addColor(pixelColor, reflection(scene, closestIntersection, new float[]{cameraZ + nearFarPlanes[0], cameraZ + nearFarPlanes[1]}, startingRay, count));
                        }
                        if (closestIntersection.getObject().getMaterial().isRefractive()) {
                            pixelColor = addColor(pixelColor, refraction(scene, closestIntersection, new float[]{cameraZ + nearFarPlanes[0], cameraZ + nearFarPlanes[1]}, startingRay));
                        }
                    }
                }
                image.setRGB(i, j, pixelColor.getRGB());
            }
        }

        return image;
    }

    /**
     * @param scene
     * @param closestIntersection
     * @param planes
     * @param startingRay
     * @param count
     * This reflection method first creates a new vector called Incident Vector that goes from the object to the starting point, which at first would be the camera
     * and the second time it runs it would be the object that it is reflecting from, and then using the normals of the object creates and emerging vector with the reflection
     * formula, this process repeats itself until the vector intersects an object that does not have reflection or when it reflects five times, it is a recursive method that
     * repeats the process of the raytrace method and returns a new color which will be added to the pixel creating  reflection, it also checks if the object that needs to reflect
     * is a refractive object to reflect whatever the object was refracting.
     * @return
     */
   public static Color reflection(Scene scene, Intersection closestIntersection, float[] planes, Ray startingRay, int count) {
        count += 1;
        Vector3D IncidentVector = Vector3D.normalize(Vector3D.substract(closestIntersection.getPosition(), startingRay.getOrigin()));
        Vector3D ReflectionVector = Vector3D.normalize(Vector3D.substract(IncidentVector, Vector3D.scalarMultiplication(closestIntersection.getNormal(), 2 * Vector3D.dotProduct(closestIntersection.getNormal(), IncidentVector))));

        Ray ReflectionRay = new Ray(closestIntersection.getPosition(), ReflectionVector);

        Intersection reflect = raycast(ReflectionRay, scene.getObjects(), closestIntersection.getObject(), planes);

        ArrayList<Object3D> objects = scene.getObjects();

        Color pixelColor = Color.BLACK;
        if (reflect != null) {
            for (Light light : scene.getLights()) {
                // shadows
                Ray shadowsRay = new Ray(reflect.getPosition(), Vector3D.normalize(Vector3D.substract(light.getPosition(), reflect.getPosition())));
                if (light instanceof DirectionalLight) {
                    shadowsRay = new Ray(reflect.getPosition(), Vector3D.normalize(Vector3D.scalarMultiplication(((DirectionalLight) light).getDirection(), -1)));
                }
                Intersection shadows = raycast(shadowsRay, objects, reflect.getObject(), planes);

                Color lightColor = light.getColor();
                Color objColor = reflect.getObject().getColor();
                float[] lightColors = new float[]{lightColor.getRed() / 255.0f, lightColor.getGreen() / 255.0f, lightColor.getBlue() / 255.0f};
                float[] objColors = new float[]{objColor.getRed() / 255.0f, objColor.getGreen() / 255.0f, objColor.getBlue() / 255.0f};

                // light Falloff
                float nDotL = light.getNDotL(reflect);
                float intensity = (float) light.getIntensity() * nDotL;
                intensity = (float) (intensity / Math.pow(Vector3D.magnitude(Vector3D.substract(reflect.getPosition(), light.getPosition())), 1));
                for (int colorIndex = 0; colorIndex < objColors.length; colorIndex++) {
                    objColors[colorIndex] *= (intensity) * lightColors[colorIndex];
                }

                // diffuse
                Color diffuse = new Color(clamp(objColors[0], 0, 1), clamp(objColors[1], 0, 1), clamp(objColors[2], 0, 1));
                pixelColor = addColor(pixelColor, diffuse);

                // ambient
                lightColors = new float[]{lightColor.getRed() / 255.0f, lightColor.getGreen() / 255.0f, lightColor.getBlue() / 255.0f};
                objColors = new float[]{objColor.getRed() / 255.0f, objColor.getGreen() / 255.0f, objColor.getBlue() / 255.0f};
                double ambientValue = reflect.getObject().getMaterial().getAmbientValue();
                for (int colorIndex = 0; colorIndex < objColors.length; colorIndex++) {
                    objColors[colorIndex] *= (ambientValue) * lightColors[colorIndex];
                }
                Color ambient = new Color(clamp(objColors[0], 0, 1), clamp(objColors[1], 0, 1), clamp(objColors[2], 0, 1));
                pixelColor = addColor(pixelColor, ambient);

                // specular
                lightColors = new float[]{lightColor.getRed() / 255.0f, lightColor.getGreen() / 255.0f, lightColor.getBlue() / 255.0f};
                objColors = new float[]{objColor.getRed() / 255.0f, objColor.getGreen() / 255.0f, objColor.getBlue() / 255.0f};
                Vector3D H = Vector3D.scalarMultiplication(Vector3D.add(light.getPosition(), scene.getCamera().getPosition()), 1 / Vector3D.magnitude(Vector3D.add(light.getPosition(), scene.getCamera().getPosition())));
                double shininess = reflect.getObject().getMaterial().getShininess();
                double specularValue = Math.pow(Vector3D.dotProduct(reflect.getNormal(), H), shininess);
                for (int colorIndex = 0; colorIndex < objColors.length; colorIndex++) {
                    objColors[colorIndex] *= (specularValue) * lightColors[colorIndex];
                }
                Color specular = new Color(clamp(objColors[0], 0, 1), clamp(objColors[1], 0, 1), clamp(objColors[2], 0, 1));
                pixelColor = addColor(pixelColor, specular);

                if (shadows != null) {
                    pixelColor = Color.BLACK;
                }
            }

            // reflection
            if (reflect.getObject().getMaterial().isReflective() && count < 5) {
                pixelColor = addColor(pixelColor, reflection(scene, reflect, planes, ReflectionRay, count));
            } else {
                if (reflect.getObject().getMaterial().isRefractive()) {
                    pixelColor = addColor(pixelColor, refraction(scene, reflect, planes, ReflectionRay));
                }
                return pixelColor;
            }
        }
        return pixelColor;
    }

    /**
     * @param scene
     * @param closestIntersection
     * @param planes
     * @param startingRay
     * This refraction method first creates a new vector called Incident Vector that goes from the object to the starting point, which at first would be the camera
     * and the second time it runs it would be the object that it is reflecting from, and then using the normals of the object creates and emerging vector with the refraction
     * formula using the index of refraction that the object has, this process repeats itself until the vector intersects an object that does not have refraction,
     * it is a recursive method that repeats the process of the raytrace method and returns a new color which will be added to the pixel creating  reflection,
     * it also checks if the object that needs to refract is a reflectibe object to refract whatever the object was reflecting.
     * @return
     */
    public static Color refraction(Scene scene, Intersection closestIntersection, float[] planes, Ray startingRay) {
        Vector3D IncidentVector = Vector3D.normalize(Vector3D.substract(closestIntersection.getPosition(), startingRay.getOrigin()));
        Double c1 = Vector3D.dotProduct(closestIntersection.getNormal(), IncidentVector);
        Double refractionIndex = 1 / closestIntersection.getObject().getMaterial().getIndexOfRefraction();
        Double c2 = Math.sqrt(1 - Math.pow(refractionIndex, 2) * (1 - Math.pow(c1, 2)));

        Vector3D refractionVector = Vector3D.add(Vector3D.scalarMultiplication(IncidentVector, refractionIndex), Vector3D.scalarMultiplication(closestIntersection.getNormal(), (refractionIndex * c1) - c2));

        Ray refractedRay = new Ray(closestIntersection.getPosition(), refractionVector);

        ArrayList<Object3D> objects = scene.getObjects();

        Intersection refracted = raycast(refractedRay, objects, closestIntersection.getObject(), planes);

        Color pixelColor = Color.BLACK;
        if (refracted != null) {
            for (Light light : scene.getLights()) {
                // shadows
                Ray shadowsRay = new Ray(refracted.getPosition(), Vector3D.normalize(Vector3D.substract(light.getPosition(), refracted.getPosition())));
                if (light instanceof DirectionalLight) {
                    shadowsRay = new Ray(refracted.getPosition(), Vector3D.normalize(Vector3D.scalarMultiplication(((DirectionalLight) light).getDirection(), -1)));
                }
                Intersection shadows = raycast(shadowsRay, objects, refracted.getObject(), planes);

                Color lightColor = light.getColor();
                Color objColor = refracted.getObject().getColor();
                float[] lightColors = new float[]{lightColor.getRed() / 255.0f, lightColor.getGreen() / 255.0f, lightColor.getBlue() / 255.0f};
                float[] objColors = new float[]{objColor.getRed() / 255.0f, objColor.getGreen() / 255.0f, objColor.getBlue() / 255.0f};

                // light Falloff
                float nDotL = light.getNDotL(refracted);
                float intensity = (float) light.getIntensity() * nDotL;
                intensity = (float) (intensity / Math.pow(Vector3D.magnitude(Vector3D.substract(refracted.getPosition(), light.getPosition())), 1));
                for (int colorIndex = 0; colorIndex < objColors.length; colorIndex++) {
                    objColors[colorIndex] *= (intensity) * lightColors[colorIndex];
                }

                // diffuse
                Color diffuse = new Color(clamp(objColors[0], 0, 1), clamp(objColors[1], 0, 1), clamp(objColors[2], 0, 1));
                pixelColor = addColor(pixelColor, diffuse);

                // ambient
                lightColors = new float[]{lightColor.getRed() / 255.0f, lightColor.getGreen() / 255.0f, lightColor.getBlue() / 255.0f};
                objColors = new float[]{objColor.getRed() / 255.0f, objColor.getGreen() / 255.0f, objColor.getBlue() / 255.0f};
                double ambientValue = refracted.getObject().getMaterial().getAmbientValue();
                for (int colorIndex = 0; colorIndex < objColors.length; colorIndex++) {
                    objColors[colorIndex] *= (ambientValue) * lightColors[colorIndex];
                }
                Color ambient = new Color(clamp(objColors[0], 0, 1), clamp(objColors[1], 0, 1), clamp(objColors[2], 0, 1));
                pixelColor = addColor(pixelColor, ambient);

                // specular
                lightColors = new float[]{lightColor.getRed() / 255.0f, lightColor.getGreen() / 255.0f, lightColor.getBlue() / 255.0f};
                objColors = new float[]{objColor.getRed() / 255.0f, objColor.getGreen() / 255.0f, objColor.getBlue() / 255.0f};
                Vector3D H = Vector3D.scalarMultiplication(Vector3D.add(light.getPosition(), scene.getCamera().getPosition()), 1 / Vector3D.magnitude(Vector3D.add(light.getPosition(), scene.getCamera().getPosition())));
                double shininess = refracted.getObject().getMaterial().getShininess();
                double specularValue = Math.pow(Vector3D.dotProduct(refracted.getNormal(), H), shininess);
                for (int colorIndex = 0; colorIndex < objColors.length; colorIndex++) {
                    objColors[colorIndex] *= (specularValue) * lightColors[colorIndex];
                }
                Color specular = new Color(clamp(objColors[0], 0, 1), clamp(objColors[1], 0, 1), clamp(objColors[2], 0, 1));
                pixelColor = addColor(pixelColor, specular);

                if (shadows != null) {
                    pixelColor = Color.BLACK;
                }


            }
            // refraction
            if (refracted.getObject().getMaterial().isReflective()) {
                pixelColor = addColor(pixelColor, reflection(scene, refracted, planes, refractedRay, 0));
            }
            if (refracted.getObject().getMaterial().isRefractive()) {
                pixelColor = addColor(pixelColor, refraction(scene, refracted, planes, refractedRay));
            } else {
                return pixelColor;
            }

        }
        return pixelColor;
    }

   public static float clamp(float value, float min, float max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    public static Color addColor(Color original, Color otherColor){
        float red = clamp((original.getRed() / 255.0f) + (otherColor.getRed() / 255.0f), 0, 1);
        float green = clamp((original.getGreen() / 255.0f) + (otherColor.getGreen() / 255.0f), 0, 1);
        float blue = clamp((original.getBlue() / 255.0f) + (otherColor.getBlue() / 255.0f), 0, 1);
        return new Color(red, green, blue);
    }

    /**
     * @param ray
     * @param objects
     * @param caster
     * @param clippingPlanes
     * Method that trows a ray from a specified caster and checks if it intersects with one of the objects of the scene and returns that intersection
     * @return
     */
    public static Intersection raycast(Ray ray, ArrayList<Object3D> objects, Object3D caster, float[] clippingPlanes) {
        Intersection closestIntersection = null;

        for (int k = 0; k < objects.size(); k++) {
            Object3D currentObj = objects.get(k);
            if (caster == null || !currentObj.equals(caster)) {
                Intersection intersection = currentObj.getIntersection(ray);
                if (intersection != null) {
                    double distance = intersection.getDistance();
                    if (distance >= 0 &&
                            (closestIntersection == null || distance < closestIntersection.getDistance()) &&
                            (clippingPlanes == null || (intersection.getPosition().getZ() >= clippingPlanes[0] &&
                                    intersection.getPosition().getZ() <= clippingPlanes[1]))) {
                        closestIntersection = intersection;
                    }
                }
            }
        }

        return closestIntersection;
    }
}
