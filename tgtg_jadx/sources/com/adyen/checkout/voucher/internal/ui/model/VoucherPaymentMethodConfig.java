package com.adyen.checkout.voucher.internal.ui.model;

import a80.a;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.voucher.R;
import com.adyen.checkout.voucher.internal.ui.VoucherComponentViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/model/VoucherPaymentMethodConfig;", "", "viewType", "Lcom/adyen/checkout/voucher/internal/ui/VoucherComponentViewType;", "introductionTextResource", "", "(Ljava/lang/String;ILcom/adyen/checkout/voucher/internal/ui/VoucherComponentViewType;Ljava/lang/Integer;)V", "getIntroductionTextResource", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getViewType", "()Lcom/adyen/checkout/voucher/internal/ui/VoucherComponentViewType;", "BACS", "BOLETO", "ECONTEXT", "MULTIBANCO", "Companion", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VoucherPaymentMethodConfig {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VoucherPaymentMethodConfig[] $VALUES;
    public static final VoucherPaymentMethodConfig BACS = new VoucherPaymentMethodConfig("BACS", 0, VoucherComponentViewType.SIMPLE_VOUCHER, Integer.valueOf(R.string.checkout_voucher_introduction_bacs));
    public static final VoucherPaymentMethodConfig BOLETO;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final VoucherPaymentMethodConfig ECONTEXT;
    public static final VoucherPaymentMethodConfig MULTIBANCO;

    @Nullable
    private final Integer introductionTextResource;

    @NotNull
    private final VoucherComponentViewType viewType;

    private static final /* synthetic */ VoucherPaymentMethodConfig[] $values() {
        return new VoucherPaymentMethodConfig[]{BACS, BOLETO, ECONTEXT, MULTIBANCO};
    }

    static {
        VoucherComponentViewType voucherComponentViewType = VoucherComponentViewType.FULL_VOUCHER;
        BOLETO = new VoucherPaymentMethodConfig("BOLETO", 1, voucherComponentViewType, Integer.valueOf(R.string.checkout_voucher_introduction));
        ECONTEXT = new VoucherPaymentMethodConfig("ECONTEXT", 2, voucherComponentViewType, Integer.valueOf(R.string.checkout_voucher_introduction_econtext));
        MULTIBANCO = new VoucherPaymentMethodConfig("MULTIBANCO", 3, voucherComponentViewType, Integer.valueOf(R.string.checkout_voucher_introduction));
        VoucherPaymentMethodConfig[] voucherPaymentMethodConfigArr$values = $values();
        $VALUES = voucherPaymentMethodConfigArr$values;
        $ENTRIES = n.w(voucherPaymentMethodConfigArr$values);
        INSTANCE = new Companion(null);
    }

    private VoucherPaymentMethodConfig(String str, int i11, VoucherComponentViewType voucherComponentViewType, Integer num) {
        this.viewType = voucherComponentViewType;
        this.introductionTextResource = num;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static VoucherPaymentMethodConfig valueOf(String str) {
        return (VoucherPaymentMethodConfig) Enum.valueOf(VoucherPaymentMethodConfig.class, str);
    }

    public static VoucherPaymentMethodConfig[] values() {
        return (VoucherPaymentMethodConfig[]) $VALUES.clone();
    }

    @Nullable
    public final Integer getIntroductionTextResource() {
        return this.introductionTextResource;
    }

    @NotNull
    public final VoucherComponentViewType getViewType() {
        return this.viewType;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/voucher/internal/ui/model/VoucherPaymentMethodConfig$Companion;", "", "()V", "getByPaymentMethodType", "Lcom/adyen/checkout/voucher/internal/ui/model/VoucherPaymentMethodConfig;", Action.PAYMENT_METHOD_TYPE, "", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Nullable
        public final VoucherPaymentMethodConfig getByPaymentMethodType(@Nullable String paymentMethodType) {
            if (paymentMethodType == null) {
                return null;
            }
            switch (paymentMethodType.hashCode()) {
                case -2077503496:
                    if (!paymentMethodType.equals(PaymentMethodTypes.BOLETOBANCARIO_BANCODOBRASIL)) {
                        return null;
                    }
                    return VoucherPaymentMethodConfig.BOLETO;
                case -1561075715:
                    if (!paymentMethodType.equals(PaymentMethodTypes.BOLETOBANCARIO_SANTANDER)) {
                        return null;
                    }
                    return VoucherPaymentMethodConfig.BOLETO;
                case -152837216:
                    if (!paymentMethodType.equals(PaymentMethodTypes.BOLETOBANCARIO_BRADESCO)) {
                        return null;
                    }
                    return VoucherPaymentMethodConfig.BOLETO;
                case -141944024:
                    if (!paymentMethodType.equals("econtext_seven_eleven")) {
                        return null;
                    }
                    return VoucherPaymentMethodConfig.ECONTEXT;
                case 19088375:
                    if (paymentMethodType.equals("directdebit_GB")) {
                        return VoucherPaymentMethodConfig.BACS;
                    }
                    return null;
                case 49917573:
                    if (!paymentMethodType.equals("econtext_atm")) {
                        return null;
                    }
                    return VoucherPaymentMethodConfig.ECONTEXT;
                case 364045247:
                    if (!paymentMethodType.equals(PaymentMethodTypes.BOLETO_PRIMEIRO_PAY)) {
                        return null;
                    }
                    return VoucherPaymentMethodConfig.BOLETO;
                case 870510367:
                    if (!paymentMethodType.equals(PaymentMethodTypes.BOLETOBANCARIO_HSBC)) {
                        return null;
                    }
                    return VoucherPaymentMethodConfig.BOLETO;
                case 870541106:
                    if (!paymentMethodType.equals(PaymentMethodTypes.BOLETOBANCARIO_ITAU)) {
                        return null;
                    }
                    return VoucherPaymentMethodConfig.BOLETO;
                case 1251821346:
                    if (paymentMethodType.equals(PaymentMethodTypes.MULTIBANCO)) {
                        return VoucherPaymentMethodConfig.MULTIBANCO;
                    }
                    return null;
                case 1431074440:
                    if (!paymentMethodType.equals("econtext_online")) {
                        return null;
                    }
                    return VoucherPaymentMethodConfig.ECONTEXT;
                case 1551229927:
                    if (!paymentMethodType.equals("econtext_stores")) {
                        return null;
                    }
                    return VoucherPaymentMethodConfig.ECONTEXT;
                case 1788627916:
                    if (!paymentMethodType.equals(PaymentMethodTypes.BOLETOBANCARIO)) {
                        return null;
                    }
                    return VoucherPaymentMethodConfig.BOLETO;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
