package atd.x;

import android.app.Application;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/EnabledAccessibilityServices;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnabledAccessibilityServices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnabledAccessibilityServices.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/EnabledAccessibilityServices\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n774#2:31\n865#2,2:32\n1#3:34\n*S KotlinDebug\n*F\n+ 1 EnabledAccessibilityServices.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/EnabledAccessibilityServices\n*L\n21#1:31\n21#1:32,2\n*E\n"})
public final class getMessageVersion extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResult;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber AuthenticationRequestParameters;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r6, short r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 120
            byte[] r0 = atd.x.getMessageVersion.$$a
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
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
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
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
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getMessageVersion.$$d(short, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        ChallengeResult = 1;
        getDeviceData = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters();
        TextUtils.getTrimmedLength("");
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getSDKAppID + 31;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private getMessageVersion(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.AuthenticationRequestParameters = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        getSDKTransactionID = 8365375819373896865L;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12 = ($10 + 59) % 128;
        $11 = i12;
        if (str != null) {
            int i13 = i12 + 111;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                charArray = str.toCharArray();
                int i14 = 21 / 0;
            } else {
                charArray = str.toCharArray();
            }
        } else {
            charArray = str;
        }
        atd.bb.completed completedVar = new atd.bb.completed();
        char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(getSDKTransactionID ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i15 = completedVar.getSDKTransactionID;
            if (i15 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            $11 = ($10 + 107) % 128;
            int i16 = i15 - 4;
            completedVar.getSDKAppID = i16;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i15] ^ sDKTransactionID[i15 % 4]), Long.valueOf(i16), Long.valueOf(getSDKTransactionID)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int trimmedLength = 2774 - TextUtils.getTrimmedLength("");
                    char deadChar = (char) (13060 - KeyEvent.getDeadChar(0, 0));
                    int maxKeyCode = 25 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b8 = (byte) 0;
                    byte b11 = b8;
                    String str$$d = $$d(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(trimmedLength, deadChar, maxKeyCode, -1416626223, false, str$$d, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i15] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(408 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) View.combineMeasuredStates(0, 0), View.getDefaultSize(0, 0) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{4, -104, 18, -33};
        $$b = 208;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004a A[PHI: r0
      0x004a: PHI (r0v10 java.lang.String) = (r0v9 java.lang.String), (r0v24 java.lang.String) binds: [B:8:0x0048, B:5:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = atd.x.getMessageVersion.getDeviceData
            int r0 = r0 + 39
            int r1 = r0 % 128
            atd.x.getMessageVersion.getSDKReferenceNumber = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r7.AuthenticationRequestParameters
            r2 = 16
            java.lang.String r3 = "赢臵贇揨⓭审\ue06aﲚӂ\uedaf樻櫛麛瞝ﳰ\ue135ၵ﹑䛎\u1f7e\uaa3b蠺좒镜㷧ዅ兼Α럘鲸\udb2a맣䦓⚁"
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L30
            int r0 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r0 = r0 % 61
            int r0 = r5 / r0
            java.lang.Object[] r6 = new java.lang.Object[r4]
            b(r3, r0, r6)
            r0 = r6[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto La1
            goto L4a
        L30:
            int r0 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r0 = r0 >> r2
            int r0 = 1 - r0
            java.lang.Object[] r6 = new java.lang.Object[r4]
            b(r3, r0, r6)
            r0 = r6[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto La1
        L4a:
            int r1 = atd.x.getMessageVersion.getSDKReferenceNumber
            int r1 = r1 + 31
            int r3 = r1 % 128
            atd.x.getMessageVersion.getDeviceData = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L63
            char[] r1 = new char[r4]
            r1[r5] = r2
            r2 = 69
            java.util.List r0 = kotlin.text.StringsKt.S(r0, r1, r2)
            if (r0 == 0) goto La1
            goto L70
        L63:
            char[] r1 = new char[r4]
            r2 = 44
            r1[r5] = r2
            r2 = 6
            java.util.List r0 = kotlin.text.StringsKt.S(r0, r1, r2)
            if (r0 == 0) goto La1
        L70:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
            int r2 = atd.x.getMessageVersion.getDeviceData
            int r2 = r2 + 117
            int r2 = r2 % 128
            atd.x.getMessageVersion.getSDKReferenceNumber = r2
        L81:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L98
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = kotlin.text.StringsKt.H(r3)
            if (r3 != 0) goto L81
            r1.add(r2)
            goto L81
        L98:
            java.util.List r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m172constructorimpl(r1)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringsListValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m171boximpl(r0)
            return r0
        La1:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getMessageVersion.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/EnabledAccessibilityServices$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ getMessageVersion(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
