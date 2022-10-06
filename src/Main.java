import java.util.Arrays;

public class Main {
    protected static Employee[] employee = new Employee[10];

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
        employee[0] = ivanovIvan;
        employee[1] = sidorovSidor;
        employee[2] = sergeevSergey;
        employee[3] = petrovPetr;
        employee[4] = nikiforovNikifor;
        employee[5] = larionovVlad;
        employee[6] = kitaevNikita;
        employee[7] = lykanovVladimir;
        employee[8] = ostapovDmitriy;
        employee[9] = rydkovskiiTigran;
        Easy.getAList();
        System.out.println("Сумма затарат на зарплаты в месяц: " + Easy.sumSalary());
        System.out.println("Сотрудник с минимальной зарплатой : " + Easy.minSalary());
        System.out.println("Сотрудник с максимальной зарплатой : " + Easy.maxSalary());
        System.out.println("Среднее значение зарплат равно : " + Easy.averageSalary());
        Easy.ollEmployee();

        //Повышенная сложность
        System.out.println("Реализация задач повышенной сложности: ");
        Medium.indexSalary();
        Medium.numberDepartamentOllSum(2);
        System.out.println("Максимальная зарплата в отделе у " + Medium.numberDepartamentMaxSum(2));
        System.out.println("Минимальная зарплата в отделе у " + Medium.numberDepartamentMinSum(3));
        Medium.averageSalaryDepartment(1);
        Medium.indexOllSalary(2, 2);
        Medium.ollDepartamentEmployee(2);
        Medium.salaryLessNumber(50000);
        Medium.salaryMoreNumber(50000);

    }


}