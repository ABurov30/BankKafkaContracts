package kafkacontracts.common;

public final class KafkaTopics {
    public static final String AUTH_USER_CREATED = "auth.user.created";
    public static final String AUTH_USER_BLOCKED = "auth.user.blocked";
    public static final String AUTH_USER_UNLOCK = "auth.user.unlock";
    public static final String AUTH_USER_VERIFIED = "auth.user.verified";
    public static final String AUTH_USER_ROLE_CHANGED = "auth.user.role.changed";
    public static final String AUTH_USER_FORGET_PASSWORD = "auth.user.forget.password";

    public static final String USER_PROFILE_CREATED = "user.profile.created";
    public static final String USER_PROFILE_BLOCKED = "user.profile.blocked";
    public static final String USER_PROFILE_UNLOCK = "user.profile.UNLOCK";

    public static final String ACCOUNT_CREATED = "account.created";
    public static final String ACCOUNT_FROZEN = "account.frozen";

    private KafkaTopics() {
    }
}
