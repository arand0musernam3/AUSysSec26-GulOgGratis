package com.adyen.checkout.googlepay.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtils;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import com.adyen.checkout.googlepay.BillingAddressParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 =2\u00020\u0001:\u0001=Bw\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0013\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010.\u001a\u00020\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0092\u0001\u00100\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0004HÖ\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000206HÖ\u0001R$\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\b\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u000b\u0010\u001e\"\u0004\b%\u0010 R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\"\"\u0004\b&\u0010$¨\u0006>"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/data/model/CardParameters;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", CardParameters.ALLOWED_AUTH_METHODS, "", "", CardParameters.ALLOWED_CARD_NETWORKS, "isAllowPrepaidCards", "", "isAllowCreditCards", CardParameters.ALLOWED_ISSUER_COUNTRY_CODES, CardParameters.BLOCKED_ISSUER_COUNTRY_CODES, "isAssuranceDetailsRequired", "isBillingAddressRequired", CardParameters.BILLING_ADDRESS_PARAMETERS, "Lcom/adyen/checkout/googlepay/BillingAddressParameters;", "(Ljava/util/List;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;ZLcom/adyen/checkout/googlepay/BillingAddressParameters;)V", "getAllowedAuthMethods", "()Ljava/util/List;", "setAllowedAuthMethods", "(Ljava/util/List;)V", "getAllowedCardNetworks", "setAllowedCardNetworks", "getAllowedIssuerCountryCodes", "setAllowedIssuerCountryCodes", "getBillingAddressParameters", "()Lcom/adyen/checkout/googlepay/BillingAddressParameters;", "setBillingAddressParameters", "(Lcom/adyen/checkout/googlepay/BillingAddressParameters;)V", "getBlockedIssuerCountryCodes", "setBlockedIssuerCountryCodes", "()Ljava/lang/Boolean;", "setAllowCreditCards", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "()Z", "setAllowPrepaidCards", "(Z)V", "setAssuranceDetailsRequired", "setBillingAddressRequired", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;ZLcom/adyen/checkout/googlepay/BillingAddressParameters;)Lcom/adyen/checkout/googlepay/internal/data/model/CardParameters;", "equals", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardParameters extends ModelObject {

    @NotNull
    private static final String ALLOWED_AUTH_METHODS = "allowedAuthMethods";

    @NotNull
    private static final String ALLOWED_CARD_NETWORKS = "allowedCardNetworks";

    @NotNull
    private static final String ALLOWED_ISSUER_COUNTRY_CODES = "allowedIssuerCountryCodes";

    @NotNull
    private static final String ALLOW_CREDIT_CARDS = "allowCreditCards";

    @NotNull
    private static final String ALLOW_PREPAID_CARDS = "allowPrepaidCards";

    @NotNull
    private static final String ASSURANCE_DETAILS_REQUIRED = "assuranceDetailsRequired";

    @NotNull
    private static final String BILLING_ADDRESS_PARAMETERS = "billingAddressParameters";

    @NotNull
    private static final String BILLING_ADDRESS_REQUIRED = "billingAddressRequired";

    @NotNull
    private static final String BLOCKED_ISSUER_COUNTRY_CODES = "blockedIssuerCountryCodes";

    @Nullable
    private List<String> allowedAuthMethods;

    @Nullable
    private List<String> allowedCardNetworks;

    @Nullable
    private List<String> allowedIssuerCountryCodes;

    @Nullable
    private BillingAddressParameters billingAddressParameters;

    @Nullable
    private List<String> blockedIssuerCountryCodes;

    @Nullable
    private Boolean isAllowCreditCards;
    private boolean isAllowPrepaidCards;

    @Nullable
    private Boolean isAssuranceDetailsRequired;
    private boolean isBillingAddressRequired;

    @NotNull
    public static final Parcelable.Creator<CardParameters> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<CardParameters> SERIALIZER = new ModelObject.Serializer<CardParameters>() { // from class: com.adyen.checkout.googlepay.internal.data.model.CardParameters$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public CardParameters deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            List<String> optStringList = JsonUtils.parseOptStringList(jsonObject.optJSONArray("allowedAuthMethods"));
            List<String> optStringList2 = JsonUtils.parseOptStringList(jsonObject.optJSONArray("allowedCardNetworks"));
            Boolean booleanOrNull = JsonUtilsKt.getBooleanOrNull(jsonObject, "allowPrepaidCards");
            boolean zBooleanValue = booleanOrNull != null ? booleanOrNull.booleanValue() : false;
            Boolean booleanOrNull2 = JsonUtilsKt.getBooleanOrNull(jsonObject, "allowCreditCards");
            List<String> optStringList3 = JsonUtils.parseOptStringList(jsonObject.optJSONArray("allowedIssuerCountryCodes"));
            List<String> optStringList4 = JsonUtils.parseOptStringList(jsonObject.optJSONArray("blockedIssuerCountryCodes"));
            Boolean booleanOrNull3 = JsonUtilsKt.getBooleanOrNull(jsonObject, "assuranceDetailsRequired");
            Boolean booleanOrNull4 = JsonUtilsKt.getBooleanOrNull(jsonObject, "billingAddressRequired");
            return new CardParameters(optStringList, optStringList2, zBooleanValue, booleanOrNull2, optStringList3, optStringList4, booleanOrNull3, booleanOrNull4 != null ? booleanOrNull4.booleanValue() : false, (BillingAddressParameters) ModelUtils.deserializeOpt(jsonObject.optJSONObject("billingAddressParameters"), BillingAddressParameters.SERIALIZER));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull CardParameters modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("allowedAuthMethods", JsonUtils.serializeOptStringList(modelObject.getAllowedAuthMethods()));
                jSONObject.putOpt("allowedCardNetworks", JsonUtils.serializeOptStringList(modelObject.getAllowedCardNetworks()));
                jSONObject.putOpt("allowPrepaidCards", Boolean.valueOf(modelObject.isAllowPrepaidCards()));
                jSONObject.putOpt("allowCreditCards", modelObject.isAllowCreditCards());
                jSONObject.putOpt("allowedIssuerCountryCodes", JsonUtils.serializeOptStringList(modelObject.getAllowedIssuerCountryCodes()));
                jSONObject.putOpt("blockedIssuerCountryCodes", JsonUtils.serializeOptStringList(modelObject.getBlockedIssuerCountryCodes()));
                jSONObject.putOpt("assuranceDetailsRequired", modelObject.isAssuranceDetailsRequired());
                jSONObject.putOpt("billingAddressRequired", Boolean.valueOf(modelObject.isBillingAddressRequired()));
                jSONObject.putOpt("billingAddressParameters", ModelUtils.serializeOpt(modelObject.getBillingAddressParameters(), BillingAddressParameters.SERIALIZER));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(CardParameters.class, e5);
                return null;
            }
        }
    };

    public CardParameters(@Nullable List<String> list, @Nullable List<String> list2, boolean z11, @Nullable Boolean bool, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable Boolean bool2, boolean z12, @Nullable BillingAddressParameters billingAddressParameters) {
        this.allowedAuthMethods = list;
        this.allowedCardNetworks = list2;
        this.isAllowPrepaidCards = z11;
        this.isAllowCreditCards = bool;
        this.allowedIssuerCountryCodes = list3;
        this.blockedIssuerCountryCodes = list4;
        this.isAssuranceDetailsRequired = bool2;
        this.isBillingAddressRequired = z12;
        this.billingAddressParameters = billingAddressParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardParameters copy$default(CardParameters cardParameters, List list, List list2, boolean z11, Boolean bool, List list3, List list4, Boolean bool2, boolean z12, BillingAddressParameters billingAddressParameters, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cardParameters.allowedAuthMethods;
        }
        if ((i11 & 2) != 0) {
            list2 = cardParameters.allowedCardNetworks;
        }
        if ((i11 & 4) != 0) {
            z11 = cardParameters.isAllowPrepaidCards;
        }
        if ((i11 & 8) != 0) {
            bool = cardParameters.isAllowCreditCards;
        }
        if ((i11 & 16) != 0) {
            list3 = cardParameters.allowedIssuerCountryCodes;
        }
        if ((i11 & 32) != 0) {
            list4 = cardParameters.blockedIssuerCountryCodes;
        }
        if ((i11 & 64) != 0) {
            bool2 = cardParameters.isAssuranceDetailsRequired;
        }
        if ((i11 & 128) != 0) {
            z12 = cardParameters.isBillingAddressRequired;
        }
        if ((i11 & 256) != 0) {
            billingAddressParameters = cardParameters.billingAddressParameters;
        }
        boolean z13 = z12;
        BillingAddressParameters billingAddressParameters2 = billingAddressParameters;
        List list5 = list4;
        Boolean bool3 = bool2;
        List list6 = list3;
        boolean z14 = z11;
        return cardParameters.copy(list, list2, z14, bool, list6, list5, bool3, z13, billingAddressParameters2);
    }

    @Nullable
    public final List<String> component1() {
        return this.allowedAuthMethods;
    }

    @Nullable
    public final List<String> component2() {
        return this.allowedCardNetworks;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsAllowPrepaidCards() {
        return this.isAllowPrepaidCards;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsAllowCreditCards() {
        return this.isAllowCreditCards;
    }

    @Nullable
    public final List<String> component5() {
        return this.allowedIssuerCountryCodes;
    }

    @Nullable
    public final List<String> component6() {
        return this.blockedIssuerCountryCodes;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsAssuranceDetailsRequired() {
        return this.isAssuranceDetailsRequired;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsBillingAddressRequired() {
        return this.isBillingAddressRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BillingAddressParameters getBillingAddressParameters() {
        return this.billingAddressParameters;
    }

    @NotNull
    public final CardParameters copy(@Nullable List<String> allowedAuthMethods, @Nullable List<String> allowedCardNetworks, boolean isAllowPrepaidCards, @Nullable Boolean isAllowCreditCards, @Nullable List<String> allowedIssuerCountryCodes, @Nullable List<String> blockedIssuerCountryCodes, @Nullable Boolean isAssuranceDetailsRequired, boolean isBillingAddressRequired, @Nullable BillingAddressParameters billingAddressParameters) {
        return new CardParameters(allowedAuthMethods, allowedCardNetworks, isAllowPrepaidCards, isAllowCreditCards, allowedIssuerCountryCodes, blockedIssuerCountryCodes, isAssuranceDetailsRequired, isBillingAddressRequired, billingAddressParameters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardParameters)) {
            return false;
        }
        CardParameters cardParameters = (CardParameters) other;
        return Intrinsics.areEqual(this.allowedAuthMethods, cardParameters.allowedAuthMethods) && Intrinsics.areEqual(this.allowedCardNetworks, cardParameters.allowedCardNetworks) && this.isAllowPrepaidCards == cardParameters.isAllowPrepaidCards && Intrinsics.areEqual(this.isAllowCreditCards, cardParameters.isAllowCreditCards) && Intrinsics.areEqual(this.allowedIssuerCountryCodes, cardParameters.allowedIssuerCountryCodes) && Intrinsics.areEqual(this.blockedIssuerCountryCodes, cardParameters.blockedIssuerCountryCodes) && Intrinsics.areEqual(this.isAssuranceDetailsRequired, cardParameters.isAssuranceDetailsRequired) && this.isBillingAddressRequired == cardParameters.isBillingAddressRequired && Intrinsics.areEqual(this.billingAddressParameters, cardParameters.billingAddressParameters);
    }

    @Nullable
    public final List<String> getAllowedAuthMethods() {
        return this.allowedAuthMethods;
    }

    @Nullable
    public final List<String> getAllowedCardNetworks() {
        return this.allowedCardNetworks;
    }

    @Nullable
    public final List<String> getAllowedIssuerCountryCodes() {
        return this.allowedIssuerCountryCodes;
    }

    @Nullable
    public final BillingAddressParameters getBillingAddressParameters() {
        return this.billingAddressParameters;
    }

    @Nullable
    public final List<String> getBlockedIssuerCountryCodes() {
        return this.blockedIssuerCountryCodes;
    }

    public int hashCode() {
        List<String> list = this.allowedAuthMethods;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.allowedCardNetworks;
        int iE = k.e((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.isAllowPrepaidCards);
        Boolean bool = this.isAllowCreditCards;
        int iHashCode2 = (iE + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list3 = this.allowedIssuerCountryCodes;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.blockedIssuerCountryCodes;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool2 = this.isAssuranceDetailsRequired;
        int iE2 = k.e((iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.isBillingAddressRequired);
        BillingAddressParameters billingAddressParameters = this.billingAddressParameters;
        return iE2 + (billingAddressParameters != null ? billingAddressParameters.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAllowCreditCards() {
        return this.isAllowCreditCards;
    }

    public final boolean isAllowPrepaidCards() {
        return this.isAllowPrepaidCards;
    }

    @Nullable
    public final Boolean isAssuranceDetailsRequired() {
        return this.isAssuranceDetailsRequired;
    }

    public final boolean isBillingAddressRequired() {
        return this.isBillingAddressRequired;
    }

    public final void setAllowCreditCards(@Nullable Boolean bool) {
        this.isAllowCreditCards = bool;
    }

    public final void setAllowPrepaidCards(boolean z11) {
        this.isAllowPrepaidCards = z11;
    }

    public final void setAllowedAuthMethods(@Nullable List<String> list) {
        this.allowedAuthMethods = list;
    }

    public final void setAllowedCardNetworks(@Nullable List<String> list) {
        this.allowedCardNetworks = list;
    }

    public final void setAllowedIssuerCountryCodes(@Nullable List<String> list) {
        this.allowedIssuerCountryCodes = list;
    }

    public final void setAssuranceDetailsRequired(@Nullable Boolean bool) {
        this.isAssuranceDetailsRequired = bool;
    }

    public final void setBillingAddressParameters(@Nullable BillingAddressParameters billingAddressParameters) {
        this.billingAddressParameters = billingAddressParameters;
    }

    public final void setBillingAddressRequired(boolean z11) {
        this.isBillingAddressRequired = z11;
    }

    public final void setBlockedIssuerCountryCodes(@Nullable List<String> list) {
        this.blockedIssuerCountryCodes = list;
    }

    @NotNull
    public String toString() {
        return "CardParameters(allowedAuthMethods=" + this.allowedAuthMethods + ", allowedCardNetworks=" + this.allowedCardNetworks + ", isAllowPrepaidCards=" + this.isAllowPrepaidCards + ", isAllowCreditCards=" + this.isAllowCreditCards + ", allowedIssuerCountryCodes=" + this.allowedIssuerCountryCodes + ", blockedIssuerCountryCodes=" + this.blockedIssuerCountryCodes + ", isAssuranceDetailsRequired=" + this.isAssuranceDetailsRequired + ", isBillingAddressRequired=" + this.isBillingAddressRequired + ", billingAddressParameters=" + this.billingAddressParameters + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeStringList(this.allowedAuthMethods);
        parcel.writeStringList(this.allowedCardNetworks);
        parcel.writeInt(this.isAllowPrepaidCards ? 1 : 0);
        Boolean bool = this.isAllowCreditCards;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool);
        }
        parcel.writeStringList(this.allowedIssuerCountryCodes);
        parcel.writeStringList(this.blockedIssuerCountryCodes);
        Boolean bool2 = this.isAssuranceDetailsRequired;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool2);
        }
        parcel.writeInt(this.isBillingAddressRequired ? 1 : 0);
        BillingAddressParameters billingAddressParameters = this.billingAddressParameters;
        if (billingAddressParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billingAddressParameters.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardParameters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CardParameters createFromParcel(@NotNull Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z12 = true;
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            Boolean bool = boolValueOf;
            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                z12 = false;
            }
            return new CardParameters(arrayListCreateStringArrayList, arrayListCreateStringArrayList2, z11, bool, arrayListCreateStringArrayList3, arrayListCreateStringArrayList4, boolValueOf2, z12, parcel.readInt() != 0 ? BillingAddressParameters.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CardParameters[] newArray(int i11) {
            return new CardParameters[i11];
        }
    }
}
