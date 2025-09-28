import java.util.Scanner;

class MyShop{
	
	static String[][] users=new String[3][2];
	
	
	public static void main(String[] args){
		
		
		 
		 //1)Login
		 //2)Register
		 //3)Exit
		 
		 
		 String startQuections[] = {
			 "1) Do you want to Login ?",
			 "2)Do you want to Register ?",
			 "3)Do you want to Exist ?"
			 
		 }; 
		for(String temp:startQuections){
			System.out.println(temp);
			}
			
			int userInput=input.nextInt();
			
			switch(userInput){
				case 1: break;
				case 2: break;
				case 3: break;
				default:return;
						
				
				}
			
		}
		
		
		
		//Login Process
		public static boolean login(){
			return false;
			
			}
			
			
		public static boolean register(){
			Scanner input=new Scanner(System.in);
			
			System.out.print("Enter your email:");
			String email=input.nextLine();
			
			System.out.print("Enter Your Password:");
			String password=input.nextLine();
			
			
			}
	
	}
