package SpringBoot_CountriesFromJSON.handler;

import SpringBoot_CountriesFromJSON.data.ICountriesRepository;
import SpringBoot_CountriesFromJSON.model.Country;
import SpringBoot_CountriesFromJSON.model.CountryResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryHandlerImpl implements ICountryHandler {
    @Autowired
    private ICountriesRepository iCountriesRepository;


    @Override
    public CountryResponse getCountries() {
        JSONObject jsonObject = iCountriesRepository.readDataFromJson();
        JSONArray jsonArray = jsonObject.optJSONArray("countries");
        CountryResponse countryResponse = new CountryResponse();

        List<Country> countryList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject1 = (JSONObject) jsonArray.get(i);
            String str1 = (String) jsonObject1.get("name");
            String str2 = (String) jsonObject1.get("code");
            Country country = new Country();
            country.setName(str1);
            country.setCode(str2);
            countryList.add(country);
        }
        countryResponse.setCountries(countryList);

        return countryResponse;
    }
}
