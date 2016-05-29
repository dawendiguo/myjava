public class Picture{
public static void main(String[] args){
for(int i=0;i<4;i++){
	if(i!=2)
		{
			for(int j=0;j<8;j++)
				{
				if((j+i)==3||(j-i)==3)
					System.out.printf("A");
				else 
					System.out.printf(" ");
			}

				System.out.printf("%n");
		}
	else 
	{
	for(int j=0;j<6;j++){
	if((j+i)>=3&&(j-i)<=3)
		System.out.printf("A");
	else 
		System.out.printf(" ");
	}
	
				System.out.printf("%n");
	}
	}
for(int i=0;i<4;i++){
	for(int j=0;j<8;j++){
		if(j==i||(j+i)==6)
			System.out.printf("V");
		else 
			System.out.printf(" ");
		}
	System.out.printf("%n");
	}
	}

}
