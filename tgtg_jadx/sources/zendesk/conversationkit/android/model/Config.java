package zendesk.conversationkit.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lzendesk/conversationkit/android/model/Config;", "", "app", "Lzendesk/conversationkit/android/model/App;", "baseUrl", "", "settingsBaseUrl", "integration", "Lzendesk/conversationkit/android/model/Integration;", "restRetryPolicy", "Lzendesk/conversationkit/android/model/RestRetryPolicy;", "<init>", "(Lzendesk/conversationkit/android/model/App;Ljava/lang/String;Ljava/lang/String;Lzendesk/conversationkit/android/model/Integration;Lzendesk/conversationkit/android/model/RestRetryPolicy;)V", "getApp", "()Lzendesk/conversationkit/android/model/App;", "getBaseUrl", "()Ljava/lang/String;", "getSettingsBaseUrl", "getIntegration", "()Lzendesk/conversationkit/android/model/Integration;", "getRestRetryPolicy", "()Lzendesk/conversationkit/android/model/RestRetryPolicy;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Config {

    @NotNull
    private final App app;

    @NotNull
    private final String baseUrl;

    @NotNull
    private final Integration integration;

    @NotNull
    private final RestRetryPolicy restRetryPolicy;

    @NotNull
    private final String settingsBaseUrl;

    public Config(@NotNull App app2, @NotNull String str, @NotNull String str2, @NotNull Integration integration, @NotNull RestRetryPolicy restRetryPolicy) {
        app2.getClass();
        str.getClass();
        str2.getClass();
        integration.getClass();
        restRetryPolicy.getClass();
        this.app = app2;
        this.baseUrl = str;
        this.settingsBaseUrl = str2;
        this.integration = integration;
        this.restRetryPolicy = restRetryPolicy;
    }

    public static /* synthetic */ Config copy$default(Config config, App app2, String str, String str2, Integration integration, RestRetryPolicy restRetryPolicy, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            app2 = config.app;
        }
        if ((i11 & 2) != 0) {
            str = config.baseUrl;
        }
        if ((i11 & 4) != 0) {
            str2 = config.settingsBaseUrl;
        }
        if ((i11 & 8) != 0) {
            integration = config.integration;
        }
        if ((i11 & 16) != 0) {
            restRetryPolicy = config.restRetryPolicy;
        }
        RestRetryPolicy restRetryPolicy2 = restRetryPolicy;
        String str3 = str2;
        return config.copy(app2, str, str3, integration, restRetryPolicy2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final App getApp() {
        return this.app;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSettingsBaseUrl() {
        return this.settingsBaseUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integration getIntegration() {
        return this.integration;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RestRetryPolicy getRestRetryPolicy() {
        return this.restRetryPolicy;
    }

    @NotNull
    public final Config copy(@NotNull App app2, @NotNull String baseUrl, @NotNull String settingsBaseUrl, @NotNull Integration integration, @NotNull RestRetryPolicy restRetryPolicy) {
        app2.getClass();
        baseUrl.getClass();
        settingsBaseUrl.getClass();
        integration.getClass();
        restRetryPolicy.getClass();
        return new Config(app2, baseUrl, settingsBaseUrl, integration, restRetryPolicy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        return Intrinsics.areEqual(this.app, config.app) && Intrinsics.areEqual(this.baseUrl, config.baseUrl) && Intrinsics.areEqual(this.settingsBaseUrl, config.settingsBaseUrl) && Intrinsics.areEqual(this.integration, config.integration) && Intrinsics.areEqual(this.restRetryPolicy, config.restRetryPolicy);
    }

    @NotNull
    public final App getApp() {
        return this.app;
    }

    @NotNull
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    public final Integration getIntegration() {
        return this.integration;
    }

    @NotNull
    public final RestRetryPolicy getRestRetryPolicy() {
        return this.restRetryPolicy;
    }

    @NotNull
    public final String getSettingsBaseUrl() {
        return this.settingsBaseUrl;
    }

    public int hashCode() {
        return this.restRetryPolicy.hashCode() + ((this.integration.hashCode() + l1.b(l1.b(this.app.hashCode() * 31, 31, this.baseUrl), 31, this.settingsBaseUrl)) * 31);
    }

    @NotNull
    public String toString() {
        return "Config(app=" + this.app + ", baseUrl=" + this.baseUrl + ", settingsBaseUrl=" + this.settingsBaseUrl + ", integration=" + this.integration + ", restRetryPolicy=" + this.restRetryPolicy + ")";
    }
}
