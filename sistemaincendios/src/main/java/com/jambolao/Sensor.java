
package com.jambolao;

public class Sensor {
    
    protected float latitude;
    protected float longitude;
    protected String status;
    protected String name;

    public Sensor(float latitude, float longitude, String status, String name) {
        
        this.latitude = latitude;
        this.longitude = longitude;
        this.status = status;
        this.name = name;
    }
    
}
    
