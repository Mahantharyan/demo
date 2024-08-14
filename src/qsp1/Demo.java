package qsp1;

import org.testng.annotations.Test;

public class Demo
{
	
		@Test
		public void appl()
		{
			for(int i=1;i<=100;i++)
			{
				int no=i;
				int count=0;
				for(int j=1;j<=no;j++)
				{
					if(no%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println(no+" is a prime no");
				}
				else
				{
					System.out.println(no+" is not a prime no");
				}
			}
		}
	}	


