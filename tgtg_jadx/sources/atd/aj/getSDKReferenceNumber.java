package atd.aj;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.ChallengeResultCompleted;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.Locale;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKReferenceNumber extends Provider {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static char getDeviceData;
    private static char getMessageVersion;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static final String getSDKReferenceNumber;
    public static final getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, byte r8, byte r9) {
        /*
            byte[] r0 = atd.aj.getSDKReferenceNumber.$$a
            int r9 = r9 * 3
            int r9 = r9 + 66
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r9 = r7
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2d
        L18:
            r3 = r2
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2d:
            int r7 = r7 + r0
            int r9 = r9 + 1
            r0 = r9
            r9 = r7
            r7 = r0
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getSDKReferenceNumber.$$c(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKAppID();
        View.MeasureSpec.getSize(0);
        getSDKTransactionID = new getSDKReferenceNumber();
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        a("焔쓤㵦甀儕펤舎唛땧屩㎒\uda7c덽攁껬婸ꪛڲ꒧쀭ถ煝퇀刑⍥쿮腃䌰", TextUtils.lastIndexOf("", '0', 0) + 28, objArr);
        getSDKReferenceNumber = String.format(locale, ((String) objArr[0]).intern(), Double.valueOf(1.0d));
        int i11 = ChallengeResult + 115;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private getSDKReferenceNumber() throws Throwable {
        Object[] objArr = new Object[1];
        a("卺㽄䃢䥸", 3 - View.resolveSize(0, 0), objArr);
        super(((String) objArr[0]).intern(), 1.0d, getSDKReferenceNumber);
        Object[] objArr2 = new Object[1];
        a("器떲\uf662Ù뙥懪㨦鸸쁙\u1b4d붛移暝ⶪ훣\uffc0臜椏?멘봺퐅煗赣ᔨꃺ爅惎", KeyEvent.getDeadChar(0, 0) + 27, objArr2);
        put(((String) objArr2[0]).intern(), PSSSignatureSpi.SHA256withRSA.class.getName());
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        int i15 = 2;
        if (str != null) {
            int i16 = $11 + 7;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr2 = new char[cArr.length];
        int i17 = 0;
        challengeResultCompleted.getDeviceData = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i18 = challengeResultCompleted.getDeviceData;
            if (i18 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            cArr3[i17] = cArr[i18];
            char c3 = 1;
            cArr3[1] = cArr[i18 + 1];
            int i19 = 58224;
            int i21 = i17;
            while (i21 < 16) {
                char c7 = cArr3[c3];
                char c8 = cArr3[i17];
                char c11 = c3;
                int i22 = (c8 + i19) ^ ((c8 << 4) + ((char) (((long) getDeviceData) ^ 5320350835299930193L)));
                int i23 = c8 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getMessageVersion);
                    objArr2[i15] = Integer.valueOf(i23);
                    objArr2[c11] = Integer.valueOf(i22);
                    objArr2[i17] = Integer.valueOf(c7);
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        i14 = 906025703;
                        byte b8 = (byte) i17;
                        i12 = i15;
                        byte b11 = b8;
                        i13 = i17;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2829 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i17) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i17) == 0.0d ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27, -362226441, false, $$c(b8, b11, b11), new Class[]{cls, cls, cls, cls});
                    } else {
                        i12 = i15;
                        i13 = i17;
                        i14 = 906025703;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr3[c11] = cCharValue;
                    char c12 = cArr3[i13];
                    int i24 = (cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) AuthenticationRequestParameters) ^ 5320350835299930193L)));
                    int i25 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(getSDKAppID);
                    objArr3[i12] = Integer.valueOf(i25);
                    objArr3[c11] = Integer.valueOf(i24);
                    objArr3[i13] = Integer.valueOf(c12);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i14);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) i13;
                        byte b13 = b12;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2827, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 27, -362226441, false, $$c(b12, b13, b13), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i19 -= 40503;
                    i21++;
                    $11 = ($10 + 111) % 128;
                    c3 = c11;
                    i15 = i12;
                    i17 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i26 = i15;
            char c13 = c3;
            int i27 = challengeResultCompleted.getDeviceData;
            cArr2[i27] = cArr3[0];
            cArr2[i27 + 1] = cArr3[c13];
            i15 = i26;
            Object[] objArr4 = new Object[i15];
            objArr4[c13] = challengeResultCompleted;
            objArr4[0] = challengeResultCompleted;
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(3157 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((Process.myTid() >> 22) + 25797), KeyEvent.keyCodeFromString("") + 27, 1296942946, false, $$c(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            $11 = ($10 + 47) % 128;
            i17 = 0;
        }
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = (char) 56467;
        getSDKAppID = (char) 51282;
        getDeviceData = (char) 53630;
        getMessageVersion = (char) 24515;
    }

    public static void init$0() {
        $$a = new byte[]{77, 37, -113, 18};
        $$b = 168;
    }
}
