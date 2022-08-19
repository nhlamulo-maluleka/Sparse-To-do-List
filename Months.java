public class Months{
    public Months nextDay;
    public int value;
    public Days node;

    Months(int v, Days n){
        value = v;
        nextDay = null;
        node = n;
    }    
}