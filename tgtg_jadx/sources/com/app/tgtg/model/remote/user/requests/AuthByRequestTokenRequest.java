package com.app.tgtg.model.remote.user.requests;

import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.UserId$$serializer;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b/\u0010+\u001a\u0004\b.\u0010\u0019R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010\u0019¨\u00064"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/AuthByRequestTokenRequest;", "", "", "deviceType", "requestToken", "Lcom/app/tgtg/model/remote/UserId;", "userId", "requestPollingId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/AuthByRequestTokenRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3-8nKqa5U", "component3", "component4", "copy-oCKwLlc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/requests/AuthByRequestTokenRequest;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceType", "getDeviceType$annotations", "()V", "getRequestToken", "getRequestToken$annotations", "getUserId-8nKqa5U", "getUserId-8nKqa5U$annotations", "getRequestPollingId", "getRequestPollingId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AuthByRequestTokenRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String deviceType;

    @NotNull
    private final String requestPollingId;

    @NotNull
    private final String requestToken;

    @NotNull
    private final String userId;

    private /* synthetic */ AuthByRequestTokenRequest(int i11, String str, String str2, String str3, String str4, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, AuthByRequestTokenRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.deviceType = str;
        this.requestToken = str2;
        this.userId = str3;
        this.requestPollingId = str4;
    }

    /* JADX INFO: renamed from: copy-oCKwLlc$default, reason: not valid java name */
    public static /* synthetic */ AuthByRequestTokenRequest m504copyoCKwLlc$default(AuthByRequestTokenRequest authByRequestTokenRequest, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authByRequestTokenRequest.deviceType;
        }
        if ((i11 & 2) != 0) {
            str2 = authByRequestTokenRequest.requestToken;
        }
        if ((i11 & 4) != 0) {
            str3 = authByRequestTokenRequest.userId;
        }
        if ((i11 & 8) != 0) {
            str4 = authByRequestTokenRequest.requestPollingId;
        }
        return authByRequestTokenRequest.m507copyoCKwLlc(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$app(AuthByRequestTokenRequest self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.deviceType);
        output.q(serialDesc, 1, self.requestToken);
        output.i(serialDesc, 2, UserId$$serializer.INSTANCE, UserId.m286boximpl(self.userId));
        output.q(serialDesc, 3, self.requestPollingId);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRequestToken() {
        return this.requestToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component3-8nKqa5U, reason: not valid java name and from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRequestPollingId() {
        return this.requestPollingId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-oCKwLlc, reason: not valid java name */
    public final AuthByRequestTokenRequest m507copyoCKwLlc(@NotNull String deviceType, @NotNull String requestToken, @NotNull String userId, @NotNull String requestPollingId) {
        deviceType.getClass();
        requestToken.getClass();
        userId.getClass();
        requestPollingId.getClass();
        return new AuthByRequestTokenRequest(deviceType, requestToken, userId, requestPollingId, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthByRequestTokenRequest)) {
            return false;
        }
        AuthByRequestTokenRequest authByRequestTokenRequest = (AuthByRequestTokenRequest) other;
        return Intrinsics.areEqual(this.deviceType, authByRequestTokenRequest.deviceType) && Intrinsics.areEqual(this.requestToken, authByRequestTokenRequest.requestToken) && UserId.m290equalsimpl0(this.userId, authByRequestTokenRequest.userId) && Intrinsics.areEqual(this.requestPollingId, authByRequestTokenRequest.requestPollingId);
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getRequestPollingId() {
        return this.requestPollingId;
    }

    @NotNull
    public final String getRequestToken() {
        return this.requestToken;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserId-8nKqa5U, reason: not valid java name */
    public final String m508getUserId8nKqa5U() {
        return this.userId;
    }

    public int hashCode() {
        return this.requestPollingId.hashCode() + ((UserId.m291hashCodeimpl(this.userId) + l1.b(this.deviceType.hashCode() * 31, 31, this.requestToken)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.deviceType;
        String str2 = this.requestToken;
        return f.o(f.t("AuthByRequestTokenRequest(deviceType=", str, ", requestToken=", str2, ", userId="), UserId.m292toStringimpl(this.userId), ", requestPollingId=", this.requestPollingId, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/AuthByRequestTokenRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/AuthByRequestTokenRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AuthByRequestTokenRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("device_type")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @g("request_polling_id")
    public static /* synthetic */ void getRequestPollingId$annotations() {
    }

    @g("request_token")
    public static /* synthetic */ void getRequestToken$annotations() {
    }

    @g("user_id")
    /* JADX INFO: renamed from: getUserId-8nKqa5U$annotations, reason: not valid java name */
    public static /* synthetic */ void m505getUserId8nKqa5U$annotations() {
    }

    public /* synthetic */ AuthByRequestTokenRequest(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }

    public /* synthetic */ AuthByRequestTokenRequest(int i11, String str, String str2, String str3, String str4, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, m1Var);
    }

    private AuthByRequestTokenRequest(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.deviceType = str;
        this.requestToken = str2;
        this.userId = str3;
        this.requestPollingId = str4;
    }
}
