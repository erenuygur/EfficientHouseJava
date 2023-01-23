# Methods

All method definitions belong to some class, and all method definitions are given inside the definition of the class to which they belong.

A method definition is divided into two parts, a **heading** and a **method body**, as illustrated by the annotation on the method definition.

The way you invoke a method from a class definition you write is the same as the way you do it for a predefined class.

```java
public static void Main(string[] args)
{
	DateFirstTry date1, date2; 
	date1.writeOutput();
}

/* DateFirstTryDemo is an invocation of the method writeOutput with 
date1 as the calling object. */
public class DateFirstTry
{

	public String month;
	public int day;
	public int year;

	public void writeOutput()
	{
	System.out.println(month + " " + day + " " + year);
	}
}
```

This invocation is equivalent to execution of the method body.

```java
//So, this invocation is equivalent to
System.out.println(month + " " + day + ", " + year);
```

> If you simply replace the method invocation with this System.out.println statement, you will get a compiler error message.  within the definition for the method writeOutput,
> 

<aside>
💡  the names of the instance variables are used without any calling object. *This is because the method will be invoked with different calling objects at different times. When an instance variable is used in a method definition, it is understood to be the instance variable of the calling object.*

</aside>

```java
System.out.println(date1.month + " " + date1.day + ", " + date1.year); 
//is equivalent to
date1.writeOutput();

```

Methods are of two types, one is **void type** methods and the other is **return type** methods.

```java
public Type_Returned  Method_Name (Parameter_List)
{

}
```

<aside>
💡 If a method returns a value, then it can return different values in different situations,
but all values returned must be of the same type, which is specified as the type returned

</aside>

```java
public double myMethod() 
{
	//...
	return double_value; // the method always must be returns a value of type double
}

public String yourMethod() 
{
	//...
	return String_value; // indicates a method that always returns a value of type String
}

public void ourMethod()
{
	//...

	return; // Terminates the method call. It expires the Method Frame and the Method's Scope. Keeps Flowing.
}

```

> when the method returns no value at all, we use the keyword void in place
of a type. If you think of void as meaning “no returned type,” the word void begins
to make sense.
> 

An **invocation** of a method that returns a value can be used as an expression anyplace
that a value of the Type_Returned can be used.

```java
double d = anObject.myMethod(); //method invocation.

```

<aside>
💡 A  virtual frame is opened where the method is called.

</aside>

A void method doesn’t return a value, but simply performs an action, so an invocation of a void method is a statement.

```java
anObject.ourMethod();
```

 **body** of a void method definition is simply a list of declarations and statements enclosed in a pair of braces,( { } —> Scope )

```java
public void ourMethod()
{
 System.out.println("Hello");
 System.out.println("from our method.");
}
```

The body of a method that returns a value is the same as the body of a void method but with one additional requirement.  The body of a method that returns a value must
contain at least one return statement

```java
public String yourMethod()
{
 Scanner keyboard = new Scanner(System.in);
 System.out.println("Enter a line of text");
 String result = keyboard.nextLine();
 return result + " was entered.";  //return Expression;
}
```

A return statement is of the form where Expression can be any expression that evaluates to something of the Type_Returned that is listed in the method heading

A method that returns a value can do other things besides returning a value,(Side Effect) but style rules dictate that whatever else it does should be related to the value returned.

<aside>
💡 A return statement always ends a method invocation. Once the return statement is executed, the method ends, and any remaining statements in the method definition are not executed

</aside>

<aside>
💡 If you want to end a void method before it runs out of statements, you can use a return statement without any expression A void method need not have any return statements, but you can place a return statement in a void method if there are situations that require the method to end before all the code is executed.

</aside>

```java
public void ourMethod()
{
 System.out.println("Hello");
 System.out.println("from our method.");
	return;  //Method çağrısını sonlandırır. Method Frame'ini Methodun Scope'unu yani ömrünü bitirir. Akışı Devam Ettirir.
}

```

// Summary // 

There are two kinds of methods: methods that return a value and methods, known as void
methods, that perform some action other than returning a value.

```java
	//Definition of Return Type.
public Type_Returned Method_Name(Parameter_List)
{
 /*
	Statements...
** at least one of which must contain a return statement.
*/
}

// If there are no Parameters, then the parentheses are empty.

Ex.
public int getDay()
{

 return day;
}

	//Definition of Void Type
public void Method_Name(Parameter_List)
{
 //Statements...
}
Ex.
public void writeOutput()
{
 System.out.println(month + " " + day + ", " + year);

// no need return statements if we use. the method flowing is terminate.
}

```

<aside>
💡 When an instance variable name is used in a method definition, it refers to an instance
variable of the calling object.

</aside>

all these method definitions must be inside of some class definition. Java does not have any stand-alone methods that are not in any class.

```java
public class DemoOfDateSecondTry
{
	public static void main(String[] args)
	{
		DateSecondTry date = new DateSecondTry();
		date.readInput(); // An invocation of a void method is astatement.
		int dayNumber = date.getDay(); 

/* An invocation of a method that returns a value is an expression that can be
used anyplace that a value of the type returned by the method can be used. */
	
		System.out.println("That is the " + dayNumber + "th day of the month.");
	}
}

**The value to be returned value must be used by a variable.**

```

