package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.OrderResponse;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020!HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006)"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", SessionPaymentsResponse.SESSION_DATA, "", SessionPaymentsResponse.STATUS, "resultCode", SessionPaymentsResponse.ACTION, "Lcom/adyen/checkout/components/core/action/Action;", SessionPaymentsResponse.ORDER, "Lcom/adyen/checkout/components/core/OrderResponse;", SessionPaymentsResponse.SESSION_RESULT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/action/Action;Lcom/adyen/checkout/components/core/OrderResponse;Ljava/lang/String;)V", "getAction", "()Lcom/adyen/checkout/components/core/action/Action;", "getOrder", "()Lcom/adyen/checkout/components/core/OrderResponse;", "getResultCode", "()Ljava/lang/String;", "getSessionData", "getSessionResult", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionPaymentsResponse extends ModelObject {

    @NotNull
    private static final String ACTION = "action";

    @NotNull
    private static final String ORDER = "order";

    @NotNull
    private static final String RESULT_CODE = "resultCode";

    @NotNull
    private static final String SESSION_DATA = "sessionData";

    @NotNull
    private static final String SESSION_RESULT = "sessionResult";

    @NotNull
    private static final String STATUS = "status";

    @Nullable
    private final Action action;

    @Nullable
    private final OrderResponse order;

    @Nullable
    private final String resultCode;

    @NotNull
    private final String sessionData;

    @Nullable
    private final String sessionResult;

    @Nullable
    private final String status;

    @NotNull
    public static final Parcelable.Creator<SessionPaymentsResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SessionPaymentsResponse> SERIALIZER = new ModelObject.Serializer<SessionPaymentsResponse>() { // from class: com.adyen.checkout.sessions.core.internal.data.model.SessionPaymentsResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SessionPaymentsResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "sessionData");
            if (stringOrNull == null) {
                stringOrNull = "";
            }
            return new SessionPaymentsResponse(stringOrNull, JsonUtilsKt.getStringOrNull(jsonObject, "status"), JsonUtilsKt.getStringOrNull(jsonObject, StatusResponse.RESULT_CODE), (Action) ModelUtils.deserializeOpt(jsonObject.optJSONObject("action"), Action.SERIALIZER), (OrderResponse) ModelUtils.deserializeOpt(jsonObject.optJSONObject("order"), OrderResponse.SERIALIZER), JsonUtilsKt.getStringOrNull(jsonObject, "sessionResult"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SessionPaymentsResponse modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("sessionData", modelObject.getSessionData());
                jSONObject.putOpt("status", modelObject.getStatus());
                jSONObject.putOpt(StatusResponse.RESULT_CODE, modelObject.getResultCode());
                jSONObject.putOpt("action", ModelUtils.serializeOpt(modelObject.getAction(), Action.SERIALIZER));
                jSONObject.putOpt("order", ModelUtils.serializeOpt(modelObject.getOrder(), OrderResponse.SERIALIZER));
                jSONObject.putOpt("sessionResult", modelObject.getSessionResult());
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SessionPaymentsResponse.class, e5);
                return null;
            }
        }
    };

    public SessionPaymentsResponse(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Action action, @Nullable OrderResponse orderResponse, @Nullable String str4) {
        str.getClass();
        this.sessionData = str;
        this.status = str2;
        this.resultCode = str3;
        this.action = action;
        this.order = orderResponse;
        this.sessionResult = str4;
    }

    public static /* synthetic */ SessionPaymentsResponse copy$default(SessionPaymentsResponse sessionPaymentsResponse, String str, String str2, String str3, Action action, OrderResponse orderResponse, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionPaymentsResponse.sessionData;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionPaymentsResponse.status;
        }
        if ((i11 & 4) != 0) {
            str3 = sessionPaymentsResponse.resultCode;
        }
        if ((i11 & 8) != 0) {
            action = sessionPaymentsResponse.action;
        }
        if ((i11 & 16) != 0) {
            orderResponse = sessionPaymentsResponse.order;
        }
        if ((i11 & 32) != 0) {
            str4 = sessionPaymentsResponse.sessionResult;
        }
        OrderResponse orderResponse2 = orderResponse;
        String str5 = str4;
        return sessionPaymentsResponse.copy(str, str2, str3, action, orderResponse2, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getResultCode() {
        return this.resultCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrderResponse getOrder() {
        return this.order;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSessionResult() {
        return this.sessionResult;
    }

    @NotNull
    public final SessionPaymentsResponse copy(@NotNull String sessionData, @Nullable String status, @Nullable String resultCode, @Nullable Action action, @Nullable OrderResponse order, @Nullable String sessionResult) {
        sessionData.getClass();
        return new SessionPaymentsResponse(sessionData, status, resultCode, action, order, sessionResult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionPaymentsResponse)) {
            return false;
        }
        SessionPaymentsResponse sessionPaymentsResponse = (SessionPaymentsResponse) other;
        return Intrinsics.areEqual(this.sessionData, sessionPaymentsResponse.sessionData) && Intrinsics.areEqual(this.status, sessionPaymentsResponse.status) && Intrinsics.areEqual(this.resultCode, sessionPaymentsResponse.resultCode) && Intrinsics.areEqual(this.action, sessionPaymentsResponse.action) && Intrinsics.areEqual(this.order, sessionPaymentsResponse.order) && Intrinsics.areEqual(this.sessionResult, sessionPaymentsResponse.sessionResult);
    }

    @Nullable
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public final OrderResponse getOrder() {
        return this.order;
    }

    @Nullable
    public final String getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final String getSessionData() {
        return this.sessionData;
    }

    @Nullable
    public final String getSessionResult() {
        return this.sessionResult;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.sessionData.hashCode() * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.resultCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Action action = this.action;
        int iHashCode4 = (iHashCode3 + (action == null ? 0 : action.hashCode())) * 31;
        OrderResponse orderResponse = this.order;
        int iHashCode5 = (iHashCode4 + (orderResponse == null ? 0 : orderResponse.hashCode())) * 31;
        String str3 = this.sessionResult;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.sessionData;
        String str2 = this.status;
        String str3 = this.resultCode;
        Action action = this.action;
        OrderResponse orderResponse = this.order;
        String str4 = this.sessionResult;
        StringBuilder sbT = f.t("SessionPaymentsResponse(sessionData=", str, ", status=", str2, ", resultCode=");
        sbT.append(str3);
        sbT.append(", action=");
        sbT.append(action);
        sbT.append(", order=");
        sbT.append(orderResponse);
        sbT.append(", sessionResult=");
        sbT.append(str4);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.sessionData);
        parcel.writeString(this.status);
        parcel.writeString(this.resultCode);
        parcel.writeParcelable(this.action, flags);
        parcel.writeParcelable(this.order, flags);
        parcel.writeString(this.sessionResult);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionPaymentsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionPaymentsResponse createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SessionPaymentsResponse(parcel.readString(), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(SessionPaymentsResponse.class.getClassLoader()), (OrderResponse) parcel.readParcelable(SessionPaymentsResponse.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionPaymentsResponse[] newArray(int i11) {
            return new SessionPaymentsResponse[i11];
        }
    }
}
