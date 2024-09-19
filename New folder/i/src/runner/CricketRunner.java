package runner;

import bcci.Bcci;
import bcci.CricketRule;
import bcci.KACricketRule;

public class CricketRunner {
    public static void main(String[] args) {

        CricketRule cricketRule= (CricketRule) new KACricketRule();
            Bcci bcci=new Bcci();
        Object cricketrule = null;
        bcci.setCricketRule(CricketRule cricketrule);
            bcci.check();
        }
    }

