package com.Bridgelabz.Logical_Problems;

import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
	public static void main(String[] args) {
        int winnerCouponNo=123456;
        int couponNumber=0;
        int couponCount = 0;

        while (couponNumber != winnerCouponNo){
            couponNumber=generateCoupon();
            couponCount++;
//            System.out.println(couponNumber);
        }
        System.out.println("winner coupon : "+couponNumber);
        System.out.println("No of coupons to match winner:"+couponCount);
    }

    static int generateCoupon(){
        int num=0;
        Random random=new Random();
        while (num<100000){
            num=random.nextInt(999999);
        }
        return num;
    }
}
