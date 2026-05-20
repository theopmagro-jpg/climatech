package com.example.climatech.models;

public class weathercurrent {
    @SerializedName("temperature")
    @Expose
    private double temperatura;

    @SerializedName("relativeHumidity")
    @Expose
    private int relativeHumidity;
    private double windSpeed;

    public double getTemperatura() {

        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(int relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
}
