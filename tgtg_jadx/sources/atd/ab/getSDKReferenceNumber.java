package atd.ab;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.ChallengeResultCompleted;
import atd.e.ChallengeResult;
import com.adyen.threeds2.RuntimeErrorEvent;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKReferenceNumber implements RuntimeErrorEvent {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getMessageVersion;
    private static char getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;
    private final String AuthenticationRequestParameters;
    private final String getDeviceData;
    private final String getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, int r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = atd.ab.getSDKReferenceNumber.$$a
            int r6 = r6 * 3
            int r6 = 69 - r6
            int r8 = r8 * 2
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r8 = r8 + 1
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ab.getSDKReferenceNumber.$$c(short, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        getSDKTransactionID = (char) 19069;
        getSDKReferenceNumber = (char) 5909;
        getSDKEphemeralPublicKey = (char) 54387;
        ChallengeResult = (char) 60274;
    }

    public getSDKReferenceNumber(String str, String str2, String str3) {
        this.AuthenticationRequestParameters = str;
        this.getDeviceData = str2;
        this.getSDKAppID = str3;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        if (str != null) {
            $11 = ($10 + 113) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr2 = new char[cArr.length];
        int i15 = 0;
        challengeResultCompleted.getDeviceData = 0;
        int i16 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i17 = challengeResultCompleted.getDeviceData;
            if (i17 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            $10 = ($11 + 65) % 128;
            cArr3[i15] = cArr[i17];
            int i18 = 1;
            cArr3[1] = cArr[i17 + 1];
            int i19 = 58224;
            int i21 = i15;
            while (i21 < 16) {
                $10 = ($11 + 17) % 128;
                char c3 = cArr3[i18];
                char c7 = cArr3[i15];
                int i22 = (c7 + i19) ^ ((c7 << 4) + ((char) (((long) getSDKEphemeralPublicKey) ^ 5320350835299930193L)));
                int i23 = c7 >>> 5;
                int i24 = i16;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ChallengeResult);
                    objArr2[i24] = Integer.valueOf(i23);
                    objArr2[i18] = Integer.valueOf(i22);
                    objArr2[i15] = Integer.valueOf(c3);
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        i14 = 906025703;
                        byte b8 = (byte) i18;
                        i13 = i18;
                        byte b11 = (byte) (b8 - 1);
                        i12 = i15;
                        sDKTransactionID = ChallengeResult.getDeviceData((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2827, (char) (TypedValue.complexToFraction(i15, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i15, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.resolveSize(i15, i15) + 27, -362226441, false, $$c(b8, b11, b11), new Class[]{cls, cls, cls, cls});
                    } else {
                        i12 = i15;
                        i13 = i18;
                        i14 = 906025703;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr3[i13] = cCharValue;
                    char c8 = cArr3[i12];
                    int i25 = (cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) getSDKTransactionID) ^ 5320350835299930193L)));
                    int i26 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(getSDKReferenceNumber);
                    objArr3[i24] = Integer.valueOf(i26);
                    objArr3[i13] = Integer.valueOf(i25);
                    objArr3[i12] = Integer.valueOf(c8);
                    Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(i14);
                    if (sDKTransactionID2 == null) {
                        int iGreen = 2828 - Color.green(i12);
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        int i27 = i12;
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27, i27) + 27;
                        byte b12 = (byte) i13;
                        byte b13 = (byte) (b12 - 1);
                        sDKTransactionID2 = ChallengeResult.getDeviceData(iGreen, trimmedLength, iMakeMeasureSpec, -362226441, false, $$c(b12, b13, b13), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i19 -= 40503;
                    i21++;
                    i16 = i24;
                    i15 = 0;
                    i18 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i28 = i16;
            int i29 = challengeResultCompleted.getDeviceData;
            cArr2[i29] = cArr3[0];
            cArr2[i29 + 1] = cArr3[1];
            Object[] objArr4 = new Object[i28];
            objArr4[1] = challengeResultCompleted;
            objArr4[0] = challengeResultCompleted;
            Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                sDKTransactionID3 = ChallengeResult.getDeviceData(3157 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 25798), (ViewConfiguration.getLongPressTimeout() >> 16) + 27, 1296942946, false, $$c(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            i16 = i28;
            i15 = 0;
        }
    }

    public static void init$0() {
        $$a = new byte[]{57, -81, -39, 15};
        $$b = 150;
    }

    @Override // com.adyen.threeds2.RuntimeErrorEvent
    public final String getAdditionalDetails() {
        int i11 = ChallengeResultCancelled;
        String str = this.getSDKAppID;
        int i12 = i11 + 53;
        getMessageVersion = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.RuntimeErrorEvent
    public final String getErrorCode() {
        int i11 = (ChallengeResultCancelled + 37) % 128;
        getMessageVersion = i11;
        String str = this.AuthenticationRequestParameters;
        ChallengeResultCancelled = (i11 + 89) % 128;
        return str;
    }

    @Override // com.adyen.threeds2.RuntimeErrorEvent
    public final String getErrorMessage() {
        int i11 = ChallengeResultCancelled + 75;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        String str = this.getDeviceData;
        if (i12 != 0) {
            return str;
        }
        throw null;
    }

    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("皣嶚\ueeed\u0fe6ꌒᰁ㹕ᣂඹ\uf66b괞繂", ((byte) KeyEvent.getModifierMetaStateMask()) + 13, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(getErrorCode());
        Object[] objArr2 = new Object[1];
        a("皣嶚\ueeed\u0fe6ꌒᰁ삩\ue7de罺̨ң͋砊\ud7ffꎾ氧", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 14, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(getErrorMessage());
        String string = sb2.toString();
        int i11 = getMessageVersion + 113;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            return string;
        }
        throw null;
    }
}
