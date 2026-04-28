package com.app.tgtg.model.remote.voucher.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.BasicVoucherSerializer;
import com.app.tgtg.model.remote.voucher.VoucherUsageDetails;
import com.app.tgtg.model.remote.voucher.VoucherUsageDetails$$serializer;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import yu.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J*\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001fR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010!¨\u00066"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/response/VoucherDetails;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "voucher", "", "Lcom/app/tgtg/model/remote/voucher/VoucherUsageDetails;", "voucherUsageDetails", "<init>", "(Lcom/app/tgtg/model/remote/voucher/BasicVoucher;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/voucher/BasicVoucher;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/voucher/response/VoucherDetails;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "component2", "()Ljava/util/List;", "copy", "(Lcom/app/tgtg/model/remote/voucher/BasicVoucher;Ljava/util/List;)Lcom/app/tgtg/model/remote/voucher/response/VoucherDetails;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "getVoucher", "getVoucher$annotations", "()V", "Ljava/util/List;", "getVoucherUsageDetails", "getVoucherUsageDetails$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VoucherDetails implements Parcelable {

    @NotNull
    private final BasicVoucher voucher;

    @NotNull
    private final List<VoucherUsageDetails> voucherUsageDetails;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<VoucherDetails> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(1))};

    public /* synthetic */ VoucherDetails(int i11, BasicVoucher basicVoucher, List list, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, VoucherDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.voucher = basicVoucher;
        this.voucherUsageDetails = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(VoucherUsageDetails$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoucherDetails copy$default(VoucherDetails voucherDetails, BasicVoucher basicVoucher, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            basicVoucher = voucherDetails.voucher;
        }
        if ((i11 & 2) != 0) {
            list = voucherDetails.voucherUsageDetails;
        }
        return voucherDetails.copy(basicVoucher, list);
    }

    public static final /* synthetic */ void write$Self$app(VoucherDetails self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, BasicVoucherSerializer.INSTANCE, self.voucher);
        output.i(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.voucherUsageDetails);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BasicVoucher getVoucher() {
        return this.voucher;
    }

    @NotNull
    public final List<VoucherUsageDetails> component2() {
        return this.voucherUsageDetails;
    }

    @NotNull
    public final VoucherDetails copy(@NotNull BasicVoucher voucher, @NotNull List<VoucherUsageDetails> voucherUsageDetails) {
        voucher.getClass();
        voucherUsageDetails.getClass();
        return new VoucherDetails(voucher, voucherUsageDetails);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoucherDetails)) {
            return false;
        }
        VoucherDetails voucherDetails = (VoucherDetails) other;
        return Intrinsics.areEqual(this.voucher, voucherDetails.voucher) && Intrinsics.areEqual(this.voucherUsageDetails, voucherDetails.voucherUsageDetails);
    }

    @NotNull
    public final BasicVoucher getVoucher() {
        return this.voucher;
    }

    @NotNull
    public final List<VoucherUsageDetails> getVoucherUsageDetails() {
        return this.voucherUsageDetails;
    }

    public int hashCode() {
        return this.voucherUsageDetails.hashCode() + (this.voucher.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VoucherDetails(voucher=" + this.voucher + ", voucherUsageDetails=" + this.voucherUsageDetails + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeParcelable(this.voucher, flags);
        Iterator itR = i.r(this.voucherUsageDetails, dest);
        while (itR.hasNext()) {
            ((VoucherUsageDetails) itR.next()).writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/response/VoucherDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/response/VoucherDetails;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VoucherDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VoucherDetails> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherDetails createFromParcel(Parcel parcel) {
            parcel.getClass();
            BasicVoucher basicVoucher = (BasicVoucher) parcel.readParcelable(VoucherDetails.class.getClassLoader());
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(VoucherUsageDetails.CREATOR, parcel, arrayList, iC, 1);
            }
            return new VoucherDetails(basicVoucher, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherDetails[] newArray(int i11) {
            return new VoucherDetails[i11];
        }
    }

    @g("voucher")
    public static /* synthetic */ void getVoucher$annotations() {
    }

    @g("voucher_usage_details")
    public static /* synthetic */ void getVoucherUsageDetails$annotations() {
    }

    public VoucherDetails(@NotNull BasicVoucher basicVoucher, @NotNull List<VoucherUsageDetails> list) {
        basicVoucher.getClass();
        list.getClass();
        this.voucher = basicVoucher;
        this.voucherUsageDetails = list;
    }
}
