package Task7;

public class Person {

    /**
     * Attributes of the Person class
     */
    int personID;
    String type;
    String name;
    String telNum;
    String email;
    String physicalAddress;

    /**
     * Methods
     * Constructor for the Person class
     * @param personID, ID num so we can identify people with same names
     * @param type, Type of person (Architect, Contractor or Client)
     * @param name, Name of the person
     * @param telNum, Telephone number of the person
     * @param email, Email address of the person
     * @param physicalAddress, Physical address of the person
     */
    public Person( int personID, String type, String name, String telNum, String email, String physicalAddress){
        this.personID = personID;
        this.type = type;
        this.name = name;
        this.telNum = telNum;
        this.email = email;
        this.physicalAddress = physicalAddress;
    }

    public Person(){
        this.personID = getPersonID();
        this.type = getType();
        this.name = getName();
        this.telNum = getTelNum();
        this.email = getEmail();
        this.physicalAddress = getPhysicalAddress();
    }

    /**
     * Set methods of the Person class
     * @param type, Set type of person
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param personID, Set ID number of the person
     */
    public void setPersonID(int personID) {
        this.personID = personID;
    }

    /**
     * @param name, Set name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param telNum, Set telephone number of the person
     */
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    /**
     * @param email, Set email address of the person
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param physicalAddress, Set physical address of the person
     */
    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    /**
     * Get methods of the Person class
     * @return, returns type of person
     */
    public String getType() {
        return type;
    }

    /**
     * @return, returns ID number of the person
     */
    public int getPersonID() {
        return personID;
    }

    /**
     * @return, returns name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * @return, returns telephone number of the person
     */
    public String getTelNum() {
        return telNum;
    }

    /**
     * @return, returns email address of the person
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return, returns physical address of the person
     */
    public String getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * toString method for the Person class to return output in a certain format when method is called
     * @return, returns output
     */
    public String toString() {
        String output = "ID: " + personID;
        output += "\nType: " + type;
        output += "\nName: " + name;
        output += "\nTelephone Number: " + telNum;
        output += "\nEmail address: " + email;
        output += "\nPhysical address: " + physicalAddress + "\n";

        return output;
    }
}
