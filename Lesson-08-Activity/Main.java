class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("AAAAARGH");
	FtoC(45);
	sphereVolume(67);
	coneVolume(6,7);
	distance(1,2,3,4);
  }


void print(String msg){
System.out.println(msg);
}

void FtoC(double f){
  double c = (f - 32) * 5/9;
  System.out.println(c);
}

void sphereVolume(double r){
	double v = (4.0/3.0) * Math.PI * Math.pow(r,3);
	System.out.println(v);
}

void coneVolume(double r, double h){
	double vol = (Math.PI)*(Math.pow(r,2))*(h/3);
	System.out.println(vol);
}

void distance(double x1, double y1, double x2, double y2){
	double d = Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
	System.out.println(d);
}

}