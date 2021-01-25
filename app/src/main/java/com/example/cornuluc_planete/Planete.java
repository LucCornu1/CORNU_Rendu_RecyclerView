package com.example.cornuluc_planete;

public class Planete {
    private String planeteName;
    private String planeteDescription;


    // Constructor
    public Planete(String planeteName, String planeteDescription) {
        this.planeteName = planeteName;
        this.planeteDescription = planeteDescription;
    }

    public Planete() {
        planeteName = null;
        planeteDescription = null;
    }


    // Getters (Assesseurs)
    public String getPlaneteName() {
        return planeteName;
    }

    public String getplaneteDescription() {
        return planeteDescription;
    }


    // Setters (Mutateurs)
    public void setVersionName(String planeteName) {
        this.planeteName = planeteName;
    }

    public void setVersionNumber(String planeteDescription) {
        this.planeteDescription = planeteDescription;
    }
}
