import java.util.*;
public class ZY
{
	public static void main(String[] args)
	{
		//接收键盘输入
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入数字:");
		int num = scanner.nextInt();
		int x = num;
		int y = f(x);
		System.out.print(y);
	}	
	public static int f(int b)
	{
		int result = b*b-2*b+4;
		return result;
	}
}