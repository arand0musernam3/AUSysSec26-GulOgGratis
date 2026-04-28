package zendesk.analyticskit.android.model;

import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsSettings;", "", "baseUrl", "", "integrationId", Bayeux.KEY_CLIENT_ID, "threshold", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBaseUrl", "()Ljava/lang/String;", "getIntegrationId", "getClientId", "getThreshold", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AnalyticsSettings {

    @Deprecated
    @NotNull
    public static final String CLIENT_ID = "383F2407-53F9-475B-87BD-6D2F1CE12105";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int THRESHOLD = 10;

    @NotNull
    private final String baseUrl;

    @NotNull
    private final String clientId;

    @Nullable
    private final String integrationId;
    private final int threshold;

    public AnalyticsSettings(@NotNull String str, @Nullable String str2, @NotNull String str3, int i11) {
        str.getClass();
        str3.getClass();
        this.baseUrl = str;
        this.integrationId = str2;
        this.clientId = str3;
        this.threshold = i11;
    }

    public static /* synthetic */ AnalyticsSettings copy$default(AnalyticsSettings analyticsSettings, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = analyticsSettings.baseUrl;
        }
        if ((i12 & 2) != 0) {
            str2 = analyticsSettings.integrationId;
        }
        if ((i12 & 4) != 0) {
            str3 = analyticsSettings.clientId;
        }
        if ((i12 & 8) != 0) {
            i11 = analyticsSettings.threshold;
        }
        return analyticsSettings.copy(str, str2, str3, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIntegrationId() {
        return this.integrationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getThreshold() {
        return this.threshold;
    }

    @NotNull
    public final AnalyticsSettings copy(@NotNull String baseUrl, @Nullable String integrationId, @NotNull String clientId, int threshold) {
        baseUrl.getClass();
        clientId.getClass();
        return new AnalyticsSettings(baseUrl, integrationId, clientId, threshold);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsSettings)) {
            return false;
        }
        AnalyticsSettings analyticsSettings = (AnalyticsSettings) other;
        return Intrinsics.areEqual(this.baseUrl, analyticsSettings.baseUrl) && Intrinsics.areEqual(this.integrationId, analyticsSettings.integrationId) && Intrinsics.areEqual(this.clientId, analyticsSettings.clientId) && this.threshold == analyticsSettings.threshold;
    }

    @NotNull
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @Nullable
    public final String getIntegrationId() {
        return this.integrationId;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        int iHashCode = this.baseUrl.hashCode() * 31;
        String str = this.integrationId;
        return Integer.hashCode(this.threshold) + l1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.clientId);
    }

    @NotNull
    public String toString() {
        String str = this.baseUrl;
        String str2 = this.integrationId;
        String str3 = this.clientId;
        int i11 = this.threshold;
        StringBuilder sbT = f.t("AnalyticsSettings(baseUrl=", str, ", integrationId=", str2, ", clientId=");
        sbT.append(str3);
        sbT.append(", threshold=");
        sbT.append(i11);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lzendesk/analyticskit/android/model/AnalyticsSettings$Companion;", "", "<init>", "()V", "CLIENT_ID", "", "THRESHOLD", "", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AnalyticsSettings(String str, String str2, String str3, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i12 & 4) != 0 ? CLIENT_ID : str3, (i12 & 8) != 0 ? 10 : i11);
    }
}
