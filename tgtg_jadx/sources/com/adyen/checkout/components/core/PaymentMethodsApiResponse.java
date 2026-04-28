package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016HÖ\u0001R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", PaymentMethodsApiResponse.STORED_PAYMENT_METHODS, "", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", PaymentMethodsApiResponse.PAYMENT_METHODS, "Lcom/adyen/checkout/components/core/PaymentMethod;", "(Ljava/util/List;Ljava/util/List;)V", "getPaymentMethods", "()Ljava/util/List;", "setPaymentMethods", "(Ljava/util/List;)V", "getStoredPaymentMethods", "setStoredPaymentMethods", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentMethodsApiResponse extends ModelObject {

    @NotNull
    private static final String PAYMENT_METHODS = "paymentMethods";

    @NotNull
    private static final String STORED_PAYMENT_METHODS = "storedPaymentMethods";

    @Nullable
    private List<PaymentMethod> paymentMethods;

    @Nullable
    private List<StoredPaymentMethod> storedPaymentMethods;

    @NotNull
    public static final Parcelable.Creator<PaymentMethodsApiResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<PaymentMethodsApiResponse> SERIALIZER = new ModelObject.Serializer<PaymentMethodsApiResponse>() { // from class: com.adyen.checkout.components.core.PaymentMethodsApiResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public PaymentMethodsApiResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new PaymentMethodsApiResponse(ModelUtils.deserializeOptList(jsonObject.optJSONArray("storedPaymentMethods"), StoredPaymentMethod.SERIALIZER), ModelUtils.deserializeOptList(jsonObject.optJSONArray("paymentMethods"), PaymentMethod.SERIALIZER));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull PaymentMethodsApiResponse modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("storedPaymentMethods", ModelUtils.serializeOptList(modelObject.getStoredPaymentMethods(), StoredPaymentMethod.SERIALIZER));
                jSONObject.putOpt("paymentMethods", ModelUtils.serializeOptList(modelObject.getPaymentMethods(), PaymentMethod.SERIALIZER));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(PaymentMethodsApiResponse.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ PaymentMethodsApiResponse(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodsApiResponse copy$default(PaymentMethodsApiResponse paymentMethodsApiResponse, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = paymentMethodsApiResponse.storedPaymentMethods;
        }
        if ((i11 & 2) != 0) {
            list2 = paymentMethodsApiResponse.paymentMethods;
        }
        return paymentMethodsApiResponse.copy(list, list2);
    }

    @Nullable
    public final List<StoredPaymentMethod> component1() {
        return this.storedPaymentMethods;
    }

    @Nullable
    public final List<PaymentMethod> component2() {
        return this.paymentMethods;
    }

    @NotNull
    public final PaymentMethodsApiResponse copy(@Nullable List<StoredPaymentMethod> storedPaymentMethods, @Nullable List<PaymentMethod> paymentMethods) {
        return new PaymentMethodsApiResponse(storedPaymentMethods, paymentMethods);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodsApiResponse)) {
            return false;
        }
        PaymentMethodsApiResponse paymentMethodsApiResponse = (PaymentMethodsApiResponse) other;
        return Intrinsics.areEqual(this.storedPaymentMethods, paymentMethodsApiResponse.storedPaymentMethods) && Intrinsics.areEqual(this.paymentMethods, paymentMethodsApiResponse.paymentMethods);
    }

    @Nullable
    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    @Nullable
    public final List<StoredPaymentMethod> getStoredPaymentMethods() {
        return this.storedPaymentMethods;
    }

    public int hashCode() {
        List<StoredPaymentMethod> list = this.storedPaymentMethods;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PaymentMethod> list2 = this.paymentMethods;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setPaymentMethods(@Nullable List<PaymentMethod> list) {
        this.paymentMethods = list;
    }

    public final void setStoredPaymentMethods(@Nullable List<StoredPaymentMethod> list) {
        this.storedPaymentMethods = list;
    }

    @NotNull
    public String toString() {
        return "PaymentMethodsApiResponse(storedPaymentMethods=" + this.storedPaymentMethods + ", paymentMethods=" + this.paymentMethods + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        List<StoredPaymentMethod> list = this.storedPaymentMethods;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itQ = i.q(parcel, 1, list);
            while (itQ.hasNext()) {
                ((StoredPaymentMethod) itQ.next()).writeToParcel(parcel, flags);
            }
        }
        List<PaymentMethod> list2 = this.paymentMethods;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itQ2 = i.q(parcel, 1, list2);
        while (itQ2.hasNext()) {
            ((PaymentMethod) itQ2.next()).writeToParcel(parcel, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethodsApiResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentMethodsApiResponse createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int iC = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                int iC2 = 0;
                while (iC2 != i11) {
                    iC2 = i.c(StoredPaymentMethod.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList2 = new ArrayList(i12);
                while (iC != i12) {
                    iC = i.c(PaymentMethod.CREATOR, parcel, arrayList2, iC, 1);
                }
            }
            return new PaymentMethodsApiResponse(arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final PaymentMethodsApiResponse[] newArray(int i11) {
            return new PaymentMethodsApiResponse[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsApiResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public PaymentMethodsApiResponse(@Nullable List<StoredPaymentMethod> list, @Nullable List<PaymentMethod> list2) {
        this.storedPaymentMethods = list;
        this.paymentMethods = list2;
    }
}
