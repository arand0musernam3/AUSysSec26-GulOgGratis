package com.app.tgtg.model.remote.payment;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.VoucherId$$serializer;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import lu.a;
import m90.c1;
import m90.d;
import m90.f0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBS\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eBi\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010*Jd\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b0\u0010\u001dJ\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010$R.\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010:\u0012\u0004\b<\u00109\u001a\u0004\b;\u0010&R.\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010:\u0012\u0004\b>\u00109\u001a\u0004\b=\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010\u001dR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010*¨\u0006E"}, d2 = {"Lcom/app/tgtg/model/remote/payment/PriceSpecification;", "Landroid/os/Parcelable;", "", "Lcom/app/tgtg/model/remote/payment/SpecificationLine;", "specificationLines", "", "Lcom/app/tgtg/model/remote/VoucherId;", "Lcom/app/tgtg/model/remote/payment/Price;", "voucherWithPriceMap", "discountsWithPriceMap", "", "quantity", "total", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILcom/app/tgtg/model/remote/payment/Price;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/Map;Ljava/util/Map;ILcom/app/tgtg/model/remote/payment/Price;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/PriceSpecification;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "component3", "component4", "component5", "()Lcom/app/tgtg/model/remote/payment/Price;", "copy", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILcom/app/tgtg/model/remote/payment/Price;)Lcom/app/tgtg/model/remote/payment/PriceSpecification;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSpecificationLines", "getSpecificationLines$annotations", "()V", "Ljava/util/Map;", "getVoucherWithPriceMap", "getVoucherWithPriceMap$annotations", "getDiscountsWithPriceMap", "getDiscountsWithPriceMap$annotations", "I", "getQuantity", "Lcom/app/tgtg/model/remote/payment/Price;", "getTotal", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PriceSpecification implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private final Map<VoucherId, Price> discountsWithPriceMap;
    private final int quantity;

    @NotNull
    private final List<SpecificationLine> specificationLines;

    @NotNull
    private final Price total;

    @Nullable
    private final Map<VoucherId, Price> voucherWithPriceMap;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PriceSpecification> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(0)), l.a(mVar, new a(1)), l.a(mVar, new a(2)), null, null};
    }

    public PriceSpecification(int i11, List list, Map map, Map map2, int i12, Price price, m1 m1Var) {
        if (30 != (i11 & 30)) {
            c1.j(i11, 30, PriceSpecification$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.specificationLines = n0.f26529a;
        } else {
            this.specificationLines = list;
        }
        this.voucherWithPriceMap = map;
        this.discountsWithPriceMap = map2;
        this.quantity = i12;
        this.total = price;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(SpecificationLine$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new f0(VoucherId$$serializer.INSTANCE, Price$$serializer.INSTANCE, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new f0(VoucherId$$serializer.INSTANCE, Price$$serializer.INSTANCE, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PriceSpecification copy$default(PriceSpecification priceSpecification, List list, Map map, Map map2, int i11, Price price, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = priceSpecification.specificationLines;
        }
        if ((i12 & 2) != 0) {
            map = priceSpecification.voucherWithPriceMap;
        }
        if ((i12 & 4) != 0) {
            map2 = priceSpecification.discountsWithPriceMap;
        }
        if ((i12 & 8) != 0) {
            i11 = priceSpecification.quantity;
        }
        if ((i12 & 16) != 0) {
            price = priceSpecification.total;
        }
        Price price2 = price;
        Map map3 = map2;
        return priceSpecification.copy(list, map, map3, i11, price2);
    }

    public static final void write$Self$app(PriceSpecification self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.specificationLines, n0.f26529a)) {
            output.i(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.specificationLines);
        }
        output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.voucherWithPriceMap);
        output.r(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.discountsWithPriceMap);
        output.m(3, self.quantity, serialDesc);
        output.i(serialDesc, 4, Price$$serializer.INSTANCE, self.total);
    }

    @NotNull
    public final List<SpecificationLine> component1() {
        return this.specificationLines;
    }

    @Nullable
    public final Map<VoucherId, Price> component2() {
        return this.voucherWithPriceMap;
    }

    @Nullable
    public final Map<VoucherId, Price> component3() {
        return this.discountsWithPriceMap;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Price getTotal() {
        return this.total;
    }

    @NotNull
    public final PriceSpecification copy(@NotNull List<SpecificationLine> specificationLines, @Nullable Map<VoucherId, Price> voucherWithPriceMap, @Nullable Map<VoucherId, Price> discountsWithPriceMap, int quantity, @NotNull Price total) {
        specificationLines.getClass();
        total.getClass();
        return new PriceSpecification(specificationLines, voucherWithPriceMap, discountsWithPriceMap, quantity, total);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceSpecification)) {
            return false;
        }
        PriceSpecification priceSpecification = (PriceSpecification) other;
        return Intrinsics.areEqual(this.specificationLines, priceSpecification.specificationLines) && Intrinsics.areEqual(this.voucherWithPriceMap, priceSpecification.voucherWithPriceMap) && Intrinsics.areEqual(this.discountsWithPriceMap, priceSpecification.discountsWithPriceMap) && this.quantity == priceSpecification.quantity && Intrinsics.areEqual(this.total, priceSpecification.total);
    }

    @Nullable
    public final Map<VoucherId, Price> getDiscountsWithPriceMap() {
        return this.discountsWithPriceMap;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final List<SpecificationLine> getSpecificationLines() {
        return this.specificationLines;
    }

    @NotNull
    public final Price getTotal() {
        return this.total;
    }

    @Nullable
    public final Map<VoucherId, Price> getVoucherWithPriceMap() {
        return this.voucherWithPriceMap;
    }

    public int hashCode() {
        int iHashCode = this.specificationLines.hashCode() * 31;
        Map<VoucherId, Price> map = this.voucherWithPriceMap;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<VoucherId, Price> map2 = this.discountsWithPriceMap;
        return this.total.hashCode() + k.b(this.quantity, (iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "PriceSpecification(specificationLines=" + this.specificationLines + ", voucherWithPriceMap=" + this.voucherWithPriceMap + ", discountsWithPriceMap=" + this.discountsWithPriceMap + ", quantity=" + this.quantity + ", total=" + this.total + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Iterator itR = i.r(this.specificationLines, dest);
        while (itR.hasNext()) {
            ((SpecificationLine) itR.next()).writeToParcel(dest, flags);
        }
        Map<VoucherId, Price> map = this.voucherWithPriceMap;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<VoucherId, Price> entry : map.entrySet()) {
                VoucherId.m305writeToParcelimpl(entry.getKey().m306unboximpl(), dest, flags);
                entry.getValue().writeToParcel(dest, flags);
            }
        }
        Map<VoucherId, Price> map2 = this.discountsWithPriceMap;
        if (map2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map2.size());
            for (Map.Entry<VoucherId, Price> entry2 : map2.entrySet()) {
                VoucherId.m305writeToParcelimpl(entry2.getKey().m306unboximpl(), dest, flags);
                entry2.getValue().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.quantity);
        this.total.writeToParcel(dest, flags);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/PriceSpecification$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/PriceSpecification;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PriceSpecification$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PriceSpecification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceSpecification createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            parcel.getClass();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(SpecificationLine.CREATOR, parcel, arrayList, iC, 1);
            }
            LinkedHashMap linkedHashMap2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashMap.put(VoucherId.CREATOR.createFromParcel(parcel), Price.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap2.put(VoucherId.CREATOR.createFromParcel(parcel), Price.CREATOR.createFromParcel(parcel));
                }
            }
            return new PriceSpecification(arrayList, linkedHashMap, linkedHashMap2, parcel.readInt(), Price.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceSpecification[] newArray(int i11) {
            return new PriceSpecification[i11];
        }
    }

    @g("discounts_applied")
    public static /* synthetic */ void getDiscountsWithPriceMap$annotations() {
    }

    @g("specification_lines")
    public static /* synthetic */ void getSpecificationLines$annotations() {
    }

    @g("voucher_amounts_used")
    public static /* synthetic */ void getVoucherWithPriceMap$annotations() {
    }

    public PriceSpecification(@NotNull List<SpecificationLine> list, @Nullable Map<VoucherId, Price> map, @Nullable Map<VoucherId, Price> map2, int i11, @NotNull Price price) {
        list.getClass();
        price.getClass();
        this.specificationLines = list;
        this.voucherWithPriceMap = map;
        this.discountsWithPriceMap = map2;
        this.quantity = i11;
        this.total = price;
    }

    public PriceSpecification(List list, Map map, Map map2, int i11, Price price, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? n0.f26529a : list, map, map2, i11, price);
    }
}
