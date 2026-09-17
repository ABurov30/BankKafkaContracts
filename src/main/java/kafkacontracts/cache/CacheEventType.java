package kafkacontracts.cache;

import kafkacontracts.common.KafkaTopics;
import lombok.Getter;

@Getter
public enum CacheEventType {
  CACHE_INVALIDATION(KafkaTopics.CACHE_INVALIDATION, "v1");

  private final String topic;
  private final String version;

  CacheEventType(String topic, String version) {
    this.topic = topic;
    this.version = version;
  }
}
