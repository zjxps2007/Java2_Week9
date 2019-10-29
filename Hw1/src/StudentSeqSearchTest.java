public class StudentSeqSearchTest {
    public static void main(String[] args) {
        Student[] s= new Student[10];

        s[0] = new Student("Kim",2.3);
        s[1] = new Student("Lee",3.0);
        s[2] = new Student("Park",1.3);
        s[3] = new Student("Choi",4.0);
        s[4] = new Student("Jung",3.1);
        s[5] = new Student("Seok",4.4);
        s[6] = new Student("Yoon",3.7);
        s[7] = new Student("Cho",3.9);
        s[8] = new Student("Ryu",3.2);
        s[9] = new Student("Ji",2.7);

        int ind = Ars.sequentialSearch(s, new Student("",3.9));

        if(ind > 0){
            System.out.println(s[ind]);
        }
        else {
            System.out.println("Not Found");
        }

        System.out.println();
        Ars.sort(s);

        for(int i = 0; i< s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
