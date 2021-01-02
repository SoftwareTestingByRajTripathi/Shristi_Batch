package constructor;

public class ParametrizedCons {
	int id;  
    String name;  
    //creating a parameterized constructor  
    ParametrizedCons(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display()
    {
    	System.out.println(id+" "+name);
    	}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    	ParametrizedCons p1 = new ParametrizedCons(12,"Karan");  
    	ParametrizedCons p2 = new ParametrizedCons(23,"Raj");  
    //calling method to display the values of object  
    p1.display();  
    p2.display();  
   }  


}
