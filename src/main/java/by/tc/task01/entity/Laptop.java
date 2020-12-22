package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Laptop extends Appliance{
    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInches;

    public Laptop() {}

    public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public Laptop setParameters(Map<String, Object> arguments) {
        for (Map.Entry<String, Object> entry : arguments.entrySet()) {
            switch (entry.getKey()) {
                case "BATTERY_CAPACITY":
                    setBatteryCapacity(Double.parseDouble(entry.getValue().toString()));
                    break;
                case "OS":
                    setOs(entry.getValue().toString());
                    break;
                case "MEMORY_ROM":
                    setMemoryRom(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "SYSTEM_MEMORY":
                    setSystemMemory(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "CPU":
                    setCpu(Double.parseDouble(entry.getValue().toString()));
                    break;
                case "DISPLAY_INCHES":
                    setDisplayInches(Integer.parseInt(entry.getValue().toString()));
                    break;
            }
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (Double.compare(laptop.batteryCapacity, batteryCapacity) != 0) return false;
        if (memoryRom != laptop.memoryRom) return false;
        if (systemMemory != laptop.systemMemory) return false;
        if (Double.compare(laptop.cpu, cpu) != 0) return false;
        if (displayInches != laptop.displayInches) return false;
        return os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(batteryCapacity);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + os.hashCode();
        result = 31 * result + memoryRom;
        result = 31 * result + systemMemory;
        temp = Double.doubleToLongBits(cpu);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + displayInches;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Laptop{");
        sb.append("batteryCapacity=").append(batteryCapacity);
        sb.append(", os='").append(os).append('\'');
        sb.append(", memoryRom=").append(memoryRom);
        sb.append(", systemMemory=").append(systemMemory);
        sb.append(", cpu=").append(cpu);
        sb.append(", displayInches=").append(displayInches);
        sb.append('}');
        return sb.toString();
    }
}
