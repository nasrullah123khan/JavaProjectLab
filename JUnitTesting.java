package junit;


public class JUnitTesting {

	static boolean isEven(int number) {
		if(number % 2 == 0)
		{return true;}
		else {return false;}
	}
	
	static boolean isOdd(int number) {
		if(number % 2 != 0)
		{return true;}
		else {return false;}
	}
	
	 static int factorial(int number){
        int factorial = 1;
        for(int i = 1; i <= number; ++i)
        {
            factorial *= i ;
        }
        return factorial;
    }
	 
	 static boolean isPrime(int number) {
		 int i,m=0,flag=0;     
		 boolean output = false;
		  m=number/2;      
		  if(number==0||number==1){  
		   output = false;      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(number%i==0){      
		    	output = false;;      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  {output = true;}
		  }
		  return output;
	 }

	public int square(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int countA(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	}
	
	
	

