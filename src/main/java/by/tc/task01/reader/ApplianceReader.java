package by.tc.task01.reader;

import java.util.List;

public interface ApplianceReader {
    List<String> takeAll();

    List<String> take(String type);
}
