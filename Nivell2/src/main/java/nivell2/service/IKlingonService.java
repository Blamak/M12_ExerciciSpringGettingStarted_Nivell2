package nivell2.service;

import nivell2.dto.KlingonResponseDto;

public interface IKlingonService {
	
	KlingonResponseDto getKlingon(String uuid);
	
	String defaultGreeting();
	
	String parameterGreeting(String name);

	String hello(String name);
}
