package com.app.tgtg.model.remote.user.requests;

import com.app.tgtg.model.remote.user.response.C2CReferralType;
import com.app.tgtg.model.remote.user.response.C2CReferralTypeSerializer;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ<\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0019R(\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010/\u0012\u0004\b3\u0010*\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/LinkC2CReferralCodeRequest;", "", "", "referralCode", "secureAndroidIdA", "secureAndroidIdB", "Lcom/app/tgtg/model/remote/user/response/C2CReferralType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/C2CReferralType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/C2CReferralType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/LinkC2CReferralCodeRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/app/tgtg/model/remote/user/response/C2CReferralType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/C2CReferralType;)Lcom/app/tgtg/model/remote/user/requests/LinkC2CReferralCodeRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReferralCode", "getReferralCode$annotations", "()V", "getSecureAndroidIdA", "getSecureAndroidIdA$annotations", "getSecureAndroidIdB", "getSecureAndroidIdB$annotations", "Lcom/app/tgtg/model/remote/user/response/C2CReferralType;", "getType", "setType", "(Lcom/app/tgtg/model/remote/user/response/C2CReferralType;)V", "getType$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class LinkC2CReferralCodeRequest {

    @NotNull
    private final String referralCode;

    @Nullable
    private final String secureAndroidIdA;

    @Nullable
    private final String secureAndroidIdB;

    @NotNull
    private C2CReferralType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LinkC2CReferralCodeRequest(int i11, String str, String str2, String str3, C2CReferralType c2CReferralType, m1 m1Var) {
        if (9 != (i11 & 9)) {
            c1.j(i11, 9, LinkC2CReferralCodeRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.referralCode = str;
        if ((i11 & 2) == 0) {
            this.secureAndroidIdA = null;
        } else {
            this.secureAndroidIdA = str2;
        }
        if ((i11 & 4) == 0) {
            this.secureAndroidIdB = null;
        } else {
            this.secureAndroidIdB = str3;
        }
        this.type = c2CReferralType;
    }

    public static /* synthetic */ LinkC2CReferralCodeRequest copy$default(LinkC2CReferralCodeRequest linkC2CReferralCodeRequest, String str, String str2, String str3, C2CReferralType c2CReferralType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = linkC2CReferralCodeRequest.referralCode;
        }
        if ((i11 & 2) != 0) {
            str2 = linkC2CReferralCodeRequest.secureAndroidIdA;
        }
        if ((i11 & 4) != 0) {
            str3 = linkC2CReferralCodeRequest.secureAndroidIdB;
        }
        if ((i11 & 8) != 0) {
            c2CReferralType = linkC2CReferralCodeRequest.type;
        }
        return linkC2CReferralCodeRequest.copy(str, str2, str3, c2CReferralType);
    }

    public static final /* synthetic */ void write$Self$app(LinkC2CReferralCodeRequest self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.referralCode);
        if (output.C(serialDesc) || self.secureAndroidIdA != null) {
            output.r(serialDesc, 1, r1.f29848a, self.secureAndroidIdA);
        }
        if (output.C(serialDesc) || self.secureAndroidIdB != null) {
            output.r(serialDesc, 2, r1.f29848a, self.secureAndroidIdB);
        }
        output.i(serialDesc, 3, C2CReferralTypeSerializer.INSTANCE, self.type);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSecureAndroidIdA() {
        return this.secureAndroidIdA;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecureAndroidIdB() {
        return this.secureAndroidIdB;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C2CReferralType getType() {
        return this.type;
    }

    @NotNull
    public final LinkC2CReferralCodeRequest copy(@NotNull String referralCode, @Nullable String secureAndroidIdA, @Nullable String secureAndroidIdB, @NotNull C2CReferralType type) {
        referralCode.getClass();
        type.getClass();
        return new LinkC2CReferralCodeRequest(referralCode, secureAndroidIdA, secureAndroidIdB, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkC2CReferralCodeRequest)) {
            return false;
        }
        LinkC2CReferralCodeRequest linkC2CReferralCodeRequest = (LinkC2CReferralCodeRequest) other;
        return Intrinsics.areEqual(this.referralCode, linkC2CReferralCodeRequest.referralCode) && Intrinsics.areEqual(this.secureAndroidIdA, linkC2CReferralCodeRequest.secureAndroidIdA) && Intrinsics.areEqual(this.secureAndroidIdB, linkC2CReferralCodeRequest.secureAndroidIdB) && this.type == linkC2CReferralCodeRequest.type;
    }

    @NotNull
    public final String getReferralCode() {
        return this.referralCode;
    }

    @Nullable
    public final String getSecureAndroidIdA() {
        return this.secureAndroidIdA;
    }

    @Nullable
    public final String getSecureAndroidIdB() {
        return this.secureAndroidIdB;
    }

    @NotNull
    public final C2CReferralType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.referralCode.hashCode() * 31;
        String str = this.secureAndroidIdA;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secureAndroidIdB;
        return this.type.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final void setType(@NotNull C2CReferralType c2CReferralType) {
        c2CReferralType.getClass();
        this.type = c2CReferralType;
    }

    @NotNull
    public String toString() {
        String str = this.referralCode;
        String str2 = this.secureAndroidIdA;
        String str3 = this.secureAndroidIdB;
        C2CReferralType c2CReferralType = this.type;
        StringBuilder sbT = f.t("LinkC2CReferralCodeRequest(referralCode=", str, ", secureAndroidIdA=", str2, ", secureAndroidIdB=");
        sbT.append(str3);
        sbT.append(", type=");
        sbT.append(c2CReferralType);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/LinkC2CReferralCodeRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/LinkC2CReferralCodeRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return LinkC2CReferralCodeRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("referral_code")
    public static /* synthetic */ void getReferralCode$annotations() {
    }

    @g("device_id_a")
    public static /* synthetic */ void getSecureAndroidIdA$annotations() {
    }

    @g("device_id_b")
    public static /* synthetic */ void getSecureAndroidIdB$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getType$annotations() {
    }

    public LinkC2CReferralCodeRequest(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull C2CReferralType c2CReferralType) {
        str.getClass();
        c2CReferralType.getClass();
        this.referralCode = str;
        this.secureAndroidIdA = str2;
        this.secureAndroidIdB = str3;
        this.type = c2CReferralType;
    }

    public /* synthetic */ LinkC2CReferralCodeRequest(String str, String str2, String str3, C2CReferralType c2CReferralType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, c2CReferralType);
    }
}
