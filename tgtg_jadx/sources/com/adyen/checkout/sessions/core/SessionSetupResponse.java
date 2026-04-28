package com.adyen.checkout.sessions.core;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.PaymentMethodsApiResponse;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020)HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u00061"}, d2 = {"Lcom/adyen/checkout/sessions/core/SessionSetupResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "id", "", SessionSetupResponse.SESSION_DATA, SessionSetupResponse.AMOUNT, "Lcom/adyen/checkout/components/core/Amount;", SessionSetupResponse.EXPIRES_AT, "paymentMethodsApiResponse", "Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;", SessionSetupResponse.RETURN_URL, SessionSetupResponse.CONFIGURATION, "Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", SessionSetupResponse.SHOPPER_LOCALE, "(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;Ljava/lang/String;Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;Ljava/lang/String;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "getConfiguration", "()Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", "getExpiresAt", "()Ljava/lang/String;", "getId", "getPaymentMethodsApiResponse", "()Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;", "getReturnUrl", "getSessionData", "getShopperLocale", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionSetupResponse extends ModelObject {

    @NotNull
    private static final String AMOUNT = "amount";

    @NotNull
    private static final String CONFIGURATION = "configuration";

    @NotNull
    private static final String EXPIRES_AT = "expiresAt";

    @NotNull
    private static final String ID = "id";

    @NotNull
    private static final String PAYMENT_METHODS = "paymentMethods";

    @NotNull
    private static final String RETURN_URL = "returnUrl";

    @NotNull
    private static final String SESSION_DATA = "sessionData";

    @NotNull
    private static final String SHOPPER_LOCALE = "shopperLocale";

    @Nullable
    private final Amount amount;

    @Nullable
    private final SessionSetupConfiguration configuration;

    @NotNull
    private final String expiresAt;

    @NotNull
    private final String id;

    @Nullable
    private final PaymentMethodsApiResponse paymentMethodsApiResponse;

    @Nullable
    private final String returnUrl;

    @NotNull
    private final String sessionData;

    @Nullable
    private final String shopperLocale;

    @NotNull
    public static final Parcelable.Creator<SessionSetupResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SessionSetupResponse> SERIALIZER = new ModelObject.Serializer<SessionSetupResponse>() { // from class: com.adyen.checkout.sessions.core.SessionSetupResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SessionSetupResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "id");
                String str = "";
                if (stringOrNull == null) {
                    stringOrNull = "";
                }
                String stringOrNull2 = JsonUtilsKt.getStringOrNull(jsonObject, "sessionData");
                if (stringOrNull2 == null) {
                    stringOrNull2 = "";
                }
                Amount amount = (Amount) ModelUtils.deserializeOpt(jsonObject.optJSONObject("amount"), Amount.SERIALIZER);
                String stringOrNull3 = JsonUtilsKt.getStringOrNull(jsonObject, "expiresAt");
                if (stringOrNull3 != null) {
                    str = stringOrNull3;
                }
                String str2 = str;
                return new SessionSetupResponse(stringOrNull, stringOrNull2, amount, str2, (PaymentMethodsApiResponse) ModelUtils.deserializeOpt(jsonObject.optJSONObject("paymentMethods"), PaymentMethodsApiResponse.SERIALIZER), JsonUtilsKt.getStringOrNull(jsonObject, "returnUrl"), (SessionSetupConfiguration) ModelUtils.deserializeOpt(jsonObject.optJSONObject("configuration"), SessionSetupConfiguration.SERIALIZER), JsonUtilsKt.getStringOrNull(jsonObject, "shopperLocale"));
            } catch (JSONException e5) {
                w.j(SessionSetupResponse.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SessionSetupResponse modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("id", modelObject.getId());
                jSONObject.putOpt("sessionData", modelObject.getSessionData());
                jSONObject.putOpt("amount", ModelUtils.serializeOpt(modelObject.getAmount(), Amount.SERIALIZER));
                jSONObject.putOpt("expiresAt", modelObject.getExpiresAt());
                jSONObject.putOpt("paymentMethods", ModelUtils.serializeOpt(modelObject.getPaymentMethodsApiResponse(), PaymentMethodsApiResponse.SERIALIZER));
                jSONObject.putOpt("returnUrl", modelObject.getReturnUrl());
                jSONObject.putOpt("configuration", ModelUtils.serializeOpt(modelObject.getConfiguration(), SessionSetupConfiguration.SERIALIZER));
                jSONObject.putOpt("shopperLocale", modelObject.getShopperLocale());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SessionSetupResponse.class, e5);
                return null;
            }
        }
    };

    public SessionSetupResponse(@NotNull String str, @NotNull String str2, @Nullable Amount amount, @NotNull String str3, @Nullable PaymentMethodsApiResponse paymentMethodsApiResponse, @Nullable String str4, @Nullable SessionSetupConfiguration sessionSetupConfiguration, @Nullable String str5) {
        a0.C(str, str2, str3);
        this.id = str;
        this.sessionData = str2;
        this.amount = amount;
        this.expiresAt = str3;
        this.paymentMethodsApiResponse = paymentMethodsApiResponse;
        this.returnUrl = str4;
        this.configuration = sessionSetupConfiguration;
        this.shopperLocale = str5;
    }

    public static /* synthetic */ SessionSetupResponse copy$default(SessionSetupResponse sessionSetupResponse, String str, String str2, Amount amount, String str3, PaymentMethodsApiResponse paymentMethodsApiResponse, String str4, SessionSetupConfiguration sessionSetupConfiguration, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionSetupResponse.id;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionSetupResponse.sessionData;
        }
        if ((i11 & 4) != 0) {
            amount = sessionSetupResponse.amount;
        }
        if ((i11 & 8) != 0) {
            str3 = sessionSetupResponse.expiresAt;
        }
        if ((i11 & 16) != 0) {
            paymentMethodsApiResponse = sessionSetupResponse.paymentMethodsApiResponse;
        }
        if ((i11 & 32) != 0) {
            str4 = sessionSetupResponse.returnUrl;
        }
        if ((i11 & 64) != 0) {
            sessionSetupConfiguration = sessionSetupResponse.configuration;
        }
        if ((i11 & 128) != 0) {
            str5 = sessionSetupResponse.shopperLocale;
        }
        SessionSetupConfiguration sessionSetupConfiguration2 = sessionSetupConfiguration;
        String str6 = str5;
        PaymentMethodsApiResponse paymentMethodsApiResponse2 = paymentMethodsApiResponse;
        String str7 = str4;
        return sessionSetupResponse.copy(str, str2, amount, str3, paymentMethodsApiResponse2, str7, sessionSetupConfiguration2, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PaymentMethodsApiResponse getPaymentMethodsApiResponse() {
        return this.paymentMethodsApiResponse;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SessionSetupConfiguration getConfiguration() {
        return this.configuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getShopperLocale() {
        return this.shopperLocale;
    }

    @NotNull
    public final SessionSetupResponse copy(@NotNull String id2, @NotNull String sessionData, @Nullable Amount amount, @NotNull String expiresAt, @Nullable PaymentMethodsApiResponse paymentMethodsApiResponse, @Nullable String returnUrl, @Nullable SessionSetupConfiguration configuration, @Nullable String shopperLocale) {
        id2.getClass();
        sessionData.getClass();
        expiresAt.getClass();
        return new SessionSetupResponse(id2, sessionData, amount, expiresAt, paymentMethodsApiResponse, returnUrl, configuration, shopperLocale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionSetupResponse)) {
            return false;
        }
        SessionSetupResponse sessionSetupResponse = (SessionSetupResponse) other;
        return Intrinsics.areEqual(this.id, sessionSetupResponse.id) && Intrinsics.areEqual(this.sessionData, sessionSetupResponse.sessionData) && Intrinsics.areEqual(this.amount, sessionSetupResponse.amount) && Intrinsics.areEqual(this.expiresAt, sessionSetupResponse.expiresAt) && Intrinsics.areEqual(this.paymentMethodsApiResponse, sessionSetupResponse.paymentMethodsApiResponse) && Intrinsics.areEqual(this.returnUrl, sessionSetupResponse.returnUrl) && Intrinsics.areEqual(this.configuration, sessionSetupResponse.configuration) && Intrinsics.areEqual(this.shopperLocale, sessionSetupResponse.shopperLocale);
    }

    @Nullable
    public final Amount getAmount() {
        return this.amount;
    }

    @Nullable
    public final SessionSetupConfiguration getConfiguration() {
        return this.configuration;
    }

    @NotNull
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final PaymentMethodsApiResponse getPaymentMethodsApiResponse() {
        return this.paymentMethodsApiResponse;
    }

    @Nullable
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @NotNull
    public final String getSessionData() {
        return this.sessionData;
    }

    @Nullable
    public final String getShopperLocale() {
        return this.shopperLocale;
    }

    public int hashCode() {
        int iB = l1.b(this.id.hashCode() * 31, 31, this.sessionData);
        Amount amount = this.amount;
        int iB2 = l1.b((iB + (amount == null ? 0 : amount.hashCode())) * 31, 31, this.expiresAt);
        PaymentMethodsApiResponse paymentMethodsApiResponse = this.paymentMethodsApiResponse;
        int iHashCode = (iB2 + (paymentMethodsApiResponse == null ? 0 : paymentMethodsApiResponse.hashCode())) * 31;
        String str = this.returnUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SessionSetupConfiguration sessionSetupConfiguration = this.configuration;
        int iHashCode3 = (iHashCode2 + (sessionSetupConfiguration == null ? 0 : sessionSetupConfiguration.hashCode())) * 31;
        String str2 = this.shopperLocale;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.sessionData;
        Amount amount = this.amount;
        String str3 = this.expiresAt;
        PaymentMethodsApiResponse paymentMethodsApiResponse = this.paymentMethodsApiResponse;
        String str4 = this.returnUrl;
        SessionSetupConfiguration sessionSetupConfiguration = this.configuration;
        String str5 = this.shopperLocale;
        StringBuilder sbT = f.t("SessionSetupResponse(id=", str, ", sessionData=", str2, ", amount=");
        sbT.append(amount);
        sbT.append(", expiresAt=");
        sbT.append(str3);
        sbT.append(", paymentMethodsApiResponse=");
        sbT.append(paymentMethodsApiResponse);
        sbT.append(", returnUrl=");
        sbT.append(str4);
        sbT.append(", configuration=");
        sbT.append(sessionSetupConfiguration);
        sbT.append(", shopperLocale=");
        sbT.append(str5);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.sessionData);
        parcel.writeParcelable(this.amount, flags);
        parcel.writeString(this.expiresAt);
        parcel.writeParcelable(this.paymentMethodsApiResponse, flags);
        parcel.writeString(this.returnUrl);
        SessionSetupConfiguration sessionSetupConfiguration = this.configuration;
        if (sessionSetupConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sessionSetupConfiguration.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.shopperLocale);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionSetupResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionSetupResponse createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SessionSetupResponse(parcel.readString(), parcel.readString(), (Amount) parcel.readParcelable(SessionSetupResponse.class.getClassLoader()), parcel.readString(), (PaymentMethodsApiResponse) parcel.readParcelable(SessionSetupResponse.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : SessionSetupConfiguration.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionSetupResponse[] newArray(int i11) {
            return new SessionSetupResponse[i11];
        }
    }
}
