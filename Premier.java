
import java.util.Scanner; 


class premier{
	public static void main(String args[]){
		int pr=0;
		System.out.println("==================================");
		System.out.print("Donner un nombre entier ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
		for(int i=num;i>0;i--){
			if(num%i==0){
			 pr++;
			}
		}
		if(pr==2){
			System.out.println(+num+" est un Nombre premier");
		}else{
			System.out.println(+num+" n'est pas un Nombre premier");
		}
		scanner.close();
	
}
}