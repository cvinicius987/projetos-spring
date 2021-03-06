package br.com.cvinicius.profile.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import br.com.cvinicius.profile.service.Message;

@Profile("dev")
@Component
public class DevMessage implements Message{

	@Override
	public String getMessage() {
		return "Ambiente de Desenvolvimento";
	}
}