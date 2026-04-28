package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/SecureFrpMode;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "secureSettings", "globalSettings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSecureFrpMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecureFrpMode.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/SecureFrpMode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
public final class ChallengeResultError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static short[] BuildConfig;
    private static byte[] ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int ChallengeResultError;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r6, byte r7, int r8) {
        /*
            byte[] r0 = atd.x.ChallengeResultError.$$a
            int r6 = r6 * 4
            int r6 = r6 + 101
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r8 = r8 + r4
            int r6 = r6 + 1
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultError.$$d(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResultError = 1;
        getMessageVersion = 0;
        ChallengeResultCancelled = 1;
        getSDKTransactionID();
        View.getDefaultSize(0, 0);
        Color.rgb(0, 0, 0);
        KeyEvent.normalizeMetaState(0);
        ViewConfiguration.getFadingEdgeLength();
        TextUtils.indexOf("", "", 0, 0);
        new getSDKTransactionID((byte) 0);
        ChallengeResultError = (getSDKEphemeralPublicKey + 9) % 128;
    }

    private ChallengeResultError(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber2) {
        application.getClass();
        getsdkreferencenumber.getClass();
        getsdkreferencenumber2.getClass();
        this.getSDKReferenceNumber = getsdkreferencenumber;
        this.getDeviceData = getsdkreferencenumber2;
    }

    private static void b(byte b8, int i11, int i12, short s7, int i13, Object[] objArr) throws Throwable {
        int i14;
        long j9;
        int i15;
        int i16;
        long j11;
        int i17;
        int i18;
        int i19;
        atd.bb.getTransactionStatus gettransactionstatus = new atd.bb.getTransactionStatus();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i21 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getSDKTransactionID)};
            int i22 = 0;
            Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-217286249);
            Class cls = Integer.TYPE;
            if (sDKTransactionID == null) {
                i14 = -217286249;
                byte b11 = (byte) 0;
                j9 = 0;
                byte b12 = b11;
                sDKTransactionID = atd.e.ChallengeResult.getDeviceData(1226 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 33 - View.MeasureSpec.getSize(0), 795115399, false, $$d(b11, b12, b12), new Class[]{cls, cls});
            } else {
                i14 = -217286249;
                j9 = 0;
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                $10 = ($11 + 121) % 128;
                i15 = 1;
            } else {
                i15 = 0;
            }
            if (i15 != 0) {
                $10 = ($11 + 87) % 128;
                byte[] bArr = ChallengeResult;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i23 = 0;
                    j11 = 20070962823959587L;
                    while (i23 < length) {
                        int i24 = $11 + 89;
                        int i25 = i21;
                        $10 = i24 % 128;
                        if (i24 % 2 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i23])};
                            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1659653064);
                            if (sDKTransactionID2 == null) {
                                i19 = i22;
                                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3316 - (TypedValue.complexToFloat(i22) > 0.0f ? 1 : (TypedValue.complexToFloat(i22) == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(j9), (SystemClock.elapsedRealtime() > j9 ? 1 : (SystemClock.elapsedRealtime() == j9 ? 0 : -1)) + 32, -1098625576, false, "f", new Class[]{cls});
                            } else {
                                i19 = i22;
                            }
                            bArr2[i23] = ((Byte) ((Method) sDKTransactionID2).invoke(null, objArr3)).byteValue();
                        } else {
                            i19 = i22;
                            Object[] objArr4 = {Integer.valueOf(bArr[i23])};
                            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1659653064);
                            if (sDKTransactionID3 == null) {
                                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getDoubleTapTimeout() >> 16) + 3316, (char) ('0' - AndroidCharacter.getMirror('0')), (ViewConfiguration.getScrollBarSize() >> 8) + 33, -1098625576, false, "f", new Class[]{cls});
                            }
                            bArr2[i23] = ((Byte) ((Method) sDKTransactionID3).invoke(null, objArr4)).byteValue();
                            i23++;
                        }
                        i21 = i25;
                        i22 = i19;
                    }
                    bArr = bArr2;
                } else {
                    j11 = 20070962823959587L;
                }
                i16 = i21;
                int i26 = i22;
                if (bArr != null) {
                    byte[] bArr3 = ChallengeResult;
                    Object[] objArr5 = new Object[2];
                    objArr5[i16] = Integer.valueOf(getSDKAppID);
                    objArr5[i26] = Integer.valueOf(i12);
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(i14);
                    if (sDKTransactionID4 == null) {
                        byte b13 = (byte) i26;
                        byte b14 = b13;
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(1226 - (SystemClock.elapsedRealtime() > j9 ? 1 : (SystemClock.elapsedRealtime() == j9 ? 0 : -1)), (char) KeyEvent.normalizeMetaState(i26), TextUtils.indexOf((CharSequence) "", '0', i26) + 34, 795115399, false, $$d(b13, b14, b14), new Class[]{cls, cls});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue()]) ^ j11)) + ((int) (((long) getSDKTransactionID) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) BuildConfig[i12 + ((int) (((long) getSDKAppID) ^ j11))]) ^ j11)) + ((int) (((long) getSDKTransactionID) ^ j11)));
                }
            } else {
                i16 = 1;
                j11 = 20070962823959587L;
            }
            if (iIntValue > 0) {
                gettransactionstatus.getDeviceData = ((i12 + iIntValue) - 2) + ((int) (((long) getSDKAppID) ^ j11)) + i15;
                int i27 = AuthenticationRequestParameters;
                Object[] objArr6 = new Object[4];
                objArr6[3] = sb2;
                objArr6[2] = Integer.valueOf(i27);
                objArr6[i16] = Integer.valueOf(i13);
                objArr6[0] = gettransactionstatus;
                Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(-488867474);
                if (sDKTransactionID5 == null) {
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(j9) + 2159;
                    char mode = (char) View.MeasureSpec.getMode(0);
                    int edgeSlop = 36 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte b15 = (byte) ($$b & 1);
                    byte b16 = (byte) (b15 - 1);
                    sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(packedPositionChild, mode, edgeSlop, 1052016510, false, $$d(b15, b16, b16), new Class[]{Object.class, cls, cls, Object.class});
                }
                ((StringBuilder) ((Method) sDKTransactionID5).invoke(null, objArr6)).append(gettransactionstatus.getSDKAppID);
                gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                byte[] bArr4 = ChallengeResult;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i28 = 0; i28 < length2; i28++) {
                        bArr5[i28] = (byte) (((long) bArr4[i28]) ^ j11);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    i17 = i16;
                    i18 = i17;
                } else {
                    i17 = i16;
                    i18 = 0;
                }
                while (true) {
                    gettransactionstatus.AuthenticationRequestParameters = i17;
                    if (gettransactionstatus.AuthenticationRequestParameters >= iIntValue) {
                        break;
                    }
                    int i29 = gettransactionstatus.getDeviceData;
                    if (i18 != 0) {
                        byte[] bArr6 = ChallengeResult;
                        gettransactionstatus.getDeviceData = i29 - 1;
                        gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((byte) (((byte) (((long) bArr6[i29]) ^ j11)) + s7)) ^ b8));
                    } else {
                        short[] sArr = BuildConfig;
                        gettransactionstatus.getDeviceData = i29 - 1;
                        gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((short) (((short) (((long) sArr[i29]) ^ j11)) + s7)) ^ b8));
                        $10 = ($11 + 95) % 128;
                    }
                    sb2.append(gettransactionstatus.getSDKAppID);
                    gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                    i17 = gettransactionstatus.AuthenticationRequestParameters + 1;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void getSDKTransactionID() {
        getSDKAppID = -211942149;
        getSDKTransactionID = 829166691;
        AuthenticationRequestParameters = -1028822554;
        ChallengeResult = new byte[]{120, -116, 123, 119, -106, -121, 117, 126, -125, -118, -124, 107, -121, -117, 85, -83, 89, 35, 35};
    }

    public static void init$0() {
        $$a = new byte[]{26, -110, -23, -5};
        $$b = 31;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        if (r0 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        if (r0 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        r2 = atd.x.ChallengeResultError.ChallengeResultCancelled + 41;
        atd.x.ChallengeResultError.getMessageVersion = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if ((r2 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        return w.a0.h(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m129boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m130constructorimpl(r0.booleanValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        throw null;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultError.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/SecureFrpMode$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int getDeviceData;
        private static int getSDKAppID;
        private static char[] getSDKReferenceNumber;
        private static char getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(int r6, short r7, byte r8) {
            /*
                int r6 = r6 + 65
                int r7 = r7 * 3
                int r7 = 3 - r7
                byte[] r0 = atd.x.ChallengeResultError.getSDKTransactionID.$$c
                int r8 = r8 * 2
                int r8 = 1 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r8) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L22:
                int r7 = r7 + 1
                r3 = r0[r7]
            L26:
                int r6 = r6 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultError.getSDKTransactionID.$$e(int, short, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            getSDKAppID = 1;
            getSDKReferenceNumber = new char[]{30895, 30882, 30885, 31577, 30899, 31582, 31581, 30897, 30911, 31578, 31583, 30902, 30890, 30901, 30880, 30967, 30886, 30873, 30848, 30887, 30893, 30898, 30884, 30889, 31580, 30952, 31576, 30883, 30850, 30891, 30881, 30953, 30888, 31579, 30900, 30853};
            getSDKTransactionID = (char) 19802;
        }

        private getSDKTransactionID() {
        }

        private static void a(String str, int i11, byte b8, Object[] objArr) throws Throwable {
            int i12;
            int i13;
            char c3;
            char c7;
            char c8;
            int i14;
            int i15;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
            char[] cArr = getSDKReferenceNumber;
            Class cls = Integer.TYPE;
            char c11 = '0';
            int i16 = -317146529;
            int i17 = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i18 = 0;
                while (i18 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i18])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i16);
                        if (sDKTransactionID == null) {
                            i14 = i16;
                            byte b11 = (byte) i17;
                            byte b12 = b11;
                            i15 = i17;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(TextUtils.lastIndexOf("", c11) + 2159, (char) (Process.getGidForName("") + 1), 35 - ((byte) KeyEvent.getModifierMetaStateMask()), 829471823, false, $$e(b11, b12, b12), new Class[]{cls});
                        } else {
                            i14 = i16;
                            i15 = i17;
                        }
                        cArr2[i18] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i18++;
                        i16 = i14;
                        i17 = i15;
                        c11 = '0';
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
            int i21 = i17;
            Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i19);
            if (sDKTransactionID2 == null) {
                byte b13 = (byte) i21;
                byte b14 = b13;
                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2158 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(i21) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i21) == 0L ? 0 : -1)) + 36, 829471823, false, $$e(b13, b14, b14), new Class[]{cls});
            }
            char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i11];
            int i22 = 2;
            if (i11 % 2 != 0) {
                int i23 = $10 + 41;
                $11 = i23 % 128;
                if (i23 % 2 == 0) {
                    i12 = i11 + 41;
                    cArr3[i12] = (char) (charArray[i12] / b8);
                } else {
                    i12 = i11 - 1;
                    cArr3[i12] = (char) (charArray[i12] - b8);
                }
            } else {
                i12 = i11;
            }
            if (i12 > 1) {
                challengeResultKt.getSDKReferenceNumber = 0;
                while (true) {
                    int i24 = challengeResultKt.getSDKReferenceNumber;
                    if (i24 >= i12) {
                        break;
                    }
                    char c12 = charArray[i24];
                    challengeResultKt.getDeviceData = c12;
                    char c13 = charArray[i24 + 1];
                    challengeResultKt.getSDKAppID = c13;
                    if (c12 == c13) {
                        $10 = ($11 + 89) % 128;
                        cArr3[i24] = (char) (c12 - b8);
                        cArr3[i24 + 1] = (char) (c13 - b8);
                        i13 = i22;
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
                        objArr4[i22] = Integer.valueOf(cCharValue);
                        objArr4[1] = challengeResultKt;
                        objArr4[0] = challengeResultKt;
                        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                        if (sDKTransactionID3 == null) {
                            c3 = '\t';
                            c7 = 7;
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1259;
                            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 34414);
                            int capsMode = 41 - TextUtils.getCapsMode("", 0, 0);
                            byte b15 = (byte) i22;
                            i13 = i22;
                            byte b16 = (byte) (b15 - 2);
                            c8 = '\b';
                            String str$$e = $$e(b15, b16, b16);
                            Class cls2 = Integer.TYPE;
                            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iIndexOf, fadingEdgeLength, capsMode, -307955329, false, str$$e, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                        } else {
                            i13 = i22;
                            c3 = '\t';
                            c7 = 7;
                            c8 = '\b';
                        }
                        int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                        int i25 = challengeResultKt.ChallengeResultCancelled;
                        if (iIntValue == i25) {
                            $10 = ($11 + 27) % 128;
                            Object[] objArr5 = new Object[11];
                            objArr5[10] = challengeResultKt;
                            objArr5[c3] = Integer.valueOf(cCharValue);
                            objArr5[c8] = challengeResultKt;
                            objArr5[c7] = Integer.valueOf(cCharValue);
                            objArr5[6] = Integer.valueOf(cCharValue);
                            objArr5[5] = challengeResultKt;
                            objArr5[4] = challengeResultKt;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[i13] = Integer.valueOf(cCharValue);
                            objArr5[1] = challengeResultKt;
                            objArr5[0] = challengeResultKt;
                            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                            if (sDKTransactionID4 == null) {
                                int fadingEdgeLength2 = 2223 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                char c14 = (char) (53071 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                int iAxisFromString = MotionEvent.axisFromString("") + 22;
                                byte b17 = (byte) 0;
                                String str$$e2 = $$e((byte) 57, b17, b17);
                                Class cls3 = Integer.TYPE;
                                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(fadingEdgeLength2, c14, iAxisFromString, 246098488, false, str$$e2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                            int i26 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                            int i27 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i27] = cArr[iIntValue2];
                            cArr3[i27 + 1] = cArr[i26];
                        } else {
                            int i28 = challengeResultKt.AuthenticationRequestParameters;
                            int i29 = challengeResultKt.getSDKTransactionID;
                            int i31 = challengeResultKt.getMessageVersion;
                            if (i28 == i29) {
                                int iC = k.c(i31, cCharValue, 1, cCharValue);
                                challengeResultKt.getMessageVersion = iC;
                                int iC2 = k.c(i25, cCharValue, 1, cCharValue);
                                challengeResultKt.ChallengeResultCancelled = iC2;
                                int i32 = (i29 * cCharValue) + iC2;
                                int i33 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i33] = cArr[(i28 * cCharValue) + iC];
                                cArr3[i33 + 1] = cArr[i32];
                            } else {
                                int i34 = (i28 * cCharValue) + i25;
                                int i35 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i35] = cArr[i34];
                                cArr3[i35 + 1] = cArr[(i29 * cCharValue) + i31];
                            }
                            challengeResultKt.getSDKReferenceNumber += 2;
                            i22 = i13;
                        }
                    }
                    challengeResultKt.getSDKReferenceNumber += 2;
                    i22 = i13;
                }
            }
            $11 = ($10 + 117) % 128;
            for (int i36 = 0; i36 < i11; i36++) {
                cArr3[i36] = (char) (cArr3[i36] ^ 13722);
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0035). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.x.ChallengeResultError.getSDKTransactionID.$$a
                int r6 = r6 * 4
                int r6 = 3 - r6
                int r7 = r7 * 3
                int r1 = r7 + 4
                int r8 = r8 * 4
                int r8 = 104 - r8
                byte[] r1 = new byte[r1]
                int r7 = r7 + 3
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r0
                r4 = r2
                r0 = r6
                goto L35
            L19:
                r3 = r8
                r8 = r6
                r6 = r3
                r3 = r2
            L1d:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r8 = r8 + 1
                if (r3 != r7) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2c:
                r4 = r0[r8]
                int r3 = r3 + 1
                r5 = r0
                r0 = r8
                r8 = r4
                r4 = r3
                r3 = r5
            L35:
                int r8 = -r8
                int r6 = r6 + r8
                int r6 = r6 + (-2)
                r8 = r0
                r0 = r3
                r3 = r4
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultError.getSDKTransactionID.b(int, int, short, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKTransactionID(int r33, int r34) {
            /*
                Method dump skipped, instruction units count: 1315
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultError.getSDKTransactionID.getSDKTransactionID(int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{89, 27, 126, -16, -3, 3, -3};
            $$b = 43;
        }

        public static void init$1() {
            $$c = new byte[]{62, -80, -102, 31};
            $$d = 204;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResultError(Application application) {
        this(application, new atd.t.getSDKTransactionID(application), new atd.t.getSDKAppID(application));
    }
}
