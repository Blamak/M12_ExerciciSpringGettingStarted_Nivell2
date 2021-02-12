package nivell2.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nivell2.dto.KlingonResponseDto;
import nivell2.repository.KlingonRepository;
import nivell2.service.IKlingonService;

@Service
public class KlingonServiceImpl implements IKlingonService {

	private final KlingonRepository klingonRepository;

	@Autowired
	public KlingonServiceImpl(KlingonRepository klingonRepository) {
		this.klingonRepository = klingonRepository;
	}
	
	@Override
	public KlingonResponseDto getKlingon(String uuid) {
		return klingonRepository.getKlingon(uuid);
	}

	@Override
	public String defaultGreeting() {
		return "Hello World!";
	}

	@Override
	public String parameterGreeting(String name) {
		return "Hello " + name + "!";
	}

	@Override
	public String hello(String name) {
		return String.format("Hello %s!", name);
	}

}
