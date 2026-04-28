package atd.x;

import android.app.Application;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilityDisplayInversionEnabled;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccessibilityDisplayInversionEnabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityDisplayInversionEnabled.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilityDisplayInversionEnabled\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public final class getSDKAppID extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber AuthenticationRequestParameters;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r6, int r7, int r8) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 * 3
            int r6 = 69 - r6
            byte[] r1 = atd.x.getSDKAppID.$$a
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L1a
            r3 = r1
            r4 = r2
            r1 = r8
            r8 = r7
            goto L2f
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r1
            r1 = r5
        L2f:
            int r6 = -r6
            int r6 = r6 + r8
            int r8 = r1 + 1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKAppID.$$d(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        ChallengeResult = 0;
        getSDKEphemeralPublicKey = 1;
        AuthenticationRequestParameters();
        ExpandableListView.getPackedPositionForChild(0, 0);
        new getSDKTransactionID((byte) 0);
        BuildConfig = (ChallengeResultCancelled + 107) % 128;
    }

    private getSDKAppID(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.AuthenticationRequestParameters = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = (char) 9686;
        getSDKAppID = (char) 6658;
        getSDKTransactionID = (char) 11993;
        getDeviceData = (char) 7921;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        int i14;
        $10 = ($11 + 113) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultCompleted challengeResultCompleted = new atd.bb.ChallengeResultCompleted();
        char[] cArr = new char[charArray.length];
        int i15 = 0;
        challengeResultCompleted.getDeviceData = 0;
        int i16 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i17 = challengeResultCompleted.getDeviceData;
            if (i17 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i11);
                return;
            }
            $10 = ($11 + 113) % 128;
            cArr2[i15] = charArray[i17];
            int i18 = 1;
            cArr2[1] = charArray[i17 + 1];
            int i19 = 58224;
            int i21 = i15;
            while (i21 < 16) {
                char c3 = cArr2[i18];
                char c7 = cArr2[i15];
                int i22 = i16;
                char[] cArr3 = cArr2;
                int i23 = (c7 + i19) ^ ((c7 << 4) + ((char) (((long) getSDKTransactionID) ^ 5320350835299930193L)));
                int i24 = c7 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getDeviceData);
                    objArr2[i22] = Integer.valueOf(i24);
                    objArr2[i18] = Integer.valueOf(i23);
                    objArr2[i15] = Integer.valueOf(c3);
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        i13 = 906025703;
                        byte b8 = (byte) i18;
                        i14 = i18;
                        byte b11 = (byte) (b8 - 1);
                        i12 = i15;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2827, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf("", "") + 27, -362226441, false, $$d(b8, b11, b11), new Class[]{cls, cls, cls, cls});
                    } else {
                        i12 = i15;
                        i13 = 906025703;
                        i14 = i18;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr3[i14] = cCharValue;
                    char c8 = cArr3[i12];
                    int i25 = (cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) getSDKReferenceNumber) ^ 5320350835299930193L)));
                    int i26 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(getSDKAppID);
                    objArr3[i22] = Integer.valueOf(i26);
                    objArr3[i14] = Integer.valueOf(i25);
                    objArr3[i12] = Integer.valueOf(c8);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i13);
                    if (sDKTransactionID2 == null) {
                        int i27 = i12;
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', i27, i27) + 2829;
                        char c11 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i28 = (CdmaCellLocation.convertQuartSecToDecDegrees(i27) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i27) == 0.0d ? 0 : -1)) + 27;
                        byte b12 = (byte) i14;
                        byte b13 = (byte) (b12 - 1);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iLastIndexOf, c11, i28, -362226441, false, $$d(b12, b13, b13), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i19 -= 40503;
                    i21++;
                    i16 = i22;
                    cArr2 = cArr3;
                    i15 = 0;
                    i18 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i29 = i16;
            char[] cArr4 = cArr2;
            int i31 = challengeResultCompleted.getDeviceData;
            cArr[i31] = cArr4[0];
            cArr[i31 + 1] = cArr4[1];
            Object[] objArr4 = new Object[i29];
            objArr4[1] = challengeResultCompleted;
            objArr4[0] = challengeResultCompleted;
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(3156 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 25797), 27 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1296942946, false, $$d(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            i16 = i29;
            cArr2 = cArr4;
            i15 = 0;
        }
    }

    public static void init$0() {
        $$a = new byte[]{5, 96, -35, 91};
        $$b = 92;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        Boolean sDKTransactionID;
        ChallengeResult = (getSDKEphemeralPublicKey + 87) % 128;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.AuthenticationRequestParameters;
        Object[] objArr = new Object[1];
        b("홂霢嗐颶螋ﷰ⧦볇 睸棷⃤펅ﭜԟ鎈깴ꕦ厶\udf8b펅ﭜ־莱㷜\ud8e4\uecc2彉宼鈭謹흹딅챍핈型襉帨\ue0fb䣰", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39, objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters == null || (sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters)) == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        DeviceParameterResult.Success.BooleanValue booleanValueH = a0.h(sDKTransactionID);
        int i11 = getSDKEphemeralPublicKey + 39;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            return booleanValueH;
        }
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilityDisplayInversionEnabled$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int getDeviceData;
        private static int getSDKAppID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r6, int r7, int r8) {
            /*
                byte[] r0 = atd.x.getSDKAppID.getSDKTransactionID.$$c
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r6 = r6 * 2
                int r6 = r6 + 1
                int r8 = r8 * 2
                int r8 = 100 - r8
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r6
                goto L27
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                r3 = r0[r7]
            L27:
                int r7 = r7 + 1
                int r8 = r8 + r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKAppID.getSDKTransactionID.$$e(short, int, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            AuthenticationRequestParameters = 0;
            getDeviceData = 1;
            getSDKAppID = 711855193;
        }

        private getSDKTransactionID() {
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] AuthenticationRequestParameters(android.content.Context r37, int r38, int r39, int r40) {
            /*
                Method dump skipped, instruction units count: 1589
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(android.content.Context, int, int, int):java.lang.Object[]");
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01c7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(boolean r26, int r27, java.lang.String r28, int r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 467
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKAppID.getSDKTransactionID.a(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r5, byte r6, int r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 + 101
                int r6 = 19 - r6
                int r7 = 34 - r7
                byte[] r0 = atd.x.getSDKAppID.getSDKTransactionID.$$a
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L10
                r4 = r6
                r3 = r2
                goto L24
            L10:
                r3 = r2
            L11:
                int r7 = r7 + 1
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L22:
                r4 = r0[r7]
            L24:
                int r4 = -r4
                int r5 = r5 + r4
                int r5 = r5 + (-2)
                goto L11
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKAppID.getSDKTransactionID.b(int, byte, int, java.lang.Object[]):void");
        }

        public static void init$0() {
            $$a = new byte[]{49, 92, 68, -39, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -3, 3, -3, 50};
            $$b = 22;
        }

        public static void init$1() {
            $$c = new byte[]{52, -114, -70, 47};
            $$d = 247;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKAppID(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
