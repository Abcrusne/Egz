package lt2021.sventes.celebration;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CelebrationService {
//	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DBCelebrationDao dao;

	@Transactional(readOnly = true)
	public List<CelebrationFromService> getCelebrations() {
		return dao.findAll().stream().map(c -> new CelebrationFromService(c.getId(), c.getTitle(), c.getDesc(),
				c.getImage(), c.getType(), c.getFlag())).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public CelebrationFromService getSingleCelebration(Long id) {
		var c = dao.findById(id).orElse(null);
		return new CelebrationFromService(c.getId(), c.getTitle(), c.getDesc(), c.getImage(), c.getType(), c.getFlag());
	}

	@Transactional
	public void addCelebration(CelebrationFromService c) {
		dao.save(new Celebration(c.getTitle(), c.getDesc(), c.getImage(), c.getType(), c.getFlag()));
	}

	@Transactional
	public void update(CelebrationFromService c) {

		var updatedC = dao.findById(c.getId()).orElse(null);
		updatedC.setTitle(c.getTitle());
		updatedC.setDesc(c.getDesc());
		updatedC.setImage(c.getImage());
		updatedC.setType(c.getType());
		updatedC.setFlag(c.getFlag());

		dao.save(updatedC);
	}

	@Transactional
	public void delete(Long id) {
		dao.deleteById(id);
	}

//	@PostConstruct
//	private void postConstruct() {
//		Greeting greeting1 = new Greeting();
//
//		dbGreetingDao.save(greeting1);
//
//	}
//
//	@PreDestroy
//	public void preDestroy() {
//		dbGreetingDao
//	}

//	void deleteById(Long id);
//
//	Product findById(Long id);
//	@PostConstruct
//	public void init() {
//		log.info("Bean created, class:  " + getClass().getName() + ". Scope(default value): singleton");
//
//	}
//
//	@PreDestroy
//	public void destroy() {
//		log.info("Bean destroyed, class:  " + getClass().getName() + ". Scope(default value): singleton");
//	}

}
