package task5_Hometask_Builder_pattern;

public class Bicycle {
	private final String type;
	private final int size;
	private final boolean gears;
	private final boolean doubleStand;
	private final boolean doubleSeat;
	private final boolean carrier;

	private Bicycle(Builder builder) {
		this.type = builder.type;
		this.size = builder.size;
		this.gears = builder.gears;
		this.doubleStand = builder.doubleStand;
		this.doubleSeat = builder.doubleSeat;
		this.carrier = builder.carrier;
	}

	public String getType() {
		return type;
	}

	public int getSize() {
		return size;
	}

	public boolean hasGears() {
		return gears;
	}

	public boolean hasDoubleStand() {
		return doubleStand;
	}

	public boolean hasDoubleSeat() {
		return doubleSeat;
	}

	public boolean hasCarrier() {
		return carrier;
	}

	public static class Builder {
		private final String type;
		private final int size;
		private boolean gears;
		private boolean doubleStand;
		private boolean doubleSeat;
		private boolean carrier;
		private boolean built;

		public Builder(String type, int size) {
			this.type = type;
			this.size = size;
		}

		public Builder gears(boolean gears) {
			if (!built) {
				this.gears = gears;
			} else {
				throw new IllegalStateException("Once built, choices cannot be changed.");
			}
			return this;
		}

		public Builder doubleStand(boolean doubleStand) {
			if (!built) {
				this.doubleStand = doubleStand;
			} else {
				throw new IllegalStateException("Once built, choices cannot be changed.");
			}
			return this;
		}

		public Builder doubleSeat(boolean doubleSeat) {
			if (!built) {
				this.doubleSeat = doubleSeat;
			} else {
				throw new IllegalStateException("Once built, choices cannot be changed.");
			}
			return this;
		}

		public Builder carrier(boolean carrier) {
			if (!built) {
				this.carrier = carrier;
			} else {
				throw new IllegalStateException("Once built, choices cannot be changed.");
			}
			return this;
		}

		public Bicycle build() {
			if (built) {
				throw new IllegalStateException("Each builder instance can build only one Bicycle.");
			}
			built = true;
			return new Bicycle(this);
		}
	}
}
