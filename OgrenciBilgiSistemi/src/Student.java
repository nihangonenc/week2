public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote( int note1, int note2, int note3, int oNote1, int oNote2, int oNote3){
        if( note1>= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if( note2>= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if( note3>= 0 && note3 <= 100){
            this.c3.note = note3;
        }
        if( oNote1>= 0 && oNote1 <= 100){
            this.c1.oNote = oNote1;
        }
        if( oNote2>= 0 && oNote2 <= 100){
            this.c2.oNote = oNote2;
        }
        if( oNote3>= 0 && oNote3 <= 100){
            this.c3.note = oNote3;
        }

    }
    void printNote(){

        System.out.println(this.c1.name + " sınav notu:" + this.c1.note + " Sözlü notu:" + this.c1.oNote);
        System.out.println(this.c2.name + " sınav notu:" + this.c2.note + " Sözlü notu:" + this.c2.oNote);
        System.out.println(this.c3.name + " sınav notu:" + this.c3.note + " Sözlü notu:" + this.c3.oNote);
        System.out.println("Ortalamanız: " + this.avarage);
    }
    void isPass(){
        System.out.println("======");
        double c1 = (this.c1.note * 0.80) + (this.c1.oNote * 0.20) ;
        double c2 = (this.c2.note * 0.80) + (this.c2.oNote * 0.20) ;
        double c3 = (this.c3.note * 0.80) + (this.c3.oNote * 0.20) ;

        this.avarage = (c1 + c2 + c3) / 3.0;

        if (this.avarage > 55){
            System.out.println("Sınıfı geçtiniz.");
            this.isPass = true;
        }else{
            System.out.println("Sınıfta kaldınız.");
            this.isPass = false;
        }
        printNote();
    }


}
