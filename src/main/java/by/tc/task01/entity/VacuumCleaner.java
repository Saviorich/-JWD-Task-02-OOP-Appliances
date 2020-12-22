package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

public class VacuumCleaner extends Appliance {
    private int powerConsumption;
    private char filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(
            int powerConsumption,
            char filterType,
            String bagType,
            String wandType,
            int motorSpeedRegulation,
            int cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public char getFilterType() {
        return filterType;
    }

    public void setFilterType(char filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner setParameters(Map<String, Object> arguments) {
        for (Map.Entry<String, Object> entry : arguments.entrySet()) {
            switch (entry.getKey()) {
                case "BAG_TYPE":
                    setBagType((String) entry.getValue());
                    break;
                case "WAND_TYPE":
                    setWandType((String) entry.getValue());
                    break;
                case "MOTOR_SPEED_REGULATION":
                    setMotorSpeedRegulation(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "CLEANING_WIDTH":
                    setCleaningWidth(Integer.parseInt(entry.getValue().toString()));
                    break;
                case "FILTER_TYPE":
                    setFilterType(entry.getValue().toString().charAt(0));
                    break;
                case "POWER_CONSUMPTION":
                    setPowerConsumption(Integer.parseInt(entry.getValue().toString()));
                    break;
            }
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (powerConsumption != that.powerConsumption) return false;
        if (filterType != that.filterType) return false;
        if (motorSpeedRegulation != that.motorSpeedRegulation) return false;
        if (cleaningWidth != that.cleaningWidth) return false;
        if (!bagType.equals(that.bagType)) return false;
        return wandType.equals(that.wandType);
    }

    @Override
    public int hashCode() {
        int result = powerConsumption;
        result = 31 * result + (int) filterType;
        result = 31 * result + bagType.hashCode();
        result = 31 * result + wandType.hashCode();
        result = 31 * result + motorSpeedRegulation;
        result = 31 * result + cleaningWidth;
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VacuumCleaner{");
        sb.append("powerConsumption=").append(powerConsumption);
        sb.append(", filterType=").append(filterType);
        sb.append(", bagType='").append(bagType).append('\'');
        sb.append(", wandType='").append(wandType).append('\'');
        sb.append(", motorSpeedRegulation=").append(motorSpeedRegulation);
        sb.append(", cleaningWidth=").append(cleaningWidth);
        sb.append('}');
        return sb.toString();
    }
}
