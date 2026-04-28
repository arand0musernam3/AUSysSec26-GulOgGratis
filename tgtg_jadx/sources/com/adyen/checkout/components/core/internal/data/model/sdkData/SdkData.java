package com.adyen.checkout.components.core.internal.data.model.sdkData;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 '2\u00020\u0001:\u0001'B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JH\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0006\u0010#\u001a\u00020$J\t\u0010%\u001a\u00020&HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/sdkData/SdkData;", "", SdkData.SCHEMA_VERSION, "", SdkData.ANALYTICS, "Lcom/adyen/checkout/components/core/internal/data/model/sdkData/Analytics;", SdkData.AUTHENTICATION, "Lcom/adyen/checkout/components/core/internal/data/model/sdkData/Authentication;", SdkData.CREATED_AT, "", SdkData.SUPPORT_NATIVE_REDIRECT, "", "(ILcom/adyen/checkout/components/core/internal/data/model/sdkData/Analytics;Lcom/adyen/checkout/components/core/internal/data/model/sdkData/Authentication;Ljava/lang/Long;Ljava/lang/Boolean;)V", "getAnalytics", "()Lcom/adyen/checkout/components/core/internal/data/model/sdkData/Analytics;", "getAuthentication", "()Lcom/adyen/checkout/components/core/internal/data/model/sdkData/Authentication;", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSchemaVersion", "()I", "getSupportNativeRedirect", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILcom/adyen/checkout/components/core/internal/data/model/sdkData/Analytics;Lcom/adyen/checkout/components/core/internal/data/model/sdkData/Authentication;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/adyen/checkout/components/core/internal/data/model/sdkData/SdkData;", "equals", "other", "hashCode", "serialize", "Lorg/json/JSONObject;", "toString", "", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SdkData {

    @NotNull
    private static final String ANALYTICS = "analytics";

    @NotNull
    private static final String AUTHENTICATION = "authentication";

    @NotNull
    private static final String CREATED_AT = "createdAt";

    @NotNull
    private static final String SCHEMA_VERSION = "schemaVersion";

    @NotNull
    private static final String SUPPORT_NATIVE_REDIRECT = "supportNativeRedirect";

    @Nullable
    private final Analytics analytics;

    @Nullable
    private final Authentication authentication;

    @Nullable
    private final Long createdAt;
    private final int schemaVersion;

    @Nullable
    private final Boolean supportNativeRedirect;

    public /* synthetic */ SdkData(int i11, Analytics analytics, Authentication authentication, Long l, Boolean bool, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : analytics, (i12 & 4) != 0 ? null : authentication, (i12 & 8) != 0 ? null : l, (i12 & 16) != 0 ? null : bool);
    }

    public static /* synthetic */ SdkData copy$default(SdkData sdkData, int i11, Analytics analytics, Authentication authentication, Long l, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = sdkData.schemaVersion;
        }
        if ((i12 & 2) != 0) {
            analytics = sdkData.analytics;
        }
        if ((i12 & 4) != 0) {
            authentication = sdkData.authentication;
        }
        if ((i12 & 8) != 0) {
            l = sdkData.createdAt;
        }
        if ((i12 & 16) != 0) {
            bool = sdkData.supportNativeRedirect;
        }
        Boolean bool2 = bool;
        Authentication authentication2 = authentication;
        return sdkData.copy(i11, analytics, authentication2, l, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Authentication getAuthentication() {
        return this.authentication;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getSupportNativeRedirect() {
        return this.supportNativeRedirect;
    }

    @NotNull
    public final SdkData copy(int schemaVersion, @Nullable Analytics analytics, @Nullable Authentication authentication, @Nullable Long createdAt, @Nullable Boolean supportNativeRedirect) {
        return new SdkData(schemaVersion, analytics, authentication, createdAt, supportNativeRedirect);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkData)) {
            return false;
        }
        SdkData sdkData = (SdkData) other;
        return this.schemaVersion == sdkData.schemaVersion && Intrinsics.areEqual(this.analytics, sdkData.analytics) && Intrinsics.areEqual(this.authentication, sdkData.authentication) && Intrinsics.areEqual(this.createdAt, sdkData.createdAt) && Intrinsics.areEqual(this.supportNativeRedirect, sdkData.supportNativeRedirect);
    }

    @Nullable
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @Nullable
    public final Authentication getAuthentication() {
        return this.authentication;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    @Nullable
    public final Boolean getSupportNativeRedirect() {
        return this.supportNativeRedirect;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.schemaVersion) * 31;
        Analytics analytics = this.analytics;
        int iHashCode2 = (iHashCode + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Authentication authentication = this.authentication;
        int iHashCode3 = (iHashCode2 + (authentication == null ? 0 : authentication.hashCode())) * 31;
        Long l = this.createdAt;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.supportNativeRedirect;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public final JSONObject serialize() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(SCHEMA_VERSION, Integer.valueOf(this.schemaVersion));
        Analytics analytics = this.analytics;
        jSONObject.putOpt(ANALYTICS, analytics != null ? analytics.serialize() : null);
        Authentication authentication = this.authentication;
        jSONObject.putOpt(AUTHENTICATION, authentication != null ? authentication.serialize() : null);
        jSONObject.putOpt(CREATED_AT, this.createdAt);
        jSONObject.putOpt(SUPPORT_NATIVE_REDIRECT, this.supportNativeRedirect);
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "SdkData(schemaVersion=" + this.schemaVersion + ", analytics=" + this.analytics + ", authentication=" + this.authentication + ", createdAt=" + this.createdAt + ", supportNativeRedirect=" + this.supportNativeRedirect + ")";
    }

    public SdkData(int i11, @Nullable Analytics analytics, @Nullable Authentication authentication, @Nullable Long l, @Nullable Boolean bool) {
        this.schemaVersion = i11;
        this.analytics = analytics;
        this.authentication = authentication;
        this.createdAt = l;
        this.supportNativeRedirect = bool;
    }
}
