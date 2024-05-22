package prac8;

public class ConcreateStateA implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Выполнено действие в состоянии А.");
        context.setState(new ConcreateStateB());
    }
}
