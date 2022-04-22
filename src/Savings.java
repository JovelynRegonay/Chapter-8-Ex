
public class Savings {
    float balance;
  

    public float getBalance (){
        return (balance);
    
    }
public void save (float input) {
   balance += input;

}

public void withdraw (float input){
balance-= input;
}
}

