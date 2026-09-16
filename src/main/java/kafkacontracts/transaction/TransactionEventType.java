package kafkacontracts.transaction;

import kafkacontracts.common.KafkaTopics;
import lombok.Getter;

@Getter
public enum TransactionEventType {
  TRANSACTION_FUNDS_REQUESTED(KafkaTopics.TRANSACTION_FUNDS_REQUESTED, "v1"),
  TRANSACTION_FAILED(KafkaTopics.TRANSACTION_FAILED, "v1"),
  TRANSACTION_CARD_LIMIT_HOLD_COMPENSATION(
      KafkaTopics.TRANSACTION_CARD_LIMIT_HOLD_COMPENSATION, "v1"),
  TRANSACTION_ACCOUNT_HOLD_COMPENSATION(KafkaTopics.TRANSACTION_CARD_LIMIT_HOLD_COMPENSATION, "v1");

  private final String topic;
  private final String version;

  TransactionEventType(String topic, String version) {
    this.topic = topic;
    this.version = version;
  }
}
