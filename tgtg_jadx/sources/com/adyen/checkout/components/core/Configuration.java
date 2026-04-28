package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020$HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006,"}, d2 = {"Lcom/adyen/checkout/components/core/Configuration;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", Configuration.MERCHANT_ID, "", Configuration.GATEWAY_MERCHANT_ID, Configuration.INTENT, Configuration.KOREAN_AUTHENTICATION_REQUIRED, "clientId", Configuration.SCOPE_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "getGatewayMerchantId", "setGatewayMerchantId", "getIntent", "setIntent", "getKoreanAuthenticationRequired", "setKoreanAuthenticationRequired", "getMerchantId", "setMerchantId", "getScopeId", "setScopeId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Configuration extends ModelObject {

    @NotNull
    private static final String CLIENT_ID = "clientId";

    @NotNull
    private static final String GATEWAY_MERCHANT_ID = "gatewayMerchantId";

    @NotNull
    private static final String INTENT = "intent";

    @NotNull
    private static final String KOREAN_AUTHENTICATION_REQUIRED = "koreanAuthenticationRequired";

    @NotNull
    private static final String MERCHANT_ID = "merchantId";

    @NotNull
    private static final String SCOPE_ID = "scopeId";

    @Nullable
    private String clientId;

    @Nullable
    private String gatewayMerchantId;

    @Nullable
    private String intent;

    @Nullable
    private String koreanAuthenticationRequired;

    @Nullable
    private String merchantId;

    @Nullable
    private String scopeId;

    @NotNull
    public static final Parcelable.Creator<Configuration> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<Configuration> SERIALIZER = new ModelObject.Serializer<Configuration>() { // from class: com.adyen.checkout.components.core.Configuration$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public Configuration deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new Configuration(JsonUtilsKt.getStringOrNull(jsonObject, "merchantId"), JsonUtilsKt.getStringOrNull(jsonObject, "gatewayMerchantId"), JsonUtilsKt.getStringOrNull(jsonObject, "intent"), JsonUtilsKt.getStringOrNull(jsonObject, "koreanAuthenticationRequired"), JsonUtilsKt.getStringOrNull(jsonObject, Bayeux.KEY_CLIENT_ID), JsonUtilsKt.getStringOrNull(jsonObject, "scopeId"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull Configuration modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("merchantId", modelObject.getMerchantId());
                jSONObject.putOpt("gatewayMerchantId", modelObject.getGatewayMerchantId());
                jSONObject.putOpt("intent", modelObject.getIntent());
                jSONObject.putOpt("koreanAuthenticationRequired", modelObject.getKoreanAuthenticationRequired());
                jSONObject.putOpt(Bayeux.KEY_CLIENT_ID, modelObject.getClientId());
                jSONObject.putOpt("scopeId", modelObject.getScopeId());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(PaymentMethod.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ Configuration(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = configuration.merchantId;
        }
        if ((i11 & 2) != 0) {
            str2 = configuration.gatewayMerchantId;
        }
        if ((i11 & 4) != 0) {
            str3 = configuration.intent;
        }
        if ((i11 & 8) != 0) {
            str4 = configuration.koreanAuthenticationRequired;
        }
        if ((i11 & 16) != 0) {
            str5 = configuration.clientId;
        }
        if ((i11 & 32) != 0) {
            str6 = configuration.scopeId;
        }
        String str7 = str5;
        String str8 = str6;
        return configuration.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIntent() {
        return this.intent;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKoreanAuthenticationRequired() {
        return this.koreanAuthenticationRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getScopeId() {
        return this.scopeId;
    }

    @NotNull
    public final Configuration copy(@Nullable String merchantId, @Nullable String gatewayMerchantId, @Nullable String intent, @Nullable String koreanAuthenticationRequired, @Nullable String clientId, @Nullable String scopeId) {
        return new Configuration(merchantId, gatewayMerchantId, intent, koreanAuthenticationRequired, clientId, scopeId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        return Intrinsics.areEqual(this.merchantId, configuration.merchantId) && Intrinsics.areEqual(this.gatewayMerchantId, configuration.gatewayMerchantId) && Intrinsics.areEqual(this.intent, configuration.intent) && Intrinsics.areEqual(this.koreanAuthenticationRequired, configuration.koreanAuthenticationRequired) && Intrinsics.areEqual(this.clientId, configuration.clientId) && Intrinsics.areEqual(this.scopeId, configuration.scopeId);
    }

    @Nullable
    public final String getClientId() {
        return this.clientId;
    }

    @Nullable
    public final String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    @Nullable
    public final String getIntent() {
        return this.intent;
    }

    @Nullable
    public final String getKoreanAuthenticationRequired() {
        return this.koreanAuthenticationRequired;
    }

    @Nullable
    public final String getMerchantId() {
        return this.merchantId;
    }

    @Nullable
    public final String getScopeId() {
        return this.scopeId;
    }

    public int hashCode() {
        String str = this.merchantId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gatewayMerchantId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.intent;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.koreanAuthenticationRequired;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.clientId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.scopeId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setClientId(@Nullable String str) {
        this.clientId = str;
    }

    public final void setGatewayMerchantId(@Nullable String str) {
        this.gatewayMerchantId = str;
    }

    public final void setIntent(@Nullable String str) {
        this.intent = str;
    }

    public final void setKoreanAuthenticationRequired(@Nullable String str) {
        this.koreanAuthenticationRequired = str;
    }

    public final void setMerchantId(@Nullable String str) {
        this.merchantId = str;
    }

    public final void setScopeId(@Nullable String str) {
        this.scopeId = str;
    }

    @NotNull
    public String toString() {
        String str = this.merchantId;
        String str2 = this.gatewayMerchantId;
        String str3 = this.intent;
        String str4 = this.koreanAuthenticationRequired;
        String str5 = this.clientId;
        String str6 = this.scopeId;
        StringBuilder sbT = f.t("Configuration(merchantId=", str, ", gatewayMerchantId=", str2, ", intent=");
        s.A(sbT, str3, ", koreanAuthenticationRequired=", str4, ", clientId=");
        return f.o(sbT, str5, ", scopeId=", str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.merchantId);
        parcel.writeString(this.gatewayMerchantId);
        parcel.writeString(this.intent);
        parcel.writeString(this.koreanAuthenticationRequired);
        parcel.writeString(this.clientId);
        parcel.writeString(this.scopeId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Configuration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Configuration createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new Configuration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Configuration[] newArray(int i11) {
            return new Configuration[i11];
        }
    }

    public Configuration() {
        this(null, null, null, null, null, null, 63, null);
    }

    public Configuration(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.merchantId = str;
        this.gatewayMerchantId = str2;
        this.intent = str3;
        this.koreanAuthenticationRequired = str4;
        this.clientId = str5;
        this.scopeId = str6;
    }
}
