public class Ars {
    public static int sequentialSearch(Person[] a, Person key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(key)) {
                return i;
            }
        }
        return 0;
    }

    public static void sort(Person[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i].compare(a[j]) == -1) {
                    Person temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}