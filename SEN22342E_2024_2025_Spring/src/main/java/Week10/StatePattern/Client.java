package Week10.StatePattern;

public class Client {
    public static void main(String[] args) {
        RecordContext r=new RecordContext();
        r.displayState();
        r.doModify();
        r.displayState();
        r.doModify();
        r.displayState();
        r.doCommit();
        r.displayState();

    }
}
