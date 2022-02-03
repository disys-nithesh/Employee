package java_project;
import java.util.Scanner;
class employee
{
	int Emp_id;
	long Mobile_no ;
	String Emp_name, Address, Mail_id;
	Scanner sc = new Scanner(System.in);
	
	public void getDetails()
	{
		System.out.println("Enter Employee Name:");
		Emp_name = sc.nextLine();
		System.out.println("Enter Employee Email:");
		Mail_id = sc.nextLine();
		System.out.println("Enter Employee Address:");
		Address = sc.nextLine();
		System.out.println("Enter Employee ID :");
		Emp_id = sc.nextInt();
		System.out.println("Enter Employee Contact:");
		Mobile_no  = sc.nextLong();
	}
	
	public void display()
	{
		System.out.println();
		System.out.println(".....EMPLOYEE DETAILS.....");
		System.out.println("Name: "+Emp_name);
		System.out.println("ID: "+Emp_id);
		System.out.println("Email: "+Mail_id);
		System.out.println("Address: "+Address);
		System.out.println("Contact: "+Mobile_no );
		System.out.println();
	}
	
	public void calculate(double bp)
	{
		double da,hra,pf,club,net,gross;
		da=(0.97*bp);
		hra=(0.10*bp);
		pf=(0.12*bp);
		club=(0.1*bp);
		gross=(bp+da+hra);
		net=(gross-pf-club);
		System.out.println("Basic Pay: Rs."+bp);
		System.out.println("DA: Rs."+da);
		System.out.println("HRA: Rs."+hra);
		System.out.println("PF: Rs."+pf);
		System.out.println("CLUB: Rs."+club);
		System.out.println("GROSS PAY: Rs."+gross);
		System.out.println("NET PAY: Rs."+net);
	}
	
} 

class Programmer extends Employee
{
	double bp=0;
	void output()
	{
		System.out.println("Enter basic pay:");
		bp = sc.nextDouble();
		System.out.println();
		System.out.println(".....PAY SLIP FOR PROGRAMMER.....");
		System.out.println();
		calculate(bp);
	} 
}

class Asstprofessor extends Employee
{
	double bp=0;
	void output()
	{
		System.out.println("Enter basic pay:");
		bp = sc.nextDouble();
		System.out.println();
		System.out.println(".....PAY SLIP FOR ASSISTANT PROFESSOR.....");
		System.out.println();
		calculate(bp);
	} 
}

class Associateprofessor extends Employee
{
	double bp=0;
	void output()
	{
		System.out.println("Enter basic pay:");
		bp = sc.nextDouble();
		System.out.println();
		System.out.println(".....PAY SLIP FOR ASSOCIATE PROFESSOR.....");
		System.out.println();
		calculate(bp);
	} 
}

class Professor extends Employee
{
	double bp=0;
	void output()
	{
		System.out.println("Enter basic pay:");
		bp = sc.nextDouble();
		System.out.println();
		System.out.println(".....PAY SLIP FOR PROFESSOR.....");
		System.out.println();
		calculate(bp);
	} 
}

class Payslip
{
	public static void main(String args[])
	{
		int cont;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println(".....PAYSLIP.....");
			System.out.println(" 1.PROGRAMMER ");
			System.out.println(" 2.ASSISTANT PROFESSOR ");
			System.out.println(" 3.ASSOCIATE PROFESSOR ");
			System.out.println(" 4.PROFESSOR ");
			System.out.print("Enter Your Choice:");
			System.out.println();
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
			{
				Programmer obj=new Programmer();
				obj.getDetails();
				obj.display();
				obj.output();
				break;
			} 
			case 2:
			{
				Asstprofessor obj=new Asstprofessor();
				obj.getDetails();
				obj.display();
				obj.output();
				break;
			}
			case 3:
			{
				Associateprofessor obj=new Associateprofessor();
				obj.getDetails();
				obj.display();
				obj.output();
				break;
			}
			case 4:
			{
				Professor obj=new Professor();
				obj.getDetails();
				obj.display();
				obj.output();
				break;
			}
			default:
			{
				System.out.println(".....ENTER VALID INPUT.....");
			}
			}
			System.out.println();
			System.out.print("Please enter 0 to quit and 1 to continue: ");
			cont=sc.nextInt();
		}while(cont==1);
		sc.close();
	}
}