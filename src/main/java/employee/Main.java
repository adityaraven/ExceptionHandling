package employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));


        ArrayList<Employee> employeeList =new ArrayList<>();
        System.out.println("Enter the number of Employees");

        int noOfEmp= Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter in format(id,name,mobileNumber,salary)");
        for(int i=0;i< noOfEmp;i++){
            String[] split= bufferedReader.readLine().split(",");
            Employee emp= new Employee();
            emp.setId(Integer.parseInt(split[0]));
            emp.setName(split[1]);
            emp.setMobileNumber(Integer.parseInt(split[2]));
            emp.setSalary(Double.parseDouble(split[3]));
            employeeList.add(emp);

        }

        System.out.println("List of Employees");

        for(Employee emp1: employeeList){
            //System.out.format("%d\t%s\t%l\t%f\n", emp1.getId(), emp1.getName(),emp1.getMobileNumber(),emp1.getSalary());
            System.out.println(emp1.toString());
        }
    }
}
