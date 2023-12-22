public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut yıldırım", "666", "TRH");
        Teacher t2 = new Teacher("Bekir coşkun", "555", "FZK");
        Teacher t3 = new Teacher("Fatma kale","333","BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t3);


        Student s1 = new Student("Ayşe yılmaz", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100,78,50,60,56,34);
        s1.isPass();


        Student s2 = new Student ("Hüseyin çelik","456","3", tarih, fizik, biyoloji);
        s2.addBulkExamNote(45,67,34,45,34,67);
        s2.isPass();

        Student s3 = new Student ("Şirin Mavi","789", "2", tarih, fizik, biyoloji);
        s3.addBulkExamNote(89,34,90,45,34,67);
        s3.isPass();
    }
}