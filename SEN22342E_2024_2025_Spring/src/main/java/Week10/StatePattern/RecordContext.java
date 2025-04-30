package Week10.StatePattern;

public class RecordContext {
    private RecordState state;
    public RecordContext() {
        this.state = new NewState();
    }

    public void setState(RecordState state) {
        this.state = state;
    }

    public RecordState getState() {
        return state;
    }
    void doModify(){
        state.doModify(this);
    }
    void doCommit(){
        state.doCommit(this);
    }
    public void displayState(){
        System.out.println(state.getClass().getSimpleName());
    }

}
