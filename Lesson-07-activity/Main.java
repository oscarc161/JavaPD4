
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/

System.out.println("enter x");
double x = Input.readDouble();
double y = Math.pow(x,7);
System.out.println(y);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
  
System.out.println("enter z");
double z = Input.readDouble();
double q = (Math.pow(z,3)+5);
System.out.println(q);


/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/

System.out.println("enter t then r");
double t = Input.readDouble();
double r = Input.readDouble();
double s = (Math.pow(t,5))*(Math.pow((r+4),2));
System.out.println(s);
 

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/

System.out.println("enter a then b");
double a = Input.readDouble();
double b = Input.readDouble();
double c = Math.sqrt(a+b);
System.out.println(c);

/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
System.out.println("enter x1, x2, y1, then y2");
double x1 = Input.readDouble();
double y1 = Input.readDouble();
double x2 = Input.readDouble();
double y2 = Input.readDouble();
double d = Math.sqrt(Math.pow(x2 - x1,2)+Math.pow(y2 - y1,2));
System.out.println(s);



/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/

System.out.println("enter degrees");
double deg = Input.readDouble();
double g = Math.sin(deg);
System.out.println(g);



/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/

System.out.println("enter m then n");
double m = Input.readDouble();
double n = Input.readDouble();
double k = (Math.pow(m,5))/(Math.sqrt(n+1));
System.out.println(s);


/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/

System.out.println("enter a, b, then c");
double ax = Input.readDouble();
double bx = Input.readDouble();
double cx = Input.readDouble();
double x11 = (-bx + Math.sqrt(Math.pow(bx,2)-4*ax*cx))/(2*ax);
double x22 = (-bx - Math.sqrt(Math.pow(bx,2)-4*ax*cx))/(2*ax);
System.out.println(x11);
System.out.println(x22);



    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}