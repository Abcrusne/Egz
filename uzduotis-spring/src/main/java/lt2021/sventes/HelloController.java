package lt2021.sventes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;

	@RequestMapping("/hello")
	String hello() {
		return "Hello World!";
	}

}
