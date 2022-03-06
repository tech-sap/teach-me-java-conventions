package powerpackage;


import org.junit.test;

public class Powertest {
    @Test
    public void oneRaisedToOneIsOnew() {
        assert PowerFinder.of(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert PowerFinder.of(2,1) == 2;
    }

    @Test
    public void twoPowerTwoIsFour() {
        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void threePowerTwoIsNine() {
        assert PowerFinder.of(3, 2) == 3*3;
    }
}
