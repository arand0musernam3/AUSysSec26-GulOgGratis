package atd.m;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultKt;
import atd.e.ChallengeResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/ScaledDensity;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/DisplayMetricsDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData extends getSDKAppID {
    private static long AuthenticationRequestParameters = 0;
    private static char[] getDeviceData = null;
    private static int getSDKAppID = 1;
    private static int getSDKEphemeralPublicKey = 1;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        getSDKTransactionID();
        ExpandableListView.getPackedPositionForChild(0, 0);
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        ViewConfiguration.getEdgeSlop();
        new C0011getDeviceData((byte) 0);
        getSDKReferenceNumber = (getSDKEphemeralPublicKey + 91) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDeviceData(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKTransactionID() {
        getDeviceData = new char[]{61101, 1091, 15331, 20741};
        AuthenticationRequestParameters = -7033222942035468656L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        int i11 = getSDKTransactionID + 81;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0 ? Build.VERSION.SDK_INT < 34 : Build.VERSION.SDK_INT < 120) {
            return DeviceParameterResult.Success.FloatValue.m143boximpl(DeviceParameterResult.Success.FloatValue.m144constructorimpl(getSDKAppID().scaledDensity));
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        getSDKAppID = (getSDKTransactionID + 113) % 128;
        return failure;
    }

    /* JADX INFO: renamed from: atd.m.getDeviceData$getDeviceData, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/ScaledDensity$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0011getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int getDeviceData;
        private static char[] getSDKReferenceNumber;
        private static char getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(int r6, int r7, short r8) {
            /*
                int r7 = r7 + 65
                int r6 = r6 * 4
                int r0 = 1 - r6
                int r8 = r8 * 2
                int r8 = 4 - r8
                byte[] r1 = atd.m.getDeviceData.C0011getDeviceData.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L17
                r3 = r1
                r4 = r2
                r1 = r8
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L23:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r1
                r1 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r8 = r8 + 1
                int r7 = r7 + r1
                r1 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.getDeviceData.C0011getDeviceData.$$e(int, int, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            AuthenticationRequestParameters = 0;
            getDeviceData = 1;
            getSDKReferenceNumber = new char[]{30910, 30903, 30863, 30898, 30901, 30904, 30884, 30896, 30897, 30888, 30895, 30902, 30881, 30911, 30894, 30893, 30892, 30899, 30883, 30907, 30853, 30889, 30955, 30952, 30880, 30855, 30900, 30891, 30890, 30905, 30885, 30882, 30967, 30906, 30887, 30953};
            getSDKTransactionID = (char) 19802;
        }

        private C0011getDeviceData() {
        }

        private static void a(String str, int i11, byte b8, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            int i13;
            char c3;
            char c7;
            int i14;
            long j9;
            if (str != null) {
                $11 = ($10 + 73) % 128;
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            ChallengeResultKt challengeResultKt = new ChallengeResultKt();
            char[] cArr2 = getSDKReferenceNumber;
            Class cls = Integer.TYPE;
            char c8 = '0';
            int i15 = -317146529;
            long j11 = 0;
            int i16 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i17 = 0;
                while (i17 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i17])};
                        Object sDKTransactionID = ChallengeResult.getSDKTransactionID(i15);
                        if (sDKTransactionID == null) {
                            i14 = i15;
                            int packedPositionChild = 2157 - ExpandableListView.getPackedPositionChild(j11);
                            j9 = j11;
                            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                            int iIndexOf = 35 - TextUtils.indexOf("", c8, i16);
                            byte b11 = (byte) i16;
                            byte b12 = b11;
                            sDKTransactionID = ChallengeResult.getDeviceData(packedPositionChild, tapTimeout, iIndexOf, 829471823, false, $$e(b11, b12, b12), new Class[]{cls});
                        } else {
                            i14 = i15;
                            j9 = j11;
                        }
                        cArr3[i17] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i17++;
                        i15 = i14;
                        j11 = j9;
                        c8 = '0';
                        i16 = 0;
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
            int i18 = i15;
            long j12 = j11;
            Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
            Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(i18);
            float f11 = 0.0f;
            if (sDKTransactionID2 == null) {
                byte b13 = (byte) 0;
                byte b14 = b13;
                sDKTransactionID2 = ChallengeResult.getDeviceData(2158 - View.getDefaultSize(0, 0), (char) KeyEvent.getDeadChar(0, 0), 36 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 829471823, false, $$e(b13, b14, b14), new Class[]{cls});
            }
            char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i11];
            if (i11 % 2 != 0) {
                i12 = i11 - 1;
                cArr4[i12] = (char) (cArr[i12] - b8);
            } else {
                i12 = i11;
            }
            int i19 = 1;
            if (i12 > 1) {
                $11 = ($10 + 101) % 128;
                challengeResultKt.getSDKReferenceNumber = 0;
                while (true) {
                    int i21 = challengeResultKt.getSDKReferenceNumber;
                    if (i21 >= i12) {
                        break;
                    }
                    char c11 = cArr[i21];
                    challengeResultKt.getDeviceData = c11;
                    char c12 = cArr[i21 + 1];
                    challengeResultKt.getSDKAppID = c12;
                    if (c11 == c12) {
                        cArr4[i21] = (char) (c11 - b8);
                        cArr4[i21 + 1] = (char) (c12 - b8);
                        i13 = i19;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = challengeResultKt;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = challengeResultKt;
                        objArr4[9] = challengeResultKt;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = challengeResultKt;
                        objArr4[6] = challengeResultKt;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = challengeResultKt;
                        objArr4[3] = challengeResultKt;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[i19] = challengeResultKt;
                        objArr4[0] = challengeResultKt;
                        Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(835518319);
                        if (sDKTransactionID3 == null) {
                            c3 = 2;
                            int i22 = 1259 - (ViewConfiguration.getGlobalActionKeyTimeout() > j12 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j12 ? 0 : -1));
                            c7 = '\t';
                            char cIndexOf = (char) (34413 - TextUtils.indexOf((CharSequence) "", '0', 0));
                            int i23 = (TypedValue.complexToFraction(0, f11, f11) > f11 ? 1 : (TypedValue.complexToFraction(0, f11, f11) == f11 ? 0 : -1)) + 41;
                            byte b15 = (byte) 0;
                            byte b16 = (byte) (b15 + 2);
                            i13 = i19;
                            String str$$e = $$e(b15, b16, (byte) (b16 - 2));
                            Class cls2 = Integer.TYPE;
                            sDKTransactionID3 = ChallengeResult.getDeviceData(i22, cIndexOf, i23, -307955329, false, str$$e, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                        } else {
                            i13 = i19;
                            c3 = 2;
                            c7 = '\t';
                        }
                        int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                        int i24 = challengeResultKt.ChallengeResultCancelled;
                        if (iIntValue == i24) {
                            Object[] objArr5 = new Object[11];
                            objArr5[10] = challengeResultKt;
                            objArr5[c7] = Integer.valueOf(cCharValue);
                            objArr5[8] = challengeResultKt;
                            objArr5[7] = Integer.valueOf(cCharValue);
                            objArr5[6] = Integer.valueOf(cCharValue);
                            objArr5[5] = challengeResultKt;
                            objArr5[4] = challengeResultKt;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[c3] = Integer.valueOf(cCharValue);
                            objArr5[i13] = challengeResultKt;
                            objArr5[0] = challengeResultKt;
                            Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(-758961112);
                            if (sDKTransactionID4 == null) {
                                int packedPositionGroup = 2223 - ExpandableListView.getPackedPositionGroup(j12);
                                char keyRepeatTimeout = (char) (53070 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                int iAlpha = Color.alpha(0) + 21;
                                byte b17 = (byte) 0;
                                String str$$e2 = $$e(b17, (byte) (b17 | 57), b17);
                                Class cls3 = Integer.TYPE;
                                sDKTransactionID4 = ChallengeResult.getDeviceData(packedPositionGroup, keyRepeatTimeout, iAlpha, 246098488, false, str$$e2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                            int i25 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                            int i26 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i26] = cArr2[iIntValue2];
                            cArr4[i26 + 1] = cArr2[i25];
                        } else {
                            int i27 = challengeResultKt.AuthenticationRequestParameters;
                            int i28 = challengeResultKt.getSDKTransactionID;
                            if (i27 == i28) {
                                $10 = ($11 + 47) % 128;
                                int i29 = i13;
                                int iC = k.c(challengeResultKt.getMessageVersion, cCharValue, i29, cCharValue);
                                challengeResultKt.getMessageVersion = iC;
                                int iC2 = k.c(i24, cCharValue, i29, cCharValue);
                                challengeResultKt.ChallengeResultCancelled = iC2;
                                int i31 = (i28 * cCharValue) + iC2;
                                int i32 = challengeResultKt.getSDKReferenceNumber;
                                cArr4[i32] = cArr2[(i27 * cCharValue) + iC];
                                cArr4[i32 + i29] = cArr2[i31];
                                i13 = 1;
                            } else {
                                int i33 = (i27 * cCharValue) + i24;
                                int i34 = (i28 * cCharValue) + challengeResultKt.getMessageVersion;
                                int i35 = challengeResultKt.getSDKReferenceNumber;
                                cArr4[i35] = cArr2[i33];
                                i13 = 1;
                                cArr4[i35 + 1] = cArr2[i34];
                            }
                        }
                    }
                    challengeResultKt.getSDKReferenceNumber += 2;
                    i19 = i13;
                    f11 = 0.0f;
                }
            }
            for (int i36 = 0; i36 < i11; i36++) {
                cArr4[i36] = (char) (cArr4[i36] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 101
                byte[] r0 = atd.m.getDeviceData.C0011getDeviceData.$$a
                int r8 = 35 - r8
                int r1 = r6 + 2
                byte[] r1 = new byte[r1]
                int r6 = r6 + 1
                r2 = 0
                if (r0 != 0) goto L14
                r7 = r6
                r3 = r0
                r4 = r2
                r0 = r8
                goto L2b
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L22:
                r4 = r0[r8]
                int r3 = r3 + 1
                r5 = r0
                r0 = r8
                r8 = r4
                r4 = r3
                r3 = r5
            L2b:
                int r8 = -r8
                int r7 = r7 + r8
                int r8 = r0 + 1
                int r7 = r7 + (-2)
                r0 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.getDeviceData.C0011getDeviceData.b(short, byte, byte, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKReferenceNumber(android.content.Context r32, int r33, int r34, int r35) {
            /*
                Method dump skipped, instruction units count: 1462
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.getDeviceData.C0011getDeviceData.getSDKReferenceNumber(android.content.Context, int, int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{11, -110, -81, 44, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -3, 3, -3, 50};
            $$b = 235;
        }

        public static void init$1() {
            $$c = new byte[]{62, -80, -102, 31};
            $$d = 32;
        }

        public /* synthetic */ C0011getDeviceData(byte b8) {
            this();
        }
    }
}
