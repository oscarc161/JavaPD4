
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		gpa(91);
		isGraduating(45, 12);
		bmi(130,160);
		shippingCost(30);

  }
   

  void gpa(double gpa){
	if(gpa >= 90){
		System.out.println(gpa*1.1);
	}else{
		System.out.println(gpa);
	}
	}

  void isGraduating(int credits, int grade){
	boolean graduating = false;
	if(credits >= 44 && grade >= 12){
		graduating = true;
	}

	if(graduating == true){
		System.out.println("Student is Graduating");
	}else{
		System.out.println("Student is NOT Graduating");
	}

	}

	void bmi(double weight, double height){
		double bmi = weight/(Math.pow(height,2));
		if(bmi < 18.5){
			System.out.println("Underweight");
		}else if(bmi >= 18.5 && bmi < 24.9){
			System.out.println("Normal");
		}else if(bmi >= 25 && bmi < 39.9){
			System.out.println("Overweight");
		}else{
			System.out.println("Obese");
		}
	}

	void shippingCost(double weight){
		double extra_toll = 0.02*(weight-25);

		if(weight <= 10){
			System.out.println(0.00);
		}else if(weight > 10 && weight <= 15){
			System.out.println(5.00);
		}else if(weight > 15 && weight <= 25){
			System.out.println(10.00);
		}else{
			System.out.println(10.00 + extra_toll);
		}

			}
	void blueOrViolet(int THz){
		boolean neither = false;
		if(THz <= 600 && THz <= 670){
			System.out.println("Blue");
		}else if(THz >= 700 && THz <= 750){
			System.out.println("Violet");
		}else{
			System.out.println(neither);
	}

	}
}


  



  