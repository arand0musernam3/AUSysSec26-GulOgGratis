package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionOrderResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", SessionOrderResponse.SESSION_DATA, "", SessionOrderResponse.ORDER_DATA, SessionOrderResponse.PSP_REFERENCE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrderData", "()Ljava/lang/String;", "getPspReference", "getSessionData", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionOrderResponse extends ModelObject {

    @NotNull
    private static final String ORDER_DATA = "orderData";

    @NotNull
    private static final String PSP_REFERENCE = "pspReference";

    @NotNull
    private static final String SESSION_DATA = "sessionData";

    @NotNull
    private final String orderData;

    @NotNull
    private final String pspReference;

    @NotNull
    private final String sessionData;

    @NotNull
    public static final Parcelable.Creator<SessionOrderResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SessionOrderResponse> SERIALIZER = new ModelObject.Serializer<SessionOrderResponse>() { // from class: com.adyen.checkout.sessions.core.internal.data.model.SessionOrderResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SessionOrderResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "sessionData");
            if (stringOrNull == null) {
                stringOrNull = "";
            }
            String stringOrNull2 = JsonUtilsKt.getStringOrNull(jsonObject, "orderData");
            if (stringOrNull2 == null) {
                stringOrNull2 = "";
            }
            String stringOrNull3 = JsonUtilsKt.getStringOrNull(jsonObject, "pspReference");
            return new SessionOrderResponse(stringOrNull, stringOrNull2, stringOrNull3 != null ? stringOrNull3 : "");
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SessionOrderResponse modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("sessionData", modelObject.getSessionData());
                jSONObject.putOpt("orderData", modelObject.getOrderData());
                jSONObject.putOpt("pspReference", modelObject.getPspReference());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SessionOrderResponse.class, e5);
                return null;
            }
        }
    };

    public SessionOrderResponse(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.sessionData = str;
        this.orderData = str2;
        this.pspReference = str3;
    }

    public static /* synthetic */ SessionOrderResponse copy$default(SessionOrderResponse sessionOrderResponse, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionOrderResponse.sessionData;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionOrderResponse.orderData;
        }
        if ((i11 & 4) != 0) {
            str3 = sessionOrderResponse.pspReference;
        }
        return sessionOrderResponse.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderData() {
        return this.orderData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPspReference() {
        return this.pspReference;
    }

    @NotNull
    public final SessionOrderResponse copy(@NotNull String sessionData, @NotNull String orderData, @NotNull String pspReference) {
        sessionData.getClass();
        orderData.getClass();
        pspReference.getClass();
        return new SessionOrderResponse(sessionData, orderData, pspReference);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionOrderResponse)) {
            return false;
        }
        SessionOrderResponse sessionOrderResponse = (SessionOrderResponse) other;
        return Intrinsics.areEqual(this.sessionData, sessionOrderResponse.sessionData) && Intrinsics.areEqual(this.orderData, sessionOrderResponse.orderData) && Intrinsics.areEqual(this.pspReference, sessionOrderResponse.pspReference);
    }

    @NotNull
    public final String getOrderData() {
        return this.orderData;
    }

    @NotNull
    public final String getPspReference() {
        return this.pspReference;
    }

    @NotNull
    public final String getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        return this.pspReference.hashCode() + l1.b(this.sessionData.hashCode() * 31, 31, this.orderData);
    }

    @NotNull
    public String toString() {
        String str = this.sessionData;
        String str2 = this.orderData;
        return k.p(f.t("SessionOrderResponse(sessionData=", str, ", orderData=", str2, ", pspReference="), this.pspReference, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.sessionData);
        parcel.writeString(this.orderData);
        parcel.writeString(this.pspReference);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionOrderResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionOrderResponse createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SessionOrderResponse(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionOrderResponse[] newArray(int i11) {
            return new SessionOrderResponse[i11];
        }
    }
}
