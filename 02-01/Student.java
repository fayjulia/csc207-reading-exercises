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
     * @param student to get last name.
     * @return String containing student last name.
     */
    public String getLastName (Student s) {
	return s.lastName;
    }

    /**
     * sets Last name of student s.
     *
     * @param student to set last name, string that contains last name.
     */
    private void setLastName (Student s, String lastName) {
	s.lastName = lastName;
    }
}
