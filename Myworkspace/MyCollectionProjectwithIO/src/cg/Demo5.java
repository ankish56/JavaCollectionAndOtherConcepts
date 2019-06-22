package cg;
import java.util.*;
import java.io.*;
import com.cg.service.*;
import com.cg.bean.*;
public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    Map<Long,Account>accmap=new TreeMap<Long,Account>();
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String choice ="";
    while(true)
    {
    System.out.println("Menu");
    System.out.println("====================");
    System.out.println("1 Create new Account");
    System.out.println("2 Print all accounts");
    System.out.println("3 Exit");
    System.out.println("Enter your choice");
    choice=br.readLine();
    switch(choice)
    {
    case "1" : int id=0;
               long mb=0L;
               String ah="";
               double bal=0.0;
          
               //Accepting and validating input for account number
               System.out.println("Enter account number");
               while(true)
               {
            	   String s_id=br.readLine();
            	   boolean ch1=Validator.validatedata(s_id, Validator.aidpattern);
            	   if(ch1==true)
            	   {
            		   try {
            			   id=Integer.parseInt(s_id);
            		       break;
            			   
            		   }
            		   catch(NumberFormatException e)
            		   {
            			   System.out.println("Account Number must be numeric. Re Enter");
            		   }
            	   }
            	   else
            	   {
            		   System.out.println("Re Enter Account Number in 3 digits");
            	   }
            	   //end of account number while
               }
               
               System.out.println("Enter mobile number");
               while(true)
               {
	                String s_mb=br.readLine();
	                boolean ch1=Validator.validatedata(s_mb, Validator.mobilepattern);
	                if(ch1==true)
	                {
		               try {
			             mb=Long.parseLong(s_mb);
		                 break;
			   
		                }
		              catch(NumberFormatException e)
		               {
			          System.out.println("Mobile Number must be numeric. Re Enter");
		               }
	                }
	                else
	                {
		              System.out.println("Re Enter Monile Number in 10 digits");
	                }
               }
	            //end of mobile number while
               
               //accepting and validating account holder
               System.out.println("Enter Accountholder name");
               ah=br.readLine();
               //accepting and validating balance
               System.out.println("Enter initial balance");
               String s_bal=br.readLine();
               bal=Double.parseDouble(s_bal);
               Account ob=new Account(id,mb,ah,bal);
               accmap.put(ob.getMobile(), ob);
    	       break;
                     
    	       
    case "2" :  Collection<Account> vc=accmap.values();
                List<Account>acclist=new ArrayList<Account>(vc);
                Collections.sort(acclist);
                for(Account o: acclist)
               {
    	           System.out.println(o);
    	           //service.printStatement(0);
               }
    	       break;
    	       
    case "3" : System.out.println("Exiting Program");
               System.exit(0);
               break;
               
    default  : System.out.println("Invalid Choice");           
    
    
    
    } // end of menu
    
    
    /*
    Account ob1=new Account(101,986724701,"Ram",25000.00);
    accmap.put(ob1.getMobile(), ob1);
    Account ob2=new Account(102,986724702,"Sham",55000.00);
    accmap.put(ob2.getMobile(), ob2);
    Account ob3=new Account(105,986724703,"Abdul",15000.00);
    accmap.put(ob3.getMobile(), ob3);
    Account ob4=new Account(103,986724702,"Ganesh",45000.00);
    accmap.put(ob4.getMobile(), ob4);
    */
    
    /*
    System.out.println(accmap);
    System.out.println(accmap.keySet());
    System.out.println("==================================================================================");
    Collection<Account> vc=accmap.values();
    List<Account>acclist=new ArrayList<Account>(vc);
    Collections.sort(acclist);
    for(Account o: acclist)
    {
    	System.out.println(o);
    }
    System.out.println("===========================sort by name");
    Comparator nc=new NameComparator();
    Collections.sort(acclist,nc);
    for(Account o:acclist)
    {
    	System.out.println(o);
    }
    System.out.println("===========================sort by balance");
    Comparator bc=new BalanceComaparator();
    Collections.sort(acclist,bc);
    for(Account o:acclist)
    {
    	System.out.println(o);
    }
    */
    
    
    
    
    /*
    Set<Account>aset=new TreeSet<Account>();
    aset.add(Account object);
    aset.add(Account object);//compareTo method
	}
	
	//sort by name then
	Comparator nc=new NameComparator();
	Set<Account> aset=new TreeSet<Account>(nc);
	aset.add(Account object); //cmppare method of NameComparator //custom sorting
	aset.add(Account object);
*/
	}
	}
}
