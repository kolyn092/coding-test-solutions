import java.util.Arrays;
import java.util.Scanner;

// 완전 탐색 알고리즘
public class Coin {

    private static int coinChangeGreedy(int[] coins, int target) {
        // 동전을 큰 단위부터 작은 단위 순으로 정렬
        Arrays.sort(coins);
        // 거스름돈 금액을 저장할 변수 준비
        int remainCoin = target;
        // 사용된 동전 개수를 저장할 변수 초기화
        int coinCount = 0;

        // 가장 큰 단위의 동전부터 순차적으로 진행
        // 현재 동전으로 거스름돈을 최대한 많이 거슬러줌
        // 남은 거스름돈에 대해 다음으로 큰 동전으로 반복
        for (int i = coins.length - 1; i >= 0; i--) {
            coinCount += remainCoin / coins[i];  // 현재 동전으로 거슬러 줄 수 있는 개수
            remainCoin = remainCoin % coins[i]; // 남은 금액
        }

        // 남은 금액이 0이면 사용된 총 동전 개수 반환
        // 남은 금액이 0이 아니면 -1 반환
        if (remainCoin != 0) {
            return -1;
        }
        return coinCount;
    }

    private static int coinChangeBruteForce(int[] coins, int target) {
        // 동전별 사용 가능한 최대 개수 계산
        int[] maxCounts = new int[coins.length];
        for (int i = 0; i < coins.length; i++) {
            maxCounts[i] = target / coins[i];
        }

        // 최소 동전 개수를 최대값으로 초기화
        int minCoins = Integer.MAX_VALUE;

        // 모든 조합 시도 단계
        for (int i = 0; i <= maxCounts[0]; i++) {
            for (int j = 0; j <= maxCounts[1]; j++) {
                for (int k = 0; k <= maxCounts[2]; k++) {
                    for (int l = 0; l <= maxCounts[3]; l++) {
                        int currSum = (coins[0] * i) + (coins[1] * j) + (coins[2] * k) + (coins[3] * l);

                        // 목표 금액과 일치하는지 확인
                        if (currSum == target) {
                            // 일치하면 사용된 동전 개수와 현재 최소값과 비교하여 갱신
                            minCoins = Math.min(minCoins, i+j+k+l);
                        }
                    }
                }
            }
        }

        return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coins = {500, 100, 50, 10};

        // 거스름돈 금액 입력 받기
        int target = scanner.nextInt();

        // 결과 출력
        System.out.println(coinChangeGreedy(coins, target));
        //System.out.println(coinChangeBruteForce(coins, target));
    }
}
