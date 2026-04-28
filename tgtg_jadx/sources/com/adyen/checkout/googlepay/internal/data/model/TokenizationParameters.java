package com.adyen.checkout.googlepay.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/data/model/TokenizationParameters;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", TokenizationParameters.GATEWAY, "", TokenizationParameters.GATEWAY_MERCHANT_ID, "(Ljava/lang/String;Ljava/lang/String;)V", "getGateway", "()Ljava/lang/String;", "setGateway", "(Ljava/lang/String;)V", "getGatewayMerchantId", "setGatewayMerchantId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TokenizationParameters extends ModelObject {

    @NotNull
    private static final String GATEWAY = "gateway";

    @NotNull
    private static final String GATEWAY_MERCHANT_ID = "gatewayMerchantId";

    @Nullable
    private String gateway;

    @Nullable
    private String gatewayMerchantId;

    @NotNull
    public static final Parcelable.Creator<TokenizationParameters> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<TokenizationParameters> SERIALIZER = new ModelObject.Serializer<TokenizationParameters>() { // from class: com.adyen.checkout.googlepay.internal.data.model.TokenizationParameters$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public TokenizationParameters deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new TokenizationParameters(JsonUtilsKt.getStringOrNull(jsonObject, "gateway"), JsonUtilsKt.getStringOrNull(jsonObject, "gatewayMerchantId"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull TokenizationParameters modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("gateway", modelObject.getGateway());
                jSONObject.putOpt("gatewayMerchantId", modelObject.getGatewayMerchantId());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(TokenizationParameters.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ TokenizationParameters(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ TokenizationParameters copy$default(TokenizationParameters tokenizationParameters, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tokenizationParameters.gateway;
        }
        if ((i11 & 2) != 0) {
            str2 = tokenizationParameters.gatewayMerchantId;
        }
        return tokenizationParameters.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGateway() {
        return this.gateway;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    @NotNull
    public final TokenizationParameters copy(@Nullable String gateway, @Nullable String gatewayMerchantId) {
        return new TokenizationParameters(gateway, gatewayMerchantId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenizationParameters)) {
            return false;
        }
        TokenizationParameters tokenizationParameters = (TokenizationParameters) other;
        return Intrinsics.areEqual(this.gateway, tokenizationParameters.gateway) && Intrinsics.areEqual(this.gatewayMerchantId, tokenizationParameters.gatewayMerchantId);
    }

    @Nullable
    public final String getGateway() {
        return this.gateway;
    }

    @Nullable
    public final String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    public int hashCode() {
        String str = this.gateway;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gatewayMerchantId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setGateway(@Nullable String str) {
        this.gateway = str;
    }

    public final void setGatewayMerchantId(@Nullable String str) {
        this.gatewayMerchantId = str;
    }

    @NotNull
    public String toString() {
        return a.d("TokenizationParameters(gateway=", this.gateway, ", gatewayMerchantId=", this.gatewayMerchantId, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.gateway);
        parcel.writeString(this.gatewayMerchantId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TokenizationParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TokenizationParameters createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new TokenizationParameters(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TokenizationParameters[] newArray(int i11) {
            return new TokenizationParameters[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TokenizationParameters() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public TokenizationParameters(@Nullable String str, @Nullable String str2) {
        this.gateway = str;
        this.gatewayMerchantId = str2;
    }
}
