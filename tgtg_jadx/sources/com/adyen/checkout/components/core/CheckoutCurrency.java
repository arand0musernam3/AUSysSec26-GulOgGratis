package com.adyen.checkout.components.core;

import a80.a;
import com.adyen.checkout.components.core.internal.util.CurrencyUtils;
import com.adyen.checkout.core.exception.CheckoutException;
import com.app.tgtg.model.local.AppConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b\u0092\u0001\b\u0086\u0081\u0002\u0018\u0000 \u0094\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0094\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001¨\u0006\u0095\u0001"}, d2 = {"Lcom/adyen/checkout/components/core/CheckoutCurrency;", "", "fractionDigits", "", "(Ljava/lang/String;II)V", "getFractionDigits", "()I", "AED", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BMD", "BND", "BOB", "BRL", "BSD", "BWP", "BYN", "BZD", "CAD", "CHF", "CLP", "CNY", "COP", "CRC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "INR", "IQD", "ISK", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LYD", "MAD", "MDL", "MKD", "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SEK", "SGD", "SHP", "SLL", "SLE", "SOS", "SRD", "STN", "SVC", "SZL", "THB", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XCD", "XOF", "XPF", "YER", "ZAR", "ZMW", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CheckoutCurrency {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CheckoutCurrency[] $VALUES;

    @NotNull
    private static final Map<String, CheckoutCurrency> CURRENCIES_HASHMAP;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    private final int fractionDigits;
    public static final CheckoutCurrency AED = new CheckoutCurrency("AED", 0, 2);
    public static final CheckoutCurrency ALL = new CheckoutCurrency("ALL", 1, 2);
    public static final CheckoutCurrency AMD = new CheckoutCurrency("AMD", 2, 2);
    public static final CheckoutCurrency ANG = new CheckoutCurrency("ANG", 3, 2);
    public static final CheckoutCurrency AOA = new CheckoutCurrency("AOA", 4, 2);
    public static final CheckoutCurrency ARS = new CheckoutCurrency("ARS", 5, 2);
    public static final CheckoutCurrency AUD = new CheckoutCurrency("AUD", 6, 2);
    public static final CheckoutCurrency AWG = new CheckoutCurrency("AWG", 7, 2);
    public static final CheckoutCurrency AZN = new CheckoutCurrency("AZN", 8, 2);
    public static final CheckoutCurrency BAM = new CheckoutCurrency("BAM", 9, 2);
    public static final CheckoutCurrency BBD = new CheckoutCurrency("BBD", 10, 2);
    public static final CheckoutCurrency BDT = new CheckoutCurrency("BDT", 11, 2);
    public static final CheckoutCurrency BGN = new CheckoutCurrency("BGN", 12, 2);
    public static final CheckoutCurrency BHD = new CheckoutCurrency("BHD", 13, 3);
    public static final CheckoutCurrency BMD = new CheckoutCurrency("BMD", 14, 2);
    public static final CheckoutCurrency BND = new CheckoutCurrency("BND", 15, 2);
    public static final CheckoutCurrency BOB = new CheckoutCurrency("BOB", 16, 2);
    public static final CheckoutCurrency BRL = new CheckoutCurrency("BRL", 17, 2);
    public static final CheckoutCurrency BSD = new CheckoutCurrency("BSD", 18, 2);
    public static final CheckoutCurrency BWP = new CheckoutCurrency("BWP", 19, 2);
    public static final CheckoutCurrency BYN = new CheckoutCurrency("BYN", 20, 2);
    public static final CheckoutCurrency BZD = new CheckoutCurrency("BZD", 21, 2);
    public static final CheckoutCurrency CAD = new CheckoutCurrency("CAD", 22, 2);
    public static final CheckoutCurrency CHF = new CheckoutCurrency("CHF", 23, 2);
    public static final CheckoutCurrency CLP = new CheckoutCurrency("CLP", 24, 2);
    public static final CheckoutCurrency CNY = new CheckoutCurrency("CNY", 25, 2);
    public static final CheckoutCurrency COP = new CheckoutCurrency("COP", 26, 2);
    public static final CheckoutCurrency CRC = new CheckoutCurrency("CRC", 27, 2);
    public static final CheckoutCurrency CUP = new CheckoutCurrency("CUP", 28, 2);
    public static final CheckoutCurrency CVE = new CheckoutCurrency("CVE", 29, 0);
    public static final CheckoutCurrency CZK = new CheckoutCurrency("CZK", 30, 2);
    public static final CheckoutCurrency DJF = new CheckoutCurrency("DJF", 31, 0);
    public static final CheckoutCurrency DKK = new CheckoutCurrency("DKK", 32, 2);
    public static final CheckoutCurrency DOP = new CheckoutCurrency("DOP", 33, 2);
    public static final CheckoutCurrency DZD = new CheckoutCurrency("DZD", 34, 2);
    public static final CheckoutCurrency EGP = new CheckoutCurrency("EGP", 35, 2);
    public static final CheckoutCurrency ETB = new CheckoutCurrency("ETB", 36, 2);
    public static final CheckoutCurrency EUR = new CheckoutCurrency("EUR", 37, 2);
    public static final CheckoutCurrency FJD = new CheckoutCurrency("FJD", 38, 2);
    public static final CheckoutCurrency FKP = new CheckoutCurrency("FKP", 39, 2);
    public static final CheckoutCurrency GBP = new CheckoutCurrency("GBP", 40, 2);
    public static final CheckoutCurrency GEL = new CheckoutCurrency("GEL", 41, 2);
    public static final CheckoutCurrency GHS = new CheckoutCurrency("GHS", 42, 2);
    public static final CheckoutCurrency GIP = new CheckoutCurrency("GIP", 43, 2);
    public static final CheckoutCurrency GMD = new CheckoutCurrency("GMD", 44, 2);
    public static final CheckoutCurrency GNF = new CheckoutCurrency("GNF", 45, 0);
    public static final CheckoutCurrency GTQ = new CheckoutCurrency("GTQ", 46, 2);
    public static final CheckoutCurrency GYD = new CheckoutCurrency("GYD", 47, 2);
    public static final CheckoutCurrency HKD = new CheckoutCurrency("HKD", 48, 2);
    public static final CheckoutCurrency HNL = new CheckoutCurrency("HNL", 49, 2);
    public static final CheckoutCurrency HRK = new CheckoutCurrency("HRK", 50, 2);
    public static final CheckoutCurrency HTG = new CheckoutCurrency("HTG", 51, 2);
    public static final CheckoutCurrency HUF = new CheckoutCurrency("HUF", 52, 2);
    public static final CheckoutCurrency IDR = new CheckoutCurrency("IDR", 53, 0);
    public static final CheckoutCurrency ILS = new CheckoutCurrency("ILS", 54, 2);
    public static final CheckoutCurrency INR = new CheckoutCurrency("INR", 55, 2);
    public static final CheckoutCurrency IQD = new CheckoutCurrency("IQD", 56, 3);
    public static final CheckoutCurrency ISK = new CheckoutCurrency("ISK", 57, 2);
    public static final CheckoutCurrency JMD = new CheckoutCurrency("JMD", 58, 2);
    public static final CheckoutCurrency JOD = new CheckoutCurrency("JOD", 59, 3);
    public static final CheckoutCurrency JPY = new CheckoutCurrency("JPY", 60, 0);
    public static final CheckoutCurrency KES = new CheckoutCurrency("KES", 61, 2);
    public static final CheckoutCurrency KGS = new CheckoutCurrency("KGS", 62, 2);
    public static final CheckoutCurrency KHR = new CheckoutCurrency("KHR", 63, 2);
    public static final CheckoutCurrency KMF = new CheckoutCurrency("KMF", 64, 0);
    public static final CheckoutCurrency KRW = new CheckoutCurrency("KRW", 65, 0);
    public static final CheckoutCurrency KWD = new CheckoutCurrency("KWD", 66, 3);
    public static final CheckoutCurrency KYD = new CheckoutCurrency("KYD", 67, 2);
    public static final CheckoutCurrency KZT = new CheckoutCurrency("KZT", 68, 2);
    public static final CheckoutCurrency LAK = new CheckoutCurrency("LAK", 69, 2);
    public static final CheckoutCurrency LBP = new CheckoutCurrency("LBP", 70, 2);
    public static final CheckoutCurrency LKR = new CheckoutCurrency("LKR", 71, 2);
    public static final CheckoutCurrency LYD = new CheckoutCurrency("LYD", 72, 3);
    public static final CheckoutCurrency MAD = new CheckoutCurrency("MAD", 73, 2);
    public static final CheckoutCurrency MDL = new CheckoutCurrency("MDL", 74, 2);
    public static final CheckoutCurrency MKD = new CheckoutCurrency("MKD", 75, 2);
    public static final CheckoutCurrency MMK = new CheckoutCurrency("MMK", 76, 2);
    public static final CheckoutCurrency MNT = new CheckoutCurrency("MNT", 77, 2);
    public static final CheckoutCurrency MOP = new CheckoutCurrency("MOP", 78, 2);
    public static final CheckoutCurrency MRU = new CheckoutCurrency("MRU", 79, 2);
    public static final CheckoutCurrency MUR = new CheckoutCurrency("MUR", 80, 2);
    public static final CheckoutCurrency MVR = new CheckoutCurrency("MVR", 81, 2);
    public static final CheckoutCurrency MWK = new CheckoutCurrency("MWK", 82, 2);
    public static final CheckoutCurrency MXN = new CheckoutCurrency("MXN", 83, 2);
    public static final CheckoutCurrency MYR = new CheckoutCurrency("MYR", 84, 2);
    public static final CheckoutCurrency MZN = new CheckoutCurrency("MZN", 85, 2);
    public static final CheckoutCurrency NAD = new CheckoutCurrency("NAD", 86, 2);
    public static final CheckoutCurrency NGN = new CheckoutCurrency("NGN", 87, 2);
    public static final CheckoutCurrency NIO = new CheckoutCurrency("NIO", 88, 2);
    public static final CheckoutCurrency NOK = new CheckoutCurrency("NOK", 89, 2);
    public static final CheckoutCurrency NPR = new CheckoutCurrency("NPR", 90, 2);
    public static final CheckoutCurrency NZD = new CheckoutCurrency("NZD", 91, 2);
    public static final CheckoutCurrency OMR = new CheckoutCurrency("OMR", 92, 3);
    public static final CheckoutCurrency PAB = new CheckoutCurrency("PAB", 93, 2);
    public static final CheckoutCurrency PEN = new CheckoutCurrency("PEN", 94, 2);
    public static final CheckoutCurrency PGK = new CheckoutCurrency("PGK", 95, 2);
    public static final CheckoutCurrency PHP = new CheckoutCurrency("PHP", 96, 2);
    public static final CheckoutCurrency PKR = new CheckoutCurrency("PKR", 97, 2);
    public static final CheckoutCurrency PLN = new CheckoutCurrency("PLN", 98, 2);
    public static final CheckoutCurrency PYG = new CheckoutCurrency("PYG", 99, 0);
    public static final CheckoutCurrency QAR = new CheckoutCurrency("QAR", 100, 2);
    public static final CheckoutCurrency RON = new CheckoutCurrency("RON", 101, 2);
    public static final CheckoutCurrency RSD = new CheckoutCurrency("RSD", 102, 2);
    public static final CheckoutCurrency RUB = new CheckoutCurrency("RUB", 103, 2);
    public static final CheckoutCurrency RWF = new CheckoutCurrency("RWF", 104, 0);
    public static final CheckoutCurrency SAR = new CheckoutCurrency("SAR", 105, 2);
    public static final CheckoutCurrency SBD = new CheckoutCurrency("SBD", 106, 2);
    public static final CheckoutCurrency SCR = new CheckoutCurrency("SCR", 107, 2);
    public static final CheckoutCurrency SEK = new CheckoutCurrency("SEK", 108, 2);
    public static final CheckoutCurrency SGD = new CheckoutCurrency("SGD", 109, 2);
    public static final CheckoutCurrency SHP = new CheckoutCurrency("SHP", 110, 2);
    public static final CheckoutCurrency SLL = new CheckoutCurrency("SLL", 111, 2);
    public static final CheckoutCurrency SLE = new CheckoutCurrency("SLE", 112, 2);
    public static final CheckoutCurrency SOS = new CheckoutCurrency("SOS", 113, 2);
    public static final CheckoutCurrency SRD = new CheckoutCurrency("SRD", 114, 2);
    public static final CheckoutCurrency STN = new CheckoutCurrency("STN", 115, 2);
    public static final CheckoutCurrency SVC = new CheckoutCurrency("SVC", 116, 2);
    public static final CheckoutCurrency SZL = new CheckoutCurrency("SZL", 117, 2);
    public static final CheckoutCurrency THB = new CheckoutCurrency("THB", 118, 2);
    public static final CheckoutCurrency TND = new CheckoutCurrency("TND", 119, 3);
    public static final CheckoutCurrency TOP = new CheckoutCurrency("TOP", 120, 2);
    public static final CheckoutCurrency TRY = new CheckoutCurrency("TRY", 121, 2);
    public static final CheckoutCurrency TTD = new CheckoutCurrency("TTD", 122, 2);
    public static final CheckoutCurrency TWD = new CheckoutCurrency("TWD", AppConstants.RESULT_CODE_ORDER_CANCELLED, 2);
    public static final CheckoutCurrency TZS = new CheckoutCurrency("TZS", 124, 2);
    public static final CheckoutCurrency UAH = new CheckoutCurrency("UAH", 125, 2);
    public static final CheckoutCurrency UGX = new CheckoutCurrency("UGX", 126, 0);
    public static final CheckoutCurrency USD = new CheckoutCurrency("USD", 127, 2);
    public static final CheckoutCurrency UYU = new CheckoutCurrency("UYU", 128, 2);
    public static final CheckoutCurrency UZS = new CheckoutCurrency("UZS", 129, 2);
    public static final CheckoutCurrency VEF = new CheckoutCurrency("VEF", AppConstants.RESULT_CODE_ORDER_COLLECTED, 2);
    public static final CheckoutCurrency VND = new CheckoutCurrency("VND", AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED, 0);
    public static final CheckoutCurrency VUV = new CheckoutCurrency("VUV", AppConstants.RESULT_CODE_FLASH_SALES_SURVEY, 0);
    public static final CheckoutCurrency WST = new CheckoutCurrency("WST", 133, 2);
    public static final CheckoutCurrency XAF = new CheckoutCurrency("XAF", 134, 0);
    public static final CheckoutCurrency XCD = new CheckoutCurrency("XCD", 135, 2);
    public static final CheckoutCurrency XOF = new CheckoutCurrency("XOF", 136, 0);
    public static final CheckoutCurrency XPF = new CheckoutCurrency("XPF", 137, 0);
    public static final CheckoutCurrency YER = new CheckoutCurrency("YER", 138, 2);
    public static final CheckoutCurrency ZAR = new CheckoutCurrency("ZAR", 139, 2);
    public static final CheckoutCurrency ZMW = new CheckoutCurrency("ZMW", 140, 2);

    private static final /* synthetic */ CheckoutCurrency[] $values() {
        return new CheckoutCurrency[]{AED, ALL, AMD, ANG, AOA, ARS, AUD, AWG, AZN, BAM, BBD, BDT, BGN, BHD, BMD, BND, BOB, BRL, BSD, BWP, BYN, BZD, CAD, CHF, CLP, CNY, COP, CRC, CUP, CVE, CZK, DJF, DKK, DOP, DZD, EGP, ETB, EUR, FJD, FKP, GBP, GEL, GHS, GIP, GMD, GNF, GTQ, GYD, HKD, HNL, HRK, HTG, HUF, IDR, ILS, INR, IQD, ISK, JMD, JOD, JPY, KES, KGS, KHR, KMF, KRW, KWD, KYD, KZT, LAK, LBP, LKR, LYD, MAD, MDL, MKD, MMK, MNT, MOP, MRU, MUR, MVR, MWK, MXN, MYR, MZN, NAD, NGN, NIO, NOK, NPR, NZD, OMR, PAB, PEN, PGK, PHP, PKR, PLN, PYG, QAR, RON, RSD, RUB, RWF, SAR, SBD, SCR, SEK, SGD, SHP, SLL, SLE, SOS, SRD, STN, SVC, SZL, THB, TND, TOP, TRY, TTD, TWD, TZS, UAH, UGX, USD, UYU, UZS, VEF, VND, VUV, WST, XAF, XCD, XOF, XPF, YER, ZAR, ZMW};
    }

    static {
        CheckoutCurrency[] checkoutCurrencyArr$values = $values();
        $VALUES = checkoutCurrencyArr$values;
        $ENTRIES = n.w(checkoutCurrencyArr$values);
        INSTANCE = new Companion(null);
        HashMap map = new HashMap();
        for (CheckoutCurrency checkoutCurrency : values()) {
            map.put(checkoutCurrency.name(), checkoutCurrency);
        }
        Map<String, CheckoutCurrency> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        mapUnmodifiableMap.getClass();
        CURRENCIES_HASHMAP = mapUnmodifiableMap;
    }

    private CheckoutCurrency(String str, int i11, int i12) {
        this.fractionDigits = i12;
    }

    @NotNull
    public static final CheckoutCurrency find(@NotNull String str) {
        return INSTANCE.find(str);
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static final boolean isSupported(@Nullable String str) {
        return INSTANCE.isSupported(str);
    }

    public static CheckoutCurrency valueOf(String str) {
        return (CheckoutCurrency) Enum.valueOf(CheckoutCurrency.class, str);
    }

    public static CheckoutCurrency[] values() {
        return (CheckoutCurrency[]) $VALUES.clone();
    }

    public final int getFractionDigits() {
        return this.fractionDigits;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0012\u0010\t\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/components/core/CheckoutCurrency$Companion;", "", "()V", "CURRENCIES_HASHMAP", "", "", "Lcom/adyen/checkout/components/core/CheckoutCurrency;", "find", "currency", "isSupported", "", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CheckoutCurrency find(@NotNull String currency) {
            currency.getClass();
            CurrencyUtils.INSTANCE.assertCurrency(currency);
            CheckoutCurrency checkoutCurrency = (CheckoutCurrency) CheckoutCurrency.CURRENCIES_HASHMAP.get(currency);
            if (checkoutCurrency != null) {
                return checkoutCurrency;
            }
            throw new CheckoutException("Currency not found.", null, 2, null);
        }

        public final boolean isSupported(@Nullable String currency) {
            return currency != null && currency.length() > 0 && CheckoutCurrency.CURRENCIES_HASHMAP.containsKey(currency);
        }

        private Companion() {
        }
    }
}
