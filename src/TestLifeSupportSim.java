import java.util.ArrayList;

class V2Radiator{
    V2Radiator (ArrayList list){
        for (int x=0;x<5;x++){
            list.add(new SimUnit("V2Radiator"));
        }
    }
}

class V3Radiator extends V2Radiator{
    V3Radiator(ArrayList lglist){
        super(lglist);
        for (int g=0;g<10;g++){
            lglist.add(new SimUnit("V3Radiator"));
        }
    }
}

class RetentionBot{
    RetentionBot(ArrayList rlist){
        rlist.add(new SimUnit("Retention"));
    }
}

public class TestLifeSupportSim {
    public static void main(String [] args){
        ArrayList aList = new ArrayList();//新建ArrayList aList
        V2Radiator v2 = new V2Radiator(aList);//新建对象v2
        V3Radiator v3 = new V3Radiator(aList);//新建对象v3
        for (int z=0;z<20;z++){
            RetentionBot ret = new RetentionBot(aList);
        }
    }
}

class SimUnit{
    String botType;
    SimUnit(String type){
        botType = type;
    }
    int powerUse(){
        if ("Retention".equals(botType)){
            return 2;
        }else {
            return 4;
        }
    }
}