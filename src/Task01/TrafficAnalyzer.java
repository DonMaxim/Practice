package Task01;

import java.util.Arrays;
import java.util.Random;

public class TrafficAnalyzer {
    public static void main(String[] args) {
        int [] traffic = new int[10];
        Random random = new Random();
        for (int i = 0; i < traffic.length; i++) {
            traffic[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(traffic));
        int maxTraffic = getMaxTraffic(traffic);
        System.out.printf("Максимальный объем трафика: %d", maxTraffic);
    }
    private static int getMaxTraffic(int[] traffic) {
        int maxTraffic = 0;
        for (int i : traffic) {
            maxTraffic = i > maxTraffic ? i : maxTraffic;
        }
        return maxTraffic;
    }
}