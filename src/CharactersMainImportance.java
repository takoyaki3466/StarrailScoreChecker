public class CharactersMainImportance {

    double headActualValuesHP = 1;
    double armActualValuesATK = 1;

    double torsoCritRate=0, torsoCritDamage=0, torsoEffectHit=0, torsoEffectRes=0, torsoHealing=0;
    double torsoHP=0, torsoDEF=0, torsoATK=0;

    double legHP=0, legDEF=0, legATK=0, legSpeed=0;

    double orbFIRE=0, orbICE=0, orbTHUNDER,orbWIND=0, orbIMAGINARY=0, orbQUANTUM=0, orbPHYSICS=0;
    // 炎 氷 雷 虚数 量子 物理
    double orbHP=0, orbDEF=0, orbATK=0;

    double ConnectingRopeBreakDamage=0, ConnectingRopeEP=0;
    double ConnectingRopeHP=0, ConnectingRopeDEF=0, ConnectingRopeATK=0;

    public CharactersMainImportance(){

    }
    public void reset(){
        headActualValuesHP = 1;
        armActualValuesATK = 1;

        torsoCritRate = 0;
        torsoCritDamage = 0;
        torsoEffectHit = 0;
        torsoEffectRes = 0;
        torsoHealing = 0;
        torsoHP = 0;
        torsoDEF = 0;
        torsoATK = 0;

        legHP = 0;
        legDEF = 0;
        legATK = 0;
        legSpeed = 0;

        orbFIRE = 0;
        orbICE = 0;
        orbTHUNDER = 0;
        orbWIND = 0;
        orbIMAGINARY = 0;
        orbQUANTUM = 0;
        orbPHYSICS = 0;
        // 炎 氷 雷 虚数 量子 物理

        orbHP = 0;
        orbDEF = 0;
        orbATK = 0;

        ConnectingRopeBreakDamage = 0;
        ConnectingRopeEP = 0;
        ConnectingRopeHP = 0;
        ConnectingRopeDEF = 0;
        ConnectingRopeATK = 0;
    }
    public void feixiao(){
        torsoCritRate = 1;
        torsoCritDamage = 1;
        legATK = 1;
        legSpeed = 1;
        orbWIND = 1;
        orbATK = 0.5;
        ConnectingRopeATK = 1;
    }
    public void jingliu() {
        torsoCritDamage = 1;
        torsoCritRate = 0.8;
        torsoATK = 0.8;
        legSpeed = 1;
        legATK = 0.8;
        orbICE = 1;
        orbATK = 0.8;
        ConnectingRopeEP = 1;
        ConnectingRopeATK = 1;
    }
    public void ruanMei(){
        torsoHP = 1;
        torsoDEF = 1;
        legSpeed = 1;
        legHP= 0.3;
        legDEF = 0.3;
        orbHP = 1;
        orbDEF = 1;
        ConnectingRopeEP = 1;
        ConnectingRopeBreakDamage = 0.8;
        ConnectingRopeHP = 0.3;
        ConnectingRopeDEF = 0.3;
    }
}
