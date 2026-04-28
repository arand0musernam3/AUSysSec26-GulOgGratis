package com.app.tgtg.model.remote.payment.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentMethods$$serializer;
import com.app.tgtg.model.remote.payment.VoucherPaymentInformation;
import com.app.tgtg.model.remote.payment.VoucherPaymentInformation$$serializer;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher$$serializer;
import e0.f;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import n90.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBO\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\\\u0010$\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010\u0015J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00106\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b4\u00105R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u001dR0\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u00107\u0012\u0004\b>\u0010:\u001a\u0004\b;\u0010\u001d\"\u0004\b<\u0010=R*\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010?\u0012\u0004\bC\u0010:\u001a\u0004\b@\u0010 \"\u0004\bA\u0010BR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\bE\u0010:\u001a\u0004\bD\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010F\u0012\u0004\bH\u0010:\u001a\u0004\bG\u0010#¨\u0006K"}, d2 = {"Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsResponse;", "Landroid/os/Parcelable;", "", "Lcom/app/tgtg/model/remote/payment/response/ProviderResponse;", "providerResponse", "Lcom/app/tgtg/model/remote/payment/PaymentMethods;", "paymentMethods", "Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsState;", "state", "Lcom/app/tgtg/model/remote/voucher/DiscountVoucher;", "availableDiscounts", "Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;", "voucherPaymentInformation", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsState;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsState;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsState;", "component4", "component5", "()Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsState;Ljava/util/List;Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;)Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getProviderResponse", "getProviderResponse$annotations", "()V", "getPaymentMethods", "setPaymentMethods", "(Ljava/util/List;)V", "getPaymentMethods$annotations", "Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsState;", "getState", "setState", "(Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsState;)V", "getState$annotations", "getAvailableDiscounts", "getAvailableDiscounts$annotations", "Lcom/app/tgtg/model/remote/payment/VoucherPaymentInformation;", "getVoucherPaymentInformation", "getVoucherPaymentInformation$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class PaymentMethodsResponse implements Parcelable {

    @NotNull
    private static final j[] $childSerializers;

    @NotNull
    private final List<DiscountVoucher> availableDiscounts;

    @Nullable
    private List<PaymentMethods> paymentMethods;

    @Nullable
    private final List<ProviderResponse> providerResponse;

    @Nullable
    private PaymentMethodsState state;

    @Nullable
    private final VoucherPaymentInformation voucherPaymentInformation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<PaymentMethodsResponse> CREATOR = new Creator();

    static {
        m mVar = m.PUBLICATION;
        $childSerializers = new j[]{l.a(mVar, new p(6)), l.a(mVar, new p(7)), null, l.a(mVar, new p(8)), null};
    }

    public PaymentMethodsResponse(int i11, List list, List list2, PaymentMethodsState paymentMethodsState, List list3, VoucherPaymentInformation voucherPaymentInformation, m1 m1Var) {
        if (20 != (i11 & 20)) {
            c1.j(i11, 20, PaymentMethodsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i11 & 1) == 0) {
            this.providerResponse = null;
        } else {
            this.providerResponse = list;
        }
        if ((i11 & 2) == 0) {
            this.paymentMethods = null;
        } else {
            this.paymentMethods = list2;
        }
        this.state = paymentMethodsState;
        if ((i11 & 8) == 0) {
            this.availableDiscounts = n0.f26529a;
        } else {
            this.availableDiscounts = list3;
        }
        this.voucherPaymentInformation = voucherPaymentInformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ProviderResponse$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new d(PaymentMethods$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new d(DiscountVoucher$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodsResponse copy$default(PaymentMethodsResponse paymentMethodsResponse, List list, List list2, PaymentMethodsState paymentMethodsState, List list3, VoucherPaymentInformation voucherPaymentInformation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = paymentMethodsResponse.providerResponse;
        }
        if ((i11 & 2) != 0) {
            list2 = paymentMethodsResponse.paymentMethods;
        }
        if ((i11 & 4) != 0) {
            paymentMethodsState = paymentMethodsResponse.state;
        }
        if ((i11 & 8) != 0) {
            list3 = paymentMethodsResponse.availableDiscounts;
        }
        if ((i11 & 16) != 0) {
            voucherPaymentInformation = paymentMethodsResponse.voucherPaymentInformation;
        }
        VoucherPaymentInformation voucherPaymentInformation2 = voucherPaymentInformation;
        PaymentMethodsState paymentMethodsState2 = paymentMethodsState;
        return paymentMethodsResponse.copy(list, list2, paymentMethodsState2, list3, voucherPaymentInformation2);
    }

    public static final void write$Self$app(PaymentMethodsResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        if (output.C(serialDesc) || self.providerResponse != null) {
            output.r(serialDesc, 0, (KSerializer) jVarArr[0].getValue(), self.providerResponse);
        }
        if (output.C(serialDesc) || self.paymentMethods != null) {
            output.r(serialDesc, 1, (KSerializer) jVarArr[1].getValue(), self.paymentMethods);
        }
        output.r(serialDesc, 2, PaymentMethodsStateSerializer.INSTANCE, self.state);
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.availableDiscounts, n0.f26529a)) {
            output.i(serialDesc, 3, (KSerializer) jVarArr[3].getValue(), self.availableDiscounts);
        }
        output.r(serialDesc, 4, VoucherPaymentInformation$$serializer.INSTANCE, self.voucherPaymentInformation);
    }

    @Nullable
    public final List<ProviderResponse> component1() {
        return this.providerResponse;
    }

    @Nullable
    public final List<PaymentMethods> component2() {
        return this.paymentMethods;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaymentMethodsState getState() {
        return this.state;
    }

    @NotNull
    public final List<DiscountVoucher> component4() {
        return this.availableDiscounts;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final VoucherPaymentInformation getVoucherPaymentInformation() {
        return this.voucherPaymentInformation;
    }

    @NotNull
    public final PaymentMethodsResponse copy(@Nullable List<ProviderResponse> providerResponse, @Nullable List<PaymentMethods> paymentMethods, @Nullable PaymentMethodsState state, @NotNull List<DiscountVoucher> availableDiscounts, @Nullable VoucherPaymentInformation voucherPaymentInformation) {
        availableDiscounts.getClass();
        return new PaymentMethodsResponse(providerResponse, paymentMethods, state, availableDiscounts, voucherPaymentInformation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodsResponse)) {
            return false;
        }
        PaymentMethodsResponse paymentMethodsResponse = (PaymentMethodsResponse) other;
        return Intrinsics.areEqual(this.providerResponse, paymentMethodsResponse.providerResponse) && Intrinsics.areEqual(this.paymentMethods, paymentMethodsResponse.paymentMethods) && this.state == paymentMethodsResponse.state && Intrinsics.areEqual(this.availableDiscounts, paymentMethodsResponse.availableDiscounts) && Intrinsics.areEqual(this.voucherPaymentInformation, paymentMethodsResponse.voucherPaymentInformation);
    }

    @NotNull
    public final List<DiscountVoucher> getAvailableDiscounts() {
        return this.availableDiscounts;
    }

    @Nullable
    public final List<PaymentMethods> getPaymentMethods() {
        return this.paymentMethods;
    }

    @Nullable
    public final List<ProviderResponse> getProviderResponse() {
        return this.providerResponse;
    }

    @Nullable
    public final PaymentMethodsState getState() {
        return this.state;
    }

    @Nullable
    public final VoucherPaymentInformation getVoucherPaymentInformation() {
        return this.voucherPaymentInformation;
    }

    public int hashCode() {
        List<ProviderResponse> list = this.providerResponse;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PaymentMethods> list2 = this.paymentMethods;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        PaymentMethodsState paymentMethodsState = this.state;
        int iC = f.c(this.availableDiscounts, (iHashCode2 + (paymentMethodsState == null ? 0 : paymentMethodsState.hashCode())) * 31, 31);
        VoucherPaymentInformation voucherPaymentInformation = this.voucherPaymentInformation;
        return iC + (voucherPaymentInformation != null ? voucherPaymentInformation.hashCode() : 0);
    }

    public final void setPaymentMethods(@Nullable List<PaymentMethods> list) {
        this.paymentMethods = list;
    }

    public final void setState(@Nullable PaymentMethodsState paymentMethodsState) {
        this.state = paymentMethodsState;
    }

    @NotNull
    public String toString() {
        return "PaymentMethodsResponse(providerResponse=" + this.providerResponse + ", paymentMethods=" + this.paymentMethods + ", state=" + this.state + ", availableDiscounts=" + this.availableDiscounts + ", voucherPaymentInformation=" + this.voucherPaymentInformation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        List<ProviderResponse> list = this.providerResponse;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = i.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((ProviderResponse) itQ.next()).writeToParcel(dest, flags);
            }
        }
        List<PaymentMethods> list2 = this.paymentMethods;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = i.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((PaymentMethods) itQ2.next()).writeToParcel(dest, flags);
            }
        }
        PaymentMethodsState paymentMethodsState = this.state;
        if (paymentMethodsState == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(paymentMethodsState.name());
        }
        Iterator itR = i.r(this.availableDiscounts, dest);
        while (itR.hasNext()) {
            ((DiscountVoucher) itR.next()).writeToParcel(dest, flags);
        }
        VoucherPaymentInformation voucherPaymentInformation = this.voucherPaymentInformation;
        if (voucherPaymentInformation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            voucherPaymentInformation.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/response/PaymentMethodsResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PaymentMethodsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethodsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodsResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            parcel.getClass();
            int iC = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i11);
                int iC2 = 0;
                while (iC2 != i11) {
                    iC2 = i.c(ProviderResponse.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = i.c(PaymentMethods.CREATOR, parcel, arrayList4, iC3, 1);
                }
                arrayList2 = arrayList4;
            }
            PaymentMethodsState paymentMethodsStateValueOf = parcel.readInt() == 0 ? null : PaymentMethodsState.valueOf(parcel.readString());
            int i13 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i13);
            while (iC != i13) {
                iC = i.c(DiscountVoucher.CREATOR, parcel, arrayList5, iC, 1);
            }
            return new PaymentMethodsResponse(arrayList, arrayList2, paymentMethodsStateValueOf, arrayList5, parcel.readInt() != 0 ? VoucherPaymentInformation.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodsResponse[] newArray(int i11) {
            return new PaymentMethodsResponse[i11];
        }
    }

    @g("user_discounts")
    public static /* synthetic */ void getAvailableDiscounts$annotations() {
    }

    @g("payment_methods")
    public static /* synthetic */ void getPaymentMethods$annotations() {
    }

    @g("provider_responses")
    public static /* synthetic */ void getProviderResponse$annotations() {
    }

    @g("payment_methods_state")
    public static /* synthetic */ void getState$annotations() {
    }

    @g("voucher_payment_information")
    public static /* synthetic */ void getVoucherPaymentInformation$annotations() {
    }

    public PaymentMethodsResponse(@Nullable List<ProviderResponse> list, @Nullable List<PaymentMethods> list2, @Nullable PaymentMethodsState paymentMethodsState, @NotNull List<DiscountVoucher> list3, @Nullable VoucherPaymentInformation voucherPaymentInformation) {
        list3.getClass();
        this.providerResponse = list;
        this.paymentMethods = list2;
        this.state = paymentMethodsState;
        this.availableDiscounts = list3;
        this.voucherPaymentInformation = voucherPaymentInformation;
    }

    public PaymentMethodsResponse(List list, List list2, PaymentMethodsState paymentMethodsState, List list3, VoucherPaymentInformation voucherPaymentInformation, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2, paymentMethodsState, (i11 & 8) != 0 ? n0.f26529a : list3, voucherPaymentInformation);
    }
}
