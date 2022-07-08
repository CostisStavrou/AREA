/**
 * @(#)nomos.java
 *
 *
 * @author 
 * @version 1.00 2022/4/11
 */

import java.util.Scanner;
public class nomos extends area {
	
/* Nomos inherits the variables and 
 * methods of the class area by using 
 * the reserved word "extends"
 * nomos is called: sub class or child class
 * area is called: super class or parent class
 * 
 * inheritence : is when a sub class
 * inherits all the variables and methods
 * of a super class.
 * 
 * This way we achieve code reuse without 
 * rewritting the code
 */	

	private int sur; // surface of nomos
	private boolean bythesea; // is or not
							// bythe sea
							
	public void setSur(int sur){
		this.sur	= sur;
	}
		
	public void setBythesea(boolean bythesea){
		this.bythesea = bythesea;
	}	
		
	public int getSur(){
		return sur;
	}
	
	public boolean getBythesea(){
		return bythesea;
	}
		
    public nomos() {
    }
    
    public void input(){
    	super.input();
    	Scanner in = new Scanner(System.in);
    	System.out.print("Surface ? ");
    	sur	= in.nextInt();
    	
    }	
    	
    public String toString(){
    	return super.toString() +
    		" surface " + sur + 
    		" by the sea " + bythesea;
    }	
    	
    	
    /* override is when a method in a sub
     * class has the same name as in the super
     * class thus the method in the sub class
     * overrides the actions of the method
     * in the super class
     * 
     * this is the second way of
     * polymorphism and it is called 
     * static binding as it happens
     * during the compilation stage
     *
     * by using the reserved word super
     * we can invoke the methods of the
     * super class even if there is an override
     */	
}