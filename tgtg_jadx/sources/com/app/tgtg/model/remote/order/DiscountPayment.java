package com.app.tgtg.model.remote.order;

import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.VoucherId$$serializer;
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
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001a¨\u0006/"}, d2 = {"Lcom/app/tgtg/model/remote/order/DiscountPayment;", "", "Lcom/app/tgtg/model/remote/VoucherId;", "discountId", "Lcom/app/tgtg/model/remote/payment/Price;", "amount", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/DiscountPayment;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-VUJ7vw4", "()Ljava/lang/String;", "component1", "component2", "()Lcom/app/tgtg/model/remote/payment/Price;", "copy-qxBp5AU", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/payment/Price;)Lcom/app/tgtg/model/remote/order/DiscountPayment;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDiscountId-VUJ7vw4", "getDiscountId-VUJ7vw4$annotations", "()V", "Lcom/app/tgtg/model/remote/payment/Price;", "getAmount", "getAmount$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class DiscountPayment {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Price amount;

    @NotNull
    private final String discountId;

    private /* synthetic */ DiscountPayment(int i11, String str, Price price, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, DiscountPayment$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.discountId = str;
        this.amount = price;
    }

    /* JADX INFO: renamed from: copy-qxBp5AU$default, reason: not valid java name */
    public static /* synthetic */ DiscountPayment m413copyqxBp5AU$default(DiscountPayment discountPayment, String str, Price price, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = discountPayment.discountId;
        }
        if ((i11 & 2) != 0) {
            price = discountPayment.amount;
        }
        return discountPayment.m416copyqxBp5AU(str, price);
    }

    public static final /* synthetic */ void write$Self$app(DiscountPayment self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, VoucherId$$serializer.INSTANCE, VoucherId.m298boximpl(self.discountId));
        output.i(serialDesc, 1, Price$$serializer.INSTANCE, self.amount);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-VUJ7vw4, reason: not valid java name and from getter */
    public final String getDiscountId() {
        return this.discountId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Price getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-qxBp5AU, reason: not valid java name */
    public final DiscountPayment m416copyqxBp5AU(@NotNull String discountId, @NotNull Price amount) {
        discountId.getClass();
        amount.getClass();
        return new DiscountPayment(discountId, amount, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiscountPayment)) {
            return false;
        }
        DiscountPayment discountPayment = (DiscountPayment) other;
        return VoucherId.m302equalsimpl0(this.discountId, discountPayment.discountId) && Intrinsics.areEqual(this.amount, discountPayment.amount);
    }

    @NotNull
    public final Price getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: getDiscountId-VUJ7vw4, reason: not valid java name */
    public final String m417getDiscountIdVUJ7vw4() {
        return this.discountId;
    }

    public int hashCode() {
        return this.amount.hashCode() + (VoucherId.m303hashCodeimpl(this.discountId) * 31);
    }

    @NotNull
    public String toString() {
        return "DiscountPayment(discountId=" + VoucherId.m304toStringimpl(this.discountId) + ", amount=" + this.amount + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/DiscountPayment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/DiscountPayment;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DiscountPayment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("amount")
    public static /* synthetic */ void getAmount$annotations() {
    }

    @g("user_discount_id")
    /* JADX INFO: renamed from: getDiscountId-VUJ7vw4$annotations, reason: not valid java name */
    public static /* synthetic */ void m414getDiscountIdVUJ7vw4$annotations() {
    }

    public /* synthetic */ DiscountPayment(String str, Price price, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, price);
    }

    public /* synthetic */ DiscountPayment(int i11, String str, Price price, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, price, m1Var);
    }

    private DiscountPayment(String str, Price price) {
        str.getClass();
        price.getClass();
        this.discountId = str;
        this.amount = price;
    }
}
