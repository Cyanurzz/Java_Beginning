public abstract class Vehicle {

  // attributs
  private String brand;
  private int kilometers;

  // Constructeurs 
  public Vehicle(String brand){
    this.brand = brand;
    this.kilometers = 0;
  }

  // accesseurs 
  public String getBrand(){
    return this.brand;
  }

  public int getKilometers(){
    return this.kilometers;
  }

  //Mutateurs
  public void setBrand(String brand){
    this.brand = brand;
  }

  public void setKilometers(int kilometers){
    this.kilometers = kilometers;
  }

  //méthode

  public abstract String doStuff();
}