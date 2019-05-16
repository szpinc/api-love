package org.szpinc.api.love;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinChange {
    /**
     * 获取找零硬币个数
     *
     * @param coinValue  硬币的面值
     * @param totalValue 需要找零的钱数
     * @return
     */
    public int coinNum(int[] coinValue, int totalValue) {
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(0);
        for (int i = 1; i <= totalValue; i++) {
            int coin = nearestCoin(i, coinValue);
            int coinNum = coins.get(i - coin) + 1;
            coins.add(coinNum);
        }
        return coins.get(totalValue);
    }

    /**
     * 获取最接近找零钱数的硬币面值
     */
    private int nearestCoin(int value, int[] coinValues) {
        int res = 0;
        int nearest = Integer.MAX_VALUE;
        for (int coinValue : coinValues) {
            if (coinValue <= value) {
                int distance = value - coinValue;
                if (distance < nearest) {
                    nearest = distance;
                    res = coinValue;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入花的数目：");
        int num = scanner.nextInt();
        if (num > 1024) {
            System.out.println("花费不能超过1024");
            return;
        }
        int[] coinValues = new int[]{64, 16, 4, 1};
        CoinChange coinChange = new CoinChange();
        int coinMinNum = coinChange.coinNum(coinValues, 1024 - num);
        System.out.println(coinMinNum);

    }
}
