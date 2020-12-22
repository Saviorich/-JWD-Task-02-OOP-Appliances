package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

public class TabletPC extends Appliance{
    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(int batteryCapacity, int displayInches, int memoryRom, int flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TabletPC setParameters(Map<String, Object> arguments) {
        for (Map.Entry<String, Object> entry : arguments.entrySet()) {
            switch (entry.getKey()) {
                case "BATTERY_CAPACITY":
                    setBatteryCapacity(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "DISPLAY_INCHES":
                    setDisplayInches(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "MEMORY_ROM":
                    setMemoryRom(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "FLASH_MEMORY_CAPACITY":
                    setFlashMemoryCapacity(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "COLOR":
                    setColor(entry.getValue().toString());
            }
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (batteryCapacity != tabletPC.batteryCapacity) return false;
        if (displayInches != tabletPC.displayInches) return false;
        if (memoryRom != tabletPC.memoryRom) return false;
        if (flashMemoryCapacity != tabletPC.flashMemoryCapacity) return false;
        return color.equals(tabletPC.color);
    }

    @Override
    public int hashCode() {
        int result = batteryCapacity;
        result = 31 * result + displayInches;
        result = 31 * result + memoryRom;
        result = 31 * result + flashMemoryCapacity;
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TabletPC{");
        sb.append("batteryCapacity=").append(batteryCapacity);
        sb.append(", displayInches=").append(displayInches);
        sb.append(", memoryRom=").append(memoryRom);
        sb.append(", flashMemoryCapacity=").append(flashMemoryCapacity);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
