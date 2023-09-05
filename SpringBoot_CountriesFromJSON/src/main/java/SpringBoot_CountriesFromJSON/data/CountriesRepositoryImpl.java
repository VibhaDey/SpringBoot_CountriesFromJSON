package SpringBoot_CountriesFromJSON.data;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Repository
public class CountriesRepositoryImpl implements ICountriesRepository {

    @Override
    public JSONObject readDataFromJson() {

        JSONObject jsonObject = null;

        ClassPathResource pathResource = new ClassPathResource("countries.json");
        try {
            String content = IOUtils.toString(pathResource.getInputStream(), StandardCharsets.UTF_8);
            jsonObject = new JSONObject(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return jsonObject;
    }
}
