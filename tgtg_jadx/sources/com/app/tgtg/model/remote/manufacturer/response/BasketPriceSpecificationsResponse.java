package com.app.tgtg.model.remote.manufacturer.response;

import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import eu.a;
import i90.g;
import i90.h;
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

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001aR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u001e¨\u00066"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationsResponse;", "", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationState;", "state", "", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecification;", "prices", "Lcom/app/tgtg/model/remote/payment/Price;", "totalVoucherAmountAvailable", "<init>", "(Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationState;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/Price;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationState;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/Price;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationsResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationState;", "component2", "()Ljava/util/List;", "component3", "()Lcom/app/tgtg/model/remote/payment/Price;", "copy", "(Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationState;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/Price;)Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationState;", "getState", "getState$annotations", "()V", "Ljava/util/List;", "getPrices", "getPrices$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getTotalVoucherAmountAvailable", "getTotalVoucherAmountAvailable$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BasketPriceSpecificationsResponse {

    @Nullable
    private final List<BasketPriceSpecification> prices;

    @Nullable
    private final BasketPriceSpecificationState state;

    @Nullable
    private final Price totalVoucherAmountAvailable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final j[] $childSerializers = {null, l.a(m.PUBLICATION, new a(17)), null};

    public /* synthetic */ BasketPriceSpecificationsResponse(int i11, BasketPriceSpecificationState basketPriceSpecificationState, List list, Price price, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, BasketPriceSpecificationsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.state = basketPriceSpecificationState;
        this.prices = list;
        this.totalVoucherAmountAvailable = price;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BasketPriceSpecification$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasketPriceSpecificationsResponse copy$default(BasketPriceSpecificationsResponse basketPriceSpecificationsResponse, BasketPriceSpecificationState basketPriceSpecificationState, List list, Price price, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            basketPriceSpecificationState = basketPriceSpecificationsResponse.state;
        }
        if ((i11 & 2) != 0) {
            list = basketPriceSpecificationsResponse.prices;
        }
        if ((i11 & 4) != 0) {
            price = basketPriceSpecificationsResponse.totalVoucherAmountAvailable;
        }
        return basketPriceSpecificationsResponse.copy(basketPriceSpecificationState, list, price);
    }

    public static final /* synthetic */ void write$Self$app(BasketPriceSpecificationsResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.r(serialDesc, 0, BasketPriceSpecificationStateSerializer.INSTANCE, self.state);
        output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.prices);
        output.r(serialDesc, 2, Price$$serializer.INSTANCE, self.totalVoucherAmountAvailable);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BasketPriceSpecificationState getState() {
        return this.state;
    }

    @Nullable
    public final List<BasketPriceSpecification> component2() {
        return this.prices;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Price getTotalVoucherAmountAvailable() {
        return this.totalVoucherAmountAvailable;
    }

    @NotNull
    public final BasketPriceSpecificationsResponse copy(@Nullable BasketPriceSpecificationState state, @Nullable List<BasketPriceSpecification> prices, @Nullable Price totalVoucherAmountAvailable) {
        return new BasketPriceSpecificationsResponse(state, prices, totalVoucherAmountAvailable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketPriceSpecificationsResponse)) {
            return false;
        }
        BasketPriceSpecificationsResponse basketPriceSpecificationsResponse = (BasketPriceSpecificationsResponse) other;
        return this.state == basketPriceSpecificationsResponse.state && Intrinsics.areEqual(this.prices, basketPriceSpecificationsResponse.prices) && Intrinsics.areEqual(this.totalVoucherAmountAvailable, basketPriceSpecificationsResponse.totalVoucherAmountAvailable);
    }

    @Nullable
    public final List<BasketPriceSpecification> getPrices() {
        return this.prices;
    }

    @Nullable
    public final BasketPriceSpecificationState getState() {
        return this.state;
    }

    @Nullable
    public final Price getTotalVoucherAmountAvailable() {
        return this.totalVoucherAmountAvailable;
    }

    public int hashCode() {
        BasketPriceSpecificationState basketPriceSpecificationState = this.state;
        int iHashCode = (basketPriceSpecificationState == null ? 0 : basketPriceSpecificationState.hashCode()) * 31;
        List<BasketPriceSpecification> list = this.prices;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Price price = this.totalVoucherAmountAvailable;
        return iHashCode2 + (price != null ? price.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BasketPriceSpecificationsResponse(state=" + this.state + ", prices=" + this.prices + ", totalVoucherAmountAvailable=" + this.totalVoucherAmountAvailable + ")";
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/BasketPriceSpecificationsResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketPriceSpecificationsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @g("prices")
    public static /* synthetic */ void getPrices$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @g("total_voucher_amount_available")
    public static /* synthetic */ void getTotalVoucherAmountAvailable$annotations() {
    }

    public BasketPriceSpecificationsResponse(@Nullable BasketPriceSpecificationState basketPriceSpecificationState, @Nullable List<BasketPriceSpecification> list, @Nullable Price price) {
        this.state = basketPriceSpecificationState;
        this.prices = list;
        this.totalVoucherAmountAvailable = price;
    }
}
