import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {

		int[][] dogwalker;
		int dog[],i,j=1,t=1,s=0;
		System.out.println("enter the no. of dogwalkers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dogwalker = new int[n+1][2];
		System.out.println("enter the no. of dogs");
		int l = sc.nextInt();
		dog = new int[l+1];
		if(n>l){
			System.out.println("no. of dogs are less than dogwalkers");
		}
		else if(n<l/2){
		   	System.out.println("no. of dogs are more than twice of dogwalkers");
		}
		else{
			for(i=1 ; i<=l;i++){
				System.out.println("enter the weight of "+i+" dog:" );
				dog[i] = sc.nextInt();
			}
			int a = 0;
			if(n == l){
				for(i=1;i<=n;i++){
					dogwalker[i][0] = dog[i];
					System.out.println(i+" dogwalker has dog of weight " +dogwalker[i][1]);
				}
			}
			else if((2*n)==l){
				for(i=1;i<=n;i++){
					System.out.println("dogwalker " +i+ " have dogs \n");
					for(j=0;j<=1;j++){
						dogwalker[i][j] = dog[i+j+a];
						System.out.println("\t dog "+ (j+1) + " weight "+dogwalker[i][j] );
					}
					a++;
				}
			}
		else{	
			for(i=1;i<=n;i++){
				if(j<=l){
				dogwalker[i][0] = dog[j];
				j=j+2;
				}
				else{
					if(t==1){
					if(l%2==0){
						j=l;
						t++;
				        s++;
					}
					else{
						j=l+1;
						t++;
					}
				  }	
				 if(j>1){	
					 dogwalker[i][0] = dog[j];
					 j=j-2;
				 }
				}
			}
			s=j;
			j=2;
			i=1;
			while(j<=s){
				dogwalker[i][1] = dog[j];
				i++;
				j=j+2;
			}
			for(i=1;i<=n;i++){
				System.out.println("dogwalker " +i+ " have dogs \n");
				for(j=0;j<=1;j++){
					System.out.println("\t dog "+ (j+1) + " weight "+dogwalker[i][j] );
				}
			}
		  }	
		}
		sc.close();
	}

}
