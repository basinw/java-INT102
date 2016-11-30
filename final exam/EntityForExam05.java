import java.text.DecimalFormat;
public class EntityForExam05 {
    DecimalFormat df = new DecimalFormat("00");
    private int hh;
    private int mm;
    private int ss;

    public EntityForExam05(){
        this(0,0,0);
    }

    public EntityForExam05(int hh, int mm, int ss){
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }

    public void timer(int h, int m){
        this.hh = h;
        this.mm = m;
        this.ss = 59;
    }

    public void start(){
        for(int i=hh-1; i>=0; i--){
            for(int j=mm-1; j>=0; j--){
                  for(int k=ss; k>=0; k--){
                        System.out.println(df.format(i)+":"+df.format(j)+":"+df.format(k));
                  }
            }
        }
    }

}
