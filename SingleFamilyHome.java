
public class SingleFamilyHome extends Residential {
    private boolean garage;

    
    public SingleFamilyHome() {
        super();
        this.garage = false;
    }
    
    public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup,
            int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
        	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
        	this.garage = garage;
        }
    
    public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	@Override
    public void draw() {
        System.out.println("Drawing code for SingleFamilyHome");
    }
	
	@Override
    public String displayData() {
        return super.displayData() + String.format("\nGarage: %s", garage ? "Yes" : "No");
    }

	@Override
    public String toString() {
        return "SingleFamilyHome{" +
                "garage=" + garage +
                "} " + super.toString();
    }
}