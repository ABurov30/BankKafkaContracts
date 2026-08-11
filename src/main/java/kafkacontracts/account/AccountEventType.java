package kafkacontracts.account;

import kafkacontracts.common.KafkaTopics;
import lombok.Getter;

@Getter
public enum AccountEventType {
    ACCOUNT_CREATED(KafkaTopics.ACCOUNT_CREATED, "v1"),
    ACCOUNT_FROZEN(KafkaTopics.ACCOUNT_FROZEN, "v1"),
    ACCOUNT_UNFROZEN(KafkaTopics.ACCOUNT_UNFROZEN, "v1"),
    TRANSACTION_COMPENSATED(KafkaTopics.TRANSACTION_COMPENSATED, "v1"),
    TRANSACTION_COMPLETED(KafkaTopics.TRANSACTION_COMPLETED, "v1");

    private final String topic;
    private final String version;

    AccountEventType(String topic, String version) {
        this.topic = topic;
        this.version = version;
    }
}
