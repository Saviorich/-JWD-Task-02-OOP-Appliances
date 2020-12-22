package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliances;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(Oven.DEPTH.toString(), 60);
		criteriaOven.add(Oven.CAPACITY.toString(), 33);
		criteriaOven.add(Oven.POWER_CONSUMPTION.toString(), 1500);

		appliances = service.find(criteriaOven);

		for (Appliance appliance : appliances) {
			PrintApplianceInfo.print(appliance);
		}

		Criteria criteria = new Criteria(TabletPC.class.getSimpleName());
		criteria.add("MEMORY_ROM", 8000);

		appliances = service.find(criteria);

		for (Appliance a :	appliances) {
			System.out.println(a);
		}

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 200);
		criteriaOven.add(Oven.DEPTH.toString(), 300);

		appliances = service.find(criteriaOven);

		for (Appliance appliance : appliances) {
			PrintApplianceInfo.print(appliance);
		}

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria("Tablet_PC");
		criteriaTabletPC.add("BATTERY_CAPACITY", 3);

		appliances = service.find(criteriaTabletPC);// find(Object...obj)

		for (Appliance appliance : appliances) {
			PrintApplianceInfo.print(appliance);
		}

	}

}
