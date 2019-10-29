public abstract class Person {
    protected String name;

    public Person() {
        name = "";
    }
    public Person(String name) {
        this.name = name;
    }
    public abstract int compare(Person p);
    public abstract boolean equals(Person p);
}
