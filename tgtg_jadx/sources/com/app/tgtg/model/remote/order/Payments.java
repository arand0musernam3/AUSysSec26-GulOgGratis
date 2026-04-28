package com.app.tgtg.model.remote.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.OrderId$$serializer;
import com.app.tgtg.model.remote.PaymentId;
import com.app.tgtg.model.remote.PaymentId$$serializer;
import com.app.tgtg.model.remote.UserId;
import com.app.tgtg.model.remote.UserId$$serializer;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.order.response.PaymentProviderSerializer;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0002POBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010)\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010\u001fJZ\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b.\u0010\u001fJ\u0010\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u0010\u0017J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010<\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010=\u0012\u0004\bB\u0010@\u001a\u0004\bA\u0010\u001fR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010C\u0012\u0004\bE\u0010@\u001a\u0004\bD\u0010$R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010F\u0012\u0004\bH\u0010@\u001a\u0004\bG\u0010&R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010=\u0012\u0004\bJ\u0010@\u001a\u0004\bI\u0010\u001fR \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010=\u0012\u0004\bL\u0010@\u001a\u0004\bK\u0010\u001fR\"\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\bN\u0010@\u001a\u0004\bM\u0010\u001f¨\u0006Q"}, d2 = {"Lcom/app/tgtg/model/remote/order/Payments;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/PaymentId;", "paymentId", "Lcom/app/tgtg/model/remote/OrderId;", "orderId", "Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "paymentProvider", "Lcom/app/tgtg/model/remote/order/PaymentStatus;", "state", "", "failureReason", "Lcom/app/tgtg/model/remote/UserId;", "userId", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Lcom/app/tgtg/model/remote/order/PaymentStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Lcom/app/tgtg/model/remote/order/PaymentStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1-zmxuPeI", "()Ljava/lang/String;", "component1", "component2-reIZeYA", "component2", "component3", "()Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "component4", "()Lcom/app/tgtg/model/remote/order/PaymentStatus;", "component5", "component6-8nKqa5U", "component6", "component7", "copy-sxZbV30", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/order/response/PaymentProvider;Lcom/app/tgtg/model/remote/order/PaymentStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/order/Payments;", "copy", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/order/Payments;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getPaymentId-zmxuPeI", "getPaymentId-zmxuPeI$annotations", "()V", "getOrderId-reIZeYA", "getOrderId-reIZeYA$annotations", "Lcom/app/tgtg/model/remote/order/response/PaymentProvider;", "getPaymentProvider", "getPaymentProvider$annotations", "Lcom/app/tgtg/model/remote/order/PaymentStatus;", "getState", "getState$annotations", "getFailureReason", "getFailureReason$annotations", "getUserId-8nKqa5U", "getUserId-8nKqa5U$annotations", "getPayload", "getPayload$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Payments implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String failureReason;

    @NotNull
    private final String orderId;

    @Nullable
    private final String payload;

    @NotNull
    private final String paymentId;

    @NotNull
    private final PaymentProvider paymentProvider;

    @NotNull
    private final PaymentStatus state;

    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Payments> CREATOR = new Creator();

    private /* synthetic */ Payments(int i11, String str, String str2, PaymentProvider paymentProvider, PaymentStatus paymentStatus, String str3, String str4, String str5, m1 m1Var) {
        if (127 != (i11 & 127)) {
            c1.j(i11, 127, Payments$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.paymentId = str;
        this.orderId = str2;
        this.paymentProvider = paymentProvider;
        this.state = paymentStatus;
        this.failureReason = str3;
        this.userId = str4;
        this.payload = str5;
    }

    /* JADX INFO: renamed from: copy-sxZbV30$default, reason: not valid java name */
    public static /* synthetic */ Payments m448copysxZbV30$default(Payments payments, String str, String str2, PaymentProvider paymentProvider, PaymentStatus paymentStatus, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = payments.paymentId;
        }
        if ((i11 & 2) != 0) {
            str2 = payments.orderId;
        }
        if ((i11 & 4) != 0) {
            paymentProvider = payments.paymentProvider;
        }
        if ((i11 & 8) != 0) {
            paymentStatus = payments.state;
        }
        if ((i11 & 16) != 0) {
            str3 = payments.failureReason;
        }
        if ((i11 & 32) != 0) {
            str4 = payments.userId;
        }
        if ((i11 & 64) != 0) {
            str5 = payments.payload;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str3;
        PaymentProvider paymentProvider2 = paymentProvider;
        return payments.m455copysxZbV30(str, str2, paymentProvider2, paymentStatus, str8, str6, str7);
    }

    public static final /* synthetic */ void write$Self$app(Payments self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, PaymentId$$serializer.INSTANCE, PaymentId.m233boximpl(self.paymentId));
        output.i(serialDesc, 1, OrderId$$serializer.INSTANCE, OrderId.m209boximpl(self.orderId));
        output.i(serialDesc, 2, PaymentProviderSerializer.INSTANCE, self.paymentProvider);
        output.i(serialDesc, 3, PaymentStatusSerializer.INSTANCE, self.state);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 4, r1Var, self.failureReason);
        output.i(serialDesc, 5, UserId$$serializer.INSTANCE, UserId.m286boximpl(self.userId));
        output.r(serialDesc, 6, r1Var, self.payload);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-zmxuPeI, reason: not valid java name and from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2-reIZeYA, reason: not valid java name and from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaymentProvider getPaymentProvider() {
        return this.paymentProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PaymentStatus getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    @NotNull
    /* JADX INFO: renamed from: component6-8nKqa5U, reason: not valid java name and from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-sxZbV30, reason: not valid java name */
    public final Payments m455copysxZbV30(@NotNull String paymentId, @NotNull String orderId, @NotNull PaymentProvider paymentProvider, @NotNull PaymentStatus state, @Nullable String failureReason, @NotNull String userId, @Nullable String payload) {
        paymentId.getClass();
        orderId.getClass();
        paymentProvider.getClass();
        state.getClass();
        userId.getClass();
        return new Payments(paymentId, orderId, paymentProvider, state, failureReason, userId, payload, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payments)) {
            return false;
        }
        Payments payments = (Payments) other;
        return PaymentId.m237equalsimpl0(this.paymentId, payments.paymentId) && OrderId.m213equalsimpl0(this.orderId, payments.orderId) && this.paymentProvider == payments.paymentProvider && this.state == payments.state && Intrinsics.areEqual(this.failureReason, payments.failureReason) && UserId.m290equalsimpl0(this.userId, payments.userId) && Intrinsics.areEqual(this.payload, payments.payload);
    }

    @Nullable
    public final String getFailureReason() {
        return this.failureReason;
    }

    @NotNull
    /* JADX INFO: renamed from: getOrderId-reIZeYA, reason: not valid java name */
    public final String m456getOrderIdreIZeYA() {
        return this.orderId;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @NotNull
    /* JADX INFO: renamed from: getPaymentId-zmxuPeI, reason: not valid java name */
    public final String m457getPaymentIdzmxuPeI() {
        return this.paymentId;
    }

    @NotNull
    public final PaymentProvider getPaymentProvider() {
        return this.paymentProvider;
    }

    @NotNull
    public final PaymentStatus getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserId-8nKqa5U, reason: not valid java name */
    public final String m458getUserId8nKqa5U() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = (this.state.hashCode() + ((this.paymentProvider.hashCode() + ((OrderId.m214hashCodeimpl(this.orderId) + (PaymentId.m238hashCodeimpl(this.paymentId) * 31)) * 31)) * 31)) * 31;
        String str = this.failureReason;
        int iM291hashCodeimpl = (UserId.m291hashCodeimpl(this.userId) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.payload;
        return iM291hashCodeimpl + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String strM239toStringimpl = PaymentId.m239toStringimpl(this.paymentId);
        String strM215toStringimpl = OrderId.m215toStringimpl(this.orderId);
        PaymentProvider paymentProvider = this.paymentProvider;
        PaymentStatus paymentStatus = this.state;
        String str = this.failureReason;
        String strM292toStringimpl = UserId.m292toStringimpl(this.userId);
        String str2 = this.payload;
        StringBuilder sbT = f.t("Payments(paymentId=", strM239toStringimpl, ", orderId=", strM215toStringimpl, ", paymentProvider=");
        sbT.append(paymentProvider);
        sbT.append(", state=");
        sbT.append(paymentStatus);
        sbT.append(", failureReason=");
        s.A(sbT, str, ", userId=", strM292toStringimpl, ", payload=");
        return k.p(sbT, str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        PaymentId.m240writeToParcelimpl(this.paymentId, dest, flags);
        OrderId.m216writeToParcelimpl(this.orderId, dest, flags);
        dest.writeString(this.paymentProvider.name());
        dest.writeString(this.state.name());
        dest.writeString(this.failureReason);
        UserId.m293writeToParcelimpl(this.userId, dest, flags);
        dest.writeString(this.payload);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/order/Payments$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/order/Payments;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Payments$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Payments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Payments createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Payments(PaymentId.CREATOR.createFromParcel(parcel).m241unboximpl(), OrderId.CREATOR.createFromParcel(parcel).m217unboximpl(), PaymentProvider.valueOf(parcel.readString()), PaymentStatus.valueOf(parcel.readString()), parcel.readString(), UserId.CREATOR.createFromParcel(parcel).m294unboximpl(), parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Payments[] newArray(int i11) {
            return new Payments[i11];
        }
    }

    @g("failure_reason")
    public static /* synthetic */ void getFailureReason$annotations() {
    }

    @g("order_id")
    /* JADX INFO: renamed from: getOrderId-reIZeYA$annotations, reason: not valid java name */
    public static /* synthetic */ void m449getOrderIdreIZeYA$annotations() {
    }

    @g("payload")
    public static /* synthetic */ void getPayload$annotations() {
    }

    @g("payment_id")
    /* JADX INFO: renamed from: getPaymentId-zmxuPeI$annotations, reason: not valid java name */
    public static /* synthetic */ void m450getPaymentIdzmxuPeI$annotations() {
    }

    @g("payment_provider")
    public static /* synthetic */ void getPaymentProvider$annotations() {
    }

    @g("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @g("user_id")
    /* JADX INFO: renamed from: getUserId-8nKqa5U$annotations, reason: not valid java name */
    public static /* synthetic */ void m451getUserId8nKqa5U$annotations() {
    }

    public /* synthetic */ Payments(String str, String str2, PaymentProvider paymentProvider, PaymentStatus paymentStatus, String str3, String str4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, paymentProvider, paymentStatus, str3, str4, str5);
    }

    public /* synthetic */ Payments(int i11, String str, String str2, PaymentProvider paymentProvider, PaymentStatus paymentStatus, String str3, String str4, String str5, m1 m1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, paymentProvider, paymentStatus, str3, str4, str5, m1Var);
    }

    private Payments(String str, String str2, PaymentProvider paymentProvider, PaymentStatus paymentStatus, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        paymentProvider.getClass();
        paymentStatus.getClass();
        str4.getClass();
        this.paymentId = str;
        this.orderId = str2;
        this.paymentProvider = paymentProvider;
        this.state = paymentStatus;
        this.failureReason = str3;
        this.userId = str4;
        this.payload = str5;
    }
}
