package Week10.StatePattern;

import com.sun.security.jgss.GSSUtil;

public class NewState implements RecordState {
    @Override
    public void doCommit(RecordContext r) {
        System.out.println( "New record does not need  to be committed");
    }

    @Override
    public void doModify(RecordContext r) {
        r.setState(new InsertState());
    }
}
