import java.util.Arrays;

public class BubbleSort
{

	public static void main(String[] args)
  {
    int[]  unsorted = {12, 15, 0, 44, 13, 1, 2};
		int [] sorted; 

		System.out.println(Arrays.toString(unsorted));
		sorted= bubbleSort(unsorted);
		System.out.println(Arrays.toString(sorted));


  }

  public static int[] bubbleSort(int [] unsorted )
  {
		int [] sorted= unsorted;

	
		int passes;
		int comparisons = 0;
		int tempNum; 

		passes = (sorted.length-1);
		for( int i=1; i<passes;i++)
		{
			
				 comparisons= unsorted.length-i;

			for (int x=0; x<comparisons;x++)
			{
				if(sorted[x]>sorted[x+1])
				{
					tempNum =  sorted[x];
					sorted[x] = sorted[x+1];
					sorted[x+1]= tempNum;
				}
			}
			
		}
		return unsorted;
  }
  
}
