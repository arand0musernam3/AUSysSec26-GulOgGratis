package com.app.tgtg.model.remote.user.response;

import android.os.Parcel;
import android.os.Parcelable;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J&\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010*\u0012\u0004\b.\u0010/\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010-R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010 ¨\u00065"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/UserReferralCoupon;", "Landroid/os/Parcelable;", "", "couponCode", "Lcom/app/tgtg/model/remote/user/response/CouponCodeState;", "state", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/CouponCodeState;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/user/response/CouponCodeState;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/UserReferralCoupon;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/app/tgtg/model/remote/user/response/CouponCodeState;", "copy", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/CouponCodeState;)Lcom/app/tgtg/model/remote/user/response/UserReferralCoupon;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCouponCode", "setCouponCode", "(Ljava/lang/String;)V", "getCouponCode$annotations", "()V", "Lcom/app/tgtg/model/remote/user/response/CouponCodeState;", "getState", "getState$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class UserReferralCoupon implements Parcelable {

    @NotNull
    private String couponCode;

    @Nullable
    private final CouponCodeState state;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<UserReferralCoupon> CREATOR = new Creator();

    public /* synthetic */ UserReferralCoupon(int i11, String str, CouponCodeState couponCodeState, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, UserReferralCoupon$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.couponCode = str;
        if ((i11 & 2) == 0) {
            this.state = null;
        } else {
            this.state = couponCodeState;
        }
    }

    public static /* synthetic */ UserReferralCoupon copy$default(UserReferralCoupon userReferralCoupon, String str, CouponCodeState couponCodeState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userReferralCoupon.couponCode;
        }
        if ((i11 & 2) != 0) {
            couponCodeState = userReferralCoupon.state;
        }
        return userReferralCoupon.copy(str, couponCodeState);
    }

    public static final /* synthetic */ void write$Self$app(UserReferralCoupon self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.couponCode);
        if (!output.C(serialDesc) && self.state == null) {
            return;
        }
        output.r(serialDesc, 1, CouponCodeStateSerializer.INSTANCE, self.state);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCouponCode() {
        return this.couponCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CouponCodeState getState() {
        return this.state;
    }

    @NotNull
    public final UserReferralCoupon copy(@NotNull String couponCode, @Nullable CouponCodeState state) {
        couponCode.getClass();
        return new UserReferralCoupon(couponCode, state);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserReferralCoupon)) {
            return false;
        }
        UserReferralCoupon userReferralCoupon = (UserReferralCoupon) other;
        return Intrinsics.areEqual(this.couponCode, userReferralCoupon.couponCode) && this.state == userReferralCoupon.state;
    }

    @NotNull
    public final String getCouponCode() {
        return this.couponCode;
    }

    @Nullable
    public final CouponCodeState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = this.couponCode.hashCode() * 31;
        CouponCodeState couponCodeState = this.state;
        return iHashCode + (couponCodeState == null ? 0 : couponCodeState.hashCode());
    }

    public final void setCouponCode(@NotNull String str) {
        str.getClass();
        this.couponCode = str;
    }

    @NotNull
    public String toString() {
        return "UserReferralCoupon(couponCode=" + this.couponCode + ", state=" + this.state + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.couponCode);
        CouponCodeState couponCodeState = this.state;
        if (couponCodeState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(couponCodeState.name());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/UserReferralCoupon$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/UserReferralCoupon;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UserReferralCoupon$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserReferralCoupon> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserReferralCoupon createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new UserReferralCoupon(parcel.readString(), parcel.readInt() == 0 ? null : CouponCodeState.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserReferralCoupon[] newArray(int i11) {
            return new UserReferralCoupon[i11];
        }
    }

    @g("coupon_code")
    public static /* synthetic */ void getCouponCode$annotations() {
    }

    @g("user_referral_coupon_state")
    public static /* synthetic */ void getState$annotations() {
    }

    public UserReferralCoupon(@NotNull String str, @Nullable CouponCodeState couponCodeState) {
        str.getClass();
        this.couponCode = str;
        this.state = couponCodeState;
    }

    public /* synthetic */ UserReferralCoupon(String str, CouponCodeState couponCodeState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : couponCodeState);
    }
}
