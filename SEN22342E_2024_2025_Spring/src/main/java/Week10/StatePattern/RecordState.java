package Week10.StatePattern;

public interface RecordState {
    void doCommit(RecordContext r);
    void doModify(RecordContext r);
}
