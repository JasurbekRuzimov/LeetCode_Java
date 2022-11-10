public class MetroTickets {

    public static int MinSummMaxTicketsInStations(int[] stations) {
        int minSumm = 0;
        int maxTickets = 0;
        for (int i = 0; i < stations.length; i++) {
            if (stations[i] < minSumm) {
                minSumm = stations[i];
            }
            if (stations[i] > maxTickets) {
                maxTickets = stations[i];
            }
        }
        return maxTickets - minSumm;
    }
    public static void main(String[] args) {

    }

}
