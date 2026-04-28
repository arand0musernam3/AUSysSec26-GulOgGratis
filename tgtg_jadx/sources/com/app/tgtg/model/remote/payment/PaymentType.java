package com.app.tgtg.model.remote.payment;

import a80.a;
import com.app.tgtg.R;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = PaymentTypeSerializer.class)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\u0081\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B1\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006!"}, d2 = {"Lcom/app/tgtg/model/remote/payment/PaymentType;", "", "iconResId", "", "largeIconRes", "titleResId", "comesWithInternalLayout", "", "<init>", "(Ljava/lang/String;IIIIZ)V", "getIconResId", "()I", "getLargeIconRes", "getTitleResId", "getComesWithInternalLayout", "()Z", "PAYPAL", "SOFORT", "IDEAL", "CREDITCARD", "CHARITY", "GOOGLEPAY", "BCMCMOBILE", "BCMCCARD", "VIPPS", "TWINT", "MBWAY", "BLIK", "SATISPAY", "CASH_APP_PAY", "EDENRED", "UNKNOWN", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PaymentType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PaymentType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final PaymentType UNKNOWN = new PaymentType("UNKNOWN", 15, 0, 0, 0 == true ? 1 : 0, false, 15, null);
    private final boolean comesWithInternalLayout;
    private final int iconResId;
    private final int largeIconRes;
    private final int titleResId;
    public static final PaymentType PAYPAL = new PaymentType("PAYPAL", 0, 2131231583, 2131231584, R.string.payment_type_paypal, false, 8, null);
    public static final PaymentType SOFORT = new PaymentType("SOFORT", 1, 2131231578, 2131231579, R.string.payment_type_sofort, false, 8, null);
    public static final PaymentType IDEAL = new PaymentType("IDEAL", 2, R.drawable.icon_ideal_wero, R.drawable.icon_ideal_wero, R.string.payment_type_ideal, false, 8, null);
    public static final PaymentType CREDITCARD = new PaymentType("CREDITCARD", 3, 2131231573, 2131231573, R.string.payment_type_credit_card, true);
    public static final PaymentType CHARITY = new PaymentType("CHARITY", 4, 2131231599, 0, 0, false, 14, null);
    public static final PaymentType GOOGLEPAY = new PaymentType("GOOGLEPAY", 5, R.drawable.gpay_acceptance_mark_800, R.drawable.gpay_acceptance_mark_800, R.string.payment_type_google_pay, false, 8, null);
    public static final PaymentType BCMCMOBILE = new PaymentType("BCMCMOBILE", 6, 2131231556, 2131231559, R.string.payment_type_bancontact, false, 8, null);
    public static final PaymentType BCMCCARD = new PaymentType("BCMCCARD", 7, 2131231557, 2131231558, R.string.payment_type_bancontact_card, true);
    public static final PaymentType VIPPS = new PaymentType("VIPPS", 8, 2131231597, 2131231598, R.string.payment_type_vipps, false, 8, null);
    public static final PaymentType TWINT = new PaymentType("TWINT", 9, 2131231593, 2131231594, R.string.payment_type_twint, false, 8, null);
    public static final PaymentType MBWAY = new PaymentType("MBWAY", 10, 2131231581, 2131231582, R.string.payment_type_mbway, true);
    public static final PaymentType BLIK = new PaymentType("BLIK", 11, 2131231561, 2131231562, R.string.payment_type_blik, true);
    public static final PaymentType SATISPAY = new PaymentType("SATISPAY", 12, R.drawable.icon_satispay, R.drawable.icon_satispay_large, R.string.payment_type_satispay, false, 8, null);
    public static final PaymentType CASH_APP_PAY = new PaymentType("CASH_APP_PAY", 13, R.drawable.icon_cash_app, R.drawable.icon_cash_app, R.string.payment_type_cash_app, false, 8, null);
    public static final PaymentType EDENRED = new PaymentType("EDENRED", 14, R.drawable.icon_edenred, R.drawable.icon_edenred_large, R.string.payment_type_edenred, false, 8, null);

    private static final /* synthetic */ PaymentType[] $values() {
        return new PaymentType[]{PAYPAL, SOFORT, IDEAL, CREDITCARD, CHARITY, GOOGLEPAY, BCMCMOBILE, BCMCCARD, VIPPS, TWINT, MBWAY, BLIK, SATISPAY, CASH_APP_PAY, EDENRED, UNKNOWN};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        PaymentType[] paymentTypeArr$values = $values();
        $VALUES = paymentTypeArr$values;
        $ENTRIES = n.w(paymentTypeArr$values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ PaymentType(String str, int i11, int i12, int i13, int i14, boolean z11, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, (i15 & 1) != 0 ? 2131231573 : i12, (i15 & 2) != 0 ? 2131231567 : i13, (i15 & 4) != 0 ? R.string.payment_type_credit_card : i14, (i15 & 8) != 0 ? false : z11);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static PaymentType valueOf(String str) {
        return (PaymentType) Enum.valueOf(PaymentType.class, str);
    }

    public static PaymentType[] values() {
        return (PaymentType[]) $VALUES.clone();
    }

    public final boolean getComesWithInternalLayout() {
        return this.comesWithInternalLayout;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final int getLargeIconRes() {
        return this.largeIconRes;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/PaymentType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/PaymentType;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PaymentTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private PaymentType(String str, int i11, int i12, int i13, int i14, boolean z11) {
        this.iconResId = i12;
        this.largeIconRes = i13;
        this.titleResId = i14;
        this.comesWithInternalLayout = z11;
    }
}
