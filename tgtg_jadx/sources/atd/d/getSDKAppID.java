package atd.d;

import a40.d0;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import atd.bb.completed;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
abstract class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static final SSLSocketFactory getSDKReferenceNumber;
    private static long getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = 120 - r8
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r0 = atd.d.getSDKAppID.$$a
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getSDKAppID.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        ChallengeResult = 1;
        getDeviceData = 0;
        AuthenticationRequestParameters = 1;
        getDeviceData();
        try {
            getSDKReferenceNumber = new ChallengeResultError();
            int i11 = ChallengeResult + 89;
            getSDKAppID = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (KeyManagementException | NoSuchAlgorithmException e5) {
            Object[] objArr = new Object[1];
            a("댱덲⡊㜚\ud969ꪘ㈕儲릡ꗛ✚䨭ꚭ냏Ⱁ䜘鎄讧ᄥ瀛颍蚮ت洋藕醘୷柞\uf2da\uec50灋ჭ\ufff8\ue757敺෫\ue4f2\uf263橯ی퇜촵", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr);
            d0.o(((String) objArr[0]).intern(), e5);
        }
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char c3;
        $10 = ($11 + 23) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(getSDKTransactionID ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                String str2 = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                $10 = ($11 + 91) % 128;
                objArr[0] = str2;
                return;
            }
            $10 = ($11 + 45) % 128;
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKTransactionID)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2775;
                    char c7 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13059);
                    int deadChar = 25 - KeyEvent.getDeadChar(0, 0);
                    byte b8 = (byte) 0;
                    byte b11 = b8;
                    c3 = 1;
                    String str$$c = $$c(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iLastIndexOf, c7, deadChar, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                } else {
                    c3 = 1;
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[c3] = completedVar;
                objArr3[0] = completedVar;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(407 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 30 - (ViewConfiguration.getJumpTapTimeout() >> 16), 144017174, false, "y", new Class[]{Object.class, Object.class});
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

    public static void getDeviceData() {
        getSDKTransactionID = 3851763499937367151L;
    }

    public static void init$0() {
        $$a = new byte[]{23, 71, -23, -123};
        $$b = 18;
    }

    public final HttpURLConnection AuthenticationRequestParameters(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        if (httpURLConnection instanceof HttpsURLConnection) {
            getDeviceData = (AuthenticationRequestParameters + 25) % 128;
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(getSDKReferenceNumber);
            return httpsURLConnection;
        }
        HttpURLConnection sDKAppID = getSDKAppID(httpURLConnection);
        int i11 = getDeviceData + 113;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 76 / 0;
        }
        return sDKAppID;
    }

    public abstract HttpURLConnection getSDKAppID(HttpURLConnection httpURLConnection);
}
