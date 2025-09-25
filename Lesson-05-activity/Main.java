class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
int v1 = 2;
int v2 = 45;
int sum = v1 * v2;
System.out.println(sum);


/*  java 
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/
int grade1 = 0;
int grade2 = 5;
int grade3 = 99;
float sum_of_grades = grade1 + grade2 + grade3;
System.out.println(sum_of_grades);


/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/
float average = sum_of_grades/3;
System.out.println(average);


/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
  float a = 6;
  float x = 4;
  float y1 = (a)/(x-1);
  System.out.println(y1);

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
 
float y2 = ((2)*(x)*(x+1)*(-x/2))/a;
System.out.println(y2);




/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/

float base = 8;
float height = 10;
float area = (base * height)/2;
System.out.println(area);
 





/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/

int total_eggs = 100;
int basket = 12;
int filled = total_eggs / basket; 
int left = total_eggs % basket;
System.out.println(filled);
System.out.println(left);


    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}