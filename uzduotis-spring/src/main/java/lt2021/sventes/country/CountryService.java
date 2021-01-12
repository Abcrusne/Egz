package lt2021.sventes.country;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryService {

	@Autowired
	private DBCountryDao dao;

	@Transactional(readOnly = true)
	public Set<CountryFromService> getCountries() {
		return dao.findAll().stream()
				.map(co -> new CountryFromService(co.getId(), co.getTitle(), co.getImage(), co.getPresident()))
				.collect(Collectors.toSet());
	}

	@Transactional(readOnly = true)
	public CountryFromService getCountry(Long id) {
		var co = dao.findById(id).orElse(null);
		return new CountryFromService(co.getId(), co.getTitle(), co.getImage(), co.getPresident());
	}

	@Transactional
	public void addCountry(CountryFromService co) {
		dao.save(new Country(co.getTitle(), co.getImage(), co.getPresident()));
	}

	@Transactional
	public void updateCountry(CountryFromService co) {

		var updatedCo = dao.findById(co.getId()).orElse(null);
		updatedCo.setTitle(co.getTitle());
		updatedCo.setImage(co.getImage());
		updatedCo.setPresident(co.getPresident());

		dao.save(updatedCo);

	}

	public void deleteCountry(Long id) {
		dao.deleteById(id);
	}

	public DBCountryDao getDao() {
		return dao;
	}

	public void setDao(DBCountryDao dao) {
		this.dao = dao;
	}

}
