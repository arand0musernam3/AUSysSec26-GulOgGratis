package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", "checkoutAttemptId", "", "(Ljava/lang/String;)V", "getCheckoutAttemptId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsSetupResponse extends ModelObject {

    @NotNull
    private static final String CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";

    @Nullable
    private final String checkoutAttemptId;

    @NotNull
    public static final Parcelable.Creator<AnalyticsSetupResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<AnalyticsSetupResponse> SERIALIZER = new ModelObject.Serializer<AnalyticsSetupResponse>() { // from class: com.adyen.checkout.components.core.internal.data.model.AnalyticsSetupResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public AnalyticsSetupResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new AnalyticsSetupResponse(JsonUtilsKt.getStringOrNull(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID));
            } catch (JSONException e5) {
                w.j(AnalyticsSetupResponse.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull AnalyticsSetupResponse modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(AnalyticsSetupResponse.class, e5);
                return null;
            }
        }
    };

    public AnalyticsSetupResponse(@Nullable String str) {
        this.checkoutAttemptId = str;
    }

    public static /* synthetic */ AnalyticsSetupResponse copy$default(AnalyticsSetupResponse analyticsSetupResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = analyticsSetupResponse.checkoutAttemptId;
        }
        return analyticsSetupResponse.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    @NotNull
    public final AnalyticsSetupResponse copy(@Nullable String checkoutAttemptId) {
        return new AnalyticsSetupResponse(checkoutAttemptId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AnalyticsSetupResponse) && Intrinsics.areEqual(this.checkoutAttemptId, ((AnalyticsSetupResponse) other).checkoutAttemptId);
    }

    @Nullable
    public final String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    public int hashCode() {
        String str = this.checkoutAttemptId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return a0.p("AnalyticsSetupResponse(checkoutAttemptId=", this.checkoutAttemptId, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.checkoutAttemptId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnalyticsSetupResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsSetupResponse createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new AnalyticsSetupResponse(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsSetupResponse[] newArray(int i11) {
            return new AnalyticsSetupResponse[i11];
        }
    }
}
