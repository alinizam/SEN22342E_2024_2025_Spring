package Week10.StatePattern;

public class InsertState implements RecordState {
    @Override
    public void doCommit(RecordContext r) {
        r.setState(new QueryState());
    }

    @Override
    public void doModify(RecordContext r) {
        System.out.println("Cannot modify a record that is not inserted");
    }
}
