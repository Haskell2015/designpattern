package com.pattern.decoratepattern;

public class HighScoreDecorator  extends AbsDecorateSchoolReport {
    public HighScoreDecorator(AbsSchoolReport absSchoolReport) {
        super(absSchoolReport);
    }

    private void reportHighScore(){
        System.out.println("最高分为98分");
    }
    @Override
    void report() {
        this.reportHighScore();
        super.report();
    }
}