```java
public int getDay()
{
	return day;
	}
	public int getYear()
	{
	return year;
	}
		public int getMonth()
		{
		if (month.equalsIgnoreCase("January"))
		return 1;
	
		else if (month.equalsIgnoreCase("February"))
		return 2;
	
		else if (month.equalsIgnoreCase("March"))
		return 3;
	
		else if (month.equalsIgnoreCase("April"))
		return 4;
	
		else if (month.equalsIgnoreCase("May"))
		return 5;
	
		else if (month.equalsIgnoreCase("June"))
		return 6;
	
		else if (month.equalsIgnoreCase("July"))
		return 7;
	
		else if (month.equalsIgnoreCase("August"))
		return 8;
	
		else if (month.equalsIgnoreCase("September"))
		return 9;
	
		else if (month.equalsIgnoreCase("October"))
		return 10;
	
		else if (month.equalsIgnoreCase("November"))
		return 11;
	
		else if (month.equalsIgnoreCase("December"))
		return 12;
	
			else
			{
				System.out.println("Fatal Error");
				return 0; //Needed to keep the compiler happy
			}
		}
}
```

```java
import java.util.Scanner;

public class DateSecondTry
{
	private String month;
	private int day;
	private int year; 
	public void writeOutput()
	{
		System.out.println(month + " " + day + ", " + year);
	}
public void readInput()
{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter month, day, and year.");
	System.out.println("Do not use a comma.");
	month = keyboard.next();
	day = keyboard.nextInt();
	year = keyboard.nextInt();
}
```

```java
public class MethodIntro {
    public static void main(String[] args)
    {
        System.out.println("main starts ;)");
        MethodIntro.foo();  
        MethodIntro.bar();
        tar();  //Since the access identifier of the specified method is public,it can be used remotely. 
								//Thus, there is no need to write a class name for the method.
        System.out.println("main ends ;(");
    }

    public static void foo()
    {
        System.out.println("foo()");
    }

    public static void bar()
    {
        System.out.println("bar()");
    }

    public static void tar()
    {
        System.out.println("tar()");
    }
}
```

```java
public class MethodCalling {
    public static void main(String[] args)
    {
        System.out.println("main method starts ;)");
        foo("call foo()");     //I sent a String argument.
        bar("call bar()");
        tar("call tar()");
        System.out.println("main method ends ;(");
    }

    public static void foo(String message)
    {
        System.out.println(message); //and I get String parameter.
    }

    public static void bar(String message)
    {
        System.out.println(message);
    }

    public static void tar(String message)
    {
        System.out.println(message);
    }
}

```

```java
public class MethodIntroExample {
    public static void main(String[] args)
    {
        System.out.println("main method starts ;)");
        foo();
        bar();
        tar();
        System.out.println("main method ends ;(");
    }

    public static void foo()
    {
        System.out.println("foo()");
        bar();
    }

    public static void bar()
    {
        System.out.println("bar()");
        tar();
    }

    public static void tar()
    {
        System.out.println("tar()");
    }
}
```

```java
public class VoidTypeMethods {
    public static void main(String[] args)
    {
        isEven(10);
        isEven(11);
        isEven(-3);
    }

    public static void isEven(int val)
    {
        if (val < 0) {
            System.out.println("Illegal input: You can not enter negative value.");
            return;
        }

        if (val % 2 == 0)
            System.out.printf("%d is Even number%n", val);
        else
            System.out.printf("%d is not Even number%n", val);
    }
}
```

```java
public class ReturnTypeMethods {
    public static void main(String[] args)
    {
        java.util.Scanner keyboard = new java.util.Scanner(System.in);

        int sum = addTwoNumbers(5, 10);
        // addTwoNumbers(int a, int b)  a = 5 || b = 10
        // int temp = 15
        // int sum = temp;
        System.out.println(sum); // 15

        sum = addThreeNumbers(sum, 12, 13); // 40
        // addThreeNumbers(sum, 12, 13)  sum = 15
        // addThreeNumbers(int a, int b, int c) a = 15 || b = 12 || c = 13
        // return 15 + 12 + 13;
        // int temp = 40;
        // int sum = temp;
        // int sum = 40;
        System.out.println(sum); // 40

        System.out.print("val: ");
        int val = keyboard.nextInt();

        System.out.printf("%d is Even ? = %b", val, isEven(val));

    }

    public static int addTwoNumbers(int a, int b)
    {
        return a + b; // int temp = a + b;
    }

    public static int addThreeNumbers(int a, int b, int c)
    {
        return a + b + c;
    }

    public static boolean isEven(int val)
    {
        return val % 2 == 0;
        // boolean temp = val % 2 == 0;
    }
}

```

//  

## Local Variables And Parameters.

A variable declared within a method is called a local variable. It is called local because they may be two different variables that just happen to have the same name. Any change that is made to the variable named A within one method would have no effect upon the variable named A in the other method.

All variables declared in main are variables local to the method main. If a variable declared in main happens to have the same name as a **v**ariable declared in some other method, they are
two different variables that just happen to have the same name. 

```java
public static void Main(String[] args)
{
  int a = 5;  //this is local variable.

	double a = 4; //IT'S ERROR.  Two variables with the same name cannot be defined in a scope.

	 tar(a);
}
public static void tar(int a)  //this is parameter variable.
{
	int a = 3 ; //IT'S ERROR BECAUSE WE ALREADY DEFİNED a;
}
```

There are 3 types of variables in Java, one is local variables, one is parameter variables and one is static variables. We discuss static variables after.

[Method Signature and Overloading Method.](https://www.notion.so/Method-Signature-and-Overloading-Method-53f0730bfc744cabb2c6ba9c5592a48f)
