package com.adyen.checkout.googlepay.internal.data.model;

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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u0001/BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020(HÖ\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u00060"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/data/model/TransactionInfoModel;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "currencyCode", "", TransactionInfoModel.COUNTRY_CODE, TransactionInfoModel.TRANSACTION_ID, TransactionInfoModel.TOTAL_PRICE_STATUS, TransactionInfoModel.TOTAL_PRICE, TransactionInfoModel.TOTAL_PRICE_LABEL, TransactionInfoModel.CHECKOUT_OPTION, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCheckoutOption", "()Ljava/lang/String;", "setCheckoutOption", "(Ljava/lang/String;)V", "getCountryCode", "setCountryCode", "getCurrencyCode", "setCurrencyCode", "getTotalPrice", "setTotalPrice", "getTotalPriceLabel", "setTotalPriceLabel", "getTotalPriceStatus", "setTotalPriceStatus", "getTransactionId", "setTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TransactionInfoModel extends ModelObject {

    @NotNull
    private static final String CHECKOUT_OPTION = "checkoutOption";

    @NotNull
    private static final String COUNTRY_CODE = "countryCode";

    @NotNull
    private static final String CURRENCY_CODE = "currencyCode";

    @NotNull
    private static final String TOTAL_PRICE = "totalPrice";

    @NotNull
    private static final String TOTAL_PRICE_LABEL = "totalPriceLabel";

    @NotNull
    private static final String TOTAL_PRICE_STATUS = "totalPriceStatus";

    @NotNull
    private static final String TRANSACTION_ID = "transactionId";

    @Nullable
    private String checkoutOption;

    @Nullable
    private String countryCode;

    @Nullable
    private String currencyCode;

    @Nullable
    private String totalPrice;

    @Nullable
    private String totalPriceLabel;

    @Nullable
    private String totalPriceStatus;

    @Nullable
    private String transactionId;

    @NotNull
    public static final Parcelable.Creator<TransactionInfoModel> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<TransactionInfoModel> SERIALIZER = new ModelObject.Serializer<TransactionInfoModel>() { // from class: com.adyen.checkout.googlepay.internal.data.model.TransactionInfoModel$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public TransactionInfoModel deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new TransactionInfoModel(JsonUtilsKt.getStringOrNull(jsonObject, AppsFlyerProperties.CURRENCY_CODE), JsonUtilsKt.getStringOrNull(jsonObject, "countryCode"), JsonUtilsKt.getStringOrNull(jsonObject, "transactionId"), JsonUtilsKt.getStringOrNull(jsonObject, "totalPriceStatus"), JsonUtilsKt.getStringOrNull(jsonObject, "totalPrice"), JsonUtilsKt.getStringOrNull(jsonObject, "totalPriceLabel"), JsonUtilsKt.getStringOrNull(jsonObject, "checkoutOption"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull TransactionInfoModel modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(AppsFlyerProperties.CURRENCY_CODE, modelObject.getCurrencyCode());
                jSONObject.putOpt("countryCode", modelObject.getCountryCode());
                jSONObject.putOpt("transactionId", modelObject.getTransactionId());
                jSONObject.putOpt("totalPriceStatus", modelObject.getTotalPriceStatus());
                jSONObject.putOpt("totalPrice", modelObject.getTotalPrice());
                jSONObject.putOpt("totalPriceLabel", modelObject.getTotalPriceLabel());
                jSONObject.putOpt("checkoutOption", modelObject.getCheckoutOption());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(TransactionInfoModel.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ TransactionInfoModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }

    public static /* synthetic */ TransactionInfoModel copy$default(TransactionInfoModel transactionInfoModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = transactionInfoModel.currencyCode;
        }
        if ((i11 & 2) != 0) {
            str2 = transactionInfoModel.countryCode;
        }
        if ((i11 & 4) != 0) {
            str3 = transactionInfoModel.transactionId;
        }
        if ((i11 & 8) != 0) {
            str4 = transactionInfoModel.totalPriceStatus;
        }
        if ((i11 & 16) != 0) {
            str5 = transactionInfoModel.totalPrice;
        }
        if ((i11 & 32) != 0) {
            str6 = transactionInfoModel.totalPriceLabel;
        }
        if ((i11 & 64) != 0) {
            str7 = transactionInfoModel.checkoutOption;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return transactionInfoModel.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTotalPriceStatus() {
        return this.totalPriceStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTotalPriceLabel() {
        return this.totalPriceLabel;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCheckoutOption() {
        return this.checkoutOption;
    }

    @NotNull
    public final TransactionInfoModel copy(@Nullable String currencyCode, @Nullable String countryCode, @Nullable String transactionId, @Nullable String totalPriceStatus, @Nullable String totalPrice, @Nullable String totalPriceLabel, @Nullable String checkoutOption) {
        return new TransactionInfoModel(currencyCode, countryCode, transactionId, totalPriceStatus, totalPrice, totalPriceLabel, checkoutOption);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionInfoModel)) {
            return false;
        }
        TransactionInfoModel transactionInfoModel = (TransactionInfoModel) other;
        return Intrinsics.areEqual(this.currencyCode, transactionInfoModel.currencyCode) && Intrinsics.areEqual(this.countryCode, transactionInfoModel.countryCode) && Intrinsics.areEqual(this.transactionId, transactionInfoModel.transactionId) && Intrinsics.areEqual(this.totalPriceStatus, transactionInfoModel.totalPriceStatus) && Intrinsics.areEqual(this.totalPrice, transactionInfoModel.totalPrice) && Intrinsics.areEqual(this.totalPriceLabel, transactionInfoModel.totalPriceLabel) && Intrinsics.areEqual(this.checkoutOption, transactionInfoModel.checkoutOption);
    }

    @Nullable
    public final String getCheckoutOption() {
        return this.checkoutOption;
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    @Nullable
    public final String getTotalPriceLabel() {
        return this.totalPriceLabel;
    }

    @Nullable
    public final String getTotalPriceStatus() {
        return this.totalPriceStatus;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.currencyCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transactionId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.totalPriceStatus;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.totalPrice;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.totalPriceLabel;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.checkoutOption;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setCheckoutOption(@Nullable String str) {
        this.checkoutOption = str;
    }

    public final void setCountryCode(@Nullable String str) {
        this.countryCode = str;
    }

    public final void setCurrencyCode(@Nullable String str) {
        this.currencyCode = str;
    }

    public final void setTotalPrice(@Nullable String str) {
        this.totalPrice = str;
    }

    public final void setTotalPriceLabel(@Nullable String str) {
        this.totalPriceLabel = str;
    }

    public final void setTotalPriceStatus(@Nullable String str) {
        this.totalPriceStatus = str;
    }

    public final void setTransactionId(@Nullable String str) {
        this.transactionId = str;
    }

    @NotNull
    public String toString() {
        String str = this.currencyCode;
        String str2 = this.countryCode;
        String str3 = this.transactionId;
        String str4 = this.totalPriceStatus;
        String str5 = this.totalPrice;
        String str6 = this.totalPriceLabel;
        String str7 = this.checkoutOption;
        StringBuilder sbT = f.t("TransactionInfoModel(currencyCode=", str, ", countryCode=", str2, ", transactionId=");
        s.A(sbT, str3, ", totalPriceStatus=", str4, ", totalPrice=");
        s.A(sbT, str5, ", totalPriceLabel=", str6, ", checkoutOption=");
        return k.p(sbT, str7, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.currencyCode);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.transactionId);
        parcel.writeString(this.totalPriceStatus);
        parcel.writeString(this.totalPrice);
        parcel.writeString(this.totalPriceLabel);
        parcel.writeString(this.checkoutOption);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransactionInfoModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TransactionInfoModel createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new TransactionInfoModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final TransactionInfoModel[] newArray(int i11) {
            return new TransactionInfoModel[i11];
        }
    }

    public TransactionInfoModel() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public TransactionInfoModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.currencyCode = str;
        this.countryCode = str2;
        this.transactionId = str3;
        this.totalPriceStatus = str4;
        this.totalPrice = str5;
        this.totalPriceLabel = str6;
        this.checkoutOption = str7;
    }
}
