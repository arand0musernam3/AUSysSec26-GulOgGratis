package com.adyen.checkout.components.core.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00016Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020*HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*HÖ\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f¨\u00067"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/CashAppPayPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "type", "", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, PaymentMethodDetails.SDK_DATA, CashAppPayPaymentMethod.GRANT_ID, CashAppPayPaymentMethod.ON_FILE_GRANT_ID, CashAppPayPaymentMethod.CUSTOMER_ID, CashAppPayPaymentMethod.CASH_TAG, CashAppPayPaymentMethod.STORED_PAYMENT_METHOD_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCashtag", "()Ljava/lang/String;", "setCashtag", "(Ljava/lang/String;)V", "getCheckoutAttemptId$annotations", "()V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getCustomerId", "setCustomerId", "getGrantId", "setGrantId", "getOnFileGrantId", "setOnFileGrantId", "getSdkData", "setSdkData", "getStoredPaymentMethodId", "setStoredPaymentMethodId", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CashAppPayPaymentMethod extends PaymentMethodDetails {

    @NotNull
    private static final String CASH_TAG = "cashtag";

    @NotNull
    private static final String CUSTOMER_ID = "customerId";

    @NotNull
    private static final String GRANT_ID = "grantId";

    @NotNull
    private static final String ON_FILE_GRANT_ID = "onFileGrantId";

    @NotNull
    public static final String PAYMENT_METHOD_TYPE = "cashapp";

    @NotNull
    private static final String STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";

    @Nullable
    private String cashtag;

    @Nullable
    private String checkoutAttemptId;

    @Nullable
    private String customerId;

    @Nullable
    private String grantId;

    @Nullable
    private String onFileGrantId;

    @Nullable
    private String sdkData;

    @Nullable
    private String storedPaymentMethodId;

    @Nullable
    private String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CashAppPayPaymentMethod> CREATOR = new Creator();

    @NotNull
    private static final ModelObject.Serializer<CashAppPayPaymentMethod> SERIALIZER = new ModelObject.Serializer<CashAppPayPaymentMethod>() { // from class: com.adyen.checkout.components.core.paymentmethod.CashAppPayPaymentMethod$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public CashAppPayPaymentMethod deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new CashAppPayPaymentMethod(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.SDK_DATA), JsonUtilsKt.getStringOrNull(jsonObject, "grantId"), JsonUtilsKt.getStringOrNull(jsonObject, "onFileGrantId"), JsonUtilsKt.getStringOrNull(jsonObject, "customerId"), JsonUtilsKt.getStringOrNull(jsonObject, "cashtag"), JsonUtilsKt.getStringOrNull(jsonObject, "storedPaymentMethodId"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull CashAppPayPaymentMethod modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(PaymentMethodDetails.SDK_DATA, modelObject.getSdkData());
                jSONObject.putOpt("grantId", modelObject.getGrantId());
                jSONObject.putOpt("onFileGrantId", modelObject.getOnFileGrantId());
                jSONObject.putOpt("customerId", modelObject.getCustomerId());
                jSONObject.putOpt("cashtag", modelObject.getCashtag());
                jSONObject.putOpt("storedPaymentMethodId", modelObject.getStoredPaymentMethodId());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(CashAppPayPaymentMethod.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ CashAppPayPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8);
    }

    public static /* synthetic */ CashAppPayPaymentMethod copy$default(CashAppPayPaymentMethod cashAppPayPaymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cashAppPayPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = cashAppPayPaymentMethod.checkoutAttemptId;
        }
        if ((i11 & 4) != 0) {
            str3 = cashAppPayPaymentMethod.sdkData;
        }
        if ((i11 & 8) != 0) {
            str4 = cashAppPayPaymentMethod.grantId;
        }
        if ((i11 & 16) != 0) {
            str5 = cashAppPayPaymentMethod.onFileGrantId;
        }
        if ((i11 & 32) != 0) {
            str6 = cashAppPayPaymentMethod.customerId;
        }
        if ((i11 & 64) != 0) {
            str7 = cashAppPayPaymentMethod.cashtag;
        }
        if ((i11 & 128) != 0) {
            str8 = cashAppPayPaymentMethod.storedPaymentMethodId;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return cashAppPayPaymentMethod.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSdkData() {
        return this.sdkData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGrantId() {
        return this.grantId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOnFileGrantId() {
        return this.onFileGrantId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCashtag() {
        return this.cashtag;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    @NotNull
    public final CashAppPayPaymentMethod copy(@Nullable String type, @Nullable String checkoutAttemptId, @Nullable String sdkData, @Nullable String grantId, @Nullable String onFileGrantId, @Nullable String customerId, @Nullable String cashtag, @Nullable String storedPaymentMethodId) {
        return new CashAppPayPaymentMethod(type, checkoutAttemptId, sdkData, grantId, onFileGrantId, customerId, cashtag, storedPaymentMethodId);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashAppPayPaymentMethod)) {
            return false;
        }
        CashAppPayPaymentMethod cashAppPayPaymentMethod = (CashAppPayPaymentMethod) other;
        return Intrinsics.areEqual(this.type, cashAppPayPaymentMethod.type) && Intrinsics.areEqual(this.checkoutAttemptId, cashAppPayPaymentMethod.checkoutAttemptId) && Intrinsics.areEqual(this.sdkData, cashAppPayPaymentMethod.sdkData) && Intrinsics.areEqual(this.grantId, cashAppPayPaymentMethod.grantId) && Intrinsics.areEqual(this.onFileGrantId, cashAppPayPaymentMethod.onFileGrantId) && Intrinsics.areEqual(this.customerId, cashAppPayPaymentMethod.customerId) && Intrinsics.areEqual(this.cashtag, cashAppPayPaymentMethod.cashtag) && Intrinsics.areEqual(this.storedPaymentMethodId, cashAppPayPaymentMethod.storedPaymentMethodId);
    }

    @Nullable
    public final String getCashtag() {
        return this.cashtag;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getGrantId() {
        return this.grantId;
    }

    @Nullable
    public final String getOnFileGrantId() {
        return this.onFileGrantId;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getSdkData() {
        return this.sdkData;
    }

    @Nullable
    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    @Nullable
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.checkoutAttemptId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkData;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.grantId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.onFileGrantId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.customerId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.cashtag;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.storedPaymentMethodId;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setCashtag(@Nullable String str) {
        this.cashtag = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(@Nullable String str) {
        this.checkoutAttemptId = str;
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    public final void setGrantId(@Nullable String str) {
        this.grantId = str;
    }

    public final void setOnFileGrantId(@Nullable String str) {
        this.onFileGrantId = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setSdkData(@Nullable String str) {
        this.sdkData = str;
    }

    public final void setStoredPaymentMethodId(@Nullable String str) {
        this.storedPaymentMethodId = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.checkoutAttemptId;
        String str3 = this.sdkData;
        String str4 = this.grantId;
        String str5 = this.onFileGrantId;
        String str6 = this.customerId;
        String str7 = this.cashtag;
        String str8 = this.storedPaymentMethodId;
        StringBuilder sbT = f.t("CashAppPayPaymentMethod(type=", str, ", checkoutAttemptId=", str2, ", sdkData=");
        s.A(sbT, str3, ", grantId=", str4, ", onFileGrantId=");
        s.A(sbT, str5, ", customerId=", str6, ", cashtag=");
        return f.o(sbT, str7, ", storedPaymentMethodId=", str8, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.sdkData);
        parcel.writeString(this.grantId);
        parcel.writeString(this.onFileGrantId);
        parcel.writeString(this.customerId);
        parcel.writeString(this.cashtag);
        parcel.writeString(this.storedPaymentMethodId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/CashAppPayPaymentMethod$Companion;", "", "()V", "CASH_TAG", "", "CUSTOMER_ID", "GRANT_ID", "ON_FILE_GRANT_ID", "PAYMENT_METHOD_TYPE", ModelUtils.SERIALIZER_FIELD_NAME, "Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;", "Lcom/adyen/checkout/components/core/paymentmethod/CashAppPayPaymentMethod;", "getSERIALIZER", "()Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;", "STORED_PAYMENT_METHOD_ID", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ModelObject.Serializer<CashAppPayPaymentMethod> getSERIALIZER() {
            return CashAppPayPaymentMethod.SERIALIZER;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CashAppPayPaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CashAppPayPaymentMethod createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new CashAppPayPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CashAppPayPaymentMethod[] newArray(int i11) {
            return new CashAppPayPaymentMethod[i11];
        }
    }

    @d
    public static /* synthetic */ void getCheckoutAttemptId$annotations() {
    }

    public CashAppPayPaymentMethod(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.sdkData = str3;
        this.grantId = str4;
        this.onFileGrantId = str5;
        this.customerId = str6;
        this.cashtag = str7;
        this.storedPaymentMethodId = str8;
    }
}
