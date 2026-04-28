package atd.bc;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.onCompletion;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/adyen/threeds2/internal/util/AlreadyDestroyedException;", "Ljava/lang/Exception;", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char getDeviceData;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            byte[] r0 = atd.bc.getSDKTransactionID.$$a
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = 119 - r6
            int r8 = r8 * 2
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L18
            r6 = r8
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2c
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
            r5 = r0
            r0 = r7
            r7 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r0 + 1
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.getSDKTransactionID.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 1905653906042338631L;
        getSDKReferenceNumber = -2038612665;
        getDeviceData = (char) 39888;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getSDKTransactionID() throws Throwable {
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", "ꘀ瓨눖ꭙ", "楅ᱦ䖂뼨抙찔웇③碒\uee93\udec7謂杦韾暋歙ꧻ༩皜찅ꬊ鵦ಚቺᙀ㕹鐉㯊琸娣䏜生쬌뱐ꑉ", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 376760486, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr);
        super(((String) objArr[0]).intern());
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char c7;
        $11 = ($10 + 71) % 128;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        onCompletion oncompletion = new onCompletion();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray3.length;
        char[] cArr2 = new char[length2];
        int i14 = 0;
        System.arraycopy(charArray2, 0, cArr, 0, length);
        System.arraycopy(charArray3, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c3);
        int i15 = 2;
        cArr2[2] = (char) (cArr2[2] + ((char) i11));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            $10 = ($11 + 115) % 128;
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    byte b8 = (byte) i15;
                    byte b11 = (byte) (b8 - 2);
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(ImageFormat.getBitsPerPixel(i14) + 2070, (char) (44657 - (ViewConfiguration.getLongPressTimeout() >> 16)), 31 - ImageFormat.getBitsPerPixel(i14), -397560981, false, $$c(b8, b11, b11), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    i12 = i15;
                    byte b12 = (byte) 1;
                    c7 = 1;
                    byte b13 = (byte) (b12 - 1);
                    i13 = i14;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3094, (char) (14367 - View.resolveSize(i14, i14)), 18 - TextUtils.indexOf("", ""), -1211924053, false, $$c(b12, b13, b13), new Class[]{Object.class});
                } else {
                    i12 = i15;
                    i13 = i14;
                    c7 = 1;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i16 = cArr[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr2[iIntValue]);
                objArr4[c7] = Integer.valueOf(i16);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int i17 = i13;
                    byte b14 = (byte) i17;
                    byte b15 = b14;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(Drawable.resolveOpacity(i17, i17) + 1428, (char) View.resolveSizeAndState(i17, i17, i17), 29 - MotionEvent.axisFromString(""), -1183253656, false, $$c(b14, b15, b15), new Class[]{Object.class, cls, cls});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i18 = cArr[iIntValue2] * 32718;
                int i19 = i12;
                Object[] objArr5 = new Object[i19];
                objArr5[c7] = Integer.valueOf(cArr2[iIntValue]);
                objArr5[0] = Integer.valueOf(i18);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2774 - (Process.myTid() >> 22), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13059), KeyEvent.getDeadChar(0, 0) + 25, -320602145, false, $$c((byte) 51, b16, b16), new Class[]{cls, cls});
                }
                cArr2[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i21 = oncompletion.getDeviceData;
                cArr3[i21] = (char) (((((long) (r6 ^ charArray[i21])) ^ (getSDKAppID ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKReferenceNumber) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getDeviceData) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i21 + 1;
                $10 = ($11 + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
                i15 = i19;
                i14 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{47, -93, 7, 60};
        $$b = 28;
    }
}
