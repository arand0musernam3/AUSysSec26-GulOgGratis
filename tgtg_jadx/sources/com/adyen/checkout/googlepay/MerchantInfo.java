package com.adyen.checkout.googlepay;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001bHÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/adyen/checkout/googlepay/MerchantInfo;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", MerchantInfo.MERCHANT_NAME, "", MerchantInfo.MERCHANT_ID, MerchantInfo.SOFTWARE_INFO, "Lcom/adyen/checkout/googlepay/SoftwareInfo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/googlepay/SoftwareInfo;)V", "getMerchantId", "()Ljava/lang/String;", "setMerchantId", "(Ljava/lang/String;)V", "getMerchantName", "setMerchantName", "getSoftwareInfo", "()Lcom/adyen/checkout/googlepay/SoftwareInfo;", "setSoftwareInfo", "(Lcom/adyen/checkout/googlepay/SoftwareInfo;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MerchantInfo extends ModelObject {

    @NotNull
    private static final String MERCHANT_ID = "merchantId";

    @NotNull
    private static final String MERCHANT_NAME = "merchantName";

    @NotNull
    private static final String SOFTWARE_INFO = "softwareInfo";

    @Nullable
    private String merchantId;

    @Nullable
    private String merchantName;

    @Nullable
    private SoftwareInfo softwareInfo;

    @NotNull
    public static final Parcelable.Creator<MerchantInfo> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<MerchantInfo> SERIALIZER = new ModelObject.Serializer<MerchantInfo>() { // from class: com.adyen.checkout.googlepay.MerchantInfo$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public MerchantInfo deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new MerchantInfo(JsonUtilsKt.getStringOrNull(jsonObject, "merchantName"), JsonUtilsKt.getStringOrNull(jsonObject, "merchantId"), (SoftwareInfo) ModelUtils.deserializeOpt(jsonObject.optJSONObject("softwareInfo"), SoftwareInfo.SERIALIZER));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull MerchantInfo modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("merchantName", modelObject.getMerchantName());
                jSONObject.putOpt("merchantId", modelObject.getMerchantId());
                jSONObject.putOpt("softwareInfo", ModelUtils.serializeOpt(modelObject.getSoftwareInfo(), SoftwareInfo.SERIALIZER));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(MerchantInfo.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ MerchantInfo(String str, String str2, SoftwareInfo softwareInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : softwareInfo);
    }

    public static /* synthetic */ MerchantInfo copy$default(MerchantInfo merchantInfo, String str, String str2, SoftwareInfo softwareInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = merchantInfo.merchantName;
        }
        if ((i11 & 2) != 0) {
            str2 = merchantInfo.merchantId;
        }
        if ((i11 & 4) != 0) {
            softwareInfo = merchantInfo.softwareInfo;
        }
        return merchantInfo.copy(str, str2, softwareInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SoftwareInfo getSoftwareInfo() {
        return this.softwareInfo;
    }

    @NotNull
    public final MerchantInfo copy(@Nullable String merchantName, @Nullable String merchantId, @Nullable SoftwareInfo softwareInfo) {
        return new MerchantInfo(merchantName, merchantId, softwareInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantInfo)) {
            return false;
        }
        MerchantInfo merchantInfo = (MerchantInfo) other;
        return Intrinsics.areEqual(this.merchantName, merchantInfo.merchantName) && Intrinsics.areEqual(this.merchantId, merchantInfo.merchantId) && Intrinsics.areEqual(this.softwareInfo, merchantInfo.softwareInfo);
    }

    @Nullable
    public final String getMerchantId() {
        return this.merchantId;
    }

    @Nullable
    public final String getMerchantName() {
        return this.merchantName;
    }

    @Nullable
    public final SoftwareInfo getSoftwareInfo() {
        return this.softwareInfo;
    }

    public int hashCode() {
        String str = this.merchantName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.merchantId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SoftwareInfo softwareInfo = this.softwareInfo;
        return iHashCode2 + (softwareInfo != null ? softwareInfo.hashCode() : 0);
    }

    public final void setMerchantId(@Nullable String str) {
        this.merchantId = str;
    }

    public final void setMerchantName(@Nullable String str) {
        this.merchantName = str;
    }

    public final void setSoftwareInfo(@Nullable SoftwareInfo softwareInfo) {
        this.softwareInfo = softwareInfo;
    }

    @NotNull
    public String toString() {
        String str = this.merchantName;
        String str2 = this.merchantId;
        SoftwareInfo softwareInfo = this.softwareInfo;
        StringBuilder sbT = f.t("MerchantInfo(merchantName=", str, ", merchantId=", str2, ", softwareInfo=");
        sbT.append(softwareInfo);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.merchantName);
        parcel.writeString(this.merchantId);
        SoftwareInfo softwareInfo = this.softwareInfo;
        if (softwareInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            softwareInfo.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MerchantInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MerchantInfo createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new MerchantInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SoftwareInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final MerchantInfo[] newArray(int i11) {
            return new MerchantInfo[i11];
        }
    }

    public MerchantInfo() {
        this(null, null, null, 7, null);
    }

    public MerchantInfo(@Nullable String str, @Nullable String str2, @Nullable SoftwareInfo softwareInfo) {
        this.merchantName = str;
        this.merchantId = str2;
        this.softwareInfo = softwareInfo;
    }
}
