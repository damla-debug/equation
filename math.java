import java.util.Scanner;

public class math {  
    

    public static void myRoot(int a, int b, int c){
      double discriminant= (double)(Math.pow(b,2)-(4*a*c));
      double  root1= (-1*b)-(Math.sqrt(discriminant))  /(2*a);
      double  root2= (-1*b)+(Math.sqrt(discriminant))  /(2*a);
      double root3= (-1*b)/(2*a);
    System.out.println(discriminant >0 ?  "there is two roots"+ root1 + root2+ " " : "there is no root" + root3 );



    }
     public static void main(String[] args) {
        System.out.println("enter three coefficient ");
        Scanner scan= new Scanner(System.in);
    int a= scan.nextInt();
    int b= scan.nextInt(); 
    int c= scan.nextInt(); 
    
       myRoot(a,b,c);
     
      
       

   
 
         

    }
}
