// we can use if else and switch in enum and display something based on the condition.
enum Status {
    Running, Failed, Pending, Success;
}

public class enumlec2 {
    public static void main(String[] args) {
        Status s = Status.Pending;
        // by switch
        switch (s) {
            case Running:
                System.out.println("in progress");
                break;
            case Failed:
                System.out.println("try again");
                break;
            case Pending:
                System.out.println("please wait");
                break;

            default:
                System.out.println("All done");
                break;
        }

        // if (s == Status.Running) {
        // System.out.println("in progress");
        // } else if (s == Status.Failed) {
        // System.out.println("try again");
        // } else if (s == Status.Pending) {
        // System.out.println("please wait");
        // } else
        // System.out.println("all done");

    }
}
