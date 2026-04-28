package atd.aq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.Signature;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import atd.bb.ChallengeResultCompleted;
import atd.bb.completed;
import atd.bc.ChallengeResultCancelled;
import atd.e.ChallengeResult;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters implements getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static long getSDKReferenceNumber;
    private static char getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r8 = r8 * 3
            int r8 = 120 - r8
            byte[] r0 = atd.aq.AuthenticationRequestParameters.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r6
            r3 = r0
            r4 = r2
            r0 = r7
            goto L30
        L18:
            r3 = r2
        L19:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L30:
            int r6 = r6 + r0
            r0 = r8
            r8 = r6
            r6 = r0
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aq.AuthenticationRequestParameters.$$c(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        BuildConfig = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResultCancelled = 1;
        getDeviceData();
        getSDKReferenceNumber();
        SystemClock.currentThreadTimeMillis();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        int i11 = ChallengeResult + 17;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 0 / 0;
        }
    }

    private static String AuthenticationRequestParameters(String str) throws Throwable {
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 49) % 128;
        String sDKAppID = ChallengeResultCancelled.getSDKAppID(str);
        int i11 = ChallengeResultCancelled + 13;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 24 / 0;
        }
        return sDKAppID;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(getSDKReferenceNumber ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        $11 = ($10 + 21) % 128;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            $11 = ($10 + 1) % 128;
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKReferenceNumber)};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int i14 = 2774 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    char packedPositionChild = (char) (13059 - ExpandableListView.getPackedPositionChild(0L));
                    int iRgb = (-16777191) - Color.rgb(0, 0, 0);
                    byte b8 = (byte) 0;
                    byte b11 = b8;
                    String str$$c = $$c(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(i14, packedPositionChild, iRgb, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = ChallengeResult.getDeviceData(MotionEvent.axisFromString("") + 409, (char) ((-1) - MotionEvent.axisFromString("")), 30 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 144017174, false, "y", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        int i12;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr = new char[charArray.length];
        challengeResultCompleted.getDeviceData = 0;
        int i13 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i14 = challengeResultCompleted.getDeviceData;
            if (i14 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i11);
                return;
            }
            cArr2[0] = charArray[i14];
            char c3 = 1;
            cArr2[1] = charArray[i14 + 1];
            int i15 = 58224;
            int i16 = 0;
            while (i16 < 16) {
                char c7 = cArr2[c3];
                char c8 = cArr2[0];
                char c11 = c3;
                int i17 = i13;
                char[] cArr3 = cArr2;
                int i18 = (c8 + i15) ^ ((c8 << 4) + ((char) (((long) AuthenticationRequestParameters) ^ 5320350835299930193L)));
                int i19 = c8 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSDKTransactionID);
                    objArr2[i17] = Integer.valueOf(i19);
                    objArr2[c11] = Integer.valueOf(i18);
                    objArr2[0] = Integer.valueOf(c7);
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) 0;
                        byte b11 = b8;
                        i12 = 906025703;
                        sDKTransactionID = ChallengeResult.getDeviceData(2827 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 27, -362226441, false, $$c(b8, b11, (byte) (b11 | 18)), new Class[]{cls, cls, cls, cls});
                    } else {
                        i12 = 906025703;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr3[c11] = cCharValue;
                    char c12 = cArr3[0];
                    int i21 = (cCharValue + i15) ^ ((cCharValue << 4) + ((char) (((long) getSDKAppID) ^ 5320350835299930193L)));
                    int i22 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(getDeviceData);
                    objArr3[i17] = Integer.valueOf(i22);
                    objArr3[c11] = Integer.valueOf(i21);
                    objArr3[0] = Integer.valueOf(c12);
                    Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(i12);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        sDKTransactionID2 = ChallengeResult.getDeviceData((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2827, (char) (ImageFormat.getBitsPerPixel(0) + 1), Color.blue(0) + 27, -362226441, false, $$c(b12, b13, (byte) (b13 | 18)), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i15 -= 40503;
                    i16++;
                    c3 = c11;
                    i13 = i17;
                    cArr2 = cArr3;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i23 = i13;
            char[] cArr4 = cArr2;
            char c13 = c3;
            int i24 = challengeResultCompleted.getDeviceData;
            cArr[i24] = cArr4[0];
            cArr[i24 + 1] = cArr4[c13];
            i13 = i23;
            Object[] objArr4 = new Object[i13];
            objArr4[c13] = challengeResultCompleted;
            objArr4[0] = challengeResultCompleted;
            Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                sDKTransactionID3 = ChallengeResult.getDeviceData(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3157, (char) (25796 - TextUtils.lastIndexOf("", '0')), 27 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1296942946, false, $$c(b14, b15, (byte) (b15 | 17)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            cArr2 = cArr4;
        }
    }

    private boolean getDeviceData(Signature signature, String str) throws Throwable {
        String deviceData;
        String sDKAppID;
        int i11 = getSDKEphemeralPublicKey + 21;
        ChallengeResultCancelled = i11 % 128;
        try {
            if (i11 % 2 == 0) {
                deviceData = getDeviceData(str);
                Object[] objArr = new Object[1];
                a("떤뗷\uf6e6⭹ⲕӡ靛鷞싚ꉒṎᐞ宥㪫蕄茎킅떗\u0dfe輻楑䲾듫煈\ue63a윢⎀", 1 % (AudioTrack.getMaxVolume() > 2.0f ? 1 : (AudioTrack.getMaxVolume() == 2.0f ? 0 : -1)), objArr);
                MessageDigest messageDigest = MessageDigest.getInstance(AuthenticationRequestParameters(((String) objArr[0]).intern()));
                messageDigest.update(signature.toByteArray());
                sDKAppID = getSDKAppID(messageDigest.digest());
            } else {
                deviceData = getDeviceData(str);
                Object[] objArr2 = new Object[1];
                a("떤뗷\uf6e6⭹ⲕӡ靛鷞싚ꉒṎᐞ宥㪫蕄茎킅떗\u0dfe輻楑䲾듫煈\ue63a윢⎀", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
                MessageDigest messageDigest2 = MessageDigest.getInstance(AuthenticationRequestParameters(((String) objArr2[0]).intern()));
                messageDigest2.update(signature.toByteArray());
                sDKAppID = getSDKAppID(messageDigest2.digest());
            }
            return sDKAppID.equals(deviceData);
        } catch (NoSuchAlgorithmException unused) {
            return false;
        }
    }

    private static String getSDKAppID(byte[] bArr) throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        int length = bArr.length;
        int i11 = 0;
        while (i11 < length) {
            ChallengeResultCancelled = (getSDKEphemeralPublicKey + 23) % 128;
            byte b8 = bArr[i11];
            Object[] objArr = new Object[1];
            a("嘆嘣猪⟬쯒ぺ灴\ua95c", (-1) - Process.getGidForName(""), objArr);
            sb2.append(String.format(((String) objArr[0]).intern(), Byte.valueOf(b8)));
            i11++;
            getSDKEphemeralPublicKey = (ChallengeResultCancelled + 77) % 128;
        }
        return sb2.toString();
    }

    public static void init$0() {
        $$a = new byte[]{48, -109, -115, -11};
        $$b = 82;
    }

    @Override // atd.aq.getSDKTransactionID
    public final boolean getSDKReferenceNumber(Context context, String str) throws Throwable {
        int i11 = getSDKEphemeralPublicKey + 125;
        int i12 = i11 % 128;
        ChallengeResultCancelled = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (str == null) {
            getSDKEphemeralPublicKey = (i12 + 11) % 128;
            return false;
        }
        Signature[] deviceData = atd.bc.getMessageVersion.getDeviceData(context);
        if (deviceData != null) {
            return getSDKTransactionID(deviceData, str);
        }
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 57) % 128;
        return false;
    }

    @Override // atd.aq.getSDKAppID
    public final boolean getSDKTransactionID(@NonNull Context context) throws Throwable {
        Object objInvoke;
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 57) % 128;
        Object[] objArr = new Object[1];
        a("㒈㓣굀烯⫟헽鄲䳄䏕陸᠑씟", KeyEvent.getDeadChar(0, 0), objArr);
        Object systemService = context.getSystemService(((String) objArr[0]).intern());
        if (systemService == null) {
            int i11 = ChallengeResultCancelled + 73;
            getSDKEphemeralPublicKey = i11 % 128;
            return i11 % 2 != 0;
        }
        int i12 = getSDKEphemeralPublicKey;
        int i13 = i12 + 29;
        ChallengeResultCancelled = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        int i14 = i12 + 43;
        ChallengeResultCancelled = i14 % 128;
        try {
            if (i14 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                b("䑔\u187e拘햺蟽利\ude0e纽嘀\uec7d\uf58d䵇踌㓪\uda2d䍽\uf5ca蛈嫠犦ⵙ瘃琉例춝\u175e\ue73a㮿", 114 / View.getDefaultSize(0, 0), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                Object[] objArr3 = new Object[1];
                b("컱䑚\ufdefⵌ鰴䏿ꢣ礅骸뮺خ㬬㠚橳", 16 >>> (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)), objArr3);
                objInvoke = cls.getMethod((String) objArr3[0], null).invoke(systemService, null);
            } else {
                Object[] objArr4 = new Object[1];
                b("䑔\u187e拘햺蟽利\ude0e纽嘀\uec7d\uf58d䵇踌㓪\uda2d䍽\uf5ca蛈嫠犦ⵙ瘃琉例춝\u175e\ue73a㮿", 27 - View.getDefaultSize(0, 0), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b("컱䑚\ufdefⵌ鰴䏿ꢣ礅骸뮺خ㬬㠚橳", 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr5);
                objInvoke = cls2.getMethod((String) objArr5[0], null).invoke(systemService, null);
            }
            return ((Boolean) objInvoke).booleanValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    @Override // atd.aq.getSDKReferenceNumber
    @SuppressLint({"AnnotateVersionCheck"})
    public final boolean AuthenticationRequestParameters() {
        int i11 = (getSDKEphemeralPublicKey + 39) % 128;
        ChallengeResultCancelled = i11;
        int i12 = i11 + 83;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 44 / 0;
        }
        return true;
    }

    public static void getSDKReferenceNumber() {
        getSDKReferenceNumber = -2372722948143817960L;
    }

    @Override // atd.aq.getSDKTransactionID
    public final boolean getSDKAppID(Context context, Collection<String> collection) throws Throwable {
        int i11 = getSDKEphemeralPublicKey + 19;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
        hashSet.addAll(getMessageVersion.getDeviceData());
        boolean sDKAppID = atd.bc.getMessageVersion.getSDKAppID(context, hashSet);
        int i12 = getSDKEphemeralPublicKey + 19;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 29 / 0;
        }
        return sDKAppID;
    }

    private static String getDeviceData(String str) throws Throwable {
        Object obj;
        int i11 = getSDKEphemeralPublicKey + 85;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a("餞饄쪮ᜈ꽾힂ᒬ亝\uee63鸲鶡", KeyEvent.getMaxKeyCode() / 98, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("餞饄쪮ᜈ꽾힂ᒬ亝\uee63鸲鶡", KeyEvent.getMaxKeyCode() >> 16, objArr2);
            obj = objArr2[0];
        }
        return str.replaceAll(AuthenticationRequestParameters(((String) obj).intern()), "").toLowerCase(Locale.US);
    }

    public static void getDeviceData() {
        getSDKAppID = (char) 30092;
        getDeviceData = (char) 52599;
        AuthenticationRequestParameters = (char) 48955;
        getSDKTransactionID = (char) 18828;
    }

    private boolean getSDKTransactionID(Signature[] signatureArr, String str) throws Throwable {
        int i11 = getSDKEphemeralPublicKey + 17;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        int length = signatureArr.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = ChallengeResultCancelled + 13;
            getSDKEphemeralPublicKey = i14 % 128;
            if (i14 % 2 == 0) {
                if (getDeviceData(signatureArr[i13], str)) {
                    return true;
                }
                i13++;
                getSDKEphemeralPublicKey = (ChallengeResultCancelled + 37) % 128;
            } else {
                getDeviceData(signatureArr[i13], str);
                throw null;
            }
        }
        return false;
    }
}
