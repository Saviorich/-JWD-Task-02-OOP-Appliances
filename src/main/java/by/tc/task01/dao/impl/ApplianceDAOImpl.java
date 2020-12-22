package by.tc.task01.dao.impl;

import by.tc.task01.dao.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.ApplianceType;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.filter.ApplianceFilter;
import by.tc.task01.parser.ApplianceDataParser;
import by.tc.task01.parser.impl.FileApplianceDataParser;
import by.tc.task01.reader.ApplianceReader;
import by.tc.task01.reader.impl.FileApplianceReader;
import by.tc.task01.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> appliances = new ArrayList<>();
        ApplianceFactory factory = new ApplianceFactory();

        ApplianceReader reader = FileApplianceReader.getInstance();
       	List<String> applianceData = reader.takeAll();

       	ApplianceFilter applianceFilter = new ApplianceFilter(criteria, applianceData);
       	List<String> filteredAppliance = applianceFilter.filter();

        ApplianceDataParser dataParser = new FileApplianceDataParser();
       	for (String data : filteredAppliance) {
       	    boolean isFit = true;
       	    Map<String, Object> parameters = dataParser.parseIntoParameterValue(data);
            for (Map.Entry<String, Object> parameter : parameters.entrySet()) {
                for (Map.Entry<String, Object> criteriaEntry : criteria.getCriteria().entrySet()) {
                    if (parameter.getKey().equals(criteriaEntry.getKey())
                            && !parameter.getValue().toString().equals(criteriaEntry.getValue().toString())) {
                        isFit = false;
                    }
                }
            }
            if (isFit) {
                appliances.add(factory.getAppliance(ApplianceType.valueOf(
                        (String) criteria.getGroupSearchName().toUpperCase()),
                        parameters));
            }
        }

       	return appliances;
    }
}
