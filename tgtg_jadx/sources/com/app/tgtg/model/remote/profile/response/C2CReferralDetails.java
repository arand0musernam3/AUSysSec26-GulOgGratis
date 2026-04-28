package com.app.tgtg.model.remote.profile.response;

import b3.i;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.l0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ0\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010\u001c¨\u00062"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/C2CReferralDetails;", "", "", "expiryDate", "Lcom/app/tgtg/model/remote/payment/Price;", "voucherValue", "", "totalReferrals", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/response/C2CReferralDetails;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/app/tgtg/model/remote/payment/Price;", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/Integer;)Lcom/app/tgtg/model/remote/profile/response/C2CReferralDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExpiryDate", "getExpiryDate$annotations", "()V", "Lcom/app/tgtg/model/remote/payment/Price;", "getVoucherValue", "getVoucherValue$annotations", "Ljava/lang/Integer;", "getTotalReferrals", "getTotalReferrals$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class C2CReferralDetails {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String expiryDate;

    @Nullable
    private final Integer totalReferrals;

    @NotNull
    private final Price voucherValue;

    public /* synthetic */ C2CReferralDetails(int i11, String str, Price price, Integer num, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, C2CReferralDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.expiryDate = str;
        this.voucherValue = price;
        this.totalReferrals = num;
    }

    public static /* synthetic */ C2CReferralDetails copy$default(C2CReferralDetails c2CReferralDetails, String str, Price price, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c2CReferralDetails.expiryDate;
        }
        if ((i11 & 2) != 0) {
            price = c2CReferralDetails.voucherValue;
        }
        if ((i11 & 4) != 0) {
            num = c2CReferralDetails.totalReferrals;
        }
        return c2CReferralDetails.copy(str, price, num);
    }

    public static final /* synthetic */ void write$Self$app(C2CReferralDetails self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.expiryDate);
        output.i(serialDesc, 1, Price$$serializer.INSTANCE, self.voucherValue);
        output.r(serialDesc, 2, l0.f29821a, self.totalReferrals);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Price getVoucherValue() {
        return this.voucherValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTotalReferrals() {
        return this.totalReferrals;
    }

    @NotNull
    public final C2CReferralDetails copy(@NotNull String expiryDate, @NotNull Price voucherValue, @Nullable Integer totalReferrals) {
        expiryDate.getClass();
        voucherValue.getClass();
        return new C2CReferralDetails(expiryDate, voucherValue, totalReferrals);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2CReferralDetails)) {
            return false;
        }
        C2CReferralDetails c2CReferralDetails = (C2CReferralDetails) other;
        return Intrinsics.areEqual(this.expiryDate, c2CReferralDetails.expiryDate) && Intrinsics.areEqual(this.voucherValue, c2CReferralDetails.voucherValue) && Intrinsics.areEqual(this.totalReferrals, c2CReferralDetails.totalReferrals);
    }

    @NotNull
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @Nullable
    public final Integer getTotalReferrals() {
        return this.totalReferrals;
    }

    @NotNull
    public final Price getVoucherValue() {
        return this.voucherValue;
    }

    public int hashCode() {
        int iHashCode = (this.voucherValue.hashCode() + (this.expiryDate.hashCode() * 31)) * 31;
        Integer num = this.totalReferrals;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.expiryDate;
        Price price = this.voucherValue;
        Integer num = this.totalReferrals;
        StringBuilder sb2 = new StringBuilder("C2CReferralDetails(expiryDate=");
        sb2.append(str);
        sb2.append(", voucherValue=");
        sb2.append(price);
        sb2.append(", totalReferrals=");
        return i.m(sb2, num, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/C2CReferralDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/profile/response/C2CReferralDetails;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return C2CReferralDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("expiry_date")
    public static /* synthetic */ void getExpiryDate$annotations() {
    }

    @g("total_referrals")
    public static /* synthetic */ void getTotalReferrals$annotations() {
    }

    @g("voucher_value")
    public static /* synthetic */ void getVoucherValue$annotations() {
    }

    public C2CReferralDetails(@NotNull String str, @NotNull Price price, @Nullable Integer num) {
        str.getClass();
        price.getClass();
        this.expiryDate = str;
        this.voucherValue = price;
        this.totalReferrals = num;
    }
}
