public class Employee {
    String fullName;
    double salary;
    int workHours;
    int hireYear;
    double bonus;
    double raiseSalary;
    int currentYear;
    double totalSalary;
    double tax;



    Employee(String fullName, double salary, int workHours, int hireYear ){
        this.fullName = fullName;
        this.salary= salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bonus = 0.0;
        this.currentYear = 2021;
        this.raiseSalary = 0.0;
    }
     double tax(){ //Maaşa uygulanan vergiyi hesaplar
       if(salary < 1000.0){
           this.tax = 0.0;
       }else {
           this.tax = (this.salary*0.03);
       }
       return tax;

     }
     double bonus(){
        if(workHours>40){
           this.bonus = ((workHours-40) * 30);

        }else{
            this.bonus = 0.0;
        }
        return bonus;

     }
      double raiseSalary(){ // Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır.
        if(currentYear - hireYear < 10){
            return salary * 0.05;

        }else if(currentYear - hireYear >9 && currentYear - hireYear < 20){
             return salary * 0.10;

        }else {
            return salary * 0.15;
        }

      }
      double totalSalary() {
          totalSalary = salary + bonus() + raiseSalary() - tax();
          return totalSalary;
      }

       public String toString(){
          return ("Adı: " + fullName +
          "\nMaaşı: " + salary +
          "\nÇalışma Saati: " + workHours +
          "\nBaşlangıç Yılı: " + hireYear +
          "\nVergi: " + tax() +
          "\nBonus: " + bonus() +
          "\nMaaş Artışı: " + raiseSalary() +
          "\nVergi ve Bonuslar ile birlikte maaş: " + (totalSalary() - raiseSalary()) +
          "\nToplam Maaş: " + totalSalary());
       }




}

