package gt;

import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.order.response.ProviderType;
import com.app.tgtg.model.remote.payment.PaymentType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y9.v f20899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f20900b = new a(this, 2);

    public y(y9.v vVar) {
        this.f20899a = vVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static PaymentProvider a(String str) {
        switch (str.hashCode()) {
            case -1342615784:
                if (str.equals("SATISPAY")) {
                    return PaymentProvider.SATISPAY;
                }
                break;
            case -1173845527:
                if (str.equals("EDENRED")) {
                    return PaymentProvider.EDENRED;
                }
                break;
            case 62142399:
                if (str.equals("ADYEN")) {
                    return PaymentProvider.ADYEN;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return PaymentProvider.UNKNOWN;
                }
                break;
            case 1358174862:
                if (str.equals("VOUCHER")) {
                    return PaymentProvider.VOUCHER;
                }
                break;
            case 1457047928:
                if (str.equals("CHARITY")) {
                    return PaymentProvider.CHARITY;
                }
                break;
        }
        i4.a.f("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static PaymentType b(String str) {
        switch (str.hashCode()) {
            case -1941875981:
                if (str.equals("PAYPAL")) {
                    return PaymentType.PAYPAL;
                }
                break;
            case -1843625689:
                if (str.equals("SOFORT")) {
                    return PaymentType.SOFORT;
                }
                break;
            case -1342615784:
                if (str.equals("SATISPAY")) {
                    return PaymentType.SATISPAY;
                }
                break;
            case -1173845527:
                if (str.equals("EDENRED")) {
                    return PaymentType.EDENRED;
                }
                break;
            case -78778999:
                if (str.equals("CREDITCARD")) {
                    return PaymentType.CREDITCARD;
                }
                break;
            case -33846353:
                if (str.equals("GOOGLEPAY")) {
                    return PaymentType.GOOGLEPAY;
                }
                break;
            case 2041580:
                if (str.equals("BLIK")) {
                    return PaymentType.BLIK;
                }
                break;
            case 69511221:
                if (str.equals("IDEAL")) {
                    return PaymentType.IDEAL;
                }
                break;
            case 73163034:
                if (str.equals("MBWAY")) {
                    return PaymentType.MBWAY;
                }
                break;
            case 80240236:
                if (str.equals("TWINT")) {
                    return PaymentType.TWINT;
                }
                break;
            case 81676992:
                if (str.equals("VIPPS")) {
                    return PaymentType.VIPPS;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return PaymentType.UNKNOWN;
                }
                break;
            case 662951207:
                if (str.equals("BCMCCARD")) {
                    return PaymentType.BCMCCARD;
                }
                break;
            case 1085976638:
                if (str.equals("CASH_APP_PAY")) {
                    return PaymentType.CASH_APP_PAY;
                }
                break;
            case 1457047928:
                if (str.equals("CHARITY")) {
                    return PaymentType.CHARITY;
                }
                break;
            case 1739701497:
                if (str.equals("BCMCMOBILE")) {
                    return PaymentType.BCMCMOBILE;
                }
                break;
        }
        i4.a.f("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ProviderType c(String str) {
        switch (str.hashCode()) {
            case -2006674546:
                if (str.equals("ADYEN_SAVED_PAYMENT")) {
                    return ProviderType.ADYEN_SAVED_PAYMENT;
                }
                break;
            case -1645690527:
                if (str.equals("SATISPAY_PAYMENT_METHOD")) {
                    return ProviderType.SATISPAY_PAYMENT_METHOD;
                }
                break;
            case -1581198280:
                if (str.equals("EDENRED_SAVED_PAYMENT")) {
                    return ProviderType.EDENRED_SAVED_PAYMENT;
                }
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    return ProviderType.UNKNOWN;
                }
                break;
            case 1982371290:
                if (str.equals("ADYEN_PAYMENT_METHOD")) {
                    return ProviderType.ADYEN_PAYMENT_METHOD;
                }
                break;
        }
        i4.a.f("Can't convert value to enum, unknown value: ".concat(str));
        return null;
    }
}
