package atd.y;

import android.app.Application;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextShowPassword;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextShowPassword.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextShowPassword.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextShowPassword\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class cancelled extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static int getMessageVersion;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, short r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = atd.y.cancelled.$$a
            int r8 = r8 * 3
            int r8 = r8 + 66
            int r7 = r7 * 2
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + 1
            int r8 = r8 + r0
            r0 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.cancelled.$$d(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        getSDKEphemeralPublicKey = 1;
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        getSDKAppID();
        ViewConfiguration.getZoomControlsTimeout();
        new getSDKReferenceNumber((byte) 0);
        int i11 = getMessageVersion + 101;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 94 / 0;
        }
    }

    private cancelled(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = getsdkreferencenumber;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        int i15;
        if (str != null) {
            $10 = ($11 + 57) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultCompleted challengeResultCompleted = new atd.bb.ChallengeResultCompleted();
        char[] cArr2 = new char[cArr.length];
        int i16 = 0;
        challengeResultCompleted.getDeviceData = 0;
        int i17 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i18 = challengeResultCompleted.getDeviceData;
            if (i18 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            int i19 = $10 + 103;
            $11 = i19 % 128;
            char c3 = 1;
            if (i19 % i17 == 0) {
                cArr3[1] = cArr[i18];
                cArr3[1] = cArr[i18];
                i12 = 1;
            } else {
                cArr3[i16] = cArr[i18];
                cArr3[1] = cArr[i18 + 1];
                i12 = i16;
            }
            int i21 = 58224;
            while (i12 < 16) {
                $10 = ($11 + 93) % 128;
                char c7 = cArr3[c3];
                char c8 = cArr3[i16];
                char c11 = c3;
                int i22 = (c8 + i21) ^ ((c8 << 4) + ((char) (((long) AuthenticationRequestParameters) ^ 5320350835299930193L)));
                int i23 = c8 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getDeviceData);
                    objArr2[i17] = Integer.valueOf(i23);
                    objArr2[c11] = Integer.valueOf(i22);
                    objArr2[i16] = Integer.valueOf(c7);
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        i15 = 906025703;
                        byte b8 = (byte) i16;
                        i14 = i17;
                        byte b11 = b8;
                        i13 = i16;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2828, (char) (ExpandableListView.getPackedPositionForGroup(i16) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i16) == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') - 21, -362226441, false, $$d(b8, b11, b11), new Class[]{cls, cls, cls, cls});
                    } else {
                        i13 = i16;
                        i14 = i17;
                        i15 = 906025703;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr3[c11] = cCharValue;
                    char c12 = cArr3[i13];
                    int i24 = (cCharValue + i21) ^ ((cCharValue << 4) + ((char) (((long) getSDKAppID) ^ 5320350835299930193L)));
                    int i25 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(getSDKReferenceNumber);
                    objArr3[i14] = Integer.valueOf(i25);
                    objArr3[c11] = Integer.valueOf(i24);
                    objArr3[i13] = Integer.valueOf(c12);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i15);
                    if (sDKTransactionID2 == null) {
                        int i26 = i13;
                        byte b12 = (byte) i26;
                        byte b13 = b12;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2828 - View.MeasureSpec.makeMeasureSpec(i26, i26), (char) View.MeasureSpec.getSize(i26), (ViewConfiguration.getTapTimeout() >> 16) + 27, -362226441, false, $$d(b12, b13, b13), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i21 -= 40503;
                    i12++;
                    c3 = c11;
                    i17 = i14;
                    i16 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i27 = i17;
            char c13 = c3;
            int i28 = challengeResultCompleted.getDeviceData;
            cArr2[i28] = cArr3[0];
            cArr2[i28 + 1] = cArr3[c13];
            Object[] objArr4 = new Object[i27];
            objArr4[c13] = challengeResultCompleted;
            objArr4[0] = challengeResultCompleted;
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(3156 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (View.combineMeasuredStates(0, 0) + 25797), 26 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1296942946, false, $$d(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            i17 = i27;
            i16 = 0;
        }
    }

    public static void getSDKAppID() {
        getSDKAppID = (char) 13864;
        getSDKReferenceNumber = (char) 643;
        AuthenticationRequestParameters = (char) 59462;
        getDeviceData = (char) 35167;
    }

    public static void init$0() {
        $$a = new byte[]{48, -79, 31, 67};
        $$b = 187;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004b A[PHI: r0
      0x004b: PHI (r0v10 java.lang.String) = (r0v9 java.lang.String), (r0v20 java.lang.String) binds: [B:8:0x0049, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = atd.y.cancelled.ChallengeResultCancelled
            int r0 = r0 + 51
            int r1 = r0 % 128
            atd.y.cancelled.BuildConfig = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r6.getSDKTransactionID
            r2 = 0
            r3 = 1
            java.lang.String r4 = "ꀟ娷싋褃珺﵍扩ⶊ㎖蹭╔颸챶Ე"
            if (r0 == 0) goto L30
            int r0 = android.view.ViewConfiguration.getFadingEdgeLength()
            int r0 = r0 * 55
            r5 = 79
            int r0 = r5 >> r0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r4, r0, r3)
            r0 = r3[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L5e
            goto L4b
        L30:
            int r0 = android.view.ViewConfiguration.getFadingEdgeLength()
            int r0 = r0 >> 16
            int r0 = r0 + 13
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r4, r0, r3)
            r0 = r3[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L5e
        L4b:
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            if (r0 == 0) goto L5e
            int r1 = atd.y.cancelled.BuildConfig
            int r1 = r1 + 109
            int r1 = r1 % 128
            atd.y.cancelled.ChallengeResultCancelled = r1
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = w.a0.h(r0)
            return r0
        L5e:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.cancelled.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextShowPassword$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }

    public /* synthetic */ cancelled(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
