public class Employee extends Person{
    protected double grossPay;

    public Employee() {

    }
    //생성자
    public Employee(String name, double grossPay) {
        this.name =name;
        this.grossPay = grossPay;
    }

    public int compare(Person p) {
        if(p instanceof Employee) {
            //grossPay가 Employee grossPay 보다 크면 1반환
            if(this.grossPay > ((Employee) p).grossPay){
                return 1;
            }
            //grossPay가 Employee grossPay 보다 작으면 -1반환
            else if(this.grossPay < ((Employee) p).grossPay) {
                return -1;
            }
            //같을 경우 0을 반환
            else {
                return 0;
            }
        }
        else {
            return 0;
        }
    }

    public boolean equals(Person p) {
        //grossPay가 같으면 true 반환
        if(this.grossPay == ((Employee) p).grossPay){
            return true;
        }
        //grossPay가 다르면 false 반환
        else {
            return false;
        }
    }

    //문자열로 변환 하는 메소드
    public String toString() {
        return (name+"  \t$"+grossPay);
    }
}
