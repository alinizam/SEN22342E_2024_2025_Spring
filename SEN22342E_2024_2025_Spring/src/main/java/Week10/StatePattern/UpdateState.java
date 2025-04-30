package Week10.StatePattern;

public class UpdateState implements RecordState {
    @Override
    public void doCommit(RecordContext r) {
        r.setState(new QueryState());
    }

    @Override
    public void doModify(RecordContext r) {
        System.out.println("Already modified");
    }
}
