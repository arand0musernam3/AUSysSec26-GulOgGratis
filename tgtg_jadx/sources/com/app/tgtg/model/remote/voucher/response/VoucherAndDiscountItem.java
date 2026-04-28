package com.app.tgtg.model.remote.voucher.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.BasicVoucherSerializer;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010 ¨\u00063"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/response/VoucherAndDiscountItem;", "Landroid/os/Parcelable;", "", "type", "Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "value", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/BasicVoucher;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/voucher/BasicVoucher;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/voucher/response/VoucherAndDiscountItem;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "copy", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/voucher/BasicVoucher;)Lcom/app/tgtg/model/remote/voucher/response/VoucherAndDiscountItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "Lcom/app/tgtg/model/remote/voucher/BasicVoucher;", "getValue", "getValue$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class VoucherAndDiscountItem implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    private final String type;

    @NotNull
    private final BasicVoucher value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<VoucherAndDiscountItem> CREATOR = new Creator();

    public /* synthetic */ VoucherAndDiscountItem(int i11, String str, BasicVoucher basicVoucher, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, VoucherAndDiscountItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = str;
        this.value = basicVoucher;
    }

    public static /* synthetic */ VoucherAndDiscountItem copy$default(VoucherAndDiscountItem voucherAndDiscountItem, String str, BasicVoucher basicVoucher, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = voucherAndDiscountItem.type;
        }
        if ((i11 & 2) != 0) {
            basicVoucher = voucherAndDiscountItem.value;
        }
        return voucherAndDiscountItem.copy(str, basicVoucher);
    }

    public static final /* synthetic */ void write$Self$app(VoucherAndDiscountItem self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.type);
        output.i(serialDesc, 1, BasicVoucherSerializer.INSTANCE, self.value);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BasicVoucher getValue() {
        return this.value;
    }

    @NotNull
    public final VoucherAndDiscountItem copy(@NotNull String type, @NotNull BasicVoucher value) {
        type.getClass();
        value.getClass();
        return new VoucherAndDiscountItem(type, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoucherAndDiscountItem)) {
            return false;
        }
        VoucherAndDiscountItem voucherAndDiscountItem = (VoucherAndDiscountItem) other;
        return Intrinsics.areEqual(this.type, voucherAndDiscountItem.type) && Intrinsics.areEqual(this.value, voucherAndDiscountItem.value);
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final BasicVoucher getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "VoucherAndDiscountItem(type=" + this.type + ", value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.type);
        dest.writeParcelable(this.value, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/voucher/response/VoucherAndDiscountItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/voucher/response/VoucherAndDiscountItem;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VoucherAndDiscountItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VoucherAndDiscountItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherAndDiscountItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new VoucherAndDiscountItem(parcel.readString(), (BasicVoucher) parcel.readParcelable(VoucherAndDiscountItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherAndDiscountItem[] newArray(int i11) {
            return new VoucherAndDiscountItem[i11];
        }
    }

    @g("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @g("value")
    public static /* synthetic */ void getValue$annotations() {
    }

    public VoucherAndDiscountItem(@NotNull String str, @NotNull BasicVoucher basicVoucher) {
        str.getClass();
        basicVoucher.getClass();
        this.type = str;
        this.value = basicVoucher;
    }
}
