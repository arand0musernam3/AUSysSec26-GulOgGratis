package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFc1hSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static long component4;
    private static char getCurrencyIso4217Code;
    private static char[] getMediationNetwork;
    private static char[] getRevenue;
    private final Context AFAdRevenueData;
    private final Map<String, Object> getMonetizationNetwork;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class AFa1tSDK {
        @NonNull
        public static byte[] getCurrencyIso4217Code(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        public static byte[] getRevenue(@NonNull byte[] bArr) throws Exception {
            for (int i11 = 0; i11 < bArr.length; i11++) {
                bArr[i11] = (byte) (bArr[i11] ^ ((i11 % 2) + 42));
            }
            return bArr;
        }
    }

    static {
        getMediationNetwork();
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.lastIndexOf("", '0', 0, 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        ExpandableListView.getPackedPositionForChild(0, 0);
        ExpandableListView.getPackedPositionChild(0L);
        View.resolveSizeAndState(0, 0, 0);
        TextUtils.lastIndexOf("", '0');
        Color.argb(0, 0, 0, 0);
        PointF.length(0.0f, 0.0f);
        ExpandableListView.getPackedPositionForChild(0, 0);
        ImageFormat.getBitsPerPixel(0);
        PointF.length(0.0f, 0.0f);
        AudioTrack.getMaxVolume();
        KeyEvent.normalizeMetaState(0);
        TextUtils.lastIndexOf("", '0', 0);
        ExpandableListView.getPackedPositionType(0L);
        View.resolveSizeAndState(0, 0, 0);
        ViewConfiguration.getScrollFriction();
        component2 = (component1 + 87) % 128;
    }

    public AFc1hSDK(Map<String, Object> map, Context context) {
        this.getMonetizationNetwork = map;
        this.AFAdRevenueData = context;
        put(getRevenue(), getMonetizationNetwork());
    }

    private static StringBuilder AFAdRevenueData(@NonNull String... strArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        component1 = (component2 + 33) % 128;
        for (int i11 = 0; i11 < 3; i11++) {
            arrayList.add(Integer.valueOf(strArr[i11].length()));
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < iIntValue; i12++) {
            component2 = (component1 + 17) % 128;
            Integer numValueOf = null;
            for (int i13 = 0; i13 < 3; i13++) {
                component2 = (component1 + 41) % 128;
                int iCharAt = strArr[i13].charAt(i12);
                if (numValueOf != null) {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
            }
            sb2.append(Integer.toHexString(numValueOf.intValue()));
        }
        return sb2;
    }

    private static void a(byte b8, String str, int i11, Object[] objArr) {
        int i12;
        Object charArray = str;
        if (str != null) {
            $11 = ($10 + 111) % 128;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr2 = getRevenue;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i13 = 0; i13 < length; i13++) {
                cArr3[i13] = (char) (((long) cArr2[i13]) ^ 3069006688033654235L);
            }
            cArr2 = cArr3;
        }
        char c3 = (char) (3069006688033654235L ^ ((long) getCurrencyIso4217Code));
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            int i14 = ($11 + 117) % 128;
            $10 = i14;
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr[i12] - b8);
            $11 = (i14 + 55) % 128;
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            aFk1oSDK.AFAdRevenueData = 0;
            while (true) {
                int i15 = aFk1oSDK.AFAdRevenueData;
                if (i15 >= i12) {
                    break;
                }
                char c7 = cArr[i15];
                aFk1oSDK.getCurrencyIso4217Code = c7;
                char c8 = cArr[i15 + 1];
                aFk1oSDK.getRevenue = c8;
                if (c7 == c8) {
                    cArr4[i15] = (char) (c7 - b8);
                    cArr4[i15 + 1] = (char) (c8 - b8);
                } else {
                    int i16 = c7 / c3;
                    aFk1oSDK.getMonetizationNetwork = i16;
                    int i17 = c7 % c3;
                    aFk1oSDK.component3 = i17;
                    int i18 = c8 / c3;
                    aFk1oSDK.getMediationNetwork = i18;
                    int i19 = c8 % c3;
                    aFk1oSDK.component1 = i19;
                    if (i17 == i19) {
                        int iC = r8.k.c(i16, c3, 1, c3);
                        aFk1oSDK.getMonetizationNetwork = iC;
                        int iC2 = r8.k.c(i18, c3, 1, c3);
                        aFk1oSDK.getMediationNetwork = iC2;
                        cArr4[i15] = cArr2[(iC * c3) + i17];
                        cArr4[i15 + 1] = cArr2[(iC2 * c3) + i19];
                    } else if (i16 == i18) {
                        int iC3 = r8.k.c(i17, c3, 1, c3);
                        aFk1oSDK.component3 = iC3;
                        int iC4 = r8.k.c(i19, c3, 1, c3);
                        aFk1oSDK.component1 = iC4;
                        cArr4[i15] = cArr2[(i16 * c3) + iC3];
                        cArr4[i15 + 1] = cArr2[(i18 * c3) + iC4];
                    } else {
                        cArr4[i15] = cArr2[(i16 * c3) + i19];
                        cArr4[i15 + 1] = cArr2[(i18 * c3) + i17];
                    }
                }
                aFk1oSDK.AFAdRevenueData = i15 + 2;
            }
        }
        for (int i21 = 0; i21 < i11; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static void b(char c3, int i11, int i12, Object[] objArr) {
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        long[] jArr = new long[i11];
        aFk1kSDK.getMediationNetwork = 0;
        while (true) {
            int i13 = aFk1kSDK.getMediationNetwork;
            if (i13 >= i11) {
                break;
            }
            $10 = ($11 + 113) % 128;
            jArr[i13] = (((long) ((char) (((long) getMediationNetwork[i12 + i13]) ^ 5211070536272185776L))) ^ (((long) i13) * (5211070536272185776L ^ component4))) ^ ((long) c3);
            aFk1kSDK.getMediationNetwork = i13 + 1;
        }
        char[] cArr = new char[i11];
        aFk1kSDK.getMediationNetwork = 0;
        $10 = ($11 + 5) % 128;
        while (true) {
            int i14 = aFk1kSDK.getMediationNetwork;
            if (i14 >= i11) {
                String str = new String(cArr);
                $10 = ($11 + 117) % 128;
                objArr[0] = str;
                return;
            }
            cArr[i14] = (char) jArr[i14];
            aFk1kSDK.getMediationNetwork = i14 + 1;
        }
    }

    public static void getMediationNetwork() {
        getRevenue = new char[]{28789, 28768, 28779, 28769, 28795, 28713, 28706, 28787, 28771, 28717, 28776, 28774, 28781, 28778, 28780, 28716, 28791, 28719, 28723, 28788, 28695, 28712, 28727, 28724, 28682, 28721, 28714, 28704, 28793, 28792, 28726, 28722, 28725, 28783, 28718, 28777, 28709, 28711, 28770, 28708, 28782, 28784, 28728, 28707, 28710, 28775, 28702, 28729, 28785};
        getCurrencyIso4217Code = (char) 17884;
        getMediationNetwork = new char[]{5817, 23451, 36062, 61731, 8823, 2558, 17613, 37771, 61028, 15658, 34827, 50898, 5546, 2518, 17635, 37821, 61002, 15645, 34862, 50876, 5513, 24645, 48924, 2593, 22756, 38793, 57934, 12645, 35888, 56055, 10690, 25695, 45923, 3646, 23690, 43927, 59051, 13689, 32882, 57043, 11679, 30908, 46962, 588, 20699, 44936, 64161, 18801, 33814, 53964, 8675, 31923, 52032, 1626, 21650, 34848, 50461, 4688, 28579, 48378, 2544, 18187, 37997, 57784, 16103, 35802, 55588, 5759, 25528, 45215, 15744, 28861, 42977, 55813, 2374, 48242, 62121, 8593, 21528, 35661, 15969, 27810, 41943, 54815, 1395, 47214, 61090, 7623, 20492, 34616, 14951, 26837, 40943, 53982, 261, 46167, 60080, 6645, 19648, 33556, 13950, 25767, 39904, 52957, 32002, 45170, 59053, 38308, 55431, 4057, 29238, 41341, 5208, 23197, 35322, 64565, 9056, 38465, 2454, 17650, 2519, 17639, 37792, 61040, 15690, 34844, 50941, 5506, 24661, 48919, 2660, 22771, 38810, 57928, 12643, 35884, 28263, 8963, 62484, 35239, 23224, 61386, 41309, 29294, 2017, 55537, 28103, 16196, 61489, 34303, 22236, 60290};
        component4 = 8166711332525589634L;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String getMonetizationNetwork() {
        /*
            Method dump skipped, instruction units count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1hSDK.getMonetizationNetwork():java.lang.String");
    }

    @NonNull
    private String getRevenue() {
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getMonetizationNetwork;
            Object[] objArr = new Object[1];
            a((byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 30), "\u0017)\u0004'\u0016\u000e& \"\u0019\u0012\u0016", (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMonetizationNetwork;
            Object[] objArr2 = new Object[1];
            b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 8044), TextUtils.getOffsetAfter("", 0) + 5, ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                component1 = (component2 + 47) % 128;
                Object[] objArr3 = new Object[1];
                b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 8 - (Process.myTid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5, objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb2 = new StringBuilder(string2);
            sb2.reverse();
            StringBuilder sbAFAdRevenueData = AFAdRevenueData(string, string3, sb2.toString());
            int length = sbAFAdRevenueData.length();
            if (length > 4) {
                sbAFAdRevenueData.delete(4, length);
            } else {
                while (length < 4) {
                    int i11 = component2 + 103;
                    component1 = i11 % 128;
                    if (i11 % 2 != 0) {
                        length += 9;
                        sbAFAdRevenueData.append('Y');
                    } else {
                        length++;
                        sbAFAdRevenueData.append('1');
                    }
                }
            }
            Object[] objArr4 = new Object[1];
            a((byte) (17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0019(㘍", 3 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
            sbAFAdRevenueData.insert(0, ((String) objArr4[0]).intern());
            return sbAFAdRevenueData.toString();
        } catch (Exception e5) {
            Object[] objArr5 = new Object[1];
            a((byte) (TextUtils.lastIndexOf("", '0', 0) + 50), "\u0002-.'\u000e\r\u0019&-\u0000)\u0017\u0017\u0007(%\u0002-&\u0012.\u0019\u0019\"\u0018\u000e-\u0002\u0019(&\u0002\u0019(-\u0000\u001c\u0017!\u0004", (KeyEvent.getMaxKeyCode() >> 16) + 40, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e5);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b((char) (ViewConfiguration.getPressedStateDuration() >> 16), MotionEvent.axisFromString("") + 43, TextUtils.getOffsetBefore("", 0) + 13, objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e5);
            AFLogger.afRDLog(sb3.toString());
            Object[] objArr7 = new Object[1];
            a((byte) (ImageFormat.getBitsPerPixel(0) + 17), "\u0019($\u001e㖳㖳㖳", (Process.myPid() >> 22) + 7, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }
}
