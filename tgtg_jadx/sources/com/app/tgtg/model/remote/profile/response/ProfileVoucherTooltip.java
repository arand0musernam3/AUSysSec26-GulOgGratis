package com.app.tgtg.model.remote.profile.response;

import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\"\u0012\u0004\b&\u0010'\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010%R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0016¨\u0006,"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/ProfileVoucherTooltip;", "", "", "showNewVoucherTooltip", "showExpiringSoonVoucherTooltip", "<init>", "(ZZ)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IZZLm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/response/ProfileVoucherTooltip;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/app/tgtg/model/remote/profile/response/ProfileVoucherTooltip;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShowNewVoucherTooltip", "setShowNewVoucherTooltip", "(Z)V", "getShowNewVoucherTooltip$annotations", "()V", "getShowExpiringSoonVoucherTooltip", "getShowExpiringSoonVoucherTooltip$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ProfileVoucherTooltip {
    private final boolean showExpiringSoonVoucherTooltip;
    private boolean showNewVoucherTooltip;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ ProfileVoucherTooltip(int i11, boolean z11, boolean z12, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.showNewVoucherTooltip = false;
        } else {
            this.showNewVoucherTooltip = z11;
        }
        if ((i11 & 2) == 0) {
            this.showExpiringSoonVoucherTooltip = false;
        } else {
            this.showExpiringSoonVoucherTooltip = z12;
        }
    }

    public static /* synthetic */ ProfileVoucherTooltip copy$default(ProfileVoucherTooltip profileVoucherTooltip, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = profileVoucherTooltip.showNewVoucherTooltip;
        }
        if ((i11 & 2) != 0) {
            z12 = profileVoucherTooltip.showExpiringSoonVoucherTooltip;
        }
        return profileVoucherTooltip.copy(z11, z12);
    }

    public static final /* synthetic */ void write$Self$app(ProfileVoucherTooltip self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.showNewVoucherTooltip) {
            output.p(serialDesc, 0, self.showNewVoucherTooltip);
        }
        if (output.C(serialDesc) || self.showExpiringSoonVoucherTooltip) {
            output.p(serialDesc, 1, self.showExpiringSoonVoucherTooltip);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowNewVoucherTooltip() {
        return this.showNewVoucherTooltip;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowExpiringSoonVoucherTooltip() {
        return this.showExpiringSoonVoucherTooltip;
    }

    @NotNull
    public final ProfileVoucherTooltip copy(boolean showNewVoucherTooltip, boolean showExpiringSoonVoucherTooltip) {
        return new ProfileVoucherTooltip(showNewVoucherTooltip, showExpiringSoonVoucherTooltip);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileVoucherTooltip)) {
            return false;
        }
        ProfileVoucherTooltip profileVoucherTooltip = (ProfileVoucherTooltip) other;
        return this.showNewVoucherTooltip == profileVoucherTooltip.showNewVoucherTooltip && this.showExpiringSoonVoucherTooltip == profileVoucherTooltip.showExpiringSoonVoucherTooltip;
    }

    public final boolean getShowExpiringSoonVoucherTooltip() {
        return this.showExpiringSoonVoucherTooltip;
    }

    public final boolean getShowNewVoucherTooltip() {
        return this.showNewVoucherTooltip;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showExpiringSoonVoucherTooltip) + (Boolean.hashCode(this.showNewVoucherTooltip) * 31);
    }

    public final void setShowNewVoucherTooltip(boolean z11) {
        this.showNewVoucherTooltip = z11;
    }

    @NotNull
    public String toString() {
        return "ProfileVoucherTooltip(showNewVoucherTooltip=" + this.showNewVoucherTooltip + ", showExpiringSoonVoucherTooltip=" + this.showExpiringSoonVoucherTooltip + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/ProfileVoucherTooltip$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/profile/response/ProfileVoucherTooltip;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProfileVoucherTooltip$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("show_expiring_soon_voucher_tooltip")
    public static /* synthetic */ void getShowExpiringSoonVoucherTooltip$annotations() {
    }

    @g("show_new_voucher_tooltip")
    public static /* synthetic */ void getShowNewVoucherTooltip$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProfileVoucherTooltip() {
        boolean z11 = false;
        this(z11, z11, 3, (DefaultConstructorMarker) null);
    }

    public ProfileVoucherTooltip(boolean z11, boolean z12) {
        this.showNewVoucherTooltip = z11;
        this.showExpiringSoonVoucherTooltip = z12;
    }

    public /* synthetic */ ProfileVoucherTooltip(boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12);
    }
}
