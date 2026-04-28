package zendesk.conversationkit.android;

import a80.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00122\u00020\u0001:\u0003\u0010\u0011\u0012B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitSettings;", "", "integrationId", "", "region", "Lzendesk/conversationkit/android/ConversationKitSettings$Region;", "baseUrl", "zendeskVersion", "<init>", "(Ljava/lang/String;Lzendesk/conversationkit/android/ConversationKitSettings$Region;Ljava/lang/String;Ljava/lang/String;)V", "getIntegrationId", "()Ljava/lang/String;", "getRegion", "()Lzendesk/conversationkit/android/ConversationKitSettings$Region;", "getBaseUrl$zendesk_conversationkit_conversationkit_android", "getZendeskVersion$zendesk_conversationkit_conversationkit_android", "Builder", "Region", "Companion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConversationKitSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String baseUrl;

    @NotNull
    private final String integrationId;

    @NotNull
    private final Region region;

    @NotNull
    private final String zendeskVersion;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitSettings$Builder;", "", "integrationId", "", "zendeskVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "region", "Lzendesk/conversationkit/android/ConversationKitSettings$Region;", "baseUrl", "withRegion", "withBaseUrl", "build", "Lzendesk/conversationkit/android/ConversationKitSettings;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private String baseUrl;

        @NotNull
        private final String integrationId;

        @NotNull
        private Region region;

        @NotNull
        private final String zendeskVersion;

        public Builder(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.integrationId = str;
            this.zendeskVersion = str2;
            this.region = Region.US;
        }

        @NotNull
        public final ConversationKitSettings build() {
            String str = this.integrationId;
            Region region = this.region;
            String str2 = this.baseUrl;
            if (str2 == null) {
                str2 = "";
            }
            return new ConversationKitSettings(str, region, str2, this.zendeskVersion, null);
        }

        @NotNull
        public final Builder withBaseUrl(@NotNull String baseUrl) {
            baseUrl.getClass();
            this.baseUrl = baseUrl;
            return this;
        }

        @NotNull
        public final Builder withRegion(@NotNull Region region) {
            region.getClass();
            this.region = region;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitSettings$Region;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue$zendesk_conversationkit_conversationkit_android", "()Ljava/lang/String;", "US", "EU", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Region {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Region[] $VALUES;

        @NotNull
        private final String value;
        public static final Region US = new Region("US", 0, "");
        public static final Region EU = new Region("EU", 1, ".eu-1");

        private static final /* synthetic */ Region[] $values() {
            return new Region[]{US, EU};
        }

        static {
            Region[] regionArr$values = $values();
            $VALUES = regionArr$values;
            $ENTRIES = n.w(regionArr$values);
        }

        private Region(String str, int i11, String str2) {
            this.value = str2;
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static Region valueOf(String str) {
            return (Region) Enum.valueOf(Region.class, str);
        }

        public static Region[] values() {
            return (Region[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getValue$zendesk_conversationkit_conversationkit_android, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    private ConversationKitSettings(String str, Region region, String str2, String str3) {
        this.integrationId = str;
        this.region = region;
        this.baseUrl = str2;
        this.zendeskVersion = str3;
    }

    @NotNull
    public static final Builder builder(@NotNull String str, @NotNull String str2) {
        return INSTANCE.builder(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: getBaseUrl$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    public final String getIntegrationId() {
        return this.integrationId;
    }

    @NotNull
    public final Region getRegion() {
        return this.region;
    }

    @NotNull
    /* JADX INFO: renamed from: getZendeskVersion$zendesk_conversationkit_conversationkit_android, reason: from getter */
    public final String getZendeskVersion() {
        return this.zendeskVersion;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lzendesk/conversationkit/android/ConversationKitSettings$Companion;", "", "<init>", "()V", "builder", "Lzendesk/conversationkit/android/ConversationKitSettings$Builder;", "integrationId", "", "zendeskVersion", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder builder(@NotNull String integrationId, @NotNull String zendeskVersion) {
            integrationId.getClass();
            zendeskVersion.getClass();
            return new Builder(integrationId, zendeskVersion);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ConversationKitSettings(String str, Region region, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, region, str2, str3);
    }
}
