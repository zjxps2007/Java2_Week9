public class EmployeeSeqSearchTest {
    public static void main(String[] args) {
        Employee[] e = new Employee[10];

        e[0] = new Employee("Kim",300.0);
        e[1] = new Employee("Lee",450.0);
        e[2] = new Employee("Park",200.0);
        e[3] = new Employee("Choi",440.0);
        e[4] = new Employee("Jung",700.0);
        e[5] = new Employee("Seok",250.0);
        e[6] = new Employee("Yoon",100.0);
        e[7] = new Employee("Cho",650.0);
        e[8] = new Employee("Ryu",500.0);
        e[9] = new Employee("Ji",310.0);

        int ind = Ars.sequentialSearch(e, new Employee("",650.0));

        if(ind > 0){
            System.out.println(e[ind]);
        }
        else {
            System.out.println("Not Found");
        }

        System.out.println();
        Ars.sort(e);

        for(int i = 0; i< e.length; i++) {
            System.out.println(e[i]);
        }
    }
}
