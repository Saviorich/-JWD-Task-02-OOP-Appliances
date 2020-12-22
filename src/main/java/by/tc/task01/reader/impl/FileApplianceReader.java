package by.tc.task01.reader.impl;

import by.tc.task01.reader.ApplianceReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileApplianceReader implements ApplianceReader {
    private static final FileApplianceReader applianceReader = new FileApplianceReader();

    private FileApplianceReader() {}

    public static FileApplianceReader getInstance() {
        return applianceReader;
    }

    @Override
    public List<String> takeAll() {
        File file = new File("D:\\java_projects\\jwd-task01-template_v2\\src\\main\\resources\\appliances_db.txt");
        List<String> items = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.length() != 0) {
                    items.add(line);
                }
            }
        } catch (IOException e){
            items = null;
        }
        return items;
    }

    @Override
    public List<String> take(String type) {
        File file = new File("D:\\java_projects\\jwd-task01-template_v2\\src\\main\\resources\\appliances_db.txt");
        List<String> items = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String applianceType = line.split(" : ")[0];
                if (applianceType.equals(type)) {
                    items.add(line);
                }
            }
        } catch (IOException e) {
            items = null;
        }
        return items;
    }
}
