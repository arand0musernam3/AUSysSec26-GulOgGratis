package atd.r;

import android.app.Application;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.onCompletion;
import atd.e.ChallengeResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/locale/GetAvailableLocales;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber extends DeviceParameter {
    private static boolean AuthenticationRequestParameters = false;
    private static int BuildConfig = 0;
    private static int ChallengeResult = 0;
    private static boolean getDeviceData = false;
    private static int getMessageVersion = 1;
    private static int getSDKAppID = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static char[] getSDKReferenceNumber;

    @NotNull
    private final Application getSDKTransactionID;

    static {
        AuthenticationRequestParameters();
        ImageFormat.getBitsPerPixel(0);
        new AuthenticationRequestParameters((byte) 0);
        BuildConfig = (getSDKEphemeralPublicKey + 95) % 128;
    }

    public getSDKReferenceNumber(@NotNull Application application) {
        application.getClass();
        this.getSDKTransactionID = application;
    }

    public static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = new char[]{21778, 21730, 21728, 21757};
        getSDKAppID = 1286296749;
        AuthenticationRequestParameters = true;
        getDeviceData = true;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        ChallengeResult = (getMessageVersion + 31) % 128;
        DeviceParameterResult.Success.IntValue intValueM150boximpl = DeviceParameterResult.Success.IntValue.m150boximpl(DeviceParameterResult.Success.IntValue.m151constructorimpl(this.getSDKTransactionID.getResources().getConfiguration().getLocales().size()));
        ChallengeResult = (getMessageVersion + 41) % 128;
        return intValueM150boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/locale/GetAvailableLocales$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static char AuthenticationRequestParameters;
        private static int getDeviceData;
        private static long getSDKAppID;
        private static int getSDKReferenceNumber;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r5, int r6, short r7) {
            /*
                int r5 = r5 * 4
                int r5 = 4 - r5
                byte[] r0 = atd.r.getSDKReferenceNumber.AuthenticationRequestParameters.$$c
                int r7 = 119 - r7
                int r6 = r6 * 4
                int r1 = r6 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r7 = r5
                r4 = r6
                r3 = r2
                goto L28
            L15:
                r3 = r7
                r7 = r5
                r5 = r3
                r3 = r2
            L19:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L24:
                r4 = r0[r7]
                int r3 = r3 + 1
            L28:
                int r4 = -r4
                int r5 = r5 + r4
                int r7 = r7 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.r.getSDKReferenceNumber.AuthenticationRequestParameters.$$e(short, int, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getSDKReferenceNumber = 1;
            getSDKAppID = 1905653906042338631L;
            getDeviceData = -2038612665;
            AuthenticationRequestParameters = (char) 31950;
        }

        private AuthenticationRequestParameters() {
        }

        private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
            char[] charArray;
            long j9;
            int i12;
            int i13;
            char[] cArr;
            char c7;
            char[] charArray2 = str3 != null ? str3.toCharArray() : str3;
            char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
            if (str != null) {
                $10 = ($11 + 107) % 128;
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr2 = charArray;
            onCompletion oncompletion = new onCompletion();
            int length = charArray3.length;
            char[] cArr3 = new char[length];
            int length2 = cArr2.length;
            char[] cArr4 = new char[length2];
            int i14 = 0;
            System.arraycopy(charArray3, 0, cArr3, 0, length);
            System.arraycopy(cArr2, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c3);
            int i15 = 2;
            cArr4[2] = (char) (cArr4[2] + ((char) i11));
            int length3 = charArray2.length;
            char[] cArr5 = new char[length3];
            oncompletion.getDeviceData = 0;
            while (oncompletion.getDeviceData < length3) {
                $10 = ($11 + 103) % 128;
                try {
                    Object[] objArr2 = {oncompletion};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(874886523);
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) i14;
                        j9 = 0;
                        byte b11 = b8;
                        sDKTransactionID = ChallengeResult.getDeviceData(2069 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (44656 - ExpandableListView.getPackedPositionChild(0L)), View.MeasureSpec.getSize(i14) + 32, -397560981, false, $$e(b8, b11, (byte) (b11 + 2)), new Class[]{Object.class});
                    } else {
                        j9 = 0;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {oncompletion};
                    Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1806403515);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) i14;
                        i12 = i15;
                        byte b13 = b12;
                        i13 = i14;
                        sDKTransactionID2 = ChallengeResult.getDeviceData(3096 - (Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14366), 17 - TextUtils.indexOf((CharSequence) "", '0', i14, i14), -1211924053, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class});
                    } else {
                        i12 = i15;
                        i13 = i14;
                    }
                    int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    int i16 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[i12] = Integer.valueOf(cArr4[iIntValue]);
                    objArr4[1] = Integer.valueOf(i16);
                    objArr4[i13] = oncompletion;
                    Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1695612280);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID3 == null) {
                        c7 = 1;
                        int i17 = i13;
                        byte b14 = (byte) i17;
                        byte b15 = b14;
                        cArr = charArray2;
                        sDKTransactionID3 = ChallengeResult.getDeviceData((Process.myTid() >> 22) + 1428, (char) KeyEvent.getDeadChar(i17, i17), 30 - TextUtils.getTrimmedLength(""), -1183253656, false, $$e(b14, b15, b15), new Class[]{Object.class, cls, cls});
                    } else {
                        cArr = charArray2;
                        c7 = 1;
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                    int i18 = cArr3[iIntValue2] * 32718;
                    int i19 = i12;
                    Object[] objArr5 = new Object[i19];
                    objArr5[c7] = Integer.valueOf(cArr4[iIntValue]);
                    objArr5[0] = Integer.valueOf(i18);
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(814479823);
                    if (sDKTransactionID4 == null) {
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        sDKTransactionID4 = ChallengeResult.getDeviceData(2774 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (13061 - (ViewConfiguration.getGlobalActionKeyTimeout() > j9 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j9 ? 0 : -1))), MotionEvent.axisFromString("") + 26, -320602145, false, $$e(b16, b17, (byte) (b17 | 51)), new Class[]{cls, cls});
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                    int i21 = oncompletion.getDeviceData;
                    cArr5[i21] = (char) (((((long) (r0 ^ cArr[i21])) ^ (getSDKAppID ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getDeviceData) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) AuthenticationRequestParameters) ^ 1905653906042338631L))));
                    oncompletion.getDeviceData = i21 + 1;
                    i15 = i19;
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

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 2
                int r8 = 4 - r8
                int r6 = r6 * 3
                int r6 = r6 + 104
                int r7 = r7 * 3
                int r7 = 4 - r7
                byte[] r0 = atd.r.getSDKReferenceNumber.AuthenticationRequestParameters.$$a
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r6 = r8
                r4 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r7]
            L29:
                int r7 = r7 + 1
                int r6 = r6 + r3
                int r6 = r6 + (-2)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.r.getSDKReferenceNumber.AuthenticationRequestParameters.b(int, short, byte, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKTransactionID(int r35, int r36) {
            /*
                Method dump skipped, instruction units count: 1447
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.r.getSDKReferenceNumber.AuthenticationRequestParameters.getSDKTransactionID(int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{57, ByteCompanionObject.MAX_VALUE, -91, 50, 3, -3, 3};
            $$b = 48;
        }

        public static void init$1() {
            $$c = new byte[]{60, -89, 74, 98};
            $$d = 112;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }
}
