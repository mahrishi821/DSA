import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        int a= in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
      // find the largest of three number  
     if(a>b && a>c)
         {
            System.out.println(a);
            if( b>c)
                System.out.println(">"+b+'>'+c);
            else
              System.out.println(">"+c+">"+b);    

           }
         
     else if(b>c && b>a)
         {
             System.out.print(b);
            if( a>c)
                System.out.println(">"+a+'>'+c);
            else
              System.out.println(">"+c+">"+a); 
         }
         else
         {
             System.out.println(c);
            if( a>c)
                System.out.println(">"+a+'>'+c);
            else
              System.out.println(">"+c+">"+a); 

         }





         }
    
}
