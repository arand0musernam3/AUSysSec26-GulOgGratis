package atd.z;

import android.app.Application;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProviderFriendlyNameProvider;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "get", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompletionEvent implements completed {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;

    @NotNull
    private final Application getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, byte r8) {
        /*
            byte[] r0 = atd.z.CompletionEvent.$$a
            int r6 = 119 - r6
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.z.CompletionEvent.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        ChallengeResultCancelled = 1;
        getSDKAppID = 7106036580717836300L;
        getSDKReferenceNumber = -2038612665;
        AuthenticationRequestParameters = (char) 15687;
    }

    public CompletionEvent(@NotNull Application application) {
        application.getClass();
        this.getSDKTransactionID = application;
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        int i12;
        int i13;
        char c7;
        char[] charArray3 = str3 != null ? str3.toCharArray() : str3;
        Object obj = null;
        int i14 = 2;
        if (str2 != null) {
            int i15 = $11 + 49;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = charArray;
        if (str != null) {
            $11 = ($10 + 101) % 128;
            charArray2 = str.toCharArray();
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        atd.bb.onCompletion oncompletion = new atd.bb.onCompletion();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i16 = 0;
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c3);
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = charArray3.length;
        char[] cArr5 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            $10 = ($11 + 121) % 128;
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    int offsetBefore = TextUtils.getOffsetBefore("", i16) + 2069;
                    char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 44657);
                    int i17 = 32 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b8 = (byte) ($$b & 11);
                    byte b11 = (byte) (b8 - 2);
                    i12 = i14;
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(offsetBefore, trimmedLength, i17, -397560981, false, $$c(b8, b11, b11), new Class[]{Object.class});
                } else {
                    i12 = i14;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    byte b12 = (byte) 1;
                    c7 = 1;
                    byte b13 = (byte) (b12 - 1);
                    i13 = i16;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3095 - View.MeasureSpec.getMode(i16), (char) (14366 - (ExpandableListView.getPackedPositionForChild(i16, i16) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i16, i16) == 0L ? 0 : -1))), 18 - View.combineMeasuredStates(i16, i16), -1211924053, false, $$c(b12, b13, b13), new Class[]{Object.class});
                } else {
                    i13 = i16;
                    c7 = 1;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(obj, objArr3)).intValue();
                int i18 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[c7] = Integer.valueOf(i18);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int i19 = i13;
                    byte b14 = (byte) i19;
                    byte b15 = b14;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1428 - TextUtils.getOffsetBefore("", i19), (char) Gravity.getAbsoluteGravity(i19, i19), TextUtils.indexOf((CharSequence) "", '0', i19, i19) + 31, -1183253656, false, $$c(b14, b15, b15), new Class[]{Object.class, cls, cls});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i21 = cArr3[iIntValue2] * 32718;
                int i22 = i12;
                Object[] objArr5 = new Object[i22];
                objArr5[c7] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[0] = Integer.valueOf(i21);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2774 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (View.resolveSizeAndState(0, 0, 0) + 13060), 25 - KeyEvent.getDeadChar(0, 0), -320602145, false, $$c((byte) 51, b16, b16), new Class[]{cls, cls});
                }
                cArr4[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i23 = oncompletion.getDeviceData;
                cArr5[i23] = (char) (((((long) (r1 ^ charArray3[i23])) ^ (getSDKAppID ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKReferenceNumber) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) AuthenticationRequestParameters) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i23 + 1;
                obj = null;
                i14 = i22;
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

    public static void init$0() {
        $$a = new byte[]{47, -17, 30, 95};
        $$b = 150;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        r1 = atd.z.CompletionEvent.ChallengeResultCancelled + 47;
        atd.z.CompletionEvent.getDeviceData = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if ((r1 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r1 = 74 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        return r0.getPasspointProviderFriendlyName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        return r0.getPasspointProviderFriendlyName();
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b A[PHI: r0
      0x006b: PHI (r0v10 java.lang.Object) = (r0v9 java.lang.Object), (r0v27 java.lang.Object) binds: [B:8:0x0069, B:5:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // atd.z.completed
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String AuthenticationRequestParameters() throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = atd.z.CompletionEvent.getDeviceData
            int r0 = r0 + 113
            int r1 = r0 % 128
            atd.z.CompletionEvent.ChallengeResultCancelled = r1
            int r0 = r0 % 2
            android.app.Application r1 = r12.getSDKTransactionID
            r2 = 0
            r3 = 1
            r4 = 47286(0xb8b6, float:6.6262E-41)
            r5 = 0
            if (r0 != 0) goto L41
            int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r9 = r0 + 52
            float r0 = android.view.ViewConfiguration.getScrollFriction()
            r6 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            int r0 = r4 << r0
            char r10 = (char) r0
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r6 = "Ջ泣袿磯"
            java.lang.String r7 = "ꍫ䨕땶ី"
            java.lang.String r8 = "ⁱ㶛\uf259殳"
            a(r6, r7, r8, r9, r10, r11)
            r0 = r11[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.Object r0 = r1.getSystemService(r0)
            boolean r1 = r0 instanceof android.net.wifi.WifiManager
            if (r1 == 0) goto L80
            goto L6b
        L41:
            int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r9 = r0 >> 16
            float r0 = android.view.ViewConfiguration.getScrollFriction()
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            int r4 = r4 - r0
            char r10 = (char) r4
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.String r6 = "Ջ泣袿磯"
            java.lang.String r7 = "ꍫ䨕땶ី"
            java.lang.String r8 = "ⁱ㶛\uf259殳"
            a(r6, r7, r8, r9, r10, r11)
            r0 = r11[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.Object r0 = r1.getSystemService(r0)
            boolean r1 = r0 instanceof android.net.wifi.WifiManager
            if (r1 == 0) goto L80
        L6b:
            int r1 = atd.z.CompletionEvent.ChallengeResultCancelled
            int r1 = r1 + 107
            int r3 = r1 % 128
            atd.z.CompletionEvent.getDeviceData = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L7d
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            r1 = 64
            int r1 = r1 / r5
            goto L81
        L7d:
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            goto L81
        L80:
            r0 = r2
        L81:
            if (r0 == 0) goto Lb8
            int r1 = atd.z.CompletionEvent.getDeviceData
            int r1 = r1 + 43
            int r3 = r1 % 128
            atd.z.CompletionEvent.ChallengeResultCancelled = r3
            int r1 = r1 % 2
            if (r1 != 0) goto L99
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()
            r1 = 71
            int r1 = r1 / r5
            if (r0 == 0) goto Lb8
            goto L9f
        L99:
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()
            if (r0 == 0) goto Lb8
        L9f:
            int r1 = atd.z.CompletionEvent.ChallengeResultCancelled
            int r1 = r1 + 47
            int r2 = r1 % 128
            atd.z.CompletionEvent.getDeviceData = r2
            int r1 = r1 % 2
            if (r1 == 0) goto Lb3
            java.lang.String r0 = r0.getPasspointProviderFriendlyName()
            r1 = 74
            int r1 = r1 / r5
            return r0
        Lb3:
            java.lang.String r0 = r0.getPasspointProviderFriendlyName()
            return r0
        Lb8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.z.CompletionEvent.AuthenticationRequestParameters():java.lang.String");
    }
}
