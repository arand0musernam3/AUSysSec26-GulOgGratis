package com.app.tgtg.model.remote.user.requests;

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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ0\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001aR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001a¨\u0006/"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/RedeemOrderRequest;", "", "", "redeemingUserName", "", "redeemedOffline", "eligibleForReward", "<init>", "(Ljava/lang/String;ZZ)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;ZZLm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/requests/RedeemOrderRequest;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZZ)Lcom/app/tgtg/model/remote/user/requests/RedeemOrderRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRedeemingUserName", "getRedeemingUserName$annotations", "()V", "Z", "getRedeemedOffline", "getRedeemedOffline$annotations", "getEligibleForReward", "getEligibleForReward$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class RedeemOrderRequest {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean eligibleForReward;
    private final boolean redeemedOffline;

    @Nullable
    private final String redeemingUserName;

    public /* synthetic */ RedeemOrderRequest(int i11, String str, boolean z11, boolean z12, m1 m1Var) {
        if (6 != (i11 & 6)) {
            c1.j(i11, 6, RedeemOrderRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.redeemingUserName = null;
        } else {
            this.redeemingUserName = str;
        }
        this.redeemedOffline = z11;
        this.eligibleForReward = z12;
    }

    public static /* synthetic */ RedeemOrderRequest copy$default(RedeemOrderRequest redeemOrderRequest, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = redeemOrderRequest.redeemingUserName;
        }
        if ((i11 & 2) != 0) {
            z11 = redeemOrderRequest.redeemedOffline;
        }
        if ((i11 & 4) != 0) {
            z12 = redeemOrderRequest.eligibleForReward;
        }
        return redeemOrderRequest.copy(str, z11, z12);
    }

    public static final /* synthetic */ void write$Self$app(RedeemOrderRequest self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.redeemingUserName != null) {
            output.r(serialDesc, 0, r1.f29848a, self.redeemingUserName);
        }
        output.p(serialDesc, 1, self.redeemedOffline);
        output.p(serialDesc, 2, self.eligibleForReward);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRedeemingUserName() {
        return this.redeemingUserName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRedeemedOffline() {
        return this.redeemedOffline;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEligibleForReward() {
        return this.eligibleForReward;
    }

    @NotNull
    public final RedeemOrderRequest copy(@Nullable String redeemingUserName, boolean redeemedOffline, boolean eligibleForReward) {
        return new RedeemOrderRequest(redeemingUserName, redeemedOffline, eligibleForReward);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RedeemOrderRequest)) {
            return false;
        }
        RedeemOrderRequest redeemOrderRequest = (RedeemOrderRequest) other;
        return Intrinsics.areEqual(this.redeemingUserName, redeemOrderRequest.redeemingUserName) && this.redeemedOffline == redeemOrderRequest.redeemedOffline && this.eligibleForReward == redeemOrderRequest.eligibleForReward;
    }

    public final boolean getEligibleForReward() {
        return this.eligibleForReward;
    }

    public final boolean getRedeemedOffline() {
        return this.redeemedOffline;
    }

    @Nullable
    public final String getRedeemingUserName() {
        return this.redeemingUserName;
    }

    public int hashCode() {
        String str = this.redeemingUserName;
        return Boolean.hashCode(this.eligibleForReward) + k.e((str == null ? 0 : str.hashCode()) * 31, 31, this.redeemedOffline);
    }

    @NotNull
    public String toString() {
        String str = this.redeemingUserName;
        boolean z11 = this.redeemedOffline;
        boolean z12 = this.eligibleForReward;
        StringBuilder sb2 = new StringBuilder("RedeemOrderRequest(redeemingUserName=");
        sb2.append(str);
        sb2.append(", redeemedOffline=");
        sb2.append(z11);
        sb2.append(", eligibleForReward=");
        return s.o(sb2, z12, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/requests/RedeemOrderRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/requests/RedeemOrderRequest;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RedeemOrderRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("eligible_for_reward")
    public static /* synthetic */ void getEligibleForReward$annotations() {
    }

    @g("redeemed_offline")
    public static /* synthetic */ void getRedeemedOffline$annotations() {
    }

    @g("redeeming_user_name")
    public static /* synthetic */ void getRedeemingUserName$annotations() {
    }

    public RedeemOrderRequest(@Nullable String str, boolean z11, boolean z12) {
        this.redeemingUserName = str;
        this.redeemedOffline = z11;
        this.eligibleForReward = z12;
    }

    public /* synthetic */ RedeemOrderRequest(String str, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, z11, z12);
    }
}
