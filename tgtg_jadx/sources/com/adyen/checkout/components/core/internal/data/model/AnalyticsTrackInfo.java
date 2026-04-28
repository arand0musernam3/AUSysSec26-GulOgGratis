package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import j4.s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 :2\u00020\u0001:\u0001:B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009c\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\n2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u000203HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\t\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013¨\u0006;"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "id", "", AnalyticsTrackInfo.TIMESTAMP, "", AnalyticsTrackInfo.COMPONENT, "type", AnalyticsTrackInfo.TARGET, AnalyticsTrackInfo.IS_STORED_PAYMENT_METHOD, "", AnalyticsTrackInfo.BRAND, "issuer", AnalyticsTrackInfo.VALIDATION_ERROR_CODE, AnalyticsTrackInfo.VALIDATION_ERROR_MESSAGE, AnalyticsTrackInfo.CONFIG_DATA, "", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBrand", "()Ljava/lang/String;", "getComponent", "getConfigData", "()Ljava/util/Map;", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIssuer", "getTarget", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "getValidationErrorCode", "getValidationErrorMessage", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo;", "equals", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsTrackInfo extends ModelObject {

    @NotNull
    private static final String BRAND = "brand";

    @NotNull
    private static final String COMPONENT = "component";

    @NotNull
    private static final String CONFIG_DATA = "configData";

    @NotNull
    private static final String ID = "id";

    @NotNull
    private static final String ISSUER = "issuer";

    @NotNull
    private static final String IS_STORED_PAYMENT_METHOD = "isStoredPaymentMethod";

    @NotNull
    private static final String TARGET = "target";

    @NotNull
    private static final String TIMESTAMP = "timestamp";

    @NotNull
    private static final String TYPE = "type";

    @NotNull
    private static final String VALIDATION_ERROR_CODE = "validationErrorCode";

    @NotNull
    private static final String VALIDATION_ERROR_MESSAGE = "validationErrorMessage";

    @Nullable
    private final String brand;

    @Nullable
    private final String component;

    @Nullable
    private final Map<String, String> configData;

    @NotNull
    private final String id;

    @Nullable
    private final Boolean isStoredPaymentMethod;

    @Nullable
    private final String issuer;

    @Nullable
    private final String target;

    @Nullable
    private final Long timestamp;

    @Nullable
    private final String type;

    @Nullable
    private final String validationErrorCode;

    @Nullable
    private final String validationErrorMessage;

    @NotNull
    public static final Parcelable.Creator<AnalyticsTrackInfo> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<AnalyticsTrackInfo> SERIALIZER = new ModelObject.Serializer<AnalyticsTrackInfo>() { // from class: com.adyen.checkout.components.core.internal.data.model.AnalyticsTrackInfo$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public AnalyticsTrackInfo deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String string = jsonObject.getString("id");
                string.getClass();
                return new AnalyticsTrackInfo(string, JsonUtilsKt.getLongOrNull(jsonObject, "timestamp"), JsonUtilsKt.getStringOrNull(jsonObject, "component"), JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, "target"), JsonUtilsKt.getBooleanOrNull(jsonObject, "isStoredPaymentMethod"), JsonUtilsKt.getStringOrNull(jsonObject, "brand"), JsonUtilsKt.getStringOrNull(jsonObject, IssuerListPaymentMethod.ISSUER), JsonUtilsKt.getStringOrNull(jsonObject, "validationErrorCode"), JsonUtilsKt.getStringOrNull(jsonObject, "validationErrorMessage"), JsonUtilsKt.getMapOrNull(jsonObject, "configData"));
            } catch (JSONException e5) {
                w.j(AnalyticsTrackInfo.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull AnalyticsTrackInfo modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", modelObject.getId());
                jSONObject.putOpt("timestamp", modelObject.getTimestamp());
                jSONObject.putOpt("component", modelObject.getComponent());
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("target", modelObject.getTarget());
                jSONObject.putOpt("isStoredPaymentMethod", modelObject.isStoredPaymentMethod());
                jSONObject.putOpt("brand", modelObject.getBrand());
                jSONObject.putOpt(IssuerListPaymentMethod.ISSUER, modelObject.getIssuer());
                jSONObject.putOpt("validationErrorCode", modelObject.getValidationErrorCode());
                jSONObject.putOpt("validationErrorMessage", modelObject.getValidationErrorMessage());
                Map<String, String> configData = modelObject.getConfigData();
                jSONObject.putOpt("configData", configData != null ? new JSONObject(configData) : null);
                return jSONObject;
            } catch (JSONException e5) {
                w.j(AnalyticsTrackInfo.class, e5);
                return null;
            }
        }
    };

    public AnalyticsTrackInfo(@NotNull String str, @Nullable Long l, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Map<String, String> map) {
        str.getClass();
        this.id = str;
        this.timestamp = l;
        this.component = str2;
        this.type = str3;
        this.target = str4;
        this.isStoredPaymentMethod = bool;
        this.brand = str5;
        this.issuer = str6;
        this.validationErrorCode = str7;
        this.validationErrorMessage = str8;
        this.configData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsTrackInfo copy$default(AnalyticsTrackInfo analyticsTrackInfo, String str, Long l, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = analyticsTrackInfo.id;
        }
        if ((i11 & 2) != 0) {
            l = analyticsTrackInfo.timestamp;
        }
        if ((i11 & 4) != 0) {
            str2 = analyticsTrackInfo.component;
        }
        if ((i11 & 8) != 0) {
            str3 = analyticsTrackInfo.type;
        }
        if ((i11 & 16) != 0) {
            str4 = analyticsTrackInfo.target;
        }
        if ((i11 & 32) != 0) {
            bool = analyticsTrackInfo.isStoredPaymentMethod;
        }
        if ((i11 & 64) != 0) {
            str5 = analyticsTrackInfo.brand;
        }
        if ((i11 & 128) != 0) {
            str6 = analyticsTrackInfo.issuer;
        }
        if ((i11 & 256) != 0) {
            str7 = analyticsTrackInfo.validationErrorCode;
        }
        if ((i11 & 512) != 0) {
            str8 = analyticsTrackInfo.validationErrorMessage;
        }
        if ((i11 & 1024) != 0) {
            map = analyticsTrackInfo.configData;
        }
        String str9 = str8;
        Map map2 = map;
        String str10 = str6;
        String str11 = str7;
        Boolean bool2 = bool;
        String str12 = str5;
        String str13 = str4;
        String str14 = str2;
        return analyticsTrackInfo.copy(str, l, str14, str3, str13, bool2, str12, str10, str11, str9, map2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getValidationErrorMessage() {
        return this.validationErrorMessage;
    }

    @Nullable
    public final Map<String, String> component11() {
        return this.configData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getComponent() {
        return this.component;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsStoredPaymentMethod() {
        return this.isStoredPaymentMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getValidationErrorCode() {
        return this.validationErrorCode;
    }

    @NotNull
    public final AnalyticsTrackInfo copy(@NotNull String id2, @Nullable Long timestamp, @Nullable String component, @Nullable String type, @Nullable String target, @Nullable Boolean isStoredPaymentMethod, @Nullable String brand, @Nullable String issuer, @Nullable String validationErrorCode, @Nullable String validationErrorMessage, @Nullable Map<String, String> configData) {
        id2.getClass();
        return new AnalyticsTrackInfo(id2, timestamp, component, type, target, isStoredPaymentMethod, brand, issuer, validationErrorCode, validationErrorMessage, configData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsTrackInfo)) {
            return false;
        }
        AnalyticsTrackInfo analyticsTrackInfo = (AnalyticsTrackInfo) other;
        return Intrinsics.areEqual(this.id, analyticsTrackInfo.id) && Intrinsics.areEqual(this.timestamp, analyticsTrackInfo.timestamp) && Intrinsics.areEqual(this.component, analyticsTrackInfo.component) && Intrinsics.areEqual(this.type, analyticsTrackInfo.type) && Intrinsics.areEqual(this.target, analyticsTrackInfo.target) && Intrinsics.areEqual(this.isStoredPaymentMethod, analyticsTrackInfo.isStoredPaymentMethod) && Intrinsics.areEqual(this.brand, analyticsTrackInfo.brand) && Intrinsics.areEqual(this.issuer, analyticsTrackInfo.issuer) && Intrinsics.areEqual(this.validationErrorCode, analyticsTrackInfo.validationErrorCode) && Intrinsics.areEqual(this.validationErrorMessage, analyticsTrackInfo.validationErrorMessage) && Intrinsics.areEqual(this.configData, analyticsTrackInfo.configData);
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getComponent() {
        return this.component;
    }

    @Nullable
    public final Map<String, String> getConfigData() {
        return this.configData;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getIssuer() {
        return this.issuer;
    }

    @Nullable
    public final String getTarget() {
        return this.target;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getValidationErrorCode() {
        return this.validationErrorCode;
    }

    @Nullable
    public final String getValidationErrorMessage() {
        return this.validationErrorMessage;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Long l = this.timestamp;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.component;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.target;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isStoredPaymentMethod;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.brand;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.issuer;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.validationErrorCode;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.validationErrorMessage;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, String> map = this.configData;
        return iHashCode10 + (map != null ? map.hashCode() : 0);
    }

    @Nullable
    public final Boolean isStoredPaymentMethod() {
        return this.isStoredPaymentMethod;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        Long l = this.timestamp;
        String str2 = this.component;
        String str3 = this.type;
        String str4 = this.target;
        Boolean bool = this.isStoredPaymentMethod;
        String str5 = this.brand;
        String str6 = this.issuer;
        String str7 = this.validationErrorCode;
        String str8 = this.validationErrorMessage;
        Map<String, String> map = this.configData;
        StringBuilder sb2 = new StringBuilder("AnalyticsTrackInfo(id=");
        sb2.append(str);
        sb2.append(", timestamp=");
        sb2.append(l);
        sb2.append(", component=");
        s.A(sb2, str2, ", type=", str3, ", target=");
        sb2.append(str4);
        sb2.append(", isStoredPaymentMethod=");
        sb2.append(bool);
        sb2.append(", brand=");
        s.A(sb2, str5, ", issuer=", str6, ", validationErrorCode=");
        s.A(sb2, str7, ", validationErrorMessage=", str8, ", configData=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.id);
        Long l = this.timestamp;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.component);
        parcel.writeString(this.type);
        parcel.writeString(this.target);
        Boolean bool = this.isStoredPaymentMethod;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool);
        }
        parcel.writeString(this.brand);
        parcel.writeString(this.issuer);
        parcel.writeString(this.validationErrorCode);
        parcel.writeString(this.validationErrorMessage);
        Map<String, String> map = this.configData;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnalyticsTrackInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsTrackInfo createFromParcel(@NotNull Parcel parcel) {
            LinkedHashMap linkedHashMap;
            parcel.getClass();
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new AnalyticsTrackInfo(string, lValueOf, string2, string3, string4, boolValueOf, string5, string6, string7, string8, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsTrackInfo[] newArray(int i11) {
            return new AnalyticsTrackInfo[i11];
        }
    }
}
