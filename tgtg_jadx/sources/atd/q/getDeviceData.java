package atd.q;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.as.BuildConfig;
import atd.bb.ChallengeResultKt;
import atd.e.ChallengeResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/GetInstalledApplications;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData extends DeviceParameter {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData = 1;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int[] getSDKTransactionID;

    static {
        AuthenticationRequestParameters();
        ViewConfiguration.getJumpTapTimeout();
        new C0012getDeviceData((byte) 0);
        getDeviceData = (getSDKReferenceNumber + 5) % 128;
    }

    public static void AuthenticationRequestParameters() {
        getSDKTransactionID = new int[]{-2012951162, 1071186526, 1429042644, -1941124785, -1327358640, 62046487, 50184374, 1247072641, 365023127, 130613051, 1224014177, 1180229577, 1427406733, -135208525, 1780972154, 1598834610, -1709694687, 394683387};
    }

    @NotNull
    private static DeviceParameterResult.Failure getSDKTransactionID() {
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.RESTRICTED);
        getSDKAppID = (AuthenticationRequestParameters + 45) % 128;
        return failure;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        AuthenticationRequestParameters = (getSDKAppID + 99) % 128;
        DeviceParameterResult.Failure sDKTransactionID = getSDKTransactionID();
        getSDKAppID = (AuthenticationRequestParameters + 11) % 128;
        return sDKTransactionID;
    }

    /* JADX INFO: renamed from: atd.q.getDeviceData$getDeviceData, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/GetInstalledApplications$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0012getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static char getDeviceData;
        private static char[] getSDKAppID;
        private static int getSDKReferenceNumber;
        private static int getSDKTransactionID;

        private static String $$e(int i11, byte b8, int i12) {
            byte[] bArr = $$c;
            int i13 = i12 + 65;
            int i14 = 4 - (i11 * 4);
            int i15 = b8 * 3;
            byte[] bArr2 = new byte[i15 + 1];
            int i16 = -1;
            if (bArr == null) {
                i13 = i14 + (-i15);
                i14++;
            }
            while (true) {
                i16++;
                bArr2[i16] = (byte) i13;
                if (i16 == i15) {
                    return new String(bArr2, 0);
                }
                int i17 = i13;
                int i18 = i14 + 1;
                i13 = i17 + (-bArr[i14]);
                i14 = i18;
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getSDKReferenceNumber = 1;
            getSDKAppID = new char[]{19805, 30887, 30882, 19806};
            getDeviceData = (char) 19806;
        }

        private C0012getDeviceData() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 6
                int r6 = r6 + 97
                int r7 = r7 * 15
                int r0 = 26 - r7
                int r8 = r8 * 25
                int r8 = 29 - r8
                byte[] r1 = atd.q.getDeviceData.C0012getDeviceData.$$a
                byte[] r0 = new byte[r0]
                int r7 = 25 - r7
                r2 = 0
                if (r1 != 0) goto L1a
                r3 = r1
                r4 = r2
                r1 = r8
                r8 = r7
                goto L32
            L1a:
                r3 = r2
            L1b:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L28:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r5
            L32:
                int r6 = -r6
                int r8 = r8 + r6
                int r6 = r8 + (-5)
                int r8 = r1 + 1
                r1 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.q.getDeviceData.C0012getDeviceData.a(short, short, int, java.lang.Object[]):void");
        }

        private static void b(String str, int i11, byte b8, Object[] objArr) throws Throwable {
            int i12;
            int i13;
            int i14;
            char c3;
            char c7;
            char c8;
            int i15;
            char c11;
            char[] charArray = str != null ? str.toCharArray() : str;
            ChallengeResultKt challengeResultKt = new ChallengeResultKt();
            char[] cArr = getSDKAppID;
            Class cls = Integer.TYPE;
            int i16 = -317146529;
            char c12 = '0';
            int i17 = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                $10 = ($11 + 61) % 128;
                int i18 = 0;
                while (i18 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i18])};
                        Object sDKTransactionID = ChallengeResult.getSDKTransactionID(i16);
                        if (sDKTransactionID == null) {
                            int iArgb = 2158 - Color.argb(i17, i17, i17, i17);
                            char absoluteGravity = (char) Gravity.getAbsoluteGravity(i17, i17);
                            int iIndexOf = 35 - TextUtils.indexOf("", c12, i17);
                            i15 = i16;
                            byte b11 = (byte) i17;
                            c11 = c12;
                            byte b12 = b11;
                            sDKTransactionID = ChallengeResult.getDeviceData(iArgb, absoluteGravity, iIndexOf, 829471823, false, $$e(b11, b12, b12), new Class[]{cls});
                        } else {
                            i15 = i16;
                            c11 = c12;
                        }
                        cArr2[i18] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i18++;
                        i16 = i15;
                        c12 = c11;
                        i17 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            int i19 = i16;
            char c13 = c12;
            Object[] objArr3 = {Integer.valueOf(getDeviceData)};
            Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(i19);
            if (sDKTransactionID2 == null) {
                byte b13 = (byte) 0;
                byte b14 = b13;
                sDKTransactionID2 = ChallengeResult.getDeviceData(2158 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 'T' - AndroidCharacter.getMirror(c13), 829471823, false, $$e(b13, b14, b14), new Class[]{cls});
            }
            char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i11];
            int i21 = 2;
            if (i11 % 2 != 0) {
                int i22 = $10 + 107;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    i12 = i11 + 127;
                    cArr3[i12] = (char) (charArray[i12] - b8);
                } else {
                    i12 = i11 - 1;
                    cArr3[i12] = (char) (charArray[i12] - b8);
                }
            } else {
                i12 = i11;
            }
            int i23 = 1;
            if (i12 > 1) {
                challengeResultKt.getSDKReferenceNumber = 0;
                while (true) {
                    int i24 = challengeResultKt.getSDKReferenceNumber;
                    if (i24 >= i12) {
                        break;
                    }
                    char c14 = charArray[i24];
                    challengeResultKt.getDeviceData = c14;
                    char c15 = charArray[i24 + 1];
                    challengeResultKt.getSDKAppID = c15;
                    if (c14 == c15) {
                        int i25 = $11 + 9;
                        $10 = i25 % 128;
                        if (i25 % i21 != 0) {
                            cArr3[i24] = (char) (c14 >>> b8);
                            cArr3[i24 + 1] = (char) (c15 + b8);
                        } else {
                            cArr3[i24] = (char) (c14 - b8);
                            cArr3[i24 + 1] = (char) (c15 - b8);
                        }
                        i13 = i21;
                        i14 = i23;
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
                        objArr4[i21] = Integer.valueOf(cCharValue);
                        objArr4[i23] = challengeResultKt;
                        i13 = i21;
                        objArr4[0] = challengeResultKt;
                        Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(835518319);
                        if (sDKTransactionID3 == null) {
                            c3 = '\n';
                            int mirror = 1306 - AndroidCharacter.getMirror(c13);
                            c7 = '\t';
                            char cResolveSize = (char) (View.resolveSize(0, 0) + 34414);
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 41;
                            c8 = 7;
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            i14 = i23;
                            String str$$e = $$e(b15, b16, (byte) (b16 + 2));
                            Class cls2 = Integer.TYPE;
                            sDKTransactionID3 = ChallengeResult.getDeviceData(mirror, cResolveSize, packedPositionType, -307955329, false, str$$e, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                        } else {
                            i14 = i23;
                            c3 = '\n';
                            c7 = '\t';
                            c8 = 7;
                        }
                        int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                        int i26 = challengeResultKt.ChallengeResultCancelled;
                        if (iIntValue == i26) {
                            Object[] objArr5 = new Object[11];
                            objArr5[c3] = challengeResultKt;
                            objArr5[c7] = Integer.valueOf(cCharValue);
                            objArr5[8] = challengeResultKt;
                            objArr5[c8] = Integer.valueOf(cCharValue);
                            objArr5[6] = Integer.valueOf(cCharValue);
                            objArr5[5] = challengeResultKt;
                            objArr5[4] = challengeResultKt;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[i13] = Integer.valueOf(cCharValue);
                            objArr5[i14] = challengeResultKt;
                            objArr5[0] = challengeResultKt;
                            Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(-758961112);
                            if (sDKTransactionID4 == null) {
                                int offsetBefore = 2223 - TextUtils.getOffsetBefore("", 0);
                                char cIndexOf = (char) (53070 - TextUtils.indexOf("", ""));
                                int fadingEdgeLength = 21 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                byte b17 = (byte) 0;
                                byte b18 = b17;
                                String str$$e2 = $$e(b17, b18, (byte) (b18 | 57));
                                Class cls3 = Integer.TYPE;
                                sDKTransactionID4 = ChallengeResult.getDeviceData(offsetBefore, cIndexOf, fadingEdgeLength, 246098488, false, str$$e2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                            int i27 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                            int i28 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i28] = cArr[iIntValue2];
                            cArr3[i28 + 1] = cArr[i27];
                        } else {
                            int i29 = challengeResultKt.AuthenticationRequestParameters;
                            int i31 = challengeResultKt.getSDKTransactionID;
                            if (i29 == i31) {
                                $11 = ($10 + 65) % 128;
                                int i32 = i14;
                                int iC = k.c(challengeResultKt.getMessageVersion, cCharValue, i32, cCharValue);
                                challengeResultKt.getMessageVersion = iC;
                                int iC2 = k.c(i26, cCharValue, i32, cCharValue);
                                challengeResultKt.ChallengeResultCancelled = iC2;
                                int i33 = (i31 * cCharValue) + iC2;
                                int i34 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i34] = cArr[(i29 * cCharValue) + iC];
                                cArr3[i34 + i32] = cArr[i33];
                                i14 = 1;
                            } else {
                                int i35 = (i29 * cCharValue) + i26;
                                int i36 = (i31 * cCharValue) + challengeResultKt.getMessageVersion;
                                int i37 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i37] = cArr[i35];
                                i14 = 1;
                                cArr3[i37 + 1] = cArr[i36];
                            }
                        }
                    }
                    challengeResultKt.getSDKReferenceNumber += 2;
                    i21 = i13;
                    i23 = i14;
                }
            }
            int i38 = 0;
            while (i38 < i11) {
                int i39 = $11 + 91;
                $10 = i39 % 128;
                if (i39 % 2 != 0) {
                    cArr3[i38] = (char) (cArr3[i38] ^ 8094);
                    i38 += 17;
                } else {
                    cArr3[i38] = (char) (cArr3[i38] ^ 13722);
                    i38++;
                }
            }
            objArr[0] = new String(cArr3);
        }

        public static void getSDKAppID(long j9, long j11) throws Throwable {
            int i11 = getSDKTransactionID + 91;
            getSDKReferenceNumber = i11 % 128;
            if (i11 % 2 == 0) {
                byte b8 = $$a[28];
                byte b11 = b8;
                Object[] objArr = new Object[1];
                a(b8, b11, (byte) (b11 + 1), objArr);
                Class.forName((String) objArr[0]).getField("AuthenticationRequestParameters").get(null);
                int i12 = 29 / 0;
            } else {
                byte b12 = $$a[28];
                byte b13 = b12;
                Object[] objArr2 = new Object[1];
                a(b12, b13, (byte) (b13 + 1), objArr2);
                a0.B(null, (String) objArr2[0], "AuthenticationRequestParameters");
            }
            try {
                byte[] bArr = $$a;
                byte b14 = bArr[28];
                byte b15 = b14;
                Object[] objArr3 = new Object[1];
                a(b14, b15, (byte) (b15 + 1), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b16 = bArr[28];
                byte b17 = (byte) (b16 + 1);
                Object[] objArr4 = new Object[1];
                a(b17, b17, b16, objArr4);
                Method method = cls.getMethod((String) objArr4[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr5 = {BuildConfig.class.getField("getDeviceData").get(null)};
                Object[] objArr6 = new Object[1];
                b("\u0000\u0003㙅", Color.red(0) + 3, (byte) (View.MeasureSpec.getSize(0) + 71), objArr6);
                Method method2 = Set.class.getMethod(((String) objArr6[0]).intern(), Object.class);
                method2.setAccessible(true);
                int i13 = getSDKReferenceNumber + 17;
                getSDKTransactionID = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 91 / 0;
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        public static void init$0() {
            $$a = new byte[]{26, -110, -23, -5, -24, 11, 49, -56, -22, 63, -62, -3, -20, 28, 10, -12, -14, -35, 12, -18, -10, 13, -7, -22, 6, -11, -4, 32, 0, -3, -20, 28, 10, -12, 5, -52, -5, 34, 0};
            $$b = 80;
        }

        public static void init$1() {
            $$c = new byte[]{118, -50, -83, 89};
            $$d = 125;
        }

        public /* synthetic */ C0012getDeviceData(byte b8) {
            this();
        }
    }
}
