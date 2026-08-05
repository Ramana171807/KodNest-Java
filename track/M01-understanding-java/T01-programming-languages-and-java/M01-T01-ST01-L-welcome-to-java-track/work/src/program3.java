class program3 {
    public static void main(String[] args) {

        int roundCode = 4;
        int attemptsUsed = 2;
        int maxAttempts = 3;

        String round;
        switch (roundCode) {
            case 1:
                round = "Aptitude Round";
                break;
            case 2:
                round = "Technical Round";
                break;
            case 3:
                round = "HR Round";
                break;
            case 4:
            case 5:
                round = "Final Review";
                break;
            default:
                round = "Invalid Round";
        }

        String status = (attemptsUsed < maxAttempts)
                ? "Attempt Available"
                : "Attempt Limit Reached";

        System.out.println("Current Round: " + round);
        System.out.println("Attempt Status: " + status);
    }
}