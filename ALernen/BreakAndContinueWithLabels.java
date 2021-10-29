package ALernen;

public class BreakAndContinueWithLabels {
    public static void main(String[] args) {
        heaven: while (true) {
            hell: while (true)
                break /* continue */ hell;
            System.out.println( "hell" );
            break heaven;
        }
        System.out.println("heaven");
    }
}
