package Week10.StatePatternNotUsed;

public class StateClient {
    public static void main(String[] args) {
        String state="";
        String action="";
        if (state.equals("NEW") && action.equals("SUBMIT") ){
            System.out.println("Nothing happened");
        }else if (state.equals("")){
            //Do something

        }
    }
}
