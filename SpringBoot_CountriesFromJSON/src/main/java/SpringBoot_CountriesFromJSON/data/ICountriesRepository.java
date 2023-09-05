package SpringBoot_CountriesFromJSON.data;


import org.json.JSONObject;

public interface ICountriesRepository {
    JSONObject readDataFromJson();
}
