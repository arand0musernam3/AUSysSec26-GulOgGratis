package atd.g;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.onCompletion;
import atd.e.ChallengeResult;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceInformationFactory;", "", "<init>", "()V", "create", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceInformation;", "application", "Landroid/app/Application;", "configParameters", "Lcom/adyen/threeds2/parameters/ConfigParameters;", "warnings", "", "Lcom/adyen/threeds2/Warning;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceInformationFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInformationFactory.kt\ncom/adyen/threeds2/internal/deviceinfo/DeviceInformationFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n827#2:30\n855#2,2:31\n*S KotlinDebug\n*F\n+ 1 DeviceInformationFactory.kt\ncom/adyen/threeds2/internal/deviceinfo/DeviceInformationFactory\n*L\n21#1:30\n21#1:31,2\n*E\n"})
public final class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static long getDeviceData;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;

    @NotNull
    public static final getSDKReferenceNumber getSDKReferenceNumber;
    private static char getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r7, int r8, int r9) {
        /*
            int r9 = r9 + 68
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = atd.g.getSDKReferenceNumber.$$c
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r0
            r5 = r2
            r0 = r9
            r9 = r8
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r0
            r0 = r6
        L2b:
            int r8 = r8 + r0
            int r9 = r9 + 1
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.g.getSDKReferenceNumber.$$g(byte, int, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getSDKEphemeralPublicKey = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters();
        getSDKReferenceNumber = new getSDKReferenceNumber();
        int i11 = getSDKEphemeralPublicKey + 27;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private getSDKReferenceNumber() {
    }

    public static void AuthenticationRequestParameters() {
        getDeviceData = 1905653906042338631L;
        getSDKAppID = -2038612665;
        getSDKTransactionID = (char) 57580;
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        long j9;
        int i12;
        int i13;
        char c7;
        if (str3 != null) {
            $11 = ($10 + 81) % 128;
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        int i14 = 2;
        int i15 = 0;
        if (str != null) {
            int i16 = $11 + 15;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                charArray2 = str.toCharArray();
                int i17 = 78 / 0;
            } else {
                charArray2 = str.toCharArray();
            }
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        onCompletion oncompletion = new onCompletion();
        int length = charArray3.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(charArray3, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c3);
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr5 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            $10 = ($11 + 85) % 128;
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    byte b8 = (byte) i15;
                    j9 = 0;
                    byte b11 = b8;
                    sDKTransactionID = ChallengeResult.getDeviceData(2068 - (ExpandableListView.getPackedPositionForChild(i15, i15) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i15, i15) == 0L ? 0 : -1)), (char) ((-16732559) - Color.rgb(i15, i15, i15)), (KeyEvent.getMaxKeyCode() >> 16) + 32, -397560981, false, $$g(b8, b11, (byte) (b11 | 49)), new Class[]{Object.class});
                } else {
                    j9 = 0;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    byte b12 = (byte) i15;
                    i12 = i14;
                    byte b13 = b12;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(3095 - Color.argb(i15, i15, i15, i15), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14366), 19 - (SystemClock.elapsedRealtimeNanos() > j9 ? 1 : (SystemClock.elapsedRealtimeNanos() == j9 ? 0 : -1)), -1211924053, false, $$g(b12, b13, (byte) (b13 | 50)), new Class[]{Object.class});
                } else {
                    i12 = i14;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i18 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i18);
                objArr4[i15] = oncompletion;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    c7 = 1;
                    byte b14 = (byte) i15;
                    i13 = i15;
                    byte b15 = b14;
                    sDKTransactionID3 = ChallengeResult.getDeviceData((SystemClock.uptimeMillis() > j9 ? 1 : (SystemClock.uptimeMillis() == j9 ? 0 : -1)) + 1427, (char) (RoundCornerImageView.DEFAULT_STROKE_COLOR - Color.rgb(i15, i15, i15)), 30 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1183253656, false, $$g(b14, b15, (byte) (b15 | 51)), new Class[]{Object.class, cls, cls});
                } else {
                    i13 = i15;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i19 = cArr3[iIntValue2] * 32718;
                int i21 = i12;
                Object[] objArr5 = new Object[i21];
                objArr5[c7] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[i13] = Integer.valueOf(i19);
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    int i22 = 2774 - (TypedValue.complexToFloat(i13) > 0.0f ? 1 : (TypedValue.complexToFloat(i13) == 0.0f ? 0 : -1));
                    int i23 = i13;
                    char defaultSize = (char) (13060 - View.getDefaultSize(i23, i23));
                    int offsetBefore = TextUtils.getOffsetBefore("", i23) + 25;
                    byte b16 = (byte) i23;
                    byte b17 = b16;
                    sDKTransactionID4 = ChallengeResult.getDeviceData(i22, defaultSize, offsetBefore, -320602145, false, $$g(b16, b17, b17), new Class[]{cls, cls});
                }
                cArr4[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i24 = oncompletion.getDeviceData;
                cArr5[i24] = (char) (((((long) (r3 ^ cArr[i24])) ^ (getDeviceData ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKAppID) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKTransactionID) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i24 + 1;
                i14 = i21;
                i15 = 0;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 155 - r7
            byte[] r0 = atd.g.getSDKReferenceNumber.$$a
            int r6 = r6 * 2
            int r6 = r6 + 65
            int r1 = 31 - r8
            byte[] r1 = new byte[r1]
            int r8 = 30 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2e
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + 1
            r7 = r0
            r0 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.g.getSDKReferenceNumber.b(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.g.getSDKReferenceNumber.$$d
            int r6 = r6 * 2
            int r6 = 103 - r6
            int r1 = 70 - r8
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r8 = 69 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r0
            r4 = r2
            r0 = r7
            r7 = r8
            goto L30
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L30:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-2)
            r7 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.g.getSDKReferenceNumber.c(byte, short, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{52, -114, -70, 47, 3, -14, 34, 16, -6, -6, -18, 0, 2, -12, 14, -8, 12, -1, 24, -38, 9, 12, -2, -12, 3, -14, 34, 16, -6, -8, -29, 18, -12, -4, 19, -1, -16, 12, -5, 2, 38, 6, 3, -14, 34, 16, -6, 11, -46, 1, 40, 6, -51, 2, 13, 4, -8, -5, 12, 7, 3, -18, 12, -5, 2, 29, -18, -11, -3, 17, -13, 0, 37, -16, -16, 18, -11, 9, -14, 16, -12, 0, 3, -14, 34, 16, -6, 7, -42, 9, 4, -7, 9, -12, 18, -10, 29, -36, 20, -9, 4, 7, 25, -25, -19, 3, -14, 40, -23, -13, 1, 19, -5, 3, 16, -14, -12, 0, 11, -5, 2, -36, 8, -10, 1, 8, -8, 8, 3, 20, -18, -13, -1, 10, -7, 50, -29, -12, 12, -1, -6, 1, 8, 2, 3, -14, 49, -32, -16, 14, 7, -1, 34, -28, -18, 20, -36, 8, -10, 1, 8, -8, 8, 3, 20, -18, -13, -1, 10, -7};
        $$b = 252;
    }

    public static void init$1() {
        $$d = new byte[]{43, -52, -24, 121, -21, 14, 52, -53, -3, 50, -59, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -21, 14, 52, -53, -11, 58, -21, -54, -1, 10, 1, -11, -8, 9, 4, 0, -21, 9, -8, -1, 26, -21, -14, -6, 14, -16, -3, 34, -19, -19, 15, -14, 6, -17, 13, -15, -3, 77, -31, -54, -1, 10, 1, -11, -8, 9, 4, 0, -21, 9, -8, -1, 26, -21, -14, -6, 14, -16, -3, 34, -19, -19, 15, -14, 6, -17, 13, -15, -3, -21, 14, 52, -75, 71, -29, -39, 3, -13, 9, 6, -13, 1, -19, 19, 17, -21, -16, -4, 7, -10, 78, -31, -54, -1, 10, 1, -11, -8, 9, 4, 0, -21, 9, -8, -1, 26, -21, -14, -6, 14, -16, -3, 34, -19, -19, 15, -14, 6, -17, 13, -15, -3, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, -21, 14, 52, -76, 72, -22, -53, 10, -5, 6, 31, -46, -1, 6, -5, 0, 65, -69, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -21, 14, 52, -77, 73, -59, 0, -17, 30, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 25, -35, 17, -21, -3, 0, 77, -69, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 31, 13, -9, -9, -21, -3, -1, -15, 11, -11, 9, -4, 21, -41, 6, 9, -5, -15, -21, 14, 52, -75, 71, -59, 0, -17, 46, -35, -19, 11, 4, -4, 31, -31, -21, 17, 59, -69, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -54, -1, 10, 1, -11, -8, 9, 4, 0, -21, 9, -8, -1, 26, -21, -14, -6, 14, -16, -3, 34, -19, -19, 15, -14, 6, -17, 13, -15, -3, -21, 14, 52, -78, 74, -59, 0, -17, 30, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 25, -35, 17, -21, -3, 0, 77, -69, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 46, -35, -19, 11, 4, -4, 31, -31, -21, 17};
        $$e = 209;
    }

    public static void init$2() {
        $$c = new byte[]{112, -4, 67, 92};
        $$f = 44;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0b4c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0bea  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0cca  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0e6c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0ec2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0f9d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0ff9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x103e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x1052  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x1123  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x134d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x13b7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x147e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x14db  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x1520  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x1534  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x15fa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x1782  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x17e6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x18cc  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x18fa  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x18fc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x18ff  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final atd.g.getSDKTransactionID getSDKTransactionID(@org.jetbrains.annotations.NotNull android.app.Application r49, @org.jetbrains.annotations.NotNull com.adyen.threeds2.parameters.ConfigParameters r50, @org.jetbrains.annotations.NotNull java.util.List<? extends com.adyen.threeds2.Warning> r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.g.getSDKReferenceNumber.getSDKTransactionID(android.app.Application, com.adyen.threeds2.parameters.ConfigParameters, java.util.List):atd.g.getSDKTransactionID");
    }
}
