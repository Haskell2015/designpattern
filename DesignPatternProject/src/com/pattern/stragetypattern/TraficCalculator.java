package com.pattern.stragetypattern;

/**
 * Created by Administrator on 2017/7/17.
 */
public class TraficCalculator {
    private CalculateStragety calculateStragety;

    public void setCalculateStragety(CalculateStragety calculateStragety) {
        this.calculateStragety = calculateStragety;
    }

    public int calPrice(int km) {
        return calculateStragety.caluculatePrice(km);
    }
}
