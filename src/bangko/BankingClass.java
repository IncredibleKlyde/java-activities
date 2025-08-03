package bangko;

public class BankingClass {
    
        int accno = 1;
        String name;
        int defaultbalance;
        int pass = 2004;
        
    
    public boolean accountConfirmation (int acc, int pn ){
        if(accno == acc && pass == pn){
            return true;
        }else{
            return false;
        }
        
    }
        public int setAccount(){
        return accno;
        }
        
        public int viewBalance(){
        return defaultbalance;
        
        
        
        }
        
    
    
    
        
        
}
