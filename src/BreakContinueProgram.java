public class BreakContinueProgram {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i == 45)
                continue;//this skips the below code so output will be 45,46 end 47
            if (i == 45)
                break;

            System.out.println("end");
        }

    }
}
