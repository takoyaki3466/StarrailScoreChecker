import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MihomoAPI {
    private final String BaseUrl;
    private final Language Language;
    private final String ASSETS;
    private final String UID;

    public MihomoAPI(Language language, String UID) {
        this.Language = language;
        this.UID = UID;
        this.BaseUrl = "https://api.mihomo.me/sr_info_parsed";
        this.ASSETS = "https://raw.githubusercontent.com/Mar-7th/StarRailRes/master";
    }


    public String makeUrl() {
        return BaseUrl + "/" + UID + "?lang=" + Language;
    }

    public String request() throws Exception{
        // 接続先URL
        URL url = new URL(makeUrl());
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // レスポンスコードを取得
        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);

        // レスポンスを取得
        if (responseCode == HttpURLConnection.HTTP_OK) { // 200 OK
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            return bufferedReader.readLine();
        }
        throw new Exception();
    }
    public String getResponse() throws Exception {
        return request();
    }

    public JsonNode getDefault(String UID) throws Exception {
        String string = getResponse();
        return new ObjectMapper().readTree(string);
    }

    public StringBuilder getIcon(final String path){
        StringBuilder sb = new StringBuilder(this.ASSETS);
        sb.append("/").append(path);
        return sb;
    }

    public JsonNode convertToNode(final String string) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readTree(string);
    }
}