public class Days {
    public Days nextMonth;
    public Days data;
    public String todo;

    Days(String m){
        nextMonth = null;
        data = null;
        todo = m;
    }
}