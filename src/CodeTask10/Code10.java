package CodeTask10;

public class Code10 {

	public static void main(String[] args) {

				//Write a java program to find the second largest number
				
				int[] Num = { 35 , 20 , 73 , 40};
				
				int LargestNum = Num[0];
				
				int SecLargestNum = Num[0];
				
				System.out.println("The array I is:");
				
				
				for (int i = 0; i < Num.length; i++) {
					
					System.out.print(Num[1] + " ");
				}
				for(int i = 0; i < Num.length; i++) {
					
					if (Num[i] > LargestNum) {
						SecLargestNum = LargestNum;
						LargestNum = Num[i];
						
					}else if (Num[i] > SecLargestNum) {
						SecLargestNum=Num[i];
					
				}

			}
				System.out.println("The Second largest number is:" + SecLargestNum);
			}
		}
		
		


