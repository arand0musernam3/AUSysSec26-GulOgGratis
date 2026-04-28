package com.adyen.checkout.sessions.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.OrderResponse;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import e0.f;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006$"}, d2 = {"Lcom/adyen/checkout/sessions/core/SessionPaymentResult;", "Landroid/os/Parcelable;", "sessionId", "", "sessionResult", "sessionData", StatusResponse.RESULT_CODE, "order", "Lcom/adyen/checkout/components/core/OrderResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/OrderResponse;)V", "getOrder", "()Lcom/adyen/checkout/components/core/OrderResponse;", "getResultCode", "()Ljava/lang/String;", "getSessionData", "getSessionId", "getSessionResult", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionPaymentResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SessionPaymentResult> CREATOR = new Creator();

    @Nullable
    private final OrderResponse order;

    @Nullable
    private final String resultCode;

    @Nullable
    private final String sessionData;

    @Nullable
    private final String sessionId;

    @Nullable
    private final String sessionResult;

    public SessionPaymentResult(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable OrderResponse orderResponse) {
        this.sessionId = str;
        this.sessionResult = str2;
        this.sessionData = str3;
        this.resultCode = str4;
        this.order = orderResponse;
    }

    public static /* synthetic */ SessionPaymentResult copy$default(SessionPaymentResult sessionPaymentResult, String str, String str2, String str3, String str4, OrderResponse orderResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionPaymentResult.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionPaymentResult.sessionResult;
        }
        if ((i11 & 4) != 0) {
            str3 = sessionPaymentResult.sessionData;
        }
        if ((i11 & 8) != 0) {
            str4 = sessionPaymentResult.resultCode;
        }
        if ((i11 & 16) != 0) {
            orderResponse = sessionPaymentResult.order;
        }
        OrderResponse orderResponse2 = orderResponse;
        String str5 = str3;
        return sessionPaymentResult.copy(str, str2, str5, str4, orderResponse2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionResult() {
        return this.sessionResult;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getResultCode() {
        return this.resultCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrderResponse getOrder() {
        return this.order;
    }

    @NotNull
    public final SessionPaymentResult copy(@Nullable String sessionId, @Nullable String sessionResult, @Nullable String sessionData, @Nullable String resultCode, @Nullable OrderResponse order) {
        return new SessionPaymentResult(sessionId, sessionResult, sessionData, resultCode, order);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionPaymentResult)) {
            return false;
        }
        SessionPaymentResult sessionPaymentResult = (SessionPaymentResult) other;
        return Intrinsics.areEqual(this.sessionId, sessionPaymentResult.sessionId) && Intrinsics.areEqual(this.sessionResult, sessionPaymentResult.sessionResult) && Intrinsics.areEqual(this.sessionData, sessionPaymentResult.sessionData) && Intrinsics.areEqual(this.resultCode, sessionPaymentResult.resultCode) && Intrinsics.areEqual(this.order, sessionPaymentResult.order);
    }

    @Nullable
    public final OrderResponse getOrder() {
        return this.order;
    }

    @Nullable
    public final String getResultCode() {
        return this.resultCode;
    }

    @Nullable
    public final String getSessionData() {
        return this.sessionData;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final String getSessionResult() {
        return this.sessionResult;
    }

    public int hashCode() {
        String str = this.sessionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sessionResult;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sessionData;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.resultCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        OrderResponse orderResponse = this.order;
        return iHashCode4 + (orderResponse != null ? orderResponse.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.sessionId;
        String str2 = this.sessionResult;
        String str3 = this.sessionData;
        String str4 = this.resultCode;
        OrderResponse orderResponse = this.order;
        StringBuilder sbT = f.t("SessionPaymentResult(sessionId=", str, ", sessionResult=", str2, ", sessionData=");
        s.A(sbT, str3, ", resultCode=", str4, ", order=");
        sbT.append(orderResponse);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.sessionId);
        parcel.writeString(this.sessionResult);
        parcel.writeString(this.sessionData);
        parcel.writeString(this.resultCode);
        parcel.writeParcelable(this.order, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionPaymentResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionPaymentResult createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new SessionPaymentResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (OrderResponse) parcel.readParcelable(SessionPaymentResult.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SessionPaymentResult[] newArray(int i11) {
            return new SessionPaymentResult[i11];
        }
    }
}
