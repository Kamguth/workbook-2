package com.pluralsight;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;


public Vehicle() {
    this.vehicleId = 0;
    this.makeModel = "";
    this.color = "";
    this.odometerReading = 0;
    this.price = 0.0f;

}
public long getVehicleId() {
    return this.vehicleId;
}
public void setVehicleId(long vehicleId) {
    this.vehicleId = vehicleId;
}
public String getMakeModel() {
    return this.makeModel;
}
public void setMakeModel(String makeModel) {
    this.makeModel = makeModel;
}
public String getColor() {
    return this.color;
}
public void setColor(String color) {
    this.color = color;
}
public int getOdometerReading() {
    return this.odometerReading;
}
public void setOdometerReading() {
    this.odometerReading = odometerReading;
}
public float getPrice() {
    return this.price;
}
public void setPrice() {
    this.price = price;
}
}
