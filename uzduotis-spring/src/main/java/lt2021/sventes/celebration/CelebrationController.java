package lt2021.sventes.celebration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/celebrations")
public class CelebrationController {

	@Autowired
	private CelebrationService service;

	@RequestMapping(method = RequestMethod.GET)
	public List<CelebrationFromService> getCelebrations() {
		return service.getCelebrations();
	}

	@RequestMapping(method = RequestMethod.POST)
	public List<CelebrationFromService> addCelebration(@RequestBody final CreateCelebrationCommand cmd) {

		service.addCelebration(new CelebrationFromService(cmd.getTitle(), cmd.getDesc(), cmd.getImage(), cmd.getType(),
				cmd.getFlag()));
		return service.getCelebrations();
	}

	@RequestMapping(path = "/{celebrationId}", method = RequestMethod.GET)
	public CelebrationFromService getSingleCelebration(@PathVariable final Long celebrationId) {
		return service.getSingleCelebration(celebrationId);
	}

	@RequestMapping(path = "/{celebrationId}", method = RequestMethod.DELETE)
	public void deleteGreeting(@PathVariable final Long celebrationId) {
		service.delete(celebrationId);
	}

	@RequestMapping(path = "/{celebrationId}", method = RequestMethod.PUT)
	public void updateSveikinimas(@PathVariable final Long celebrationId,
			@RequestBody final CreateCelebrationCommand cmd) {
		service.update(new CelebrationFromService(celebrationId, cmd.getTitle(), cmd.getDesc(), cmd.getImage(),
				cmd.getType(), cmd.getFlag()));
	}

}
