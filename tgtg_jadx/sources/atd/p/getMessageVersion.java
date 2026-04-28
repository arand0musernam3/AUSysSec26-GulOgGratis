package atd.p;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DataRoaming;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataRoaming.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataRoaming.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DataRoaming\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class getMessageVersion extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static long getSDKAppID;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKReferenceNumber;

    private static String $$d(short s7, short s8, byte b8) {
        int i11 = 3 - (s8 * 2);
        byte[] bArr = $$a;
        int i12 = b8 * 2;
        int i13 = 120 - (s7 * 3);
        byte[] bArr2 = new byte[i12 + 1];
        int i14 = -1;
        if (bArr == null) {
            i13 += -i11;
            i11 = i11;
            bArr = bArr;
            i14 = -1;
        }
        while (true) {
            int i15 = i14 + 1;
            bArr2[i15] = (byte) i13;
            int i16 = i11 + 1;
            if (i15 == i12) {
                return new String(bArr2, 0);
            }
            byte[] bArr3 = bArr;
            i13 += -bArr[i16];
            i11 = i16;
            bArr = bArr3;
            i14 = i15;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        ChallengeResultCancelled = 1;
        getDeviceData = 0;
        AuthenticationRequestParameters = 1;
        getSDKAppID();
        AudioTrack.getMaxVolume();
        new getDeviceData((byte) 0);
        int i11 = getSDKTransactionID + 57;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private getMessageVersion(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKReferenceNumber = getsdkreferencenumber;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12 = ($11 + 25) % 128;
        $10 = i12;
        if (str != null) {
            int i13 = i12 + 55;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        atd.bb.completed completedVar = new atd.bb.completed();
        char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(getSDKAppID ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i14 = completedVar.getSDKTransactionID;
            if (i14 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            $10 = ($11 + 33) % 128;
            int i15 = i14 - 4;
            completedVar.getSDKAppID = i15;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i14] ^ sDKTransactionID[i14 % 4]), Long.valueOf(i15), Long.valueOf(getSDKAppID)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2774;
                    char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 13060);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 25;
                    byte b8 = (byte) 0;
                    byte b11 = b8;
                    String str$$d = $$d(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(edgeSlop, scrollDefaultDelay, iResolveOpacity, -1416626223, false, str$$d, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i14] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(View.MeasureSpec.makeMeasureSpec(0, 0) + 408, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 30 - KeyEvent.keyCodeFromString(""), 144017174, false, "y", new Class[]{Object.class, Object.class});
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

    public static void getSDKAppID() {
        getSDKAppID = -3860422431073804532L;
    }

    public static void init$0() {
        $$a = new byte[]{62, -80, -102, 31};
        $$b = 94;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[PHI: r0
      0x0041: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v16 java.lang.String) binds: [B:8:0x003f, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = atd.p.getMessageVersion.AuthenticationRequestParameters
            int r0 = r0 + 35
            int r1 = r0 % 128
            atd.p.getMessageVersion.getDeviceData = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r5.getSDKReferenceNumber
            java.lang.String r2 = "셂섦怡씋Ṿ릞ꙥ\uf8ba涘盃鎅曶\u0fdfᄹ\uf401콨"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L2a
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r2, r0, r3)
            r0 = r3[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L63
            goto L41
        L2a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r2, r0, r3)
            r0 = r3[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L63
        L41:
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            if (r0 == 0) goto L63
            int r1 = atd.p.getMessageVersion.getDeviceData
            int r1 = r1 + 99
            int r1 = r1 % 128
            atd.p.getMessageVersion.AuthenticationRequestParameters = r1
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = w.a0.h(r0)
            int r1 = atd.p.getMessageVersion.getDeviceData
            int r1 = r1 + 49
            int r2 = r1 % 128
            atd.p.getMessageVersion.AuthenticationRequestParameters = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L62
            r1 = 51
            int r1 = r1 / r4
        L62:
            return r0
        L63:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            int r1 = atd.p.getMessageVersion.getDeviceData
            int r1 = r1 + 111
            int r1 = r1 % 128
            atd.p.getMessageVersion.AuthenticationRequestParameters = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.getMessageVersion.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DataRoaming$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ getMessageVersion(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
