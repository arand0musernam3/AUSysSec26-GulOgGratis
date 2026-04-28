package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 e*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001eB§\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0019J\u0010\u0010J\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u00101J\u000b\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010@J\u000b\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010@J\u000b\u0010S\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\fHÆ\u0003J¼\u0001\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010YJ\u0013\u0010Z\u001a\u00020\n2\b\u0010[\u001a\u0004\u0018\u00010\\HÖ\u0003J\t\u0010]\u001a\u00020^HÖ\u0001J\t\u0010_\u001a\u00020\fHÖ\u0001J\u0019\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020^HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010#\"\u0004\b6\u0010%R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010#\"\u0004\b<\u0010%R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010#\"\u0004\b>\u0010%R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010C\u0012\u0004\bD\u0010E\u001a\u0004\bF\u0010@\"\u0004\bG\u0010BR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010#\"\u0004\bI\u0010%¨\u0006f"}, d2 = {"Lcom/adyen/checkout/components/core/PaymentComponentData;", "PaymentMethodDetailsT", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", PaymentComponentData.PAYMENT_METHOD, PaymentComponentData.ORDER, "Lcom/adyen/checkout/components/core/OrderRequest;", PaymentComponentData.AMOUNT, "Lcom/adyen/checkout/components/core/Amount;", PaymentComponentData.STORE_PAYMENT_METHOD, "", PaymentComponentData.SHOPPER_REFERENCE, "", PaymentComponentData.BILLING_ADDRESS, "Lcom/adyen/checkout/components/core/Address;", PaymentComponentData.DELIVERY_ADDRESS, PaymentComponentData.SHOPPER_NAME, "Lcom/adyen/checkout/components/core/ShopperName;", "telephoneNumber", "shopperEmail", PaymentComponentData.DATE_OF_BIRTH, PaymentComponentData.SOCIAL_SECURITY_NUMBER, PaymentComponentData.INSTALLMENTS, "Lcom/adyen/checkout/components/core/Installments;", PaymentComponentData.SUPPORT_NATIVE_REDIRECT, "(Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/Boolean;Ljava/lang/String;Lcom/adyen/checkout/components/core/Address;Lcom/adyen/checkout/components/core/Address;Lcom/adyen/checkout/components/core/ShopperName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/Installments;Ljava/lang/Boolean;)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "setAmount", "(Lcom/adyen/checkout/components/core/Amount;)V", "getBillingAddress", "()Lcom/adyen/checkout/components/core/Address;", "setBillingAddress", "(Lcom/adyen/checkout/components/core/Address;)V", "getDateOfBirth", "()Ljava/lang/String;", "setDateOfBirth", "(Ljava/lang/String;)V", "getDeliveryAddress", "setDeliveryAddress", "getInstallments", "()Lcom/adyen/checkout/components/core/Installments;", "setInstallments", "(Lcom/adyen/checkout/components/core/Installments;)V", "getOrder", "()Lcom/adyen/checkout/components/core/OrderRequest;", "setOrder", "(Lcom/adyen/checkout/components/core/OrderRequest;)V", "getPaymentMethod", "()Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "setPaymentMethod", "(Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;)V", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "getShopperEmail", "setShopperEmail", "getShopperName", "()Lcom/adyen/checkout/components/core/ShopperName;", "setShopperName", "(Lcom/adyen/checkout/components/core/ShopperName;)V", "getShopperReference", "setShopperReference", "getSocialSecurityNumber", "setSocialSecurityNumber", "getStorePaymentMethod", "()Ljava/lang/Boolean;", "setStorePaymentMethod", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSupportNativeRedirect$annotations", "()V", "getSupportNativeRedirect", "setSupportNativeRedirect", "getTelephoneNumber", "setTelephoneNumber", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/Boolean;Ljava/lang/String;Lcom/adyen/checkout/components/core/Address;Lcom/adyen/checkout/components/core/Address;Lcom/adyen/checkout/components/core/ShopperName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/Installments;Ljava/lang/Boolean;)Lcom/adyen/checkout/components/core/PaymentComponentData;", "equals", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentComponentData<PaymentMethodDetailsT extends PaymentMethodDetails> extends ModelObject {

    @NotNull
    private static final String AMOUNT = "amount";

    @NotNull
    private static final String BILLING_ADDRESS = "billingAddress";

    @NotNull
    private static final String DATE_OF_BIRTH = "dateOfBirth";

    @NotNull
    private static final String DELIVERY_ADDRESS = "deliveryAddress";

    @NotNull
    private static final String INSTALLMENTS = "installments";

    @NotNull
    private static final String ORDER = "order";

    @NotNull
    private static final String PAYMENT_METHOD = "paymentMethod";

    @NotNull
    private static final String SHOPPER_EMAIL = "shopperEmail";

    @NotNull
    private static final String SHOPPER_NAME = "shopperName";

    @NotNull
    private static final String SHOPPER_REFERENCE = "shopperReference";

    @NotNull
    private static final String SOCIAL_SECURITY_NUMBER = "socialSecurityNumber";

    @NotNull
    private static final String STORE_PAYMENT_METHOD = "storePaymentMethod";

    @NotNull
    private static final String SUPPORT_NATIVE_REDIRECT = "supportNativeRedirect";

    @NotNull
    private static final String TELEPHONE_NUMBER = "telephoneNumber";

    @Nullable
    private Amount amount;

    @Nullable
    private Address billingAddress;

    @Nullable
    private String dateOfBirth;

    @Nullable
    private Address deliveryAddress;

    @Nullable
    private Installments installments;

    @Nullable
    private OrderRequest order;

    @Nullable
    private PaymentMethodDetailsT paymentMethod;

    @Nullable
    private String shopperEmail;

    @Nullable
    private ShopperName shopperName;

    @Nullable
    private String shopperReference;

    @Nullable
    private String socialSecurityNumber;

    @Nullable
    private Boolean storePaymentMethod;

    @Nullable
    private Boolean supportNativeRedirect;

    @Nullable
    private String telephoneNumber;

    @NotNull
    public static final Parcelable.Creator<PaymentComponentData<?>> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<PaymentComponentData<?>> SERIALIZER = new ModelObject.Serializer<PaymentComponentData<?>>() { // from class: com.adyen.checkout.components.core.PaymentComponentData$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public PaymentComponentData<PaymentMethodDetails> deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            PaymentMethodDetails paymentMethodDetails = (PaymentMethodDetails) ModelUtils.deserializeOpt(jsonObject.optJSONObject("paymentMethod"), PaymentMethodDetails.SERIALIZER);
            OrderRequest orderRequest = (OrderRequest) ModelUtils.deserializeOpt(jsonObject.optJSONObject("order"), OrderRequest.SERIALIZER);
            Amount amount = (Amount) ModelUtils.deserializeOpt(jsonObject.optJSONObject("amount"), Amount.SERIALIZER);
            Boolean booleanOrNull = JsonUtilsKt.getBooleanOrNull(jsonObject, "storePaymentMethod");
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "shopperReference");
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("billingAddress");
            ModelObject.Serializer<Address> serializer = Address.SERIALIZER;
            return new PaymentComponentData<>(paymentMethodDetails, orderRequest, amount, booleanOrNull, stringOrNull, (Address) ModelUtils.deserializeOpt(jSONObjectOptJSONObject, serializer), (Address) ModelUtils.deserializeOpt(jsonObject.optJSONObject("deliveryAddress"), serializer), (ShopperName) ModelUtils.deserializeOpt(jsonObject.optJSONObject("shopperName"), ShopperName.SERIALIZER), JsonUtilsKt.getStringOrNull(jsonObject, EContextPaymentMethod.TELEPHONE_NUMBER), JsonUtilsKt.getStringOrNull(jsonObject, EContextPaymentMethod.SHOPPER_EMAIL), JsonUtilsKt.getStringOrNull(jsonObject, "dateOfBirth"), JsonUtilsKt.getStringOrNull(jsonObject, "socialSecurityNumber"), (Installments) ModelUtils.deserializeOpt(jsonObject.optJSONObject("installments"), Installments.SERIALIZER), JsonUtilsKt.getBooleanOrNull(jsonObject, "supportNativeRedirect"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull PaymentComponentData<?> modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("paymentMethod", ModelUtils.serializeOpt(modelObject.getPaymentMethod(), PaymentMethodDetails.SERIALIZER));
                jSONObject.putOpt("order", ModelUtils.serializeOpt(modelObject.getOrder(), OrderRequest.SERIALIZER));
                jSONObject.putOpt("amount", ModelUtils.serializeOpt(modelObject.getAmount(), Amount.SERIALIZER));
                jSONObject.putOpt("storePaymentMethod", modelObject.getStorePaymentMethod());
                jSONObject.putOpt("shopperReference", modelObject.getShopperReference());
                Address billingAddress = modelObject.getBillingAddress();
                ModelObject.Serializer<Address> serializer = Address.SERIALIZER;
                jSONObject.putOpt("billingAddress", ModelUtils.serializeOpt(billingAddress, serializer));
                jSONObject.putOpt("deliveryAddress", ModelUtils.serializeOpt(modelObject.getDeliveryAddress(), serializer));
                jSONObject.putOpt("shopperName", ModelUtils.serializeOpt(modelObject.getShopperName(), ShopperName.SERIALIZER));
                jSONObject.putOpt(EContextPaymentMethod.TELEPHONE_NUMBER, modelObject.getTelephoneNumber());
                jSONObject.putOpt(EContextPaymentMethod.SHOPPER_EMAIL, modelObject.getShopperEmail());
                jSONObject.putOpt("dateOfBirth", modelObject.getDateOfBirth());
                jSONObject.putOpt("socialSecurityNumber", modelObject.getSocialSecurityNumber());
                jSONObject.putOpt("installments", ModelUtils.serializeOpt(modelObject.getInstallments(), Installments.SERIALIZER));
                jSONObject.putOpt("supportNativeRedirect", modelObject.getSupportNativeRedirect());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(PaymentComponentData.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ PaymentComponentData(PaymentMethodDetails paymentMethodDetails, OrderRequest orderRequest, Amount amount, Boolean bool, String str, Address address, Address address2, ShopperName shopperName, String str2, String str3, String str4, String str5, Installments installments, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentMethodDetails, orderRequest, amount, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : address, (i11 & 64) != 0 ? null : address2, (i11 & 128) != 0 ? null : shopperName, (i11 & 256) != 0 ? null : str2, (i11 & 512) != 0 ? null : str3, (i11 & 1024) != 0 ? null : str4, (i11 & NewHope.SENDB_BYTES) != 0 ? null : str5, (i11 & 4096) != 0 ? null : installments, (i11 & 8192) != 0 ? Boolean.TRUE : bool2);
    }

    @Nullable
    public final PaymentMethodDetailsT component1() {
        return this.paymentMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getShopperEmail() {
        return this.shopperEmail;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Installments getInstallments() {
        return this.installments;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getSupportNativeRedirect() {
        return this.supportNativeRedirect;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrderRequest getOrder() {
        return this.order;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getStorePaymentMethod() {
        return this.storePaymentMethod;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getShopperReference() {
        return this.shopperReference;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Address getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Address getDeliveryAddress() {
        return this.deliveryAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ShopperName getShopperName() {
        return this.shopperName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    @NotNull
    public final PaymentComponentData<PaymentMethodDetailsT> copy(@Nullable PaymentMethodDetailsT paymentMethod, @Nullable OrderRequest order, @Nullable Amount amount, @Nullable Boolean storePaymentMethod, @Nullable String shopperReference, @Nullable Address billingAddress, @Nullable Address deliveryAddress, @Nullable ShopperName shopperName, @Nullable String telephoneNumber, @Nullable String shopperEmail, @Nullable String dateOfBirth, @Nullable String socialSecurityNumber, @Nullable Installments installments, @Nullable Boolean supportNativeRedirect) {
        return new PaymentComponentData<>(paymentMethod, order, amount, storePaymentMethod, shopperReference, billingAddress, deliveryAddress, shopperName, telephoneNumber, shopperEmail, dateOfBirth, socialSecurityNumber, installments, supportNativeRedirect);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentComponentData)) {
            return false;
        }
        PaymentComponentData paymentComponentData = (PaymentComponentData) other;
        return Intrinsics.areEqual(this.paymentMethod, paymentComponentData.paymentMethod) && Intrinsics.areEqual(this.order, paymentComponentData.order) && Intrinsics.areEqual(this.amount, paymentComponentData.amount) && Intrinsics.areEqual(this.storePaymentMethod, paymentComponentData.storePaymentMethod) && Intrinsics.areEqual(this.shopperReference, paymentComponentData.shopperReference) && Intrinsics.areEqual(this.billingAddress, paymentComponentData.billingAddress) && Intrinsics.areEqual(this.deliveryAddress, paymentComponentData.deliveryAddress) && Intrinsics.areEqual(this.shopperName, paymentComponentData.shopperName) && Intrinsics.areEqual(this.telephoneNumber, paymentComponentData.telephoneNumber) && Intrinsics.areEqual(this.shopperEmail, paymentComponentData.shopperEmail) && Intrinsics.areEqual(this.dateOfBirth, paymentComponentData.dateOfBirth) && Intrinsics.areEqual(this.socialSecurityNumber, paymentComponentData.socialSecurityNumber) && Intrinsics.areEqual(this.installments, paymentComponentData.installments) && Intrinsics.areEqual(this.supportNativeRedirect, paymentComponentData.supportNativeRedirect);
    }

    @Nullable
    public final Amount getAmount() {
        return this.amount;
    }

    @Nullable
    public final Address getBillingAddress() {
        return this.billingAddress;
    }

    @Nullable
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Nullable
    public final Address getDeliveryAddress() {
        return this.deliveryAddress;
    }

    @Nullable
    public final Installments getInstallments() {
        return this.installments;
    }

    @Nullable
    public final OrderRequest getOrder() {
        return this.order;
    }

    @Nullable
    public final PaymentMethodDetailsT getPaymentMethod() {
        return this.paymentMethod;
    }

    @Nullable
    public final String getShopperEmail() {
        return this.shopperEmail;
    }

    @Nullable
    public final ShopperName getShopperName() {
        return this.shopperName;
    }

    @Nullable
    public final String getShopperReference() {
        return this.shopperReference;
    }

    @Nullable
    public final String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    @Nullable
    public final Boolean getStorePaymentMethod() {
        return this.storePaymentMethod;
    }

    @Nullable
    public final Boolean getSupportNativeRedirect() {
        return this.supportNativeRedirect;
    }

    @Nullable
    public final String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public int hashCode() {
        PaymentMethodDetailsT paymentmethoddetailst = this.paymentMethod;
        int iHashCode = (paymentmethoddetailst == null ? 0 : paymentmethoddetailst.hashCode()) * 31;
        OrderRequest orderRequest = this.order;
        int iHashCode2 = (iHashCode + (orderRequest == null ? 0 : orderRequest.hashCode())) * 31;
        Amount amount = this.amount;
        int iHashCode3 = (iHashCode2 + (amount == null ? 0 : amount.hashCode())) * 31;
        Boolean bool = this.storePaymentMethod;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.shopperReference;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Address address = this.billingAddress;
        int iHashCode6 = (iHashCode5 + (address == null ? 0 : address.hashCode())) * 31;
        Address address2 = this.deliveryAddress;
        int iHashCode7 = (iHashCode6 + (address2 == null ? 0 : address2.hashCode())) * 31;
        ShopperName shopperName = this.shopperName;
        int iHashCode8 = (iHashCode7 + (shopperName == null ? 0 : shopperName.hashCode())) * 31;
        String str2 = this.telephoneNumber;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shopperEmail;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateOfBirth;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.socialSecurityNumber;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Installments installments = this.installments;
        int iHashCode13 = (iHashCode12 + (installments == null ? 0 : installments.hashCode())) * 31;
        Boolean bool2 = this.supportNativeRedirect;
        return iHashCode13 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final void setAmount(@Nullable Amount amount) {
        this.amount = amount;
    }

    public final void setBillingAddress(@Nullable Address address) {
        this.billingAddress = address;
    }

    public final void setDateOfBirth(@Nullable String str) {
        this.dateOfBirth = str;
    }

    public final void setDeliveryAddress(@Nullable Address address) {
        this.deliveryAddress = address;
    }

    public final void setInstallments(@Nullable Installments installments) {
        this.installments = installments;
    }

    public final void setOrder(@Nullable OrderRequest orderRequest) {
        this.order = orderRequest;
    }

    public final void setPaymentMethod(@Nullable PaymentMethodDetailsT paymentmethoddetailst) {
        this.paymentMethod = paymentmethoddetailst;
    }

    public final void setShopperEmail(@Nullable String str) {
        this.shopperEmail = str;
    }

    public final void setShopperName(@Nullable ShopperName shopperName) {
        this.shopperName = shopperName;
    }

    public final void setShopperReference(@Nullable String str) {
        this.shopperReference = str;
    }

    public final void setSocialSecurityNumber(@Nullable String str) {
        this.socialSecurityNumber = str;
    }

    public final void setStorePaymentMethod(@Nullable Boolean bool) {
        this.storePaymentMethod = bool;
    }

    public final void setSupportNativeRedirect(@Nullable Boolean bool) {
        this.supportNativeRedirect = bool;
    }

    public final void setTelephoneNumber(@Nullable String str) {
        this.telephoneNumber = str;
    }

    @NotNull
    public String toString() {
        PaymentMethodDetailsT paymentmethoddetailst = this.paymentMethod;
        OrderRequest orderRequest = this.order;
        Amount amount = this.amount;
        Boolean bool = this.storePaymentMethod;
        String str = this.shopperReference;
        Address address = this.billingAddress;
        Address address2 = this.deliveryAddress;
        ShopperName shopperName = this.shopperName;
        String str2 = this.telephoneNumber;
        String str3 = this.shopperEmail;
        String str4 = this.dateOfBirth;
        String str5 = this.socialSecurityNumber;
        Installments installments = this.installments;
        Boolean bool2 = this.supportNativeRedirect;
        StringBuilder sb2 = new StringBuilder("PaymentComponentData(paymentMethod=");
        sb2.append(paymentmethoddetailst);
        sb2.append(", order=");
        sb2.append(orderRequest);
        sb2.append(", amount=");
        sb2.append(amount);
        sb2.append(", storePaymentMethod=");
        sb2.append(bool);
        sb2.append(", shopperReference=");
        sb2.append(str);
        sb2.append(", billingAddress=");
        sb2.append(address);
        sb2.append(", deliveryAddress=");
        sb2.append(address2);
        sb2.append(", shopperName=");
        sb2.append(shopperName);
        sb2.append(", telephoneNumber=");
        s.A(sb2, str2, ", shopperEmail=", str3, ", dateOfBirth=");
        s.A(sb2, str4, ", socialSecurityNumber=", str5, ", installments=");
        sb2.append(installments);
        sb2.append(", supportNativeRedirect=");
        sb2.append(bool2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeParcelable(this.paymentMethod, flags);
        OrderRequest orderRequest = this.order;
        if (orderRequest == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderRequest.writeToParcel(parcel, flags);
        }
        Amount amount = this.amount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, flags);
        }
        Boolean bool = this.storePaymentMethod;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool);
        }
        parcel.writeString(this.shopperReference);
        Address address = this.billingAddress;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, flags);
        }
        Address address2 = this.deliveryAddress;
        if (address2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address2.writeToParcel(parcel, flags);
        }
        ShopperName shopperName = this.shopperName;
        if (shopperName == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopperName.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.telephoneNumber);
        parcel.writeString(this.shopperEmail);
        parcel.writeString(this.dateOfBirth);
        parcel.writeString(this.socialSecurityNumber);
        Installments installments = this.installments;
        if (installments == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installments.writeToParcel(parcel, flags);
        }
        Boolean bool2 = this.supportNativeRedirect;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            i.v(parcel, 1, bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentComponentData<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        @Override // android.os.Parcelable.Creator
        @org.jetbrains.annotations.NotNull
        public final com.adyen.checkout.components.core.PaymentComponentData<?> createFromParcel(@org.jetbrains.annotations.NotNull android.os.Parcel r21) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.components.core.PaymentComponentData.Creator.createFromParcel(android.os.Parcel):com.adyen.checkout.components.core.PaymentComponentData");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentComponentData<?>[] newArray(int i11) {
            return new PaymentComponentData[i11];
        }
    }

    @d
    public static /* synthetic */ void getSupportNativeRedirect$annotations() {
    }

    public PaymentComponentData(@Nullable PaymentMethodDetailsT paymentmethoddetailst, @Nullable OrderRequest orderRequest, @Nullable Amount amount, @Nullable Boolean bool, @Nullable String str, @Nullable Address address, @Nullable Address address2, @Nullable ShopperName shopperName, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Installments installments, @Nullable Boolean bool2) {
        this.paymentMethod = paymentmethoddetailst;
        this.order = orderRequest;
        this.amount = amount;
        this.storePaymentMethod = bool;
        this.shopperReference = str;
        this.billingAddress = address;
        this.deliveryAddress = address2;
        this.shopperName = shopperName;
        this.telephoneNumber = str2;
        this.shopperEmail = str3;
        this.dateOfBirth = str4;
        this.socialSecurityNumber = str5;
        this.installments = installments;
        this.supportNativeRedirect = bool2;
    }
}
