/**
 * @(#)day9_array_1.java
 *
 *
 * @author 
 * @version 1.00 2022/1/10
 */
import java.util.Scanner;
import javax.swing.*; ////////////////
public class day9_array_3 {
        
    area[] temps = new area[365];  
    int fin;
    double[] t2 = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80};
     
    public day9_array_3() {
    	menu();	
    }
    
    public void menu(){
    	
    	String s =  "[I]nput" + "\n" +
    				"[O]utput" + "\n" +
    				"[M]inimum" + "\n" +
    				"[1]Linear Search 1" + "\n" +
    				"[2]Linear Search 2" + "\n" +
    				"[B]ubble sort" + "\n" +
    				"bi[N]ary search" + "\n" +
    				"[S]election sort" + "\n" +
    				"inve[R]se" + "\n" +
    				"[D]elete" + "\n" +		
    				"shi[F]t" + "\n" +	
    				"e[X]it";							
    char c;
    do{
    	String choose = JOptionPane.showInputDialog(null,s,"Arrays Main Menu",1);
    	c = choose.charAt(0);
    	switch (c){
    		case 'i':
    		case 'I':input(temps);
    		break;
    		case 'o':
    		case 'O':output(temps); 
    		break;
    		
    		case 'm':
    		case 'M':System.out.println("Min T = " + minimum(temps));
    		break;
    		
    		case '1':linear_search_1(temps);
    		break;
    		
    		case '2':linear_search_2(temps);
    		break;
    		case 'b':
    		case 'B':bubble_sort_2(temps);
    		break;
    		case 'n':
    		case 'N':System.out.println("Found in cell : " + binary_search(temps));
    		break;
    		case 's':
    		case 'S':selection_sort(temps);							
    		break;
    		case 'r':
    		case 'R':inverse(temps);
    		break;	
    		case 'd':
    		case 'D':delete(temps);
    		break;	
    		case 'f':
    		case 'F':shift(temps);
    		break;	
    				
    	}
    }while  ((c != 'x') && (c != 'X')  );
    	
    }
    
    
    public void shift(area[] t){
    	
    	int toadd = linear_search_2(t);
    	if (toadd != -1)
    	{
    		for (int i = fin; i >= toadd; i--)
    			t[i+1] = t[i];
    		fin++;	
    	}
    	output(t);	
    } 
    
    public void delete(area[] t){
    	
    	int todelete = linear_search_2(t);
    	if (todelete != -1)
    	{
    		for (int i = todelete; i<fin; i++)
    			t[i] = t[i+1];
    		fin--;	
    	}
    	output(t);	
    }  
    	
    public void inverse(area[] t){
    	System.out.println("=== Inverse Array ===");
    	area temp;
    	for (int i=0; i<= fin/2; i++)
    	{
    		temp	= t[i];
    		t[i]	= t[fin-i];
    		t[fin-i]	= temp;
    	}
    	
    	output(t);	
    }	
    	
    
    public void selection_sort(area[] temps){
    	
    	area temp;
    	for (int first = 0; first<fin; first++)
    	{   
    		int min_ind = first;
    		
    		for (int i=first+1; i<=fin; i++)
    			if (temps[i].getTemp() < temps[min_ind].getTemp())
    				min_ind = i;
    		
    		temp			= temps[first];
    		temps[first]	= temps[min_ind];
    		temps[min_ind]	= temp;		 
    	}
    	output(temps);
    }
    
    public void bubble_sort_2(area[] t){
    	boolean swap;
    	int last = fin;
    	area temp;
    	do{
    		swap = false;	
    		for (int i=0; i<last; i++)
    			if (t[i].getTemp() > t[i+1].getTemp())
    			{ temp  = t[i];
    			  t[i]  = t[i+1];
    			  t[i+1]= temp;	
    			  swap = true;	
    			}		
	    last = last - 1;		
    	}while ( swap == true);
    	System.out.println(" === Sorted array === ");
    	output(t);
    	
    }
    
    public void bubble_sort(area[] t){
    	
    	area temp;
    	for (int pass=0; pass<=fin; pass++){
    		
    		for (int i=0; i<fin; i++)
    			if (t[i].getTemp() > t[i+1].getTemp())
    			{ temp  = t[i];
    			  t[i] = t[i+1];
    			  t[i+1] = temp;	
    			  	
    			}		
	    		
    	}
    	System.out.println(" === Sorted array === ");
    	output(t);
    	
    }
    
   
    
     /*	why modularization - breaking into methods a program is beneficial
      *	1. code reuse. you can invoke a method from many parts of the 
      *		program without rewriting the code
      * 2. easier to debug smaller pieces of code
      * 3. makes the program more readable
      * 4. different programmers can develop different methods/modules at 
      *		the same time thus having a faster development
      * 5. if changes are reuired only the specific module is changed
      *		and not the entire program
      *
      */   	
    
    	
    
     
    public int binary_search(area[] t2){
    	Scanner in = new Scanner ( System.in);
    	System.out.print("Search for T : ");
    	double target = in.nextDouble();
    	int first=0, last=15, middle;
    	boolean found = false;
    	do{
    		middle = (first +last)/2;
    		if (target > t2[middle].getTemp())
    			first = middle + 1;
    		else
    			if (target < t2[middle].getTemp())
    				last = middle - 1;
    			else
    				found = true;
    		
    	}while ( found == false  );
    	
    	if (found == true)
    		return middle;
    	else
    		return -1;
    	
    }
    
    public int linear_search_2(area[] temps){
    	Scanner in = new Scanner ( System.in);
    	System.out.print("Search for T : ");
    	double target = in.nextDouble();
    	boolean found = false;
    	int i=0;
    	 
    		do{if (target == temps[i].getTemp())
    			{System.out.println(target + " found in cell " + i); 
    			 found = true;
    			}
    		  else
    		     i=i+1;	
    		}while ((found == false) && (i<=fin));
    		
    	if (found == false) 
    		{System.out.println(target + " not found");
    		 return -1;
    		}
    	else
    		return i;	
    		
    		
    }
    
    public void linear_search_1(area[] temps){
    	Scanner in = new Scanner (System.in);
    	System.out.print("Search for Population : ");
    	long target = in.nextLong();
    	boolean found = false;
    	for(int i=0; i<=fin; i=i+1)
    		{if (target == temps[i].getPop())
    			{System.out.println(target + " found in cell " + i); 
    			 found = true;
    			}
    		}
    	if (found == false) System.out.println(target + " not found");
    }
    
    public double minimum(area[] t){
    	
    	double min = t[0].getTemp();
    	for (int i=0; i<=fin; i=i+1)
    	{ if (t[i].getTemp() < min)
    		min = t[i].getTemp();
    	}
    	
    	return min;
    }
    
    
    
    public void input(area[] t){
    	Scanner in = new Scanner(System.in);
    	int i=0;
    	do						 
    	{
    	 
    	 t[i] = new area();
    	 t[i].input();
    	 
    	 i = i + 1;
    	 
    	}while ( t[ i-1 ].getTemp() != -999);
    	
    	fin = i - 2;
    }
    
    public void output(area[] t){
    	for (int i = 0 ; i<=fin; i=i+1){
    		System.out.println("T[" + i + "]= " + t[i].toString());
    		System.out.println(t[i].getName() + " " + t[i].getPop()+ " " + t[i].getTemp());
    	}
    		
    }
    
    // in class exercises 7/2/2022
    /*
    public void change(double[] t){
    	
    for (int i=0; i<=fin; i++)
    	if (t[i]>50.0)
    		t[i] = -1000.0;	
    output(t);	
     	
    }
    
    public int COUNT(double[] t){
    	
    	int index = 0;
    	for (int i=0; i<= fin; i++)
    		if ((t[i]>=-5.0) && (t[i]<=5.0))
    			index++;
    			
    	return index;		
    	
    }
    
    */
    
    /* EXERCISES 13
    */
    
    /*
    
    //1
     public void ammend(double[] temps){
    	for (int i=0; i<=temps.length; i++)				//for (int i=0; i<temps.length; i++)
    		 temps[i] = temps[i] - 0.2;
    	}
    	
    //2
    public void append(double[] temps){
    	Scanner in = new Scanner(System.in);
    	
    		System.out.print("Give me the T to append : ");
    		temps[fin + 1] = in.nextDouble();
    		fin  = fin + 1;
    }
    
    //3
    public double meanvalue(double[] temps){
    	double total = 0;
    	for (int i=0; i<=fin; i++)
    	{
    		if ((temps[i]>=0) && (temps[i]<=10))
    			 total = total + temps[i];
    	}
    	
    	if (fin != 0)
    		return total/fin;
    	else
    		return 0;
    }
     
     */
     
    public static void main(String[] args) {
         new day9_array_3();
    }
}
