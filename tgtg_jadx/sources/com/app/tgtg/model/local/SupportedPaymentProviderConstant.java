package com.app.tgtg.model.local;

import com.app.tgtg.model.remote.payment.request.PaymentMethodsRequest;
import com.app.tgtg.model.remote.payment.request.PaymentMethodsRequestItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000f\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f\"\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0016\"\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001a\"\u0014\u0010#\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0016\"\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001a¨\u0006'"}, d2 = {"supportedPaymentMethods", "Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequest;", "getSupportedPaymentMethods", "()Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequest;", "supportedProviders", "Ljava/util/ArrayList;", "Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequestItem;", "Lkotlin/collections/ArrayList;", "getSupportedProviders", "()Ljava/util/ArrayList;", "adyenPaymentMethodsRequestItem", "getAdyenPaymentMethodsRequestItem", "()Lcom/app/tgtg/model/remote/payment/request/PaymentMethodsRequestItem;", "satispayPaymentMethodsRequestItem", "getSatispayPaymentMethodsRequestItem", "edenredPaymentMethodsRequestItem", "getEdenredPaymentMethodsRequestItem", "charityMethodsRequestItem", "getCharityMethodsRequestItem", "adyenProvider", "", "getAdyenProvider", "()Ljava/lang/String;", "adyenSupportedPaymentType", "", "getAdyenSupportedPaymentType", "()Ljava/util/List;", "satisPayProvider", "getSatisPayProvider", "satisPaySupportedPaymentType", "getSatisPaySupportedPaymentType", "edenredProvider", "getEdenredProvider", "edenredSupportedPaymentType", "getEdenredSupportedPaymentType", "charityProvider", "getCharityProvider", "charitySupportedPaymentType", "getCharitySupportedPaymentType", "app"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class SupportedPaymentProviderConstant {
    private static final PaymentMethodsRequestItem getAdyenPaymentMethodsRequestItem() {
        return new PaymentMethodsRequestItem(getAdyenProvider(), getAdyenSupportedPaymentType());
    }

    private static final String getAdyenProvider() {
        return "ADYEN";
    }

    private static final List<String> getAdyenSupportedPaymentType() {
        return d0.d("CREDITCARD", "SOFORT", "IDEAL", "PAYPAL", "BCMCMOBILE", "BCMCCARD", "VIPPS", "TWINT", "MBWAY", "BLIK", "CASH_APP_PAY", "GOOGLEPAY");
    }

    private static final PaymentMethodsRequestItem getCharityMethodsRequestItem() {
        return new PaymentMethodsRequestItem(getCharityProvider(), getCharitySupportedPaymentType());
    }

    private static final String getCharityProvider() {
        return "CHARITY";
    }

    private static final List<String> getCharitySupportedPaymentType() {
        return d0.d("CHARITY");
    }

    private static final PaymentMethodsRequestItem getEdenredPaymentMethodsRequestItem() {
        return new PaymentMethodsRequestItem(getEdenredProvider(), getEdenredSupportedPaymentType());
    }

    private static final String getEdenredProvider() {
        return "EDENRED";
    }

    private static final List<String> getEdenredSupportedPaymentType() {
        return d0.d("EDENRED");
    }

    private static final String getSatisPayProvider() {
        return "SATISPAY";
    }

    private static final List<String> getSatisPaySupportedPaymentType() {
        return d0.d("SATISPAY");
    }

    private static final PaymentMethodsRequestItem getSatispayPaymentMethodsRequestItem() {
        return new PaymentMethodsRequestItem(getSatisPayProvider(), getSatisPaySupportedPaymentType());
    }

    @NotNull
    public static final PaymentMethodsRequest getSupportedPaymentMethods() {
        return new PaymentMethodsRequest(getSupportedProviders());
    }

    @NotNull
    public static final ArrayList<PaymentMethodsRequestItem> getSupportedProviders() {
        return d0.d(getAdyenPaymentMethodsRequestItem(), getCharityMethodsRequestItem(), getSatispayPaymentMethodsRequestItem(), getEdenredPaymentMethodsRequestItem());
    }
}
