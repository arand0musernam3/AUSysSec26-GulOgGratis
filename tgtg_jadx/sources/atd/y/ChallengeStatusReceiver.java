package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextAutoPunctuate;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextAutoPunctuate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAutoPunctuate.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextAutoPunctuate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class ChallengeStatusReceiver extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static boolean getDeviceData;
    private static int getMessageVersion;
    private static boolean getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, byte r7, int r8) {
        /*
            byte[] r0 = atd.y.ChallengeStatusReceiver.$$a
            int r6 = r6 * 4
            int r6 = 115 - r6
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r0
            r4 = r2
            r0 = r8
            r8 = r7
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2e:
            int r0 = r0 + 1
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeStatusReceiver.$$d(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        getMessageVersion = 0;
        BuildConfig = 1;
        getSDKTransactionID();
        ExpandableListView.getPackedPositionChild(0L);
        new getDeviceData((byte) 0);
        int i11 = getSDKEphemeralPublicKey + 87;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private ChallengeStatusReceiver(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKReferenceNumber = getsdkreferencenumber;
    }

    private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        String str3 = str2;
        $10 = ($11 + 85) % 128;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr = getSDKTransactionID;
        Class cls = Integer.TYPE;
        int i14 = 1;
        int i15 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i16])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        int iIndexOf = 2554 - TextUtils.indexOf((CharSequence) "", '0', i15);
                        char c3 = (char) (48597 - (ExpandableListView.getPackedPositionForChild(i15, i15) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i15, i15) == 0L ? 0 : -1)));
                        int iMakeMeasureSpec = 31 - View.MeasureSpec.makeMeasureSpec(i15, i15);
                        byte b8 = (byte) ($$b & i14);
                        i12 = i14;
                        byte b11 = (byte) (b8 - 1);
                        i13 = i15;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iIndexOf, c3, iMakeMeasureSpec, -390605202, false, $$d(b8, b11, b11), new Class[]{cls});
                    } else {
                        i12 = i14;
                        i13 = i15;
                    }
                    cArr2[i16] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i16++;
                    i14 = i12;
                    i15 = i13;
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
        int i17 = i14;
        int i18 = i15;
        Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(((Process.getThreadPriority(i18) + 20) >> 6) + 147, (char) (ViewConfiguration.getTouchSlop() >> 8), 32 - (ExpandableListView.getPackedPositionForGroup(i18) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i18) == 0L ? 0 : -1)), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        if (getSDKAppID) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr3 = new char[length2];
            challengeResultTimeout.getSDKAppID = i18;
            while (true) {
                int i19 = challengeResultTimeout.getSDKAppID;
                int i21 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i19 >= i21) {
                    String str4 = new String(cArr3);
                    $10 = ($11 + 109) % 128;
                    objArr[0] = str4;
                    return;
                }
                cArr3[i19] = (char) (cArr[bArr[(i21 - 1) - i19] + i11] - iIntValue);
                Object[] objArr4 = new Object[2];
                objArr4[i17] = challengeResultTimeout;
                objArr4[0] = challengeResultTimeout;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1697, (char) Color.red(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29, -1620360563, false, $$d(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
            }
        } else if (getDeviceData) {
            int length3 = charArray.length;
            challengeResultTimeout.AuthenticationRequestParameters = length3;
            char[] cArr4 = new char[length3];
            challengeResultTimeout.getSDKAppID = i18;
            while (true) {
                int i22 = challengeResultTimeout.getSDKAppID;
                int i23 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i22] = (char) (cArr[charArray[(i23 - 1) - i22] - i11] - iIntValue);
                Object[] objArr5 = new Object[2];
                objArr5[i17] = challengeResultTimeout;
                objArr5[0] = challengeResultTimeout;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(1697 - View.MeasureSpec.getSize(0), (char) Color.argb(0, 0, 0, 0), 28 - ExpandableListView.getPackedPositionChild(0L), -1620360563, false, $$d(b14, b15, b15), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
                $10 = ($11 + 13) % 128;
            }
        } else {
            int length4 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr5 = new char[length4];
            challengeResultTimeout.getSDKAppID = i18;
            while (true) {
                int i24 = challengeResultTimeout.getSDKAppID;
                int i25 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i24 >= i25) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i24] = (char) (cArr[iArr[(i25 - 1) - i24] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i24 + 1;
                    $10 = ($11 + 79) % 128;
                }
            }
        }
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{21707, 21759, 21758, 21749, 21701, 21754, 21748, 21705, 21711, 21675, 21691, 21693};
        AuthenticationRequestParameters = 1286296682;
        getDeviceData = true;
        getSDKAppID = true;
    }

    public static void init$0() {
        $$a = new byte[]{64, 105, 71, -25};
        $$b = 199;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0047 A[PHI: r0
      0x0047: PHI (r0v9 java.lang.String) = (r0v8 java.lang.String), (r0v18 java.lang.String) binds: [B:8:0x0045, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = atd.y.ChallengeStatusReceiver.getMessageVersion
            int r0 = r0 + 23
            int r1 = r0 % 128
            atd.y.ChallengeStatusReceiver.BuildConfig = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r7.getSDKReferenceNumber
            r2 = 1
            java.lang.String r3 = "\u0089\u0083\u0081\u0082\u0083\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081"
            r4 = 0
            r5 = 0
            if (r0 != 0) goto L2e
            r0 = 110(0x6e, float:1.54E-43)
            int r6 = android.view.View.getDefaultSize(r5, r5)
            int r0 = r0 / r6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            b(r4, r4, r0, r3, r2)
            r0 = r2[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L62
            goto L47
        L2e:
            int r0 = android.view.View.getDefaultSize(r5, r5)
            int r0 = 127 - r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            b(r4, r4, r0, r3, r2)
            r0 = r2[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L62
        L47:
            int r1 = atd.y.ChallengeStatusReceiver.BuildConfig
            int r1 = r1 + 109
            int r1 = r1 % 128
            atd.y.ChallengeStatusReceiver.getMessageVersion = r1
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            if (r0 == 0) goto L62
            int r1 = atd.y.ChallengeStatusReceiver.BuildConfig
            int r1 = r1 + 115
            int r1 = r1 % 128
            atd.y.ChallengeStatusReceiver.getMessageVersion = r1
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = w.a0.h(r0)
            return r0
        L62:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeStatusReceiver.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextAutoPunctuate$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeStatusReceiver(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
