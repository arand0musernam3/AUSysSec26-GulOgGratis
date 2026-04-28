package com.adyen.checkout.components.core.action;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/adyen/checkout/components/core/action/AwaitAction;", "Lcom/adyen/checkout/components/core/action/Action;", "type", "", "paymentData", Action.PAYMENT_METHOD_TYPE, "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPaymentData", "()Ljava/lang/String;", "setPaymentData", "(Ljava/lang/String;)V", "getPaymentMethodType", "setPaymentMethodType", "getType", "setType", "getUrl", "setUrl", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AwaitAction extends Action {

    @NotNull
    public static final String ACTION_TYPE = "await";

    @NotNull
    private static final String URL = "url";

    @Nullable
    private String paymentData;

    @Nullable
    private String paymentMethodType;

    @Nullable
    private String type;

    @Nullable
    private String url;

    @NotNull
    public static final Parcelable.Creator<AwaitAction> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<AwaitAction> SERIALIZER = new ModelObject.Serializer<AwaitAction>() { // from class: com.adyen.checkout.components.core.action.AwaitAction$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public AwaitAction deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new AwaitAction(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, "paymentData"), JsonUtilsKt.getStringOrNull(jsonObject, Action.PAYMENT_METHOD_TYPE), JsonUtilsKt.getStringOrNull(jsonObject, Constants.BRAZE_WEBVIEW_URL_EXTRA));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull AwaitAction modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt(Constants.BRAZE_WEBVIEW_URL_EXTRA, modelObject.getUrl());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(RedirectAction.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ AwaitAction(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
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

    @Override // com.adyen.checkout.components.core.action.Action
    @Nullable
    public String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentData(@Nullable String str) {
        this.paymentData = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentMethodType(@Nullable String str) {
        this.paymentMethodType = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.paymentData);
        parcel.writeString(this.paymentMethodType);
        parcel.writeString(this.url);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AwaitAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AwaitAction createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new AwaitAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AwaitAction[] newArray(int i11) {
            return new AwaitAction[i11];
        }
    }

    public AwaitAction() {
        this(null, null, null, null, 15, null);
    }

    public AwaitAction(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.type = str;
        this.paymentData = str2;
        this.paymentMethodType = str3;
        this.url = str4;
    }
}
