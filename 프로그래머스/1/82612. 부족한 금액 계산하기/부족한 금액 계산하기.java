class Solution {
    public long solution(int price, int money, int count) {
        //long answer = (count * (count + 1) / 2 * price) - money;    
        //if (answer < 0)
        //     return 0;
        long answer = 0;
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * price;
        }
        answer = sum - money;
        if (answer < 0)
            return 0;
        return answer;
    }
}