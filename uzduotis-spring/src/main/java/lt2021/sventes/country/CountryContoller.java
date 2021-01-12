package lt2021.sventes.country;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/countries")
public class CountryContoller {

	@Autowired
	private CountryService service;

	@RequestMapping(method = RequestMethod.GET)
	public Set<CountryFromService> getCountries() {
		return service.getCountries();
	}

	@RequestMapping(method = RequestMethod.POST)
	public Set<CountryFromService> addCountry(@RequestBody final CreateCountryCommand cmd) {

		service.addCountry(new CountryFromService(cmd.getTitle(), cmd.getImage(), cmd.getPresident()));
		return service.getCountries();
	}

	@RequestMapping(path = "/{countryId}", method = RequestMethod.GET)
	public CountryFromService getSingleCountry(@PathVariable final Long countryId) {
		return service.getCountry(countryId);
	}

	@RequestMapping(path = "/{countryId}", method = RequestMethod.DELETE)
	public void deletecOUNTRY(@PathVariable final Long countryId) {
		service.deleteCountry(countryId);
	}

	@RequestMapping(path = "/{countryId}", method = RequestMethod.PUT)
	public void updateCountry(@PathVariable final Long countryId, @RequestBody final CreateCountryCommand cmd) {
		service.updateCountry(new CountryFromService(countryId, cmd.getTitle(), cmd.getImage(), cmd.getPresident()));
	}

}
