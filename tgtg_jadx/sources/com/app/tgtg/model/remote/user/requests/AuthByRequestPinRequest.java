package com.app.tgtg.model.remote.user.requests;

import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b,\u0010(\u001a\u0004\b+\u0010\u0018R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u0018¨\u00061"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/AuthByRequestPinRequest;", "", "", "deviceType", "email", "requestPin", "requestPollingId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/AuthByRequestPinRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/requests/AuthByRequestPinRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceType", "getDeviceType$annotations", "()V", "getEmail", "getEmail$annotations", "getRequestPin", "getRequestPin$annotations", "getRequestPollingId", "getRequestPollingId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AuthByRequestPinRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String deviceType;

    @NotNull
    private final String email;

    @NotNull
    private final String requestPin;

    @NotNull
    private final String requestPollingId;

    public /* synthetic */ AuthByRequestPinRequest(int i11, String str, String str2, String str3, String str4, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, AuthByRequestPinRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.deviceType = str;
        this.email = str2;
        this.requestPin = str3;
        this.requestPollingId = str4;
    }

    public static /* synthetic */ AuthByRequestPinRequest copy$default(AuthByRequestPinRequest authByRequestPinRequest, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authByRequestPinRequest.deviceType;
        }
        if ((i11 & 2) != 0) {
            str2 = authByRequestPinRequest.email;
        }
        if ((i11 & 4) != 0) {
            str3 = authByRequestPinRequest.requestPin;
        }
        if ((i11 & 8) != 0) {
            str4 = authByRequestPinRequest.requestPollingId;
        }
        return authByRequestPinRequest.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$app(AuthByRequestPinRequest self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.deviceType);
        output.q(serialDesc, 1, self.email);
        output.q(serialDesc, 2, self.requestPin);
        output.q(serialDesc, 3, self.requestPollingId);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRequestPin() {
        return this.requestPin;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRequestPollingId() {
        return this.requestPollingId;
    }

    @NotNull
    public final AuthByRequestPinRequest copy(@NotNull String deviceType, @NotNull String email, @NotNull String requestPin, @NotNull String requestPollingId) {
        deviceType.getClass();
        email.getClass();
        requestPin.getClass();
        requestPollingId.getClass();
        return new AuthByRequestPinRequest(deviceType, email, requestPin, requestPollingId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthByRequestPinRequest)) {
            return false;
        }
        AuthByRequestPinRequest authByRequestPinRequest = (AuthByRequestPinRequest) other;
        return Intrinsics.areEqual(this.deviceType, authByRequestPinRequest.deviceType) && Intrinsics.areEqual(this.email, authByRequestPinRequest.email) && Intrinsics.areEqual(this.requestPin, authByRequestPinRequest.requestPin) && Intrinsics.areEqual(this.requestPollingId, authByRequestPinRequest.requestPollingId);
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final String getRequestPin() {
        return this.requestPin;
    }

    @NotNull
    public final String getRequestPollingId() {
        return this.requestPollingId;
    }

    public int hashCode() {
        return this.requestPollingId.hashCode() + l1.b(l1.b(this.deviceType.hashCode() * 31, 31, this.email), 31, this.requestPin);
    }

    @NotNull
    public String toString() {
        String str = this.deviceType;
        String str2 = this.email;
        return f.o(f.t("AuthByRequestPinRequest(deviceType=", str, ", email=", str2, ", requestPin="), this.requestPin, ", requestPollingId=", this.requestPollingId, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/AuthByRequestPinRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/AuthByRequestPinRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AuthByRequestPinRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("device_type")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @g("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @g("request_pin")
    public static /* synthetic */ void getRequestPin$annotations() {
    }

    @g("request_polling_id")
    public static /* synthetic */ void getRequestPollingId$annotations() {
    }

    public AuthByRequestPinRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.deviceType = str;
        this.email = str2;
        this.requestPin = str3;
        this.requestPollingId = str4;
    }
}
