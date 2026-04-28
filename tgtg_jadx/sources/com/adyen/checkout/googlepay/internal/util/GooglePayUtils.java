package com.adyen.checkout.googlepay.internal.util;

import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.adyen.checkout.components.core.internal.util.AmountFormat;
import com.adyen.checkout.components.core.internal.util.CheckoutPlatform;
import com.adyen.checkout.components.core.internal.util.CheckoutPlatformParams;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.googlepay.MerchantInfo;
import com.adyen.checkout.googlepay.SoftwareInfo;
import com.adyen.checkout.googlepay.internal.data.model.CardParameters;
import com.adyen.checkout.googlepay.internal.data.model.GooglePayPaymentMethodModel;
import com.adyen.checkout.googlepay.internal.data.model.IsReadyToPayRequestModel;
import com.adyen.checkout.googlepay.internal.data.model.PaymentDataRequestModel;
import com.adyen.checkout.googlepay.internal.data.model.PaymentMethodTokenizationSpecification;
import com.adyen.checkout.googlepay.internal.data.model.TokenizationParameters;
import com.adyen.checkout.googlepay.internal.data.model.TransactionInfoModel;
import com.adyen.checkout.googlepay.internal.ui.model.GooglePayComponentParams;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import e10.f;
import e10.l;
import e10.m;
import e10.t;
import e10.u;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import r8.k;
import v0.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002LMB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0015\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b.\u0010/J7\u00104\u001a\u0004\u0018\u0001032\b\u0010,\u001a\u0004\u0018\u00010+2\b\u00100\u001a\u0004\u0018\u00010-2\b\u00101\u001a\u0004\u0018\u00010-2\b\u00102\u001a\u0004\u0018\u00010-¢\u0006\u0004\b4\u00105J\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u0013062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b7\u00108R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020=8\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010A\u001a\u00020=8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010?R\u0014\u0010B\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010E\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010CR\u0014\u0010F\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010CR\u0014\u0010G\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010CR\u0014\u0010H\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010CR\u0014\u0010I\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010CR\u0014\u0010J\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010CR\u0014\u0010K\u001a\u00020-8\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010C¨\u0006N"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/util/GooglePayUtils;", "", "<init>", "()V", "Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;", "params", "Lcom/adyen/checkout/googlepay/internal/data/model/IsReadyToPayRequestModel;", "createIsReadyToPayRequestModel", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;)Lcom/adyen/checkout/googlepay/internal/data/model/IsReadyToPayRequestModel;", "Lcom/adyen/checkout/googlepay/internal/data/model/PaymentDataRequestModel;", "createPaymentDataRequestModel", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;)Lcom/adyen/checkout/googlepay/internal/data/model/PaymentDataRequestModel;", "Lcom/adyen/checkout/googlepay/MerchantInfo;", "addSoftwareInfo", "(Lcom/adyen/checkout/googlepay/MerchantInfo;Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;)Lcom/adyen/checkout/googlepay/MerchantInfo;", "Lcom/adyen/checkout/components/core/internal/util/CheckoutPlatform;", "Lcom/adyen/checkout/googlepay/internal/util/GooglePayUtils$GooglePayPlatform;", "toGooglePayPlatform", "(Lcom/adyen/checkout/components/core/internal/util/CheckoutPlatform;)Lcom/adyen/checkout/googlepay/internal/util/GooglePayUtils$GooglePayPlatform;", "Lcom/adyen/checkout/googlepay/internal/data/model/GooglePayPaymentMethodModel;", "createCardPaymentMethod", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;)Lcom/adyen/checkout/googlepay/internal/data/model/GooglePayPaymentMethodModel;", "Lcom/adyen/checkout/googlepay/internal/data/model/CardParameters;", "createCardParameters", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;)Lcom/adyen/checkout/googlepay/internal/data/model/CardParameters;", "Lcom/adyen/checkout/googlepay/internal/data/model/PaymentMethodTokenizationSpecification;", "createTokenizationSpecification", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;)Lcom/adyen/checkout/googlepay/internal/data/model/PaymentMethodTokenizationSpecification;", "Lcom/adyen/checkout/googlepay/internal/data/model/TokenizationParameters;", "createGatewayParameters", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;)Lcom/adyen/checkout/googlepay/internal/data/model/TokenizationParameters;", "Lcom/adyen/checkout/googlepay/internal/data/model/TransactionInfoModel;", "createTransactionInfo", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;)Lcom/adyen/checkout/googlepay/internal/data/model/TransactionInfoModel;", "Le10/u;", "createWalletOptions", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;)Le10/u;", "Le10/f;", "createIsReadyToPayRequest", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;)Le10/f;", "Le10/m;", "createPaymentDataRequest", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;)Le10/m;", "Le10/l;", "paymentData", "", "findToken", "(Le10/l;)Ljava/lang/String;", Action.PAYMENT_METHOD_TYPE, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, PaymentMethodDetails.SDK_DATA, "Lcom/adyen/checkout/components/core/paymentmethod/GooglePayPaymentMethod;", "createGooglePayPaymentMethod", "(Le10/l;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/paymentmethod/GooglePayPaymentMethod;", "", "getAllowedPaymentMethods$googlepay_release", "(Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayComponentParams;)Ljava/util/List;", "getAllowedPaymentMethods", "Ljava/text/DecimalFormat;", "GOOGLE_PAY_DECIMAL_FORMAT", "Ljava/text/DecimalFormat;", "", "GOOGLE_PAY_DECIMAL_SCALE", "I", "MAJOR_API_VERSION", "MINOT_API_VERSION", "PAYMENT_TYPE_CARD", "Ljava/lang/String;", GooglePayUtils.PAYMENT_GATEWAY, "ADYEN_GATEWAY", "PAYMENT_METHOD_DATA", "INFO", "CARD_NETWORK", "TOKENIZATION_DATA", "TOKEN", GooglePayUtils.NOT_CURRENTLY_KNOWN, "GooglePayPlatform", "IntegrationType", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGooglePayUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayUtils.kt\ncom/adyen/checkout/googlepay/internal/util/GooglePayUtils\n+ 2 AdyenLog.kt\ncom/adyen/checkout/core/internal/util/AdyenLogKt\n+ 3 RunCompileOnly.kt\ncom/adyen/checkout/core/internal/util/RunCompileOnlyKt\n*L\n1#1,274:1\n21#2,12:275\n44#2,4:291\n16#3,4:287\n20#3,5:295\n*S KotlinDebug\n*F\n+ 1 GooglePayUtils.kt\ncom/adyen/checkout/googlepay/internal/util/GooglePayUtils\n*L\n156#1:275,12\n159#1:291,4\n159#1:287,4\n159#1:295,5\n*E\n"})
public final class GooglePayUtils {

