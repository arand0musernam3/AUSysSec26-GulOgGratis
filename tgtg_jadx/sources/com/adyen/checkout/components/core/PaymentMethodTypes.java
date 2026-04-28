package com.adyen.checkout.components.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bA\n\u0002\u0010 \n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\"\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040F8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010\u0002\u001a\u0004\bH\u0010IR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040F¢\u0006\b\n\u0000\u001a\u0004\bK\u0010IR\u000e\u0010L\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040F¢\u0006\b\n\u0000\u001a\u0004\bO\u0010IR\u000e\u0010P\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/adyen/checkout/components/core/PaymentMethodTypes;", "", "()V", "ACH", "", "AFTER_PAY", "BACS", "BCMC", "BCMC_QR", "BLIK", "BOLETOBANCARIO", "BOLETOBANCARIO_BANCODOBRASIL", "BOLETOBANCARIO_BRADESCO", "BOLETOBANCARIO_HSBC", "BOLETOBANCARIO_ITAU", "BOLETOBANCARIO_SANTANDER", "BOLETO_PRIMEIRO_PAY", "CASH_APP_PAY", "DOKU", "DOKU_ALFMART", "DOKU_ATM_MANDIRI_VA", "DOKU_BCA_VA", "DOKU_BNI_VA", "DOKU_BRI_VA", "DOKU_CIMB_VA", "DOKU_DANAMON_VA", "DOKU_INDOMARET", "DOKU_MANDIRI_VA", "DOKU_PERMATA_LITE_ATM", "DOKU_SINARMAS_VA", "DOKU_WALLET", "DOTPAY", "DRAGONPAY_EBANKING", "DRAGONPAY_OTC_BANKING", "DRAGONPAY_OTC_NON_BANKING", "DRAGONPAY_OTC_PHILIPPINES", "DUIT_NOW", "ECONTEXT_ATM", "ECONTEXT_ONLINE", "ECONTEXT_SEVEN_ELEVEN", "ECONTEXT_STORES", "ENTERCASH", "EPS", "GIFTCARD", "GOOGLE_PAY", "GOOGLE_PAY_LEGACY", "IDEAL", "MB_WAY", "MEAL_VOUCHER_FR", "MEAL_VOUCHER_FR_GROUPEUP", "MEAL_VOUCHER_FR_NATIXIS", "MEAL_VOUCHER_FR_SODEXO", "MOLPAY_MALAYSIA", "MOLPAY_THAILAND", "MOLPAY_VIETNAM", "MULTIBANCO", "ONLINE_BANKING_CZ", "ONLINE_BANKING_PL", "ONLINE_BANKING_SK", "OPEN_BANKING", "OXXO", "PAY_BY_BANK", "PAY_BY_BANK_US", "PAY_NOW", "PAY_TO", "PIX", "PROMPT_PAY", "SCHEME", "SEPA", "SUPPORTED_ACTION_ONLY_PAYMENT_METHODS", "", "getSUPPORTED_ACTION_ONLY_PAYMENT_METHODS$annotations", "getSUPPORTED_ACTION_ONLY_PAYMENT_METHODS", "()Ljava/util/List;", "SUPPORTED_PAYMENT_METHODS", "getSUPPORTED_PAYMENT_METHODS", "TWINT", "UNKNOWN", "UNSUPPORTED_PAYMENT_METHODS", "getUNSUPPORTED_PAYMENT_METHODS", "UPI", "UPI_COLLECT", "UPI_INTENT", "UPI_QR", "WECHAT_PAY_MINI_PROGRAM", "WECHAT_PAY_QR", "WECHAT_PAY_SDK", "WECHAT_PAY_WEB", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentMethodTypes {

    @NotNull
    public static final String ACH = "ach";

    @NotNull
    public static final String BACS = "directdebit_GB";

    @NotNull
    public static final String BLIK = "blik";

    @NotNull
    public static final String CASH_APP_PAY = "cashapp";

    @NotNull
    public static final String DOTPAY = "dotpay";

    @NotNull
    public static final String ECONTEXT_ATM = "econtext_atm";

    @NotNull
    public static final String ECONTEXT_ONLINE = "econtext_online";

    @NotNull
    public static final String ECONTEXT_SEVEN_ELEVEN = "econtext_seven_eleven";

    @NotNull
    public static final String ECONTEXT_STORES = "econtext_stores";

    @NotNull
    public static final String ENTERCASH = "entercash";

    @NotNull
    public static final String EPS = "eps";

    @NotNull
    public static final String GIFTCARD = "giftcard";

    @NotNull
    public static final String IDEAL = "ideal";

    @NotNull
    public static final String MB_WAY = "mbway";

    @NotNull
    public static final String MEAL_VOUCHER_FR = "mealVoucher_FR";

    @NotNull
    public static final String ONLINE_BANKING_CZ = "onlineBanking_CZ";

    @NotNull
    public static final String ONLINE_BANKING_PL = "onlineBanking_PL";

    @NotNull
    public static final String ONLINE_BANKING_SK = "onlineBanking_SK";

    @NotNull
    public static final String OPEN_BANKING = "openbanking_UK";

    @NotNull
    public static final String PAY_BY_BANK = "paybybank";

    @NotNull
    public static final String PAY_TO = "payto";

    @NotNull
    public static final String SCHEME = "scheme";

    @NotNull
    public static final String SEPA = "sepadirectdebit";

    @NotNull
    public static final String UNKNOWN = "unknown";

    @NotNull
    public static final PaymentMethodTypes INSTANCE = new PaymentMethodTypes();

    @NotNull
    public static final String BCMC = "bcmc";

    @NotNull
    public static final String BOLETOBANCARIO = "boletobancario";

    @NotNull
    public static final String BOLETOBANCARIO_BANCODOBRASIL = "boletobancario_bancodobrasil";

    @NotNull
    public static final String BOLETOBANCARIO_BRADESCO = "boletobancario_bradesco";

    @NotNull
    public static final String BOLETOBANCARIO_HSBC = "boletobancario_hsbc";

    @NotNull
    public static final String BOLETOBANCARIO_ITAU = "boletobancario_itau";

    @NotNull
    public static final String BOLETOBANCARIO_SANTANDER = "boletobancario_santander";

    @NotNull
    public static final String BOLETO_PRIMEIRO_PAY = "primeiropay_boleto";

    @NotNull
    public static final String DUIT_NOW = "duitnow";

    @NotNull
    public static final String GOOGLE_PAY = "googlepay";

    @NotNull
    public static final String GOOGLE_PAY_LEGACY = "paywithgoogle";

    @NotNull
    public static final String MEAL_VOUCHER_FR_GROUPEUP = "mealVoucher_FR_groupeup";

    @NotNull
    public static final String MEAL_VOUCHER_FR_NATIXIS = "mealVoucher_FR_natixis";

    @NotNull
    public static final String MEAL_VOUCHER_FR_SODEXO = "mealVoucher_FR_sodexo";

    @NotNull
    public static final String MOLPAY_MALAYSIA = "molpay_ebanking_fpx_MY";

    @NotNull
    public static final String MOLPAY_THAILAND = "molpay_ebanking_TH";

    @NotNull
    public static final String MOLPAY_VIETNAM = "molpay_ebanking_VN";

    @NotNull
    public static final String MULTIBANCO = "multibanco";

    @NotNull
    public static final String PAY_BY_BANK_US = "paybybank_AIS_DD";

    @NotNull
    public static final String PAY_NOW = "paynow";

    @NotNull
    public static final String PIX = "pix";

    @NotNull
    public static final String PROMPT_PAY = "promptpay";

    @NotNull
    public static final String TWINT = "twint";

    @NotNull
    public static final String UPI = "upi";

    @NotNull
    public static final String UPI_COLLECT = "upi_collect";

    @NotNull
    public static final String UPI_INTENT = "upi_intent";

    @NotNull
    public static final String UPI_QR = "upi_qr";

    @NotNull
    public static final String WECHAT_PAY_SDK = "wechatpaySDK";

    @NotNull
    private static final List<String> SUPPORTED_PAYMENT_METHODS = d0.h("ach", "directdebit_GB", BCMC, "blik", BOLETOBANCARIO, BOLETOBANCARIO_BANCODOBRASIL, BOLETOBANCARIO_BRADESCO, BOLETOBANCARIO_HSBC, BOLETOBANCARIO_ITAU, BOLETOBANCARIO_SANTANDER, BOLETO_PRIMEIRO_PAY, "cashapp", "dotpay", DUIT_NOW, "econtext_atm", "econtext_online", "econtext_seven_eleven", "econtext_stores", "entercash", "eps", "giftcard", GOOGLE_PAY, GOOGLE_PAY_LEGACY, "ideal", "mbway", MEAL_VOUCHER_FR_GROUPEUP, MEAL_VOUCHER_FR_NATIXIS, MEAL_VOUCHER_FR_SODEXO, MOLPAY_MALAYSIA, MOLPAY_THAILAND, MOLPAY_VIETNAM, MULTIBANCO, "onlineBanking_CZ", "onlineBanking_PL", "onlineBanking_SK", "openbanking_UK", "paybybank", PAY_BY_BANK_US, PAY_NOW, "payto", PIX, PROMPT_PAY, "scheme", "sepadirectdebit", TWINT, UPI, UPI_COLLECT, UPI_INTENT, UPI_QR, WECHAT_PAY_SDK);

    @NotNull
    private static final List<String> SUPPORTED_ACTION_ONLY_PAYMENT_METHODS = d0.h(DUIT_NOW, PAY_NOW, PIX, PROMPT_PAY, TWINT, WECHAT_PAY_SDK, MULTIBANCO);

    @NotNull
    public static final String AFTER_PAY = "afterpay_default";

    @NotNull
    public static final String BCMC_QR = "bcmc_mobile_QR";

    @NotNull
    public static final String DOKU = "doku";

    @NotNull
    public static final String DOKU_ALFMART = "doku_alfamart";

    @NotNull
    public static final String DOKU_ATM_MANDIRI_VA = "doku_atm_mandiri_va";

    @NotNull
    public static final String DOKU_BCA_VA = "doku_bca_va";

    @NotNull
    public static final String DOKU_BNI_VA = "doku_bni_va";

    @NotNull
    public static final String DOKU_BRI_VA = "doku_bri_va";

    @NotNull
    public static final String DOKU_CIMB_VA = "doku_cimb_va";

    @NotNull
    public static final String DOKU_DANAMON_VA = "doku_danamon_va";

    @NotNull
    public static final String DOKU_INDOMARET = "doku_indomaret";

    @NotNull
    public static final String DOKU_MANDIRI_VA = "doku_mandiri_va";

    @NotNull
    public static final String DOKU_PERMATA_LITE_ATM = "doku_permata_lite_atm";

    @NotNull
    public static final String DOKU_SINARMAS_VA = "doku_sinarmas_va";

    @NotNull
    public static final String DOKU_WALLET = "doku_wallet";

    @NotNull
    public static final String DRAGONPAY_EBANKING = "dragonpay_ebanking";

    @NotNull
    public static final String DRAGONPAY_OTC_BANKING = "dragonpay_otc_banking";

    @NotNull
    public static final String DRAGONPAY_OTC_NON_BANKING = "dragonpay_otc_non_banking";

    @NotNull
    public static final String DRAGONPAY_OTC_PHILIPPINES = "dragonpay_otc_philippines";

    @NotNull
    public static final String OXXO = "oxxo";

    @NotNull
    public static final String WECHAT_PAY_MINI_PROGRAM = "wechatpayMiniProgram";

    @NotNull
    public static final String WECHAT_PAY_QR = "wechatpayQR";

    @NotNull
    public static final String WECHAT_PAY_WEB = "wechatpayWeb";

    @NotNull
    private static final List<String> UNSUPPORTED_PAYMENT_METHODS = d0.h(AFTER_PAY, BCMC_QR, DOKU, DOKU_ALFMART, DOKU_ATM_MANDIRI_VA, DOKU_BCA_VA, DOKU_BNI_VA, DOKU_BRI_VA, DOKU_CIMB_VA, DOKU_DANAMON_VA, DOKU_INDOMARET, DOKU_MANDIRI_VA, DOKU_PERMATA_LITE_ATM, DOKU_SINARMAS_VA, DOKU_WALLET, DRAGONPAY_EBANKING, DRAGONPAY_OTC_BANKING, DRAGONPAY_OTC_NON_BANKING, DRAGONPAY_OTC_PHILIPPINES, OXXO, WECHAT_PAY_MINI_PROGRAM, WECHAT_PAY_QR, WECHAT_PAY_WEB);

    private PaymentMethodTypes() {
    }

    @NotNull
    public final List<String> getSUPPORTED_ACTION_ONLY_PAYMENT_METHODS() {
        return SUPPORTED_ACTION_ONLY_PAYMENT_METHODS;
    }

    @NotNull
    public final List<String> getSUPPORTED_PAYMENT_METHODS() {
        return SUPPORTED_PAYMENT_METHODS;
    }

    @NotNull
    public final List<String> getUNSUPPORTED_PAYMENT_METHODS() {
        return UNSUPPORTED_PAYMENT_METHODS;
    }

    @d
    public static /* synthetic */ void getSUPPORTED_ACTION_ONLY_PAYMENT_METHODS$annotations() {
    }
}
