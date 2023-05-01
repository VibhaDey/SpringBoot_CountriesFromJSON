package SpringBoot_CountriesFromJSON.handler;

import SpringBoot_CountriesFromJSON.model.Country;
import SpringBoot_CountriesFromJSON.model.CountryResponse;

import java.util.List;

public interface ICountryHandler {
    CountryResponse getCountries();
}
