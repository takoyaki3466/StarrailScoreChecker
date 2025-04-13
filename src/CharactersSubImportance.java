public enum CharactersSubImportance {



    //actualValuesHP, actualValuesDEF, actualValuesATK, percentHP, percentDEF, percentATK, critRate, critDamage, speed, breakDamage, effectHit, effectRes

    RuanMei(0.1,0.1,0,0.3,0.3,0,0,0,0.8,1,0,0),
    Jingliu(0.1,0.1,0.3,0.3,0.3,0.8,0.8,1,1,0,0,0.2),
    Feixiao(0,0,0,0,0,1.0,1.0,1.0,1.0,0,0,0);











    private final double actualValuesHP, actualValuesDEF, actualValuesATK;
    private final double percentHP, percentDEF, percentATK;
    private final double critRate, critDamage ;
    private final double speed;
    private final double breakDamage;
    private final double effectHit, effectRes;

    CharactersSubImportance(double actualValuesHP,
                         double actualValuesDEF,
                         double actualValuesATK,
                         double percentHP,
                         double percentDEF,
                         double percentATK,
                         double critRate,
                         double critDamage,
                         double speed,
                         double breakDamage,
                         double effectHit,
                         double effectRes) {
        this.actualValuesHP = actualValuesHP;
        this.actualValuesDEF = actualValuesDEF;
        this.actualValuesATK = actualValuesATK;
        this.percentHP = percentHP;
        this.percentDEF = percentDEF;
        this.percentATK = percentATK;
        this.critRate = critRate;
        this.critDamage = critDamage;
        this.speed = speed;
        this.breakDamage = breakDamage;
        this.effectHit = effectHit;
        this.effectRes = effectRes;
    }

    public double getActualValuesHP() {
        return actualValuesHP;
    }

    public double getActualValuesDEF() {
        return actualValuesDEF;
    }

    public double getActualValuesATK() {
        return actualValuesATK;
    }

    public double getPercentHP() {
        return percentHP;
    }

    public double getPercentDEF() {
        return percentDEF;
    }

    public double getPercentATK() {
        return percentATK;
    }

    public double getCritRate() {
        return critRate;
    }

    public double getCritDamage() {
        return critDamage;
    }

    public double getSpeed() {
        return speed;
    }

    public double getBreakDamage() {
        return breakDamage;
    }

    public double getEffectHit() {
        return effectHit;
    }

    public double getEffectRes() {
        return effectRes;
    }
}
