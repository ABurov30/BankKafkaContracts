package kafkacontracts.notification;

import kafkacontracts.common.KafkaTopics;
import lombok.Getter;

@Getter
public enum NotificationEventType {
  PUSH_NOTIFICATION_CREATED(KafkaTopics.PUSH_NOTIFICATION_CREATED, "v1");

  private final String topic;
  private final String version;

  NotificationEventType(String topic, String version) {
    this.topic = topic;
    this.version = version;
  }
}
