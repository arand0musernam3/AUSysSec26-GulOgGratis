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
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J2\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010&R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010#\u0012\u0004\b+\u0010(\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010&R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010#\u0012\u0004\b.\u0010(\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010&¨\u00061"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/LoginByEmailRequest;", "", "", "deviceType", "email", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/LoginByEmailRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/requests/LoginByEmailRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceType", "setDeviceType", "(Ljava/lang/String;)V", "getDeviceType$annotations", "()V", "getEmail", "setEmail", "getEmail$annotations", "getPassword", "setPassword", "getPassword$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class LoginByEmailRequest {

    @NotNull
    private String deviceType;

    @Nullable
    private String email;

    @Nullable
    private String password;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LoginByEmailRequest(int i11, String str, String str2, String str3, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, LoginByEmailRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.deviceType = str;
        if ((i11 & 2) == 0) {
            this.email = null;
        } else {
            this.email = str2;
        }
        if ((i11 & 4) == 0) {
            this.password = null;
        } else {
            this.password = str3;
        }
    }

    public static /* synthetic */ LoginByEmailRequest copy$default(LoginByEmailRequest loginByEmailRequest, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = loginByEmailRequest.deviceType;
        }
        if ((i11 & 2) != 0) {
            str2 = loginByEmailRequest.email;
        }
        if ((i11 & 4) != 0) {
            str3 = loginByEmailRequest.password;
        }
        return loginByEmailRequest.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(LoginByEmailRequest self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.deviceType);
        if (output.C(serialDesc) || self.email != null) {
            output.r(serialDesc, 1, r1.f29848a, self.email);
        }
        if (!output.C(serialDesc) && self.password == null) {
            return;
        }
        output.r(serialDesc, 2, r1.f29848a, self.password);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final LoginByEmailRequest copy(@NotNull String deviceType, @Nullable String email, @Nullable String password) {
        deviceType.getClass();
        return new LoginByEmailRequest(deviceType, email, password);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginByEmailRequest)) {
            return false;
        }
        LoginByEmailRequest loginByEmailRequest = (LoginByEmailRequest) other;
        return Intrinsics.areEqual(this.deviceType, loginByEmailRequest.deviceType) && Intrinsics.areEqual(this.email, loginByEmailRequest.email) && Intrinsics.areEqual(this.password, loginByEmailRequest.password);
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        int iHashCode = this.deviceType.hashCode() * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.password;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDeviceType(@NotNull String str) {
        str.getClass();
        this.deviceType = str;
    }

    public final void setEmail(@Nullable String str) {
        this.email = str;
    }

    public final void setPassword(@Nullable String str) {
        this.password = str;
    }

    @NotNull
    public String toString() {
        String str = this.deviceType;
        String str2 = this.email;
        return k.p(f.t("LoginByEmailRequest(deviceType=", str, ", email=", str2, ", password="), this.password, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/LoginByEmailRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/LoginByEmailRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LoginByEmailRequest$$serializer.INSTANCE;
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

    @g("password")
    public static /* synthetic */ void getPassword$annotations() {
    }

    public LoginByEmailRequest(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        str.getClass();
        this.deviceType = str;
        this.email = str2;
        this.password = str3;
    }

    public /* synthetic */ LoginByEmailRequest(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
