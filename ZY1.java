import java.util.*;
public class ZY1
{
	public static void main(String[] args)
	{
		//接收键盘输入
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入数字:");
		int num = scanner.nextInt();
		int x = num;
		int y = f(x);
		int z = w(x);
		System.out.println(y);
		System.out.print(z);
	}	
	public static int f(int b)
	{
		int result = b%3;
		return result;
	}
	public static int w(int c)
	{
		int y = c++;
		return y;
	}
}