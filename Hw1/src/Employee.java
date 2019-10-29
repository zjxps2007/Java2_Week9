public class Employee extends Person{
    protected double grossPay;

    public Employee() {

    }

    public Employee(String name, double grossPay) {
        this.name =name;
        this.grossPay = grossPay;
    }

    public int compare(Person p) {
        if(p instanceof Employee) {
            if(this.grossPay > ((Employee) p).grossPay){
                return 1;
            }
            else if(this.grossPay < ((Employee) p).grossPay) {
                return -1;
            }
            else {
                return 0;
            }
        }
        else {
            return 0;
        }
    }

    public boolean equals(Person p) {
        if(this.grossPay == ((Employee) p).grossPay){
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return (name+"\t$"+grossPay);
    }
}
