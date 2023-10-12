package com.example.planetsapp;

public class PlanetData {
    private String planetName;
    private String moonCount;
    private int planetImage;

    public PlanetData(String planetName, String moonCount, int planetImage) {
        this.moonCount = moonCount;
        this.planetImage = planetImage;
        this.planetName = planetName;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
