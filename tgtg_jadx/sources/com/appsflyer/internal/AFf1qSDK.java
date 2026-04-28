package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFf1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] AFAdRevenueData = null;
    private static int getCurrencyIso4217Code = 0;
    private static int getMediationNetwork = 1;

    static {
        getMonetizationNetwork();
        ViewConfiguration.getScrollBarSize();
        getCurrencyIso4217Code = (getMediationNetwork + 85) % 128;
    }

    private static void a(int[] iArr, int i11, Object[] objArr) {
        int i12;
        int length;
        int[] iArr2;
        long j9;
        AFk1iSDK aFk1iSDK = new AFk1iSDK();
        char[] cArr = new char[4];
        char c3 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AFAdRevenueData;
        long j11 = -6133639485864768852L;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i13 = 0; i13 < length2; i13++) {
                iArr4[i13] = (int) (((long) iArr3[i13]) ^ (-6133639485864768852L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = AFAdRevenueData;
        if (iArr6 != null) {
            int i14 = $10 + 113;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i15 = 0;
            while (i15 < length) {
                int i16 = $11 + 17;
                char c7 = c3;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    j9 = j11;
                    iArr2[i15] = (int) (((long) iArr6[i15]) & j9);
                    i15--;
                } else {
                    j9 = j11;
                    iArr2[i15] = (int) (((long) iArr6[i15]) ^ j9);
                    i15++;
                }
                c3 = c7;
                j11 = j9;
            }
            iArr6 = iArr2;
        }
        char c8 = c3;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        aFk1iSDK.getRevenue = 0;
        while (true) {
            int i17 = aFk1iSDK.getRevenue;
            if (i17 >= iArr.length) {
                break;
            }
            $10 = ($11 + 71) % 128;
            int i18 = iArr[i17];
            char c11 = (char) (i18 >> 16);
            cArr[0] = c11;
            char c12 = (char) i18;
            cArr[1] = c12;
            char c13 = (char) (iArr[i17 + 1] >> 16);
            cArr[c8] = c13;
            char c14 = (char) iArr[i17 + 1];
            cArr[3] = c14;
            aFk1iSDK.getMediationNetwork = (c11 << 16) + c12;
            aFk1iSDK.getMonetizationNetwork = (c13 << 16) + c14;
            AFk1iSDK.getMonetizationNetwork(iArr5);
            int i19 = 0;
            while (true) {
                i12 = aFk1iSDK.getMediationNetwork;
                if (i19 < 16) {
                    int i21 = i12 ^ iArr5[i19];
                    aFk1iSDK.getMediationNetwork = i21;
                    int mediationNetwork = AFk1iSDK.getMediationNetwork(i21) ^ aFk1iSDK.getMonetizationNetwork;
                    int i22 = aFk1iSDK.getMediationNetwork;
                    aFk1iSDK.getMediationNetwork = mediationNetwork;
                    aFk1iSDK.getMonetizationNetwork = i22;
                    i19++;
                    $10 = ($11 + 99) % 128;
                }
            }
            int i23 = aFk1iSDK.getMonetizationNetwork;
            aFk1iSDK.getMediationNetwork = i23;
            aFk1iSDK.getMonetizationNetwork = i12;
            int i24 = i12 ^ iArr5[16];
            aFk1iSDK.getMonetizationNetwork = i24;
            int i25 = i23 ^ iArr5[17];
            aFk1iSDK.getMediationNetwork = i25;
            cArr[0] = (char) (i25 >>> 16);
            cArr[1] = (char) i25;
            cArr[c8] = (char) (i24 >>> 16);
            cArr[3] = (char) i24;
            AFk1iSDK.getMonetizationNetwork(iArr5);
            int i26 = aFk1iSDK.getRevenue;
            cArr2[i26 * 2] = cArr[0];
            cArr2[(i26 * 2) + 1] = cArr[1];
            cArr2[(i26 * 2) + 2] = cArr[c8];
            cArr2[(i26 * 2) + 3] = cArr[3];
            aFk1iSDK.getRevenue = i26 + 2;
        }
        String str = new String(cArr2, 0, i11);
        int i27 = $10 + 77;
        $11 = i27 % 128;
        if (i27 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public static void getMonetizationNetwork() {
        AFAdRevenueData = new int[]{-1535469978, -1012770009, 2079423438, -537713690, 188517261, 1637329726, 59481190, 913702862, 1690527878, -1038801859, 344452007, 1683103388, -581075556, -2036279421, 21770861, 2114604264, 1603244918, -208521163};
    }

    @NonNull
    private static AFi1uSDK getRevenue(@NonNull AFh1cSDK aFh1cSDK, String str, @NonNull String str2, @NonNull String str3) {
        if (str == null) {
            return new AFi1uSDK(aFh1cSDK.getCurrencyIso4217Code == AFh1gSDK.DEFAULT, AFi1ySDK.NA);
        }
        String string = "";
        Object[] objArr = new Object[1];
        a(new int[]{-1737175898, -1382589389, 713661469, -1134961719, -1969930269, 10614183, -828674959, -651693320, -1587602342, 405839388, 1857785845, -2125720599, -1949544352, -324845223, 902164262, 728372842, -1289227633, 161661437, 51240894, -1224567390, -2031796534, -1352392266, 1905647512, -1637846901, 1233763875, 492265299, -1206355691, 1997345169, 575501648, -182399273, 1663091008, 1388920687}, KeyEvent.keyCodeFromString("") + 64, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFh1cSDK.getCurrencyIso4217Code == AFh1gSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            str3 = strIntern;
        }
        boolean zEquals = getRevenue(new StringBuilder(str3).reverse().toString(), aFh1cSDK.getRevenue, AnalyticsPlatformParams.channel, "v1", string).equals(str);
        return new AFi1uSDK(zEquals, zEquals ? AFi1ySDK.SUCCESS : AFi1ySDK.FAILURE);
    }

    @NonNull
    public final AFi1uSDK getMonetizationNetwork(@NonNull AFh1cSDK aFh1cSDK, String str, @NonNull String str2, @NonNull String str3) {
        int i11 = getMediationNetwork;
        int i12 = i11 + 119;
        getCurrencyIso4217Code = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (aFh1cSDK == null || str2 == null || str3 == null) {
            return new AFi1uSDK(false, AFi1ySDK.INTERNAL_ERROR);
        }
        getCurrencyIso4217Code = (i11 + 85) % 128;
        return getRevenue(aFh1cSDK, str, str2, str3);
    }

    private static String getRevenue(String str, String str2, String str3, String str4, String str5) {
        getMediationNetwork = (getCurrencyIso4217Code + 83) % 128;
        String currencyIso4217Code = AFj1jSDK.getCurrencyIso4217Code(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (currencyIso4217Code.length() >= 12) {
            return currencyIso4217Code.substring(0, 12);
        }
        getMediationNetwork = (getCurrencyIso4217Code + 95) % 128;
        return currencyIso4217Code;
    }
}
