package com.adyen.checkout.components.core.action;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.appsflyer.AppsFlyerProperties;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u00061"}, d2 = {"Lcom/adyen/checkout/components/core/action/WeChatPaySdkData;", "Lcom/adyen/checkout/components/core/action/SdkData;", "appid", "", WeChatPaySdkData.NONCE_STR, WeChatPaySdkData.PACKAGE_VALUE, WeChatPaySdkData.PARTNER_ID, WeChatPaySdkData.PREPAY_ID, WeChatPaySdkData.SIGN, WeChatPaySdkData.TIMESTAMP, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppid", "()Ljava/lang/String;", "setAppid", "(Ljava/lang/String;)V", "getNoncestr", "setNoncestr", "getPackageValue", "setPackageValue", "getPartnerid", "setPartnerid", "getPrepayid", "setPrepayid", "getSign", "setSign", "getTimestamp", "setTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class WeChatPaySdkData extends SdkData {

    @NotNull
    private static final String APP_ID = "appid";

    @NotNull
    private static final String NONCE_STR = "noncestr";

    @NotNull
    private static final String PACKAGE_VALUE = "packageValue";

    @NotNull
    private static final String PARTNER_ID = "partnerid";

    @NotNull
    private static final String PREPAY_ID = "prepayid";

    @NotNull
    private static final String SIGN = "sign";

    @NotNull
    private static final String TIMESTAMP = "timestamp";

    @Nullable
    private String appid;

    @Nullable
    private String noncestr;

    @Nullable
    private String packageValue;

    @Nullable
    private String partnerid;

    @Nullable
    private String prepayid;

    @Nullable
    private String sign;

    @Nullable
    private String timestamp;

    @NotNull
    public static final Parcelable.Creator<WeChatPaySdkData> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<WeChatPaySdkData> SERIALIZER = new ModelObject.Serializer<WeChatPaySdkData>() { // from class: com.adyen.checkout.components.core.action.WeChatPaySdkData$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public WeChatPaySdkData deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new WeChatPaySdkData(JsonUtilsKt.getStringOrNull(jsonObject, AppsFlyerProperties.APP_ID), JsonUtilsKt.getStringOrNull(jsonObject, "noncestr"), JsonUtilsKt.getStringOrNull(jsonObject, "packageValue"), JsonUtilsKt.getStringOrNull(jsonObject, "partnerid"), JsonUtilsKt.getStringOrNull(jsonObject, "prepayid"), JsonUtilsKt.getStringOrNull(jsonObject, "sign"), JsonUtilsKt.getStringOrNull(jsonObject, "timestamp"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull WeChatPaySdkData modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(AppsFlyerProperties.APP_ID, modelObject.getAppid());
                jSONObject.putOpt("noncestr", modelObject.getNoncestr());
                jSONObject.putOpt("packageValue", modelObject.getPackageValue());
                jSONObject.putOpt("partnerid", modelObject.getPartnerid());
                jSONObject.putOpt("prepayid", modelObject.getPrepayid());
                jSONObject.putOpt("sign", modelObject.getSign());
                jSONObject.putOpt("timestamp", modelObject.getTimestamp());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(WeChatPaySdkData.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ WeChatPaySdkData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }

    public static /* synthetic */ WeChatPaySdkData copy$default(WeChatPaySdkData weChatPaySdkData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = weChatPaySdkData.appid;
        }
        if ((i11 & 2) != 0) {
            str2 = weChatPaySdkData.noncestr;
        }
        if ((i11 & 4) != 0) {
            str3 = weChatPaySdkData.packageValue;
        }
        if ((i11 & 8) != 0) {
            str4 = weChatPaySdkData.partnerid;
        }
        if ((i11 & 16) != 0) {
            str5 = weChatPaySdkData.prepayid;
        }
        if ((i11 & 32) != 0) {
            str6 = weChatPaySdkData.sign;
        }
        if ((i11 & 64) != 0) {
            str7 = weChatPaySdkData.timestamp;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return weChatPaySdkData.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppid() {
        return this.appid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoncestr() {
        return this.noncestr;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPackageValue() {
        return this.packageValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPartnerid() {
        return this.partnerid;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrepayid() {
        return this.prepayid;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final WeChatPaySdkData copy(@Nullable String appid, @Nullable String noncestr, @Nullable String packageValue, @Nullable String partnerid, @Nullable String prepayid, @Nullable String sign, @Nullable String timestamp) {
        return new WeChatPaySdkData(appid, noncestr, packageValue, partnerid, prepayid, sign, timestamp);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeChatPaySdkData)) {
            return false;
        }
        WeChatPaySdkData weChatPaySdkData = (WeChatPaySdkData) other;
        return Intrinsics.areEqual(this.appid, weChatPaySdkData.appid) && Intrinsics.areEqual(this.noncestr, weChatPaySdkData.noncestr) && Intrinsics.areEqual(this.packageValue, weChatPaySdkData.packageValue) && Intrinsics.areEqual(this.partnerid, weChatPaySdkData.partnerid) && Intrinsics.areEqual(this.prepayid, weChatPaySdkData.prepayid) && Intrinsics.areEqual(this.sign, weChatPaySdkData.sign) && Intrinsics.areEqual(this.timestamp, weChatPaySdkData.timestamp);
    }

    @Nullable
    public final String getAppid() {
        return this.appid;
    }

    @Nullable
    public final String getNoncestr() {
        return this.noncestr;
    }

    @Nullable
    public final String getPackageValue() {
        return this.packageValue;
    }

    @Nullable
    public final String getPartnerid() {
        return this.partnerid;
    }

    @Nullable
    public final String getPrepayid() {
        return this.prepayid;
    }

    @Nullable
    public final String getSign() {
        return this.sign;
    }

    @Nullable
    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.appid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.noncestr;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.packageValue;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.partnerid;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.prepayid;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sign;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.timestamp;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAppid(@Nullable String str) {
        this.appid = str;
    }

    public final void setNoncestr(@Nullable String str) {
        this.noncestr = str;
    }

    public final void setPackageValue(@Nullable String str) {
        this.packageValue = str;
    }

    public final void setPartnerid(@Nullable String str) {
        this.partnerid = str;
    }

    public final void setPrepayid(@Nullable String str) {
        this.prepayid = str;
    }

    public final void setSign(@Nullable String str) {
        this.sign = str;
    }

    public final void setTimestamp(@Nullable String str) {
        this.timestamp = str;
    }

    @NotNull
    public String toString() {
        String str = this.appid;
        String str2 = this.noncestr;
        String str3 = this.packageValue;
        String str4 = this.partnerid;
        String str5 = this.prepayid;
        String str6 = this.sign;
        String str7 = this.timestamp;
        StringBuilder sbT = f.t("WeChatPaySdkData(appid=", str, ", noncestr=", str2, ", packageValue=");
        s.A(sbT, str3, ", partnerid=", str4, ", prepayid=");
        s.A(sbT, str5, ", sign=", str6, ", timestamp=");
        return k.p(sbT, str7, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.appid);
        parcel.writeString(this.noncestr);
        parcel.writeString(this.packageValue);
        parcel.writeString(this.partnerid);
        parcel.writeString(this.prepayid);
        parcel.writeString(this.sign);
        parcel.writeString(this.timestamp);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WeChatPaySdkData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WeChatPaySdkData createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new WeChatPaySdkData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final WeChatPaySdkData[] newArray(int i11) {
            return new WeChatPaySdkData[i11];
        }
    }

    public WeChatPaySdkData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public WeChatPaySdkData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.appid = str;
        this.noncestr = str2;
        this.packageValue = str3;
        this.partnerid = str4;
        this.prepayid = str5;
        this.sign = str6;
        this.timestamp = str7;
    }
}
