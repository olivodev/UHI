package in.gov.abdm.uhi.common.dto;

import javax.sound.midi.Receiver;
import javax.swing.text.AbstractDocument.Content;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class Chat {

    private Sender sender;
    private Receiver receiver;
    private Content content;
    private Time time;
}

