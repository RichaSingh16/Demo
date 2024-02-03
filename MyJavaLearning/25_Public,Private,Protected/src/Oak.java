public class Oak extends Plant {
	public Oak() {
		// won't work--type is private
		//type="tree";
		//This work--size is protected ----oak is subclass is plant.
		this.size="large";
	}

}
