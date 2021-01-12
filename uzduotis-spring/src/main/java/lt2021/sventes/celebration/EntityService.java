package lt2021.sventes.celebration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityService {
//	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DBEntityyDao dao;

//	@Transactional
//	public List<EntityFromService> getAll() {
//		dao.findAll().stream()
//	}

//	@Transactional (readOnly = true)
//	public EntityFromService getSingle(Long id) {
//		var a = dao.findById(id).orElse(null);
//	}
//	@Transactional
//	public void add(EntityFromService sveikinimas) {
//		dao.save()
//	}

//	@Transactional
//	public void update( EntityFromService sveikinimas) {
//		var updatedA = dao.findById(sveikinimas.getId()).orElse(null);
//		updatedA.setName(sveikinimas.getName());

//	@Transactional
//	public void delete(Long id) {
//		dao.deleteById(id);
//	}

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
