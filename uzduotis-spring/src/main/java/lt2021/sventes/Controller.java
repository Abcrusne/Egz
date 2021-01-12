package lt2021.sventes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt2021.sventes.celebration.EntityService;

@RestController
@RequestMapping(value = "/api/sveikinimai")
public class Controller {

	@Autowired
	private EntityService service;

}
