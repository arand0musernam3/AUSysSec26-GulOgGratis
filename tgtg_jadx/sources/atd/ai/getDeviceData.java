package atd.ai;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import atd.bb.completed;
import atd.e.ChallengeResult;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.security.Signature;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
final class getDeviceData extends getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static long getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r1 = atd.ai.getDeviceData.$$a
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r7 = r7 + 120
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r6
            goto L31
        L17:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r1
            r1 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L31:
            int r6 = r6 + r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ai.getDeviceData.$$c(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getSDKAppID = 1;
        getSDKTransactionID = 0;
        getSDKReferenceNumber = 1;
        getSDKAppID();
        SystemClock.elapsedRealtimeNanos();
        TextUtils.getTrimmedLength("");
        AuthenticationRequestParameters = (getSDKAppID + 81) % 128;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        $10 = ($11 + 101) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(getDeviceData ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        $10 = ($11 + 57) % 128;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            $10 = ($11 + 77) % 128;
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getDeviceData)};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int keyRepeatTimeout = 2774 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    char c3 = (char) (13061 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 25;
                    byte b8 = (byte) (-1);
                    byte b11 = (byte) (b8 + 1);
                    String str$$c = $$c(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(keyRepeatTimeout, c3, threadPriority, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = ChallengeResult.getDeviceData(MotionEvent.axisFromString("") + 409, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Gravity.getAbsoluteGravity(0, 0) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
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

    public static void getSDKAppID() {
        getDeviceData = 2884717203251647802L;
    }

    private static Signature getSDKTransactionID() throws Throwable {
        Object obj;
        int i11 = getSDKTransactionID + 69;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a("쟕鬬얝잆ᨑ좌戌\ue19b血㢒㊚儠壡桬苟肺⥴\ud9cb卽\uf0da句", 0 % TextUtils.indexOf((CharSequence) "", '(', 0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("쟕鬬얝잆ᨑ좌戌\ue19b血㢒㊚儠壡桬苟肺⥴\ud9cb卽\uf0da句", TextUtils.indexOf((CharSequence) "", '0', 0) + 1, objArr2);
            obj = objArr2[0];
        }
        Signature signature = Signature.getInstance(((String) obj).intern(), atd.aj.getSDKReferenceNumber.getSDKTransactionID);
        getSDKTransactionID = (getSDKReferenceNumber + 57) % 128;
        return signature;
    }

    public static void init$0() {
        $$a = new byte[]{60, -89, 74, 98};
        $$b = 54;
    }

    @Override // atd.ad.AuthenticationRequestParameters
    public final String AuthenticationRequestParameters() throws Throwable {
        Object obj;
        int i11 = getSDKReferenceNumber + 31;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[1];
            a("웤ꯣᱞ운궞\uf858뮼嘓襲", ViewConfiguration.getEdgeSlop() >>> 18, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("웤ꯣᱞ운궞\uf858뮼嘓襲", ViewConfiguration.getEdgeSlop() >> 16, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        getSDKReferenceNumber = (getSDKTransactionID + 85) % 128;
        return strIntern;
    }

    @Override // atd.ai.getSDKAppID
    public final boolean getDeviceData(byte[] bArr, byte[] bArr2, PublicKey publicKey) throws Throwable {
        getSDKTransactionID = (getSDKReferenceNumber + 49) % 128;
        Signature sDKTransactionID = getSDKTransactionID();
        sDKTransactionID.initVerify(publicKey);
        sDKTransactionID.update(bArr2);
        boolean zVerify = sDKTransactionID.verify(bArr);
        int i11 = getSDKReferenceNumber + 83;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return zVerify;
        }
        throw null;
    }
}
