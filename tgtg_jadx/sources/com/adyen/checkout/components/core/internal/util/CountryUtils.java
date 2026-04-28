package com.adyen.checkout.components.core.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/components/core/internal/util/CountryUtils;", "", "()V", "countries", "", "Lcom/adyen/checkout/components/core/internal/util/CountryInfo;", "getCountries$components_core_release$annotations", "getCountries$components_core_release", "()Ljava/util/List;", "getCountries", "allowedISOCodes", "", "getCountryName", "isoCode", "locale", "Ljava/util/Locale;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCountryUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryUtils.kt\ncom/adyen/checkout/components/core/internal/util/CountryUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n774#2:299\n865#2,2:300\n*S KotlinDebug\n*F\n+ 1 CountryUtils.kt\ncom/adyen/checkout/components/core/internal/util/CountryUtils\n*L\n28#1:299\n28#1:300,2\n*E\n"})
public final class CountryUtils {

    @NotNull
    public static final CountryUtils INSTANCE = new CountryUtils();

    @NotNull
    private static final List<CountryInfo> countries = d0.h(new CountryInfo("AD", "+376"), new CountryInfo("AE", "+971"), new CountryInfo("AF", "+93"), new CountryInfo("AG", "+1268"), new CountryInfo("AI", "+1264"), new CountryInfo("AL", "+355"), new CountryInfo("AM", "+374"), new CountryInfo("AN", "+599"), new CountryInfo("AO", "+244"), new CountryInfo("AQ", "+672"), new CountryInfo("AR", "+54"), new CountryInfo("AS", "+1684"), new CountryInfo("AT", "+43"), new CountryInfo("AU", "+61"), new CountryInfo("AW", "+297"), new CountryInfo("AX", "+358"), new CountryInfo("AZ", "+994"), new CountryInfo("BA", "+387"), new CountryInfo("BB", "+1246"), new CountryInfo("BD", "+880"), new CountryInfo("BE", "+32"), new CountryInfo("BF", "+226"), new CountryInfo("BG", "+359"), new CountryInfo("BH", "+973"), new CountryInfo("BI", "+257"), new CountryInfo("BJ", "+229"), new CountryInfo("BL", "+590"), new CountryInfo("BM", "+1441"), new CountryInfo("BN", "+673"), new CountryInfo("BO", "+591"), new CountryInfo("BR", "+55"), new CountryInfo("BS", "+1242"), new CountryInfo("BT", "+975"), new CountryInfo("BW", "+267"), new CountryInfo("BY", "+375"), new CountryInfo("BZ", "+501"), new CountryInfo("CA", "+1"), new CountryInfo("CC", "+61"), new CountryInfo("CD", "+243"), new CountryInfo("CF", "+236"), new CountryInfo("CG", "+242"), new CountryInfo("CH", "+41"), new CountryInfo("CI", "+225"), new CountryInfo("CK", "+682"), new CountryInfo("CL", "+56"), new CountryInfo("CM", "+237"), new CountryInfo("CN", "+86"), new CountryInfo("CO", "+57"), new CountryInfo("CR", "+506"), new CountryInfo("CU", "+53"), new CountryInfo("CV", "+238"), new CountryInfo("CX", "+61"), new CountryInfo("CY", "+537"), new CountryInfo("CZ", "+420"), new CountryInfo("DE", "+49"), new CountryInfo("DJ", "+253"), new CountryInfo("DK", "+45"), new CountryInfo("DM", "+1767"), new CountryInfo("DO", "+1849"), new CountryInfo("DZ", "+213"), new CountryInfo("EC", "+593"), new CountryInfo("EE", "+372"), new CountryInfo("EG", "+20"), new CountryInfo("ER", "+291"), new CountryInfo("ES", "+34"), new CountryInfo("ET", "+251"), new CountryInfo("FI", "+358"), new CountryInfo("FJ", "+679"), new CountryInfo("FK", "+500"), new CountryInfo("FM", "+691"), new CountryInfo("FO", "+298"), new CountryInfo("FR", "+33"), new CountryInfo("GA", "+241"), new CountryInfo("GB", "+44"), new CountryInfo("GD", "+1473"), new CountryInfo("GE", "+995"), new CountryInfo("GF", "+594"), new CountryInfo("GG", "+44"), new CountryInfo("GH", "+233"), new CountryInfo("GI", "+350"), new CountryInfo("GL", "+299"), new CountryInfo("GM", "+220"), new CountryInfo("GN", "+224"), new CountryInfo("GP", "+590"), new CountryInfo("GQ", "+240"), new CountryInfo("GR", "+30"), new CountryInfo("GS", "+500"), new CountryInfo("GT", "+502"), new CountryInfo("GU", "+1671"), new CountryInfo("GW", "+245"), new CountryInfo("GY", "+595"), new CountryInfo("HK", "+852"), new CountryInfo("HN", "+504"), new CountryInfo("HR", "+385"), new CountryInfo("HT", "+509"), new CountryInfo("HU", "+36"), new CountryInfo("ID", "+62"), new CountryInfo("IE", "+353"), new CountryInfo("IL", "+972"), new CountryInfo("IM", "+44"), new CountryInfo("IN", "+91"), new CountryInfo("IO", "+246"), new CountryInfo("IQ", "+964"), new CountryInfo("IR", "+98"), new CountryInfo("IS", "+354"), new CountryInfo("IT", "+39"), new CountryInfo("JE", "+44"), new CountryInfo("JM", "+1876"), new CountryInfo("JO", "+962"), new CountryInfo("JP", "+81"), new CountryInfo("KE", "+254"), new CountryInfo("KG", "+996"), new CountryInfo("KH", "+855"), new CountryInfo("KI", "+686"), new CountryInfo("KM", "+269"), new CountryInfo("KN", "+1869"), new CountryInfo("KP", "+850"), new CountryInfo("KR", "+82"), new CountryInfo("KW", "+965"), new CountryInfo("KY", "+345"), new CountryInfo("KZ", "+77"), new CountryInfo("LA", "+856"), new CountryInfo("LB", "+961"), new CountryInfo("LC", "+1758"), new CountryInfo("LI", "+423"), new CountryInfo("LK", "+94"), new CountryInfo("LR", "+231"), new CountryInfo("LS", "+266"), new CountryInfo("LT", "+370"), new CountryInfo("LU", "+352"), new CountryInfo("LV", "+371"), new CountryInfo("LY", "+218"), new CountryInfo("MA", "+212"), new CountryInfo("MC", "+377"), new CountryInfo("MD", "+373"), new CountryInfo("ME", "+382"), new CountryInfo("MF", "+590"), new CountryInfo("MG", "+261"), new CountryInfo("MH", "+692"), new CountryInfo("MK", "+389"), new CountryInfo("ML", "+223"), new CountryInfo("MM", "+95"), new CountryInfo("MN", "+976"), new CountryInfo("MO", "+853"), new CountryInfo("MP", "+1670"), new CountryInfo("MQ", "+596"), new CountryInfo("MR", "+222"), new CountryInfo("MS", "+1664"), new CountryInfo("MT", "+356"), new CountryInfo("MU", "+230"), new CountryInfo("MV", "+960"), new CountryInfo("MW", "+265"), new CountryInfo("MX", "+52"), new CountryInfo("MY", "+60"), new CountryInfo("MZ", "+258"), new CountryInfo("NA", "+264"), new CountryInfo("NC", "+687"), new CountryInfo("NE", "+227"), new CountryInfo("NF", "+672"), new CountryInfo("NG", "+234"), new CountryInfo("NI", "+505"), new CountryInfo("NL", "+31"), new CountryInfo("NO", "+47"), new CountryInfo("NP", "+977"), new CountryInfo("NR", "+674"), new CountryInfo("NU", "+683"), new CountryInfo("NZ", "+64"), new CountryInfo("OM", "+968"), new CountryInfo("PA", "+507"), new CountryInfo("PE", "+51"), new CountryInfo("PF", "+689"), new CountryInfo("PG", "+675"), new CountryInfo("PH", "+63"), new CountryInfo("PK", "+92"), new CountryInfo("PL", "+48"), new CountryInfo("PM", "+508"), new CountryInfo("PN", "+872"), new CountryInfo("PR", "+1939"), new CountryInfo("PS", "+970"), new CountryInfo("PT", "+351"), new CountryInfo("PW", "+680"), new CountryInfo("PY", "+595"), new CountryInfo("QA", "+974"), new CountryInfo("RE", "+262"), new CountryInfo("RO", "+40"), new CountryInfo("RS", "+381"), new CountryInfo("RU", "+7"), new CountryInfo("RW", "+250"), new CountryInfo("SA", "+966"), new CountryInfo("SB", "+677"), new CountryInfo("SC", "+248"), new CountryInfo("SD", "+249"), new CountryInfo("SE", "+46"), new CountryInfo("SG", "+65"), new CountryInfo("SH", "+290"), new CountryInfo("SI", "+386"), new CountryInfo("SJ", "+47"), new CountryInfo("SK", "+421"), new CountryInfo("SL", "+232"), new CountryInfo("SM", "+378"), new CountryInfo("SN", "+221"), new CountryInfo("SO", "+252"), new CountryInfo("SR", "+597"), new CountryInfo("ST", "+239"), new CountryInfo("SV", "+503"), new CountryInfo("SY", "+963"), new CountryInfo("SZ", "+268"), new CountryInfo("TC", "+1649"), new CountryInfo("TD", "+235"), new CountryInfo("TG", "+228"), new CountryInfo("TH", "+66"), new CountryInfo("TJ", "+992"), new CountryInfo("TK", "+690"), new CountryInfo("TL", "+670"), new CountryInfo("TM", "+993"), new CountryInfo("TN", "+216"), new CountryInfo("TO", "+676"), new CountryInfo("TR", "+90"), new CountryInfo("TT", "+1868"), new CountryInfo("TV", "+688"), new CountryInfo("TW", "+886"), new CountryInfo("TZ", "+255"), new CountryInfo("UA", "+380"), new CountryInfo("UG", "+256"), new CountryInfo("US", "+1"), new CountryInfo("UY", "+598"), new CountryInfo("UZ", "+998"), new CountryInfo("VA", "+379"), new CountryInfo("VC", "+1784"), new CountryInfo("VE", "+58"), new CountryInfo("VG", "+1284"), new CountryInfo("VI", "+1340"), new CountryInfo("VN", "+84"), new CountryInfo("VU", "+678"), new CountryInfo("WF", "+681"), new CountryInfo("WS", "+685"), new CountryInfo("YE", "+967"), new CountryInfo("YT", "+262"), new CountryInfo("ZA", "+27"), new CountryInfo("ZM", "+260"), new CountryInfo("ZW", "+263"));

    private CountryUtils() {
    }

    @NotNull
    public static final List<CountryInfo> getCountries(@Nullable List<String> allowedISOCodes) {
        if (allowedISOCodes == null) {
            return countries;
        }
        List<CountryInfo> list = countries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (allowedISOCodes.contains(((CountryInfo) obj).getIsoCode())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List getCountries$default(List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = null;
        }
        return getCountries(list);
    }

    @NotNull
    public static final String getCountryName(@NotNull String isoCode, @NotNull Locale locale) {
        isoCode.getClass();
        locale.getClass();
        String displayCountry = new Locale("", isoCode).getDisplayCountry(locale);
        displayCountry.getClass();
        return displayCountry;
    }

    @NotNull
    public final List<CountryInfo> getCountries$components_core_release() {
        return countries;
    }

    public static /* synthetic */ void getCountries$components_core_release$annotations() {
    }
}
