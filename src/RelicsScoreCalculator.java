public class RelicsScoreCalculator {
    private final int actualValuesHP = 252, actualValuesDEF = 126, actualValuesATK = 126;
    private final double percentHP = 0.259, percentDEF = 0.324, percentATK = 0.259;
    private final double critRate = 0.194, critDamage = 0.388;
    private final double speed = 15;
    private final double breakDamage = 0.388;
    private final double effectHit = 0.259, effectRes = 0.259;
    CharactersMainImportance mainImportance = new CharactersMainImportance();

    public RelicsScoreCalculator(){
    }

    public double getMainScore(double level, int characterID, int RelicsType, String affixType){
        CharacterSelect(characterID);
        double mainScore = (double) Math.round((level + 1) / 16 * MainTypeImportanceSelect(RelicsType, affixType) * 100 * 10) /10;
        ScoreData.data.addMainScore(mainScore);
        return mainScore;
    }

    public double getSubScore(double value, int CharacterID, String type){
        CharactersSubImportance subImportance = CharacterSelect(CharacterID);
        double maxValue = SubTypeSelect(type);
        double subScore = (double) Math.round((value / maxValue) * SubTypeImportanceSelect(subImportance, type) * 100 * 10) /10;
        ScoreData.data.addSubScore(subScore);
        return subScore;
    }

    public CharactersSubImportance CharacterSelect(int characterID){
        mainImportance.reset();
        switch (characterID){
            //case 1001 -> CharactersSubImportance.March7th;a
            //case 1002 -> CharactersSubImportance.DanHeng;
            //case 1003 -> CharactersSubImportance.Himeko;
            //case 1004 -> CharactersSubImportance.Welt;
            //case 1005 -> CharactersSubImportance.Kafka;
            //case 1006 -> CharactersSubImportance.SilverWolf;
            //case 1008 -> CharactersSubImportance.Arlan;
            //case 1009 -> CharactersSubImportance.Asta;
            //case 1010 -> CharactersSubImportance.FemaleDestructionMCOld;
            //case 1011 -> CharactersSubImportance.???;
            //case 1013 -> CharactersSubImportance.Herta;
            //case 1101 -> CharactersSubImportance.Bronya;
            //case 1102 -> CharactersSubImportance.Seele;
            //case 1103 -> CharactersSubImportance.Serval;
            //case 1104 -> CharactersSubImportance.Gepard;
            //case 1105 -> CharactersSubImportance.Natasha;
            //case 1106 -> CharactersSubImportance.Pela;
            //case 1107 -> CharactersSubImportance.Clara;
            //case 1108 -> CharactersSubImportance.Sampo;
            //case 1109 -> CharactersSubImportance.Hook;
            //case 1110 -> CharactersSubImportance.Lynx;
            //case 1111 -> CharactersSubImportance.Luka;
            //case 1112 -> CharactersSubImportance.Topaz;
            //case 1201 -> CharactersSubImportance.Qingque;
            //case 1202 -> CharactersSubImportance.Tingyun;
            //case 1203 -> CharactersSubImportance.Luocha;
            //case 1204 -> CharactersSubImportance.JingYuan;
            //case 1205 -> CharactersSubImportance.Blade;
            //case 1206 -> CharactersSubImportance.Sushang;
            //case 1207 -> CharactersSubImportance.Yukong;
            //case 1208 -> CharactersSubImportance.FuXuan;
            //case 1209 -> CharactersSubImportance.Yanqing;
            //case 1210 -> CharactersSubImportance.Guinaifen;
            //case 1211 -> CharactersSubImportance.Bailu;
            case 1212 -> {mainImportance.jingliu();return CharactersSubImportance.Jingliu;}
            //case 1213 -> CharactersSubImportance.DanHengImbibitorLunae;
            //case 1214 -> CharactersSubImportance.Xueyi;
            //case 1215 -> CharactersSubImportance.Hanya;
            //case 1217 -> CharactersSubImportance.Huohuo;
            //case 1218 -> CharactersSubImportance.Jiaoqiu;
            case 1220 -> {mainImportance.feixiao();return CharactersSubImportance.Feixiao;}
            //case 1221 -> CharactersSubImportance.Yunli;
            //case 1222 -> CharactersSubImportance.Lingsha;
            //case 1223 -> CharactersSubImportance.Moze;
            //case 1224 -> CharactersSubImportance.March7thHunt;
            //case 1225 -> CharactersSubImportance.Fugue;
            //case 1301 -> CharactersSubImportance.Gallagher;
            //case 1302 -> CharactersSubImportance.Argenti;
            case 1303 -> {mainImportance.ruanMei();return CharactersSubImportance.RuanMei;}
            //case 1304 -> CharactersSubImportance.Aventurine;
            //case 1305 -> CharactersSubImportance.DrRatio;
            //case 1306 -> CharactersSubImportance.Sparkle;
            //case 1307 -> CharactersSubImportance.BlackSwan;
            //case 1308 -> CharactersSubImportance.Acheron;
            //case 1309 -> CharactersSubImportance.Robin;
            //case 1310 -> CharactersSubImportance.Sam;
            //case 1311 -> CharactersSubImportance.Screwllum;
            //case 1312 -> CharactersSubImportance.Misha;
            //case 1313 -> CharactersSubImportance.Sunday;
            //case 1314 -> CharactersSubImportance.Jade;
            //case 1315 -> CharactersSubImportance.Boothill;
            //case 1316 -> CharactersSubImportance.SamAgain;
            //case 1317 -> CharactersSubImportance.Rappa;
            //case 1319 -> CharactersSubImportance.MrReca;
            //case 1401 -> CharactersSubImportance.TheHerta;
            //case 1402 -> CharactersSubImportance.Aglaea;
            //case 1403 -> CharactersSubImportance.Tribbie;
            //case 1404 -> CharactersSubImportance.Mydei;
            //case 1405 -> CharactersSubImportance.Anaxa;
            //case 1406 -> CharactersSubImportance.Cipher;
            //case 1407 -> CharactersSubImportance.Castorice;
            //case 1408 -> CharactersSubImportance.Phainon;
            //case 1409 -> CharactersSubImportance.Hyacine;

            //case 8001-> CharactersSubImportance.DestructionMaleMC;
            //case 8002-> CharactersSubImportance.DestructionFemaleMC;
            //case 8003-> CharactersSubImportance.PreservationMaleMC;
            //case 8004-> CharactersSubImportance.PreservationFemaleMC;
            //case 8005-> CharactersSubImportance.HarmonyMaleMC;
            //case 8006-> CharactersSubImportance.HarmonyFemaleMC;
            //case 8007-> CharactersSubImportance.RemembranceMaleMC;
            //case 8008-> CharactersSubImportance.RemembranceFemaleMC;
            //case 9982-> CharactersSubImportance.AetherDivideMC;
            default -> {return null;}
        }
    }
    public double SubTypeSelect(String type){
        return switch (type) {
            case "HPDelta" -> actualValuesHP;
            case "DefenceDelta" -> actualValuesDEF;
            case "AttackDelta" -> actualValuesATK;

            case "HPAddedRatio" -> percentHP;
            case "DefenceAddedRatio" -> percentDEF;
            case "AttackAddedRatio" -> percentATK;

            case "CriticalChanceBase" -> critRate;
            case "CriticalDamageBase" -> critDamage;

            case "SpeedDelta" -> speed;

            case "StatusProbabilityBase" -> effectHit;
            case "StatusResistanceBase" -> effectRes;
            case "BreakDamageAddedRatioBase" -> breakDamage;
            default -> 0.0;
        };
    }
    public double SubTypeImportanceSelect(CharactersSubImportance importance, String type){
        return switch (type) {
            case "HPDelta" -> importance.getActualValuesHP();
            case "DefenceDelta" -> importance.getActualValuesDEF();
            case "AttackDelta" -> importance.getActualValuesATK();

            case "HPAddedRatio" -> importance.getPercentHP();
            case "DefenceAddedRatio" -> importance.getPercentDEF();
            case "AttackAddedRatio" -> importance.getPercentATK();

            case "CriticalChanceBase" -> importance.getCritRate();
            case "CriticalDamageBase" -> importance.getCritDamage();

            case "SpeedDelta" -> importance.getSpeed();

            case "StatusProbabilityBase" -> importance.getEffectHit();
            case "StatusResistanceBase" -> importance.getEffectRes();
            case "BreakDamageAddedRatioBase" -> importance.getBreakDamage();
            default -> 0;
        };
    }
    public double MainTypeImportanceSelect(int RelicsType, String affixType){
        return switch (RelicsType) {
            case 1 -> mainImportance.headActualValuesHP;
            case 2 -> mainImportance.armActualValuesATK;
            case 3 -> switch (affixType) {
                case "CriticalChanceBase" -> mainImportance.torsoCritRate;
                case "CriticalDamageBase" -> mainImportance.torsoCritDamage;
                case "StatusProbabilityBase" -> mainImportance.torsoEffectHit;
                case "StatusResistanceBase" -> mainImportance.torsoEffectRes;
                case "heal" -> 1.0;
                case "HPAddedRatio" -> mainImportance.torsoHP;
                case "DefenceAddedRatio" -> mainImportance.torsoDEF;
                case "AttackAddedRatio" -> mainImportance.torsoATK;
                default -> 0.0;
            };
            case 4 -> switch (affixType) {
                case "SpeedDelta" -> mainImportance.legSpeed;
                case "HPAddedRatio" -> mainImportance.legHP;
                case "DefenceAddedRatio" -> mainImportance.legDEF;
                case "AttackAddedRatio" -> mainImportance.legATK;
                default -> 0.0;
            };
            case 5 -> switch (affixType) {
                case "FireAddedRatio" -> mainImportance.orbFIRE;
                case "IceAddedRatio" -> mainImportance.orbICE;
                case "WindAddedRatio" -> mainImportance.orbWIND;
                case "LightningAddedRatio" -> mainImportance.orbTHUNDER;
                case "QuantumAddedRatio" -> mainImportance.orbQUANTUM;
                case "ImaginaryAddedRatio" -> mainImportance.orbIMAGINARY;
                case "PhysicalAddedRatio" -> mainImportance.orbPHYSICS;
                case "HPAddedRatio" -> mainImportance.orbHP;
                case "DefenceAddedRatio" -> mainImportance.orbDEF;
                case "AttackAddedRatio" -> mainImportance.orbATK;
                default -> 0.0;
            };
            case 6 -> switch (affixType) {
                case "BreakDamageAddedRatioBase" -> mainImportance.ConnectingRopeBreakDamage;
                case "SPRatioBase" -> mainImportance.ConnectingRopeEP;
                case "HPAddedRatio" -> mainImportance.ConnectingRopeHP;
                case "DefenceAddedRatio" -> mainImportance.ConnectingRopeDEF;
                case "AttackAddedRatio" -> mainImportance.ConnectingRopeATK;
                default -> 0.0;
            };
            default -> 0.0;
        };
    }
}