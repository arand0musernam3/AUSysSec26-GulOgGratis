package com.adyen.checkout.googlepay.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import com.adyen.checkout.googlepay.MerchantInfo;
import com.adyen.checkout.googlepay.ShippingAddressParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 @2\u00020\u0001:\u0001@Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jg\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\u0003HÖ\u0001J\t\u00109\u001a\u00020:HÖ\u0001J\u0019\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001c\"\u0004\b\u001f\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006A"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/data/model/PaymentDataRequestModel;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", PaymentDataRequestModel.API_VERSION, "", PaymentDataRequestModel.API_VERSION_MINOR, PaymentDataRequestModel.MERCHANT_INFO, "Lcom/adyen/checkout/googlepay/MerchantInfo;", PaymentDataRequestModel.ALLOWED_PAYMENT_METHODS, "", "Lcom/adyen/checkout/googlepay/internal/data/model/GooglePayPaymentMethodModel;", PaymentDataRequestModel.TRANSACTION_INFO, "Lcom/adyen/checkout/googlepay/internal/data/model/TransactionInfoModel;", "isEmailRequired", "", "isShippingAddressRequired", PaymentDataRequestModel.SHIPPING_ADDRESS_PARAMETERS, "Lcom/adyen/checkout/googlepay/ShippingAddressParameters;", "(IILcom/adyen/checkout/googlepay/MerchantInfo;Ljava/util/List;Lcom/adyen/checkout/googlepay/internal/data/model/TransactionInfoModel;ZZLcom/adyen/checkout/googlepay/ShippingAddressParameters;)V", "getAllowedPaymentMethods", "()Ljava/util/List;", "setAllowedPaymentMethods", "(Ljava/util/List;)V", "getApiVersion", "()I", "setApiVersion", "(I)V", "getApiVersionMinor", "setApiVersionMinor", "()Z", "setEmailRequired", "(Z)V", "setShippingAddressRequired", "getMerchantInfo", "()Lcom/adyen/checkout/googlepay/MerchantInfo;", "setMerchantInfo", "(Lcom/adyen/checkout/googlepay/MerchantInfo;)V", "getShippingAddressParameters", "()Lcom/adyen/checkout/googlepay/ShippingAddressParameters;", "setShippingAddressParameters", "(Lcom/adyen/checkout/googlepay/ShippingAddressParameters;)V", "getTransactionInfo", "()Lcom/adyen/checkout/googlepay/internal/data/model/TransactionInfoModel;", "setTransactionInfo", "(Lcom/adyen/checkout/googlepay/internal/data/model/TransactionInfoModel;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentDataRequestModel extends ModelObject {

    @NotNull
    private static final String ALLOWED_PAYMENT_METHODS = "allowedPaymentMethods";

    @NotNull
    private static final String API_VERSION = "apiVersion";

    @NotNull
    private static final String API_VERSION_MINOR = "apiVersionMinor";

    @NotNull
    private static final String EMAIL_REQUIRED = "emailRequired";

    @NotNull
    private static final String MERCHANT_INFO = "merchantInfo";

    @NotNull
    private static final String SHIPPING_ADDRESS_PARAMETERS = "shippingAddressParameters";

    @NotNull
    private static final String SHIPPING_ADDRESS_REQUIRED = "shippingAddressRequired";

    @NotNull
    private static final String TRANSACTION_INFO = "transactionInfo";

    @Nullable
    private List<GooglePayPaymentMethodModel> allowedPaymentMethods;
    private int apiVersion;
    private int apiVersionMinor;
    private boolean isEmailRequired;
    private boolean isShippingAddressRequired;

    @Nullable
    private MerchantInfo merchantInfo;

    @Nullable
    private ShippingAddressParameters shippingAddressParameters;

    @Nullable
    private TransactionInfoModel transactionInfo;

    @NotNull
    public static final Parcelable.Creator<PaymentDataRequestModel> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<PaymentDataRequestModel> SERIALIZER = new ModelObject.Serializer<PaymentDataRequestModel>() { // from class: com.adyen.checkout.googlepay.internal.data.model.PaymentDataRequestModel$Companion$SERIALIZER$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public PaymentDataRequestModel deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            PaymentDataRequestModel paymentDataRequestModel = new PaymentDataRequestModel(0, 0 == true ? 1 : 0, null, null, null, false, false, null, 255, null);
            Integer intOrNull = JsonUtilsKt.getIntOrNull(jsonObject, "apiVersion");
            paymentDataRequestModel.setApiVersion(intOrNull != null ? intOrNull.intValue() : 0);
            Integer intOrNull2 = JsonUtilsKt.getIntOrNull(jsonObject, "apiVersionMinor");
            paymentDataRequestModel.setApiVersionMinor(intOrNull2 != null ? intOrNull2.intValue() : 0);
            paymentDataRequestModel.setMerchantInfo((MerchantInfo) ModelUtils.deserializeOpt(jsonObject.optJSONObject("merchantInfo"), MerchantInfo.SERIALIZER));
            paymentDataRequestModel.setAllowedPaymentMethods(ModelUtils.deserializeOptList(jsonObject.optJSONArray("allowedPaymentMethods"), GooglePayPaymentMethodModel.SERIALIZER));
            paymentDataRequestModel.setTransactionInfo((TransactionInfoModel) ModelUtils.deserializeOpt(jsonObject.optJSONObject("transactionInfo"), TransactionInfoModel.SERIALIZER));
            Boolean booleanOrNull = JsonUtilsKt.getBooleanOrNull(jsonObject, "emailRequired");
            paymentDataRequestModel.setEmailRequired(booleanOrNull != null ? booleanOrNull.booleanValue() : false);
            Boolean booleanOrNull2 = JsonUtilsKt.getBooleanOrNull(jsonObject, "shippingAddressRequired");
            paymentDataRequestModel.setShippingAddressRequired(booleanOrNull2 != null ? booleanOrNull2.booleanValue() : false);
            paymentDataRequestModel.setShippingAddressParameters((ShippingAddressParameters) ModelUtils.deserializeOpt(jsonObject.optJSONObject("shippingAddressParameters"), ShippingAddressParameters.SERIALIZER));
            return paymentDataRequestModel;
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull PaymentDataRequestModel modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("apiVersion", Integer.valueOf(modelObject.getApiVersion()));
                jSONObject.putOpt("apiVersionMinor", Integer.valueOf(modelObject.getApiVersionMinor()));
                jSONObject.putOpt("merchantInfo", ModelUtils.serializeOpt(modelObject.getMerchantInfo(), MerchantInfo.SERIALIZER));
                jSONObject.putOpt("allowedPaymentMethods", ModelUtils.serializeOptList(modelObject.getAllowedPaymentMethods(), GooglePayPaymentMethodModel.SERIALIZER));
                jSONObject.putOpt("transactionInfo", ModelUtils.serializeOpt(modelObject.getTransactionInfo(), TransactionInfoModel.SERIALIZER));
                jSONObject.putOpt("emailRequired", Boolean.valueOf(modelObject.isEmailRequired()));
                jSONObject.putOpt("shippingAddressRequired", Boolean.valueOf(modelObject.isShippingAddressRequired()));
                jSONObject.putOpt("shippingAddressParameters", ModelUtils.serializeOpt(modelObject.getShippingAddressParameters(), ShippingAddressParameters.SERIALIZER));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(PaymentDataRequestModel.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ PaymentDataRequestModel(int i11, int i12, MerchantInfo merchantInfo, List list, TransactionInfoModel transactionInfoModel, boolean z11, boolean z12, ShippingAddressParameters shippingAddressParameters, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? null : merchantInfo, (i13 & 8) != 0 ? null : list, (i13 & 16) != 0 ? null : transactionInfoModel, (i13 & 32) != 0 ? false : z11, (i13 & 64) != 0 ? false : z12, (i13 & 128) != 0 ? null : shippingAddressParameters);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentDataRequestModel copy$default(PaymentDataRequestModel paymentDataRequestModel, int i11, int i12, MerchantInfo merchantInfo, List list, TransactionInfoModel transactionInfoModel, boolean z11, boolean z12, ShippingAddressParameters shippingAddressParameters, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = paymentDataRequestModel.apiVersion;
        }
        if ((i13 & 2) != 0) {
            i12 = paymentDataRequestModel.apiVersionMinor;
        }
        if ((i13 & 4) != 0) {
            merchantInfo = paymentDataRequestModel.merchantInfo;
        }
        if ((i13 & 8) != 0) {
            list = paymentDataRequestModel.allowedPaymentMethods;
        }
        if ((i13 & 16) != 0) {
            transactionInfoModel = paymentDataRequestModel.transactionInfo;
        }
        if ((i13 & 32) != 0) {
            z11 = paymentDataRequestModel.isEmailRequired;
        }
        if ((i13 & 64) != 0) {
            z12 = paymentDataRequestModel.isShippingAddressRequired;
        }
        if ((i13 & 128) != 0) {
            shippingAddressParameters = paymentDataRequestModel.shippingAddressParameters;
        }
        boolean z13 = z12;
        ShippingAddressParameters shippingAddressParameters2 = shippingAddressParameters;
        TransactionInfoModel transactionInfoModel2 = transactionInfoModel;
        boolean z14 = z11;
        return paymentDataRequestModel.copy(i11, i12, merchantInfo, list, transactionInfoModel2, z14, z13, shippingAddressParameters2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getApiVersion() {
        return this.apiVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getApiVersionMinor() {
        return this.apiVersionMinor;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    @Nullable
    public final List<GooglePayPaymentMethodModel> component4() {
        return this.allowedPaymentMethods;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TransactionInfoModel getTransactionInfo() {
        return this.transactionInfo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsEmailRequired() {
        return this.isEmailRequired;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsShippingAddressRequired() {
        return this.isShippingAddressRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ShippingAddressParameters getShippingAddressParameters() {
        return this.shippingAddressParameters;
    }

    @NotNull
    public final PaymentDataRequestModel copy(int apiVersion, int apiVersionMinor, @Nullable MerchantInfo merchantInfo, @Nullable List<GooglePayPaymentMethodModel> allowedPaymentMethods, @Nullable TransactionInfoModel transactionInfo, boolean isEmailRequired, boolean isShippingAddressRequired, @Nullable ShippingAddressParameters shippingAddressParameters) {
        return new PaymentDataRequestModel(apiVersion, apiVersionMinor, merchantInfo, allowedPaymentMethods, transactionInfo, isEmailRequired, isShippingAddressRequired, shippingAddressParameters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentDataRequestModel)) {
            return false;
        }
        PaymentDataRequestModel paymentDataRequestModel = (PaymentDataRequestModel) other;
        return this.apiVersion == paymentDataRequestModel.apiVersion && this.apiVersionMinor == paymentDataRequestModel.apiVersionMinor && Intrinsics.areEqual(this.merchantInfo, paymentDataRequestModel.merchantInfo) && Intrinsics.areEqual(this.allowedPaymentMethods, paymentDataRequestModel.allowedPaymentMethods) && Intrinsics.areEqual(this.transactionInfo, paymentDataRequestModel.transactionInfo) && this.isEmailRequired == paymentDataRequestModel.isEmailRequired && this.isShippingAddressRequired == paymentDataRequestModel.isShippingAddressRequired && Intrinsics.areEqual(this.shippingAddressParameters, paymentDataRequestModel.shippingAddressParameters);
    }

    @Nullable
    public final List<GooglePayPaymentMethodModel> getAllowedPaymentMethods() {
        return this.allowedPaymentMethods;
    }

    public final int getApiVersion() {
        return this.apiVersion;
    }

    public final int getApiVersionMinor() {
        return this.apiVersionMinor;
    }

    @Nullable
    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    @Nullable
    public final ShippingAddressParameters getShippingAddressParameters() {
        return this.shippingAddressParameters;
    }

    @Nullable
    public final TransactionInfoModel getTransactionInfo() {
        return this.transactionInfo;
    }

    public int hashCode() {
        int iB = k.b(this.apiVersionMinor, Integer.hashCode(this.apiVersion) * 31, 31);
        MerchantInfo merchantInfo = this.merchantInfo;
        int iHashCode = (iB + (merchantInfo == null ? 0 : merchantInfo.hashCode())) * 31;
        List<GooglePayPaymentMethodModel> list = this.allowedPaymentMethods;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        TransactionInfoModel transactionInfoModel = this.transactionInfo;
        int iE = k.e(k.e((iHashCode2 + (transactionInfoModel == null ? 0 : transactionInfoModel.hashCode())) * 31, 31, this.isEmailRequired), 31, this.isShippingAddressRequired);
        ShippingAddressParameters shippingAddressParameters = this.shippingAddressParameters;
        return iE + (shippingAddressParameters != null ? shippingAddressParameters.hashCode() : 0);
    }

    public final boolean isEmailRequired() {
        return this.isEmailRequired;
    }

    public final boolean isShippingAddressRequired() {
        return this.isShippingAddressRequired;
    }

    public final void setAllowedPaymentMethods(@Nullable List<GooglePayPaymentMethodModel> list) {
        this.allowedPaymentMethods = list;
    }

    public final void setApiVersion(int i11) {
        this.apiVersion = i11;
    }

    public final void setApiVersionMinor(int i11) {
        this.apiVersionMinor = i11;
    }

    public final void setEmailRequired(boolean z11) {
        this.isEmailRequired = z11;
    }

    public final void setMerchantInfo(@Nullable MerchantInfo merchantInfo) {
        this.merchantInfo = merchantInfo;
    }

    public final void setShippingAddressParameters(@Nullable ShippingAddressParameters shippingAddressParameters) {
        this.shippingAddressParameters = shippingAddressParameters;
    }

    public final void setShippingAddressRequired(boolean z11) {
        this.isShippingAddressRequired = z11;
    }

    public final void setTransactionInfo(@Nullable TransactionInfoModel transactionInfoModel) {
        this.transactionInfo = transactionInfoModel;
    }

    @NotNull
    public String toString() {
        int i11 = this.apiVersion;
        int i12 = this.apiVersionMinor;
        MerchantInfo merchantInfo = this.merchantInfo;
        List<GooglePayPaymentMethodModel> list = this.allowedPaymentMethods;
        TransactionInfoModel transactionInfoModel = this.transactionInfo;
        boolean z11 = this.isEmailRequired;
        boolean z12 = this.isShippingAddressRequired;
        ShippingAddressParameters shippingAddressParameters = this.shippingAddressParameters;
        StringBuilder sbR = k.r(i11, i12, "PaymentDataRequestModel(apiVersion=", ", apiVersionMinor=", ", merchantInfo=");
        sbR.append(merchantInfo);
        sbR.append(", allowedPaymentMethods=");
        sbR.append(list);
        sbR.append(", transactionInfo=");
        sbR.append(transactionInfoModel);
        sbR.append(", isEmailRequired=");
        sbR.append(z11);
        sbR.append(", isShippingAddressRequired=");
        sbR.append(z12);
        sbR.append(", shippingAddressParameters=");
        sbR.append(shippingAddressParameters);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeInt(this.apiVersion);
        parcel.writeInt(this.apiVersionMinor);
        MerchantInfo merchantInfo = this.merchantInfo;
        if (merchantInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            merchantInfo.writeToParcel(parcel, flags);
        }
        List<GooglePayPaymentMethodModel> list = this.allowedPaymentMethods;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itQ = i.q(parcel, 1, list);
            while (itQ.hasNext()) {
                ((GooglePayPaymentMethodModel) itQ.next()).writeToParcel(parcel, flags);
            }
        }
        TransactionInfoModel transactionInfoModel = this.transactionInfo;
        if (transactionInfoModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transactionInfoModel.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isEmailRequired ? 1 : 0);
        parcel.writeInt(this.isShippingAddressRequired ? 1 : 0);
        ShippingAddressParameters shippingAddressParameters = this.shippingAddressParameters;
        if (shippingAddressParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingAddressParameters.writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentDataRequestModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentDataRequestModel createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            boolean z11;
            parcel.getClass();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            MerchantInfo merchantInfoCreateFromParcel = parcel.readInt() == 0 ? null : MerchantInfo.CREATOR.createFromParcel(parcel);
            boolean z12 = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                int iC = 0;
                while (iC != i13) {
                    iC = i.c(GooglePayPaymentMethodModel.CREATOR, parcel, arrayList2, iC, 1);
                }
                arrayList = arrayList2;
            }
            TransactionInfoModel transactionInfoModelCreateFromParcel = parcel.readInt() == 0 ? null : TransactionInfoModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z11 = false;
                z12 = true;
            } else {
                z11 = false;
            }
            return new PaymentDataRequestModel(i11, i12, merchantInfoCreateFromParcel, arrayList, transactionInfoModelCreateFromParcel, z12, parcel.readInt() == 0 ? z11 : true, parcel.readInt() != 0 ? ShippingAddressParameters.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentDataRequestModel[] newArray(int i11) {
            return new PaymentDataRequestModel[i11];
        }
    }

    public PaymentDataRequestModel() {
        this(0, 0, null, null, null, false, false, null, 255, null);
    }

    public PaymentDataRequestModel(int i11, int i12, @Nullable MerchantInfo merchantInfo, @Nullable List<GooglePayPaymentMethodModel> list, @Nullable TransactionInfoModel transactionInfoModel, boolean z11, boolean z12, @Nullable ShippingAddressParameters shippingAddressParameters) {
        this.apiVersion = i11;
        this.apiVersionMinor = i12;
        this.merchantInfo = merchantInfo;
        this.allowedPaymentMethods = list;
        this.transactionInfo = transactionInfoModel;
        this.isEmailRequired = z11;
        this.isShippingAddressRequired = z12;
        this.shippingAddressParameters = shippingAddressParameters;
    }
}
