package anonyomous;

public class Anon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc aaa";
		String[] parts=a.split(" ");
		String part1=parts[0];
		String part2=parts[1];
		/*System.out.println(part1);
		System.out.println(part2);*/
		System.out.println(a);
		for(int i=0;i<part1.length();i++)
		{
			System.out.print(part1.charAt(i));
			if(i < part1.length()-1)
			{
				System.out.print("-");
			}
		}
		System.out.print(" ");
		for(int i=0;i<part2.length();i++)
		{
			System.out.print(part2.charAt(i));
			if(i < part2.length()-1)
			{
				System.out.print("-");
			}
		}
		

	}

}
