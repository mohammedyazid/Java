
import java.util.Scanner; 


class Factoriel{
	public static void main(String args[]){
		int fact=1;
		System.out.println("==================================");
		System.out.print("Donner un nombre entier ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
		
		for(int i=1;i<num+1;i++){
			fact=fact*i;
		}
		System.out.println("Factoriel de "+num+" equal ="+fact);
		scanner.close();
	
}
}