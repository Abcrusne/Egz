package lt2021.sventes.country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DBCountryDao extends JpaRepository<Country, Long> {

//	@Query("select c from Country c where c.title like %?1%")
//	List<Country> findByTitleFragment(String title);
//
//	@Query("select c from Country c order by c.title asc")
//	List<Country> findAll();

}
