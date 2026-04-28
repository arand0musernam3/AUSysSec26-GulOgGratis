package cj;

import com.app.tgtg.model.remote.order.PaymentStatus;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.payment.PaymentType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class f0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[PaymentProvider.values().length];
        try {
            iArr[PaymentProvider.ADYEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentProvider.CHARITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentProvider.SATISPAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentProvider.EDENRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentProvider.VOUCHER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[PaymentType.values().length];
        try {
            iArr2[PaymentType.CREDITCARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PaymentType.GOOGLEPAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PaymentType.BCMCCARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PaymentType.IDEAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PaymentType.BCMCMOBILE.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[PaymentType.PAYPAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[PaymentType.SOFORT.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[PaymentType.VIPPS.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[PaymentType.TWINT.ordinal()] = 9;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[PaymentType.MBWAY.ordinal()] = 10;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[PaymentType.BLIK.ordinal()] = 11;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[PaymentType.CASH_APP_PAY.ordinal()] = 12;
        } catch (NoSuchFieldError unused17) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[PaymentStatus.values().length];
        try {
            iArr3[PaymentStatus.REAUTHORIZATION_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[PaymentStatus.ADDITIONAL_AUTHORIZATION_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[PaymentStatus.CAPTURED.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[PaymentStatus.AUTHORIZED.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[PaymentStatus.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[PaymentStatus.ABORTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[PaymentStatus.USER_ABORTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused24) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
