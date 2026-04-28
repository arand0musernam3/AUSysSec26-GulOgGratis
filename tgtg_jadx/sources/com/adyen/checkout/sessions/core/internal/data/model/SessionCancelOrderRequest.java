package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import c50.w;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.core.internal.data.model.JsonUtilsKt;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.adyen.checkout.core.internal.data.model.ModelUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionCancelOrderRequest;", "Lcom/adyen/checkout/core/internal/data/model/ModelObject;", SessionCancelOrderRequest.SESSION_DATA, "", SessionCancelOrderRequest.ORDER, "Lcom/adyen/checkout/components/core/OrderRequest;", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/OrderRequest;)V", "getOrder", "()Lcom/adyen/checkout/components/core/OrderRequest;", "getSessionData", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionCancelOrderRequest extends ModelObject {

    @NotNull
    private static final String ORDER = "order";

    @NotNull
    private static final String SESSION_DATA = "sessionData";

    @Nullable
    private final OrderRequest order;

    @NotNull
    private final String sessionData;

    @NotNull
    public static final Parcelable.Creator<SessionCancelOrderRequest> CREATOR = new Creator();

    @NotNull
    public static final ModelObject.Serializer<SessionCancelOrderRequest> SERIALIZER = new ModelObject.Serializer<SessionCancelOrderRequest>() { // from class: com.adyen.checkout.sessions.core.internal.data.model.SessionCancelOrderRequest$Companion$SERIALIZER$1
        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public SessionCancelOrderRequest deserialize(@NotNull JSONObject jsonObject) {
            jsonObject.getClass();
            try {
                String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, "sessionData");
                if (stringOrNull == null) {
                    stringOrNull = "";
                }
                return new SessionCancelOrderRequest(stringOrNull, (OrderRequest) ModelUtils.deserializeOpt(jsonObject.optJSONObject("order"), OrderRequest.SERIALIZER));
            } catch (JSONException e5) {
                w.j(SessionCancelOrderRequest.class, e5);
                return null;
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.ModelObject.Serializer
        @NotNull
        public JSONObject serialize(@NotNull SessionCancelOrderRequest modelObject) {
            modelObject.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("sessionData", modelObject.getSessionData());
                jSONObject.putOpt("order", ModelUtils.serializeOpt(modelObject.getOrder(), OrderRequest.SERIALIZER));
                return jSONObject;
            } catch (JSONException e5) {
                w.j(SessionCancelOrderRequest.class, e5);
                return null;
            }
        }
    };

    public SessionCancelOrderRequest(@NotNull String str, @Nullable OrderRequest orderRequest) {
        str.getClass();
        this.sessionData = str;
        this.order = orderRequest;
    }

    public static /* synthetic */ SessionCancelOrderRequest copy$default(SessionCancelOrderRequest sessionCancelOrderRequest, String str, OrderRequest orderRequest, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionCancelOrderRequest.sessionData;
        }
        if ((i11 & 2) != 0) {
            orderRequest = sessionCancelOrderRequest.order;
        }
        return sessionCancelOrderRequest.copy(str, orderRequest);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrderRequest getOrder() {
        return this.order;
    }

    @NotNull
    public final SessionCancelOrderRequest copy(@NotNull String sessionData, @Nullable OrderRequest order) {
        sessionData.getClass();
        return new SessionCancelOrderRequest(sessionData, order);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionCancelOrderRequest)) {
            return false;
        }
        SessionCancelOrderRequest sessionCancelOrderRequest = (SessionCancelOrderRequest) other;
        return Intrinsics.areEqual(this.sessionData, sessionCancelOrderRequest.sessionData) && Intrinsics.areEqual(this.order, sessionCancelOrderRequest.order);
    }

    @Nullable
    public final OrderRequest getOrder() {
        return this.order;
    }

    @NotNull
    public final String getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        int iHashCode = this.sessionData.hashCode() * 31;
        OrderRequest orderRequest = this.order;
        return iHashCode + (orderRequest == null ? 0 : orderRequest.hashCode());
    }

    @NotNull
    public String toString() {
        return "SessionCancelOrderRequest(sessionData=" + this.sessionData + ", order=" + this.order + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.sessionData);
        parcel.writeParcelable(this.order, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionCancelOrderRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionCancelOrderRequest createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SessionCancelOrderRequest(parcel.readString(), (OrderRequest) parcel.readParcelable(SessionCancelOrderRequest.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionCancelOrderRequest[] newArray(int i11) {
            return new SessionCancelOrderRequest[i11];
        }
    }
}
