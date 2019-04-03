public class Hello
{
	public static void main(String[] args)
	{
		//变量名
		int a = 48;
		char y = f(a);
		char x = '中';
		int c = w(x);
		System.out.println(y);
		System.out.print(c);
	}
	public static char f(int b)
	{
		char result = (char)b;
		return result;
	}
	public static int w(char d)
	{
		int l = d;
		return l;
	}
}