import java.util.*;
public class ZY2
{
	public static void main(String[] args)
	{
		//���ռ�������
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int size = 5;
		int page = num%size==0 ? num/size : num/size+1;
		System.out.print(page);


	}
}