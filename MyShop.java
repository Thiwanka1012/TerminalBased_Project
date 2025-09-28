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
				case 1: 
					if(login()){
						openDashboard();
						}
					break;
				case 2:
					if(register()){
						openDashboard();
						}
					break;
				case 3: break;
				default:return;
						
				
				}
			
		}
		
		
		
		//Login Process
		public static boolean login(){
			
			Scanner input=new Scanner(System.in);
			
			System.out.print("Enter Your Email:");
			String email=input.nextLine();
			
			System.out.print("Enter Your password");
			String password=input.nextLine();
			
			
			for (int i = 0; i < users.length; i++){
				if(users[i][0]!=null && users[i][0].equalsIgnoreCase(email)){
					if(users[i][0]!=null && users[i][1].equals(password)){
						System.out.println("Welcome Again....");
						return true;
						}
						else{
							System.out.println("Wrong Password..Try again...");
							return false;
							}
					}
				}
			{
				
			}
			System.out.println("User is not Found...");
			return false;
			
			}
			
			
		public static boolean register(){
			Scanner input=new Scanner(System.in);
			
			System.out.print("Enter your email:");
			String email=input.nextLine();
			
			System.out.print("Enter Your Password:");
			String password=input.nextLine();
			
			if(users[users.length-1][0]!=null){
				System.out.println("Sorry..Database is Full");
				return  false;
				
				
			}else{
				
				for (int i = 0; i < users.length; i++){
					if(users[i][0]==null){
						users[i][0]=email;
						users[i][1]=password;
						return true;
						}
						else{
						if(users[i][0].equalsIgnoreCase(email)){
							System.out.println("Email is Already Exists");
							return false;
							}	
						}
					}
				{
					
				}
				
				
				
				}
			return false;
			
			
			}
			
			
			public static void openDashboard(){
				System.out.println("Now You are In Dashboard........");
				
			
				
				}
	
	}
