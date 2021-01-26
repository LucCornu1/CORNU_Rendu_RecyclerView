package com.example.cornuluc_planete;

public class Planete {
    private String planeteName;
    private String planeteDescription;
    private int planeteId;


    // Constructor
    public Planete(String planeteName, String planeteDescription, int planeteId) {
        this.planeteName = planeteName;
        this.planeteDescription = planeteDescription;
        this.planeteId = planeteId;
    }

    public Planete() {
        planeteName = null;
        planeteDescription = null;
        planeteId = 0;
    }


    // Getters (Assesseurs)
    public String getPlaneteName() {
        return planeteName;
    }

    public String getplaneteDescription() {
        return planeteDescription;
    }

    public int getplaneteId() {
        return planeteId;
    }


    // Setters (Mutateurs)
    public void setPlaneteName(String planeteName) {
        this.planeteName = planeteName;
    }

    public void setPlaneteDescription(String planeteDescription) {
        this.planeteDescription = planeteDescription;
    }

    public void setplaneteId(int planeteId) {
        this.planeteId = planeteId;
    }
}
