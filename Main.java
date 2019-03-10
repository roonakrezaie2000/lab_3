import org.clock.logic.ClockLogic;
import org.clock.logic.Timezone;
import org.clock.ui.ClockUI;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Timezone tz1 = new Timezone(3, 30, 1);
        Timezone tz2 = new Timezone(0, 5, 0);
        org.clock.ui.ClockUI cui = new ClockUI(11, 29, 30);
        ClockLogic clog = new ClockLogic(11, 29, 30);
        org.clock.ui.ClockUI cui1 = new ClockUI(11, 29, 30);
        ClockLogic clog1 = new ClockLogic(11, 29, 30 ,tz1 );
        org.clock.ui.ClockUI cui2 = new ClockUI(11, 29, 30);
        ClockLogic clog2 = new ClockLogic(11, 29, 30 , tz2);

        while (true) {

            clog.tik(1);
            clog1.tik(1);
            clog2.tik(1);
            cui.setClock(clog.getHour(), clog.getMinute(), clog.getSecond());
            cui1.setClock(clog1.getHour(),clog1.getMinute(),clog1.getSecond());
            cui2.setClock(clog2.getHour(),clog2.getMinute(),clog2.getSecond());
            TimeUnit.SECONDS.sleep(1);

        }
    }
 /*  public static void main(String[] args) {
       ClockLogic ClockLogic = new ClockLogic(1,2,3);
       System.out.println(ClockLogic.getSecond() == 3);
       System.out.println(ClockLogic.getMinute() == 2);
       System.out.println(ClockLogic.getHour() == 1);
       ClockLogic.setClock(10,20,30);
       System.out.println(ClockLogic.getSecond() == 30);
       System.out.println(ClockLogic.getMinute() == 20);
       System.out.println(ClockLogic.getHour() == 10);
       ClockLogic.tik(1);
       System.out.println(ClockLogic.getSecond() == 31);
       System.out.println(ClockLogic.getMinute() == 20);
       System.out.println(ClockLogic.getHour() == 10);
       ClockLogic.setClock(10,20,0);
       ClockLogic.tik(100);
       System.out.println(ClockLogic.getSecond() == 40);
       System.out.println(ClockLogic.getMinute() == 21);
       System.out.println(ClockLogic.getHour() == 10);
       ClockLogic clog = new ClockLogic(11, 29, 30);
       org.clock.ui.ClockUI cui1 = new ClockUI(11, 29, 30);
   }*/
}