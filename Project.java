package Task7;

public class Project {

	/**
	 * Attributes of the Project class
	 */
	int projectNum;
	String projectName;
	String typeOfBuilding;
	double projectCost;
	String deadline;
	double projectFeesPaid;
	double projectFeesToBePaid;


	/**
	 * Methods
	 * Constructor to create a new Project object.
	 * @param projectName, Name of the project
	 * @param projectNum, Number of the project
	 * @param typeOfBuilding, Type of building for the project
	 * @param projectCost, Cost of the project
	 * @param deadline, Deadline for the project
	 */
	public Project(String projectName, int projectNum, String typeOfBuilding, double projectCost, String deadline){
		this.projectName = projectName;
		this.projectNum = projectNum;
		this.typeOfBuilding = typeOfBuilding;
		this.projectCost = projectCost;
		this.projectFeesPaid = 0.00;
		this.projectFeesToBePaid = projectCost - projectFeesPaid;
		this.deadline = deadline;
	}

	/**
	 * Default constructor to create project via System.in inputs
	 */
	public Project(){
		this.projectName = getProjectName();
		this.projectNum = getProjectNum();
		this.typeOfBuilding = getTypeOfBuilding();
		this.projectCost = getProjectCost();
		this.projectFeesPaid = getProjectFeesPaid();
		this.projectFeesToBePaid = getProjectFeesToBePaid();
		this.deadline = getDeadline();
	}


	/**
	 * @param projectFeesPaid, Set the project fees paid
	 */
	public void setProjectFeesPaid(double projectFeesPaid) {
		this.projectFeesPaid = projectFeesPaid;
	}

	/**
	 *
	 * @param projectFeesToBePaid, Set the project fees to be paid
	 */
	public void setProjectFeesToBePaid(double projectFeesToBePaid) {
		this.projectFeesToBePaid = projectFeesToBePaid;
	}

	/**
	 * @param projectNum, Set project number
	 */
	public void setProjectNum(int projectNum) {
		this.projectNum = projectNum;
	}

	/**
	 * @param projectName, Set project name
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @param typeOfBuilding, Set the type of building
	 */
	public void setTypeOfBuilding(String typeOfBuilding) {
		this.typeOfBuilding = typeOfBuilding;
	}

	/**
	 * @param projectCost, Set the cost of the project
	 */
	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}

	/**
	 * @param deadline, Set the deadline of the project
	 */
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	/**
	 * Project get methods
	 * @return project name
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @return project number
	 */
	public int getProjectNum() {
		return projectNum;
	}

	/**
	 * @return building type
	 */
	public String getTypeOfBuilding() {
		return typeOfBuilding;
	}

	/**
	 * @return project cost
	 */
	public double getProjectCost() {
		return projectCost;
	}

	/**
	 * @return project deadline
	 */
	public String getDeadline() {
		return deadline;
	}

	/**
	 * @return project fees paid
	 */
	public double getProjectFeesPaid(){
		return projectFeesPaid;
	}

	/**
	 * @return project fees that still needs to be paid
	 */
	public double getProjectFeesToBePaid(){
		return projectFeesToBePaid;
	}


	/**
	 * toString method to set the output when the program gets executed
	 * @return output
	 */
	public String toString() {
		String output = "Project name: " + projectName;
		output += "\nProject number: " + projectNum;
		output += "\nType of building: " + typeOfBuilding;
		output += "\nProject Cost: R" + projectCost;
		output += "\nDeadline: " + deadline;
		output += "\nFees paid: R" + projectFeesPaid;
		output += "\nFees to be paid: R" + projectFeesToBePaid + "\n";
		
		return output;
	}

}
