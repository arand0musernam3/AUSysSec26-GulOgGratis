package com.app.tgtg.model.remote.payment;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.VoucherId$$serializer;
import e0.f;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jq.a;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLB_\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\"\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&Jl\u0010'\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b,\u0010\u0016J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J'\u00109\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b7\u00108R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010:\u0012\u0004\b<\u0010=\u001a\u0004\b;\u0010\u001eR&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010:\u0012\u0004\b?\u0010=\u001a\u0004\b>\u0010\u001eR2\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010@\u0012\u0004\bB\u0010=\u001a\u0004\bA\u0010!R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010C\u0012\u0004\bE\u0010=\u001a\u0004\bD\u0010#R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010F\u0012\u0004\bH\u0010=\u001a\u0004\bG\u0010\u0016R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010I\u0012\u0004\bK\u0010=\u001a\u0004\bJ\u0010&¨\u0006N"}, d2 = {"Lcom/app/tgtg/model/remote/payment/ExtendedPriceSpecification;", "Landroid/os/Parcelable;", "", "Lcom/app/tgtg/model/remote/payment/PriceSpecification;", "priceSpecificationsNoVoucher", "priceSpecificationsVoucher", "", "Lcom/app/tgtg/model/remote/VoucherId;", "priceSpecificationsDiscount", "Lcom/app/tgtg/model/remote/payment/Price;", "totalVoucherAmountAvailable", "", "maxItemQuantityCount", "Lcom/app/tgtg/model/remote/payment/CreatePriceSpecState;", "state", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/app/tgtg/model/remote/payment/Price;ILcom/app/tgtg/model/remote/payment/CreatePriceSpecState;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/app/tgtg/model/remote/payment/Price;ILcom/app/tgtg/model/remote/payment/CreatePriceSpecState;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/util/Map;", "component4", "()Lcom/app/tgtg/model/remote/payment/Price;", "component5", "component6", "()Lcom/app/tgtg/model/remote/payment/CreatePriceSpecState;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lcom/app/tgtg/model/remote/payment/Price;ILcom/app/tgtg/model/remote/payment/CreatePriceSpecState;)Lcom/app/tgtg/model/remote/payment/ExtendedPriceSpecification;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/ExtendedPriceSpecification;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPriceSpecificationsNoVoucher", "getPriceSpecificationsNoVoucher$annotations", "()V", "getPriceSpecificationsVoucher", "getPriceSpecificationsVoucher$annotations", "Ljava/util/Map;", "getPriceSpecificationsDiscount", "getPriceSpecificationsDiscount$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getTotalVoucherAmountAvailable", "getTotalVoucherAmountAvailable$annotations", "I", "getMaxItemQuantityCount", "getMaxItemQuantityCount$annotations", "Lcom/app/tgtg/model/remote/payment/CreatePriceSpecState;", "getState", "getState$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ExtendedPriceSpecification implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;
    private final int maxItemQuantityCount;

    @NotNull
    private final Map<VoucherId, List<PriceSpecification>> priceSpecificationsDiscount;

    @NotNull
    private final List<PriceSpecification> priceSpecificationsNoVoucher;

    @NotNull
    private final List<PriceSpecification> priceSpecificationsVoucher;

    @Nullable
    private final CreatePriceSpecState state;

    @NotNull
    private final Price totalVoucherAmountAvailable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ExtendedPriceSpecification> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new a(25)), l.a(mVar, new a(26)), l.a(mVar, new a(27)), null, null, null};
    }

    public ExtendedPriceSpecification(int i11, List list, List list2, Map map, Price price, int i12, CreatePriceSpecState createPriceSpecState, m1 m1Var) {
        if (24 != (i11 & 24)) {
            c1.j(i11, 24, ExtendedPriceSpecification$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.priceSpecificationsNoVoucher = (i11 & 1) == 0 ? n0.f26529a : list;
        if ((i11 & 2) == 0) {
            this.priceSpecificationsVoucher = n0.f26529a;
        } else {
            this.priceSpecificationsVoucher = list2;
        }
        if ((i11 & 4) == 0) {
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            this.priceSpecificationsDiscount = o0Var;
        } else {
            this.priceSpecificationsDiscount = map;
        }
        this.totalVoucherAmountAvailable = price;
        this.maxItemQuantityCount = i12;
        if ((i11 & 32) == 0) {
            this.state = null;
        } else {
            this.state = createPriceSpecState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(PriceSpecification$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(PriceSpecification$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new f0(VoucherId$$serializer.INSTANCE, new d(PriceSpecification$$serializer.INSTANCE, 0), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtendedPriceSpecification copy$default(ExtendedPriceSpecification extendedPriceSpecification, List list, List list2, Map map, Price price, int i11, CreatePriceSpecState createPriceSpecState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = extendedPriceSpecification.priceSpecificationsNoVoucher;
        }
        if ((i12 & 2) != 0) {
            list2 = extendedPriceSpecification.priceSpecificationsVoucher;
        }
        if ((i12 & 4) != 0) {
            map = extendedPriceSpecification.priceSpecificationsDiscount;
        }
        if ((i12 & 8) != 0) {
            price = extendedPriceSpecification.totalVoucherAmountAvailable;
        }
        if ((i12 & 16) != 0) {
            i11 = extendedPriceSpecification.maxItemQuantityCount;
        }
        if ((i12 & 32) != 0) {
            createPriceSpecState = extendedPriceSpecification.state;
        }
        int i13 = i11;
        CreatePriceSpecState createPriceSpecState2 = createPriceSpecState;
        return extendedPriceSpecification.copy(list, list2, map, price, i13, createPriceSpecState2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void write$Self$app(com.app.tgtg.model.remote.payment.ExtendedPriceSpecification r4, l90.b r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            u70.j[] r0 = com.app.tgtg.model.remote.payment.ExtendedPriceSpecification.$childSerializers
            boolean r1 = r5.C(r6)
            if (r1 == 0) goto L9
            goto L13
        L9:
            java.util.List<com.app.tgtg.model.remote.payment.PriceSpecification> r1 = r4.priceSpecificationsNoVoucher
            kotlin.collections.n0 r2 = kotlin.collections.n0.f26529a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L21
        L13:
            r1 = 0
            r2 = r0[r1]
            java.lang.Object r2 = r2.getValue()
            kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2
            java.util.List<com.app.tgtg.model.remote.payment.PriceSpecification> r3 = r4.priceSpecificationsNoVoucher
            r5.i(r6, r1, r2, r3)
        L21:
            boolean r1 = r5.C(r6)
            if (r1 == 0) goto L28
            goto L32
        L28:
            java.util.List<com.app.tgtg.model.remote.payment.PriceSpecification> r1 = r4.priceSpecificationsVoucher
            kotlin.collections.n0 r2 = kotlin.collections.n0.f26529a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L40
        L32:
            r1 = 1
            r2 = r0[r1]
            java.lang.Object r2 = r2.getValue()
            kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2
            java.util.List<com.app.tgtg.model.remote.payment.PriceSpecification> r3 = r4.priceSpecificationsVoucher
            r5.i(r6, r1, r2, r3)
        L40:
            boolean r1 = r5.C(r6)
            if (r1 == 0) goto L47
            goto L54
        L47:
            java.util.Map<com.app.tgtg.model.remote.VoucherId, java.util.List<com.app.tgtg.model.remote.payment.PriceSpecification>> r1 = r4.priceSpecificationsDiscount
            kotlin.collections.o0 r2 = kotlin.collections.o0.f26530a
            r2.getClass()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L62
        L54:
            r1 = 2
            r0 = r0[r1]
            java.lang.Object r0 = r0.getValue()
            kotlinx.serialization.KSerializer r0 = (kotlinx.serialization.KSerializer) r0
            java.util.Map<com.app.tgtg.model.remote.VoucherId, java.util.List<com.app.tgtg.model.remote.payment.PriceSpecification>> r2 = r4.priceSpecificationsDiscount
            r5.i(r6, r1, r0, r2)
        L62:
            com.app.tgtg.model.remote.payment.Price$$serializer r0 = com.app.tgtg.model.remote.payment.Price$$serializer.INSTANCE
            com.app.tgtg.model.remote.payment.Price r1 = r4.totalVoucherAmountAvailable
            r2 = 3
            r5.i(r6, r2, r0, r1)
            r0 = 4
            int r1 = r4.maxItemQuantityCount
            r5.m(r0, r1, r6)
            boolean r0 = r5.C(r6)
            if (r0 == 0) goto L77
            goto L7b
        L77:
            com.app.tgtg.model.remote.payment.CreatePriceSpecState r0 = r4.state
            if (r0 == 0) goto L83
        L7b:
            com.app.tgtg.model.remote.payment.CreatePriceSpecStateSerializer r0 = com.app.tgtg.model.remote.payment.CreatePriceSpecStateSerializer.INSTANCE
            com.app.tgtg.model.remote.payment.CreatePriceSpecState r4 = r4.state
            r1 = 5
            r5.r(r6, r1, r0, r4)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.remote.payment.ExtendedPriceSpecification.write$Self$app(com.app.tgtg.model.remote.payment.ExtendedPriceSpecification, l90.b, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    @NotNull
    public final List<PriceSpecification> component1() {
        return this.priceSpecificationsNoVoucher;
    }

    @NotNull
    public final List<PriceSpecification> component2() {
        return this.priceSpecificationsVoucher;
    }

    @NotNull
    public final Map<VoucherId, List<PriceSpecification>> component3() {
        return this.priceSpecificationsDiscount;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Price getTotalVoucherAmountAvailable() {
        return this.totalVoucherAmountAvailable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxItemQuantityCount() {
        return this.maxItemQuantityCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CreatePriceSpecState getState() {
        return this.state;
    }

    @NotNull
    public final ExtendedPriceSpecification copy(@NotNull List<PriceSpecification> priceSpecificationsNoVoucher, @NotNull List<PriceSpecification> priceSpecificationsVoucher, @NotNull Map<VoucherId, ? extends List<PriceSpecification>> priceSpecificationsDiscount, @NotNull Price totalVoucherAmountAvailable, int maxItemQuantityCount, @Nullable CreatePriceSpecState state) {
        priceSpecificationsNoVoucher.getClass();
        priceSpecificationsVoucher.getClass();
        priceSpecificationsDiscount.getClass();
        totalVoucherAmountAvailable.getClass();
        return new ExtendedPriceSpecification(priceSpecificationsNoVoucher, priceSpecificationsVoucher, priceSpecificationsDiscount, totalVoucherAmountAvailable, maxItemQuantityCount, state);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedPriceSpecification)) {
            return false;
        }
        ExtendedPriceSpecification extendedPriceSpecification = (ExtendedPriceSpecification) other;
        return Intrinsics.areEqual(this.priceSpecificationsNoVoucher, extendedPriceSpecification.priceSpecificationsNoVoucher) && Intrinsics.areEqual(this.priceSpecificationsVoucher, extendedPriceSpecification.priceSpecificationsVoucher) && Intrinsics.areEqual(this.priceSpecificationsDiscount, extendedPriceSpecification.priceSpecificationsDiscount) && Intrinsics.areEqual(this.totalVoucherAmountAvailable, extendedPriceSpecification.totalVoucherAmountAvailable) && this.maxItemQuantityCount == extendedPriceSpecification.maxItemQuantityCount && this.state == extendedPriceSpecification.state;
    }

    public final int getMaxItemQuantityCount() {
        return this.maxItemQuantityCount;
    }

    @NotNull
    public final Map<VoucherId, List<PriceSpecification>> getPriceSpecificationsDiscount() {
        return this.priceSpecificationsDiscount;
    }

    @NotNull
    public final List<PriceSpecification> getPriceSpecificationsNoVoucher() {
        return this.priceSpecificationsNoVoucher;
    }

    @NotNull
    public final List<PriceSpecification> getPriceSpecificationsVoucher() {
        return this.priceSpecificationsVoucher;
    }

    @Nullable
    public final CreatePriceSpecState getState() {
        return this.state;
    }

    @NotNull
    public final Price getTotalVoucherAmountAvailable() {
        return this.totalVoucherAmountAvailable;
    }

    public int hashCode() {
        int iB = k.b(this.maxItemQuantityCount, (this.totalVoucherAmountAvailable.hashCode() + a0.f(this.priceSpecificationsDiscount, f.c(this.priceSpecificationsVoucher, this.priceSpecificationsNoVoucher.hashCode() * 31, 31), 31)) * 31, 31);
        CreatePriceSpecState createPriceSpecState = this.state;
        return iB + (createPriceSpecState == null ? 0 : createPriceSpecState.hashCode());
    }

    @NotNull
    public String toString() {
        return "ExtendedPriceSpecification(priceSpecificationsNoVoucher=" + this.priceSpecificationsNoVoucher + ", priceSpecificationsVoucher=" + this.priceSpecificationsVoucher + ", priceSpecificationsDiscount=" + this.priceSpecificationsDiscount + ", totalVoucherAmountAvailable=" + this.totalVoucherAmountAvailable + ", maxItemQuantityCount=" + this.maxItemQuantityCount + ", state=" + this.state + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Iterator itR = i.r(this.priceSpecificationsNoVoucher, dest);
        while (itR.hasNext()) {
            ((PriceSpecification) itR.next()).writeToParcel(dest, flags);
        }
        Iterator itR2 = i.r(this.priceSpecificationsVoucher, dest);
        while (itR2.hasNext()) {
            ((PriceSpecification) itR2.next()).writeToParcel(dest, flags);
        }
        Map<VoucherId, List<PriceSpecification>> map = this.priceSpecificationsDiscount;
        dest.writeInt(map.size());
        for (Map.Entry<VoucherId, List<PriceSpecification>> entry : map.entrySet()) {
            VoucherId.m305writeToParcelimpl(entry.getKey().m306unboximpl(), dest, flags);
            Iterator itR3 = i.r(entry.getValue(), dest);
            while (itR3.hasNext()) {
                ((PriceSpecification) itR3.next()).writeToParcel(dest, flags);
            }
        }
        this.totalVoucherAmountAvailable.writeToParcel(dest, flags);
        dest.writeInt(this.maxItemQuantityCount);
        CreatePriceSpecState createPriceSpecState = this.state;
        if (createPriceSpecState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(createPriceSpecState.name());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/ExtendedPriceSpecification$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/ExtendedPriceSpecification;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ExtendedPriceSpecification$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedPriceSpecification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExtendedPriceSpecification createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int iC = 0;
            while (iC != i11) {
                iC = i.c(PriceSpecification.CREATOR, parcel, arrayList, iC, 1);
            }
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = i.c(PriceSpecification.CREATOR, parcel, arrayList2, iC2, 1);
            }
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                VoucherId voucherIdCreateFromParcel = VoucherId.CREATOR.createFromParcel(parcel);
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                int iC3 = 0;
                while (iC3 != i15) {
                    iC3 = i.c(PriceSpecification.CREATOR, parcel, arrayList3, iC3, 1);
                }
                linkedHashMap.put(voucherIdCreateFromParcel, arrayList3);
            }
            return new ExtendedPriceSpecification(arrayList, arrayList2, linkedHashMap, Price.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : CreatePriceSpecState.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExtendedPriceSpecification[] newArray(int i11) {
            return new ExtendedPriceSpecification[i11];
        }
    }

    @g("max_item_quantity_count")
    public static /* synthetic */ void getMaxItemQuantityCount$annotations() {
    }

    @g("item_price_specifications_using_user_discount")
    public static /* synthetic */ void getPriceSpecificationsDiscount$annotations() {
    }

    @g("item_price_specifications_not_using_voucher_amount")
    public static /* synthetic */ void getPriceSpecificationsNoVoucher$annotations() {
    }

    @g("item_price_specifications_using_voucher_amount")
    public static /* synthetic */ void getPriceSpecificationsVoucher$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @g("total_voucher_amount_available")
    public static /* synthetic */ void getTotalVoucherAmountAvailable$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedPriceSpecification(@NotNull List<PriceSpecification> list, @NotNull List<PriceSpecification> list2, @NotNull Map<VoucherId, ? extends List<PriceSpecification>> map, @NotNull Price price, int i11, @Nullable CreatePriceSpecState createPriceSpecState) {
        list.getClass();
        list2.getClass();
        map.getClass();
        price.getClass();
        this.priceSpecificationsNoVoucher = list;
        this.priceSpecificationsVoucher = list2;
        this.priceSpecificationsDiscount = map;
        this.totalVoucherAmountAvailable = price;
        this.maxItemQuantityCount = i11;
        this.state = createPriceSpecState;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedPriceSpecification(List list, List list2, Map map, Price price, int i11, CreatePriceSpecState createPriceSpecState, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        list = (i12 & 1) != 0 ? n0.f26529a : list;
        list2 = (i12 & 2) != 0 ? n0.f26529a : list2;
        if ((i12 & 4) != 0) {
            map = o0.f26530a;
            map.getClass();
        }
        this(list, list2, map, price, i11, (i12 & 32) != 0 ? null : createPriceSpecState);
    }
}
