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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020!HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006)"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", SessionDetailsResponse.SESSION_DATA, "", SessionDetailsResponse.STATUS, "resultCode", SessionDetailsResponse.ACTION, "Lcom/adyen/checkout/components/core/action/Action;", SessionDetailsResponse.SESSION_RESULT, SessionDetailsResponse.ORDER, "Lcom/adyen/checkout/components/core/OrderResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/action/Action;Ljava/lang/String;Lcom/adyen/checkout/components/core/OrderResponse;)V", "getAction", "()Lcom/adyen/checkout/components/core/action/Action;", "getOrder", "()Lcom/adyen/checkout/components/core/OrderResponse;", "getResultCode", "()Ljava/lang/String;", "getSessionData", "getSessionResult", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionDetailsResponse extends ModelObject {

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
    public static final Parcelable.Creator<SessionDetailsResponse> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SessionDetailsResponse> SERIALIZER = new ModelObject.Serializer<SessionDetailsResponse>() { // from class: com.adyen.checkout.sessions.core.internal.data.model.SessionDetailsResponse$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SessionDetailsResponse deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "sessionData");
            if (stringOrNull == null) {
                stringOrNull = "";
            }
            return new SessionDetailsResponse(stringOrNull, JsonUtilsKt.getStringOrNull(jsonObject, "status"), JsonUtilsKt.getStringOrNull(jsonObject, StatusResponse.RESULT_CODE), (Action) ModelUtils.deserializeOpt(jsonObject.optJSONObject("action"), Action.SERIALIZER), JsonUtilsKt.getStringOrNull(jsonObject, "sessionResult"), (OrderResponse) ModelUtils.deserializeOpt(jsonObject.optJSONObject("order"), OrderResponse.SERIALIZER));
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SessionDetailsResponse modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("sessionData", modelObject.getSessionData());
                jSONObject.putOpt("status", modelObject.getStatus());
                jSONObject.putOpt(StatusResponse.RESULT_CODE, modelObject.getResultCode());
                jSONObject.putOpt("action", ModelUtils.serializeOpt(modelObject.getAction(), Action.SERIALIZER));
                jSONObject.putOpt("sessionResult", modelObject.getSessionResult());
                jSONObject.putOpt("order", ModelUtils.serializeOpt(modelObject.getOrder(), OrderResponse.SERIALIZER));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SessionDetailsResponse.class, e5);
                return null;
            }
        }
    };

    public SessionDetailsResponse(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Action action, @Nullable String str4, @Nullable OrderResponse orderResponse) {
        str.getClass();
        this.sessionData = str;
        this.status = str2;
        this.resultCode = str3;
        this.action = action;
        this.sessionResult = str4;
        this.order = orderResponse;
    }

    public static /* synthetic */ SessionDetailsResponse copy$default(SessionDetailsResponse sessionDetailsResponse, String str, String str2, String str3, Action action, String str4, OrderResponse orderResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionDetailsResponse.sessionData;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionDetailsResponse.status;
        }
        if ((i11 & 4) != 0) {
            str3 = sessionDetailsResponse.resultCode;
        }
        if ((i11 & 8) != 0) {
            action = sessionDetailsResponse.action;
        }
        if ((i11 & 16) != 0) {
            str4 = sessionDetailsResponse.sessionResult;
        }
        if ((i11 & 32) != 0) {
            orderResponse = sessionDetailsResponse.order;
        }
        String str5 = str4;
        OrderResponse orderResponse2 = orderResponse;
        return sessionDetailsResponse.copy(str, str2, str3, action, str5, orderResponse2);
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
    public final String getSessionResult() {
        return this.sessionResult;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OrderResponse getOrder() {
        return this.order;
    }

    @NotNull
    public final SessionDetailsResponse copy(@NotNull String sessionData, @Nullable String status, @Nullable String resultCode, @Nullable Action action, @Nullable String sessionResult, @Nullable OrderResponse order) {
        sessionData.getClass();
        return new SessionDetailsResponse(sessionData, status, resultCode, action, sessionResult, order);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDetailsResponse)) {
            return false;
        }
        SessionDetailsResponse sessionDetailsResponse = (SessionDetailsResponse) other;
        return Intrinsics.areEqual(this.sessionData, sessionDetailsResponse.sessionData) && Intrinsics.areEqual(this.status, sessionDetailsResponse.status) && Intrinsics.areEqual(this.resultCode, sessionDetailsResponse.resultCode) && Intrinsics.areEqual(this.action, sessionDetailsResponse.action) && Intrinsics.areEqual(this.sessionResult, sessionDetailsResponse.sessionResult) && Intrinsics.areEqual(this.order, sessionDetailsResponse.order);
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
        String str3 = this.sessionResult;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OrderResponse orderResponse = this.order;
        return iHashCode5 + (orderResponse != null ? orderResponse.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.sessionData;
        String str2 = this.status;
        String str3 = this.resultCode;
        Action action = this.action;
        String str4 = this.sessionResult;
        OrderResponse orderResponse = this.order;
        StringBuilder sbT = f.t("SessionDetailsResponse(sessionData=", str, ", status=", str2, ", resultCode=");
        sbT.append(str3);
        sbT.append(", action=");
        sbT.append(action);
        sbT.append(", sessionResult=");
        sbT.append(str4);
        sbT.append(", order=");
        sbT.append(orderResponse);
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
        parcel.writeString(this.sessionResult);
        parcel.writeParcelable(this.order, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionDetailsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionDetailsResponse createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SessionDetailsResponse(parcel.readString(), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(SessionDetailsResponse.class.getClassLoader()), parcel.readString(), (OrderResponse) parcel.readParcelable(SessionDetailsResponse.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionDetailsResponse[] newArray(int i11) {
            return new SessionDetailsResponse[i11];
        }
    }
}
