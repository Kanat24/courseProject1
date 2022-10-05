import java.util.Arrays;

public class Main {
       private static Employee [] employee = new Employee[10];
    public static void main(String[] args) {

        Employee ivanovIvan = new Employee("Ivanov Ivan Ivanovich", 1, 30000);
        Employee sidorovSidor = new Employee("Sidorov Sidor Sidorovich", 2, 50000);
        Employee sergeevSergey = new Employee("Sergeev Sergey Sergeevich", 3, 37500);
        Employee petrovPetr = new Employee("Petrov Peter Peterovich", 4, 29000);
        Employee nikiforovNikifor = new Employee("Nikiforov Nikifor Nikiforovich", 5, 150000);
        Employee larionovVlad = new Employee("Larionov Vladislav Vladimirovich", 2, 18000);
        Employee kitaevNikita = new Employee("Kitaev Nikita Olegovich", 3, 100000);
        Employee lykanovVladimir = new Employee("Lykanov Vladimir Vladimirovich", 2, 33000);
        Employee ostapovDmitriy = new Employee("Ostapov Dmitriy Sergeevich", 1, 52100);
        Employee rydkovskiiTigran = new Employee("Rydkovskii Tigran Araratovich", 4, 21000);
        employee[0]= ivanovIvan;
        employee[1]=sidorovSidor;
        employee[2]= sergeevSergey;
        employee[3]=petrovPetr;
        employee[4]= nikiforovNikifor;
        employee[5]=larionovVlad;
        employee[6]= kitaevNikita;
        employee[7]=lykanovVladimir;
        employee[8]= ostapovDmitriy;
        employee[9]=rydkovskiiTigran;
       getAList();
        System.out.println("Сумма затарат на зарплаты в месяц: " + sumSalary());
        System.out.println("Сотрудник с минимальной зарплатой : "+ minSalary());
        System.out.println("Сотрудник с максимальной зарплатой : "+ maxSalary());
        System.out.println("Среднее значение зарплат равно : " +averageSalary());
        ollEmployee();
    }


    public static void getAList(){
    for (Employee employee1: employee){
        if (employee1!=null) {
            System.out.println(employee1);
        }
        }
    }
    public static int sumSalary(){
        int sum = 0;
        for (Employee employee1: employee){
            sum += employee1.getSalary();
        }
        return sum;
    }
    public static String minSalary(){
        int minSumma=Integer.MAX_VALUE;
        String employeeMinSumma= null;
        for (Employee employee1: employee){
            if (employee1.getSalary()<minSumma){
                minSumma = employee1.getSalary();
                employeeMinSumma= employee1.getFullName();
            }
        }
        return employeeMinSumma ;
    }

    public static String maxSalary(){
        int maxSumma=Integer.MIN_VALUE;
        String employeeMaxSumma= null;
        for (Employee employee1: employee){
            if (employee1.getSalary()>maxSumma){
                maxSumma = employee1.getSalary();
                employeeMaxSumma= employee1.getFullName();
            }
        }
        return employeeMaxSumma ;
    }

    public static int averageSalary(){
        int averageSumma = sumSalary()/ employee.length;
        return averageSumma;
    }

    public static void ollEmployee(){
        System.out.println("Полный список сотрудников: ");
        for (Employee employee1: employee){
            String ollEmployees = employee1.getFullName();
            System.out.println(ollEmployees);
        }
    }

}