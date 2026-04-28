package com.app.tgtg.model.remote.token;

import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ>\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010%\u0012\u0004\b)\u0010*\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010(R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010%\u0012\u0004\b-\u0010*\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010(R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010%\u0012\u0004\b0\u0010*\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010(R(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00101\u0012\u0004\b5\u0010*\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/app/tgtg/model/remote/token/TokenResult;", "", "", "accessToken", "refreshToken", "msg", "", "statusCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/token/TokenResult;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/app/tgtg/model/remote/token/TokenResult;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccessToken", "setAccessToken", "(Ljava/lang/String;)V", "getAccessToken$annotations", "()V", "getRefreshToken", "setRefreshToken", "getRefreshToken$annotations", "getMsg", "setMsg", "getMsg$annotations", "I", "getStatusCode", "setStatusCode", "(I)V", "getStatusCode$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TokenResult {

    @Nullable
    private String accessToken;

    @Nullable
    private String msg;

    @Nullable
    private String refreshToken;
    private int statusCode;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ TokenResult(int i11, String str, String str2, String str3, int i12, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.accessToken = null;
        } else {
            this.accessToken = str;
        }
        if ((i11 & 2) == 0) {
            this.refreshToken = null;
        } else {
            this.refreshToken = str2;
        }
        if ((i11 & 4) == 0) {
            this.msg = null;
        } else {
            this.msg = str3;
        }
        if ((i11 & 8) == 0) {
            this.statusCode = 0;
        } else {
            this.statusCode = i12;
        }
    }

    public static /* synthetic */ TokenResult copy$default(TokenResult tokenResult, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = tokenResult.accessToken;
        }
        if ((i12 & 2) != 0) {
            str2 = tokenResult.refreshToken;
        }
        if ((i12 & 4) != 0) {
            str3 = tokenResult.msg;
        }
        if ((i12 & 8) != 0) {
            i11 = tokenResult.statusCode;
        }
        return tokenResult.copy(str, str2, str3, i11);
    }

    public static final /* synthetic */ void write$Self$app(TokenResult self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.accessToken != null) {
            output.r(serialDesc, 0, r1.f29848a, self.accessToken);
        }
        if (output.C(serialDesc) || self.refreshToken != null) {
            output.r(serialDesc, 1, r1.f29848a, self.refreshToken);
        }
        if (output.C(serialDesc) || self.msg != null) {
            output.r(serialDesc, 2, r1.f29848a, self.msg);
        }
        if (!output.C(serialDesc) && self.statusCode == 0) {
            return;
        }
        output.m(3, self.statusCode, serialDesc);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final TokenResult copy(@Nullable String accessToken, @Nullable String refreshToken, @Nullable String msg, int statusCode) {
        return new TokenResult(accessToken, refreshToken, msg, statusCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) other;
        return Intrinsics.areEqual(this.accessToken, tokenResult.accessToken) && Intrinsics.areEqual(this.refreshToken, tokenResult.refreshToken) && Intrinsics.areEqual(this.msg, tokenResult.msg) && this.statusCode == tokenResult.statusCode;
    }

    @Nullable
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        String str = this.accessToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.refreshToken;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.msg;
        return Integer.hashCode(this.statusCode) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final void setAccessToken(@Nullable String str) {
        this.accessToken = str;
    }

    public final void setMsg(@Nullable String str) {
        this.msg = str;
    }

    public final void setRefreshToken(@Nullable String str) {
        this.refreshToken = str;
    }

    public final void setStatusCode(int i11) {
        this.statusCode = i11;
    }

    @NotNull
    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.msg;
        int i11 = this.statusCode;
        StringBuilder sbT = f.t("TokenResult(accessToken=", str, ", refreshToken=", str2, ", msg=");
        sbT.append(str3);
        sbT.append(", statusCode=");
        sbT.append(i11);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/token/TokenResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/token/TokenResult;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TokenResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("access_token")
    public static /* synthetic */ void getAccessToken$annotations() {
    }

    @g("msg")
    public static /* synthetic */ void getMsg$annotations() {
    }

    @g("refresh_token")
    public static /* synthetic */ void getRefreshToken$annotations() {
    }

    @g("status_code")
    public static /* synthetic */ void getStatusCode$annotations() {
    }

    public TokenResult() {
        this((String) null, (String) null, (String) null, 0, 15, (DefaultConstructorMarker) null);
    }

    public TokenResult(@Nullable String str, @Nullable String str2, @Nullable String str3, int i11) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.msg = str3;
        this.statusCode = i11;
    }

    public /* synthetic */ TokenResult(String str, String str2, String str3, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? 0 : i11);
    }
}
