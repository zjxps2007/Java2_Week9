public class Student extends Person{
    protected double gpa;

    public Student() {

    }

    public Student(String name, double gpa) {
        this.gpa = gpa;
        this.name = name;
    }

    public int compare(Person p) {
        if(p instanceof Student) {
            if (this.gpa > ((Student) p).gpa) {
                return 1;
            }
            else if (this.gpa < ((Student) p).gpa) {
                return -1;
            }
            else  {
                return 0;
            }
        }
        else {
            return 0;
        }
    }
    public boolean equals(Person p) {
        if(this.gpa == ((Student) p).gpa) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return (name+"  GPA: "+gpa);
    }
}
