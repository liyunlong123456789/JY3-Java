import java.util.*;
public class Login
{
	public static void main(String [] agrs)
	{
		Scanner scanner = new Scanner(System.in);
		char userName = 'a';
		char passWord = 'b';
		System.out.print("请输入用户名：");
		String inputUser = scanner.next();
		System.out.print("请输入密码：");
		String inputPsw = scanner.next();
		char c1 = inputUser.charAt(0); 
		char c2 = inputPsw.charAt(0);
		if(userName == c1 || passWord == c2)
		{
			System.out.print("登录成功：");
		}
	}
}