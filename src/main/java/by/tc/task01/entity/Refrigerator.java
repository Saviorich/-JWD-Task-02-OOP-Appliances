package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Refrigerator extends Appliance{
    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private int overallCapacity;
    private int height;
    private int width;

    public Refrigerator() {}

    public Refrigerator (int powerConsumption, int weight, int freezerCapacity, int overallCapacity, int height, int width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public int getWidth() {return width;}

    public void setWidth(int width) {this.width = width;}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Refrigerator setParameters(Map<String, Object> arguments) {
        for (Map.Entry<String, Object> entry : arguments.entrySet()) {
            switch (entry.getKey())  {
                case "WEIGHT":
                    setWeight(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "POWER_CONSUMPTION":
                    setPowerConsumption(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "FREEZER_CAPACITY":
                    setFreezerCapacity(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "OVERALL_CAPACITY":
                    setOverallCapacity(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "HEIGHT":
                    setHeight(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "WIDTH":
                    setWidth(Integer.parseInt(entry.getValue().toString()));
                    break;
            }
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refrigerator that = (Refrigerator) o;

        if (powerConsumption != that.powerConsumption) return false;
        if (weight != that.weight) return false;
        if (freezerCapacity != that.freezerCapacity) return false;
        if (overallCapacity != that.overallCapacity) return false;
        if (height != that.height) return false;
        return width == that.width;
    }

    @Override
    public int hashCode() {
        int result = powerConsumption;
        result = 31 * result + weight;
        result = 31 * result + freezerCapacity;
        result = 31 * result + overallCapacity;
        result = 31 * result + height;
        result = 31 * result + width;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Refrigerator{");
        sb.append("powerConsumption=").append(powerConsumption);
        sb.append(", weight=").append(weight);
        sb.append(", freezerCapacity=").append(freezerCapacity);
        sb.append(", overallCapacity=").append(overallCapacity);
        sb.append(", height=").append(height);
        sb.append(", width=").append(width);
        sb.append('}');
        return sb.toString();
    }
}
