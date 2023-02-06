/*
 * Medha Karthik
 * 2/6/23
 * CSC251-N803: Advanced Java Programming
 * Project Part 1
 */

 public class Policy 
 {
    //attributes for the policy class
    private int number; 
    private String providerName; 
    private String firstName; 
    private String lastName;
    private int age; 
    private String smoke; 
    private double height; 
    private double weight; 

    //create a no-arg constructor, set default values for all fields
    public Policy() 
    {
        number = 0; 
        providerName = "n/a"; 
        firstName = "n/a"; 
        lastName = "n/a"; 
        age = 0; 
        smoke = "n/a"; 
        height = 0.0; 
        weight = 0.0; 
    }

    //constructor that accepts arguments
    public Policy(int num, String proname, String fname, String lname, int policyage, String status, double poheight, double poweight)
    {
        //fully initialize policy object
        number = num; 
        providerName = proname; 
        firstName = fname; 
        lastName = lname; 
        age = policyage; 
        smoke = status; 
        height = poheight; 
        weight = poweight; 
    }

    //accessor method to get policy number
    public int getNumber() 
    {
        return number; 
    }

    //accessor method to get provider name
    public String getName()
    {
        return providerName; 
    }

    //accessor method to get policyholder's first name
    public String getFirstName()
    {
        return firstName; 
    }
    
    //accessor method to get policyholder's last name
    public String getLastName()
    {
        return lastName; 
    }

    //accessor method to get policyholder's age
    public int getAge()
    {
        return age; 
    }

    //accessor method to get policyholder's smoking status
    public String getSmoking()
    {
        return smoke; 
    }

    //accessor method to get policyholder's height 
    public double getHeight()
    {
        return height; 
    }

    //accessor method to get policyholder's weight
    public double getWeight()
    {
        return weight; 
    }

    //mutator method to set policy number
    public void setPolicyNumber(int num)
    {
        number = num; 
    }

    //mutator method to set provider name 
    public void setProviderName(String proname)
    {
        providerName = proname;
    }

     //mutator method to set policyholder's first name
     public void setFirstName(String fname)
     {
         firstName = fname; 
     }
 
     //mutator method to set policyholder's last name
     public void setLastName(String lname)
     {
         lastName = lname; 
     }

     //mutator method to set policyholder's age
    public void setAge(int policyage)
    {
        age = policyage;  
    }

    //mutator method to set policyholder's smoking status
    public void setSmoke(String status)
    {
        smoke = status; 
    }

     //mutator method to set policyholder's height
     public void setHeight(double poheight)
     {
         height = poheight; 
     }
 
     //mutator method to set policyholder's weight
     public void setWeight(double poweight)
     {
         weight = poweight; 
     }

     //method to calculate and return BMI of the policy holder
     public double BMI()
     {
        double BMI = (weight*703)/ (height*height); 
        return BMI; //return BMI as a double
     }

     //method to calculate and return price of policy
     public double price(double BMI)
     {
        double price = 600; //base fee of 600
        if(age > 50) //add 75 if policyholder is over 50 years old
        {
            price+=75; 
        }
        if(smoke.length() < 6) //add 100 if policyholder is a smoker
        {
            price+=100; 
        }
        if(BMI > 35) //add calculated fee if policyholder has BMI above 35
        {
            price += (BMI - 35)*20; 
        }
        return price; 
     }
 }