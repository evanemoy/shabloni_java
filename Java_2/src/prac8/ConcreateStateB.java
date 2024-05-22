package prac8;

public class ConcreateStateB implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Выполнено действие в состоянии B.");
        context.setState(new ConcreateStateA());
    }
}
