package atd.m;

import android.app.Application;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultTimeout;
import atd.bb.onCompletion;
import atd.e.ChallengeResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/Ydpi;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/DisplayMetricsDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$FloatValue;", "getDeviceParameterResult-Ffr52qI", "()F", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig extends getSDKAppID {
    private static char AuthenticationRequestParameters = 0;
    private static int ChallengeResult = 0;
    private static int ChallengeResultCancelled = 1;
    private static int getDeviceData = 0;
    private static int getMessageVersion = 1;
    private static char getSDKAppID;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    static {
        AuthenticationRequestParameters();
        TextUtils.lastIndexOf("", '0', 0, 0);
        new AuthenticationRequestParameters((byte) 0);
        getMessageVersion = (ChallengeResult + 55) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildConfig(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void AuthenticationRequestParameters() {
        getSDKTransactionID = (char) 16592;
        AuthenticationRequestParameters = (char) 28554;
        getSDKReferenceNumber = (char) 23694;
        getSDKAppID = (char) 18039;
    }

    private float getSDKTransactionID() {
        ChallengeResultCancelled = (getDeviceData + 33) % 128;
        float fM144constructorimpl = DeviceParameterResult.Success.FloatValue.m144constructorimpl(getSDKAppID().ydpi);
        getDeviceData = (ChallengeResultCancelled + 83) % 128;
        return fM144constructorimpl;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        getDeviceData = (ChallengeResultCancelled + 31) % 128;
        DeviceParameterResult.Success.FloatValue floatValueM143boximpl = DeviceParameterResult.Success.FloatValue.m143boximpl(getSDKTransactionID());
        int i11 = ChallengeResultCancelled + 101;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return floatValueM143boximpl;
        }
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/Ydpi$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static boolean BuildConfig;
        private static int getDeviceData;
        private static boolean getMessageVersion;
        private static char getSDKAppID;
        private static char[] getSDKReferenceNumber;
        private static long getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, short r7, byte r8) {
            /*
                int r6 = r6 * 4
                int r6 = r6 + 4
                byte[] r0 = atd.m.BuildConfig.AuthenticationRequestParameters.$$a
                int r7 = r7 * 2
                int r7 = 1 - r7
                int r8 = 119 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r7
                r5 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L22:
                r3 = r0[r6]
            L24:
                int r6 = r6 + 1
                int r8 = r8 + r3
                r3 = r5
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.BuildConfig.AuthenticationRequestParameters.$$c(int, short, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKTransactionID = 1905653906042338631L;
            AuthenticationRequestParameters = -2038612665;
            getSDKAppID = (char) 6419;
            getSDKReferenceNumber = new char[]{21837, 21835, 21859, 21885, 21850, 21881, 21839, 21912, 21906, 21916, 21913, 21911, 21880, 21806, 21874, 21907, 21868, 21891, 21905, 21871, 21848, 21869, 21890, 21894, 21886, 21909, 21915, 21918, 21883, 21879, 21904, 21917, 21908, 21888, 21895, 21872, 21862, 21827, 21854, 21831, 21914};
            getDeviceData = 1286296846;
            BuildConfig = true;
            getMessageVersion = true;
        }

        private AuthenticationRequestParameters() {
        }

        private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
            char[] charArray;
            char[] charArray2;
            int i12;
            int i13;
            long j9;
            char[] cArr;
            char c7;
            int i14 = $10;
            $11 = (i14 + 93) % 128;
            Object obj = null;
            int i15 = 2;
            if (str3 != null) {
                int i16 = i14 + 29;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    str3.toCharArray();
                    throw null;
                }
                charArray = str3.toCharArray();
            } else {
                charArray = str3;
            }
            char[] cArr2 = charArray;
            if (str2 != null) {
                charArray2 = str2.toCharArray();
                $10 = ($11 + 39) % 128;
            } else {
                charArray2 = str2;
            }
            char[] cArr3 = charArray2;
            char[] charArray3 = str != null ? str.toCharArray() : str;
            onCompletion oncompletion = new onCompletion();
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int length2 = charArray3.length;
            char[] cArr5 = new char[length2];
            int i17 = 0;
            System.arraycopy(cArr3, 0, cArr4, 0, length);
            System.arraycopy(charArray3, 0, cArr5, 0, length2);
            cArr4[0] = (char) (cArr4[0] ^ c3);
            cArr5[2] = (char) (cArr5[2] + ((char) i11));
            int length3 = cArr2.length;
            char[] cArr6 = new char[length3];
            oncompletion.getDeviceData = 0;
            while (oncompletion.getDeviceData < length3) {
                try {
                    Object[] objArr2 = {oncompletion};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(874886523);
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) i17;
                        byte b11 = b8;
                        i12 = i15;
                        sDKTransactionID = ChallengeResult.getDeviceData((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2069, (char) (44657 - (ViewConfiguration.getEdgeSlop() >> 16)), 32 - (Process.myPid() >> 22), -397560981, false, $$c(b8, b11, (byte) (b11 + 2)), new Class[]{Object.class});
                    } else {
                        i12 = i15;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                    Object[] objArr3 = {oncompletion};
                    Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1806403515);
                    if (sDKTransactionID2 == null) {
                        j9 = 0;
                        byte b12 = (byte) i17;
                        byte b13 = b12;
                        i13 = i17;
                        sDKTransactionID2 = ChallengeResult.getDeviceData((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3094, (char) (14367 - TextUtils.indexOf("", "", i17)), 18 - ExpandableListView.getPackedPositionGroup(0L), -1211924053, false, $$c(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class});
                    } else {
                        i13 = i17;
                        j9 = 0;
                    }
                    int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(obj, objArr3)).intValue();
                    int i18 = cArr4[oncompletion.getDeviceData % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[i12] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i18);
                    objArr4[i13] = oncompletion;
                    Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1695612280);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID3 == null) {
                        c7 = 1;
                        int i19 = i13;
                        byte b14 = (byte) i19;
                        byte b15 = b14;
                        cArr = cArr2;
                        sDKTransactionID3 = ChallengeResult.getDeviceData(1428 - TextUtils.getTrimmedLength(""), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i19, i19)), 30 - TextUtils.indexOf("", ""), -1183253656, false, $$c(b14, b15, b15), new Class[]{Object.class, cls, cls});
                    } else {
                        cArr = cArr2;
                        c7 = 1;
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                    int i21 = cArr4[iIntValue2] * 32718;
                    char c8 = cArr5[iIntValue];
                    i15 = i12;
                    Object[] objArr5 = new Object[i15];
                    objArr5[c7] = Integer.valueOf(c8);
                    objArr5[0] = Integer.valueOf(i21);
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(814479823);
                    if (sDKTransactionID4 == null) {
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        sDKTransactionID4 = ChallengeResult.getDeviceData(2775 - (ViewConfiguration.getGlobalActionKeyTimeout() > j9 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j9 ? 0 : -1)), (char) (TextUtils.getCapsMode("", 0, 0) + 13060), 24 - TextUtils.indexOf((CharSequence) "", '0', 0), -320602145, false, $$c(b16, b17, (byte) (b17 | 51)), new Class[]{cls, cls});
                    }
                    obj = null;
                    cArr5[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                    int i22 = oncompletion.getDeviceData;
                    cArr6[i22] = (char) (((((long) (r0 ^ cArr[i22])) ^ (getSDKTransactionID ^ 1905653906042338631L)) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKAppID) ^ 1905653906042338631L))));
                    oncompletion.getDeviceData = i22 + 1;
                    cArr2 = cArr;
                    i17 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            String str4 = new String(cArr6);
            $10 = ($11 + 119) % 128;
            objArr[0] = str4;
        }

        private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
            int i12;
            int i13;
            char[] cArr;
            long j9;
            int i14;
            String str3 = str2;
            $10 = ($11 + 55) % 128;
            Object bytes = str3;
            if (str3 != null) {
                bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
            byte[] bArr = (byte[]) bytes;
            char[] charArray = str != null ? str.toCharArray() : str;
            ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
            char[] cArr2 = getSDKReferenceNumber;
            Class cls = Integer.TYPE;
            long j11 = 0;
            int i15 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i16 = 0;
                while (i16 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                        Object sDKTransactionID = ChallengeResult.getSDKTransactionID(887083134);
                        if (sDKTransactionID == null) {
                            int packedPositionChild = 2554 - ExpandableListView.getPackedPositionChild(j11);
                            j9 = j11;
                            char absoluteGravity = (char) (48598 - Gravity.getAbsoluteGravity(i15, i15));
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i15) + 32;
                            byte b8 = (byte) i15;
                            i14 = i15;
                            byte b11 = b8;
                            sDKTransactionID = ChallengeResult.getDeviceData(packedPositionChild, absoluteGravity, iIndexOf, -390605202, false, $$c(b8, b11, (byte) (b11 | 8)), new Class[]{cls});
                        } else {
                            j9 = j11;
                            i14 = i15;
                        }
                        cArr3[i16] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i16++;
                        $11 = ($10 + 47) % 128;
                        i15 = i14;
                        j11 = j9;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            long j12 = j11;
            int i17 = i15;
            Object[] objArr3 = {Integer.valueOf(getDeviceData)};
            Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1144184369);
            if (sDKTransactionID2 == null) {
                sDKTransactionID2 = ChallengeResult.getDeviceData((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 147, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 32 - (ExpandableListView.getPackedPositionForGroup(i17) > j12 ? 1 : (ExpandableListView.getPackedPositionForGroup(i17) == j12 ? 0 : -1)), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
            int i18 = 1124287645;
            if (getMessageVersion) {
                int i19 = $10 + 53;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    int length2 = bArr.length;
                    challengeResultTimeout.AuthenticationRequestParameters = length2;
                    cArr = new char[length2];
                    i13 = i17;
                } else {
                    i13 = i17;
                    int length3 = bArr.length;
                    challengeResultTimeout.AuthenticationRequestParameters = length3;
                    cArr = new char[length3];
                }
                challengeResultTimeout.getSDKAppID = i13;
                while (true) {
                    int i21 = challengeResultTimeout.getSDKAppID;
                    int i22 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i21 >= i22) {
                        objArr[0] = new String(cArr);
                        return;
                    }
                    cArr[i21] = (char) (cArr2[bArr[(i22 - 1) - i21] + i11] - iIntValue);
                    Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID3 == null) {
                        byte b12 = (byte) 0;
                        sDKTransactionID3 = ChallengeResult.getDeviceData(1698 - (SystemClock.elapsedRealtimeNanos() > j12 ? 1 : (SystemClock.elapsedRealtimeNanos() == j12 ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), 29 - Gravity.getAbsoluteGravity(0, 0), -1620360563, false, $$c(b12, b12, (byte) $$a.length), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                }
            } else if (BuildConfig) {
                int length4 = charArray.length;
                challengeResultTimeout.AuthenticationRequestParameters = length4;
                char[] cArr4 = new char[length4];
                challengeResultTimeout.getSDKAppID = i17;
                while (true) {
                    int i23 = challengeResultTimeout.getSDKAppID;
                    int i24 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i23 >= i24) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    cArr4[i23] = (char) (cArr2[charArray[(i24 - 1) - i23] - i11] - iIntValue);
                    Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(i18);
                    if (sDKTransactionID4 == null) {
                        byte b13 = (byte) 0;
                        sDKTransactionID4 = ChallengeResult.getDeviceData(TextUtils.getOffsetBefore("", 0) + 1697, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 29 - ExpandableListView.getPackedPositionType(j12), -1620360563, false, $$c(b13, b13, (byte) $$a.length), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                    i18 = 1124287645;
                }
            } else {
                int length5 = iArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length5;
                char[] cArr5 = new char[length5];
                challengeResultTimeout.getSDKAppID = i17;
                while (true) {
                    int i25 = challengeResultTimeout.getSDKAppID;
                    int i26 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i25 >= i26) {
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    int i27 = $11 + 25;
                    $10 = i27 % 128;
                    if (i27 % 2 != 0) {
                        cArr5[i25] = (char) (cArr2[iArr[(i26 >>> 1) >> i25] % i11] / iIntValue);
                        i12 = i25 - 1;
                    } else {
                        cArr5[i25] = (char) (cArr2[iArr[(i26 - 1) - i25] - i11] - iIntValue);
                        i12 = i25 + 1;
                    }
                    challengeResultTimeout.getSDKAppID = i12;
                }
            }
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKAppID(android.content.Context r31, int r32, int r33) {
            /*
                Method dump skipped, instruction units count: 1267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.BuildConfig.AuthenticationRequestParameters.getSDKAppID(android.content.Context, int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{88, -33, -84, -115};
            $$b = 59;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }
}
