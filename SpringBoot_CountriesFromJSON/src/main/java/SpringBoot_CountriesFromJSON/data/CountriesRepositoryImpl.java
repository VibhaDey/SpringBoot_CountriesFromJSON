package SpringBoot_CountriesFromJSON.data;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
@Repository
public class CountriesRepositoryImpl implements ICountriesRepository {
    @Override
    public JSONObject readDataFromJson() {

        JSONObject jsonObject = null;
        try {
            FileReader fileReader = new FileReader(".//jsonFile//countries.json");
            JSONParser jsonParser = new JSONParser();
            jsonObject = (JSONObject) jsonParser.parse(fileReader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return jsonObject;
    }
}
