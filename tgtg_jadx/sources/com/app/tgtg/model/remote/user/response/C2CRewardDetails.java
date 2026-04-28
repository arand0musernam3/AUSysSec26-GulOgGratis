package com.app.tgtg.model.remote.user.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.braze.Constants;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import n90.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import t1.w1;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002CDB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0012J\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u0012J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014JP\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u0012J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0014J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00102\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00103\u0012\u0004\b8\u00106\u001a\u0004\b7\u0010\u0014R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00109\u0012\u0004\b;\u00106\u001a\u0004\b:\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010<\u0012\u0004\b>\u00106\u001a\u0004\b=\u0010\u0012R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010<\u0012\u0004\b@\u00106\u001a\u0004\b?\u0010\u0012R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\bB\u00106\u001a\u0004\bA\u0010\u0014¨\u0006E"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/C2CRewardDetails;", "Landroid/os/Parcelable;", "", "c2cReferralEarnedRewards", "c2cReferralMaxRewards", "Lcom/app/tgtg/model/remote/payment/Price;", "c2cReferralRewardPrice", "", "termsUrl", "lastAchievedRewardExpiresAtUtc", "rewardUsageDuration", "<init>", "(IILcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IIILcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;ILm90/m1;)V", "toJson", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "()Lcom/app/tgtg/model/remote/payment/Price;", "component4", "component5", "component6", "copy", "(IILcom/app/tgtg/model/remote/payment/Price;Ljava/lang/String;Ljava/lang/String;I)Lcom/app/tgtg/model/remote/user/response/C2CRewardDetails;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/C2CRewardDetails;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getC2cReferralEarnedRewards", "getC2cReferralEarnedRewards$annotations", "()V", "getC2cReferralMaxRewards", "getC2cReferralMaxRewards$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getC2cReferralRewardPrice", "getC2cReferralRewardPrice$annotations", "Ljava/lang/String;", "getTermsUrl", "getTermsUrl$annotations", "getLastAchievedRewardExpiresAtUtc", "getLastAchievedRewardExpiresAtUtc$annotations", "getRewardUsageDuration", "getRewardUsageDuration$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class C2CRewardDetails implements Parcelable {
    public static final int $stable = 0;
    private final int c2cReferralEarnedRewards;
    private final int c2cReferralMaxRewards;

    @NotNull
    private final Price c2cReferralRewardPrice;

    @Nullable
    private final String lastAchievedRewardExpiresAtUtc;
    private final int rewardUsageDuration;

    @Nullable
    private final String termsUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<C2CRewardDetails> CREATOR = new Creator();

    @NotNull
    private static final c json = w.h(new w1(25));

    public /* synthetic */ C2CRewardDetails(int i11, int i12, int i13, Price price, String str, String str2, int i14, m1 m1Var) {
        if (39 != (i11 & 39)) {
            c1.j(i11, 39, C2CRewardDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.c2cReferralEarnedRewards = i12;
        this.c2cReferralMaxRewards = i13;
        this.c2cReferralRewardPrice = price;
        if ((i11 & 8) == 0) {
            this.termsUrl = null;
        } else {
            this.termsUrl = str;
        }
        if ((i11 & 16) == 0) {
            this.lastAchievedRewardExpiresAtUtc = null;
        } else {
            this.lastAchievedRewardExpiresAtUtc = str2;
        }
        this.rewardUsageDuration = i14;
    }

    public static /* synthetic */ C2CRewardDetails copy$default(C2CRewardDetails c2CRewardDetails, int i11, int i12, Price price, String str, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = c2CRewardDetails.c2cReferralEarnedRewards;
        }
        if ((i14 & 2) != 0) {
            i12 = c2CRewardDetails.c2cReferralMaxRewards;
        }
        if ((i14 & 4) != 0) {
            price = c2CRewardDetails.c2cReferralRewardPrice;
        }
        if ((i14 & 8) != 0) {
            str = c2CRewardDetails.termsUrl;
        }
        if ((i14 & 16) != 0) {
            str2 = c2CRewardDetails.lastAchievedRewardExpiresAtUtc;
        }
        if ((i14 & 32) != 0) {
            i13 = c2CRewardDetails.rewardUsageDuration;
        }
        String str3 = str2;
        int i15 = i13;
        return c2CRewardDetails.copy(i11, i12, price, str, str3, i15);
    }

    @NotNull
    public static final C2CRewardDetails fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(n90.h hVar) {
        hVar.getClass();
        hVar.f30766c = true;
        return Unit.f26487a;
    }

    public static final /* synthetic */ void write$Self$app(C2CRewardDetails self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.c2cReferralEarnedRewards, serialDesc);
        output.m(1, self.c2cReferralMaxRewards, serialDesc);
        output.i(serialDesc, 2, Price$$serializer.INSTANCE, self.c2cReferralRewardPrice);
        if (output.C(serialDesc) || self.termsUrl != null) {
            output.r(serialDesc, 3, r1.f29848a, self.termsUrl);
        }
        if (output.C(serialDesc) || self.lastAchievedRewardExpiresAtUtc != null) {
            output.r(serialDesc, 4, r1.f29848a, self.lastAchievedRewardExpiresAtUtc);
        }
        output.m(5, self.rewardUsageDuration, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getC2cReferralEarnedRewards() {
        return this.c2cReferralEarnedRewards;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getC2cReferralMaxRewards() {
        return this.c2cReferralMaxRewards;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Price getC2cReferralRewardPrice() {
        return this.c2cReferralRewardPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLastAchievedRewardExpiresAtUtc() {
        return this.lastAchievedRewardExpiresAtUtc;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRewardUsageDuration() {
        return this.rewardUsageDuration;
    }

    @NotNull
    public final C2CRewardDetails copy(int c2cReferralEarnedRewards, int c2cReferralMaxRewards, @NotNull Price c2cReferralRewardPrice, @Nullable String termsUrl, @Nullable String lastAchievedRewardExpiresAtUtc, int rewardUsageDuration) {
        c2cReferralRewardPrice.getClass();
        return new C2CRewardDetails(c2cReferralEarnedRewards, c2cReferralMaxRewards, c2cReferralRewardPrice, termsUrl, lastAchievedRewardExpiresAtUtc, rewardUsageDuration);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2CRewardDetails)) {
            return false;
        }
        C2CRewardDetails c2CRewardDetails = (C2CRewardDetails) other;
        return this.c2cReferralEarnedRewards == c2CRewardDetails.c2cReferralEarnedRewards && this.c2cReferralMaxRewards == c2CRewardDetails.c2cReferralMaxRewards && Intrinsics.areEqual(this.c2cReferralRewardPrice, c2CRewardDetails.c2cReferralRewardPrice) && Intrinsics.areEqual(this.termsUrl, c2CRewardDetails.termsUrl) && Intrinsics.areEqual(this.lastAchievedRewardExpiresAtUtc, c2CRewardDetails.lastAchievedRewardExpiresAtUtc) && this.rewardUsageDuration == c2CRewardDetails.rewardUsageDuration;
    }

    public final int getC2cReferralEarnedRewards() {
        return this.c2cReferralEarnedRewards;
    }

    public final int getC2cReferralMaxRewards() {
        return this.c2cReferralMaxRewards;
    }

    @NotNull
    public final Price getC2cReferralRewardPrice() {
        return this.c2cReferralRewardPrice;
    }

    @Nullable
    public final String getLastAchievedRewardExpiresAtUtc() {
        return this.lastAchievedRewardExpiresAtUtc;
    }

    public final int getRewardUsageDuration() {
        return this.rewardUsageDuration;
    }

    @Nullable
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    public int hashCode() {
        int iHashCode = (this.c2cReferralRewardPrice.hashCode() + k.b(this.c2cReferralMaxRewards, Integer.hashCode(this.c2cReferralEarnedRewards) * 31, 31)) * 31;
        String str = this.termsUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastAchievedRewardExpiresAtUtc;
        return Integer.hashCode(this.rewardUsageDuration) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toJson() {
        return c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        int i11 = this.c2cReferralEarnedRewards;
        int i12 = this.c2cReferralMaxRewards;
        Price price = this.c2cReferralRewardPrice;
        String str = this.termsUrl;
        String str2 = this.lastAchievedRewardExpiresAtUtc;
        int i13 = this.rewardUsageDuration;
        StringBuilder sbR = k.r(i11, i12, "C2CRewardDetails(c2cReferralEarnedRewards=", ", c2cReferralMaxRewards=", ", c2cReferralRewardPrice=");
        sbR.append(price);
        sbR.append(", termsUrl=");
        sbR.append(str);
        sbR.append(", lastAchievedRewardExpiresAtUtc=");
        sbR.append(str2);
        sbR.append(", rewardUsageDuration=");
        sbR.append(i13);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.c2cReferralEarnedRewards);
        dest.writeInt(this.c2cReferralMaxRewards);
        this.c2cReferralRewardPrice.writeToParcel(dest, flags);
        dest.writeString(this.termsUrl);
        dest.writeString(this.lastAchievedRewardExpiresAtUtc);
        dest.writeInt(this.rewardUsageDuration);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/C2CRewardDetails$Companion;", "", "<init>", "()V", "", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "Lcom/app/tgtg/model/remote/user/response/C2CRewardDetails;", "fromJson", "(Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/response/C2CRewardDetails;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Ln90/c;", "json", "Ln90/c;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C2CRewardDetails fromJson(@NotNull String s7) {
            s7.getClass();
            return (C2CRewardDetails) C2CRewardDetails.json.b(serializer(), s7);
        }

        @NotNull
        public final KSerializer serializer() {
            return C2CRewardDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<C2CRewardDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final C2CRewardDetails createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new C2CRewardDetails(parcel.readInt(), parcel.readInt(), Price.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final C2CRewardDetails[] newArray(int i11) {
            return new C2CRewardDetails[i11];
        }
    }

    @g("earned_rewards")
    public static /* synthetic */ void getC2cReferralEarnedRewards$annotations() {
    }

    @g("max_rewards")
    public static /* synthetic */ void getC2cReferralMaxRewards$annotations() {
    }

    @g("single_voucher_amount")
    public static /* synthetic */ void getC2cReferralRewardPrice$annotations() {
    }

    @g("last_achieved_reward_expires_at_utc")
    public static /* synthetic */ void getLastAchievedRewardExpiresAtUtc$annotations() {
    }

    @g("reward_usage_duration_in_days")
    public static /* synthetic */ void getRewardUsageDuration$annotations() {
    }

    @g("terms_url")
    public static /* synthetic */ void getTermsUrl$annotations() {
    }

    public C2CRewardDetails(int i11, int i12, @NotNull Price price, @Nullable String str, @Nullable String str2, int i13) {
        price.getClass();
        this.c2cReferralEarnedRewards = i11;
        this.c2cReferralMaxRewards = i12;
        this.c2cReferralRewardPrice = price;
        this.termsUrl = str;
        this.lastAchievedRewardExpiresAtUtc = str2;
        this.rewardUsageDuration = i13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2CRewardDetails(int i11, int i12, Price price, String str, String str2, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        int i15;
        String str3;
        str = (i14 & 8) != 0 ? null : str;
        if ((i14 & 16) != 0) {
            i15 = i13;
            str3 = null;
        } else {
            i15 = i13;
            str3 = str2;
        }
        this(i11, i12, price, str, str3, i15);
    }
}
