package com.pattern.stragetypattern;

/**
 * Created by Administrator on 2017/7/17.
 */
public class TestMain {
    public static void main(String[] args) {
        TraficCalculator traficCalculator = new TraficCalculator();
        traficCalculator.setCalculateStragety(new SubwayStrategy());
        System.out.println("公交车20km价格：" + traficCalculator.calPrice(25));
    }
}