    @NotNull
    private static final String ADYEN_GATEWAY = "adyen";

    @NotNull
    private static final String CARD_NETWORK = "cardNetwork";
    private static final int GOOGLE_PAY_DECIMAL_SCALE = 2;

    @NotNull
    private static final String INFO = "info";
    private static final int MAJOR_API_VERSION = 2;
    private static final int MINOT_API_VERSION = 0;

    @NotNull
    private static final String NOT_CURRENTLY_KNOWN = "NOT_CURRENTLY_KNOWN";

    @NotNull
    private static final String PAYMENT_GATEWAY = "PAYMENT_GATEWAY";

    @NotNull
    private static final String PAYMENT_METHOD_DATA = "paymentMethodData";

    @NotNull
    private static final String PAYMENT_TYPE_CARD = "CARD";

    @NotNull
    private static final String TOKEN = "token";

    @NotNull
    private static final String TOKENIZATION_DATA = "tokenizationData";

    @NotNull
    public static final GooglePayUtils INSTANCE = new GooglePayUtils();

    @NotNull
    private static final DecimalFormat GOOGLE_PAY_DECIMAL_FORMAT = new DecimalFormat("0.##", new DecimalFormatSymbols(Locale.ROOT));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/util/GooglePayUtils$GooglePayPlatform;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ANDROID", "FLUTTER", "REACT_NATIVE", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GooglePayPlatform {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ GooglePayPlatform[] $VALUES;
        public static final GooglePayPlatform ANDROID = new GooglePayPlatform("ANDROID", 0, AnalyticsPlatformParams.channel);
        public static final GooglePayPlatform FLUTTER = new GooglePayPlatform("FLUTTER", 1, "flutter");
        public static final GooglePayPlatform REACT_NATIVE = new GooglePayPlatform("REACT_NATIVE", 2, "react-native");

        @NotNull
        private final String value;

        private static final /* synthetic */ GooglePayPlatform[] $values() {
            return new GooglePayPlatform[]{ANDROID, FLUTTER, REACT_NATIVE};
        }

        static {
            GooglePayPlatform[] googlePayPlatformArr$values = $values();
            $VALUES = googlePayPlatformArr$values;
            $ENTRIES = n.w(googlePayPlatformArr$values);
        }

