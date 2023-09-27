import java.util.Scanner;

public class discountCalc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the amount of iron");
    float i = sc.nextFloat(); 
    System.out.println("enter the amount of steel");
    float s = sc.nextFloat(); 
    System.out.println("enter the amount of tungsten");
    float t = sc.nextFloat(); 
    System.out.println("enter the amount of nickel");
    float n = sc.nextFloat(); 

    discountCalc d = new discountCalc(); 
    d.calculate(i, s, t, n); 

  }

  void calculate(float i, float s, float t, float n) {

    float card1 = 0.0f; 
    float card2 = 0.0f; 

    // card 1
    card1 = ( i * (7.0f/100)) + ( s * (3.0f/100)) + ( t * (2.0f/100)) + ( n * (1.0f/100));

    // card 2
    float sum = i + s + t + n; 
    if(sum <= 25000) {
      card2 = 0.0f; 
    } else if (sum >= 25001 && sum <= 50000) {
      card2 = sum * (5.0f/100); 
    } else if(sum >= 50001 && sum <= 100000) {
      card2 = sum * (7.0f/100); 
    } else {
      card2 = sum * (10.0f/100); 
    }
    // recommending by checking which card gives the max discount
    if(card1  > card2) {
      System.out.println("card 1 "+card1);
    } else {
      System.out.println("card 2 "+card2);
    }

  }
}
// revise(sep)