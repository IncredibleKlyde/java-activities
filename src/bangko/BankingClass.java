package bangko;

public class BankingClass {
    
        int accno;
        String name;
        int defaultbalance;
        int pass;
        
    
    public boolean accountConfirmation (int acc, int pn ){
        if(accno == acc && pass == pn){
            return true;
        }else{
            return false;
        }
        
    }
        public void setAccountNo(int accno){
        this.accno = accno;
        }
        
        public int getAccountNo() {
            return accno;
        }
        
        public int viewBalance(){
        return defaultbalance;
        }
        
        public void setPass(int pass) {
            this.pass = pass;
        }
        
        public int getPass() {
            return pass;
        }       
}
