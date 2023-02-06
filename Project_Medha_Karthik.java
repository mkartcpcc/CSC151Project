import java.util.Scanner; //for input from user 
public class Project_Medha_Karthik 
{
    public static void main(String[] args) //demo class
    {
        //take input from user, assign to variables
        int userPolicyNumber; 
        String userProviderName; 
        String userFirstName;
        String userLastName; 
        int userAge; 
        String userSmoking; 
        double userHeight; 
        double userWeight; 
        Scanner keyboard = new Scanner(System.in); 

        System.out.print("Please enter the Policy Number: "); 
        userPolicyNumber = keyboard.nextInt(); 
        System.out.print("Please enter the Provider Name: "); 
        userProviderName = keyboard.nextLine();
        System.out.print("Please enter the Policyholder's First Name: "); 
        userFirstName = keyboard.nextLine();
        System.out.print("Please enter the Policyholder's Last Name: "); 
        userLastName = keyboard.nextLine();
        System.out.print("Please enter the Policyholder's Age: "); 
        userAge = keyboard.nextInt();
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): "); 
        userSmoking = keyboard.nextLine();
        System.out.print("Please enter the Policyholder's Height (in inches): "); 
        userHeight = keyboard.nextDouble();
        System.out.print("Please enter the Policyholder's Weight (in pounds): "); 
        userWeight = keyboard.nextDouble();

        //create a new instace of the policy class 
        Policy user = new Policy(userPolicyNumber, userProviderName, userFirstName, userLastName, userAge, userSmoking, userHeight, userWeight);
        double userBMI = user.BMI(); 
        double userPrice = user.price(userBMI); 

        //print data provided
        System.out.println("Policy Number: " + user.getNumber()); 
        System.out.println("Provider Name: " + user.getName()); 
        System.out.println("Policyholder's First Name: " + user.getFirstName()); 
        System.out.println("Policyholder's Last Name: " + user.getLastName()); 
        System.out.println("Policyholder's Age: " + user.getAge()); 
        System.out.println("Policyholder's Smoking Status: "+ user.getSmoking()); 
        System.out.println("Policyholder's Height: " + user.getHeight()); 
        System.out.println("Policyholder's Weight: " + user.getWeight()); 
        System.out.println("Policyholder's BMI: " + userBMI); 
        System.out.println("Policy Price: $" + userPrice); 

    }
}
