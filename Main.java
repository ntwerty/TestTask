import mypack.*;
import java.util.*;
public class Main {
 
    public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Введите первую операнду");
        
		BigInteg a = new BigInteg(myObj.nextLine());
		
		System.out.println("Введите вторую операнду");
		
		String secop = myObj.nextLine();
		try{
		System.out.println("Сумма двух чисел = " + a.sum(secop));
		System.out.println("Разность двух чисел = " + a.diff(secop));
		System.out.println("Произведение двух чисел = " + a.multiply(secop));
		}
		catch(NumberFormatException e){
			System.out.println("Введены некорректные данные второй операнды");
		}
		//a.display();
    } 
}