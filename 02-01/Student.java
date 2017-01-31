public class Student {

    public String firstName;
    public String lastName;
    public int id;
    public int age;

    public Student (String firstName, String lastName, int id, int age) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.id        = id;
        this.age       = age;
    }

    /**
     * get value of student's last name. 
     *
     * @return String containing student last name.
     */
    public String getLastName () {
	return this.lastName;
    }

    /**
     * sets Last name of student.
     *
     * @param string that contains last name.
     */
    private void setLastName (String lastName) {
	this.lastName = lastName;
    }
}
