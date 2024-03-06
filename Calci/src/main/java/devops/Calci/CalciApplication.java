package devops.Calci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

@SpringBootApplication
public class CalciApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalciApplication.class, args);
	  double num1,num2,Result;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numbers ");
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        Result=num1+num2;
        System.out.print("Addition of two numbers " + Result);
      
	
	}

}
