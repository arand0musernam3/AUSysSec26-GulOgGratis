package gt;

import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.order.response.ProviderType;
import com.app.tgtg.model.remote.payment.CardStatus;
import com.app.tgtg.model.remote.payment.PaymentType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class x {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;

    static {
        int[] iArr = new int[ProviderType.values().length];
        try {
            iArr[ProviderType.ADYEN_SAVED_PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProviderType.EDENRED_SAVED_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProviderType.ADYEN_PAYMENT_METHOD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProviderType.SATISPAY_PAYMENT_METHOD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ProviderType.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[PaymentProvider.values().length];
        try {
            iArr2[PaymentProvider.ADYEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PaymentProvider.SATISPAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PaymentProvider.EDENRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PaymentProvider.VOUCHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PaymentProvider.CHARITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[PaymentProvider.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[PaymentType.values().length];
        try {
            iArr3[PaymentType.PAYPAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[PaymentType.SOFORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[PaymentType.IDEAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[PaymentType.CREDITCARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[PaymentType.CHARITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[PaymentType.GOOGLEPAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[PaymentType.BCMCMOBILE.ordinal()] = 7;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[PaymentType.BCMCCARD.ordinal()] = 8;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[PaymentType.VIPPS.ordinal()] = 9;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[PaymentType.TWINT.ordinal()] = 10;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[PaymentType.MBWAY.ordinal()] = 11;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[PaymentType.BLIK.ordinal()] = 12;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[PaymentType.SATISPAY.ordinal()] = 13;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[PaymentType.CASH_APP_PAY.ordinal()] = 14;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[PaymentType.EDENRED.ordinal()] = 15;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr3[PaymentType.UNKNOWN.ordinal()] = 16;
        } catch (NoSuchFieldError unused27) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[CardStatus.values().length];
        try {
            iArr4[CardStatus.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr4[CardStatus.EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr4[CardStatus.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused30) {
        }
        $EnumSwitchMapping$3 = iArr4;
    }
}
