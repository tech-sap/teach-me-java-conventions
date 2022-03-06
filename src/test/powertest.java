package powerpackage;


import org.junit.test;

public class Powertest {
    @Test
    public void oneRaisedToOneIsOnew() {
        assert powerfinder.OF(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        assert powerfinder.OF(2,1) == 2;
    }

    @Test
    public void twoPowerTwoIsFour() {
        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void threePowerTwoIsNine() {
        assert powerfinder.OF(3, 2) == 3*3;
    }
}
