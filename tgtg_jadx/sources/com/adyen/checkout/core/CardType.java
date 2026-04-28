package com.adyen.checkout.core;

import a80.a;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.adyen.checkout.googlepay.AllowedCardNetworks;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\b\u0086\u0081\u0002\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006/"}, d2 = {"Lcom/adyen/checkout/core/CardType;", "", "txVariant", "", "pattern", "Ljava/util/regex/Pattern;", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/regex/Pattern;)V", "getTxVariant", "()Ljava/lang/String;", "isEstimateFor", "", "cardNumber", "isEstimateFor$checkout_core_release", "AMERICAN_EXPRESS", "ARGENCARD", "BCMC", "BIJENKORF_CARD", "CABAL", "CARTEBANCAIRE", "CODENSA", "CUP", "DANKORT", "DINERS", AllowedCardNetworks.DISCOVER, "ELO", "FORBRUGSFORENINGEN", "VISAALPHABANKBONUS", "MCALPHABANKBONUS", "HIPER", "HIPERCARD", AllowedCardNetworks.JCB, "OASIS", "KARENMILLER", "WAREHOUSE", "LASER", "MAESTRO", "MAESTRO_UK", AllowedCardNetworks.MASTERCARD, "MIR", "NARANJA", "SHOPPING", "SOLO", "TROY", "UATP", AllowedCardNetworks.VISA, "VISADANKORT", "Companion", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CardType[] $VALUES;
    public static final CardType AMERICAN_EXPRESS;
    public static final CardType ARGENCARD;
    public static final CardType BCMC;
    public static final CardType BIJENKORF_CARD;
    public static final CardType CABAL;
    public static final CardType CARTEBANCAIRE;
    public static final CardType CODENSA;
    public static final CardType CUP;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final CardType DANKORT;
    public static final CardType DINERS;
    public static final CardType DISCOVER;
    public static final CardType ELO;
    public static final CardType FORBRUGSFORENINGEN;
    public static final CardType HIPER;
    public static final CardType HIPERCARD;
    public static final CardType JCB;
    public static final CardType KARENMILLER;
    public static final CardType LASER;
    public static final CardType MAESTRO;
    public static final CardType MAESTRO_UK;
    public static final CardType MASTERCARD;
    public static final CardType MCALPHABANKBONUS;
    public static final CardType MIR;
    public static final CardType NARANJA;
    public static final CardType OASIS;
    public static final CardType SHOPPING;
    public static final CardType SOLO;
    public static final CardType TROY;
    public static final CardType UATP;
    public static final CardType VISA;
    public static final CardType VISAALPHABANKBONUS;
    public static final CardType VISADANKORT;
    public static final CardType WAREHOUSE;

    @NotNull
    private final Pattern pattern;

    @NotNull
    private final String txVariant;

    private static final /* synthetic */ CardType[] $values() {
        return new CardType[]{AMERICAN_EXPRESS, ARGENCARD, BCMC, BIJENKORF_CARD, CABAL, CARTEBANCAIRE, CODENSA, CUP, DANKORT, DINERS, DISCOVER, ELO, FORBRUGSFORENINGEN, VISAALPHABANKBONUS, MCALPHABANKBONUS, HIPER, HIPERCARD, JCB, OASIS, KARENMILLER, WAREHOUSE, LASER, MAESTRO, MAESTRO_UK, MASTERCARD, MIR, NARANJA, SHOPPING, SOLO, TROY, UATP, VISA, VISADANKORT};
    }

    static {
        Pattern patternCompile = Pattern.compile("^3[47][0-9]{0,13}$");
        patternCompile.getClass();
        AMERICAN_EXPRESS = new CardType("AMERICAN_EXPRESS", 0, "amex", patternCompile);
        Pattern patternCompile2 = Pattern.compile("^(50)(1)\\d*$");
        patternCompile2.getClass();
        ARGENCARD = new CardType("ARGENCARD", 1, "argencard", patternCompile2);
        Pattern patternCompile3 = Pattern.compile("^((6703)[0-9]{0,15}|(479658|606005)[0-9]{0,13})$");
        patternCompile3.getClass();
        BCMC = new CardType("BCMC", 2, PaymentMethodTypes.BCMC, patternCompile3);
        Pattern patternCompile4 = Pattern.compile("^(5100081)[0-9]{0,9}$");
        patternCompile4.getClass();
        BIJENKORF_CARD = new CardType("BIJENKORF_CARD", 3, "bijcard", patternCompile4);
        Pattern patternCompile5 = Pattern.compile("^(58|6[03])([03469])\\d*$");
        patternCompile5.getClass();
        CABAL = new CardType("CABAL", 4, "cabal", patternCompile5);
        Pattern patternCompile6 = Pattern.compile("^[4-6][0-9]{0,15}$");
        patternCompile6.getClass();
        CARTEBANCAIRE = new CardType("CARTEBANCAIRE", 5, "cartebancaire", patternCompile6);
        Pattern patternCompile7 = Pattern.compile("^(590712)[0-9]{0,10}$");
        patternCompile7.getClass();
        CODENSA = new CardType("CODENSA", 6, "codensa", patternCompile7);
        Pattern patternCompile8 = Pattern.compile("^(62|81)[0-9]{0,17}$");
        patternCompile8.getClass();
        CUP = new CardType("CUP", 7, "cup", patternCompile8);
        Pattern patternCompile9 = Pattern.compile("^(5019)[0-9]{0,12}$");
        patternCompile9.getClass();
        DANKORT = new CardType("DANKORT", 8, "dankort", patternCompile9);
        Pattern patternCompile10 = Pattern.compile("^(36)[0-9]{0,12}$");
        patternCompile10.getClass();
        DINERS = new CardType("DINERS", 9, "diners", patternCompile10);
        Pattern patternCompile11 = Pattern.compile("^(6011[0-9]{0,12}|(644|645|646|647|648|649)[0-9]{0,13}|65[0-9]{0,14})$");
        patternCompile11.getClass();
        DISCOVER = new CardType(AllowedCardNetworks.DISCOVER, 10, "discover", patternCompile11);
        Pattern patternCompile12 = Pattern.compile("^((((506699)|(506770)|(506771)|(506772)|(506773)|(506774)|(506775)|(506776)|(506777)|(506778)|(401178)|(438935)|(451416)|(457631)|(457632)|(504175)|(627780)|(636368)|(636297))[0-9]{0,10})|((50676)|(50675)|(50674)|(50673)|(50672)|(50671)|(50670))[0-9]{0,11})$");
        patternCompile12.getClass();
        ELO = new CardType("ELO", 11, "elo", patternCompile12);
        Pattern patternCompile13 = Pattern.compile("^(60)(0)\\d*$");
        patternCompile13.getClass();
        FORBRUGSFORENINGEN = new CardType("FORBRUGSFORENINGEN", 12, "forbrugsforeningen", patternCompile13);
        Pattern patternCompile14 = Pattern.compile("^(450903)[0-9]{0,10}$");
        patternCompile14.getClass();
        VISAALPHABANKBONUS = new CardType("VISAALPHABANKBONUS", 13, "visaalphabankbonus", patternCompile14);
        Pattern patternCompile15 = Pattern.compile("^(510099)[0-9]{0,10}$");
        patternCompile15.getClass();
        MCALPHABANKBONUS = new CardType("MCALPHABANKBONUS", 14, "mcalphabankbonus", patternCompile15);
        Pattern patternCompile16 = Pattern.compile("^(637095|637599|637609|637612)[0-9]{0,10}$");
        patternCompile16.getClass();
        HIPER = new CardType("HIPER", 15, "hiper", patternCompile16);
        Pattern patternCompile17 = Pattern.compile("^(606282)[0-9]{0,10}$");
        patternCompile17.getClass();
        HIPERCARD = new CardType("HIPERCARD", 16, "hipercard", patternCompile17);
        Pattern patternCompile18 = Pattern.compile("^(352[8,9]{1}[0-9]{0,15}|35[4-8]{1}[0-9]{0,16})$");
        patternCompile18.getClass();
        JCB = new CardType(AllowedCardNetworks.JCB, 17, "jcb", patternCompile18);
        Pattern patternCompile19 = Pattern.compile("^(982616)[0-9]{0,10}$");
        patternCompile19.getClass();
        OASIS = new CardType("OASIS", 18, "oasis", patternCompile19);
        Pattern patternCompile20 = Pattern.compile("^(98261465)[0-9]{0,8}$");
        patternCompile20.getClass();
        KARENMILLER = new CardType("KARENMILLER", 19, "karenmillen", patternCompile20);
        Pattern patternCompile21 = Pattern.compile("^(982633)[0-9]{0,10}$");
        patternCompile21.getClass();
        WAREHOUSE = new CardType("WAREHOUSE", 20, "warehouse", patternCompile21);
        Pattern patternCompile22 = Pattern.compile("^(6304|6706|6709|6771)[0-9]{0,15}$");
        patternCompile22.getClass();
        LASER = new CardType("LASER", 21, "laser", patternCompile22);
        Pattern patternCompile23 = Pattern.compile("^(5[0|6-8][0-9]{0,17}|6[0-9]{0,18})$");
        patternCompile23.getClass();
        MAESTRO = new CardType("MAESTRO", 22, "maestro", patternCompile23);
        Pattern patternCompile24 = Pattern.compile("^(6759)[0-9]{0,15}$");
        patternCompile24.getClass();
        MAESTRO_UK = new CardType("MAESTRO_UK", 23, "maestrouk", patternCompile24);
        Pattern patternCompile25 = Pattern.compile("^(5[1-5][0-9]{0,14}|2[2-7][0-9]{0,14})$");
        patternCompile25.getClass();
        MASTERCARD = new CardType(AllowedCardNetworks.MASTERCARD, 24, "mc", patternCompile25);
        Pattern patternCompile26 = Pattern.compile("^(220)[0-9]{0,16}$");
        patternCompile26.getClass();
        MIR = new CardType("MIR", 25, "mir", patternCompile26);
        Pattern patternCompile27 = Pattern.compile("^(37|40|5[28])([279])\\d*$");
        patternCompile27.getClass();
        NARANJA = new CardType("NARANJA", 26, "naranja", patternCompile27);
        Pattern patternCompile28 = Pattern.compile("^(27|58|60)([39])\\d*$");
        patternCompile28.getClass();
        SHOPPING = new CardType("SHOPPING", 27, "shopping", patternCompile28);
        Pattern patternCompile29 = Pattern.compile("^(6767)[0-9]{0,15}$");
        patternCompile29.getClass();
        SOLO = new CardType("SOLO", 28, "solo", patternCompile29);
        Pattern patternCompile30 = Pattern.compile("^(97)(9)\\d*$");
        patternCompile30.getClass();
        TROY = new CardType("TROY", 29, "troy", patternCompile30);
        Pattern patternCompile31 = Pattern.compile("^1[0-9]{0,14}$");
        patternCompile31.getClass();
        UATP = new CardType("UATP", 30, "uatp", patternCompile31);
        Pattern patternCompile32 = Pattern.compile("^4[0-9]{0,18}$");
        patternCompile32.getClass();
        VISA = new CardType(AllowedCardNetworks.VISA, 31, "visa", patternCompile32);
        Pattern patternCompile33 = Pattern.compile("^(4571)[0-9]{0,12}$");
        patternCompile33.getClass();
        VISADANKORT = new CardType("VISADANKORT", 32, "visadankort", patternCompile33);
        CardType[] cardTypeArr$values = $values();
        $VALUES = cardTypeArr$values;
        $ENTRIES = n.w(cardTypeArr$values);
        INSTANCE = new Companion(null);
    }

    private CardType(String str, int i11, String str2, Pattern pattern) {
        this.txVariant = str2;
        this.pattern = pattern;
    }

    @NotNull
    public static a getEntries() {
        return $ENTRIES;
    }

    public static CardType valueOf(String str) {
        return (CardType) Enum.valueOf(CardType.class, str);
    }

    public static CardType[] values() {
        return (CardType[]) $VALUES.clone();
    }

    @NotNull
    public final String getTxVariant() {
        return this.txVariant;
    }

    public final boolean isEstimateFor$checkout_core_release(@NotNull String cardNumber) {
        cardNumber.getClass();
        Matcher matcher = this.pattern.matcher(new Regex("\\s").replace(cardNumber, ""));
        return matcher.matches() || matcher.hitEnd();
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/core/CardType$Companion;", "", "()V", "getByBrandName", "Lcom/adyen/checkout/core/CardType;", "brand", "", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCardType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardType.kt\ncom/adyen/checkout/core/CardType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,85:1\n1310#2,2:86\n*S KotlinDebug\n*F\n+ 1 CardType.kt\ncom/adyen/checkout/core/CardType$Companion\n*L\n81#1:86,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CardType getByBrandName(@NotNull String brand) {
            brand.getClass();
            for (CardType cardType : CardType.values()) {
                if (Intrinsics.areEqual(cardType.getTxVariant(), brand)) {
                    return cardType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
