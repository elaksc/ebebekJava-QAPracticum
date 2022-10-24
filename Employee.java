public class Employee{

    private final String name ;
    private final Double salary;
    private final Double workHours;
    private final int hireYear;

    public Employee(String name, Double salary, Double workHours, int hireYear){
       this.name = name;
       this.salary = salary;
       this.workHours = workHours;
       this.hireYear = hireYear;
    }
 
    @Override
    public String toString(){
        return  "Adı :" + this.name  +
        "\nMaaşı :" + this.salary +
        "\nÇalışma Saati :" +this. workHours +
        "\nBaşlangıç Yılı :" + this.hireYear +
        "\nVergi :"+tax()+
        "\nBonus :"+bonus()+
        "\nMaaş Artışı :"+raiseSalary()+
        "\nVergi ve Bonuslar ile birlikte maaş :" +(getSalary()+bonus()-tax())+
        "\nToplam Maaş :"+(getSalary()+raiseSalary()+bonus()-tax());

    }

    public  double tax() {
        if(this.salary<1000){
            return  0;
        }
        return  getSalary()* 0.03;
    }

    public  double bonus(){
       if(this.workHours>40){
           return  (this.workHours-40)*30;
       }
       return 0;
    }

    public Double getSalary(){
        return salary;
    }

    
    public  double raiseSalary() {
        var workYear = 2021-this.hireYear;
        if(workYear<9){

            return getSalary()*0.05;
        }
      else  if(workYear>9&&workYear<19){

            return (getSalary()*0.1);
        }
        return (getSalary()*0.15);


    }

}