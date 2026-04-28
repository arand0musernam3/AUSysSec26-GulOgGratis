package com.adyen.checkout.components.core.action;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import e0.f;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006%"}, d2 = {"Lcom/adyen/checkout/components/core/action/Threeds2FingerprintAction;", "Lcom/adyen/checkout/components/core/action/BaseThreeds2Action;", "type", "", "paymentData", Action.PAYMENT_METHOD_TYPE, Threeds2FingerprintAction.TOKEN, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentData", "()Ljava/lang/String;", "setPaymentData", "(Ljava/lang/String;)V", "getPaymentMethodType", "setPaymentMethodType", "getToken", "setToken", "getType", "setType", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final /* data */ class Threeds2FingerprintAction extends BaseThreeds2Action {

    @NotNull
    public static final String ACTION_TYPE = "threeDS2Fingerprint";

    @NotNull
    private static final String TOKEN = "token";

    @Nullable
    private String paymentData;

    @Nullable
    private String paymentMethodType;

    @Nullable
    private String token;

    @Nullable
    private String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Threeds2FingerprintAction> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<Threeds2FingerprintAction> SERIALIZER = new ModelObject.Serializer<Threeds2FingerprintAction>() { // from class: com.adyen.checkout.components.core.action.Threeds2FingerprintAction$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public Threeds2FingerprintAction deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                return new Threeds2FingerprintAction(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, "paymentData"), JsonUtilsKt.getStringOrNull(jsonObject, Action.PAYMENT_METHOD_TYPE), JsonUtilsKt.getStringOrNull(jsonObject, "token"));
            } catch (JSONException e5) {
                w.j(Threeds2Action.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull Threeds2FingerprintAction modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt("token", modelObject.getToken());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(Threeds2FingerprintAction.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ Threeds2FingerprintAction(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ Threeds2FingerprintAction copy$default(Threeds2FingerprintAction threeds2FingerprintAction, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = threeds2FingerprintAction.type;
        }
        if ((i11 & 2) != 0) {
            str2 = threeds2FingerprintAction.paymentData;
        }
        if ((i11 & 4) != 0) {
            str3 = threeds2FingerprintAction.paymentMethodType;
        }
        if ((i11 & 8) != 0) {
            str4 = threeds2FingerprintAction.token;
        }
        return threeds2FingerprintAction.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentData() {
        return this.paymentData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final Threeds2FingerprintAction copy(@Nullable String type, @Nullable String paymentData, @Nullable String paymentMethodType, @Nullable String token) {
        return new Threeds2FingerprintAction(type, paymentData, paymentMethodType, token);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Threeds2FingerprintAction)) {
            return false;
        }
        Threeds2FingerprintAction threeds2FingerprintAction = (Threeds2FingerprintAction) other;
        return Intrinsics.areEqual(this.type, threeds2FingerprintAction.type) && Intrinsics.areEqual(this.paymentData, threeds2FingerprintAction.paymentData) && Intrinsics.areEqual(this.paymentMethodType, threeds2FingerprintAction.paymentMethodType) && Intrinsics.areEqual(this.token, threeds2FingerprintAction.token);
    }

    @Override // com.adyen.checkout.components.core.action.Action
    @Nullable
    public String getPaymentData() {
        return this.paymentData;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    @Nullable
    public String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    @Nullable
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentData;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.token;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentData(@Nullable String str) {
        this.paymentData = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentMethodType(@Nullable String str) {
        this.paymentMethodType = str;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.paymentData;
        return f.o(f.t("Threeds2FingerprintAction(type=", str, ", paymentData=", str2, ", paymentMethodType="), this.paymentMethodType, ", token=", this.token, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.paymentData);
        parcel.writeString(this.paymentMethodType);
        parcel.writeString(this.token);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/components/core/action/Threeds2FingerprintAction$Companion;", "", "()V", "ACTION_TYPE", "", ModelUtils.SERIALIZER_FIELD_NAME, "Lcom/adyen/checkout/core/internal/data/model/ModelObject$Serializer;", "Lcom/adyen/checkout/components/core/action/Threeds2FingerprintAction;", "getSERIALIZER$annotations", "TOKEN", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getSERIALIZER$annotations() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Threeds2FingerprintAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Threeds2FingerprintAction createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new Threeds2FingerprintAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Threeds2FingerprintAction[] newArray(int i11) {
            return new Threeds2FingerprintAction[i11];
        }
    }

    public Threeds2FingerprintAction() {
        this(null, null, null, null, 15, null);
    }

    public Threeds2FingerprintAction(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.type = str;
        this.paymentData = str2;
        this.paymentMethodType = str3;
        this.token = str4;
    }
}
