package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.view.Gravity;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/UserRotation;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isValid", "(Ljava/lang/String;)Z", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserRotation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRotation.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/UserRotation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class CompletionEvent extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = 120 - r7
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = atd.y.CompletionEvent.$$a
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2d
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r3 = r1[r6]
            r5 = r1
            r1 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r7 = r7 + r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.CompletionEvent.$$d(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getMessageVersion = 1;
        getSDKAppID = 0;
        getDeviceData = 1;
        getSDKTransactionID();
        Gravity.getAbsoluteGravity(0, 0);
        new getDeviceData((byte) 0);
        getMessageVersion = (getSDKTransactionID + 79) % 128;
    }

    private CompletionEvent(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKReferenceNumber = getsdkreferencenumber;
    }

    private static boolean AuthenticationRequestParameters(String str) throws Throwable {
        Object[] objArr = new Object[1];
        b("ꀜ䦦듦ꁇ⯑灙\ueb6d춊⤳ꊘ", (ViewConfiguration.getScrollBarSize() >> 8) + 1, objArr);
        boolean zE = new Regex(((String) objArr[0]).intern()).e(str);
        int i11 = getSDKAppID + 119;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            return zE;
        }
        throw null;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            $10 = ($11 + 31) % 128;
            charArray = str.toCharArray();
            $11 = ($10 + 29) % 128;
        } else {
            charArray = str;
        }
        atd.bb.completed completedVar = new atd.bb.completed();
        char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(AuthenticationRequestParameters ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(AuthenticationRequestParameters)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int fadingEdgeLength = 2774 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 13060);
                    int iArgb = 25 - Color.argb(0, 0, 0, 0);
                    byte b8 = (byte) 0;
                    byte b11 = b8;
                    String str$$d = $$d(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(fadingEdgeLength, scrollDefaultDelay, iArgb, -1416626223, false, str$$d, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 408, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), Color.red(0) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
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

    public static void getSDKTransactionID() {
        AuthenticationRequestParameters = 4973972881800422549L;
    }

    public static void init$0() {
        $$a = new byte[]{53, -94, 71, -95};
        $$b = 65;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        b("쬱⣧⪚쭄䫓\uee71뢲鸕䉲쏶束\u1737\ud968峬ﰵ臐個", 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            if (AuthenticationRequestParameters(strAuthenticationRequestParameters)) {
                int i11 = getSDKAppID + 33;
                getDeviceData = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            } else {
                strAuthenticationRequestParameters = null;
            }
            if (strAuthenticationRequestParameters != null) {
                getDeviceData = (getSDKAppID + 91) % 128;
                return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(strAuthenticationRequestParameters));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/UserRotation$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        public static int getDeviceData;
        public static int getSDKTransactionID;

        private getDeviceData() {
        }

        public static int getDeviceData() {
            int i11 = getDeviceData;
            int i12 = i11 % 6191347;
            getDeviceData = i11 + 1;
            if (i12 != 0) {
                return getSDKTransactionID;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            getSDKTransactionID = iFreeMemory;
            return iFreeMemory;
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ CompletionEvent(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
