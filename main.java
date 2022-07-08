/**
 * @(#)main.java
 *
 *
 * @author 
 * @version 1.00 2022/3/28
 */


public class main {
     
     area a1;
     area a2;
     area a3;   
     area a4;
     area a5;
     area a6;
     area a7;
     area a100;
     area a200;//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
     nomos n300;
     
    public main() {
    	obj();
    }
    
    public void obj(){
    	
    	n300 = new nomos(); // object instantiation out of
    	
    	double sums=0, sump=0, aves, avep;
    	for (int i=0; i<3; i++)
    	{   		
    	 do{					// nomos
    		n300.input();
    		n300.setBythesea(true);
    	 }while ((n300.isPneg()== true) || (n300.isTf()==true));
    	 sums = sums + n300.getSur();
    	 sump = sump + n300.getPop();
    	}
    	aves = sums/3;
    	avep = sump/3;
    	System.out.println("Ave surface " + aves +
    						" Ave population " + avep);
    	System.out.println(n300.toString());					
    	
    	a100 = new area();
    	do{
    		a100.input();
    	}while ((a100.isTf() == true)  || (a100.isPneg() == true));
    	
    	double sum = 0;
    	/*
    	do{
    	 a200 = new area();
    	 
    	 a200.input();
    	 
    	 if (a200.isPneg() != true)
    	 	sum = sum + a200.getPop();  	
    		
    	}while ( a200.isPneg() != true );
    	
    	System.out.println("Total citizens = " + sum);
    	*/
    	
    	sum = 0 ;
    	
    	int k = 0;
    	
    	do{
    	 a200 = new area();
    	 
    	 a200.input();
    	 
    	 if (a200.isTf() != true)
    	 	{sum = sum + a200.getTemp();  	
    	 	 k = k + 1;
    	 	}	
    		
    	}while ( a200.isTf() != true );
    	
    	System.out.println("Average temperature = " + (sum/k));
    	
    	a1 = new area();	// object instantiation
    	a1.setName("Athens");//a1.name	= "Athens";
    	a1.setPop(5000000);//a1.pop	= 5000000;
    	a1.setTemp(15.5);//a1.temp	= 15.5;
    	
    	a2 = new area();
    	a2.setName("Thessaloniki");//a2.name	= "Thessaloniki";
    	a2.setPop(800000);//a2.pop	= 800000;
    	a2.setTemp(6.0);//a2.temp	= 6.0;
    	
    	a3 = new area();
    	a3.setName("Larissa");//a3.name	= "Larissa";
    	a3.setPop(180000);//a3.pop	= 180000;
    	a3.setTemp(-1.5);//a3.temp	= -1.5;
    	
    	a4 = new area();
    	a4.setName("Heraklio");//a4.name	= "Heraklio";
    	a4.setPop(150000);//a4.pop	= 150000;
    	a4.setTemp(16.0);//a4.temp	= 16.0;
    	
    	a5 = new area();
    	a5.setName("Patra");//a5.name	= "Patra";
    	a5.setPop(80000);//a5.pop	= 80000;
    	a5.setTemp(21.5);//a5.temp	= 21.5;
    	
    	a6 = new area("Hania",80500,21.5);
    	
    	a7 = new area("Poros",1000);
    	a7.setTemp(22.0);//a7.temp = 22.0;
    	
    	System.out.println("City names are " +
    	    a1.getName() + " " + a2.getName() + " " + a3.getName() + 
    	    	" " + a4.getName()
    		+ " " + a5.getName());
    		
    	System.out.println(a1.toString());	
    	System.out.println(a2.toString());
    	System.out.println(a3.toString());
    	System.out.println(a4.toString());
    	System.out.println(a5.toString());
    	System.out.println(a6.toString());
    	System.out.println(a7.toString());
    	System.out.println(a100.toString());
    	
    	System.out.println("Ave Tc " + avet());
    	System.out.println("Ave Po " + avep());	
    		
    	System.out.println("Min Tc " + minT());	
    	
    }
    
    public double avet(){
    	return (a1.getTemp() + a2.getTemp() + a3.getTemp() + 
    		a4.getTemp() + a5.getTemp())/5;
    }
    
    public double avep(){
    	return (a1.getPop() + a2.getPop() + a3.getPop() 
    		+ a4.getPop() + a5.getPop())/5;
    }
    
    public double minT(){
    	
    	double min = 999999;
    	
    	if (a1.getTemp()<min)
    		min = a1.getTemp();
    	if (a2.getTemp()<min)
    		min = a2.getTemp();
    	if (a3.getTemp()<min)
    		min = a3.getTemp();
    	if (a4.getTemp()<min)
    		min = a4.getTemp();
    	if (a5.getTemp()<min)
    		min = a5.getTemp();			
    	
    	return min;
    }
     
    public static void main(String[] args) {
        new main();
    }
}
