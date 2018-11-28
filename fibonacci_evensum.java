public class HelloWorld{

     public static void main(String []args){
         int sum=0;
         int n1=0, n2=1;
         int n3;
         for(int i=2;i<=1000000;i++)
         {
            n3=n1+n2; 
            n1=n2;
            n2=n3;
           
         if((i%2)==0)
         {
             sum =sum+i;
         }
       
     }
      System.out.println("sum"+sum);
}
}
