public class Member {
    int Id;
    String name;
    String surname;

    public Member(int Id, String name, String surname) {
        this.Id = Id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

}