package com.app.tgtg.model.remote.manufacturer.response;

import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.VoucherId$$serializer;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import com.app.tgtg.model.remote.payment.SpecificationLine;
import com.app.tgtg.model.remote.payment.SpecificationLine$$serializer;
import e0.f;
import eu.a;
import i90.g;
import i90.h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.f0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JN\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010\u001fR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\b8\u00102\u001a\u0004\b7\u0010!R.\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\b;\u00102\u001a\u0004\b:\u0010#¨\u0006>"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecification;", "", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "deliveryMethod", "Lcom/app/tgtg/model/remote/payment/Price;", "total", "", "Lcom/app/tgtg/model/remote/payment/SpecificationLine;", "specificationLines", "", "Lcom/app/tgtg/model/remote/VoucherId;", "voucherWithPriceMap", "<init>", "(Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;Lcom/app/tgtg/model/remote/payment/Price;Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;Lcom/app/tgtg/model/remote/payment/Price;Ljava/util/List;Ljava/util/Map;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecification;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "component2", "()Lcom/app/tgtg/model/remote/payment/Price;", "component3", "()Ljava/util/List;", "component4", "()Ljava/util/Map;", "copy", "(Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;Lcom/app/tgtg/model/remote/payment/Price;Ljava/util/List;Ljava/util/Map;)Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecification;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/manufacturer/response/DeliveryOptionMethod;", "getDeliveryMethod", "getDeliveryMethod$annotations", "()V", "Lcom/app/tgtg/model/remote/payment/Price;", "getTotal", "getTotal$annotations", "Ljava/util/List;", "getSpecificationLines", "getSpecificationLines$annotations", "Ljava/util/Map;", "getVoucherWithPriceMap", "getVoucherWithPriceMap$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BasketPriceSpecification {

    @NotNull
    private static final j[] $childSerializers;

    @Nullable
    private final DeliveryOptionMethod deliveryMethod;

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

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{null, null, l.a(mVar, new a(15)), l.a(mVar, new a(16))};
    }

    public BasketPriceSpecification(int i11, DeliveryOptionMethod deliveryOptionMethod, Price price, List list, Map map, m1 m1Var) {
        if (11 != (i11 & 11)) {
            c1.j(i11, 11, BasketPriceSpecification$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.deliveryMethod = deliveryOptionMethod;
        this.total = price;
        if ((i11 & 4) == 0) {
            this.specificationLines = n0.f26529a;
        } else {
            this.specificationLines = list;
        }
        this.voucherWithPriceMap = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(SpecificationLine$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new f0(VoucherId$$serializer.INSTANCE, Price$$serializer.INSTANCE, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasketPriceSpecification copy$default(BasketPriceSpecification basketPriceSpecification, DeliveryOptionMethod deliveryOptionMethod, Price price, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            deliveryOptionMethod = basketPriceSpecification.deliveryMethod;
        }
        if ((i11 & 2) != 0) {
            price = basketPriceSpecification.total;
        }
        if ((i11 & 4) != 0) {
            list = basketPriceSpecification.specificationLines;
        }
        if ((i11 & 8) != 0) {
            map = basketPriceSpecification.voucherWithPriceMap;
        }
        return basketPriceSpecification.copy(deliveryOptionMethod, price, list, map);
    }

    public static final void write$Self$app(BasketPriceSpecification self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.r(serialDesc, 0, DeliveryOptionMethodSerializer.INSTANCE, self.deliveryMethod);
        output.i(serialDesc, 1, Price$$serializer.INSTANCE, self.total);
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.specificationLines, n0.f26529a)) {
            output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.specificationLines);
        }
        output.r(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.voucherWithPriceMap);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeliveryOptionMethod getDeliveryMethod() {
        return this.deliveryMethod;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Price getTotal() {
        return this.total;
    }

    @NotNull
    public final List<SpecificationLine> component3() {
        return this.specificationLines;
    }

    @Nullable
    public final Map<VoucherId, Price> component4() {
        return this.voucherWithPriceMap;
    }

    @NotNull
    public final BasketPriceSpecification copy(@Nullable DeliveryOptionMethod deliveryMethod, @NotNull Price total, @NotNull List<SpecificationLine> specificationLines, @Nullable Map<VoucherId, Price> voucherWithPriceMap) {
        total.getClass();
        specificationLines.getClass();
        return new BasketPriceSpecification(deliveryMethod, total, specificationLines, voucherWithPriceMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketPriceSpecification)) {
            return false;
        }
        BasketPriceSpecification basketPriceSpecification = (BasketPriceSpecification) other;
        return this.deliveryMethod == basketPriceSpecification.deliveryMethod && Intrinsics.areEqual(this.total, basketPriceSpecification.total) && Intrinsics.areEqual(this.specificationLines, basketPriceSpecification.specificationLines) && Intrinsics.areEqual(this.voucherWithPriceMap, basketPriceSpecification.voucherWithPriceMap);
    }

    @Nullable
    public final DeliveryOptionMethod getDeliveryMethod() {
        return this.deliveryMethod;
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
        DeliveryOptionMethod deliveryOptionMethod = this.deliveryMethod;
        int iC = f.c(this.specificationLines, (this.total.hashCode() + ((deliveryOptionMethod == null ? 0 : deliveryOptionMethod.hashCode()) * 31)) * 31, 31);
        Map<VoucherId, Price> map = this.voucherWithPriceMap;
        return iC + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BasketPriceSpecification(deliveryMethod=" + this.deliveryMethod + ", total=" + this.total + ", specificationLines=" + this.specificationLines + ", voucherWithPriceMap=" + this.voucherWithPriceMap + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecification$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecification;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketPriceSpecification$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("delivery_method")
    public static /* synthetic */ void getDeliveryMethod$annotations() {
    }

    @g("specification_lines")
    public static /* synthetic */ void getSpecificationLines$annotations() {
    }

    @g("total")
    public static /* synthetic */ void getTotal$annotations() {
    }

    @g("voucher_amounts_used")
    public static /* synthetic */ void getVoucherWithPriceMap$annotations() {
    }

    public BasketPriceSpecification(@Nullable DeliveryOptionMethod deliveryOptionMethod, @NotNull Price price, @NotNull List<SpecificationLine> list, @Nullable Map<VoucherId, Price> map) {
        price.getClass();
        list.getClass();
        this.deliveryMethod = deliveryOptionMethod;
        this.total = price;
        this.specificationLines = list;
        this.voucherWithPriceMap = map;
    }

    public BasketPriceSpecification(DeliveryOptionMethod deliveryOptionMethod, Price price, List list, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(deliveryOptionMethod, price, (i11 & 4) != 0 ? n0.f26529a : list, map);
    }
}
