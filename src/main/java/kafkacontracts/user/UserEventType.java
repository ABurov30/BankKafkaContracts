package kafkacontracts.user;

import kafkacontracts.common.KafkaTopics;
import lombok.Getter;

@Getter
public enum UserEventType {
  USER_PROFILE_CREATED(KafkaTopics.USER_PROFILE_CREATED, "v1"),
  USER_PROFILE_BLOCKED(KafkaTopics.USER_PROFILE_BLOCKED, "v1"),
  USER_PROFILE_UNLOCK(KafkaTopics.USER_PROFILE_UNLOCK, "v1");

  private final String topic;
  private final String version;

  UserEventType(String topic, String version) {
    this.topic = topic;
    this.version = version;
  }
}
