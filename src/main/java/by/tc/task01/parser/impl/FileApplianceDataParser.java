package by.tc.task01.parser.impl;

import by.tc.task01.parser.ApplianceDataParser;
import by.tc.task01.service.validation.Validator;

import java.util.HashMap;
import java.util.Map;

public class FileApplianceDataParser implements ApplianceDataParser {
    private String separator = " : ";

    public FileApplianceDataParser() {}

    public FileApplianceDataParser(String separator) {
        this.separator = separator;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    @Override
    public Map<String, Object> parseIntoParameterValue(String toParse) {
        Map<String, Object> data = new HashMap<>();
        if (Validator.fileDataParserValidator(toParse)) {
            if (toParse == null || toParse.length() == 0) {
                return null;
            }



            String parameters = toParse.split(separator)[1];
            String[] parametersData = parameters.split(", ");
            for (String parameter : parametersData) {
                String[] splittedParameter = parameter.split("=");
                data.put(splittedParameter[0], splittedParameter[1]);
            }
            return data;
        }
        return data;
    }

    public Map<String, Object> parseIntoNameParameters(String toParse) {
        Map<String, Object> parsedMap = new HashMap<>();
        if (Validator.fileDataParserValidator(toParse)) {
            String[] parsed = toParse.split(separator);
            parsedMap.put("name", parsed[0]);
            parsedMap.put("parameters", parseIntoParameterValue(toParse));
            return parsedMap;
        }
        return parsedMap;
    }

    public String parseName(String toParse) {
        if (!Validator.fileDataParserValidator(toParse)){
            return null;
        }
        return toParse.split(separator)[0];
    }
}
