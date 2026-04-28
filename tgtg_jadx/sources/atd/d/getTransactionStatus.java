package atd.d;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.onCompletion;
import atd.p.ChallengeResultTimeout;
import c50.w;
import com.app.tgtg.model.local.AppConstants;
import com.braze.h2;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r8.k;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getTransactionStatus {
    private static int getSDKEphemeralPublicKey = 1;
    private static int getSDKReferenceNumber;
    private final byte[] AuthenticationRequestParameters;
    private final String getDeviceData;
    private final getMessageVersion getSDKAppID;
    private final Map<String, List<String>> getSDKTransactionID;

    public getTransactionStatus(getDeviceData getdevicedata) {
        this.getDeviceData = getdevicedata.getDeviceData;
        this.getSDKAppID = getdevicedata.getSDKTransactionID;
        this.getSDKTransactionID = getdevicedata.AuthenticationRequestParameters;
        this.AuthenticationRequestParameters = getdevicedata.getSDKReferenceNumber;
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(int i11, int i12, int i13, int i14, int i15, Object[] objArr, int i16) {
        int i17 = ~i11;
        int i18 = ~(i17 | i15);
        int i19 = ~i16;
        int i21 = ~i15;
        int i22 = i18 | (~(i19 | i21 | i11));
        int i23 = (~(i15 | i19 | i11)) | (~(i17 | i21));
        int i24 = ~(i17 | i19);
        int i25 = (-750387200) * i14;
        int i26 = ((-523632640) * i12) + i25 + (834535424 * i13) + ((-1613556599) * i24) + (i23 * (-1613556599)) + (i22 * (-1613556599)) + ((-1846875272) * i11) + ((i16 * (-1846875272)) - 1480523776);
        int iC = a0.c(i12, 1579510587, (762713021 * i14) + i16 + i11 + i13);
        int i27 = i23 * 659;
        int i28 = i24 * 659;
        int i29 = i13 * (-1364308165);
        int i31 = i14 * (-893132913);
        int i32 = i12 * 986770329;
        int iE = a0.e(iC, -1162149888, i32 + i31 + i29 + i28 + i27 + (i22 * 659) + (i11 * (-1364308824)) + ((i16 * (-1364308824)) - 1074288667), -1529413632, ((-1971257344) * iC) + i26);
        if (iE == 1) {
            return AuthenticationRequestParameters(objArr);
        }
        if (iE == 2) {
            return getDeviceData(objArr);
        }
        if (iE == 3) {
            return getSDKAppID(objArr);
        }
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[0];
        int i33 = getSDKReferenceNumber;
        int i34 = ((i33 & 41) + (i33 | 41)) % 128;
        getSDKEphemeralPublicKey = i34;
        getMessageVersion getmessageversion = gettransactionstatus.getSDKAppID;
        getSDKReferenceNumber = ((i34 & 85) + (i34 | 85)) % 128;
        return getmessageversion;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[0];
        int i11 = getSDKEphemeralPublicKey;
        getSDKReferenceNumber = k.c(i11 & 42, i11 | 42, 1, 128);
        Map<String, List<String>> map = gettransactionstatus.getSDKTransactionID;
        int i12 = i11 + 121;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 == 0) {
            return map;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[0];
        int i11 = getSDKReferenceNumber;
        int i12 = (((i11 | 85) << 1) - (i11 ^ 85)) % 128;
        getSDKEphemeralPublicKey = i12;
        byte[] bArr = gettransactionstatus.AuthenticationRequestParameters;
        if (bArr == null) {
            int i13 = i12 + 91;
            getSDKReferenceNumber = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 29 / 0;
            }
            return null;
        }
        getSDKReferenceNumber = k.c(i12 & 6, i12 | 6, 1, 128);
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        int i15 = getSDKReferenceNumber;
        int i16 = (i15 & 1) + (i15 | 1);
        getSDKEphemeralPublicKey = i16 % 128;
        if (i16 % 2 != 0) {
            return bArrCopyOf;
        }
        throw null;
    }

    public final Map<String, List<String>> getSDKReferenceNumber() {
        int sDKTransactionID = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        int sDKTransactionID2 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        int sDKTransactionID3 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        return (Map) AuthenticationRequestParameters(-60421338, ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID2, sDKTransactionID3, sDKTransactionID, new Object[]{this}, 60421340);
    }

    public final byte[] getSDKTransactionID() {
        int sDKTransactionID = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        int sDKTransactionID2 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        int sDKTransactionID3 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        return (byte[]) AuthenticationRequestParameters(-1495701711, ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID2, sDKTransactionID3, sDKTransactionID, new Object[]{this}, 1495701714);
    }

    public final String getDeviceData() {
        int sDKTransactionID = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        int sDKTransactionID2 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        int sDKTransactionID3 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        return (String) AuthenticationRequestParameters(-1137934808, ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID2, sDKTransactionID3, sDKTransactionID, new Object[]{this}, 1137934809);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int BuildConfig;
        private static int ChallengeResult;
        private static long ChallengeResultCancelled;
        private static char getMessageVersion;
        private static int getSDKAppID;
        private static int getSDKEphemeralPublicKey;
        String getDeviceData;
        byte[] getSDKReferenceNumber;
        getMessageVersion getSDKTransactionID = getMessageVersion.GET;
        Map<String, List<String>> AuthenticationRequestParameters = new HashMap();

        private static String $$c(short s7, short s8, int i11) {
            byte[] bArr = $$a;
            int i12 = s7 * 3;
            int i13 = 119 - s8;
            int i14 = 3 - (i11 * 2);
            byte[] bArr2 = new byte[1 - i12];
            int i15 = 0 - i12;
            int i16 = -1;
            if (bArr == null) {
                i13 += -i14;
                i14 = i14;
                bArr = bArr;
                i16 = -1;
            }
            while (true) {
                int i17 = i16 + 1;
                bArr2[i17] = (byte) i13;
                if (i17 == i15) {
                    return new String(bArr2, 0);
                }
                int i18 = i14 + 1;
                byte[] bArr3 = bArr;
                i13 += -bArr[i18];
                i14 = i18;
                bArr = bArr3;
                i16 = i17;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKEphemeralPublicKey = 0;
            BuildConfig = 1;
            getSDKAppID = 711855217;
            ChallengeResultCancelled = 1905653906042338631L;
            ChallengeResult = 805139812;
            getMessageVersion = (char) 15687;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x015e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(boolean r22, int r23, java.lang.String r24, int r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 361
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.d.getTransactionStatus.getDeviceData.a(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
        }

        private static void b(int i11, String str, String str2, char c3, String str3, Object[] objArr) throws Throwable {
            char[] charArray;
            char[] charArray2;
            int i12;
            float f11;
            int i13;
            char c7;
            int i14 = ($10 + 3) % 128;
            $11 = i14;
            if (str3 != null) {
                $10 = (i14 + 111) % 128;
                charArray = str3.toCharArray();
            } else {
                charArray = str3;
            }
            char[] cArr = charArray;
            char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
            int i15 = 2;
            int i16 = 0;
            if (str != null) {
                int i17 = $10 + 93;
                $11 = i17 % 128;
                if (i17 % 2 == 0) {
                    charArray2 = str.toCharArray();
                    int i18 = 72 / 0;
                } else {
                    charArray2 = str.toCharArray();
                }
            } else {
                charArray2 = str;
            }
            char[] cArr2 = charArray2;
            onCompletion oncompletion = new onCompletion();
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int length2 = cArr.length;
            char[] cArr4 = new char[length2];
            System.arraycopy(cArr2, 0, cArr3, 0, length);
            System.arraycopy(cArr, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c3);
            cArr4[2] = (char) (cArr4[2] + ((char) i11));
            int length3 = charArray3.length;
            char[] cArr5 = new char[length3];
            oncompletion.getDeviceData = 0;
            while (oncompletion.getDeviceData < length3) {
                $10 = ($11 + 33) % 128;
                try {
                    Object[] objArr2 = {oncompletion};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) i16;
                        i12 = i15;
                        byte b11 = (byte) (b8 + 2);
                        f11 = 0.0f;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2069 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.getCapsMode("", i16, i16) + 44657), Color.argb(i16, i16, i16, i16) + 32, -397560981, false, $$c(b8, b11, (byte) (b11 - 2)), new Class[]{Object.class});
                    } else {
                        i12 = i15;
                        f11 = 0.0f;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {oncompletion};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                    if (sDKTransactionID2 == null) {
                        int scrollBarFadeDuration = 3095 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        char c8 = (char) (14368 - (AudioTrack.getMaxVolume() > f11 ? 1 : (AudioTrack.getMaxVolume() == f11 ? 0 : -1)));
                        int offsetAfter = 18 - TextUtils.getOffsetAfter("", i16);
                        byte b12 = (byte) i16;
                        i13 = i16;
                        byte b13 = (byte) (b12 + 1);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(scrollBarFadeDuration, c8, offsetAfter, -1211924053, false, $$c(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class});
                    } else {
                        i13 = i16;
                    }
                    int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    int i19 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[i12] = Integer.valueOf(cArr4[iIntValue]);
                    objArr4[1] = Integer.valueOf(i19);
                    objArr4[i13] = oncompletion;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID3 == null) {
                        int i21 = i13;
                        c7 = 1;
                        float f12 = f11;
                        byte b14 = (byte) i21;
                        byte b15 = b14;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((TypedValue.complexToFraction(i21, f12, f12) > f12 ? 1 : (TypedValue.complexToFraction(i21, f12, f12) == f12 ? 0 : -1)) + 1428, (char) TextUtils.indexOf("", "", i21, i21), TextUtils.indexOf((CharSequence) "", '0', i21, i21) + 31, -1183253656, false, $$c(b14, b15, b15), new Class[]{Object.class, cls, cls});
                    } else {
                        c7 = 1;
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                    int i22 = cArr3[iIntValue2] * 32718;
                    char c11 = cArr4[iIntValue];
                    int i23 = i12;
                    Object[] objArr5 = new Object[i23];
                    objArr5[c7] = Integer.valueOf(c11);
                    objArr5[0] = Integer.valueOf(i22);
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                    if (sDKTransactionID4 == null) {
                        byte b16 = (byte) 0;
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2775 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (Drawable.resolveOpacity(0, 0) + 13060), 25 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -320602145, false, $$c(b16, (byte) (b16 | 51), b16), new Class[]{cls, cls});
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                    int i24 = oncompletion.getDeviceData;
                    cArr5[i24] = (char) (((((long) (r3 ^ charArray3[i24])) ^ (ChallengeResultCancelled ^ 1905653906042338631L)) ^ ((long) ((int) (((long) ChallengeResult) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getMessageVersion) ^ 1905653906042338631L))));
                    oncompletion.getDeviceData = i24 + 1;
                    i15 = i23;
                    i16 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr5);
        }

        private getDeviceData getSDKAppID(getMessageVersion getmessageversion, byte[] bArr) throws Throwable {
            byte[] bArrCopyOf;
            int i11 = (getSDKEphemeralPublicKey + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
            BuildConfig = i11;
            if (getmessageversion == null) {
                Object[] objArr = new Object[1];
                b((ViewConfiguration.getTouchSlop() >> 8) + 1511564100, "䓏ᢣ꽚甦", "헯뺴Ń姇\udfdc攁康鹌\u0fe0꿔ﰊ曩廕辣ꇋ", (char) (9902 - Process.getGidForName("")), "\u0000\u0000\u0000\u0000", objArr);
                w.l(((String) objArr[0]).intern());
                return null;
            }
            if (bArr != null) {
                getSDKEphemeralPublicKey = (i11 + 69) % 128;
                if (!getMessageVersion.getDeviceData(getmessageversion)) {
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr2 = new Object[1];
                    b((-338779701) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "쯐캡䛫︠", "炢䋐朔ⴰ弩オ귯", (char) ((-1) - Process.getGidForName("")), "\u0000\u0000\u0000\u0000", objArr2);
                    sb2.append(((String) objArr2[0]).intern());
                    sb2.append(getmessageversion);
                    Object[] objArr3 = new Object[1];
                    b(ViewConfiguration.getScrollBarFadeDuration() >> 16, "꩘诗䡚\u0ae4", "꿛㌏懕㤏蚢ꓡ駙\ud87d⋯꤈峥趺\u0c64緘惃\u128e䲽ࢲ쐆懈椵ꮤ嵅ᤍ䱥㕖ﺂ碋ト\ue134", (char) (58441 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), "\u0000\u0000\u0000\u0000", objArr3);
                    sb2.append(((String) objArr3[0]).intern());
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            if (bArr == null && getMessageVersion.getSDKAppID(getmessageversion)) {
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr4 = new Object[1];
                b(Color.green(0) - 338779701, "쯐캡䛫︠", "炢䋐朔ⴰ弩オ귯", (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0000\u0000\u0000\u0000", objArr4);
                sb3.append(((String) objArr4[0]).intern());
                sb3.append(getmessageversion);
                Object[] objArr5 = new Object[1];
                a(false, 273 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0014\t\u001eￓￅ\u0012\u001a\u0018\u0019ￅ\r\u0006\u001b\nￅ\u0006ￅ\u0017\n\u0016\u001a\n\u0018\u0019ￅ\u0007", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4, 26 - (Process.myPid() >> 22), objArr5);
                sb3.append(((String) objArr5[0]).intern());
                throw new IllegalArgumentException(sb3.toString());
            }
            this.getSDKTransactionID = getmessageversion;
            if (bArr != null) {
                getSDKEphemeralPublicKey = (BuildConfig + 21) % 128;
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                getSDKEphemeralPublicKey = (BuildConfig + 53) % 128;
            } else {
                BuildConfig = (getSDKEphemeralPublicKey + 45) % 128;
                bArrCopyOf = null;
            }
            this.getSDKReferenceNumber = bArrCopyOf;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r16v0 */
        /* JADX WARN: Type inference failed for: r16v1 */
        /* JADX WARN: Type inference failed for: r16v11, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r16v13, types: [int] */
        /* JADX WARN: Type inference failed for: r16v19 */
        /* JADX WARN: Type inference failed for: r16v2 */
        /* JADX WARN: Type inference failed for: r16v20 */
        /* JADX WARN: Type inference failed for: r16v21 */
        /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r16v7 */
        /* JADX WARN: Type inference failed for: r16v8, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r16v9, types: [java.lang.String] */
        public static Object[] getSDKReferenceNumber(Context context, int i11, int i12) {
            ?? r16;
            int i13;
            ?? r162;
            int i14;
            Object[] objArr;
            Object[] objArr2;
            int i15 = 4;
            if (context == null) {
                Object[] objArr3 = {new int[]{i11}, new int[1], new int[]{i11}, null};
                int iMyUid = Process.myUid();
                int iA = l1.a((~((~iMyUid) | (-649047005))) | 545295056, 560, ((~(iMyUid | 935325661)) * (-560)) + (((~(831573713 | r3)) * (-560)) - 36387244), i12);
                int i16 = iA ^ (iA << 13);
                int i17 = i16 ^ (i16 >>> 17);
                ((int[]) objArr3[1])[0] = i17 ^ (i17 << 5);
                return objArr3;
            }
            try {
                Object[] objArr4 = new Object[1];
                i14 = 16;
                a(true, 274 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18, 38 - ((Process.getThreadPriority(0) + 20) >> 6), objArr4);
                objArr = (Object[]) Array.newInstance(Class.forName(((String) objArr4[0]).intern()), 2);
                r16 = "쟾䨏\ue0bb쵒뀎揬ࠟ魀\u18af䒗໑뎥Ꝥ㻻ၧ깝삭ꆴ畚裻猢⏂ｕ棘嶑\uf205ꄇ\ue9e1䑃동\uea1c";
                Object[] objArr5 = new Object[1];
                b((-996873301) - View.MeasureSpec.getSize(0), "\uab6e铫\udcc4鰚", "쟾䨏\ue0bb쵒뀎揬ࠟ魀\u18af䒗໑뎥Ꝥ㻻ၧ깝삭ꆴ畚裻猢⏂ｕ棘嶑\uf205ꄇ\ue9e1䑃동\uea1c", (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6877), "\u0000\u0000\u0000\u0000", objArr5);
                try {
                    try {
                        Object[] objArr6 = {((String) objArr5[0]).intern()};
                        r16 = "\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r";
                        Object[] objArr7 = new Object[1];
                        a(true, (KeyEvent.getMaxKeyCode() >> 16) + 273, "\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r", TextUtils.getTrimmedLength("") + 18, 38 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr7);
                        objArr[0] = Class.forName(((String) objArr7[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr6);
                        r16 = "垎ẚ拓勨톰옌他囩췖땔靼\ue583\ud7ab팓⪿䴫և犨迨栺\ue020\ud9deḊᯙ⊵\ued7a\ud7c9㕴\ue2f2ᵶ唝";
                        objArr2 = new Object[1];
                        b(ExpandableListView.getPackedPositionChild(0L) - 292651685, "嫓蹽꣮쟣", "垎ẚ拓勨톰옌他囩췖땔靼\ue583\ud7ab팓⪿䴫և犨迨栺\ue020\ud9deḊᯙ⊵\ued7a\ud7c9㕴\ue2f2ᵶ唝", (char) (KeyEvent.getDeadChar(0, 0) + 58280), "\u0000\u0000\u0000\u0000", objArr2);
                    } catch (Throwable unused) {
                        i13 = 4;
                        r162 = r16;
                    }
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            } catch (Throwable unused2) {
                r16 = 3;
            }
            try {
                Object[] objArr8 = {((String) objArr2[0]).intern()};
                r16 = "\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r";
                Object[] objArr9 = new Object[1];
                a(true, 273 - View.resolveSizeAndState(0, 0, 0), "\u0019\u001a\u0006ￓ\u001e\u0019\u000e\u0017\u001a\b\n\u0018ￓ\u001d\u0006\u001b\u0006\u000f\u0011\u0006\u0015\u000e\b\u0013\u000e\u0017\ufff5ￕￕￚ�ￓￕￕￚ\u001dￓ\r", ExpandableListView.getPackedPositionType(0L) + 18, View.MeasureSpec.getSize(0) + 38, objArr9);
                objArr[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                try {
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 283;
                    r16 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22;
                    Object[] objArr10 = new Object[1];
                    float f11 = 0.0f;
                    a(true, windowTouchSlop, "\u0013\u0000\u000f\t\n\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff\t￼\u000f", r16, 23 - TextUtils.getCapsMode("", 0, 0), objArr10);
                    Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                    Object[] objArr11 = new Object[1];
                    a(true, (ViewConfiguration.getEdgeSlop() >> 16) + 282, "\n�￩\u0001\u0003�\u0007\uffff�￬\u0010\u0001\u0003\u000e\u0001\u0003�", 13 - (ViewConfiguration.getEdgeSlop() >> 16), 17 - (ViewConfiguration.getScrollBarSize() >> 8), objArr11);
                    Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                    try {
                        Object[] objArr12 = new Object[1];
                        a(true, 283 - Gravity.getAbsoluteGravity(0, 0), "\u0013\u0000\u000f\t\n\uffde\uffc9\u000f\t\u0000\u000f\t\n\ufffe\uffc9\uffff\u0004\n\r\uffff\t￼\u000f", (-16777194) - Color.rgb(0, 0, 0), 23 - (ViewConfiguration.getTapTimeout() >> 16), objArr12);
                        Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                        r16 = 3;
                        try {
                            Object[] objArr13 = new Object[1];
                            a(false, (ViewConfiguration.getLongPressTimeout() >> 16) + 281, "\u0002￫\ufffe\n\u0002\u0004\u0002\u0011￭\ufffe\u0000\b\ufffe\u0004", 5 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 14, objArr13);
                            try {
                                Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                Object[] objArr15 = new Object[1];
                                b((-326526161) - TextUtils.indexOf("", ""), "⿲覛죬㉠", "ᶙ뗟癡折ᐯ渲\uf0f5觝\ued60㿜턛☲ਕ\ue47c⭃녾⏑냤툇⿌⼸ⓟꓪ˾荒㩮調፼娳斈\udc2b薤᪤", (char) View.getDefaultSize(0, 0), "\u0000\u0000\u0000\u0000", objArr15);
                                Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                Object[] objArr16 = new Object[1];
                                a(false, 281 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\u0007�\u0003\u0001￥\n\u0002\u000b\u0003\u0001\u0010￬�\uffff", 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 14 - View.combineMeasuredStates(0, 0), objArr16);
                                Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                Object[] objArr17 = new Object[1];
                                a(false, 278 - ImageFormat.getBitsPerPixel(0), "\fￍ\uffef\u0000\u0002\n\u0000\u0006\u0004￨\r\u0005\u000e\u0000\r\u0003\u0011\u000e\b\u0003ￍ\u0002\u000e\r\u0013\u0004\r\u0013ￍ\u000f", 13 - (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.keyCodeFromString("") + 30, objArr17);
                                Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                Object[] objArr18 = new Object[1];
                                a(false, (ViewConfiguration.getScrollBarSize() >> 8) + 291, "￼\ufffa\u0001\ufff4\u0007\b\u0005\ufff8\u0006\u0006", 9 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 10, objArr18);
                                Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                int length = objArr19.length;
                                int i18 = 0;
                                while (i18 < length) {
                                    Object obj = objArr19[i18];
                                    int i19 = i14;
                                    Object[] objArr20 = new Object[1];
                                    a(true, 240 - TextUtils.indexOf("", "", 0), "\ufffb\ufff4\u001e\uffff\ufff6", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, objArr20);
                                    try {
                                        Object[] objArr21 = {((String) objArr20[0]).intern()};
                                        Object[] objArr22 = new Object[1];
                                        a(true, 282 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\uffffￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�\u0006\u0015\u000e\u000b\u0010\uffff�￢\u0001\u0010�\uffff\u0005\u0002\u0005\u0010\u000e\u0001\uffdfￊ\u0010\u000e\u0001", 15 - View.resolveSize(0, 0), TextUtils.indexOf("", "", 0) + 37, objArr22);
                                        Class<?> cls5 = Class.forName(((String) objArr22[0]).intern());
                                        Object[] objArr23 = new Object[1];
                                        a(true, TextUtils.getOffsetBefore("", 0) + 285, "\u0007￢\r\ufffe\u0000\ufffe￼\u0007\ufffa\r\f", TextUtils.indexOf("", "", 0) + 5, (Process.myPid() >> 22) + 11, objArr23);
                                        Object objInvoke3 = cls5.getMethod(((String) objArr23[0]).intern(), String.class).invoke(null, objArr21);
                                        try {
                                            Object[] objArr24 = new Object[1];
                                            b(1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\uefcbꗀ桗⓷", "\uf434䷹ᜢꦘ冄⎶鈈筢윪Ḣ讥例⬑⹚趇\ue465匛맷钴吠僕韪띢挭薆糔쇽笓", (char) (Color.argb(0, 0, 0, 0) + 63336), "\u0000\u0000\u0000\u0000", objArr24);
                                            Class<?> cls6 = Class.forName(((String) objArr24[0]).intern());
                                            int iAlpha = Color.alpha(0) + 285;
                                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 11;
                                            int i21 = (PointF.length(f11, f11) > f11 ? 1 : (PointF.length(f11, f11) == f11 ? 0 : -1)) + 11;
                                            Object[] objArr25 = new Object[1];
                                            a(true, iAlpha, "\u0012\ufffa\u000b\u000bￚ\ufffe\r\u0012ￛ\b\r", iResolveOpacity, i21, objArr25);
                                            try {
                                                Object[] objArr26 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr25[0]).intern(), null).invoke(obj, null))};
                                                Object[] objArr27 = new Object[1];
                                                a(true, TextUtils.lastIndexOf("", '0', 0) + 283, "\uffffￊ\u0015\u0010\u0005\u000e\u0011\uffff\u0001\u000fￊ�\u0012�\u0006\u0015\u000e\u000b\u0010\uffff�￢\u0001\u0010�\uffff\u0005\u0002\u0005\u0010\u000e\u0001\uffdfￊ\u0010\u000e\u0001", KeyEvent.normalizeMetaState(0) + 15, 38 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr27);
                                                Class<?> cls7 = Class.forName(((String) objArr27[0]).intern());
                                                Object[] objArr28 = new Object[1];
                                                a(false, KeyEvent.getDeadChar(0, 0) + 285, "\r\u0002\uffff\u0002￼\ufffa\r\ufffe\u0000\ufffe\u0007\ufffe\u000b\ufffa\r\ufffeￜ\ufffe\u000b", 8 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getOffsetAfter("", 0) + 19, objArr28);
                                                Object objInvoke4 = cls7.getMethod(((String) objArr28[0]).intern(), InputStream.class).invoke(objInvoke3, objArr26);
                                                for (int i22 = 0; i22 < 2; i22++) {
                                                    Object obj2 = objArr[i22];
                                                    try {
                                                        Object[] objArr29 = new Object[1];
                                                        b(((byte) KeyEvent.getModifierMetaStateMask()) + 1, "軤莍\uf196㔯", "ᚇ拲\ud8f3ꒇ羁罰蕏싚蔯븄۩挘毉兀퍬踈戚壵䢮힔掼㶋퍭욉\uda9b칺僛⾏鶫쉱﨏\ue6d0넝㠢", (char) (ViewConfiguration.getTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", objArr29);
                                                        Class<?> cls8 = Class.forName(((String) objArr29[0]).intern());
                                                        Object[] objArr30 = new Object[1];
                                                        a(true, Color.argb(0, 0, 0, 0) + 277, "\ufff9\u0015\u0004\u0006\u000b\u0003\u0016\ufff4\u0015\u0006\b\r\u0002\u0011\n\u0004\u000f\n\u0013\ufff1\uffd1\uffd1ￖ", 11 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23, objArr30);
                                                        if (obj2.equals(cls8.getMethod(((String) objArr30[0]).intern(), null).invoke(objInvoke4, null))) {
                                                            Object[] objArr31 = {new int[]{i11}, new int[1], new int[]{i11 ^ 1}, null};
                                                            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                                            int iD = a0.D((~((~iMaxMemory) | (-230112501))) | 37749003, 564, ((~(iMaxMemory | (-9836789))) * 1128) + (((((~(47585791 | r2)) | (-230112501)) | (~((-47585792) | iMaxMemory))) * (-564)) - 1820487324), i19, i12);
                                                            int i23 = iD ^ (iD << 13);
                                                            int i24 = i23 ^ (i23 >>> 17);
                                                            ((int[]) objArr31[1])[0] = i24 ^ (i24 << 5);
                                                            return objArr31;
                                                        }
                                                    } catch (Throwable th3) {
                                                        Throwable cause2 = th3.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th3;
                                                    }
                                                }
                                                i14 = i19;
                                                i18++;
                                                i15 = 4;
                                                f11 = 0.0f;
                                            } catch (Throwable th4) {
                                                Throwable cause3 = th4.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th4;
                                            }
                                        } catch (Throwable th5) {
                                            Throwable cause4 = th5.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th5;
                                        }
                                    } catch (Throwable th6) {
                                        Throwable cause5 = th6.getCause();
                                        if (cause5 != null) {
                                            throw cause5;
                                        }
                                        throw th6;
                                    }
                                }
                                i13 = i15;
                                r162 = 3;
                                Object[] objArr32 = new Object[i13];
                                objArr32[0] = new int[]{i11};
                                objArr32[1] = new int[1];
                                objArr32[2] = new int[]{i11};
                                objArr32[r162] = null;
                                int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                int i25 = (((~((-226151832) | iMaxMemory2)) | 43625122) * (-318)) + 72252160;
                                int i26 = ~(43625122 | iMaxMemory2);
                                int i27 = ~iMaxMemory2;
                                int iA2 = l1.a((~(iMaxMemory2 | (-42017313))) | (~(268169143 | i27)), 318, ((i26 | (~((-42017313) | i27))) * 318) + i25, i12);
                                int i28 = iA2 ^ (iA2 << 13);
                                int i29 = i28 ^ (i28 >>> 17);
                                ((int[]) objArr32[1])[0] = i29 ^ (i29 << 5);
                                return objArr32;
                            } catch (Throwable th7) {
                                Throwable cause6 = th7.getCause();
                                if (cause6 != null) {
                                    throw cause6;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            Throwable cause7 = th.getCause();
                            if (cause7 != null) {
                                throw cause7;
                            }
                            throw th;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                    }
                } catch (Throwable th10) {
                    Throwable cause8 = th10.getCause();
                    if (cause8 != null) {
                        throw cause8;
                    }
                    throw th10;
                }
            } catch (Throwable th11) {
                Throwable cause9 = th11.getCause();
                if (cause9 != null) {
                    throw cause9;
                }
                throw th11;
            }
        }

        public static void init$0() {
            $$a = new byte[]{116, 6, -52, -64};
            $$b = 253;
        }

        public final getDeviceData AuthenticationRequestParameters(String str) throws Throwable {
            int i11 = getSDKEphemeralPublicKey + 115;
            BuildConfig = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (str == null) {
                Object[] objArr = new Object[1];
                a(true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 274, "ￄ\u0017\rￄ\u0010\u0016\u0019ￒ\u0010\u0010\u0019\u0012", 7 - KeyEvent.normalizeMetaState(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13, objArr);
                w.l(((String) objArr[0]).intern());
                return null;
            }
            if (!str.isEmpty()) {
                this.getDeviceData = str;
                BuildConfig = (getSDKEphemeralPublicKey + 33) % 128;
                return this;
            }
            Object[] objArr2 = new Object[1];
            a(false, ExpandableListView.getPackedPositionChild(0L) + 277, "\u0017\u0014\u000eￂ\u000b\u0015ￂ\u0007\u000f\u0012\u0016\u001b\uffd0", 13 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 13 - View.MeasureSpec.getSize(0), objArr2);
            w.l(((String) objArr2[0]).intern());
            return null;
        }

        public final getTransactionStatus AuthenticationRequestParameters() throws Throwable {
            int i11 = BuildConfig + 17;
            getSDKEphemeralPublicKey = i11 % 128;
            int i12 = i11 % 2;
            String str = this.getDeviceData;
            if (i12 != 0) {
                throw null;
            }
            if (str != null) {
                getTransactionStatus gettransactionstatus = new getTransactionStatus(this);
                getSDKEphemeralPublicKey = (BuildConfig + 27) % 128;
                return gettransactionstatus;
            }
            Object[] objArr = new Object[1];
            a(true, 273 - TextUtils.lastIndexOf("", '0'), "ￄ\u0017\rￄ\u0010\u0016\u0019ￒ\u0010\u0010\u0019\u0012", 6 - TextUtils.lastIndexOf("", '0', 0, 0), 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            h2.b(((String) objArr[0]).intern());
            return null;
        }

        public final getDeviceData getSDKAppID() throws Throwable {
            int i11 = BuildConfig + 19;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 == 0) {
                return getSDKAppID(getMessageVersion.GET, null);
            }
            getSDKAppID(getMessageVersion.GET, null);
            throw null;
        }

        public final getDeviceData getSDKAppID(byte[] bArr) throws Throwable {
            getSDKEphemeralPublicKey = (BuildConfig + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
            getDeviceData sDKAppID = getSDKAppID(getMessageVersion.POST, bArr);
            BuildConfig = (getSDKEphemeralPublicKey + 31) % 128;
            return sDKAppID;
        }

        public final getDeviceData getSDKAppID(Map<String, List<String>> map) {
            int i11 = (getSDKEphemeralPublicKey + 5) % 128;
            BuildConfig = i11;
            this.AuthenticationRequestParameters = map;
            getSDKEphemeralPublicKey = (i11 + 19) % 128;
            return this;
        }
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[0];
        int i11 = getSDKReferenceNumber;
        int i12 = i11 & 7;
        int i13 = i12 + ((i11 ^ 7) | i12);
        int i14 = i13 % 128;
        getSDKEphemeralPublicKey = i14;
        int i15 = i13 % 2;
        String str = gettransactionstatus.getDeviceData;
        if (i15 == 0) {
            throw null;
        }
        int i16 = i14 & 33;
        getSDKReferenceNumber = (((i14 | 33) & (~i16)) + (i16 << 1)) % 128;
        return str;
    }

    public final getMessageVersion AuthenticationRequestParameters() {
        int sDKTransactionID = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        int sDKTransactionID2 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        int sDKTransactionID3 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        return (getMessageVersion) AuthenticationRequestParameters(-1508914177, ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID2, sDKTransactionID3, sDKTransactionID, new Object[]{this}, 1508914177);
    }
}
