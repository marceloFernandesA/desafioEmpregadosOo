import entities.Address;
import entities.Departament;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do departamento: ");
        String name1 = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int payday = sc.nextInt();

        System.out.print("E-mail: ");
        String email = sc.next();
        System.out.print("Telefone: ");
        String phone = sc.next();
        Address address = new Address(email,phone);
        Departament dept = new Departament(name1,payday,address);

        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.println("Dados do funcionário " + (i+1));
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(name,salary);
            dept.addEmp(employee);
        }

        showReport(dept);
        sc.close();
    }

    private static void showReport(Departament dept){
        System.out.println();
        System.out.println("Folha de pagamento:");
        System.out.printf("Departamento %s = R$ %.2f\n",dept.getName(),dept.payroll());
        System.out.printf("Pagamento realizado no dia %d\n",dept.getPayDay());
        System.out.println("Funcionários: ");
        for (Employee emp :dept.getEmp()){
            System.out.println(emp.getName());
        }
        System.out.printf("Para dúvidas favor entrar em contato: %s\n",dept.getAddress().getEmail());


    }
}