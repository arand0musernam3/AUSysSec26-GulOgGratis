package com.adyen.checkout.adyen3ds2.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/internal/data/model/SubmitFingerprintRequest;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "encodedFingerprint", "", "paymentData", "(Ljava/lang/String;Ljava/lang/String;)V", "getEncodedFingerprint", "()Ljava/lang/String;", "getPaymentData", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SubmitFingerprintRequest extends ModelObject {

    @NotNull
    private static final String FINGERPRINT = "fingerprintResult";

    @NotNull
    private static final String PAYMENT_DATA = "paymentData";

    @Nullable
    private final String encodedFingerprint;

    @Nullable
    private final String paymentData;

    @NotNull
    public static final Parcelable.Creator<SubmitFingerprintRequest> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SubmitFingerprintRequest> SERIALIZER = new ModelObject.Serializer<SubmitFingerprintRequest>() { // from class: com.adyen.checkout.adyen3ds2.internal.data.model.SubmitFingerprintRequest$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SubmitFingerprintRequest deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new SubmitFingerprintRequest(JsonUtilsKt.getStringOrNull(jsonObject, "fingerprintResult"), JsonUtilsKt.getStringOrNull(jsonObject, "paymentData"));
            } catch (JSONException e5) {
                w.j(SubmitFingerprintRequest.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SubmitFingerprintRequest modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("fingerprintResult", modelObject.getEncodedFingerprint());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SubmitFingerprintRequest.class, e5);
                return null;
            }
        }
    };

    public SubmitFingerprintRequest(@Nullable String str, @Nullable String str2) {
        this.encodedFingerprint = str;
        this.paymentData = str2;
    }

    public static /* synthetic */ SubmitFingerprintRequest copy$default(SubmitFingerprintRequest submitFingerprintRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = submitFingerprintRequest.encodedFingerprint;
        }
        if ((i11 & 2) != 0) {
            str2 = submitFingerprintRequest.paymentData;
        }
        return submitFingerprintRequest.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncodedFingerprint() {
        return this.encodedFingerprint;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentData() {
        return this.paymentData;
    }

    @NotNull
    public final SubmitFingerprintRequest copy(@Nullable String encodedFingerprint, @Nullable String paymentData) {
        return new SubmitFingerprintRequest(encodedFingerprint, paymentData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitFingerprintRequest)) {
            return false;
        }
        SubmitFingerprintRequest submitFingerprintRequest = (SubmitFingerprintRequest) other;
        return Intrinsics.areEqual(this.encodedFingerprint, submitFingerprintRequest.encodedFingerprint) && Intrinsics.areEqual(this.paymentData, submitFingerprintRequest.paymentData);
    }

    @Nullable
    public final String getEncodedFingerprint() {
        return this.encodedFingerprint;
    }

    @Nullable
    public final String getPaymentData() {
        return this.paymentData;
    }

    public int hashCode() {
        String str = this.encodedFingerprint;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentData;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a.d("SubmitFingerprintRequest(encodedFingerprint=", this.encodedFingerprint, ", paymentData=", this.paymentData, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.encodedFingerprint);
        parcel.writeString(this.paymentData);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SubmitFingerprintRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubmitFingerprintRequest createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SubmitFingerprintRequest(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SubmitFingerprintRequest[] newArray(int i11) {
            return new SubmitFingerprintRequest[i11];
        }
    }
}
