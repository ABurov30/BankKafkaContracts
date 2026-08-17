package kafkacontracts.common;

public final class KafkaTopics {
  public static final String AUTH_USER_CREATED = "auth.user.created";
  public static final String AUTH_USER_BLOCKED = "auth.user.blocked";
  public static final String AUTH_USER_UNLOCK = "auth.user.unlock";
  public static final String AUTH_USER_VERIFIED = "auth.user.verified";
  public static final String AUTH_USER_ROLE_CHANGED = "auth.user.role.changed";
  public static final String AUTH_USER_FORGET_PASSWORD = "auth.user.forget.password";
  public static final String AUTH_SOCIAL_ACCOUNT_AUTH_USER_CREATED =
      "auth.social.account.auth.user.created";

  public static final String USER_PROFILE_CREATED = "user.profile.created";
  public static final String USER_PROFILE_BLOCKED = "user.profile.blocked";
  public static final String USER_PROFILE_UNLOCK = "user.profile.UNLOCK";

  public static final String ACCOUNT_CREATED = "account.created";
  public static final String ACCOUNT_FROZEN = "account.frozen";
  public static final String ACCOUNT_UNFROZEN = "account.unfrozen";

  public static final String CARD_CREATED = "card.created";
  public static final String CARD_FROZEN = "card.frozen";
  public static final String CARD_UNFROZEN = "card.unfrozen";

  public static final String PUSH_NOTIFICATION_CREATED = "notification.push.created";

  public static final String TRANSACTION_FUNDS_REQUESTED = "transaction.funds.requested";
  public static final String TRANSACTION_COMPLETED = "transaction.completed";
  public static final String TRANSACTION_FAILED = "transaction.failed";
  public static final String TRANSACTION_COMPENSATED = "transaction.compensated";

  private KafkaTopics() {}
}
