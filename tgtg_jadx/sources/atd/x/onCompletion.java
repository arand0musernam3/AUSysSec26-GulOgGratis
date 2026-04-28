package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultSynth;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTtsDefaultSynth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TtsDefaultSynth.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultSynth\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class onCompletion extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static char[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, int r7, int r8) {
        /*
            int r8 = 122 - r8
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = atd.x.onCompletion.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.onCompletion.$$d(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResult = 1;
        getSDKTransactionID = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters();
        TextUtils.lastIndexOf("", '0', 0);
        ViewConfiguration.getScrollFriction();
        new getDeviceData((byte) 0);
        BuildConfig = (ChallengeResult + 7) % 128;
    }

    private onCompletion(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{30899, 30880, 30901, 30974, 30898, 30873, 30887, 30855, 30964, 30966, 30882, 30911, 30890, 30883, 30894, 30888};
        AuthenticationRequestParameters = (char) 19800;
    }

    private static void b(int i11, byte b8, String str, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char c3;
        char c7;
        char c8;
        int length;
        char[] cArr;
        int i14;
        int i15;
        char c11;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
        char[] cArr2 = getSDKAppID;
        Class cls = Integer.TYPE;
        int i16 = -317146529;
        char c12 = 2;
        int i17 = 1;
        if (cArr2 != null) {
            int i18 = $10 + 103;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i14 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i14 = 0;
            }
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i14])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i16);
                    if (sDKTransactionID == null) {
                        byte b11 = (byte) 0;
                        i15 = i16;
                        byte b12 = (byte) (b11 - 1);
                        c11 = c12;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(Color.rgb(0, 0, 0) + 16779374, (char) (Process.myTid() >> 22), View.combineMeasuredStates(0, 0) + 36, 829471823, false, $$d(b11, b12, (byte) (b12 & 57)), new Class[]{cls});
                    } else {
                        i15 = i16;
                        c11 = c12;
                    }
                    cArr[i14] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i14++;
                    i16 = i15;
                    c12 = c11;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        int i19 = i16;
        char c13 = c12;
        Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i19);
        if (sDKTransactionID2 == null) {
            byte b13 = (byte) 0;
            byte b14 = (byte) (b13 - 1);
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2158, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 37 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 829471823, false, $$d(b13, b14, (byte) (b14 & 57)), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i11];
        if (i11 % 2 != 0) {
            int i21 = $11 + 41;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                i12 = i11 + 22;
                cArr3[i12] = (char) (charArray[i12] >>> b8);
            } else {
                i12 = i11 - 1;
                cArr3[i12] = (char) (charArray[i12] - b8);
            }
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            int i22 = $11 + 21;
            $10 = i22 % 128;
            int i23 = i22 % 2;
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
                    $10 = ($11 + 97) % 128;
                    cArr3[i24] = (char) (c14 - b8);
                    cArr3[i24 + 1] = (char) (c15 - b8);
                    i13 = i17;
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
                    objArr4[c13] = Integer.valueOf(cCharValue);
                    objArr4[i17] = challengeResultKt;
                    objArr4[0] = challengeResultKt;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID3 == null) {
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1258;
                        c3 = '\n';
                        char cAlpha = (char) (Color.alpha(0) + 34414);
                        int doubleTapTimeout = 41 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        c7 = '\t';
                        byte b15 = (byte) 0;
                        c8 = 7;
                        byte b16 = (byte) (b15 - 1);
                        i13 = i17;
                        String str$$d = $$d(b15, b16, (byte) (b16 & 55));
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iResolveSizeAndState, cAlpha, doubleTapTimeout, -307955329, false, str$$d, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        i13 = i17;
                        c3 = '\n';
                        c7 = '\t';
                        c8 = 7;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i25 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i25) {
                        Object[] objArr5 = new Object[11];
                        objArr5[c3] = challengeResultKt;
                        objArr5[c7] = Integer.valueOf(cCharValue);
                        objArr5[8] = challengeResultKt;
                        objArr5[c8] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[4] = challengeResultKt;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[c13] = Integer.valueOf(cCharValue);
                        objArr5[i13] = challengeResultKt;
                        objArr5[0] = challengeResultKt;
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            int iResolveSize = View.resolveSize(0, 0) + 2223;
                            char maximumDrawingCacheSize = (char) (53070 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int i26 = 21 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            byte b17 = (byte) 0;
                            byte b18 = (byte) (b17 - 1);
                            String str$$d2 = $$d(b17, b18, (byte) (b18 + 1));
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(iResolveSize, maximumDrawingCacheSize, i26, 246098488, false, str$$d2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i27 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i28 = challengeResultKt.getSDKReferenceNumber;
                        cArr3[i28] = cArr2[iIntValue2];
                        cArr3[i28 + 1] = cArr2[i27];
                    } else {
                        int i29 = challengeResultKt.AuthenticationRequestParameters;
                        int i31 = challengeResultKt.getSDKTransactionID;
                        if (i29 == i31) {
                            $11 = ($10 + 13) % 128;
                            int i32 = i13;
                            int iC = k.c(challengeResultKt.getMessageVersion, cCharValue, i32, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i25, cCharValue, i32, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i33 = (i31 * cCharValue) + iC2;
                            int i34 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i34] = cArr2[(i29 * cCharValue) + iC];
                            cArr3[i34 + i32] = cArr2[i33];
                            i13 = 1;
                        } else {
                            int i35 = (i29 * cCharValue) + i25;
                            int i36 = (i31 * cCharValue) + challengeResultKt.getMessageVersion;
                            int i37 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i37] = cArr2[i35];
                            i13 = 1;
                            cArr3[i37 + 1] = cArr2[i36];
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                i17 = i13;
            }
        }
        for (int i38 = 0; i38 < i11; i38++) {
            cArr3[i38] = (char) (cArr3[i38] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{16, 15, -73, -127};
        $$b = 215;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        getSDKTransactionID = (getSDKReferenceNumber + 87) % 128;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getDeviceData;
        Object[] objArr = new Object[1];
        b('A' - AndroidCharacter.getMirror('0'), (byte) (97 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "㙏㙏\u0001\u0006\t\u000e\u0002\u0005\u0004\u0000\u0005\u0006\u0003\n\f\u0007㙓", objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            getSDKTransactionID = (getSDKReferenceNumber + 1) % 128;
            Integer sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKReferenceNumber(strAuthenticationRequestParameters);
            if (sDKReferenceNumber != null) {
                int i11 = getSDKTransactionID + 69;
                getSDKReferenceNumber = i11 % 128;
                if (i11 % 2 == 0) {
                    DeviceParameterResult.Success.IntValue.m150boximpl(DeviceParameterResult.Success.IntValue.m151constructorimpl(sDKReferenceNumber.intValue()));
                    throw null;
                }
                DeviceParameterResult.Success.IntValue intValueM150boximpl = DeviceParameterResult.Success.IntValue.m150boximpl(DeviceParameterResult.Success.IntValue.m151constructorimpl(sDKReferenceNumber.intValue()));
                int i12 = getSDKReferenceNumber + 61;
                getSDKTransactionID = i12 % 128;
                if (i12 % 2 == 0) {
                    return intValueM150boximpl;
                }
                throw null;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultSynth$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ onCompletion(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
