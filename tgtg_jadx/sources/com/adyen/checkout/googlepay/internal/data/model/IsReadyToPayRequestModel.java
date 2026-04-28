package com.adyen.checkout.googlepay.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
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
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0001(B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J9\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/data/model/IsReadyToPayRequestModel;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", IsReadyToPayRequestModel.API_VERSION, "", IsReadyToPayRequestModel.API_VERSION_MINOR, IsReadyToPayRequestModel.ALLOWED_PAYMENT_METHODS, "", "Lcom/adyen/checkout/googlepay/internal/data/model/GooglePayPaymentMethodModel;", "isExistingPaymentMethodRequired", "", "(IILjava/util/List;Z)V", "getAllowedPaymentMethods", "()Ljava/util/List;", "setAllowedPaymentMethods", "(Ljava/util/List;)V", "getApiVersion", "()I", "setApiVersion", "(I)V", "getApiVersionMinor", "setApiVersionMinor", "()Z", "setExistingPaymentMethodRequired", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IsReadyToPayRequestModel extends ModelObject {

    @NotNull
    private static final String ALLOWED_PAYMENT_METHODS = "allowedPaymentMethods";

    @NotNull
    private static final String API_VERSION = "apiVersion";

    @NotNull
    private static final String API_VERSION_MINOR = "apiVersionMinor";

    @NotNull
    private static final String EXISTING_PAYMENT_METHOD_REQUIRED = "existingPaymentMethodRequired";

    @Nullable
    private List<GooglePayPaymentMethodModel> allowedPaymentMethods;
    private int apiVersion;
    private int apiVersionMinor;
    private boolean isExistingPaymentMethodRequired;

    @NotNull
    public static final Parcelable.Creator<IsReadyToPayRequestModel> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<IsReadyToPayRequestModel> SERIALIZER = new ModelObject.Serializer<IsReadyToPayRequestModel>() { // from class: com.adyen.checkout.googlepay.internal.data.model.IsReadyToPayRequestModel$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public IsReadyToPayRequestModel deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            Integer intOrNull = JsonUtilsKt.getIntOrNull(jsonObject, "apiVersion");
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            Integer intOrNull2 = JsonUtilsKt.getIntOrNull(jsonObject, "apiVersionMinor");
            int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
            List listDeserializeOptList = ModelUtils.deserializeOptList(jsonObject.optJSONArray("allowedPaymentMethods"), GooglePayPaymentMethodModel.SERIALIZER);
            Boolean booleanOrNull = JsonUtilsKt.getBooleanOrNull(jsonObject, "existingPaymentMethodRequired");
            return new IsReadyToPayRequestModel(iIntValue, iIntValue2, listDeserializeOptList, booleanOrNull != null ? booleanOrNull.booleanValue() : false);
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull IsReadyToPayRequestModel modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("apiVersion", Integer.valueOf(modelObject.getApiVersion()));
                jSONObject.putOpt("apiVersionMinor", Integer.valueOf(modelObject.getApiVersionMinor()));
                jSONObject.putOpt("allowedPaymentMethods", ModelUtils.serializeOptList(modelObject.getAllowedPaymentMethods(), GooglePayPaymentMethodModel.SERIALIZER));
                jSONObject.putOpt("existingPaymentMethodRequired", Boolean.valueOf(modelObject.isExistingPaymentMethodRequired()));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(IsReadyToPayRequestModel.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ IsReadyToPayRequestModel(int i11, int i12, List list, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? null : list, (i13 & 8) != 0 ? false : z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IsReadyToPayRequestModel copy$default(IsReadyToPayRequestModel isReadyToPayRequestModel, int i11, int i12, List list, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = isReadyToPayRequestModel.apiVersion;
        }
        if ((i13 & 2) != 0) {
            i12 = isReadyToPayRequestModel.apiVersionMinor;
        }
        if ((i13 & 4) != 0) {
            list = isReadyToPayRequestModel.allowedPaymentMethods;
        }
        if ((i13 & 8) != 0) {
            z11 = isReadyToPayRequestModel.isExistingPaymentMethodRequired;
        }
        return isReadyToPayRequestModel.copy(i11, i12, list, z11);
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
    public final List<GooglePayPaymentMethodModel> component3() {
        return this.allowedPaymentMethods;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsExistingPaymentMethodRequired() {
        return this.isExistingPaymentMethodRequired;
    }

    @NotNull
    public final IsReadyToPayRequestModel copy(int apiVersion, int apiVersionMinor, @Nullable List<GooglePayPaymentMethodModel> allowedPaymentMethods, boolean isExistingPaymentMethodRequired) {
        return new IsReadyToPayRequestModel(apiVersion, apiVersionMinor, allowedPaymentMethods, isExistingPaymentMethodRequired);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsReadyToPayRequestModel)) {
            return false;
        }
        IsReadyToPayRequestModel isReadyToPayRequestModel = (IsReadyToPayRequestModel) other;
        return this.apiVersion == isReadyToPayRequestModel.apiVersion && this.apiVersionMinor == isReadyToPayRequestModel.apiVersionMinor && Intrinsics.areEqual(this.allowedPaymentMethods, isReadyToPayRequestModel.allowedPaymentMethods) && this.isExistingPaymentMethodRequired == isReadyToPayRequestModel.isExistingPaymentMethodRequired;
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

    public int hashCode() {
        int iB = k.b(this.apiVersionMinor, Integer.hashCode(this.apiVersion) * 31, 31);
        List<GooglePayPaymentMethodModel> list = this.allowedPaymentMethods;
        return Boolean.hashCode(this.isExistingPaymentMethodRequired) + ((iB + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final boolean isExistingPaymentMethodRequired() {
        return this.isExistingPaymentMethodRequired;
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

    public final void setExistingPaymentMethodRequired(boolean z11) {
        this.isExistingPaymentMethodRequired = z11;
    }

    @NotNull
    public String toString() {
        int i11 = this.apiVersion;
        int i12 = this.apiVersionMinor;
        List<GooglePayPaymentMethodModel> list = this.allowedPaymentMethods;
        boolean z11 = this.isExistingPaymentMethodRequired;
        StringBuilder sbR = k.r(i11, i12, "IsReadyToPayRequestModel(apiVersion=", ", apiVersionMinor=", ", allowedPaymentMethods=");
        sbR.append(list);
        sbR.append(", isExistingPaymentMethodRequired=");
        sbR.append(z11);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeInt(this.apiVersion);
        parcel.writeInt(this.apiVersionMinor);
        List<GooglePayPaymentMethodModel> list = this.allowedPaymentMethods;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itQ = i.q(parcel, 1, list);
            while (itQ.hasNext()) {
                ((GooglePayPaymentMethodModel) itQ.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.isExistingPaymentMethodRequired ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IsReadyToPayRequestModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IsReadyToPayRequestModel createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
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
            return new IsReadyToPayRequestModel(i11, i12, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final IsReadyToPayRequestModel[] newArray(int i11) {
            return new IsReadyToPayRequestModel[i11];
        }
    }

    public IsReadyToPayRequestModel() {
        this(0, 0, null, false, 15, null);
    }

    public IsReadyToPayRequestModel(int i11, int i12, @Nullable List<GooglePayPaymentMethodModel> list, boolean z11) {
        this.apiVersion = i11;
        this.apiVersionMinor = i12;
        this.allowedPaymentMethods = list;
        this.isExistingPaymentMethodRequired = z11;
    }
}
