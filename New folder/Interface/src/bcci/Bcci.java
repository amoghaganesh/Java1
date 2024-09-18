package bcci;

public class Bcci {
    private CricketRule cricketRule;

    public void setCricketRule(CricketRule cricketRule){

        this.cricketRule=cricketRule;
    }

    public void check(){

        System.out.println("running check");
        if(cricketRule != null){
            System.out.println("cricketrule");
            cricketRule.powerPlay();
        }else{
            System.out.println("cricketrule");
        }
    }
}
