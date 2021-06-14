/**
 * @author Kevin Juan (1972002)
 */

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class TimeConverter {
    private int second;
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    public TimeConverter(){

    }

    public TimeConverter(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String showTime() throws ParseException {
        String j = String.valueOf(Math.abs(second / 3600));
        String m = String.valueOf(Math.abs((second % 3600) / 60));
        String d = String.valueOf(Math.abs(second % 60));
        String dateInString = j+":"+m+":"+d;
        Date date = sdf.parse(dateInString);
        String akhir = sdf.format(date);
        return akhir;
    }
}
