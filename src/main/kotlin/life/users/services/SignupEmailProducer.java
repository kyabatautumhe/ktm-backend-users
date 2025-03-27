package life.users.services;

import life.users.dtos.EmailDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SignupEmailProducer {

    private final KafkaTemplate<String, EmailDto> kafkaTemplate;

    private static final String TOPIC = "user-signup-email";

    public SignupEmailProducer(KafkaTemplate<String, EmailDto> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    // todo - call this to send sign up email
    public void sendEmailEvent(EmailDto emailEvent) {
        kafkaTemplate.send(TOPIC, emailEvent);
    }
}
