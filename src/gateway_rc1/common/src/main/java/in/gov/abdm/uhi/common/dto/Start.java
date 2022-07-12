package in.gov.abdm.uhi.common.dto;

import lombok.Data;

@Data
public class Start {
	private Time time;
	private Instructions instructions;
	private Contact contact;
	private Person person;
}
