package task5_Hometask_Builder_pattern;

import task5_Hometask_Builder_pattern.Bicycle;

public class BuilderPattern {

	public static void main(String[] args) {

		Bicycle.Builder builder = new Bicycle.Builder("Sports Bicycle", 8);
		builder.gears(true);
		builder.doubleStand(false);
		builder.carrier(true);

		Bicycle bicycle = builder.build();

		System.out.println("Built Bicycle:");
		System.out.println("Type: " + bicycle.getType());
		System.out.println("Size: " + bicycle.getSize());
		System.out.println("Gears: " + (bicycle.hasGears() ? "Yes" : "No"));
		System.out.println("Double Stand: " + (bicycle.hasDoubleStand() ? "Yes" : "No"));
		System.out.println("Double Seat: " + (bicycle.hasDoubleSeat() ? "Yes" : "No"));
		System.out.println("Carrier: " + (bicycle.hasCarrier() ? "Yes" : "No"));

		try {
			System.out.println("\nTrying to update the already built Bicycle:");
			builder.gears(false);
			System.out.println("Type: " + bicycle.getType());
			System.out.println("Size: " + bicycle.getSize());
			System.out.println("Gears: " + (bicycle.hasGears() ? "Yes" : "No"));
		} catch (IllegalStateException e) {
			System.out.println("IllegalStateException caught: " + e.getMessage());
		}

	}

}
