public class TestPrepaid {
  public static void main(String[] args) {
    Prepaid p1 = new Prepaid("0909359455", 100, "B");
    p1.callUsage(0,60,1);//pay 38 ####### 100 - 38 = 62.-   <---balance 62
    p1.callUsage(1,36,20);//pay 56  ###### 62 - 56 = 6.-    <---balance 6
    p1.increaseBalance(4);//6 + 4 = 10    <---balance 10
    //total 02:36:21
    System.out.println("::show detail P1");
    System.out.print(p1);

    System.out.println("\n-----------------------\n::show detail P2");
    Prepaid p2 = new Prepaid("0633696662", 200, "A");
    p2.callUsage(2,0,2);//pay 90.75 ###### 200 - 90.75 = 109.25.-   <---balance 109.25
    p2.decreaseBalance(9.25);//109.25 - 9.25 = 100     <---balance 100
    //total use 02:00:02
    System.out.print(p2);
  }
}
