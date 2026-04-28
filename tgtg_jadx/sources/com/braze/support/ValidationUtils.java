package com.braze.support;

import com.appsflyer.AppsFlyerProperties;
import com.braze.storage.i3;
import com.braze.support.BrazeLogger;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0016\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b%\u0010\bJ\u0019\u0010(\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b'\u0010\bR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u00128\u0006X\u0087T¢\u0006\f\n\u0004\b1\u00102\u0012\u0004\b3\u0010\u0003R\u0014\u00104\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00105\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00100R\u0014\u00106\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u00107\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00100¨\u00068"}, d2 = {"Lcom/braze/support/ValidationUtils;", "", "<init>", "()V", "", "emailAddress", "", "isValidEmailAddress", "(Ljava/lang/String;)Z", "phoneNumber", "isValidPhoneNumber", "field", "ensureBrazeFieldLength", "(Ljava/lang/String;)Ljava/lang/String;", "productId", AppsFlyerProperties.CURRENCY_CODE, "Ljava/math/BigDecimal;", "price", "", "quantity", "Lcom/braze/storage/i3;", "serverConfigStorageProvider", "isValidLogPurchaseInput", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;ILcom/braze/storage/i3;)Z", "eventName", "isValidLogCustomEventInput", "(Ljava/lang/String;Lcom/braze/storage/i3;)Z", "campaignId", "pageId", "isValidPushStoryClickInput", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "latitude", "longitude", "isValidLocation", "(DD)Z", "lineId", "isValidLineId", "customEndpoint", "isInvalidCustomEndpoint$android_sdk_base_release", "isInvalidCustomEndpoint", "", "VALID_CURRENCY_CODES", "Ljava/util/Set;", "getVALID_CURRENCY_CODES", "()Ljava/util/Set;", "Lkotlin/text/Regex;", "EMAIL_ADDRESS_REGEX", "Lkotlin/text/Regex;", "EMAIL_ADDRESS_MAX_LENGTH", "I", "getEMAIL_ADDRESS_MAX_LENGTH$annotations", "LINE_ID_MAX_LENGTH", "PHONE_NUMBER_REGEX", "BRAZE_STRING_MAX_LENGTH", "ENDPOINT_REGEX", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidationUtils {
    public static final int BRAZE_STRING_MAX_LENGTH = 255;
    public static final int EMAIL_ADDRESS_MAX_LENGTH = 255;
    public static final int LINE_ID_MAX_LENGTH = 33;
    public static final ValidationUtils INSTANCE = new ValidationUtils();
    private static final Set<String> VALID_CURRENCY_CODES = y.W(new String[]{"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL"});
    private static final Regex EMAIL_ADDRESS_REGEX = new Regex(".+@.+\\..+");
    private static final Regex PHONE_NUMBER_REGEX = new Regex("^[0-9 .\\(\\)\\+\\-]+$");
    private static final Regex ENDPOINT_REGEX = new Regex("rest\\.[a-z]+-[0-9]+\\.braze\\.");

    private ValidationUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v4, types: [T, java.lang.String] */
    public static final String ensureBrazeFieldLength(String field) {
        if (field == null || StringsKt.H(field)) {
            return "";
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? string = StringsKt.e0(field).toString();
        objectRef.element = string;
        if (string.length() > 255) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ga0.c(objectRef, 2), 6, (Object) null);
            objectRef.element = ((String) objectRef.element).substring(0, 255);
        }
        return (String) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final String ensureBrazeFieldLength$lambda$0(Ref.ObjectRef objectRef) {
        return r8.k.h(((String) objectRef.element).length(), "Provided string field is too long [", "]. The max length is 255, truncating provided field.");
    }

    public static final boolean isInvalidCustomEndpoint$android_sdk_base_release(String customEndpoint) {
        if (customEndpoint != null) {
            return ENDPOINT_REGEX.a(customEndpoint);
        }
        return false;
    }

    public static final boolean isValidEmailAddress(String emailAddress) {
        if (emailAddress == null || emailAddress.length() == 0 || emailAddress.length() > 255) {
            return false;
        }
        return EMAIL_ADDRESS_REGEX.e(emailAddress);
    }

    public static final boolean isValidLineId(String lineId) {
        return lineId != null && lineId.length() <= 33;
    }

    public static final boolean isValidLocation(double latitude, double longitude) {
        return latitude < 90.0d && latitude > -90.0d && longitude < 180.0d && longitude > -180.0d;
    }

    public static final boolean isValidLogCustomEventInput(String eventName, i3 serverConfigStorageProvider) {
        serverConfigStorageProvider.getClass();
        if (eventName == null || StringsKt.H(eventName)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.e(9), 6, (Object) null);
            return false;
        }
        if (!serverConfigStorageProvider.f().contains(eventName)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.d(eventName, 10), 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogCustomEventInput$lambda$8() {
        return "The custom event name cannot be null or contain only whitespaces. Invalid custom event.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogCustomEventInput$lambda$9(String str) {
        return a0.p("The custom event is a blocklisted custom event: ", str, ". Invalid custom event.");
    }

    public static final boolean isValidLogPurchaseInput(String productId, String currencyCode, BigDecimal price, int quantity, i3 serverConfigStorageProvider) {
        serverConfigStorageProvider.getClass();
        if (productId == null || StringsKt.H(productId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.e(8), 6, (Object) null);
            return false;
        }
        if (serverConfigStorageProvider.g().contains(productId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.d(productId, 11), 6, (Object) null);
            return false;
        }
        if (currencyCode == null || StringsKt.H(currencyCode)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.e(7), 6, (Object) null);
            return false;
        }
        Set<String> set = VALID_CURRENCY_CODES;
        String string = StringsKt.e0(currencyCode).toString();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        if (!set.contains(upperCase)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.d(currencyCode, 12), 6, (Object) null);
            return false;
        }
        if (price == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.e(12), 6, (Object) null);
            return false;
        }
        if (quantity <= 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.l(quantity, 16), 6, (Object) null);
            return false;
        }
        if (quantity <= 100) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new com.braze.models.inappmessage.l(quantity, 17), 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$1() {
        return "The productId is empty, not logging in-app purchase to Braze.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$2(String str) {
        return e0.f.k("The productId is a blocklisted productId: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$3() {
        return "The currencyCode is empty. Expected one of " + VALID_CURRENCY_CODES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$4(String str) {
        return "The currencyCode " + str + " is invalid. Expected one of " + VALID_CURRENCY_CODES;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$5() {
        return "The price is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$6(int i11) {
        return r8.k.h(i11, "The requested purchase quantity of ", " is less than one. Invalid purchase");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidLogPurchaseInput$lambda$7(int i11) {
        return r8.k.h(i11, "The requested purchase quantity of ", " is greater than the maximum of 100");
    }

    public static final boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && PHONE_NUMBER_REGEX.e(phoneNumber);
    }

    public static final boolean isValidPushStoryClickInput(String campaignId, String pageId) {
        if (campaignId == null || StringsKt.H(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.e(11), 6, (Object) null);
            return false;
        }
        if (pageId != null && !StringsKt.H(pageId)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new mw.e(10), 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidPushStoryClickInput$lambda$10() {
        return "Campaign ID cannot be null or blank";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isValidPushStoryClickInput$lambda$11() {
        return "Push story page ID cannot be null or blank";
    }

    public final Set<String> getVALID_CURRENCY_CODES() {
        return VALID_CURRENCY_CODES;
    }

    public static /* synthetic */ void getEMAIL_ADDRESS_MAX_LENGTH$annotations() {
    }
}
