/**
 * @(#)area.java
 *
 *
 * @author 
 * @version 1.00 2022/3/28
 */

import java.util.*;
public class area {
	
	/*	An object is INSTANTIATED from a class (area) then we can have 
	 *	objects of the same type (class). In an object we have
	 *	1. global / instance variables which are the properties
	 *	   name, population, temperature
	 *	2. methods which are the actions of the object 
	 */		
	
	private String name;
	private long   pop;
	private double temp;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setPop(long pop){
		this.pop = pop;
	}
	
	public long getPop(){
		return pop;
	}
	
	public void setTemp(double temp){
		this.temp = temp;
	}
	
	public double getTemp(){
		return temp;
	}
	
	/*	Encapsulation : In an abject both data and methods are
	 *	encapsulated. By setting the variables as private then
	 *	we prevent the values of the variables from accidental 
	 *	access and changes. This is a form of protection.
	 */

    public area() {
    }
    
    public area(String n, long p, double t){
    	name	= n;
    	pop		= p;
    	temp	= t;
    }
    
    public area(String name, long pop){
    	this.name	= name;
    	this.pop	= pop;	
    }
    
    /* Polymorphism OVERLOADING : we can have in the same class
     * methods with the same name provided that their passing parameter 
     * list is different.
     * 
     * Static binding : the polymorphism works during the compilation
     */
    
    public boolean isPneg(){
    	if (pop<0)
    		return true;
    	else
    		return false;	
    } 
    	
    public boolean isTf(){
    	if (temp<-272.9)
    		return true;
    	else
    		return false;	
    }
    //import java.util.*;
    public void input(){
    	Scanner in = new Scanner(System.in);
    	System.out.print("Location name ? ");
    	name	= in.nextLine();
    	System.out.print("Citizens      ? ");
    	pop		= in.nextLong();
    	System.out.print("Tc            ? ");
    	temp	= in.nextDouble();
    	
    }	
    
    public String toString(){
    return "City " + name + " with citizens " + pop + " and Tc " + temp;	
    }
}