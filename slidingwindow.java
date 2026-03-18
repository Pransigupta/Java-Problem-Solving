class Main {
    public static void main(String[] args) {
        int user[] = {10, 20, 30, 40, 50};
        int days = 3;
        int n = user.length;

        int windowsum = 0;

        for(int i = 0; i < days; i++) {
            windowsum += user[i];
        }

        System.out.println("windowsum " + windowsum);

        for(int i = days; i < n; i++) {
            windowsum = windowsum - user[i - days] + user[i];
            System.out.println("windowsum " + windowsum);
        }
    }
}