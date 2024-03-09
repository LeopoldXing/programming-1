package groupActivites.part1;

import java.util.Random;

public class PartOne
{
	public static void main(String[] args)
	{

		Random random = new Random();
		int num;
		do
		{
			num = random.nextInt(5) + 3;
			if (num != 5)
			{
				System.out.println(num);
			}
		}
		while (num != 5);

	}
}
