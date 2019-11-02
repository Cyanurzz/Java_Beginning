public class ObjectTraining {

    // TODO 1. Add the following private attributes :
    private String name;
    private int age;
    private boolean wilder;
    // - wilder (boolean)


    // TODO 2. Add a Constructor with name and age arguments (in this order)
    // This constructor must initialize name and age attributes
    public ObjectTraining(String name, int age){
        this.name = name;
        this.age = age;
        this.wilder = true;
    }
    // Do not remove this empty constructor !
    public ObjectTraining() {
    }

    //getters : 
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public Boolean isWilder(){
        return this.wilder;
    }

    //Setters
    public void setName(String name){
         this.name = name;
    }

    public void setAge(int age){
         this.age = age;
    }

    public void setWilder(boolean wilder){
        this.wilder = wilder;
    }

    // TODO 9. Create a method 'whoAmI' that returns "My name is {name} and I'm {age}"
    // where you replace {name} and {age} with attributes values
    public String whoAmI(){
        return "My name is " + this.name + " and I'm " + this.age;
    }

}


