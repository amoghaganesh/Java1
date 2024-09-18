package interface1;

public class PgImpli implements PGRule{


    @Override
    public double costPerMonth() {
        return 6000;
    }

    @Override
    public boolean wifi() {
        return true;
    }
}
