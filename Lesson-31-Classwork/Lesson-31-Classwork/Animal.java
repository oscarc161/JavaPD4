class Animal{

  String animalSpecies;
  double weight;
  double height;

  
  Animal(String animalSpecies, double weight, double height){
    this.animalSpecies  = animalSpecies;
    this.weight         = weight;
    this.height         = height;
  }

 

  // other class functions
  boolean ishealthy(){
    if(this.weight < 100 && this.weight > 30){
      return true;
    }else{
      return false;
    }
  }

  double weighttokilos(){
    return this.weight * 0.453592;
  }
  
  
  
}