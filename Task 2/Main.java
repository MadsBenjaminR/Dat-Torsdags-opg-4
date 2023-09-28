import java.util.Scanner;

class Main{
	


public static void main(String [] args){

System.out.println("Please type your name");

Scanner scanner = new Scanner (System.in);
	String name = scanner.nextLine();

System.out.println("Hello "+name+" how old is that rinkly ass of yours?");


int age = Integer.parseInt(scanner.nextLine());

System.out.println(age);

int retir = 67-age;

if(age<67){

System.out.println("There are " + retir + " years untill you can relax");

  } else {

System.out.println("your old ass is already retired");

  }
 }
}