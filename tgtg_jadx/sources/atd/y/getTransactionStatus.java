package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/MuteStreamsAffected;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMuteStreamsAffected.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MuteStreamsAffected.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/MuteStreamsAffected\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class getTransactionStatus extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r7, short r8, short r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = 106 - r8
            byte[] r0 = atd.y.getTransactionStatus.$$a
            int r9 = r9 * 4
            int r9 = 4 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r5 = r2
            r0 = r9
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r9]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L29:
            int r8 = r8 + r9
            int r9 = r0 + 1
            r0 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.getTransactionStatus.$$d(short, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResultCancelled = 1;
        getDeviceData = 0;
        getSDKReferenceNumber = 1;
        getSDKAppID();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        SystemClock.currentThreadTimeMillis();
        SystemClock.currentThreadTimeMillis();
        new getSDKAppID((byte) 0);
        int i11 = ChallengeResultCancelled + 25;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private getTransactionStatus(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKAppID = getsdkreferencenumber;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(char r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.getTransactionStatus.b(char, int, int, java.lang.Object[]):void");
    }

    public static void getSDKAppID() {
        getSDKTransactionID = new char[]{4297, 30387, 56340, 9191, 35187, 61245, 30364, 56440, 9169, 35255, 61213, 30433, 56419, 8767, 35230, 61308, 30433, 56389, 8756, 35207, 61288, 62543, 37469, 14587, 50968};
        AuthenticationRequestParameters = 8568187838867739244L;
    }

    public static void init$0() {
        $$a = new byte[]{35, -37, -44, 56};
        $$b = BERTags.FLAGS;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        getDeviceData = (getSDKReferenceNumber + 41) % 128;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKAppID;
        Object[] objArr = new Object[1];
        b((char) (Process.getGidForName("") + 58539), 21 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ViewConfiguration.getEdgeSlop() >> 16, objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            getDeviceData = (getSDKReferenceNumber + 103) % 128;
            Integer sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKReferenceNumber(strAuthenticationRequestParameters);
            if (sDKReferenceNumber != null) {
                int i11 = getDeviceData + 15;
                getSDKReferenceNumber = i11 % 128;
                if (i11 % 2 != 0) {
                    return DeviceParameterResult.Success.IntValue.m150boximpl(DeviceParameterResult.Success.IntValue.m151constructorimpl(sDKReferenceNumber.intValue()));
                }
                DeviceParameterResult.Success.IntValue.m150boximpl(DeviceParameterResult.Success.IntValue.m151constructorimpl(sDKReferenceNumber.intValue()));
                throw null;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/MuteStreamsAffected$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static char[] getSDKAppID;
        private static long getSDKReferenceNumber;
        private static int getSDKTransactionID;

        private static String $$e(int i11, short s7, short s8) {
            byte[] bArr = $$c;
            int i12 = i11 * 4;
            int i13 = (s8 * 3) + 4;
            int i14 = 120 - s7;
            byte[] bArr2 = new byte[1 - i12];
            int i15 = 0 - i12;
            int i16 = -1;
            if (bArr == null) {
                i13++;
                i14 = i15 + i14;
            }
            while (true) {
                i16++;
                bArr2[i16] = (byte) i14;
                if (i16 == i15) {
                    return new String(bArr2, 0);
                }
                int i17 = bArr[i13];
                i13++;
                i14 += i17;
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            AuthenticationRequestParameters = 0;
            getSDKTransactionID = 1;
            getSDKAppID = new char[]{63421, 63467, 63469, 63415, 63260, 63264, 63272, 63264, 63289, 63295, 63294, 63286, 63257, 63237, 63265, 63288, 63294, 63233, 63257, 63254, 63482, 63484, 63485, 63241, 63238, 63482, 63484, 63244, 63275, 63295, 63265, 63268, 63270, 63264, 63268, 63270, 63265, 63271, 63265, 63265, 63264, 63471, 63309, 63288, 63265, 63274, 63289, 63323, 63317, 63313, 63318, 63320, 63306, 63266, 63291, 63268, 63288, 63315, 63318, 63326, 63309, 63279, 63295, 63323, 63317, 63313, 63318, 63320, 63306, 63266, 63292, 63289, 63423, 63447, 63469, 63459, 63465, 63459, 63460, 63465, 63467, 63464, 63464, 63448, 63446, 63465, 63467, 63465, 63464, 63483, 63468, 63240, 63479, 63477, 63245, 63478, 63246, 63443, 63479, 63477, 63483, 63473, 63481, 63422, 63464, 63465, 63467, 63465, 63448, 63444, 63461, 63461, 63463, 63464, 63462, 63460, 63487, 63459, 63465, 63430, 63431, 63462, 63457, 63486, 63459, 63462, 63486, 63454, 63424, 63457, 63426, 63408, 63447, 63258, 63146, 63140, 63140, 63112, 63135, 63139, 63147, 63139, 63164, 63138, 63137, 63161, 63132, 63111, 63147, 63140, 63164, 63134, 63351, 63131, 63140, 63164, 63137, 63144, 63144, 63145, 63149, 63141, 63139, 63130, 63132, 63149, 63140, 63166, 63167, 63162};
            getSDKReferenceNumber = -571292102839110883L;
        }

        private getSDKAppID() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 15
                int r0 = 26 - r6
                byte[] r1 = atd.y.getTransactionStatus.getSDKAppID.$$a
                int r7 = r7 * 6
                int r7 = 103 - r7
                int r8 = r8 * 25
                int r8 = 28 - r8
                byte[] r0 = new byte[r0]
                int r6 = 25 - r6
                r2 = 0
                if (r1 != 0) goto L19
                r4 = r6
                r7 = r8
                r3 = r2
                goto L30
            L19:
                r3 = r2
            L1a:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r8
                r8 = r7
                r7 = r5
            L30:
                int r4 = -r4
                int r8 = r8 + r4
                int r8 = r8 + (-5)
                r5 = r8
                r8 = r7
                r7 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.getTransactionStatus.getSDKAppID.a(int, int, int, java.lang.Object[]):void");
        }

        private static void b(int[] iArr, String str, boolean z11, Object[] objArr) throws Throwable {
            int i11;
            int i12;
            float f11;
            byte[] bArr;
            float f12;
            String str2 = str;
            $11 = ($10 + 27) % 128;
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
            byte[] bArr2 = (byte[]) bytes;
            atd.bb.ChallengeResultError challengeResultError = new atd.bb.ChallengeResultError();
            int i13 = 0;
            int i14 = iArr[0];
            int i15 = iArr[1];
            int i16 = iArr[2];
            int i17 = iArr[3];
            char[] cArr = getSDKAppID;
            Class cls = Integer.TYPE;
            float f13 = 0.0f;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i18 = 0;
                while (i18 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i18])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(754517312);
                        if (sDKTransactionID == null) {
                            f12 = f13;
                            bArr = bArr2;
                            byte b8 = (byte) i13;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2943 - (TypedValue.complexToFraction(i13, f13, f13) > f12 ? 1 : (TypedValue.complexToFraction(i13, f13, f13) == f12 ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 37 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -258931888, false, $$e(b8, (byte) (b8 | 13), b8), new Class[]{cls});
                        } else {
                            bArr = bArr2;
                            f12 = f13;
                        }
                        cArr2[i18] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i18++;
                        f13 = f12;
                        bArr2 = bArr;
                        i13 = 0;
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
            byte[] bArr3 = bArr2;
            float f14 = f13;
            char[] cArr3 = new char[i15];
            System.arraycopy(cArr, i14, cArr3, 0, i15);
            if (bArr3 != null) {
                char[] cArr4 = new char[i15];
                challengeResultError.AuthenticationRequestParameters = 0;
                char c3 = 0;
                while (true) {
                    int i19 = challengeResultError.AuthenticationRequestParameters;
                    if (i19 >= i15) {
                        break;
                    }
                    if (bArr3[i19] == 1) {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i19]), Integer.valueOf(c3)};
                        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(788825057);
                        if (sDKTransactionID2 == null) {
                            int iAlpha = Color.alpha(0) + 3095;
                            char c7 = (char) (14366 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            float f15 = f14;
                            int i21 = (TypedValue.complexToFraction(0, f15, f15) > f15 ? 1 : (TypedValue.complexToFraction(0, f15, f15) == f15 ? 0 : -1)) + 18;
                            byte b11 = (byte) 0;
                            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iAlpha, c7, i21, -210991631, false, $$e(b11, (byte) (b11 | 12), b11), new Class[]{cls, cls});
                        }
                        cArr4[i19] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    } else {
                        Object[] objArr4 = {Integer.valueOf(cArr3[i19]), Integer.valueOf(c3)};
                        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-565071239);
                        if (sDKTransactionID3 == null) {
                            byte b12 = (byte) 0;
                            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(2774 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (13059 - ((byte) KeyEvent.getModifierMetaStateMask())), (Process.myPid() >> 22) + 25, 37336169, false, $$e(b12, (byte) (b12 | 10), b12), new Class[]{cls, cls});
                        }
                        cArr4[i19] = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
                    }
                    c3 = cArr4[challengeResultError.AuthenticationRequestParameters];
                    Object[] objArr5 = {challengeResultError, challengeResultError};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(2107237619);
                    if (sDKTransactionID4 == null) {
                        f11 = 0.0f;
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getLongPressTimeout() >> 16) + 2278, (char) (65522 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 33 - ImageFormat.getBitsPerPixel(0), -1577983261, false, "m", new Class[]{Object.class, Object.class});
                    } else {
                        f11 = 0.0f;
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                    $10 = ($11 + 117) % 128;
                    f14 = f11;
                }
                cArr3 = cArr4;
            }
            if (i17 > 0) {
                char[] cArr5 = new char[i15];
                i11 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i15);
                int i22 = i15 - i17;
                System.arraycopy(cArr5, 0, cArr3, i22, i17);
                System.arraycopy(cArr5, i17, cArr3, 0, i22);
            } else {
                i11 = 0;
            }
            if (z11) {
                $11 = ($10 + 73) % 128;
                char[] cArr6 = new char[i15];
                challengeResultError.AuthenticationRequestParameters = i11;
                while (true) {
                    int i23 = challengeResultError.AuthenticationRequestParameters;
                    if (i23 >= i15) {
                        break;
                    }
                    cArr6[i23] = cArr3[(i15 - i23) - 1];
                    challengeResultError.AuthenticationRequestParameters = i23 + 1;
                }
                cArr3 = cArr6;
            }
            if (i16 > 0) {
                challengeResultError.AuthenticationRequestParameters = 0;
                while (true) {
                    int i24 = challengeResultError.AuthenticationRequestParameters;
                    if (i24 >= i15) {
                        break;
                    }
                    int i25 = $10 + 87;
                    $11 = i25 % 128;
                    if (i25 % 2 == 0) {
                        cArr3[i24] = (char) (cArr3[i24] >> iArr[4]);
                        i12 = i24 / 0;
                    } else {
                        cArr3[i24] = (char) (cArr3[i24] - iArr[2]);
                        i12 = i24 + 1;
                    }
                    challengeResultError.AuthenticationRequestParameters = i12;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(java.lang.String r19, int r20, java.lang.Object[] r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.getTransactionStatus.getSDKAppID.c(java.lang.String, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v16 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getDeviceData(android.content.Context r21, int r22, int r23) {
            /*
                Method dump skipped, instruction units count: 1130
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.getTransactionStatus.getSDKAppID.getDeviceData(android.content.Context, int, int):java.lang.Object[]");
        }

        public static void getSDKReferenceNumber(long j9, long j11) throws Throwable {
            int i11 = getSDKTransactionID + 59;
            AuthenticationRequestParameters = i11 % 128;
            if (i11 % 2 != 0) {
                byte b8 = $$a[28];
                byte b11 = (byte) (b8 + 1);
                Object[] objArr = new Object[1];
                a(b8, b11, b11, objArr);
                Class.forName((String) objArr[0]).getField("AuthenticationRequestParameters").get(null);
                int i12 = 77 / 0;
            } else {
                byte b12 = $$a[28];
                byte b13 = (byte) (b12 + 1);
                Object[] objArr2 = new Object[1];
                a(b12, b13, b13, objArr2);
                a0.B(null, (String) objArr2[0], "AuthenticationRequestParameters");
            }
            getSDKTransactionID = (AuthenticationRequestParameters + 29) % 128;
            try {
                byte[] bArr = $$a;
                byte b14 = bArr[28];
                byte b15 = (byte) (b14 + 1);
                Object[] objArr3 = new Object[1];
                a(b14, b15, b15, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b16 = (byte) ($$b & 5);
                byte b17 = bArr[28];
                Object[] objArr4 = new Object[1];
                a(b16, b17, b17, objArr4);
                Method method = cls.getMethod((String) objArr4[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr5 = {atd.as.getDeviceData.class.getField("getSDKTransactionID").get(null)};
                Object[] objArr6 = new Object[1];
                b(new int[]{0, 3, 0, 2}, "\u0000\u0000\u0001", false, objArr6);
                Method method2 = Set.class.getMethod(((String) objArr6[0]).intern(), Object.class);
                method2.setAccessible(true);
                int i13 = getSDKTransactionID + 87;
                AuthenticationRequestParameters = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
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
            $$a = new byte[]{68, 54, 110, -60, -24, 11, 49, -56, -22, 63, -62, -3, -20, 28, 10, -12, -14, -35, 12, -18, -10, 13, -7, -22, 6, -11, -4, 32, 0, -3, -20, 28, 10, -12, 5, -52, -5, 34, 0};
            $$b = 139;
        }

        public static void init$1() {
            $$c = new byte[]{77, 37, -113, 18};
            $$d = 205;
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ getTransactionStatus(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
