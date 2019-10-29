public class Ars {
    public static int sequentialSearch(Person[] a, Person key) {
        //배열을 비교
        for (int i = 0; i < a.length; i++) {
            //넘어온 값을 배열과 비교
            if (a[i].equals(key)) {
                //값이 같을경우
                return i;
            }
        }
        //값이 없을 경우
        return -1;
    }

    public static void sort(Person[] a) {
        //정렬
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                //판별 했던 compare의 리턴값의 -1일경우
                if (a[i].compare(a[j]) == -1) {
                    //교환
                    Person temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}