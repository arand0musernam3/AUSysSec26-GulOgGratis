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
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rBc\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018Jb\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0014J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J'\u0010-\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u0014R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010\u0014R(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00106\u0012\u0004\b:\u00101\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u00109R(\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00106\u0012\u0004\b=\u00101\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u00109R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b?\u00101\u001a\u0004\b>\u0010\u0014R \u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\bA\u00101\u001a\u0004\b@\u0010\u0018R \u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\bC\u00101\u001a\u0004\bB\u0010\u0018¨\u0006F"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/SignUpByEmailRequest;", "", "", "email", "name", "deviceType", "", "newsletterOptIn", "pushNotificationOptIn", "countryId", "hasBrazeSdk", "signupAsCharity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZ)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLm90/m1;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZ)Lcom/app/tgtg/model/remote/user/requests/SignUpByEmailRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/SignUpByEmailRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getEmail", "getEmail$annotations", "()V", "getName", "getName$annotations", "getDeviceType", "getDeviceType$annotations", "Z", "getNewsletterOptIn", "setNewsletterOptIn", "(Z)V", "getNewsletterOptIn$annotations", "getPushNotificationOptIn", "setPushNotificationOptIn", "getPushNotificationOptIn$annotations", "getCountryId", "getCountryId$annotations", "getHasBrazeSdk", "getHasBrazeSdk$annotations", "getSignupAsCharity", "getSignupAsCharity$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SignUpByEmailRequest {

    @Nullable
    private final String countryId;

    @NotNull
    private final String deviceType;

    @NotNull
    private final String email;
    private final boolean hasBrazeSdk;

    @NotNull
    private final String name;
    private boolean newsletterOptIn;
    private boolean pushNotificationOptIn;
    private final boolean signupAsCharity;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ SignUpByEmailRequest(int i11, String str, String str2, String str3, boolean z11, boolean z12, String str4, boolean z13, boolean z14, m1 m1Var) {
        if (61 != (i11 & 61)) {
            c1.j(i11, 61, SignUpByEmailRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.email = str;
        if ((i11 & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        this.deviceType = str3;
        this.newsletterOptIn = z11;
        this.pushNotificationOptIn = z12;
        this.countryId = str4;
        if ((i11 & 64) == 0) {
            this.hasBrazeSdk = true;
        } else {
            this.hasBrazeSdk = z13;
        }
        if ((i11 & 128) == 0) {
            this.signupAsCharity = false;
        } else {
            this.signupAsCharity = z14;
        }
    }

    public static /* synthetic */ SignUpByEmailRequest copy$default(SignUpByEmailRequest signUpByEmailRequest, String str, String str2, String str3, boolean z11, boolean z12, String str4, boolean z13, boolean z14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = signUpByEmailRequest.email;
        }
        if ((i11 & 2) != 0) {
            str2 = signUpByEmailRequest.name;
        }
        if ((i11 & 4) != 0) {
            str3 = signUpByEmailRequest.deviceType;
        }
        if ((i11 & 8) != 0) {
            z11 = signUpByEmailRequest.newsletterOptIn;
        }
        if ((i11 & 16) != 0) {
            z12 = signUpByEmailRequest.pushNotificationOptIn;
        }
        if ((i11 & 32) != 0) {
            str4 = signUpByEmailRequest.countryId;
        }
        if ((i11 & 64) != 0) {
            z13 = signUpByEmailRequest.hasBrazeSdk;
        }
        if ((i11 & 128) != 0) {
            z14 = signUpByEmailRequest.signupAsCharity;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        boolean z17 = z12;
        String str5 = str4;
        return signUpByEmailRequest.copy(str, str2, str3, z11, z17, str5, z15, z16);
    }

    public static final /* synthetic */ void write$Self$app(SignUpByEmailRequest self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.email);
        output.q(serialDesc, 1, self.name);
        output.q(serialDesc, 2, self.deviceType);
        output.p(serialDesc, 3, self.newsletterOptIn);
        output.p(serialDesc, 4, self.pushNotificationOptIn);
        output.r(serialDesc, 5, r1.f29848a, self.countryId);
        output.p(serialDesc, 6, self.hasBrazeSdk);
        output.p(serialDesc, 7, self.signupAsCharity);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getNewsletterOptIn() {
        return this.newsletterOptIn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPushNotificationOptIn() {
        return this.pushNotificationOptIn;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountryId() {
        return this.countryId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHasBrazeSdk() {
        return this.hasBrazeSdk;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getSignupAsCharity() {
        return this.signupAsCharity;
    }

    @NotNull
    public final SignUpByEmailRequest copy(@NotNull String email, @NotNull String name, @NotNull String deviceType, boolean newsletterOptIn, boolean pushNotificationOptIn, @Nullable String countryId, boolean hasBrazeSdk, boolean signupAsCharity) {
        email.getClass();
        name.getClass();
        deviceType.getClass();
        return new SignUpByEmailRequest(email, name, deviceType, newsletterOptIn, pushNotificationOptIn, countryId, hasBrazeSdk, signupAsCharity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignUpByEmailRequest)) {
            return false;
        }
        SignUpByEmailRequest signUpByEmailRequest = (SignUpByEmailRequest) other;
        return Intrinsics.areEqual(this.email, signUpByEmailRequest.email) && Intrinsics.areEqual(this.name, signUpByEmailRequest.name) && Intrinsics.areEqual(this.deviceType, signUpByEmailRequest.deviceType) && this.newsletterOptIn == signUpByEmailRequest.newsletterOptIn && this.pushNotificationOptIn == signUpByEmailRequest.pushNotificationOptIn && Intrinsics.areEqual(this.countryId, signUpByEmailRequest.countryId) && this.hasBrazeSdk == signUpByEmailRequest.hasBrazeSdk && this.signupAsCharity == signUpByEmailRequest.signupAsCharity;
    }

    @Nullable
    public final String getCountryId() {
        return this.countryId;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    public final boolean getHasBrazeSdk() {
        return this.hasBrazeSdk;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean getNewsletterOptIn() {
        return this.newsletterOptIn;
    }

    public final boolean getPushNotificationOptIn() {
        return this.pushNotificationOptIn;
    }

    public final boolean getSignupAsCharity() {
        return this.signupAsCharity;
    }

    public int hashCode() {
        int iE = k.e(k.e(l1.b(l1.b(this.email.hashCode() * 31, 31, this.name), 31, this.deviceType), 31, this.newsletterOptIn), 31, this.pushNotificationOptIn);
        String str = this.countryId;
        return Boolean.hashCode(this.signupAsCharity) + k.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.hasBrazeSdk);
    }

    public final void setNewsletterOptIn(boolean z11) {
        this.newsletterOptIn = z11;
    }

    public final void setPushNotificationOptIn(boolean z11) {
        this.pushNotificationOptIn = z11;
    }

    @NotNull
    public String toString() {
        String str = this.email;
        String str2 = this.name;
        String str3 = this.deviceType;
        boolean z11 = this.newsletterOptIn;
        boolean z12 = this.pushNotificationOptIn;
        String str4 = this.countryId;
        boolean z13 = this.hasBrazeSdk;
        boolean z14 = this.signupAsCharity;
        StringBuilder sbT = f.t("SignUpByEmailRequest(email=", str, ", name=", str2, ", deviceType=");
        k.z(sbT, str3, ", newsletterOptIn=", z11, ", pushNotificationOptIn=");
        sbT.append(z12);
        sbT.append(", countryId=");
        sbT.append(str4);
        sbT.append(", hasBrazeSdk=");
        sbT.append(z13);
        sbT.append(", signupAsCharity=");
        sbT.append(z14);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/SignUpByEmailRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/SignUpByEmailRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SignUpByEmailRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("country_id")
    public static /* synthetic */ void getCountryId$annotations() {
    }

    @g("device_type")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @g("email")
    public static /* synthetic */ void getEmail$annotations() {
    }

    @g("has_braze_sdk")
    public static /* synthetic */ void getHasBrazeSdk$annotations() {
    }

    @g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @g("newsletter_opt_in")
    public static /* synthetic */ void getNewsletterOptIn$annotations() {
    }

    @g("push_notification_opt_in")
    public static /* synthetic */ void getPushNotificationOptIn$annotations() {
    }

    @g("signup_as_charity")
    public static /* synthetic */ void getSignupAsCharity$annotations() {
    }

    public SignUpByEmailRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z11, boolean z12, @Nullable String str4, boolean z13, boolean z14) {
        a0.C(str, str2, str3);
        this.email = str;
        this.name = str2;
        this.deviceType = str3;
        this.newsletterOptIn = z11;
        this.pushNotificationOptIn = z12;
        this.countryId = str4;
        this.hasBrazeSdk = z13;
        this.signupAsCharity = z14;
    }

    public /* synthetic */ SignUpByEmailRequest(String str, String str2, String str3, boolean z11, boolean z12, String str4, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "" : str2, str3, z11, z12, str4, (i11 & 64) != 0 ? true : z13, (i11 & 128) != 0 ? false : z14);
    }
}
