package kafkacontracts.card;

import kafkacontracts.common.KafkaTopics;
import lombok.Getter;

@Getter
public enum CardEventType {
    CARD_CREATED(KafkaTopics.CARD_CREATED, "v1"),
    CARD_FROZEN(KafkaTopics.CARD_FROZEN, "v1"),
    CARD_UNFROZEN(KafkaTopics.CARD_UNFROZEN, "v1");

    private final String topic;
    private final String version;

    CardEventType(String topic, String version) {
        this.topic = topic;
        this.version = version;
    }
}
