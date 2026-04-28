package com.app.tgtg.model.remote.user.response;

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
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010%\u0012\u0004\b)\u0010*\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010(R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010%\u0012\u0004\b-\u0010*\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010(R(\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010.\u0012\u0004\b2\u0010*\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/LoginResponse;", "", "", "accessToken", "refreshToken", "", "accessTokenTtlSeconds", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/LoginResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/app/tgtg/model/remote/user/response/LoginResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccessToken", "setAccessToken", "(Ljava/lang/String;)V", "getAccessToken$annotations", "()V", "getRefreshToken", "setRefreshToken", "getRefreshToken$annotations", "J", "getAccessTokenTtlSeconds", "setAccessTokenTtlSeconds", "(J)V", "getAccessTokenTtlSeconds$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class LoginResponse {

    @NotNull
    private String accessToken;
    private long accessTokenTtlSeconds;

    @NotNull
    private String refreshToken;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LoginResponse(int i11, String str, String str2, long j9, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, LoginResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.accessToken = str;
        this.refreshToken = str2;
        this.accessTokenTtlSeconds = j9;
    }

    public static /* synthetic */ LoginResponse copy$default(LoginResponse loginResponse, String str, String str2, long j9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = loginResponse.accessToken;
        }
        if ((i11 & 2) != 0) {
            str2 = loginResponse.refreshToken;
        }
        if ((i11 & 4) != 0) {
            j9 = loginResponse.accessTokenTtlSeconds;
        }
        return loginResponse.copy(str, str2, j9);
    }

    public static final /* synthetic */ void write$Self$app(LoginResponse self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.accessToken);
        output.q(serialDesc, 1, self.refreshToken);
        output.B(serialDesc, 2, self.accessTokenTtlSeconds);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAccessTokenTtlSeconds() {
        return this.accessTokenTtlSeconds;
    }

    @NotNull
    public final LoginResponse copy(@NotNull String accessToken, @NotNull String refreshToken, long accessTokenTtlSeconds) {
        accessToken.getClass();
        refreshToken.getClass();
        return new LoginResponse(accessToken, refreshToken, accessTokenTtlSeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginResponse)) {
            return false;
        }
        LoginResponse loginResponse = (LoginResponse) other;
        return Intrinsics.areEqual(this.accessToken, loginResponse.accessToken) && Intrinsics.areEqual(this.refreshToken, loginResponse.refreshToken) && this.accessTokenTtlSeconds == loginResponse.accessTokenTtlSeconds;
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getAccessTokenTtlSeconds() {
        return this.accessTokenTtlSeconds;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        return Long.hashCode(this.accessTokenTtlSeconds) + l1.b(this.accessToken.hashCode() * 31, 31, this.refreshToken);
    }

    public final void setAccessToken(@NotNull String str) {
        str.getClass();
        this.accessToken = str;
    }

    public final void setAccessTokenTtlSeconds(long j9) {
        this.accessTokenTtlSeconds = j9;
    }

    public final void setRefreshToken(@NotNull String str) {
        str.getClass();
        this.refreshToken = str;
    }

    @NotNull
    public String toString() {
        return a0.j(this.accessTokenTtlSeconds, ")", f.t("LoginResponse(accessToken=", this.accessToken, ", refreshToken=", this.refreshToken, ", accessTokenTtlSeconds="));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/LoginResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/LoginResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LoginResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("access_token")
    public static /* synthetic */ void getAccessToken$annotations() {
    }

    @g("access_token_ttl_seconds")
    public static /* synthetic */ void getAccessTokenTtlSeconds$annotations() {
    }

    @g("refresh_token")
    public static /* synthetic */ void getRefreshToken$annotations() {
    }

    public LoginResponse(@NotNull String str, @NotNull String str2, long j9) {
        str.getClass();
        str2.getClass();
        this.accessToken = str;
        this.refreshToken = str2;
        this.accessTokenTtlSeconds = j9;
    }
}
