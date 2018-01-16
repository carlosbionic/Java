public class fibon
{
  /* I want to sum the even Fibonacci numbers up to 4000000*/
 public static void main(String[] args)
 {

  int a = 1;
  int b = 2;
  int aux;
  int sum = 0;

  System.out.println(a);

  for (int i=1; b<4000000; i++)
  {
    System.out.println(b);

    if (b%2 == 0) /* If b is even, goes to the sum */
     sum = sum + b;
    
    aux = a;
    a = b;
    b = aux + b;
  }
 System.out.println("Sum of even numbers = " + sum);
 }

}
