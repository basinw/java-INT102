import java.text.DecimalFormat;
public class Prepaid {
    DecimalFormat df = new DecimalFormat("00");
    private double balance;
    private String phoneNumber;
    private String plan;
    private int totalUsageHour;
    private int totalUsageMin;
    private int totalUsageSec;

    //plan "A" 0.75 baht per minute
    //plan "B" first 3 minutes 3 baht per minute ----------later 0.5 baht per minute
    public Prepaid(String phoneNumber, int balance, String plan){
        this.phoneNumber = phoneNumber;
        this.balance = balance;
        this.plan = plan;
        this.totalUsageHour = 0;
        this.totalUsageMin = 0;
        this.totalUsageSec = 0;
    }

    public void callUsage(int h, int m, int s){

        this.totalUsageHour += h;
        this.totalUsageMin += m;
        this.totalUsageSec += s;

        //ceil total usage
        if(totalUsageSec>59){
          totalUsageMin += totalUsageSec/60;
          totalUsageSec = totalUsageSec%60;
        }
        if(totalUsageMin>59){
          totalUsageHour += totalUsageMin/60;
          totalUsageMin = totalUsageMin%60;
        }

        //Ceil seconds
        if(s>0){
            m++;
        }

        //cal Price
        if(plan.equals("A")){
            balance -= (h*60+ m)*0.75;
        }else if(plan.equals("B")){
            if(h>0||m>3){
                balance -= (h*60+m-3)*0.5 + 9;
            }else{
                balance -= m*3;
            }
        }

    }

    public void decreaseBalance(double usage){
        if(usage <= balance){
            balance -= usage;
        }
    }

    public void increaseBalance(double topup){
        balance += topup;
    }

    public String toString(){

        return "number is "+phoneNumber
              +"\nPlan: "+plan
              +"\nBalance : "+balance
              +"\nTotal usage: "+df.format(totalUsageHour)+":"+df.format(totalUsageMin)+":"+df.format(totalUsageSec);

    }

}
