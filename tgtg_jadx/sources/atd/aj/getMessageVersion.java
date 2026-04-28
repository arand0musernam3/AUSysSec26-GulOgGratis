package atd.aj;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.getTransactionStatus;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class getMessageVersion {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static final atd.bc.getSDKReferenceNumber AuthenticationRequestParameters;
    private static byte[] BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int ChallengeResultError;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static short[] getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;
    private static int getTransactionStatus;
    private boolean getSDKAppID = false;
    private final byte[] getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(short r6, int r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r6 = r6 * 4
            int r6 = 105 - r6
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = atd.aj.getMessageVersion.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L1a
            r6 = r7
            r3 = r1
            r4 = r2
            r1 = r8
            goto L31
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L31:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getMessageVersion.$$f(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultError = 0;
        getTransactionStatus = 1;
        getMessageVersion = 0;
        ChallengeResultCancelled = 1;
        ChallengeResultCancelled();
        AuthenticationRequestParameters = atd.bc.getSDKReferenceNumber.getSDKTransactionID();
        getTransactionStatus = (ChallengeResultError + 37) % 128;
    }

    public getMessageVersion(String str, atd.am.getSDKEphemeralPublicKey getsdkephemeralpublickey) throws Throwable {
        if (atd.bc.getSDKReferenceNumber.getSDKReferenceNumber(str)) {
            this.getSDKReferenceNumber = getDeviceData().getSDKAppID(str);
        } else {
            Object[] objArr = new Object[1];
            b((byte) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getLongPressTimeout() >> 16) - 92, (-924639188) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) TextUtils.getTrimmedLength(""), (-1946291000) - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
            throw new atd.ac.getSDKAppID(((String) objArr[0]).intern(), atd.h.getSDKReferenceNumber.DATA_DECRYPTION_FAILURE, getsdkephemeralpublickey);
        }
    }

    public static void ChallengeResultCancelled() {
        getSDKTransactionID = 108055536;
        getDeviceData = 829166680;
        ChallengeResult = 1164844965;
        BuildConfig = new byte[]{-28, -38, 38, -44, -35, 34, 112, -97, -36, 34, -42, 47, -42, 42, 102, -9, -39, -34, 2, -35, -14, -47, 49, -36, 97, -100, 98, -113, 38, 2, 35};
    }

    private static void b(byte b8, int i11, int i12, short s7, int i13, Object[] objArr) throws Throwable {
        int i14;
        long j9;
        int i15;
        int i16;
        int i17;
        int i18;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i19 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getDeviceData)};
            Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-217286249);
            Class cls = Integer.TYPE;
            if (sDKTransactionID == null) {
                int i21 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1224;
                char cResolveSize = (char) View.resolveSize(0, 0);
                int i22 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32;
                byte b11 = (byte) ($$e & 1);
                byte b12 = $$d[2];
                sDKTransactionID = atd.e.ChallengeResult.getDeviceData(i21, cResolveSize, i22, 795115399, false, $$f(b11, b12, b12), new Class[]{cls, cls});
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
            int i23 = iIntValue == -1 ? 1 : 0;
            if (i23 != 0) {
                byte[] bArr = BuildConfig;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    i17 = -217286249;
                    int i24 = 0;
                    while (i24 < length) {
                        $10 = ($11 + 47) % 128;
                        Object[] objArr3 = {Integer.valueOf(bArr[i24])};
                        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1659653064);
                        if (sDKTransactionID2 == null) {
                            i18 = i19;
                            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3316 - (Process.myTid() >> 22), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getJumpTapTimeout() >> 16) + 33, -1098625576, false, "f", new Class[]{cls});
                        } else {
                            i18 = i19;
                        }
                        bArr2[i24] = ((Byte) ((Method) sDKTransactionID2).invoke(null, objArr3)).byteValue();
                        i24++;
                        i19 = i18;
                    }
                    bArr = bArr2;
                } else {
                    i17 = -217286249;
                }
                i14 = i19;
                j9 = 20070962823959587L;
                if (bArr != null) {
                    $10 = ($11 + 1) % 128;
                    byte[] bArr3 = BuildConfig;
                    Object[] objArr4 = new Object[2];
                    objArr4[i14] = Integer.valueOf(getSDKTransactionID);
                    objArr4[0] = Integer.valueOf(i12);
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i17);
                    if (sDKTransactionID3 == null) {
                        int iMyTid = 1225 - (Process.myTid() >> 22);
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int gidForName = 32 - Process.getGidForName("");
                        byte b13 = (byte) ($$e & 1);
                        byte b14 = $$d[2];
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iMyTid, windowTouchSlop, gidForName, 795115399, false, $$f(b13, b14, b14), new Class[]{cls, cls});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue()]) ^ 20070962823959587L)) + ((int) (((long) getDeviceData) ^ 20070962823959587L)));
                } else {
                    iIntValue = (short) (((short) (((long) getSDKEphemeralPublicKey[i12 + ((int) (((long) getSDKTransactionID) ^ 20070962823959587L))]) ^ 20070962823959587L)) + ((int) (((long) getDeviceData) ^ 20070962823959587L)));
                }
            } else {
                i14 = 1;
                j9 = 20070962823959587L;
            }
            if (iIntValue > 0) {
                gettransactionstatus.getDeviceData = ((i12 + iIntValue) - 2) + ((int) (((long) getSDKTransactionID) ^ j9)) + i23;
                int i25 = ChallengeResult;
                Object[] objArr5 = new Object[4];
                objArr5[3] = sb2;
                objArr5[2] = Integer.valueOf(i25);
                objArr5[i14] = Integer.valueOf(i13);
                objArr5[0] = gettransactionstatus;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-488867474);
                if (sDKTransactionID4 == null) {
                    int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2158;
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iMyPid = 36 - (Process.myPid() >> 22);
                    byte b15 = $$d[2];
                    byte b16 = b15;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(keyRepeatDelay, maximumFlingVelocity, iMyPid, 1052016510, false, $$f(b15, b16, b16), new Class[]{Object.class, cls, cls, Object.class});
                }
                ((StringBuilder) ((Method) sDKTransactionID4).invoke(null, objArr5)).append(gettransactionstatus.getSDKAppID);
                gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                byte[] bArr4 = BuildConfig;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i26 = 0;
                    while (i26 < length2) {
                        bArr5[i26] = (byte) (((long) bArr4[i26]) ^ j9);
                        i26++;
                        $10 = ($11 + 35) % 128;
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    i15 = i14;
                    i16 = i15;
                } else {
                    i15 = 0;
                    i16 = i14;
                }
                while (true) {
                    gettransactionstatus.AuthenticationRequestParameters = i16;
                    if (gettransactionstatus.AuthenticationRequestParameters >= iIntValue) {
                        break;
                    }
                    int i27 = gettransactionstatus.getDeviceData;
                    if (i15 != 0) {
                        byte[] bArr6 = BuildConfig;
                        gettransactionstatus.getDeviceData = i27 - 1;
                        gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((byte) (((byte) (((long) bArr6[i27]) ^ j9)) + s7)) ^ b8));
                    } else {
                        short[] sArr = getSDKEphemeralPublicKey;
                        gettransactionstatus.getDeviceData = i27 - 1;
                        gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((short) (((short) (((long) sArr[i27]) ^ j9)) + s7)) ^ b8));
                    }
                    sb2.append(gettransactionstatus.getSDKAppID);
                    gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                    i16 = gettransactionstatus.AuthenticationRequestParameters + 1;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static atd.bc.getSDKReferenceNumber getDeviceData() {
        int i11 = getMessageVersion + 119;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return AuthenticationRequestParameters;
        }
        throw null;
    }

    public static void init$0() {
        $$d = new byte[]{26, 112, 0, -80};
        $$e = 183;
    }

    public final byte[] BuildConfig() throws CloneNotSupportedException {
        int i11 = ChallengeResultCancelled + 1;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArr = this.getSDKReferenceNumber;
        if (i12 != 0) {
            bArr.clone();
            throw null;
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        ChallengeResultCancelled = (getMessageVersion + 9) % 128;
        return bArr2;
    }

    public final JSONObject getMessageVersion() throws JSONException {
        JSONObject jSONObject = new JSONObject(new String(BuildConfig(), getDeviceData().getSDKAppID()));
        int i11 = getMessageVersion + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return jSONObject;
        }
        throw null;
    }

    public final String getSDKAppID() {
        int i11 = getMessageVersion + 17;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            getDeviceData().getSDKAppID(this.getSDKReferenceNumber);
            throw null;
        }
        String sDKAppID = getDeviceData().getSDKAppID(this.getSDKReferenceNumber);
        int i12 = ChallengeResultCancelled + 57;
        getMessageVersion = i12 % 128;
        if (i12 % 2 == 0) {
            return sDKAppID;
        }
        throw null;
    }

    public void getSDKReferenceNumber() {
        getMessageVersion = (ChallengeResultCancelled + 5) % 128;
        byte[] bArr = this.getSDKReferenceNumber;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
            getMessageVersion = (ChallengeResultCancelled + 3) % 128;
        }
        this.getSDKAppID = true;
    }

    public getMessageVersion(byte[] bArr) {
        this.getSDKReferenceNumber = (byte[]) bArr.clone();
    }
}