        private GooglePayPlatform(String str, int i11, String str2) {
            this.value = str2;
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static GooglePayPlatform valueOf(String str) {
            return (GooglePayPlatform) Enum.valueOf(GooglePayPlatform.class, str);
        }

        public static GooglePayPlatform[] values() {
            return (GooglePayPlatform[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/util/GooglePayUtils$IntegrationType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DROP_IN", "COMPONENTS", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IntegrationType {
        private static final /* synthetic */ a80.a $ENTRIES;
        private static final /* synthetic */ IntegrationType[] $VALUES;

        @NotNull
        private final String value;
        public static final IntegrationType DROP_IN = new IntegrationType("DROP_IN", 0, "adyen-dropin");
        public static final IntegrationType COMPONENTS = new IntegrationType("COMPONENTS", 1, "adyen-components");

        private static final /* synthetic */ IntegrationType[] $values() {
            return new IntegrationType[]{DROP_IN, COMPONENTS};
        }

        static {
            IntegrationType[] integrationTypeArr$values = $values();
            $VALUES = integrationTypeArr$values;
            $ENTRIES = n.w(integrationTypeArr$values);
        }

        private IntegrationType(String str, int i11, String str2) {
            this.value = str2;
        }

        @NotNull
        public static a80.a getEntries() {
            return $ENTRIES;
        }

        public static IntegrationType valueOf(String str) {
            return (IntegrationType) Enum.valueOf(IntegrationType.class, str);
        }

        public static IntegrationType[] values() {
            return (IntegrationType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckoutPlatform.values().length];
            try {
                iArr[CheckoutPlatform.ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutPlatform.FLUTTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckoutPlatform.REACT_NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private GooglePayUtils() {
    }

    private final MerchantInfo addSoftwareInfo(MerchantInfo merchantInfo, GooglePayComponentParams googlePayComponentParams) {
        MerchantInfo merchantInfoCopy$default;
        IntegrationType integrationType = googlePayComponentParams.isCreatedByDropIn() ? IntegrationType.DROP_IN : IntegrationType.COMPONENTS;
        CheckoutPlatformParams checkoutPlatformParams = CheckoutPlatformParams.INSTANCE;
        SoftwareInfo softwareInfo = new SoftwareInfo(k.m(toGooglePayPlatform(checkoutPlatformParams.getPlatform()).getValue(), ExpiryDateInput.SEPARATOR, integrationType.getValue()), checkoutPlatformParams.getVersion());
        return (merchantInfo == null || (merchantInfoCopy$default = MerchantInfo.copy$default(merchantInfo, null, null, softwareInfo, 3, null)) == null) ? new MerchantInfo(null, null, softwareInfo, 3, null) : merchantInfoCopy$default;
    }

    private final CardParameters createCardParameters(GooglePayComponentParams params) {
        return new CardParameters(params.getAllowedAuthMethods(), params.getAllowedCardNetworks(), params.isAllowPrepaidCards(), params.isAllowCreditCards(), params.getAllowedIssuerCountryCodes(), params.getBlockedIssuerCountryCodes(), params.isAssuranceDetailsRequired(), params.isBillingAddressRequired(), params.getBillingAddressParameters());
    }

    private final GooglePayPaymentMethodModel createCardPaymentMethod(GooglePayComponentParams params) {
        return new GooglePayPaymentMethodModel(PAYMENT_TYPE_CARD, createCardParameters(params), createTokenizationSpecification(params));
    }

    private final TokenizationParameters createGatewayParameters(GooglePayComponentParams params) {
        return new TokenizationParameters(ADYEN_GATEWAY, params.getGatewayMerchantId());
    }

    private final IsReadyToPayRequestModel createIsReadyToPayRequestModel(GooglePayComponentParams params) {
        return new IsReadyToPayRequestModel(2, 0, getAllowedPaymentMethods$googlepay_release(params), params.isExistingPaymentMethodRequired());
    }

    private final PaymentDataRequestModel createPaymentDataRequestModel(GooglePayComponentParams params) {
        return new PaymentDataRequestModel(2, 0, addSoftwareInfo(params.getMerchantInfo(), params), getAllowedPaymentMethods$googlepay_release(params), createTransactionInfo(params), params.isEmailRequired(), params.isShippingAddressRequired(), params.getShippingAddressParameters());
    }

    private final PaymentMethodTokenizationSpecification createTokenizationSpecification(GooglePayComponentParams params) {
        return new PaymentMethodTokenizationSpecification(PAYMENT_GATEWAY, createGatewayParameters(params));
    }

    private final TransactionInfoModel createTransactionInfo(GooglePayComponentParams params) {
        TransactionInfoModel transactionInfoModel = new TransactionInfoModel(params.getAmount().getCurrency(), params.getCountryCode(), null, params.getTotalPriceStatus(), null, null, params.getCheckoutOption(), 52, null);
        if (!Intrinsics.areEqual(params.getTotalPriceStatus(), NOT_CURRENTLY_KNOWN)) {
            transactionInfoModel.setTotalPrice(GOOGLE_PAY_DECIMAL_FORMAT.format(AmountFormat.toBigDecimal(params.getAmount()).setScale(2, RoundingMode.HALF_UP)));
        }
        return transactionInfoModel;
    }

    private final GooglePayPlatform toGooglePayPlatform(CheckoutPlatform checkoutPlatform) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[checkoutPlatform.ordinal()];
        if (i11 == 1) {
            return GooglePayPlatform.ANDROID;
        }
        if (i11 == 2) {
            return GooglePayPlatform.FLUTTER;
        }
        if (i11 == 3) {
            return GooglePayPlatform.REACT_NATIVE;
        }
        e40.a.f();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5 A[PHI: r0 r5 r14
      0x00a5: PHI (r0v5 com.adyen.checkout.core.AdyenLogLevel) = (r0v4 com.adyen.checkout.core.AdyenLogLevel), (r0v7 com.adyen.checkout.core.AdyenLogLevel) binds: [B:27:0x00a3, B:30:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r5v4 com.adyen.checkout.core.AdyenLogger$Companion) = (r5v3 com.adyen.checkout.core.AdyenLogger$Companion), (r5v6 com.adyen.checkout.core.AdyenLogger$Companion) binds: [B:27:0x00a3, B:30:0x00b9] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r14v3 java.lang.Throwable) = (r14v2 java.lang.Throwable), (r14v4 java.lang.Throwable) binds: [B:27:0x00a3, B:30:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.checkout.components.core.paymentmethod.GooglePayPaymentMethod createGooglePayPaymentMethod(@org.jetbrains.annotations.Nullable e10.l r14, @org.jetbrains.annotations.Nullable java.lang.String r15, @org.jetbrains.annotations.Nullable java.lang.String r16, @org.jetbrains.annotations.Nullable java.lang.String r17) {
        /*
            r13 = this;
            java.lang.String r1 = "Class not found. Are you missing a dependency?"
            java.lang.String r2 = "CO.runCompileOnly"
            java.lang.String r0 = "cardNetwork"
            r3 = 0
            if (r14 != 0) goto La
            return r3
        La:
            com.adyen.checkout.components.core.paymentmethod.GooglePayPaymentMethod r4 = new com.adyen.checkout.components.core.paymentmethod.GooglePayPaymentMethod
            r11 = 56
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r15
            r6 = r16
            r7 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4c
            java.lang.String r14 = r14.f15526g     // Catch: org.json.JSONException -> L4c
            r5.<init>(r14)     // Catch: org.json.JSONException -> L4c
            java.lang.String r14 = "paymentMethodData"
            org.json.JSONObject r14 = r5.getJSONObject(r14)     // Catch: org.json.JSONException -> L4c
            java.lang.String r5 = "tokenizationData"
            org.json.JSONObject r5 = r14.getJSONObject(r5)     // Catch: org.json.JSONException -> L4c
            java.lang.String r6 = "token"
            java.lang.String r5 = r5.getString(r6)     // Catch: org.json.JSONException -> L4c
            r4.setGooglePayToken(r5)     // Catch: org.json.JSONException -> L4c
            java.lang.String r5 = "info"
            org.json.JSONObject r14 = r14.optJSONObject(r5)     // Catch: org.json.JSONException -> L4c
            if (r14 == 0) goto L8a
            boolean r5 = r14.isNull(r0)     // Catch: org.json.JSONException -> L4c
            if (r5 != 0) goto L8a
            java.lang.String r14 = r14.getString(r0)     // Catch: org.json.JSONException -> L4c
            r4.setGooglePayCardNetwork(r14)     // Catch: org.json.JSONException -> L4c
            goto L8a
        L4c:
            r0 = move-exception
            r14 = r0
            com.adyen.checkout.core.AdyenLogLevel r0 = com.adyen.checkout.core.AdyenLogLevel.ERROR
            com.adyen.checkout.core.AdyenLogger$Companion r5 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r6 = r5.getLogger()
            boolean r6 = r6.shouldLog(r0)
            if (r6 == 0) goto L8a
            java.lang.Class<com.adyen.checkout.components.core.paymentmethod.GooglePayPaymentMethod> r6 = com.adyen.checkout.components.core.paymentmethod.GooglePayPaymentMethod.class
            java.lang.String r6 = r6.getName()
            r7 = 36
            java.lang.String r7 = kotlin.text.StringsKt.Y(r6, r7)
            r8 = 46
            java.lang.String r7 = kotlin.text.StringsKt.W(r8, r7, r7)
            int r8 = r7.length()
            if (r8 != 0) goto L75
            goto L7b
        L75:
            java.lang.String r6 = "Kt"
            java.lang.String r6 = kotlin.text.StringsKt.O(r7, r6)
        L7b:
            java.lang.String r7 = "CO."
            java.lang.String r6 = r7.concat(r6)
            com.adyen.checkout.core.AdyenLogger r5 = r5.getLogger()
            java.lang.String r7 = "Failed to find Google Pay token."
            r5.log(r0, r6, r7, r14)
        L8a:
            com.adyen.threeds2.ThreeDS2Service r14 = com.adyen.threeds2.ThreeDS2Service.INSTANCE     // Catch: java.lang.NoClassDefFoundError -> L91 java.lang.ClassNotFoundException -> L94
            java.lang.String r3 = r14.getSDKVersion()     // Catch: java.lang.NoClassDefFoundError -> L91 java.lang.ClassNotFoundException -> L94
            goto Lbc
        L91:
            r0 = move-exception
            r14 = r0
            goto L97
        L94:
            r0 = move-exception
            r14 = r0
            goto Lad
        L97:
            com.adyen.checkout.core.AdyenLogLevel r0 = com.adyen.checkout.core.AdyenLogLevel.WARN
            com.adyen.checkout.core.AdyenLogger$Companion r5 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r6 = r5.getLogger()
            boolean r6 = r6.shouldLog(r0)
            if (r6 == 0) goto Lbc
        La5:
            com.adyen.checkout.core.AdyenLogger r5 = r5.getLogger()
            r5.log(r0, r2, r1, r14)
            goto Lbc
        Lad:
            com.adyen.checkout.core.AdyenLogLevel r0 = com.adyen.checkout.core.AdyenLogLevel.WARN
            com.adyen.checkout.core.AdyenLogger$Companion r5 = com.adyen.checkout.core.AdyenLogger.INSTANCE
            com.adyen.checkout.core.AdyenLogger r6 = r5.getLogger()
            boolean r6 = r6.shouldLog(r0)
            if (r6 == 0) goto Lbc
            goto La5
        Lbc:
            r4.setThreeDS2SdkVersion(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.checkout.googlepay.internal.util.GooglePayUtils.createGooglePayPaymentMethod(e10.l, java.lang.String, java.lang.String, java.lang.String):com.adyen.checkout.components.core.paymentmethod.GooglePayPaymentMethod");
    }

    @NotNull
    public final f createIsReadyToPayRequest(@NotNull GooglePayComponentParams params) {
        params.getClass();
        String string = IsReadyToPayRequestModel.SERIALIZER.serialize(createIsReadyToPayRequestModel(params)).toString();
        string.getClass();
        f fVar = new f();
        fVar.f15491f = string;
        return fVar;
    }

    @NotNull
    public final m createPaymentDataRequest(@NotNull GooglePayComponentParams params) {
        params.getClass();
        String string = PaymentDataRequestModel.SERIALIZER.serialize(createPaymentDataRequestModel(params)).toString();
        string.getClass();
        m mVar = new m();
        mVar.f15536i = true;
        mVar.f15537j = string;
        return mVar;
    }

    @NotNull
    public final u createWalletOptions(@NotNull GooglePayComponentParams params) {
        params.getClass();
        t tVar = new t();
        tVar.g(params.getGooglePayEnvironment());
        return new u(tVar);
    }

    @NotNull
    public final String findToken(@NotNull l paymentData) throws CheckoutException {
        paymentData.getClass();
        try {
            String string = new JSONObject(paymentData.f15526g).getJSONObject(PAYMENT_METHOD_DATA).getJSONObject(TOKENIZATION_DATA).getString(TOKEN);
            string.getClass();
            return string;
        } catch (JSONException e5) {
            throw new CheckoutException("Failed to find Google Pay token.", e5);
        }
    }

    @NotNull
    public final List<GooglePayPaymentMethodModel> getAllowedPaymentMethods$googlepay_release(@NotNull GooglePayComponentParams params) {
        params.getClass();
        return c0.c(createCardPaymentMethod(params));
    }
}
