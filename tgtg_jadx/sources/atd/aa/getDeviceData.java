package atd.aa;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.getMessageVersion;
import atd.e.ChallengeResult;
import com.adyen.threeds2.exception.InvalidInputException;
import java.lang.reflect.Method;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ getDeviceData[] $VALUES;
    public static final getDeviceData APPLICATION_CONTEXT;
    private static int AuthenticationRequestParameters;
    public static final getDeviceData CHALLENGE_PARAMETERS;
    public static final getDeviceData CHALLENGE_STATUS_RECEIVER;
    public static final getDeviceData CONFIG_PARAMETERS;
    public static final getDeviceData CURRENT_ACTIVITY;
    private static int ChallengeResultCancelled;
    public static final getDeviceData DEVICE_DATA;
    private static getDeviceData DIRECTORY_SERVER_ID;
    public static final getDeviceData LOCALE;
    public static final getDeviceData MESSAGE_VERSION;
    public static final getDeviceData SDK_APP_ID;
    public static final getDeviceData SDK_EPHEMERAL_PUBLIC_KEY;
    public static final getDeviceData SDK_REFERENCE_NUMBER;
    public static final getDeviceData SDK_TRANSACTION_ID;
    public static final getDeviceData TIMEOUT;
    private static char[] getDeviceData;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int[] getSDKReferenceNumber;
    private static long getSDKTransactionID;
    private final String mErrorMessage;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r6 = r6 * 2
            int r6 = r6 + 1
            int r7 = r7 + 103
            byte[] r0 = atd.aa.getDeviceData.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
        L24:
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.getDeviceData.$$c(byte, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKAppID = 0;
        AuthenticationRequestParameters = 1;
        AuthenticationRequestParameters();
        Object[] objArr = new Object[1];
        a(new int[]{1288172268, -94455726, 356309130, -1353459649, -209703714, -1012178961, -268878623, 1362309455, 571306069, -1192419275}, 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 27 - Color.argb(0, 0, 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr2);
        APPLICATION_CONTEXT = new getDeviceData(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(new int[]{-623017917, 1211417223, -126921784, 231650408, 764355357, 198798974, -1686802122, -965479700, 1383369552, -1753483970}, 17 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(new int[]{-551199178, 914866914, 686875216, 192782468, -310578352, -1661413591, 1788512800, -1109976914, 947661753, 251731832, -929644166, 1812065231, 1309191863, -867923907}, TextUtils.lastIndexOf("", '0', 0) + 26, objArr4);
        CONFIG_PARAMETERS = new getDeviceData(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        b((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35057), 6 - ((Process.getThreadPriority(0) + 20) >> 6), 27 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        b((char) Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, (ViewConfiguration.getTapTimeout() >> 16) + 33, objArr6);
        LOCALE = new getDeviceData(strIntern3, 2, ((String) objArr6[0]).intern());
        Object[] objArr7 = new Object[1];
        a(new int[]{-2112963831, -1404561299, 748765122, 1442163194, 1939537379, 610402729, -115770926, -1591711410, 167826863, 396349642}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a(new int[]{-551199178, 914866914, 686875216, 192782468, -1315313888, 283891904, 898033376, 572564801, -527865534, 858330230, 63400073, -1647141850, 764675052, -670674891}, 26 - Drawable.resolveOpacity(0, 0), objArr8);
        DIRECTORY_SERVER_ID = new getDeviceData(strIntern4, 3, ((String) objArr8[0]).intern());
        Object[] objArr9 = new Object[1];
        b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14578), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, 48 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr9);
        String strIntern5 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a(new int[]{-551199178, 914866914, 686875216, 192782468, 1365280624, -1556826210, 650602369, -1892003806, 1034969547, 1736428007, 2029996797, 518827172}, 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr10);
        MESSAGE_VERSION = new getDeviceData(strIntern5, 4, ((String) objArr10[0]).intern());
        Object[] objArr11 = new Object[1];
        a(new int[]{-1944704460, -1131350624, 1499165580, -216952840, 1442948004, 597701431, 640074007, -655096515}, AndroidCharacter.getMirror('0') - ' ', objArr11);
        String strIntern6 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a(new int[]{-551199178, 914866914, 686875216, 192782468, 1234300734, 822657861, 424523455, -1816858652, 1475961144, -694353763, -889204562, -1740355110}, 24 - Color.blue(0), objArr12);
        CURRENT_ACTIVITY = new getDeviceData(strIntern6, 5, ((String) objArr12[0]).intern());
        Object[] objArr13 = new Object[1];
        b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 19 - Process.getGidForName(""), 63 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr13);
        String strIntern7 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 83 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr14);
        CHALLENGE_PARAMETERS = new getDeviceData(strIntern7, 6, ((String) objArr14[0]).intern());
        Object[] objArr15 = new Object[1];
        a(new int[]{-436799226, -1545417911, -264731841, -1430336786, 1187044219, -2094367730, -1748304716, 1678616898, -1456912304, -707038703, 1075288746, -169250701, -1930205010, 1577852462}, 24 - MotionEvent.axisFromString(""), objArr15);
        String strIntern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 8346), 32 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 110 - ExpandableListView.getPackedPositionChild(0L), objArr16);
        CHALLENGE_STATUS_RECEIVER = new getDeviceData(strIntern8, 7, ((String) objArr16[0]).intern());
        Object[] objArr17 = new Object[1];
        a(new int[]{-1751015854, -401621297, -962747839, 222521748}, 7 - KeyEvent.keyCodeFromString(""), objArr17);
        String strIntern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        b((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, 143 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr18);
        TIMEOUT = new getDeviceData(strIntern9, 8, ((String) objArr18[0]).intern());
        Object[] objArr19 = new Object[1];
        a(new int[]{97986424, 654324830, 461462281, -291976885, 2122201757, -1750464720, -209703714, -1012178961, -766745358, 1040564652}, 18 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr19);
        String strIntern10 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        a(new int[]{-551199178, 914866914, 686875216, 192782468, -515052871, -2035836534, 784291702, 1101081731, -156370695, -520190895, 1895066534, -426093269, 1309191863, -867923907}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25, objArr20);
        SDK_TRANSACTION_ID = new getDeviceData(strIntern10, 9, ((String) objArr20[0]).intern());
        Object[] objArr21 = new Object[1];
        a(new int[]{1982725231, 1331849878, -374124722, 642912398, 29528791, -1901189292}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11, objArr21);
        String strIntern11 = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        b((char) ((Process.myTid() >> 22) + 18871), 19 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 158, objArr22);
        DEVICE_DATA = new getDeviceData(strIntern11, 10, ((String) objArr22[0]).intern());
        Object[] objArr23 = new Object[1];
        a(new int[]{97986424, 654324830, -835657103, 513466069, 908508329, 308431313, -602580180, -1418017017, 79746602, 1132381802, 1892618078, 1619103095}, 24 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr23);
        String strIntern12 = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        b((char) (7830 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31, 178 - Color.green(0), objArr24);
        SDK_EPHEMERAL_PUBLIC_KEY = new getDeviceData(strIntern12, 11, ((String) objArr24[0]).intern());
        Object[] objArr25 = new Object[1];
        a(new int[]{97986424, 654324830, -1854804613, 1450213790, -766745358, 1040564652}, (ViewConfiguration.getLongPressTimeout() >> 16) + 10, objArr25);
        String strIntern13 = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        b((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17, (ViewConfiguration.getFadingEdgeLength() >> 16) + 208, objArr26);
        SDK_APP_ID = new getDeviceData(strIntern13, 12, ((String) objArr26[0]).intern());
        Object[] objArr27 = new Object[1];
        a(new int[]{97986424, 654324830, -1813884107, 1643107510, 821138862, -1559456687, -1001142257, 311599810, 260447499, -1680944915}, 20 - View.resolveSize(0, 0), objArr27);
        String strIntern14 = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        a(new int[]{-551199178, 914866914, 686875216, 192782468, -2126905040, 1001061729, 1166449402, -1447490411, 517243514, 1798691104, 71948401, 1053421095, 291076061, -1501254071}, 27 - Color.argb(0, 0, 0, 0), objArr28);
        SDK_REFERENCE_NUMBER = new getDeviceData(strIntern14, 13, ((String) objArr28[0]).intern());
        $VALUES = getSDKReferenceNumber();
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 1) % 128;
    }

    private getDeviceData(String str, int i11, String str2) {
        this.mErrorMessage = str2;
    }

    public static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = new int[]{-1865249011, 1758487654, 1174212492, 1240495798, 197936614, 408854963, -211160349, -205776369, 316159768, -819296444, -1184542605, -338063901, -1430607733, 910592661, -233076854, 1419811722, 638773116, 1562895159};
        getDeviceData = new char[]{62535, 17270, 39508, 53549, 10298, 26377, 48878, 62900, 19679, 39864, 53922, 10640, 24943, 47219, 63323, 20016, 34055, 56343, 11244, 25327, 47577, 61614, 20382, 34449, 56934, 5468, 27676, 31920, 52133, 4755, 23039, 41192, 61399, 62535, 17270, 39508, 53549, 10298, 26377, 48878, 62900, 19666, 39847, 53937, 10653, 24938, 47221, 63252, 52400, 31662, 41602, 59884, 4324, 24532, 34364, 52536, 29723, 41854, 60019, 4444, 22972, 32940, 53127, 62541, 17232, 39523, 53504, 10266, 26405, 48836, 62931, 19707, 39831, 53890, 10685, 24916, 47185, 63351, 19969, 34106, 56381, 11216, 25343, 62535, 17270, 39508, 53549, 10298, 26377, 48878, 62900, 19677, 39840, 53939, 10640, 24938, 47221, 63316, 20003, 34059, 56360, 11235, 25310, 47575, 61613, 20367, 34432, 56955, 5466, 27713, 47986, 54492, 25581, 47823, 61878, 2209, 18322, 40565, 54575, 27718, 47931, 61992, 2315, 16881, 39150, 55247, 28344, 42384, 64688, 2925, 16982, 39257, 53294, 28418, 42557, 65248, 13776, 19660, 39854, 53899, 27022, 41075, 65297, 62535, 17270, 39508, 53549, 10298, 26377, 48878, 62900, 19658, 39841, 53951, 10649, 24905, 47205, 63310, 20074, 48624, 2753, 54243, 39066, 24973, 11966, 63321, 48131, 1389, 53786, 39699, 24610, 10450, 61890, 48841, 1938, 52397, 38318, 25115, 60114, 24035, 33985, 53176, 13999, 31132, 41083, 60193, 21080, 34105, 52268, 14124, 32739, 42733, 59850, 20668, 39838, 49823, 13686, 31829, 42867, 60960, 20765, 38925, 49378, 3038, 29420, 42412, 60554, 22475, 62535, 17270, 39508, 53549, 10298, 26377, 48878, 62900, 19661, 39852, 53945, 10685, 24950, 47200, 63347, 19968, 34112};
        getSDKTransactionID = -3984662635913854184L;
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        char c3;
        int i13;
        char c7;
        char[] cArr;
        int[] iArr2;
        int i14;
        char c8;
        getMessageVersion getmessageversion = new getMessageVersion();
        char[] cArr2 = new char[4];
        int i15 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        char c11 = 1;
        int i16 = 0;
        if (iArr3 != null) {
            $11 = ($10 + 1) % 128;
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i17 = 0;
            while (i17 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i17])};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID == null) {
                        c8 = c11;
                        int iResolveOpacity = Drawable.resolveOpacity(i16, i16) + 2223;
                        i14 = i15;
                        char bitsPerPixel = (char) (53069 - ImageFormat.getBitsPerPixel(i16));
                        int trimmedLength = TextUtils.getTrimmedLength("") + 21;
                        byte b8 = $$a[c8];
                        byte b11 = (byte) (b8 + 1);
                        sDKTransactionID = ChallengeResult.getDeviceData(iResolveOpacity, bitsPerPixel, trimmedLength, 1089703072, false, $$c(b11, (byte) (b11 | 11), (byte) (b8 + 1)), new Class[]{cls});
                    } else {
                        i14 = i15;
                        c8 = c11;
                    }
                    iArr4[i17] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i17++;
                    c11 = c8;
                    i15 = i14;
                    i16 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i12 = i15;
            c3 = c11;
            i13 = -1667528016;
            $10 = ($11 + 125) % 128;
            iArr3 = iArr4;
        } else {
            i12 = 2;
            c3 = 1;
            i13 = -1667528016;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getSDKReferenceNumber;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i18 = 0;
            while (i18 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr6[i18])};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(i13);
                if (sDKTransactionID2 == null) {
                    int iResolveOpacity2 = 2223 - Drawable.resolveOpacity(0, 0);
                    char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 53070);
                    int mode = 21 - View.MeasureSpec.getMode(0);
                    byte b12 = $$a[c3];
                    cArr = cArr2;
                    byte b13 = (byte) (b12 + 1);
                    iArr2 = iArr6;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(iResolveOpacity2, scrollBarSize, mode, 1089703072, false, $$c(b13, (byte) (b13 | 11), (byte) (b12 + 1)), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                }
                iArr7[i18] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                i18++;
                cArr2 = cArr;
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i19 = getmessageversion.getSDKAppID;
            if (i19 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            char c12 = 17;
            $10 = ($11 + 17) % 128;
            int i21 = iArr[i19];
            char c13 = (char) (i21 >> 16);
            cArr4[0] = c13;
            char c14 = (char) i21;
            cArr4[c3] = c14;
            char c15 = (char) (iArr[i19 + 1] >> 16);
            cArr4[i12] = c15;
            char c16 = (char) iArr[i19 + 1];
            cArr4[3] = c16;
            getmessageversion.getDeviceData = (c13 << 16) + c14;
            getmessageversion.AuthenticationRequestParameters = (c15 << 16) + c16;
            getMessageVersion.getSDKTransactionID(iArr5);
            int i22 = 0;
            while (i22 < 16) {
                int i23 = $11 + 7;
                $10 = i23 % 128;
                int i24 = i23 % 2;
                int i25 = getmessageversion.getDeviceData;
                if (i24 != 0) {
                    int i26 = iArr5[i22] ^ i25;
                    getmessageversion.getDeviceData = i26;
                    int sDKReferenceNumber = getMessageVersion.getSDKReferenceNumber(i26);
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = getmessageversion;
                    objArr4[i12] = getmessageversion;
                    objArr4[c3] = Integer.valueOf(sDKReferenceNumber);
                    objArr4[0] = getmessageversion;
                    Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID3 == null) {
                        int mirror = AndroidCharacter.getMirror('0') + 2338;
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 19;
                        byte b14 = $$a[c3];
                        byte b15 = (byte) (b14 + 1);
                        c7 = c12;
                        sDKTransactionID3 = ChallengeResult.getDeviceData(mirror, deadChar, iCombineMeasuredStates, -2040903174, false, $$c(b15, (byte) (b15 | 9), (byte) (b14 + 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                    } else {
                        c7 = c12;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue;
                    i22 += 23;
                } else {
                    c7 = c12;
                    int i27 = iArr5[i22] ^ i25;
                    getmessageversion.getDeviceData = i27;
                    int sDKReferenceNumber2 = getMessageVersion.getSDKReferenceNumber(i27);
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = getmessageversion;
                    objArr5[i12] = getmessageversion;
                    objArr5[c3] = Integer.valueOf(sDKReferenceNumber2);
                    objArr5[0] = getmessageversion;
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID4 == null) {
                        int edgeSlop = 2386 - (ViewConfiguration.getEdgeSlop() >> 16);
                        char cRed = (char) Color.red(0);
                        int edgeSlop2 = 19 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b16 = $$a[c3];
                        byte b17 = (byte) (b16 + 1);
                        sDKTransactionID4 = ChallengeResult.getDeviceData(edgeSlop, cRed, edgeSlop2, -2040903174, false, $$c(b17, (byte) (b17 | 9), (byte) (b16 + 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue2;
                    i22++;
                }
                c12 = c7;
            }
            char c17 = c12;
            int i28 = getmessageversion.getDeviceData;
            int i29 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i29;
            getmessageversion.AuthenticationRequestParameters = i28;
            int i31 = i28 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i31;
            int i32 = i29 ^ iArr5[c17];
            getmessageversion.getDeviceData = i32;
            cArr4[0] = (char) (i32 >>> 16);
            cArr4[c3] = (char) i32;
            cArr4[i12] = (char) (i31 >>> 16);
            cArr4[3] = (char) i31;
            getMessageVersion.getSDKTransactionID(iArr5);
            int i33 = getmessageversion.getSDKAppID;
            cArr3[i33 * 2] = cArr4[0];
            cArr3[(i33 * 2) + 1] = cArr4[c3];
            cArr3[(i33 * 2) + 2] = cArr4[i12];
            cArr3[(i33 * 2) + 3] = cArr4[3];
            int i34 = i12;
            Object[] objArr6 = new Object[i34];
            objArr6[c3] = getmessageversion;
            objArr6[0] = getmessageversion;
            Object sDKTransactionID5 = ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID5 == null) {
                int bitsPerPixel2 = 1860 - ImageFormat.getBitsPerPixel(0);
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int offsetAfter = 40 - TextUtils.getOffsetAfter("", 0);
                byte b18 = $$a[c3];
                byte b19 = (byte) (b18 + 1);
                sDKTransactionID5 = ChallengeResult.getDeviceData(bitsPerPixel2, cIndexOf, offsetAfter, -562771681, false, $$c(b19, (byte) (b19 | 10), (byte) (b18 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID5).invoke(null, objArr6);
            i12 = i34;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(char r34, int r35, int r36, java.lang.Object[] r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.getDeviceData.b(char, int, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ getDeviceData[] getSDKReferenceNumber() {
        int i11 = (AuthenticationRequestParameters + 57) % 128;
        getSDKAppID = i11;
        getDeviceData[] getdevicedataArr = {APPLICATION_CONTEXT, CONFIG_PARAMETERS, LOCALE, DIRECTORY_SERVER_ID, MESSAGE_VERSION, CURRENT_ACTIVITY, CHALLENGE_PARAMETERS, CHALLENGE_STATUS_RECEIVER, TIMEOUT, SDK_TRANSACTION_ID, DEVICE_DATA, SDK_EPHEMERAL_PUBLIC_KEY, SDK_APP_ID, SDK_REFERENCE_NUMBER};
        AuthenticationRequestParameters = (i11 + 125) % 128;
        return getdevicedataArr;
    }

    public static void init$0() {
        $$a = new byte[]{110, -1, -32, -95};
        $$b = 150;
    }

    public static getDeviceData valueOf(String str) {
        getSDKAppID = (AuthenticationRequestParameters + 31) % 128;
        getDeviceData getdevicedata = (getDeviceData) Enum.valueOf(getDeviceData.class, str);
        getSDKAppID = (AuthenticationRequestParameters + 45) % 128;
        return getdevicedata;
    }

    public static getDeviceData[] values() {
        getSDKAppID = (AuthenticationRequestParameters + 5) % 128;
        getDeviceData[] getdevicedataArr = (getDeviceData[]) $VALUES.clone();
        int i11 = AuthenticationRequestParameters + 89;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            return getdevicedataArr;
        }
        throw null;
    }

    public final InvalidInputException getSDKAppID() {
        int i11 = getSDKAppID + 27;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            getSDKTransactionID();
            throw null;
        }
        InvalidInputException sDKTransactionID = getSDKTransactionID();
        getSDKAppID = (AuthenticationRequestParameters + 83) % 128;
        return sDKTransactionID;
    }

    public final InvalidInputException getSDKTransactionID() {
        InvalidInputException invalidInputException = new InvalidInputException(this.mErrorMessage, null);
        int i11 = AuthenticationRequestParameters + 79;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            return invalidInputException;
        }
        throw null;
    }
}
