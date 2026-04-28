package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.internal.data.model.JsonUtils;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import e0.f;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 L2\u00020\u0001:\u0001LB«\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010*J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÔ\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\u0011HÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\u0019\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001b¨\u0006M"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", AnalyticsSetupRequest.VERSION, "", "channel", AnalyticsSetupRequest.PLATFORM, AnalyticsSetupRequest.LOCALE, AnalyticsSetupRequest.COMPONENT, AnalyticsSetupRequest.FLAVOR, AnalyticsSetupRequest.LEVEL, AnalyticsSetupRequest.DEVICE_BRAND, AnalyticsSetupRequest.DEVICE_MODEL, AnalyticsSetupRequest.REFERRER, AnalyticsSetupRequest.SYSTEM_VERSION, AnalyticsSetupRequest.CONTAINER_WIDTH, "", AnalyticsSetupRequest.SCREEN_WIDTH, "", AnalyticsSetupRequest.PAYMENT_METHODS, "", AnalyticsSetupRequest.AMOUNT, "Lcom/adyen/checkout/components/core/Amount;", AnalyticsSetupRequest.SESSION_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getChannel", "()Ljava/lang/String;", "getComponent", "getContainerWidth", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDeviceBrand", "getDeviceModel", "getFlavor", "getLevel", "getLocale", "getPaymentMethods", "()Ljava/util/List;", "getPlatform", "getReferrer", "getScreenWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSessionId", "getSystemVersion", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsSetupRequest extends ModelObject {

    @NotNull
    private static final String AMOUNT = "amount";

    @NotNull
    private static final String CHANNEL = "channel";

    @NotNull
    private static final String COMPONENT = "component";

    @NotNull
    private static final String CONTAINER_WIDTH = "containerWidth";

    @NotNull
    private static final String DEVICE_BRAND = "deviceBrand";

    @NotNull
    private static final String DEVICE_MODEL = "deviceModel";

    @NotNull
    private static final String FLAVOR = "flavor";

    @NotNull
    private static final String LEVEL = "level";

    @NotNull
    private static final String LOCALE = "locale";

    @NotNull
    private static final String PAYMENT_METHODS = "paymentMethods";

    @NotNull
    private static final String PLATFORM = "platform";

    @NotNull
    private static final String REFERRER = "referrer";

    @NotNull
    private static final String SCREEN_WIDTH = "screenWidth";

    @NotNull
    private static final String SESSION_ID = "sessionId";

    @NotNull
    private static final String SYSTEM_VERSION = "systemVersion";

    @NotNull
    private static final String VERSION = "version";

    @Nullable
    private final Amount amount;

    @Nullable
    private final String channel;

    @Nullable
    private final String component;

    @Nullable
    private final Long containerWidth;

    @Nullable
    private final String deviceBrand;

    @Nullable
    private final String deviceModel;

    @Nullable
    private final String flavor;

    @Nullable
    private final String level;

    @Nullable
    private final String locale;

    @Nullable
    private final List<String> paymentMethods;

    @Nullable
    private final String platform;

    @Nullable
    private final String referrer;

    @Nullable
    private final Integer screenWidth;

    @Nullable
    private final String sessionId;

    @Nullable
    private final String systemVersion;

    @Nullable
    private final String version;

    @NotNull
    public static final Parcelable.Creator<AnalyticsSetupRequest> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<AnalyticsSetupRequest> SERIALIZER = new ModelObject.Serializer<AnalyticsSetupRequest>() { // from class: com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public AnalyticsSetupRequest deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new AnalyticsSetupRequest(JsonUtilsKt.getStringOrNull(jsonObject, "version"), JsonUtilsKt.getStringOrNull(jsonObject, "channel"), JsonUtilsKt.getStringOrNull(jsonObject, "platform"), JsonUtilsKt.getStringOrNull(jsonObject, "locale"), JsonUtilsKt.getStringOrNull(jsonObject, "component"), JsonUtilsKt.getStringOrNull(jsonObject, "flavor"), JsonUtilsKt.getStringOrNull(jsonObject, "level"), JsonUtilsKt.getStringOrNull(jsonObject, "deviceBrand"), JsonUtilsKt.getStringOrNull(jsonObject, "deviceModel"), JsonUtilsKt.getStringOrNull(jsonObject, "referrer"), JsonUtilsKt.getStringOrNull(jsonObject, "systemVersion"), JsonUtilsKt.getLongOrNull(jsonObject, "containerWidth"), JsonUtilsKt.getIntOrNull(jsonObject, "screenWidth"), JsonUtilsKt.optStringList(jsonObject, "paymentMethods"), (Amount) ModelUtils.deserializeOpt(jsonObject.optJSONObject("amount"), Amount.SERIALIZER), JsonUtilsKt.getStringOrNull(jsonObject, "sessionId"));
            } catch (JSONException e5) {
                w.j(AnalyticsSetupRequest.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull AnalyticsSetupRequest modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("version", modelObject.getVersion());
                jSONObject.putOpt("channel", modelObject.getChannel());
                jSONObject.putOpt("platform", modelObject.getPlatform());
                jSONObject.putOpt("locale", modelObject.getLocale());
                jSONObject.putOpt("component", modelObject.getComponent());
                jSONObject.putOpt("flavor", modelObject.getFlavor());
                jSONObject.putOpt("level", modelObject.getLevel());
                jSONObject.putOpt("deviceBrand", modelObject.getDeviceBrand());
                jSONObject.putOpt("deviceModel", modelObject.getDeviceModel());
                jSONObject.putOpt("referrer", modelObject.getReferrer());
                jSONObject.putOpt("systemVersion", modelObject.getSystemVersion());
                jSONObject.putOpt("containerWidth", modelObject.getContainerWidth());
                jSONObject.putOpt("screenWidth", modelObject.getScreenWidth());
                jSONObject.putOpt("paymentMethods", JsonUtils.serializeOptStringList(modelObject.getPaymentMethods()));
                jSONObject.putOpt("amount", ModelUtils.serializeOpt(modelObject.getAmount(), Amount.SERIALIZER));
                jSONObject.putOpt("sessionId", modelObject.getSessionId());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(AnalyticsSetupRequest.class, e5);
                return null;
            }
        }
    };

    public AnalyticsSetupRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Long l, @Nullable Integer num, @Nullable List<String> list, @Nullable Amount amount, @Nullable String str12) {
        this.version = str;
        this.channel = str2;
        this.platform = str3;
        this.locale = str4;
        this.component = str5;
        this.flavor = str6;
        this.level = str7;
        this.deviceBrand = str8;
        this.deviceModel = str9;
        this.referrer = str10;
        this.systemVersion = str11;
        this.containerWidth = l;
        this.screenWidth = num;
        this.paymentMethods = list;
        this.amount = amount;
        this.sessionId = str12;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReferrer() {
        return this.referrer;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSystemVersion() {
        return this.systemVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getContainerWidth() {
        return this.containerWidth;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getScreenWidth() {
        return this.screenWidth;
    }

    @Nullable
    public final List<String> component14() {
        return this.paymentMethods;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getComponent() {
        return this.component;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFlavor() {
        return this.flavor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final AnalyticsSetupRequest copy(@Nullable String version, @Nullable String channel, @Nullable String platform, @Nullable String locale, @Nullable String component, @Nullable String flavor, @Nullable String level, @Nullable String deviceBrand, @Nullable String deviceModel, @Nullable String referrer, @Nullable String systemVersion, @Nullable Long containerWidth, @Nullable Integer screenWidth, @Nullable List<String> paymentMethods, @Nullable Amount amount, @Nullable String sessionId) {
        return new AnalyticsSetupRequest(version, channel, platform, locale, component, flavor, level, deviceBrand, deviceModel, referrer, systemVersion, containerWidth, screenWidth, paymentMethods, amount, sessionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsSetupRequest)) {
            return false;
        }
        AnalyticsSetupRequest analyticsSetupRequest = (AnalyticsSetupRequest) other;
        return Intrinsics.areEqual(this.version, analyticsSetupRequest.version) && Intrinsics.areEqual(this.channel, analyticsSetupRequest.channel) && Intrinsics.areEqual(this.platform, analyticsSetupRequest.platform) && Intrinsics.areEqual(this.locale, analyticsSetupRequest.locale) && Intrinsics.areEqual(this.component, analyticsSetupRequest.component) && Intrinsics.areEqual(this.flavor, analyticsSetupRequest.flavor) && Intrinsics.areEqual(this.level, analyticsSetupRequest.level) && Intrinsics.areEqual(this.deviceBrand, analyticsSetupRequest.deviceBrand) && Intrinsics.areEqual(this.deviceModel, analyticsSetupRequest.deviceModel) && Intrinsics.areEqual(this.referrer, analyticsSetupRequest.referrer) && Intrinsics.areEqual(this.systemVersion, analyticsSetupRequest.systemVersion) && Intrinsics.areEqual(this.containerWidth, analyticsSetupRequest.containerWidth) && Intrinsics.areEqual(this.screenWidth, analyticsSetupRequest.screenWidth) && Intrinsics.areEqual(this.paymentMethods, analyticsSetupRequest.paymentMethods) && Intrinsics.areEqual(this.amount, analyticsSetupRequest.amount) && Intrinsics.areEqual(this.sessionId, analyticsSetupRequest.sessionId);
    }

    @Nullable
    public final Amount getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getComponent() {
        return this.component;
    }

    @Nullable
    public final Long getContainerWidth() {
        return this.containerWidth;
    }

    @Nullable
    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    @Nullable
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @Nullable
    public final String getFlavor() {
        return this.flavor;
    }

    @Nullable
    public final String getLevel() {
        return this.level;
    }

    @Nullable
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final List<String> getPaymentMethods() {
        return this.paymentMethods;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getReferrer() {
        return this.referrer;
    }

    @Nullable
    public final Integer getScreenWidth() {
        return this.screenWidth;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final String getSystemVersion() {
        return this.systemVersion;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.platform;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.locale;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.component;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.flavor;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.level;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deviceBrand;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.deviceModel;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.referrer;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.systemVersion;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Long l = this.containerWidth;
        int iHashCode12 = (iHashCode11 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.screenWidth;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.paymentMethods;
        int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
        Amount amount = this.amount;
        int iHashCode15 = (iHashCode14 + (amount == null ? 0 : amount.hashCode())) * 31;
        String str12 = this.sessionId;
        return iHashCode15 + (str12 != null ? str12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.version;
        String str2 = this.channel;
        String str3 = this.platform;
        String str4 = this.locale;
        String str5 = this.component;
        String str6 = this.flavor;
        String str7 = this.level;
        String str8 = this.deviceBrand;
        String str9 = this.deviceModel;
        String str10 = this.referrer;
        String str11 = this.systemVersion;
        Long l = this.containerWidth;
        Integer num = this.screenWidth;
        List<String> list = this.paymentMethods;
        Amount amount = this.amount;
        String str12 = this.sessionId;
        StringBuilder sbT = f.t("AnalyticsSetupRequest(version=", str, ", channel=", str2, ", platform=");
        s.A(sbT, str3, ", locale=", str4, ", component=");
        s.A(sbT, str5, ", flavor=", str6, ", level=");
        s.A(sbT, str7, ", deviceBrand=", str8, ", deviceModel=");
        s.A(sbT, str9, ", referrer=", str10, ", systemVersion=");
        sbT.append(str11);
        sbT.append(", containerWidth=");
        sbT.append(l);
        sbT.append(", screenWidth=");
        sbT.append(num);
        sbT.append(", paymentMethods=");
        sbT.append(list);
        sbT.append(", amount=");
        sbT.append(amount);
        sbT.append(", sessionId=");
        sbT.append(str12);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.version);
        parcel.writeString(this.channel);
        parcel.writeString(this.platform);
        parcel.writeString(this.locale);
        parcel.writeString(this.component);
        parcel.writeString(this.flavor);
        parcel.writeString(this.level);
        parcel.writeString(this.deviceBrand);
        parcel.writeString(this.deviceModel);
        parcel.writeString(this.referrer);
        parcel.writeString(this.systemVersion);
        Long l = this.containerWidth;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.screenWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i.w(parcel, 1, num);
        }
        parcel.writeStringList(this.paymentMethods);
        Amount amount = this.amount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.sessionId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnalyticsSetupRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest, still in use, count: 2, list:
              (r0v0 com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest) from 0x0063: MOVE (r16v1 com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest) = (r0v0 com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest) (LINE:100)
              (r0v0 com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest) from 0x005c: MOVE (r16v4 com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest) = (r0v0 com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest) (LINE:93)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        @Override // android.os.Parcelable.Creator
        @org.jetbrains.annotations.NotNull
        public final com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest createFromParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r19) {
            /*
                r18 = this;
                r19.getClass()
                com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest r0 = new com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest
                java.lang.String r1 = r19.readString()
                java.lang.String r2 = r19.readString()
                java.lang.String r3 = r19.readString()
                java.lang.String r4 = r19.readString()
                java.lang.String r5 = r19.readString()
                java.lang.String r6 = r19.readString()
                java.lang.String r7 = r19.readString()
                java.lang.String r8 = r19.readString()
                java.lang.String r9 = r19.readString()
                java.lang.String r10 = r19.readString()
                java.lang.String r11 = r19.readString()
                int r12 = r19.readInt()
                r13 = 0
                if (r12 != 0) goto L3a
                r12 = r13
                goto L42
            L3a:
                long r14 = r19.readLong()
                java.lang.Long r12 = java.lang.Long.valueOf(r14)
            L42:
                int r14 = r19.readInt()
                if (r14 != 0) goto L4a
                r14 = r13
                goto L52
            L4a:
                int r14 = r19.readInt()
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            L52:
                java.util.ArrayList r15 = r19.createStringArrayList()
                int r16 = r19.readInt()
                if (r16 != 0) goto L61
                r16 = r0
                r0 = r19
                goto L6b
            L61:
                android.os.Parcelable$Creator<com.adyen.checkout.components.core.Amount> r13 = com.adyen.checkout.components.core.Amount.CREATOR
                r16 = r0
                r0 = r19
                java.lang.Object r13 = r13.createFromParcel(r0)
            L6b:
                com.adyen.checkout.components.core.Amount r13 = (com.adyen.checkout.components.core.Amount) r13
                java.lang.String r0 = r0.readString()
                r17 = r16
                r16 = r0
                r0 = r17
                r17 = r15
                r15 = r13
                r13 = r14
                r14 = r17
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest.Creator.createFromParcel(android.os.Parcel):com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupRequest");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsSetupRequest[] newArray(int i11) {
            return new AnalyticsSetupRequest[i11];
        }
    }
}
