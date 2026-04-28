package atd.n;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Manufacturer;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig extends DeviceParameter {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResult = 1;
    private static int ChallengeResultCancelled = 1;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static byte[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        getSDKAppID();
        AudioTrack.getMaxVolume();
        View.resolveSize(0, 0);
        Color.alpha(0);
        SystemClock.elapsedRealtimeNanos();
        MotionEvent.axisFromString("");
        new getSDKReferenceNumber((byte) 0);
        int i11 = getMessageVersion + 81;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @NotNull
    private static String AuthenticationRequestParameters() {
        getSDKTransactionID = (ChallengeResultCancelled + 101) % 128;
        String str = Build.MANUFACTURER;
        str.getClass();
        String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(str);
        ChallengeResultCancelled = (getSDKTransactionID + 79) % 128;
        return strM165constructorimpl;
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = 1878169416;
        getSDKReferenceNumber = 829166627;
        getDeviceData = 780127470;
        getSDKAppID = new byte[]{39, -70, ByteCompanionObject.MIN_VALUE, -82};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        ChallengeResultCancelled = (getSDKTransactionID + 115) % 128;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(AuthenticationRequestParameters());
        int i11 = ChallengeResultCancelled + 87;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 76 / 0;
        }
        return stringValueM164boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Manufacturer$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static long AuthenticationRequestParameters;
        private static int getDeviceData;
        private static int getSDKAppID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(byte r6, byte r7, short r8) {
            /*
                int r6 = r6 * 2
                int r6 = 120 - r6
                byte[] r0 = atd.n.BuildConfig.getSDKReferenceNumber.$$c
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r8 = r8 * 4
                int r8 = r8 + 1
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r6 = r7
                r4 = r8
                r3 = r2
                goto L2a
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r5
            L2a:
                int r7 = r7 + r4
                int r6 = r6 + 1
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.n.BuildConfig.getSDKReferenceNumber.$$e(byte, byte, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            getSDKAppID = 1;
            AuthenticationRequestParameters = -9005271962927632389L;
        }

        private getSDKReferenceNumber() {
        }

        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            if (str != null) {
                int i12 = $10 + 63;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            atd.bb.completed completedVar = new atd.bb.completed();
            char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(AuthenticationRequestParameters ^ 2436480605514729170L, charArray, i11);
            completedVar.getSDKTransactionID = 4;
            $10 = ($11 + 77) % 128;
            while (true) {
                int i13 = completedVar.getSDKTransactionID;
                if (i13 >= sDKTransactionID.length) {
                    objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                    return;
                }
                int i14 = i13 - 4;
                completedVar.getSDKAppID = i14;
                try {
                    Object[] objArr2 = {Long.valueOf(sDKTransactionID[i13] ^ sDKTransactionID[i13 % 4]), Long.valueOf(i14), Long.valueOf(AuthenticationRequestParameters)};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                    if (sDKTransactionID2 == null) {
                        int iArgb = Color.argb(0, 0, 0, 0) + 2774;
                        char packedPositionType = (char) (13060 - ExpandableListView.getPackedPositionType(0L));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 25;
                        byte b8 = (byte) 0;
                        byte b11 = b8;
                        String str$$e = $$e(b8, b11, b11);
                        Class cls = Long.TYPE;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iArgb, packedPositionType, absoluteGravity, -1416626223, false, str$$e, new Class[]{cls, cls, cls});
                    }
                    sDKTransactionID[i13] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {completedVar, completedVar};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                    if (sDKTransactionID3 == null) {
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(408 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
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

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.n.BuildConfig.getSDKReferenceNumber.$$a
                int r6 = r6 * 2
                int r6 = 104 - r6
                int r7 = r7 + 4
                int r8 = r8 * 4
                int r1 = r8 + 4
                byte[] r1 = new byte[r1]
                int r8 = r8 + 3
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r4 = r2
                r0 = r7
                goto L30
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                int r7 = r7 + 1
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r0
                r0 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L30:
                int r7 = -r7
                int r6 = r6 + r7
                int r6 = r6 + (-2)
                r7 = r0
                r0 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.n.BuildConfig.getSDKReferenceNumber.b(int, short, short, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKAppID(int r28, int r29) {
            /*
                Method dump skipped, instruction units count: 1386
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.n.BuildConfig.getSDKReferenceNumber.getSDKAppID(int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{80, -63, 35, 89, -3, 3, -3};
            $$b = 161;
        }

        public static void init$1() {
            $$c = new byte[]{4, -104, 18, -33};
            $$d = 254;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }
}
