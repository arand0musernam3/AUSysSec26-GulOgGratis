package atd.q;

import android.app.Application;
import android.content.pm.PackageManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import atd.bb.completed;
import atd.e.ChallengeResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/GetInstallerPackageName;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGetInstallerPackageName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetInstallerPackageName.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/GetInstallerPackageName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class AuthenticationRequestParameters extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static long AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int getDeviceData;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final Application getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = atd.q.AuthenticationRequestParameters.$$a
            int r8 = r8 * 4
            int r8 = 120 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L18
            r8 = r6
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r1
            int r8 = r8 + 1
            r1 = r8
            r8 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.q.AuthenticationRequestParameters.$$d(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        ChallengeResult = 0;
        BuildConfig = 1;
        getDeviceData = 0;
        getSDKTransactionID = 1;
        AuthenticationRequestParameters();
        getSDKAppID();
        TextUtils.getCapsMode("", 0, 0);
        new getSDKReferenceNumber((byte) 0);
        int i11 = ChallengeResult + 35;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 79 / 0;
        }
    }

    public AuthenticationRequestParameters(@NotNull Application application) {
        application.getClass();
        this.getSDKAppID = application;
    }

    public static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = 2807551038595935836L;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(AuthenticationRequestParameters ^ 2436480605514729170L, charArray, i11);
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
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int size = View.MeasureSpec.getSize(0) + 2774;
                    char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 13060);
                    int i14 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 25;
                    byte b8 = (byte) ($$a[1] - 1);
                    byte b11 = b8;
                    String str$$d = $$d(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(size, cCombineMeasuredStates, i14, -1416626223, false, str$$d, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = ChallengeResult.getDeviceData(408 - (Process.myTid() >> 22), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
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
        getSDKReferenceNumber = -7114512339103398530L;
    }

    public static void init$0() {
        $$a = new byte[]{69, 1, -84, -84};
        $$b = 247;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        String installingPackageName;
        getDeviceData = (getSDKTransactionID + 27) % 128;
        int i11 = Build.VERSION.SDK_INT;
        Application application = this.getSDKAppID;
        if (i11 >= 30) {
            installingPackageName = application.getPackageManager().getInstallSourceInfo(this.getSDKAppID.getPackageName()).getInstallingPackageName();
            getSDKTransactionID = (getDeviceData + 43) % 128;
        } else {
            PackageManager packageManager = application.getPackageManager();
            String packageName = this.getSDKAppID.getPackageName();
            getSDKTransactionID = (getDeviceData + 65) % 128;
            try {
                Object[] objArr = new Object[1];
                b("ꒀꓡ\uf723ˑ心厩灎視ۗᕬꂙ\ueb82\ue093덒왋丠䉍킛搙進Ⱀ滀詻\uf294迹谆⿶哭榷⩸䶈뛕쭦䞴鍪ᤙ딲", ExpandableListView.getPackedPositionGroup(0L), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                b("瓨璏蠺絅⃑Ⱝ⾉홪횾橤\udf0d됊ヴ챃맄ᇡ鈐꾆ᮊ쾰ﱩᇘ\uf5b4굍徑\uf31a偼", TextUtils.getCapsMode("", 0, 0), objArr2);
                installingPackageName = (String) cls.getMethod((String) objArr2[0], String.class).invoke(packageManager, packageName);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        return installingPackageName != null ? DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(installingPackageName)) : new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/packagemanager/GetInstallerPackageName$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static long getSDKAppID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r7, short r8, short r9) {
            /*
                int r9 = r9 * 2
                int r9 = 120 - r9
                int r7 = r7 * 3
                int r7 = r7 + 1
                byte[] r0 = atd.q.AuthenticationRequestParameters.getSDKReferenceNumber.$$a
                int r8 = r8 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r9 = r8
                r5 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                int r8 = r8 + 1
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L2a:
                int r8 = r8 + r3
                r3 = r9
                r9 = r8
                r8 = r3
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.q.AuthenticationRequestParameters.getSDKReferenceNumber.$$c(int, short, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            AuthenticationRequestParameters = 711855261;
            getSDKAppID = 7912114398783468825L;
        }

        private getSDKReferenceNumber() {
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] AuthenticationRequestParameters(android.content.Context r34, int r35, int r36) {
            /*
                Method dump skipped, instruction units count: 1394
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.q.AuthenticationRequestParameters.getSDKReferenceNumber.AuthenticationRequestParameters(android.content.Context, int, int):java.lang.Object[]");
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0166  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(boolean r22, int r23, java.lang.String r24, int r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.q.AuthenticationRequestParameters.getSDKReferenceNumber.a(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
        }

        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            long j9;
            char[] charArray = str != null ? str.toCharArray() : str;
            completed completedVar = new completed();
            char[] sDKTransactionID = completed.getSDKTransactionID(getSDKAppID ^ 2436480605514729170L, charArray, i11);
            completedVar.getSDKTransactionID = 4;
            $11 = ($10 + 21) % 128;
            while (true) {
                int i12 = completedVar.getSDKTransactionID;
                if (i12 >= sDKTransactionID.length) {
                    String str2 = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                    $10 = ($11 + 101) % 128;
                    objArr[0] = str2;
                    return;
                }
                int i13 = i12 - 4;
                completedVar.getSDKAppID = i13;
                try {
                    Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKAppID)};
                    Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(2011691457);
                    if (sDKTransactionID2 == null) {
                        int i14 = 2775 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        char c3 = (char) (13061 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int iResolveSize = View.resolveSize(0, 0) + 25;
                        byte b8 = (byte) 0;
                        byte b11 = (byte) (b8 - 1);
                        j9 = 0;
                        String str$$c = $$c(b8, b11, (byte) (b11 + 1));
                        Class cls = Long.TYPE;
                        sDKTransactionID2 = ChallengeResult.getDeviceData(i14, c3, iResolveSize, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                    } else {
                        j9 = 0;
                    }
                    sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {completedVar, completedVar};
                    Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-721583866);
                    if (sDKTransactionID3 == null) {
                        sDKTransactionID3 = ChallengeResult.getDeviceData(408 - View.combineMeasuredStates(0, 0), (char) View.resolveSize(0, 0), (SystemClock.elapsedRealtimeNanos() > j9 ? 1 : (SystemClock.elapsedRealtimeNanos() == j9 ? 0 : -1)) + 29, 144017174, false, "y", new Class[]{Object.class, Object.class});
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
            $$a = new byte[]{89, 27, 126, -16};
            $$b = 239;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }
}
