package service;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

	public static String temperatureService(String temp) {
		Integer kelvin=Integer.parseInt(temp);
		kelvin=(kelvin+273);
		return kelvin.toString();
	}
}
