package by.tc.task01.dao.impl;

import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplianceDAOImplTest {
    private static final ApplianceDAOImpl dao = new ApplianceDAOImpl();

    @Test
    void find1() {
        Criteria criteria = new Criteria(Oven.class.getSimpleName());
        criteria.add("CAPACITY", 32);

        String expected = "Oven{powerConsumption=1000, weight=10, capacity=32, depth=60, height=45.5, width=59.5}";
        String actual = new ApplianceDAOImpl().find(criteria).get(0).toString();

        assertEquals(expected, actual);
    }

    @Test
    void find2() {
        Criteria criteria = new Criteria(Refrigerator.class.getSimpleName());
        criteria.add("OVERALL_CAPACITY", 300);
        criteria.add("HEIGHT", 180);

        String expected = "Refrigerator{powerConsumption=200, weight=30, freezerCapacity=15, overallCapacity=300, height=180, width=80}";
        String actual = dao.find(criteria).get(0).toString();

        assertEquals(expected, actual);
    }

    @Test
    void find3() {
        Criteria criteria = new Criteria(Laptop.class.getSimpleName());
        criteria.add("MEMORY_ROM", 8000);
        criteria.add("SYSTEM_MEMORY", 1000);

        String expected = new Laptop(1.5, "Linux", 8000, 1000, 2.2, 19)
                .toString();

        String actual = dao.find(criteria).get(0).toString();

        assertEquals(expected, actual);
    }

    @Test
    void find4() {
        Criteria criteria = new Criteria(VacuumCleaner.class.getSimpleName());
        criteria.add("WAND_TYPE", "all-in-one");
        criteria.add("CLEANING_WIDTH", 30);

        String expected = new VacuumCleaner(90, 'C', "XX00", "all-in-one", 2950, 30)
                .toString();

        String actual = dao.find(criteria).get(0).toString();

        assertEquals(expected, actual);
    }

    @Test
    void find5() {
        Criteria criteria = new Criteria(TabletPC.class.getSimpleName());
        criteria.add("DISPLAY_INCHES", "14");
        criteria.add("MEMORY_ROM", 8000);

        String expected = new TabletPC(3, 14, 8000, 2, "blue")
                .toString();

        String actual = dao.find(criteria).get(0).toString();

        assertEquals(expected, actual);
    }

    @Test
    void find6() {
        Criteria criteria = new Criteria(Speakers.class.getSimpleName());
        criteria.add("CORD_LENGTH", 4);
        criteria.add("POWER_CONSUMPTION", 17);
        criteria.add("NUMBER_OF_SPEAKERS", 4);
        criteria.add("FREQUENCY_RANGE", "2-3.5");

        String expected = new Speakers(17, 4, "2-3.5", 4)
                .toString();

        String actual = dao.find(criteria).get(0).toString();

        assertEquals(expected, actual);
    }
}