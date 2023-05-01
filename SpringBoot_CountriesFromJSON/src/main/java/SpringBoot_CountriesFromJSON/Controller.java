package SpringBoot_CountriesFromJSON;

import SpringBoot_CountriesFromJSON.handler.ICountryHandler;
import SpringBoot_CountriesFromJSON.model.Country;
import SpringBoot_CountriesFromJSON.model.CountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private ICountryHandler iCountryHandler;
    @RequestMapping("/countries")
    public CountryResponse countries(){

        return iCountryHandler.getCountries();

    }

}
