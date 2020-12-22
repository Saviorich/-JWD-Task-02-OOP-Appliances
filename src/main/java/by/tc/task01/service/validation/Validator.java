package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Arrays;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		if (criteria.getGroupSearchName() == null || criteria.getCriteria() == null) {
			return false;
		}
		return true;
	}

	public static boolean fileDataParserValidator(String toParse) {
		if (toParse == null) {
			return false;
		}

		if (toParse.split(" : ").length == 1) {
			return false;
		}

		try {
			String[] split1 = toParse.split(" : ");
			String[] split2 = split1[1].split(", ");
			String[] split3 = split2[0].split("=");
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

	}
}

//you may add your own new classes