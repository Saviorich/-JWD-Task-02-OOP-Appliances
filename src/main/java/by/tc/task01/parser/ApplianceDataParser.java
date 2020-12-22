package by.tc.task01.parser;

import java.util.Map;

public interface ApplianceDataParser {
    Map<String, Object> parseIntoParameterValue(String toParse);

    Map<String, Object> parseIntoNameParameters(String toParse);

    String parseName(String toParse);
}
