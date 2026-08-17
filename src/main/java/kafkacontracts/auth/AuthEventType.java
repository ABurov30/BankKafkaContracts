package kafkacontracts.auth;

import kafkacontracts.common.KafkaTopics;
import lombok.Getter;

@Getter
public enum AuthEventType {
  AUTH_USER_CREATED(KafkaTopics.AUTH_USER_CREATED, "v1"),
  AUTH_USER_BLOCKED(KafkaTopics.AUTH_USER_BLOCKED, "v1"),
  AUTH_USER_UNLOCK(KafkaTopics.AUTH_USER_UNLOCK, "v1"),
  AUTH_USER_VERIFIED(KafkaTopics.AUTH_USER_VERIFIED, "v1"),
  AUTH_USER_ROLE_CHANGED(KafkaTopics.AUTH_USER_ROLE_CHANGED, "v1"),
  AUTH_USER_FORGET_PASSWORD(KafkaTopics.AUTH_USER_FORGET_PASSWORD, "v1"),
  AUTH_SOCIAL_ACCOUNT_AUTH_USER_CREATED(KafkaTopics.AUTH_SOCIAL_ACCOUNT_AUTH_USER_CREATED, "v1");

  private final String topic;
  private final String version;

  AuthEventType(String topic, String version) {
    this.topic = topic;
    this.version = version;
  }
}
