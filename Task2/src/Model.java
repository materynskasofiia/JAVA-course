/**
 *Model
 *
 * @version 1   09.02.2019
 * @author Sofiia Materynska
 */
public class Model {

    private int intNumber;

    private int topBorderOfRange=100;

    private int bottomBorderOfRange=0;


    public int getIntNumber() {
        return intNumber;
    }

    public void setIntNumber() {
        this.intNumber = (int)(Math.random()*(getTopBorderOfRange()-getBottomBorderOfRange()+1))+getBottomBorderOfRange();
    }

    public int getBottomBorderOfRange() {
        return bottomBorderOfRange;
    }

    public void setBottomBorderOfRange(int bottomBorderOfRange) {
        this.bottomBorderOfRange = bottomBorderOfRange;
    }

    public int getTopBorderOfRange() {
        return topBorderOfRange;
    }

    public void setTopBorderOfRange(int topBorderOfRange) {
        this.topBorderOfRange = topBorderOfRange;
    }
}
