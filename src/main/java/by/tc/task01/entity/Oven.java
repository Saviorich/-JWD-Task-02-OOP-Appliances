package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

public class Oven extends Appliance{
    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Oven() {}

    public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Oven setParameters(Map<String, Object> arguments) {
        for (Map.Entry<String, Object> entry : arguments.entrySet()) {
            switch (entry.getKey()) {
                case "POWER_CONSUMPTION":
                    setPowerConsumption(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "WEIGHT":
                    setWeight(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "WIDTH":
                    setWidth(Double.parseDouble(entry.getValue().toString()));
                    break;
                case "CAPACITY":
                    setCapacity(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "DEPTH":
                    setDepth(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "HEIGHT":
                    setHeight(Double.parseDouble(entry.getValue().toString()));
                    break;
            }
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oven oven = (Oven) o;

        if (powerConsumption != oven.powerConsumption) return false;
        if (weight != oven.weight) return false;
        if (capacity != oven.capacity) return false;
        if (depth != oven.depth) return false;
        if (Double.compare(oven.height, height) != 0) return false;
        return Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = powerConsumption;
        result = 31 * result + weight;
        result = 31 * result + capacity;
        result = 31 * result + depth;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Oven{");
        sb.append("powerConsumption=").append(powerConsumption);
        sb.append(", weight=").append(weight);
        sb.append(", capacity=").append(capacity);
        sb.append(", depth=").append(depth);
        sb.append(", height=").append(height);
        sb.append(", width=").append(width);
        sb.append('}');
        return sb.toString();
    }
}
