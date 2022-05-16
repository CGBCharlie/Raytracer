/**
 * [1968] - [2021] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */

/**
 * @author Carlos García
 */

/**
 * This class receives all the parameters an object needs to get the fully desired color and effect
 * when an object is created it will need for the material to be established, it receives an ambient value,
 * shininess, if it is reflective, the index of refraction, and if it is refractive.
 */

package edu.up.isgc.raytracer.objects;

public class Material {
    private double ambientValue;
    private double shininess;
    private boolean reflective;
    private double indexOfRefraction;
    private boolean refractive;

    public double getAmbientValue() {
        return ambientValue;
    }

    public void setAmbientValue(double ambientValue) {
        this.ambientValue = ambientValue;
    }

    public double getShininess() {
        return shininess;
    }

    public void setShininess(double shininess) {
        this.shininess = shininess;
    }

    public boolean isReflective() {
        return reflective;
    }

    public void setReflective(boolean reflective) {
        this.reflective = reflective;
    }

    public Material(double ambientValue, double shininess, boolean reflective, double indexOfRefraction, boolean refractive) {
        setShininess(shininess);
        setAmbientValue(ambientValue);
        setReflective(reflective);
        setIndexOfRefraction(indexOfRefraction);
        setRefractive(refractive);
    }

    public double getIndexOfRefraction() {
        return indexOfRefraction;
    }

    public void setIndexOfRefraction(double indexOfRefraction) {
        this.indexOfRefraction = indexOfRefraction;
    }

    public boolean isRefractive() {
        return refractive;
    }

    public void setRefractive(boolean refractive) {
        this.refractive = refractive;
    }
}
