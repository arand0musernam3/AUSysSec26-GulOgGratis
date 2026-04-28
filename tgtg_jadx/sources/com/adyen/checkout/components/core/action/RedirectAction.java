package com.adyen.checkout.components.core.action;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.braze.Constants;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006-"}, d2 = {"Lcom/adyen/checkout/components/core/action/RedirectAction;", "Lcom/adyen/checkout/components/core/action/Action;", "type", "", "paymentData", Action.PAYMENT_METHOD_TYPE, RedirectAction.METHOD, "url", RedirectAction.NATIVE_REDIRECT_DATA, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "setMethod", "(Ljava/lang/String;)V", "getNativeRedirectData", "setNativeRedirectData", "getPaymentData", "setPaymentData", "getPaymentMethodType", "setPaymentMethodType", "getType", "setType", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RedirectAction extends Action {

    @NotNull
    public static final String ACTION_TYPE = "redirect";

    @NotNull
    private static final String METHOD = "method";

    @NotNull
    private static final String NATIVE_REDIRECT_DATA = "nativeRedirectData";

    @NotNull
    private static final String URL = "url";

    @Nullable
    private String method;

    @Nullable
    private String nativeRedirectData;

    @Nullable
    private String paymentData;

    @Nullable
    private String paymentMethodType;

    @Nullable
    private String type;

    @Nullable
    private String url;

    @NotNull
    public static final Parcelable.Creator<RedirectAction> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<RedirectAction> SERIALIZER = new ModelObject.Serializer<RedirectAction>() { // from class: com.adyen.checkout.components.core.action.RedirectAction$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public RedirectAction deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            return new RedirectAction(JsonUtilsKt.getStringOrNull(jsonObject, "type"), JsonUtilsKt.getStringOrNull(jsonObject, "paymentData"), JsonUtilsKt.getStringOrNull(jsonObject, Action.PAYMENT_METHOD_TYPE), JsonUtilsKt.getStringOrNull(jsonObject, "method"), JsonUtilsKt.getStringOrNull(jsonObject, Constants.BRAZE_WEBVIEW_URL_EXTRA), JsonUtilsKt.getStringOrNull(jsonObject, "nativeRedirectData"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull RedirectAction modelObject) {
            modelObject.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt("method", modelObject.getMethod());
                jSONObject.putOpt(Constants.BRAZE_WEBVIEW_URL_EXTRA, modelObject.getUrl());
                jSONObject.putOpt("nativeRedirectData", modelObject.getNativeRedirectData());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(RedirectAction.class, e5);
                return null;
            }
        }
    };

    public /* synthetic */ RedirectAction(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }

    public static /* synthetic */ RedirectAction copy$default(RedirectAction redirectAction, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = redirectAction.type;
        }
        if ((i11 & 2) != 0) {
            str2 = redirectAction.paymentData;
        }
        if ((i11 & 4) != 0) {
            str3 = redirectAction.paymentMethodType;
        }
        if ((i11 & 8) != 0) {
            str4 = redirectAction.method;
        }
        if ((i11 & 16) != 0) {
            str5 = redirectAction.url;
        }
        if ((i11 & 32) != 0) {
            str6 = redirectAction.nativeRedirectData;
        }
        String str7 = str5;
        String str8 = str6;
        return redirectAction.copy(str, str2, str3, str4, str7, str8);
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
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNativeRedirectData() {
        return this.nativeRedirectData;
    }

    @NotNull
    public final RedirectAction copy(@Nullable String type, @Nullable String paymentData, @Nullable String paymentMethodType, @Nullable String method, @Nullable String url, @Nullable String nativeRedirectData) {
        return new RedirectAction(type, paymentData, paymentMethodType, method, url, nativeRedirectData);
    }

    @Override // com.adyen.checkout.core.internal.data.model.ModelObject, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedirectAction)) {
            return false;
        }
        RedirectAction redirectAction = (RedirectAction) other;
        return Intrinsics.areEqual(this.type, redirectAction.type) && Intrinsics.areEqual(this.paymentData, redirectAction.paymentData) && Intrinsics.areEqual(this.paymentMethodType, redirectAction.paymentMethodType) && Intrinsics.areEqual(this.method, redirectAction.method) && Intrinsics.areEqual(this.url, redirectAction.url) && Intrinsics.areEqual(this.nativeRedirectData, redirectAction.nativeRedirectData);
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final String getNativeRedirectData() {
        return this.nativeRedirectData;
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

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentData;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.method;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nativeRedirectData;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setMethod(@Nullable String str) {
        this.method = str;
    }

    public final void setNativeRedirectData(@Nullable String str) {
        this.nativeRedirectData = str;
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

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.paymentData;
        String str3 = this.paymentMethodType;
        String str4 = this.method;
        String str5 = this.url;
        String str6 = this.nativeRedirectData;
        StringBuilder sbT = f.t("RedirectAction(type=", str, ", paymentData=", str2, ", paymentMethodType=");
        s.A(sbT, str3, ", method=", str4, ", url=");
        return f.o(sbT, str5, ", nativeRedirectData=", str6, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.type);
        parcel.writeString(this.paymentData);
        parcel.writeString(this.paymentMethodType);
        parcel.writeString(this.method);
        parcel.writeString(this.url);
        parcel.writeString(this.nativeRedirectData);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RedirectAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RedirectAction createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new RedirectAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final RedirectAction[] newArray(int i11) {
            return new RedirectAction[i11];
        }
    }

    public RedirectAction() {
        this(null, null, null, null, null, null, 63, null);
    }

    public RedirectAction(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.type = str;
        this.paymentData = str2;
        this.paymentMethodType = str3;
        this.method = str4;
        this.url = str5;
        this.nativeRedirectData = str6;
    }
}
