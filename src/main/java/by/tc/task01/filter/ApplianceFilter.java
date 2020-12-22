package by.tc.task01.filter;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.parser.ApplianceDataParser;
import by.tc.task01.parser.impl.FileApplianceDataParser;

import java.util.*;

public class ApplianceFilter {
    private Criteria criteria;
    private List<String> data;

    public ApplianceFilter() {}

    public ApplianceFilter(Criteria criteria, List<String> data) {
        this.criteria = criteria;
        this.data = data;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public List<String> filter() {
        List<String> filteredData = new ArrayList<>();

        ApplianceDataParser dataParser = new FileApplianceDataParser();
        for (String data  : this.data) {
            if (dataParser.parseName(data).equals(criteria.getGroupSearchName())){
                filteredData.add(data);
            }
        }

        return filteredData;
    }
}