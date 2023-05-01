package SpringBoot_CountriesFromJSON.data;

import org.json.simple.JSONObject;

public interface ICountriesRepository {
    JSONObject readDataFromJson();
}
