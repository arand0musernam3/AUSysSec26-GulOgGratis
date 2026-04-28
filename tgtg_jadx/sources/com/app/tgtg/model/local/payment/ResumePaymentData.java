package com.app.tgtg.model.local.payment;

import aj.c;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.PaymentId;
import com.app.tgtg.model.remote.order.Payments;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import j4.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003¢\u0006\u0004\b'\u0010(Jv\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010\u001cJ\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b9\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b:\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b\r\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010%R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b>\u0010\u001cR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\b@\u0010(¨\u0006A"}, d2 = {"Lcom/app/tgtg/model/local/payment/ResumePaymentData;", "", "", "orderCreatedAt", "Lcom/app/tgtg/model/remote/payment/PaymentMethods;", "selectedPaymentMethods", "Lcom/app/tgtg/model/remote/OrderId;", "orderId", "Lcom/app/tgtg/model/remote/PaymentId;", "paymentId", "Lcom/app/tgtg/model/remote/ItemId;", "itemId", "", "isMultiItem", "Laj/c;", "basketCheckoutData", "", "returnUrl", "", "Lcom/app/tgtg/model/remote/order/Payments;", "listOfPayments", "<init>", "(JLcom/app/tgtg/model/remote/payment/PaymentMethods;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLaj/c;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()J", "component2", "()Lcom/app/tgtg/model/remote/payment/PaymentMethods;", "component3-reIZeYA", "()Ljava/lang/String;", "component3", "component4-TaD0F3M", "component4", "component5-RWxzYZM", "component5", "component6", "()Z", "component7", "()Laj/c;", "component8", "component9", "()Ljava/util/List;", "copy-rZNm28c", "(JLcom/app/tgtg/model/remote/payment/PaymentMethods;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLaj/c;Ljava/lang/String;Ljava/util/List;)Lcom/app/tgtg/model/local/payment/ResumePaymentData;", "copy", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getOrderCreatedAt", "Lcom/app/tgtg/model/remote/payment/PaymentMethods;", "getSelectedPaymentMethods", "Ljava/lang/String;", "getOrderId-reIZeYA", "getPaymentId-TaD0F3M", "getItemId-RWxzYZM", "Z", "Laj/c;", "getBasketCheckoutData", "getReturnUrl", "Ljava/util/List;", "getListOfPayments", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ResumePaymentData {
    public static final int $stable = 8;

    @Nullable
    private final c basketCheckoutData;
    private final boolean isMultiItem;

    @Nullable
    private final String itemId;

    @NotNull
    private final List<Payments> listOfPayments;
    private final long orderCreatedAt;

    @NotNull
    private final String orderId;

    @Nullable
    private final String paymentId;

    @NotNull
    private final String returnUrl;

    @NotNull
    private final PaymentMethods selectedPaymentMethods;

    private ResumePaymentData(long j9, PaymentMethods paymentMethods, String str, String str2, String str3, boolean z11, c cVar, String str4, List<Payments> list) {
        paymentMethods.getClass();
        str.getClass();
        str4.getClass();
        list.getClass();
        this.orderCreatedAt = j9;
        this.selectedPaymentMethods = paymentMethods;
        this.orderId = str;
        this.paymentId = str2;
        this.itemId = str3;
        this.isMultiItem = z11;
        this.basketCheckoutData = cVar;
        this.returnUrl = str4;
        this.listOfPayments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-rZNm28c$default, reason: not valid java name */
    public static /* synthetic */ ResumePaymentData m189copyrZNm28c$default(ResumePaymentData resumePaymentData, long j9, PaymentMethods paymentMethods, String str, String str2, String str3, boolean z11, c cVar, String str4, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j9 = resumePaymentData.orderCreatedAt;
        }
        long j11 = j9;
        if ((i11 & 2) != 0) {
            paymentMethods = resumePaymentData.selectedPaymentMethods;
        }
        PaymentMethods paymentMethods2 = paymentMethods;
        if ((i11 & 4) != 0) {
            str = resumePaymentData.orderId;
        }
        return resumePaymentData.m193copyrZNm28c(j11, paymentMethods2, str, (i11 & 8) != 0 ? resumePaymentData.paymentId : str2, (i11 & 16) != 0 ? resumePaymentData.itemId : str3, (i11 & 32) != 0 ? resumePaymentData.isMultiItem : z11, (i11 & 64) != 0 ? resumePaymentData.basketCheckoutData : cVar, (i11 & 128) != 0 ? resumePaymentData.returnUrl : str4, (i11 & 256) != 0 ? resumePaymentData.listOfPayments : list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getOrderCreatedAt() {
        return this.orderCreatedAt;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentMethods getSelectedPaymentMethods() {
        return this.selectedPaymentMethods;
    }

    @NotNull
    /* JADX INFO: renamed from: component3-reIZeYA, reason: not valid java name and from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4-TaD0F3M, reason: not valid java name and from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5-RWxzYZM, reason: not valid java name and from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsMultiItem() {
        return this.isMultiItem;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final c getBasketCheckoutData() {
        return this.basketCheckoutData;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @NotNull
    public final List<Payments> component9() {
        return this.listOfPayments;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-rZNm28c, reason: not valid java name */
    public final ResumePaymentData m193copyrZNm28c(long orderCreatedAt, @NotNull PaymentMethods selectedPaymentMethods, @NotNull String orderId, @Nullable String paymentId, @Nullable String itemId, boolean isMultiItem, @Nullable c basketCheckoutData, @NotNull String returnUrl, @NotNull List<Payments> listOfPayments) {
        selectedPaymentMethods.getClass();
        orderId.getClass();
        returnUrl.getClass();
        listOfPayments.getClass();
        return new ResumePaymentData(orderCreatedAt, selectedPaymentMethods, orderId, paymentId, itemId, isMultiItem, basketCheckoutData, returnUrl, listOfPayments, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.app.tgtg.model.local.payment.ResumePaymentData
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.app.tgtg.model.local.payment.ResumePaymentData r8 = (com.app.tgtg.model.local.payment.ResumePaymentData) r8
            long r3 = r7.orderCreatedAt
            long r5 = r8.orderCreatedAt
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            com.app.tgtg.model.remote.payment.PaymentMethods r1 = r7.selectedPaymentMethods
            com.app.tgtg.model.remote.payment.PaymentMethods r3 = r8.selectedPaymentMethods
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            java.lang.String r1 = r7.orderId
            java.lang.String r3 = r8.orderId
            boolean r1 = com.app.tgtg.model.remote.OrderId.m213equalsimpl0(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            java.lang.String r1 = r7.paymentId
            java.lang.String r3 = r8.paymentId
            if (r1 != 0) goto L37
            if (r3 != 0) goto L35
            r1 = r0
            goto L3e
        L35:
            r1 = r2
            goto L3e
        L37:
            if (r3 != 0) goto L3a
            goto L35
        L3a:
            boolean r1 = com.app.tgtg.model.remote.PaymentId.m237equalsimpl0(r1, r3)
        L3e:
            if (r1 != 0) goto L41
            return r2
        L41:
            java.lang.String r1 = r7.itemId
            java.lang.String r3 = r8.itemId
            if (r1 != 0) goto L4d
            if (r3 != 0) goto L4b
            r1 = r0
            goto L54
        L4b:
            r1 = r2
            goto L54
        L4d:
            if (r3 != 0) goto L50
            goto L4b
        L50:
            boolean r1 = com.app.tgtg.model.remote.ItemId.m201equalsimpl0(r1, r3)
        L54:
            if (r1 != 0) goto L57
            return r2
        L57:
            boolean r1 = r7.isMultiItem
            boolean r3 = r8.isMultiItem
            if (r1 == r3) goto L5e
            return r2
        L5e:
            aj.c r1 = r7.basketCheckoutData
            aj.c r3 = r8.basketCheckoutData
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L69
            return r2
        L69:
            java.lang.String r1 = r7.returnUrl
            java.lang.String r3 = r8.returnUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L74
            return r2
        L74:
            java.util.List<com.app.tgtg.model.remote.order.Payments> r1 = r7.listOfPayments
            java.util.List<com.app.tgtg.model.remote.order.Payments> r8 = r8.listOfPayments
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r8)
            if (r8 != 0) goto L7f
            return r2
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.model.local.payment.ResumePaymentData.equals(java.lang.Object):boolean");
    }

    @Nullable
    public final c getBasketCheckoutData() {
        return this.basketCheckoutData;
    }

    @Nullable
    /* JADX INFO: renamed from: getItemId-RWxzYZM, reason: not valid java name */
    public final String m194getItemIdRWxzYZM() {
        return this.itemId;
    }

    @NotNull
    public final List<Payments> getListOfPayments() {
        return this.listOfPayments;
    }

    public final long getOrderCreatedAt() {
        return this.orderCreatedAt;
    }

    @NotNull
    /* JADX INFO: renamed from: getOrderId-reIZeYA, reason: not valid java name */
    public final String m195getOrderIdreIZeYA() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: getPaymentId-TaD0F3M, reason: not valid java name */
    public final String m196getPaymentIdTaD0F3M() {
        return this.paymentId;
    }

    @NotNull
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    @NotNull
    public final PaymentMethods getSelectedPaymentMethods() {
        return this.selectedPaymentMethods;
    }

    public int hashCode() {
        int iM214hashCodeimpl = (OrderId.m214hashCodeimpl(this.orderId) + ((this.selectedPaymentMethods.hashCode() + (Long.hashCode(this.orderCreatedAt) * 31)) * 31)) * 31;
        String str = this.paymentId;
        int iM238hashCodeimpl = (iM214hashCodeimpl + (str == null ? 0 : PaymentId.m238hashCodeimpl(str))) * 31;
        String str2 = this.itemId;
        int iE = k.e((iM238hashCodeimpl + (str2 == null ? 0 : ItemId.m202hashCodeimpl(str2))) * 31, 31, this.isMultiItem);
        c cVar = this.basketCheckoutData;
        return this.listOfPayments.hashCode() + l1.b((iE + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.returnUrl);
    }

    public final boolean isMultiItem() {
        return this.isMultiItem;
    }

    @NotNull
    public String toString() {
        long j9 = this.orderCreatedAt;
        PaymentMethods paymentMethods = this.selectedPaymentMethods;
        String strM215toStringimpl = OrderId.m215toStringimpl(this.orderId);
        String str = this.paymentId;
        String strM203toStringimpl = Address.ADDRESS_NULL_PLACEHOLDER;
        String strM239toStringimpl = str == null ? Address.ADDRESS_NULL_PLACEHOLDER : PaymentId.m239toStringimpl(str);
        String str2 = this.itemId;
        if (str2 != null) {
            strM203toStringimpl = ItemId.m203toStringimpl(str2);
        }
        boolean z11 = this.isMultiItem;
        c cVar = this.basketCheckoutData;
        String str3 = this.returnUrl;
        List<Payments> list = this.listOfPayments;
        StringBuilder sb2 = new StringBuilder("ResumePaymentData(orderCreatedAt=");
        sb2.append(j9);
        sb2.append(", selectedPaymentMethods=");
        sb2.append(paymentMethods);
        s.A(sb2, ", orderId=", strM215toStringimpl, ", paymentId=", strM239toStringimpl);
        sb2.append(", itemId=");
        sb2.append(strM203toStringimpl);
        sb2.append(", isMultiItem=");
        sb2.append(z11);
        sb2.append(", basketCheckoutData=");
        sb2.append(cVar);
        sb2.append(", returnUrl=");
        sb2.append(str3);
        sb2.append(", listOfPayments=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ResumePaymentData(long j9, PaymentMethods paymentMethods, String str, String str2, String str3, boolean z11, c cVar, String str4, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, paymentMethods, str, str2, str3, z11, cVar, str4, list);
    }

    public /* synthetic */ ResumePaymentData(long j9, PaymentMethods paymentMethods, String str, String str2, String str3, boolean z11, c cVar, String str4, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j9, paymentMethods, str, str2, str3, (i11 & 32) != 0 ? false : z11, cVar, str4, list, null);
    }
}
