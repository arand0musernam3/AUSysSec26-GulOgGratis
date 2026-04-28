package com.app.tgtg.model.remote.user.requests;

import b3.i;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
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
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fB[\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018JZ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J'\u0010+\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010,\u0012\u0004\b0\u00101\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010/R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010,\u0012\u0004\b4\u00101\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u0010/R(\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010,\u0012\u0004\b7\u00101\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u0010/R*\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010,\u0012\u0004\b:\u00101\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010/R(\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010;\u0012\u0004\b?\u00101\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u0010>R(\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010;\u0012\u0004\bB\u00101\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010>R \u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\bD\u00101\u001a\u0004\bC\u0010\u0018¨\u0006G"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/SignUpByThirdPartyRequest;", "", "", "accessToken", "deviceType", "provider", "countryId", "", "newsletterOptIn", "pushNotificationOptIn", "hasBrazeSdk", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/app/tgtg/model/remote/user/requests/SignUpByThirdPartyRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/SignUpByThirdPartyRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getAccessToken", "setAccessToken", "(Ljava/lang/String;)V", "getAccessToken$annotations", "()V", "getDeviceType", "setDeviceType", "getDeviceType$annotations", "getProvider", "setProvider", "getProvider$annotations", "getCountryId", "setCountryId", "getCountryId$annotations", "Z", "getNewsletterOptIn", "setNewsletterOptIn", "(Z)V", "getNewsletterOptIn$annotations", "getPushNotificationOptIn", "setPushNotificationOptIn", "getPushNotificationOptIn$annotations", "getHasBrazeSdk", "getHasBrazeSdk$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SignUpByThirdPartyRequest {

    @Nullable
    private String accessToken;

    @Nullable
    private String countryId;

    @NotNull
    private String deviceType;
    private final boolean hasBrazeSdk;
    private boolean newsletterOptIn;

    @NotNull
    private String provider;
    private boolean pushNotificationOptIn;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ SignUpByThirdPartyRequest(int i11, String str, String str2, String str3, String str4, boolean z11, boolean z12, boolean z13, m1 m1Var) {
        if (6 != (i11 & 6)) {
            c1.j(i11, 6, SignUpByThirdPartyRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.accessToken = null;
        } else {
            this.accessToken = str;
        }
        this.deviceType = str2;
        this.provider = str3;
        if ((i11 & 8) == 0) {
            this.countryId = null;
        } else {
            this.countryId = str4;
        }
        if ((i11 & 16) == 0) {
            this.newsletterOptIn = false;
        } else {
            this.newsletterOptIn = z11;
        }
        if ((i11 & 32) == 0) {
            this.pushNotificationOptIn = true;
        } else {
            this.pushNotificationOptIn = z12;
        }
        if ((i11 & 64) == 0) {
            this.hasBrazeSdk = true;
        } else {
            this.hasBrazeSdk = z13;
        }
    }

    public static /* synthetic */ SignUpByThirdPartyRequest copy$default(SignUpByThirdPartyRequest signUpByThirdPartyRequest, String str, String str2, String str3, String str4, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = signUpByThirdPartyRequest.accessToken;
        }
        if ((i11 & 2) != 0) {
            str2 = signUpByThirdPartyRequest.deviceType;
        }
        if ((i11 & 4) != 0) {
            str3 = signUpByThirdPartyRequest.provider;
        }
        if ((i11 & 8) != 0) {
            str4 = signUpByThirdPartyRequest.countryId;
        }
        if ((i11 & 16) != 0) {
            z11 = signUpByThirdPartyRequest.newsletterOptIn;
        }
        if ((i11 & 32) != 0) {
            z12 = signUpByThirdPartyRequest.pushNotificationOptIn;
        }
        if ((i11 & 64) != 0) {
            z13 = signUpByThirdPartyRequest.hasBrazeSdk;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        boolean z16 = z11;
        String str5 = str3;
        return signUpByThirdPartyRequest.copy(str, str2, str5, str4, z16, z14, z15);
    }

    public static final /* synthetic */ void write$Self$app(SignUpByThirdPartyRequest self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.accessToken != null) {
            output.r(serialDesc, 0, r1.f29848a, self.accessToken);
        }
        output.q(serialDesc, 1, self.deviceType);
        output.q(serialDesc, 2, self.provider);
        if (output.C(serialDesc) || self.countryId != null) {
            output.r(serialDesc, 3, r1.f29848a, self.countryId);
        }
        output.p(serialDesc, 4, self.newsletterOptIn);
        output.p(serialDesc, 5, self.pushNotificationOptIn);
        output.p(serialDesc, 6, self.hasBrazeSdk);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getNewsletterOptIn() {
        return this.newsletterOptIn;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getPushNotificationOptIn() {
        return this.pushNotificationOptIn;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHasBrazeSdk() {
        return this.hasBrazeSdk;
    }

    @NotNull
    public final SignUpByThirdPartyRequest copy(@Nullable String accessToken, @NotNull String deviceType, @NotNull String provider, @Nullable String countryId, boolean newsletterOptIn, boolean pushNotificationOptIn, boolean hasBrazeSdk) {
        deviceType.getClass();
        provider.getClass();
        return new SignUpByThirdPartyRequest(accessToken, deviceType, provider, countryId, newsletterOptIn, pushNotificationOptIn, hasBrazeSdk);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignUpByThirdPartyRequest)) {
            return false;
        }
        SignUpByThirdPartyRequest signUpByThirdPartyRequest = (SignUpByThirdPartyRequest) other;
        return Intrinsics.areEqual(this.accessToken, signUpByThirdPartyRequest.accessToken) && Intrinsics.areEqual(this.deviceType, signUpByThirdPartyRequest.deviceType) && Intrinsics.areEqual(this.provider, signUpByThirdPartyRequest.provider) && Intrinsics.areEqual(this.countryId, signUpByThirdPartyRequest.countryId) && this.newsletterOptIn == signUpByThirdPartyRequest.newsletterOptIn && this.pushNotificationOptIn == signUpByThirdPartyRequest.pushNotificationOptIn && this.hasBrazeSdk == signUpByThirdPartyRequest.hasBrazeSdk;
    }

    @Nullable
    public final String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    public final boolean getHasBrazeSdk() {
        return this.hasBrazeSdk;
    }

    public final boolean getNewsletterOptIn() {
        return this.newsletterOptIn;
    }

    @NotNull
    public final String getProvider() {
        return this.provider;
    }

    public final boolean getPushNotificationOptIn() {
        return this.pushNotificationOptIn;
    }

    public int hashCode() {
        String str = this.accessToken;
        int iB = l1.b(l1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.deviceType), 31, this.provider);
        String str2 = this.countryId;
        return Boolean.hashCode(this.hasBrazeSdk) + k.e(k.e((iB + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.newsletterOptIn), 31, this.pushNotificationOptIn);
    }

    public final void setAccessToken(@Nullable String str) {
        this.accessToken = str;
    }

    public final void setCountryId(@Nullable String str) {
        this.countryId = str;
    }

    public final void setDeviceType(@NotNull String str) {
        str.getClass();
        this.deviceType = str;
    }

    public final void setNewsletterOptIn(boolean z11) {
        this.newsletterOptIn = z11;
    }

    public final void setProvider(@NotNull String str) {
        str.getClass();
        this.provider = str;
    }

    public final void setPushNotificationOptIn(boolean z11) {
        this.pushNotificationOptIn = z11;
    }

    @NotNull
    public String toString() {
        String str = this.accessToken;
        String str2 = this.deviceType;
        String str3 = this.provider;
        String str4 = this.countryId;
        boolean z11 = this.newsletterOptIn;
        boolean z12 = this.pushNotificationOptIn;
        boolean z13 = this.hasBrazeSdk;
        StringBuilder sbT = f.t("SignUpByThirdPartyRequest(accessToken=", str, ", deviceType=", str2, ", provider=");
        s.A(sbT, str3, ", countryId=", str4, ", newsletterOptIn=");
        i.C(sbT, z11, ", pushNotificationOptIn=", z12, ", hasBrazeSdk=");
        return s.o(sbT, z13, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/SignUpByThirdPartyRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/SignUpByThirdPartyRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SignUpByThirdPartyRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("access_token")
    public static /* synthetic */ void getAccessToken$annotations() {
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("device_type")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @g("has_braze_sdk")
    public static /* synthetic */ void getHasBrazeSdk$annotations() {
    }

    @g("newsletter_opt_in")
    public static /* synthetic */ void getNewsletterOptIn$annotations() {
    }

    @g("provider")
    public static /* synthetic */ void getProvider$annotations() {
    }

    @g("push_notification_opt_in")
    public static /* synthetic */ void getPushNotificationOptIn$annotations() {
    }

    public SignUpByThirdPartyRequest(@Nullable String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, boolean z11, boolean z12, boolean z13) {
        str2.getClass();
        str3.getClass();
        this.accessToken = str;
        this.deviceType = str2;
        this.provider = str3;
        this.countryId = str4;
        this.newsletterOptIn = z11;
        this.pushNotificationOptIn = z12;
        this.hasBrazeSdk = z13;
    }

    public /* synthetic */ SignUpByThirdPartyRequest(String str, String str2, String str3, String str4, boolean z11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? true : z12, (i11 & 64) != 0 ? true : z13);
    }
}
