package com.app.tgtg.model.remote.profile.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.VoucherId$$serializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.braze.Constants;
import e0.f;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import n90.c;
import nv.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002MNBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fB[\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010\u0015J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u0017JZ\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0015J\u0010\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b,\u0010\u0017J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J'\u00109\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b7\u00108R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010>\u0012\u0004\b@\u0010=\u001a\u0004\b?\u0010 R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010A\u0012\u0004\bC\u0010=\u001a\u0004\bB\u0010\u0017R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010A\u0012\u0004\bE\u0010=\u001a\u0004\bD\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010F\u0012\u0004\bH\u0010=\u001a\u0004\bG\u0010$R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010:\u0012\u0004\bJ\u0010=\u001a\u0004\bI\u0010\u0015R \u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010A\u0012\u0004\bL\u0010=\u001a\u0004\bK\u0010\u0017¨\u0006O"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;", "Landroid/os/Parcelable;", "", "expiryDate", "Lcom/app/tgtg/model/remote/payment/Price;", "voucherValue", "", "orderCount", "maxPoints", "Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardNotification;", "notification", "Lcom/app/tgtg/model/remote/VoucherId;", "voucherId", "voucherUsageDuration", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;IILcom/app/tgtg/model/remote/profile/response/LoyaltyCardNotification;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;IILcom/app/tgtg/model/remote/profile/response/LoyaltyCardNotification;Ljava/lang/String;ILm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toJson", "()Ljava/lang/String;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Lcom/app/tgtg/model/remote/payment/Price;", "component3", "component4", "component5", "()Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardNotification;", "component6-sIL_j68", "component6", "component7", "copy-nejLoL8", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;IILcom/app/tgtg/model/remote/profile/response/LoyaltyCardNotification;Ljava/lang/String;I)Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;", "copy", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getExpiryDate", "getExpiryDate$annotations", "()V", "Lcom/app/tgtg/model/remote/payment/Price;", "getVoucherValue", "getVoucherValue$annotations", "I", "getOrderCount", "getOrderCount$annotations", "getMaxPoints", "getMaxPoints$annotations", "Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardNotification;", "getNotification", "getNotification$annotations", "getVoucherId-sIL_j68", "getVoucherId-sIL_j68$annotations", "getVoucherUsageDuration", "getVoucherUsageDuration$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class LoyaltyCardDetails implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    private final String expiryDate;
    private final int maxPoints;

    @Nullable
    private final LoyaltyCardNotification notification;
    private final int orderCount;

    @Nullable
    private final String voucherId;
    private final int voucherUsageDuration;

    @NotNull
    private final Price voucherValue;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<LoyaltyCardDetails> CREATOR = new Creator();

    @NotNull
    private static final c json = w.h(new a(24));

    private /* synthetic */ LoyaltyCardDetails(int i11, String str, Price price, int i12, int i13, LoyaltyCardNotification loyaltyCardNotification, String str2, int i14, m1 m1Var) {
        if (63 != (i11 & 63)) {
            c1.j(i11, 63, LoyaltyCardDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.expiryDate = str;
        this.voucherValue = price;
        this.orderCount = i12;
        this.maxPoints = i13;
        this.notification = loyaltyCardNotification;
        this.voucherId = str2;
        if ((i11 & 64) == 0) {
            this.voucherUsageDuration = 0;
        } else {
            this.voucherUsageDuration = i14;
        }
    }

    /* JADX INFO: renamed from: copy-nejLoL8$default, reason: not valid java name */
    public static /* synthetic */ LoyaltyCardDetails m480copynejLoL8$default(LoyaltyCardDetails loyaltyCardDetails, String str, Price price, int i11, int i12, LoyaltyCardNotification loyaltyCardNotification, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = loyaltyCardDetails.expiryDate;
        }
        if ((i14 & 2) != 0) {
            price = loyaltyCardDetails.voucherValue;
        }
        if ((i14 & 4) != 0) {
            i11 = loyaltyCardDetails.orderCount;
        }
        if ((i14 & 8) != 0) {
            i12 = loyaltyCardDetails.maxPoints;
        }
        if ((i14 & 16) != 0) {
            loyaltyCardNotification = loyaltyCardDetails.notification;
        }
        if ((i14 & 32) != 0) {
            str2 = loyaltyCardDetails.voucherId;
        }
        if ((i14 & 64) != 0) {
            i13 = loyaltyCardDetails.voucherUsageDuration;
        }
        String str3 = str2;
        int i15 = i13;
        LoyaltyCardNotification loyaltyCardNotification2 = loyaltyCardNotification;
        int i16 = i11;
        return loyaltyCardDetails.m483copynejLoL8(str, price, i16, i12, loyaltyCardNotification2, str3, i15);
    }

    @NotNull
    public static final LoyaltyCardDetails fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(n90.h hVar) {
        hVar.getClass();
        hVar.f30766c = true;
        return Unit.f26487a;
    }

    public static final /* synthetic */ void write$Self$app(LoyaltyCardDetails self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.expiryDate);
        output.i(serialDesc, 1, Price$$serializer.INSTANCE, self.voucherValue);
        output.m(2, self.orderCount, serialDesc);
        output.m(3, self.maxPoints, serialDesc);
        output.r(serialDesc, 4, LoyaltyCardNotification$$serializer.INSTANCE, self.notification);
        VoucherId$$serializer voucherId$$serializer = VoucherId$$serializer.INSTANCE;
        String str = self.voucherId;
        output.r(serialDesc, 5, voucherId$$serializer, str != null ? VoucherId.m298boximpl(str) : null);
        if (!output.C(serialDesc) && self.voucherUsageDuration == 0) {
            return;
        }
        output.m(6, self.voucherUsageDuration, serialDesc);
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOrderCount() {
        return this.orderCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxPoints() {
        return this.maxPoints;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LoyaltyCardNotification getNotification() {
        return this.notification;
    }

    @Nullable
    /* JADX INFO: renamed from: component6-sIL_j68, reason: not valid java name and from getter */
    public final String getVoucherId() {
        return this.voucherId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getVoucherUsageDuration() {
        return this.voucherUsageDuration;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-nejLoL8, reason: not valid java name */
    public final LoyaltyCardDetails m483copynejLoL8(@NotNull String expiryDate, @NotNull Price voucherValue, int orderCount, int maxPoints, @Nullable LoyaltyCardNotification notification, @Nullable String voucherId, int voucherUsageDuration) {
        expiryDate.getClass();
        voucherValue.getClass();
        return new LoyaltyCardDetails(expiryDate, voucherValue, orderCount, maxPoints, notification, voucherId, voucherUsageDuration, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails r5 = (com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails) r5
            java.lang.String r1 = r4.expiryDate
            java.lang.String r3 = r5.expiryDate
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.app.tgtg.model.remote.payment.Price r1 = r4.voucherValue
            com.app.tgtg.model.remote.payment.Price r3 = r5.voucherValue
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.orderCount
            int r3 = r5.orderCount
            if (r1 == r3) goto L29
            return r2
        L29:
            int r1 = r4.maxPoints
            int r3 = r5.maxPoints
            if (r1 == r3) goto L30
            return r2
        L30:
            com.app.tgtg.model.remote.profile.response.LoyaltyCardNotification r1 = r4.notification
            com.app.tgtg.model.remote.profile.response.LoyaltyCardNotification r3 = r5.notification
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L3b
            return r2
        L3b:
            java.lang.String r1 = r4.voucherId
            java.lang.String r3 = r5.voucherId
            if (r1 != 0) goto L47
            if (r3 != 0) goto L45
            r1 = r0
            goto L4e
        L45:
            r1 = r2
            goto L4e
        L47:
            if (r3 != 0) goto L4a
            goto L45
        L4a:
            boolean r1 = com.app.tgtg.model.remote.VoucherId.m302equalsimpl0(r1, r3)
        L4e:
            if (r1 != 0) goto L51
            return r2
        L51:
            int r1 = r4.voucherUsageDuration
            int r5 = r5.voucherUsageDuration
            if (r1 == r5) goto L58
            return r2
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails.equals(java.lang.Object):boolean");
    }

    @NotNull
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final int getMaxPoints() {
        return this.maxPoints;
    }

    @Nullable
    public final LoyaltyCardNotification getNotification() {
        return this.notification;
    }

    public final int getOrderCount() {
        return this.orderCount;
    }

    @Nullable
    /* JADX INFO: renamed from: getVoucherId-sIL_j68, reason: not valid java name */
    public final String m484getVoucherIdsIL_j68() {
        return this.voucherId;
    }

    public final int getVoucherUsageDuration() {
        return this.voucherUsageDuration;
    }

    @NotNull
    public final Price getVoucherValue() {
        return this.voucherValue;
    }

    public int hashCode() {
        int iB = k.b(this.maxPoints, k.b(this.orderCount, (this.voucherValue.hashCode() + (this.expiryDate.hashCode() * 31)) * 31, 31), 31);
        LoyaltyCardNotification loyaltyCardNotification = this.notification;
        int iHashCode = (iB + (loyaltyCardNotification == null ? 0 : loyaltyCardNotification.hashCode())) * 31;
        String str = this.voucherId;
        return Integer.hashCode(this.voucherUsageDuration) + ((iHashCode + (str != null ? VoucherId.m303hashCodeimpl(str) : 0)) * 31);
    }

    @NotNull
    public final String toJson() {
        return c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        String str = this.expiryDate;
        Price price = this.voucherValue;
        int i11 = this.orderCount;
        int i12 = this.maxPoints;
        LoyaltyCardNotification loyaltyCardNotification = this.notification;
        String str2 = this.voucherId;
        String strM304toStringimpl = str2 == null ? Address.ADDRESS_NULL_PLACEHOLDER : VoucherId.m304toStringimpl(str2);
        int i13 = this.voucherUsageDuration;
        StringBuilder sb2 = new StringBuilder("LoyaltyCardDetails(expiryDate=");
        sb2.append(str);
        sb2.append(", voucherValue=");
        sb2.append(price);
        sb2.append(", orderCount=");
        f.C(sb2, i11, ", maxPoints=", i12, ", notification=");
        sb2.append(loyaltyCardNotification);
        sb2.append(", voucherId=");
        sb2.append(strM304toStringimpl);
        sb2.append(", voucherUsageDuration=");
        return k.i(i13, ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.expiryDate);
        this.voucherValue.writeToParcel(dest, flags);
        dest.writeInt(this.orderCount);
        dest.writeInt(this.maxPoints);
        LoyaltyCardNotification loyaltyCardNotification = this.notification;
        if (loyaltyCardNotification == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            loyaltyCardNotification.writeToParcel(dest, flags);
        }
        String str = this.voucherId;
        if (str == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            VoucherId.m305writeToParcelimpl(str, dest, flags);
        }
        dest.writeInt(this.voucherUsageDuration);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails$Companion;", "", "<init>", "()V", "", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;", "fromJson", "(Ljava/lang/String;)Lcom/app/tgtg/model/remote/profile/response/LoyaltyCardDetails;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Ln90/c;", "json", "Ln90/c;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LoyaltyCardDetails fromJson(@NotNull String s7) {
            s7.getClass();
            return (LoyaltyCardDetails) LoyaltyCardDetails.json.b(serializer(), s7);
        }

        @NotNull
        public final KSerializer serializer() {
            return LoyaltyCardDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LoyaltyCardDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoyaltyCardDetails createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            Price priceCreateFromParcel = Price.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            LoyaltyCardNotification loyaltyCardNotificationCreateFromParcel = parcel.readInt() == 0 ? null : LoyaltyCardNotification.CREATOR.createFromParcel(parcel);
            VoucherId voucherIdCreateFromParcel = parcel.readInt() == 0 ? null : VoucherId.CREATOR.createFromParcel(parcel);
            return new LoyaltyCardDetails(string, priceCreateFromParcel, i11, i12, loyaltyCardNotificationCreateFromParcel, voucherIdCreateFromParcel != null ? voucherIdCreateFromParcel.m306unboximpl() : null, parcel.readInt(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoyaltyCardDetails[] newArray(int i11) {
            return new LoyaltyCardDetails[i11];
        }
    }

    @g("expiry_date")
    public static /* synthetic */ void getExpiryDate$annotations() {
    }

    @g("max_points")
    public static /* synthetic */ void getMaxPoints$annotations() {
    }

    @g("notification")
    public static /* synthetic */ void getNotification$annotations() {
    }

    @g("order_count")
    public static /* synthetic */ void getOrderCount$annotations() {
    }

    @g("voucher_id")
    /* JADX INFO: renamed from: getVoucherId-sIL_j68$annotations, reason: not valid java name */
    public static /* synthetic */ void m481getVoucherIdsIL_j68$annotations() {
    }

    @g("voucher_usage_duration_in_days")
    public static /* synthetic */ void getVoucherUsageDuration$annotations() {
    }

    @g("voucher_value")
    public static /* synthetic */ void getVoucherValue$annotations() {
    }

    public /* synthetic */ LoyaltyCardDetails(String str, Price price, int i11, int i12, LoyaltyCardNotification loyaltyCardNotification, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, price, i11, i12, loyaltyCardNotification, str2, i13);
    }

    public /* synthetic */ LoyaltyCardDetails(int i11, String str, Price price, int i12, int i13, LoyaltyCardNotification loyaltyCardNotification, String str2, int i14, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, price, i12, i13, loyaltyCardNotification, str2, i14, m1Var);
    }

    private LoyaltyCardDetails(String str, Price price, int i11, int i12, LoyaltyCardNotification loyaltyCardNotification, String str2, int i13) {
        str.getClass();
        price.getClass();
        this.expiryDate = str;
        this.voucherValue = price;
        this.orderCount = i11;
        this.maxPoints = i12;
        this.notification = loyaltyCardNotification;
        this.voucherId = str2;
        this.voucherUsageDuration = i13;
    }

    public /* synthetic */ LoyaltyCardDetails(String str, Price price, int i11, int i12, LoyaltyCardNotification loyaltyCardNotification, String str2, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, price, i11, i12, loyaltyCardNotification, str2, (i14 & 64) != 0 ? 0 : i13, null);
    }
}
