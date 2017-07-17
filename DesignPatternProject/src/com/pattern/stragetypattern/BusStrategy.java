package com.pattern.stragetypattern;

/**
 * Created by Administrator on 2017/7/17.
 */
public class BusStrategy implements CalculateStragety {
    @Override
    public int caluculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraTotal % 5;
        return fraction > 0 ? ++price : price;
    }
}
