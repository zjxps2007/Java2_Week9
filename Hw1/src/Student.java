public class Student extends Person{
    protected double gpa;

    public Student() {

    }
    //생성자
    public Student(String name, double gpa) {
        this.gpa = gpa;
        this.name = name;
    }

    public int compare(Person p) {
        //gpa 비교
        if(p instanceof Student) {
            //gpa가 Student gpa 보다 크면 1반환
            if (this.gpa > ((Student) p).gpa) {
                return 1;
            }
            //gpa가 Student gpa 보다 작으면 -1 반환
            else if (this.gpa < ((Student) p).gpa) {
                return -1;
            }
            //같을 경우 0 반환
            else  {
                return 0;
            }
        }
        else {
            return 0;
        }
    }
    public boolean equals(Person p) {
        //gpa가 Student gpa랑 같으면 true 반환
        if(this.gpa == ((Student) p).gpa) {
            return true;
        }
        //gpa가 Student gpa랑 다르면 false 반환
        else {
            return false;
        }
    }
    //문자열로 변환
    public String toString() {
        return (name+"  \tGPA: "+gpa);
    }
}
