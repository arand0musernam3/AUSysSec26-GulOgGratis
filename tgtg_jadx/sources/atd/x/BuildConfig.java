package atd.x;

import android.app.Application;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/DefaultInputMethod;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultInputMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultInputMethod.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/DefaultInputMethod\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class BuildConfig extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r6, short r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r8 = r8 * 3
            int r8 = r8 + 120
            byte[] r0 = atd.x.BuildConfig.$$a
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.BuildConfig.$$d(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getMessageVersion = 1;
        getDeviceData = 0;
        getSDKAppID = 1;
        AuthenticationRequestParameters();
        AudioTrack.getMaxVolume();
        new getSDKTransactionID((byte) 0);
        int i11 = getMessageVersion + 115;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private BuildConfig(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = 8185632549693046937L;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.completed completedVar = new atd.bb.completed();
        char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(AuthenticationRequestParameters ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                String str2 = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                $11 = ($10 + 33) % 128;
                objArr[0] = str2;
                return;
            }
            $11 = ($10 + 93) % 128;
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(AuthenticationRequestParameters)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int i14 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2774;
                    char mode = (char) (13060 - View.MeasureSpec.getMode(0));
                    int defaultSize = 25 - View.getDefaultSize(0, 0);
                    byte b8 = (byte) 0;
                    byte b11 = b8;
                    String str$$d = $$d(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(i14, mode, defaultSize, -1416626223, false, str$$d, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 408, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 30 - ExpandableListView.getPackedPositionType(0L), 144017174, false, "y", new Class[]{Object.class, Object.class});
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
        $$a = new byte[]{56, -122, 3, 56};
        $$b = 101;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        b("梶\ue671棒꾄\u205f⍴훓葓燯㥪ਲ몁媇Ẽᄚ原⍆\uf7e1石䣓\u0c72쳢庭愦", View.MeasureSpec.getMode(0) + 1, objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            getDeviceData = (getSDKAppID + 83) % 128;
            return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(strAuthenticationRequestParameters));
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        int i11 = getSDKAppID + 65;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 33 / 0;
        }
        return failure;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/DefaultInputMethod$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int getDeviceData;
        private static long getSDKAppID;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r5, int r6, int r7) {
            /*
                int r6 = r6 * 3
                int r6 = 4 - r6
                int r5 = r5 * 2
                int r0 = r5 + 1
                byte[] r1 = atd.x.BuildConfig.getSDKTransactionID.$$c
                int r7 = r7 * 4
                int r7 = r7 + 120
                byte[] r0 = new byte[r0]
                r2 = -1
                if (r1 != 0) goto L16
                r3 = r7
                r7 = r6
                goto L29
            L16:
                r4 = r7
                r7 = r6
                r6 = r4
            L19:
                int r2 = r2 + 1
                byte r3 = (byte) r6
                r0[r2] = r3
                if (r2 != r5) goto L27
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r0, r6)
                return r5
            L27:
                r3 = r1[r7]
            L29:
                int r3 = -r3
                int r6 = r6 + r3
                int r7 = r7 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.BuildConfig.getSDKTransactionID.$$e(short, int, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getDeviceData = 1;
            getSDKAppID = -1293965102125632361L;
        }

        private getSDKTransactionID() {
        }

        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            $11 = ($10 + 91) % 128;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.bb.completed completedVar = new atd.bb.completed();
            char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(getSDKAppID ^ 2436480605514729170L, charArray, i11);
            completedVar.getSDKTransactionID = 4;
            while (true) {
                int i12 = completedVar.getSDKTransactionID;
                if (i12 >= sDKTransactionID.length) {
                    objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                    return;
                }
                $10 = ($11 + 59) % 128;
                int i13 = i12 - 4;
                completedVar.getSDKAppID = i13;
                try {
                    Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKAppID)};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                    if (sDKTransactionID2 == null) {
                        int i14 = 2775 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        char c3 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13059);
                        int mode = 25 - View.MeasureSpec.getMode(0);
                        byte b8 = (byte) 0;
                        byte b11 = b8;
                        String str$$e = $$e(b8, b11, b11);
                        Class cls = Long.TYPE;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(i14, c3, mode, -1416626223, false, str$$e, new Class[]{cls, cls, cls});
                    }
                    sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {completedVar, completedVar};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                    if (sDKTransactionID3 == null) {
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getTouchSlop() >> 8) + 408, (char) View.resolveSize(0, 0), 30 - KeyEvent.keyCodeFromString(""), 144017174, false, "y", new Class[]{Object.class, Object.class});
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

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 3
                int r8 = r8 + 104
                byte[] r0 = atd.x.BuildConfig.getSDKTransactionID.$$a
                int r6 = r6 * 3
                int r6 = r6 + 4
                int r7 = r7 * 4
                int r7 = 4 - r7
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r6
                r8 = r7
                r3 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L2c:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-2)
                int r8 = r8 + 1
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.BuildConfig.getSDKTransactionID.b(short, byte, byte, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKAppID(int r31, int r32) {
            /*
                Method dump skipped, instruction units count: 1345
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.BuildConfig.getSDKTransactionID.getSDKAppID(int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{53, -94, 71, -95, -3, 3, -3};
            $$b = 119;
        }

        public static void init$1() {
            $$c = new byte[]{52, -114, -70, 47};
            $$d = 145;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ BuildConfig(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
