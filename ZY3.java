import java.util.*;
public class ZY3
{
	public static void main(String[] args)
	{
		//接收键盘输入
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入数字:");
		long num = scanner.nextLong();
		long a1 = num%10;
		long a3 = num/100%10;
		long a5 = num/10000%10;
		long a7 = num/1000000%10;
		long a9 = num/100000000%10;
		long a11 = num/10000000000l%10;
		long a2 = num/10%10;
		long a4 = num/1000%10;
		long a6 = num/100000%10;
		long a8 = num/10000000%10;
		long a10 = num/1000000000%10;
		long a12 = num/100000000000L%10;
		long c1 = a1+a3+a5+a7+a9+a11;
		long c2 = a2+a4+a6+a8+a10+a12;
		long cc = c1+c2*3;
		System.out.print((10-(cc%10))%10);

		


	}
}