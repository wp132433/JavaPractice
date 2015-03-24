package org.dimigo.basic;

public class FeeCalc {
	public static void main(String[] args) {
		CarType car_type = CarType.HIGHWAY_BUS;
		int distance = 10;
		int fee;
		
		System.out.println("<< 고속버스 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car_type);
		
		switch (car_type) {
		case HIGHWAY_BUS:
			fee = 850 + (distance / 10 - 1) * 300;
			break;
			
		case CAR:
			fee = 300 + (distance / 10 - 1) * 200;
			break;

		default:
			fee = 600 + (distance / 10 - 1) * 200;
			break;
		}
		
		System.out.println("통행료 : " + fee + "원");
	}
}

enum CarType {
	HIGHWAY_BUS,
	CAR,
	DEFAULT;
	
	public String toString() {
		switch (this) {
		case HIGHWAY_BUS:
			return "고속버스";
			
		case CAR:
			return "경차";

		default:
			return "그 외";
		}
	}
}
