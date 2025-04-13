import com.fasterxml.jackson.databind.JsonNode;

import java.util.Arrays;

public class JsonManagement {
    private final String UID;
    private final MihomoAPI mihomoAPI;
    private final RelicsScoreCalculator calculator;

    JsonManagement(Language language, String UID) {
        this.UID = UID;
        this.mihomoAPI = new MihomoAPI(language, UID);
        this.calculator = new RelicsScoreCalculator();
    }

    public void AllDepth() throws Exception {
        JsonNode node = mihomoAPI.getDefault(UID);
        System.out.println(node);
    }

    public void GetAllCharacters() throws Exception {
        JsonNode node = mihomoAPI.getDefault(UID).path("characters");
        for (int i = 0; i <= 7 ; i++) {
            JsonNode nodeCharacter_i = node.path(i).path("name");
            System.out.print(i + ":" + nodeCharacter_i + ", ");
        }
        System.out.println();
    }

    public void CharacterRelics(int iArray) throws Exception {
        JsonNode node = mihomoAPI.getDefault(UID).path("characters");
        JsonNode nodeCharacterID = node.path(iArray).path("id");
        JsonNode nodeCharacterName = node.path(iArray).path("name");
        int iCharacterID = nodeCharacterID.asInt();

        JsonNode nodeCharacterRelics = node.path(iArray).path("relics");

        System.out.println("characterName : " + nodeCharacterName);
        System.out.println("RelicsDetails");

        for (int i = 0; i <= 5; i++) {
            //遺物番号
            JsonNode nodeAllRelics = nodeCharacterRelics.path(i);

            //遺物の詳細
            JsonNode name = nodeAllRelics.path("name");
            JsonNode type = nodeAllRelics.path("type");
            int iType = type.asInt();

            JsonNode rarity = nodeAllRelics.path("rarity");
            JsonNode level = nodeAllRelics.path("level");
            double dLevel = level.asDouble();

            //メインステータスの詳細
            JsonNode nodeMainAffix = nodeAllRelics.path("main_affix");
            JsonNode mainType = nodeMainAffix.path("type");
            String sMainType = mainType.asText();

            JsonNode mainName = nodeMainAffix.path("name");
            JsonNode mainDisplay = nodeMainAffix.path("display");

            double mainScore = calculator.getMainScore(dLevel, iCharacterID, iType, sMainType);

            System.out.println("name : " + name
                    + " rarity : " + rarity
                    + " level : " + level
                    + "\n"
                    + "    mainName : " + mainName
                    + " +" + mainDisplay
                    + " score : " + mainScore
                    + "\n"
            );

            for (int k = 0; k <= 3; k++) {
                JsonNode nodeSubAffix = nodeAllRelics.path("sub_affix").path(k);
                //サブステータスの詳細
                JsonNode nodeRelicsSubType = nodeSubAffix.path("type");
                String sSubType = nodeRelicsSubType.asText();

                JsonNode nodeRelicsSubName = nodeSubAffix.path("name");
                JsonNode nodeRelicsSubValue = nodeSubAffix.path("value");
                double dValue = nodeRelicsSubValue.asDouble();

                JsonNode nodeRelicsSubDisplay = nodeSubAffix.path("display");
                JsonNode nodeRelicsSubCount = nodeSubAffix.path("count");


                double subScore = calculator.getSubScore(dValue, iCharacterID, sSubType);
                System.out.println("    SUB" + (k + 1)
                        + "\n"
                        + "    name : " + nodeRelicsSubName
                        + " +" + nodeRelicsSubDisplay
                        + " count : " + nodeRelicsSubCount
                        + "\n"
                        + "    score : " + subScore
                        + "\n"
                );
            }
        }
        double totalScore = ScoreData.data.getMainScore() * 0.5 + ScoreData.data.getSubScore() * 0.5;
        System.out.println("TOTAL SCORE : " + totalScore);
    }
}