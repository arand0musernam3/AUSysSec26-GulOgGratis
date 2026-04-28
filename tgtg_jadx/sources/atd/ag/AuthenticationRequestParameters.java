package atd.ag;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.ae.ChallengeResultCancelled;
import atd.bb.completed;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
final class AuthenticationRequestParameters extends getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static long getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            byte[] r0 = atd.ag.AuthenticationRequestParameters.$$a
            int r6 = r6 * 3
            int r6 = 120 - r6
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r0
            r4 = r2
            r0 = r7
            r7 = r8
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r0
            r0 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r0 + 1
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.AuthenticationRequestParameters.$$c(byte, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKTransactionID = 1;
        AuthenticationRequestParameters = 0;
        getSDKAppID = 1;
        getSDKTransactionID();
        KeyEvent.getDeadChar(0, 0);
        int i11 = getSDKReferenceNumber + 111;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 85 / 0;
        }
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(getDeviceData ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            $10 = ($11 + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getDeviceData)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int absoluteGravity = 2774 - Gravity.getAbsoluteGravity(0, 0);
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 13060);
                    int iMyTid = 25 - (Process.myTid() >> 22);
                    byte b8 = (byte) 0;
                    byte b11 = b8;
                    String str$$c = $$c(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(absoluteGravity, offsetBefore, iMyTid, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(408 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr3);
                $11 = ($10 + 107) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    private static atd.ah.AuthenticationRequestParameters getSDKAppID(atd.ah.getDeviceData getdevicedata, String str, String str2, ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        atd.ah.AuthenticationRequestParameters authenticationRequestParameters = new atd.ah.AuthenticationRequestParameters(atd.aj.getSDKTransactionID.getSDKReferenceNumber(atd.aj.getDeviceData.getDeviceData(eCPublicKey, eCPrivateKey), 256, getdevicedata.AuthenticationRequestParameters(), str, str2), getdevicedata);
        getSDKAppID = (AuthenticationRequestParameters + 5) % 128;
        return authenticationRequestParameters;
    }

    public static void getSDKTransactionID() {
        getDeviceData = -2592510377983583194L;
    }

    public static void init$0() {
        $$a = new byte[]{80, -63, 35, 89};
        $$b = 106;
    }

    @Override // atd.ag.BuildConfig
    public final atd.ah.AuthenticationRequestParameters AuthenticationRequestParameters(ChallengeResultCancelled challengeResultCancelled, atd.af.getSDKReferenceNumber getsdkreferencenumber) throws Throwable {
        atd.af.getSDKReferenceNumber.getSDKReferenceNumber(getsdkreferencenumber, atd.af.AuthenticationRequestParameters.class);
        atd.ah.getDeviceData deviceData = challengeResultCancelled.getDeviceData();
        atd.af.AuthenticationRequestParameters authenticationRequestParameters = new atd.af.AuthenticationRequestParameters(null, atd.aj.AuthenticationRequestParameters.P256);
        ECPublicKey deviceData2 = ((atd.af.AuthenticationRequestParameters) getsdkreferencenumber).getDeviceData();
        ECPrivateKey sDKReferenceNumber = authenticationRequestParameters.getSDKReferenceNumber();
        JSONObject messageVersion = challengeResultCancelled.getMessageVersion();
        Object[] objArr = new Object[1];
        a("떧慯뗆ꂝ믫ᔀ䬾", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
        String strOptString = messageVersion.optString(((String) objArr[0]).intern(), null);
        Object[] objArr2 = new Object[1];
        a("綳臨緒ᖐ⍲ꀎ३", TextUtils.lastIndexOf("", '0', 0) + 1, objArr2);
        atd.ah.AuthenticationRequestParameters sDKAppID = getSDKAppID(deviceData, strOptString, messageVersion.optString(((String) objArr2[0]).intern(), null), deviceData2, sDKReferenceNumber);
        int i11 = getSDKAppID + 125;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return sDKAppID;
        }
        throw null;
    }

    @Override // atd.ad.AuthenticationRequestParameters
    public final String AuthenticationRequestParameters() throws Throwable {
        AuthenticationRequestParameters = (getSDKAppID + 91) % 128;
        Object[] objArr = new Object[1];
        a("\uea05꜁\uea40舒綶㞾∍臸늙\ue180ꏹ", View.combineMeasuredStates(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        getSDKAppID = (AuthenticationRequestParameters + 17) % 128;
        return strIntern;
    }
}
