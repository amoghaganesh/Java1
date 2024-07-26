public class Games {
    public static void main(String[] args) {
        String[] games = new String[10];
        games[0] = "Cricket";
        games[1] = "Football";
        games[2] = "Tennis";
        games[3] = "Basketball";
        games[4] = "Valorent";
        games[5] = "Badminton";
        games[6] = "Chess";
        games[7] = "Volleyball";
        games[8] = "CS GO";
        games[9] = "BGMI";

        for (int i = games.length-1; i >=0 ; i--) {
            System.out.println(games[i]);
        }
    }
}
