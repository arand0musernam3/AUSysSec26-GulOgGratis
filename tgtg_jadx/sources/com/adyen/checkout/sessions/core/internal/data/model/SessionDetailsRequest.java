package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.util.JSONObjectParceler;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsRequest;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", SessionDetailsRequest.SESSION_DATA, "", "paymentData", "details", "Lorg/json/JSONObject;", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "getDetails", "()Lorg/json/JSONObject;", "getPaymentData", "()Ljava/lang/String;", "getSessionData", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionDetailsRequest extends ModelObject {

    @NotNull
    private static final String DETAILS = "details";

    @NotNull
    private static final String PAYMENT_DATA = "paymentData";

    @NotNull
    private static final String SESSION_DATA = "sessionData";

    @Nullable
    private final JSONObject details;

    @Nullable
    private final String paymentData;

    @NotNull
    private final String sessionData;

    @NotNull
    public static final Parcelable.Creator<SessionDetailsRequest> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SessionDetailsRequest> SERIALIZER = new ModelObject.Serializer<SessionDetailsRequest>() { // from class: com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsRequest$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SessionDetailsRequest deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "sessionData");
                if (stringOrNull == null) {
                    stringOrNull = "";
                }
                return new SessionDetailsRequest(stringOrNull, JsonUtilsKt.getStringOrNull(jsonObject, "paymentData"), jsonObject.optJSONObject(ErrorBundle.DETAIL_ENTRY));
            } catch (JSONException e5) {
                w.j(SessionDetailsRequest.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SessionDetailsRequest modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("sessionData", modelObject.getSessionData());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(ErrorBundle.DETAIL_ENTRY, modelObject.getDetails());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SessionDetailsRequest.class, e5);
                return null;
            }
        }
    };

    public SessionDetailsRequest(@NotNull String str, @Nullable String str2, @Nullable JSONObject jSONObject) {
        str.getClass();
        this.sessionData = str;
        this.paymentData = str2;
        this.details = jSONObject;
    }

    public static /* synthetic */ SessionDetailsRequest copy$default(SessionDetailsRequest sessionDetailsRequest, String str, String str2, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionDetailsRequest.sessionData;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionDetailsRequest.paymentData;
        }
        if ((i11 & 4) != 0) {
            jSONObject = sessionDetailsRequest.details;
        }
        return sessionDetailsRequest.copy(str, str2, jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentData() {
        return this.paymentData;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JSONObject getDetails() {
        return this.details;
    }

    @NotNull
    public final SessionDetailsRequest copy(@NotNull String sessionData, @Nullable String paymentData, @Nullable JSONObject details) {
        sessionData.getClass();
        return new SessionDetailsRequest(sessionData, paymentData, details);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDetailsRequest)) {
            return false;
        }
        SessionDetailsRequest sessionDetailsRequest = (SessionDetailsRequest) other;
        return Intrinsics.areEqual(this.sessionData, sessionDetailsRequest.sessionData) && Intrinsics.areEqual(this.paymentData, sessionDetailsRequest.paymentData) && Intrinsics.areEqual(this.details, sessionDetailsRequest.details);
    }

    @Nullable
    public final JSONObject getDetails() {
        return this.details;
    }

    @Nullable
    public final String getPaymentData() {
        return this.paymentData;
    }

    @NotNull
    public final String getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        int iHashCode = this.sessionData.hashCode() * 31;
        String str = this.paymentData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        JSONObject jSONObject = this.details;
        return iHashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.sessionData;
        String str2 = this.paymentData;
        JSONObject jSONObject = this.details;
        StringBuilder sbT = f.t("SessionDetailsRequest(sessionData=", str, ", paymentData=", str2, ", details=");
        sbT.append(jSONObject);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.sessionData);
        parcel.writeString(this.paymentData);
        JSONObjectParceler.INSTANCE.write(this.details, parcel, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionDetailsRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionDetailsRequest createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SessionDetailsRequest(parcel.readString(), parcel.readString(), JSONObjectParceler.INSTANCE.create(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionDetailsRequest[] newArray(int i11) {
            return new SessionDetailsRequest[i11];
        }
    }
}
