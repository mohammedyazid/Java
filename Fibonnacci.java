
import java.util.Scanner; 


class Fibonnacci{
	public static void main(String args[]){
		int f;
		System.out.println("==================================");
		System.out.print("Donner un nombre ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
		int i=1;
		do{
		f=i+(i-1);
		if(f<=num)
		System.out.print(f+"-->");
		i++;
		}while(f<num);
		scanner.close();
	
}
}