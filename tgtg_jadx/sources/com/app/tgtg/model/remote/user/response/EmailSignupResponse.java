package com.app.tgtg.model.remote.user.response;

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
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010'\u0012\u0004\b+\u0010,\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010*R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010-\u0012\u0004\b1\u0010,\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u00100R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00102\u0012\u0004\b6\u0010,\u001a\u0004\b3\u0010\u001d\"\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/EmailSignupResponse;", "", "Lcom/app/tgtg/model/remote/user/response/SignupState;", "state", "", "pollingId", "Lcom/app/tgtg/model/remote/user/response/LoginResponse;", "loginResponse", "<init>", "(Lcom/app/tgtg/model/remote/user/response/SignupState;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/LoginResponse;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/user/response/SignupState;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/LoginResponse;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/EmailSignupResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/user/response/SignupState;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/app/tgtg/model/remote/user/response/LoginResponse;", "copy", "(Lcom/app/tgtg/model/remote/user/response/SignupState;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/LoginResponse;)Lcom/app/tgtg/model/remote/user/response/EmailSignupResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/user/response/SignupState;", "getState", "setState", "(Lcom/app/tgtg/model/remote/user/response/SignupState;)V", "getState$annotations", "()V", "Ljava/lang/String;", "getPollingId", "setPollingId", "(Ljava/lang/String;)V", "getPollingId$annotations", "Lcom/app/tgtg/model/remote/user/response/LoginResponse;", "getLoginResponse", "setLoginResponse", "(Lcom/app/tgtg/model/remote/user/response/LoginResponse;)V", "getLoginResponse$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class EmailSignupResponse {

    @Nullable
    private LoginResponse loginResponse;

    @Nullable
    private String pollingId;

    @NotNull
    private SignupState state;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ EmailSignupResponse(int i11, SignupState signupState, String str, LoginResponse loginResponse, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, EmailSignupResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.state = signupState;
        if ((i11 & 2) == 0) {
            this.pollingId = null;
        } else {
            this.pollingId = str;
        }
        if ((i11 & 4) == 0) {
            this.loginResponse = null;
        } else {
            this.loginResponse = loginResponse;
        }
    }

    public static /* synthetic */ EmailSignupResponse copy$default(EmailSignupResponse emailSignupResponse, SignupState signupState, String str, LoginResponse loginResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            signupState = emailSignupResponse.state;
        }
        if ((i11 & 2) != 0) {
            str = emailSignupResponse.pollingId;
        }
        if ((i11 & 4) != 0) {
            loginResponse = emailSignupResponse.loginResponse;
        }
        return emailSignupResponse.copy(signupState, str, loginResponse);
    }

    public static final /* synthetic */ void write$Self$app(EmailSignupResponse self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, SignupStateSerializer.INSTANCE, self.state);
        if (output.C(serialDesc) || self.pollingId != null) {
            output.r(serialDesc, 1, r1.f29848a, self.pollingId);
        }
        if (!output.C(serialDesc) && self.loginResponse == null) {
            return;
        }
        output.r(serialDesc, 2, LoginResponse$$serializer.INSTANCE, self.loginResponse);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SignupState getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPollingId() {
        return this.pollingId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LoginResponse getLoginResponse() {
        return this.loginResponse;
    }

    @NotNull
    public final EmailSignupResponse copy(@NotNull SignupState state, @Nullable String pollingId, @Nullable LoginResponse loginResponse) {
        state.getClass();
        return new EmailSignupResponse(state, pollingId, loginResponse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailSignupResponse)) {
            return false;
        }
        EmailSignupResponse emailSignupResponse = (EmailSignupResponse) other;
        return this.state == emailSignupResponse.state && Intrinsics.areEqual(this.pollingId, emailSignupResponse.pollingId) && Intrinsics.areEqual(this.loginResponse, emailSignupResponse.loginResponse);
    }

    @Nullable
    public final LoginResponse getLoginResponse() {
        return this.loginResponse;
    }

    @Nullable
    public final String getPollingId() {
        return this.pollingId;
    }

    @NotNull
    public final SignupState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        String str = this.pollingId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LoginResponse loginResponse = this.loginResponse;
        return iHashCode2 + (loginResponse != null ? loginResponse.hashCode() : 0);
    }

    public final void setLoginResponse(@Nullable LoginResponse loginResponse) {
        this.loginResponse = loginResponse;
    }

    public final void setPollingId(@Nullable String str) {
        this.pollingId = str;
    }

    public final void setState(@NotNull SignupState signupState) {
        signupState.getClass();
        this.state = signupState;
    }

    @NotNull
    public String toString() {
        return "EmailSignupResponse(state=" + this.state + ", pollingId=" + this.pollingId + ", loginResponse=" + this.loginResponse + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/EmailSignupResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/EmailSignupResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EmailSignupResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("login_response")
    public static /* synthetic */ void getLoginResponse$annotations() {
    }

    @g("polling_id")
    public static /* synthetic */ void getPollingId$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    public EmailSignupResponse(@NotNull SignupState signupState, @Nullable String str, @Nullable LoginResponse loginResponse) {
        signupState.getClass();
        this.state = signupState;
        this.pollingId = str;
        this.loginResponse = loginResponse;
    }

    public /* synthetic */ EmailSignupResponse(SignupState signupState, String str, LoginResponse loginResponse, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(signupState, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : loginResponse);
    }
}
