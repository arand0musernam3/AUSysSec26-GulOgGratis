package atd.ae;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.ag.BuildConfig;
import atd.ah.getSDKTransactionID;
import atd.aj.getMessageVersion;
import atd.bb.onCompletion;
import java.lang.reflect.Method;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeResultCancelled extends getMessageVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static long getDeviceData;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKTransactionID;
    private BuildConfig getSDKAppID;
    private atd.ah.getDeviceData getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, short r8, byte r9) {
        /*
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r9 = r9 + 68
            byte[] r0 = atd.ae.ChallengeResultCancelled.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2a
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ae.ChallengeResultCancelled.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        getSDKEphemeralPublicKey = 1;
        getDeviceData = -190736634111743078L;
        AuthenticationRequestParameters = -2038612665;
        getSDKTransactionID = (char) 15687;
    }

    public ChallengeResultCancelled(String str) throws Throwable {
        super(str, atd.am.getSDKEphemeralPublicKey.JWE_HEADER_NOT_BASE64URL_ENCODED);
        try {
            JSONObject messageVersion = getMessageVersion();
            Object[] objArr = new Object[1];
            a("雝だ怫\ue728", "砭玈컁쯻", "纙顅凤", (ViewConfiguration.getJumpTapTimeout() >> 16) - 1049393032, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 64462), objArr);
            this.getSDKAppID = atd.ag.getMessageVersion.getDeviceData(messageVersion.getString(((String) objArr[0]).intern()));
            Object[] objArr2 = new Object[1];
            a("雝だ怫\ue728", "\ud9b6ᕤ쐐㝩", "は湼\uf866", 269837529 - TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 27076), objArr2);
            this.getSDKReferenceNumber = getSDKTransactionID.getDeviceData(messageVersion.getString(((String) objArr2[0]).intern()));
        } catch (JSONException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        long j9;
        int i13;
        char[] cArr;
        char c7;
        $10 = ($11 + 99) % 128;
        char[] charArray2 = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            charArray = str2.toCharArray();
            $10 = ($11 + 81) % 128;
        } else {
            charArray = str2;
        }
        char[] cArr2 = charArray;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        onCompletion oncompletion = new onCompletion();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray3.length;
        char[] cArr4 = new char[length2];
        int i14 = 0;
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(charArray3, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c3);
        int i15 = 2;
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            $11 = ($10 + 101) % 128;
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    j9 = 0;
                    byte b8 = (byte) i14;
                    i12 = i15;
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2068 - (ExpandableListView.getPackedPositionForChild(i14, i14) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i14, i14) == 0L ? 0 : -1)), (char) (View.resolveSizeAndState(i14, i14, i14) + 44657), TextUtils.indexOf((CharSequence) "", '0', i14) + 33, -397560981, false, $$c(b8, b8, $$a[i14]), new Class[]{Object.class});
                } else {
                    i12 = i15;
                    j9 = 0;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    int i16 = (ViewConfiguration.getZoomControlsTimeout() > j9 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j9 ? 0 : -1)) + 3094;
                    char cMyTid = (char) (14367 - (Process.myTid() >> 22));
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, i14) + 18;
                    byte b11 = (byte) i14;
                    i13 = i14;
                    byte b12 = b11;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(i16, cMyTid, iMakeMeasureSpec, -1211924053, false, $$c(b11, b12, (byte) (b12 | 50)), new Class[]{Object.class});
                } else {
                    i13 = i14;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i17 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i17);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int i18 = 1429 - (SystemClock.uptimeMillis() > j9 ? 1 : (SystemClock.uptimeMillis() == j9 ? 0 : -1));
                    c7 = 1;
                    int i19 = i13;
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i19, i19));
                    int i21 = (TypedValue.complexToFraction(i19, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i19, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30;
                    byte b13 = (byte) i19;
                    byte b14 = b13;
                    cArr = charArray2;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(i18, cIndexOf, i21, -1183253656, false, $$c(b13, b14, (byte) (b14 | 51)), new Class[]{Object.class, cls, cls});
                } else {
                    cArr = charArray2;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i22 = cArr3[iIntValue2] * 32718;
                char c8 = cArr4[iIntValue];
                int i23 = i12;
                Object[] objArr5 = new Object[i23];
                objArr5[c7] = Integer.valueOf(c8);
                objArr5[0] = Integer.valueOf(i22);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2774 - TextUtils.getOffsetBefore("", 0), (char) (13059 - ((byte) KeyEvent.getModifierMetaStateMask())), 25 - (ViewConfiguration.getFadingEdgeLength() >> 16), -320602145, false, $$c(b15, b16, b16), new Class[]{cls, cls});
                }
                cArr4[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i24 = oncompletion.getDeviceData;
                cArr5[i24] = (char) (((((long) (r0 ^ cArr[i24])) ^ (getDeviceData ^ 1905653906042338631L)) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKTransactionID) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i24 + 1;
                $10 = ($11 + 121) % 128;
                i15 = i23;
                charArray2 = cArr;
                i14 = 0;
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

    private static byte[] getSDKAppID(BuildConfig buildConfig, atd.ah.getDeviceData getdevicedata, JSONObject jSONObject) throws Throwable {
        try {
            JSONObject jSONObject2 = new JSONObject();
            Object[] objArr = new Object[1];
            a("雝だ怫\ue728", "砭玈컁쯻", "纙顅凤", (-1049393033) - TextUtils.lastIndexOf("", '0', 0, 0), (char) (64463 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr);
            jSONObject2.put(((String) objArr[0]).intern(), buildConfig.AuthenticationRequestParameters());
            Object[] objArr2 = new Object[1];
            a("雝だ怫\ue728", "\ud9b6ᕤ쐐㝩", "は湼\uf866", (KeyEvent.getMaxKeyCode() >> 16) + 269837529, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27077), objArr2);
            jSONObject2.put(((String) objArr2[0]).intern(), getdevicedata.AuthenticationRequestParameters());
            if (jSONObject != null) {
                getSDKEphemeralPublicKey = (ChallengeResult + 51) % 128;
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    getSDKEphemeralPublicKey = (ChallengeResult + 3) % 128;
                    String next = itKeys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                    getSDKEphemeralPublicKey = (ChallengeResult + 35) % 128;
                }
            }
            return jSONObject2.toString().getBytes(atd.e.getSDKAppID.getSDKAppID);
        } catch (JSONException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    public static void init$0() {
        $$a = new byte[]{49, -90, -82, 29};
        $$b = 204;
    }

    public final atd.ah.getDeviceData getDeviceData() {
        int i11 = getSDKEphemeralPublicKey;
        atd.ah.getDeviceData getdevicedata = this.getSDKReferenceNumber;
        int i12 = i11 + 109;
        ChallengeResult = i12 % 128;
        if (i12 % 2 == 0) {
            return getdevicedata;
        }
        throw null;
    }

    @Override // atd.aj.getMessageVersion
    public final void getSDKReferenceNumber() {
        int i11 = ChallengeResult + 9;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            super.getSDKReferenceNumber();
            this.getSDKAppID = null;
            this.getSDKReferenceNumber = null;
            throw null;
        }
        super.getSDKReferenceNumber();
        this.getSDKAppID = null;
        this.getSDKReferenceNumber = null;
        int i12 = ChallengeResult + 11;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public final BuildConfig getSDKTransactionID() {
        int i11 = ChallengeResult;
        BuildConfig buildConfig = this.getSDKAppID;
        getSDKEphemeralPublicKey = (i11 + 15) % 128;
        return buildConfig;
    }

    public ChallengeResultCancelled(BuildConfig buildConfig, atd.ah.getDeviceData getdevicedata, JSONObject jSONObject) {
        super(getSDKAppID(buildConfig, getdevicedata, jSONObject));
        this.getSDKAppID = buildConfig;
        this.getSDKReferenceNumber = getdevicedata;
    }
}
