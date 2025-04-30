package Week10.StatePattern;

public class QueryState implements RecordState {
    @Override
    public void doCommit(RecordContext r) {
        System.out.println("Already ");
    }

    @Override
    public void doModify(RecordContext r) {
        r.setState(new UpdateState());
    }
}
