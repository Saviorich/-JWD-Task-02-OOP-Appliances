package by.tc.task01.service;

import by.tc.task01.entity.*;

import java.util.Map;

public class ApplianceFactory {
    public Appliance getAppliance(ApplianceType type, Map<String, Object> arguments) {
        Appliance appliance = null;
        switch (type) {
            case OVEN:
                appliance = new Oven().setParameters(arguments);
                break;
            case LAPTOP:
                appliance = new Laptop().setParameters(arguments);
                break;
            case SPEAKERS:
                appliance = new Speakers().setParameters(arguments);
                break;
            case TABLET_PC:
            case TABLETPC:
                appliance = new TabletPC().setParameters(arguments);
                break;
            case REFRIGERATOR:
                appliance = new Refrigerator().setParameters(arguments);
                break;
            case VACUUM_CLEANER:
            case VACUUMCLEANER:
                appliance = new VacuumCleaner().setParameters(arguments);
                break;
            default:
                throw new EnumConstantNotPresentException(ApplianceType.class, type.toString());
        }
        return appliance;
    }
}
