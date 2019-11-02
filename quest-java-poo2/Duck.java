public class Duck extends Bird {  
      
    private boolean swimming;
    
	public Duck(String name) {  
	    super(name);  
	    this.swimming = false;  
	}
  
    @Override
    public String sing() {
        return "Quack!";
    }
  
    public boolean isSwimming() {  
        return swimming;  
    }  
  
    public void setSwimming(boolean swimming) {  
        this.swimming = swimming;  
    }  
}
