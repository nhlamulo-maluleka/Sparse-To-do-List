public class Implementation {
    public Months[] months;
    public Days[] days;

    Implementation(){
        months = new Months[12];
        days = new Days[31];

        for(int i = 0; i < 12; i++)
            months[i] = null;

        for(int i = 0; i < 31; i++)
            days[i] = null;
    }

    public void addToDo(String todo, int day){
        Days newNode = new Days(todo);

        if(days[day] == null)
            days[day] = newNode;
        else{
            Days nodeptr = days[day];
            while(nodeptr.nextMonth != null){
                nodeptr = nodeptr.nextMonth;
            }

            nodeptr.nextMonth = newNode;
        }
    }

    public void showTodo(int day){
        if(days[day] == null)
            System.out.println("You have no activities for this day!");
        else{
            Days nodeptr = days[day];
            while(nodeptr != null){
                System.out.print("-> " + nodeptr.todo + "\n");
                nodeptr = nodeptr.nextMonth;
            }
        }
    }
}