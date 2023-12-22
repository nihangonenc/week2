public class Teacher {
    String name;
    String phone;
    String branch;

    Teacher(String name, String phone, String branch){
        this.name = name;
        this.phone = phone;
        this.branch = branch;
    }
    void print() {
        System.out.println("Adı: " + this.name);
        System.out.println("Bölümü: " + this.branch);
        System.out.println("Telefonu: " + this.phone);
    }

}

