package kafkacontracts.transaction;

import kafkacontracts.common.KafkaTopics;
import lombok.Getter;

@Getter
public enum TransactionEventType {
    TRANSACTION_FUNDS_REQUESTED(KafkaTopics.TRANSACTION_FUNDS_REQUESTED, "v1"),
    TRANSACTION_COMPLETED(KafkaTopics.TRANSACTION_COMPLETED, "v1"),
    TRANSACTION_FAILED(KafkaTopics.TRANSACTION_FAILED, "v1"),
    TRANSACTION_COMPENSATED(KafkaTopics.TRANSACTION_COMPENSATED, "v1");

    private final String topic;
    private final String version;

    TransactionEventType(String topic, String version) {
        this.topic = topic;
        this.version = version;
    }
}
