package atd.p;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.app.tgtg.model.local.AppConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/NetworkPreference;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkPreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkPreference.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/NetworkPreference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class getAdditionalDetails extends DeviceParameter {
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r6, short r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = 1 - r6
            int r7 = r7 * 2
            int r7 = 120 - r7
            byte[] r0 = atd.p.getAdditionalDetails.$$a
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2f:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.getAdditionalDetails.$$d(int, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        ChallengeResult = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        getSDKAppID();
        PointF.length(0.0f, 0.0f);
        new getSDKReferenceNumber((byte) 0);
        getDeviceData = (ChallengeResult + 21) % 128;
    }

    private getAdditionalDetails(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.AuthenticationRequestParameters = getsdkreferencenumber;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        char c3;
        long j9;
        if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 57) % 128;
        } else {
            charArray = str;
        }
        atd.bb.completed completedVar = new atd.bb.completed();
        char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(getSDKTransactionID ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            $11 = ($10 + 5) % 128;
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKTransactionID)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int i14 = 2775 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    char cIndexOf = (char) (13060 - TextUtils.indexOf("", "", 0, 0));
                    int i15 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 24;
                    byte b8 = (byte) 0;
                    c3 = 0;
                    byte b11 = b8;
                    j9 = 0;
                    String str$$d = $$d(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(i14, cIndexOf, i15, -1416626223, false, str$$d, new Class[]{cls, cls, cls});
                } else {
                    c3 = 0;
                    j9 = 0;
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = completedVar;
                objArr3[c3] = completedVar;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(408 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 31 - (Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1)), 144017174, false, "y", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr3);
                $11 = ($10 + 33) % 128;
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
        getSDKTransactionID = 3884108352601810423L;
    }

    public static void init$0() {
        $$a = new byte[]{47, -93, 7, 60};
        $$b = 63;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        return new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0));
        atd.p.getAdditionalDetails.getSDKReferenceNumber = (atd.p.getAdditionalDetails.getSDKAppID + 95) % 128;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = atd.p.getAdditionalDetails.getSDKAppID
            int r0 = r0 + 119
            int r1 = r0 % 128
            atd.p.getAdditionalDetails.getSDKReferenceNumber = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r5.AuthenticationRequestParameters
            java.lang.String r2 = "謰譞垌듌鞗冩㾺ߋ隢㡇̜ꃾ鉨ꮳ躾呓⻩\udf1f㷊\ud9e7뤃䊜"
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L2b
            int r0 = android.graphics.ImageFormat.getBitsPerPixel(r4)
            int r0 = -r0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            b(r2, r0, r4)
            r0 = r4[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L54
            goto L43
        L2b:
            int r0 = android.graphics.ImageFormat.getBitsPerPixel(r3)
            int r0 = -r0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            b(r2, r0, r4)
            r0 = r4[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L54
        L43:
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            int r1 = atd.p.getAdditionalDetails.getSDKAppID
            int r1 = r1 + 95
            int r1 = r1 % 128
            atd.p.getAdditionalDetails.getSDKReferenceNumber = r1
            return r0
        L54:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.getAdditionalDetails.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/NetworkPreference$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static char[] getDeviceData;
        private static char[] getSDKReferenceNumber;
        private static long getSDKTransactionID;

        private static String $$c(byte b8, short s7, byte b11) {
            int i11 = s7 * 3;
            int i12 = 110 - b11;
            byte[] bArr = $$a;
            int i13 = b8 + 4;
            byte[] bArr2 = new byte[i11 + 1];
            int i14 = -1;
            if (bArr == null) {
                i12 = i13 + (-i11);
                i13 = i13;
            }
            while (true) {
                i14++;
                bArr2[i14] = (byte) i12;
                if (i14 == i11) {
                    return new String(bArr2, 0);
                }
                int i15 = i13 + 1;
                i12 += -bArr[i15];
                i13 = i15;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getDeviceData = new char[]{62564, 23325, 43676, 64057, 18878, 39194, 59601, 14453, 36861, 57209, 11784, 32129, 52514, 7357, 27676, 46017, 859, 21224, 41570, 61782, 16542, 36961, 59378, 14080, 34448, 54900, 9647, 30008, 50246, 11188, 31520, 51881, 6688, 27103, 47427, 2280, 22631, 44824, 51223, 26472, 38541, 50755, 30194, 42250, 54410, 1061, 45997, 58162, 4608, 16886, 61801, 8444, 20509, 36765, 16216, 28297, 40557, 52579, 31954, 44138, 56298, 2821, 47757, 59922, 6636, 18705, 63505, 6123, 18267, 62569, 23321, 43678, 64008, 18855, 39255, 59593, 14449, 36857, 57193, 11831, 32137, 52536, 7333, 27733, 46021, 860, 62589, 23317, 43661, 64054, 18855, 39232, 59607, 14434, 36859, 57215, 53398, 32751, 36462, 57035, 27930, 48565, 52277, 7297, 43801, 64396, 2785, 22894, 59869, 14360, 18595, 38711, 10158, 30234, 34518, 54729, 25713, 46292, 49988, 5035, 41514, 62135, 267, 20891, 57584, 3955, 24550, 61011, 16095, 19770, 40375, 11288, 31885, 62569, 23321, 43678, 64017, 18856, 39239, 59606, 14449, 36848, 57199, 11807, 62569, 23321, 43652, 64061, 18868, 39253, 59606, 14453, 36829, 57193, 11784, 32156, 52543, 7330, 27739, 46019, 847, 21224, 41583, 49155, 28538, 40699, 52830, 32143, 44320, 56480, 3092, 48012, 60185, 6772, 18939, 63816, 10381, 22582, 34722, 14139, 26255, 38467, 50503, 29876, 41987, 54172, 788, 45756, 57913, 4489, 16646, 61559, 8170, 20310, 65222, 11869, 23998, 56433, 29441, 33414, 53779, 25003, 45390, 49360, 4205, 42981, 63328, 1594, 21957, 58750, 13548, 17530, 39882, 11103, 31466, 35441, 55561, 26766, 47149, 53174};
            getSDKTransactionID = -887145531356456068L;
            getSDKReferenceNumber = new char[]{63420, 63457, 63460, 63468, 63451, 63421, 63437, 63465, 63459, 63487, 63460, 63462, 63448, 63408, 63434, 63431, 63416, 63431, 63465, 63459, 63487, 63460, 63462, 63448, 63408, 63433, 63410, 63408, 63451, 63430, 63439, 63414, 63487, 63459, 63465, 63430, 63431, 63462, 63457, 63486, 63459, 63462, 63486, 63454, 63415, 63446, 63457, 63486, 63459, 63457, 63481, 63461, 63464, 63462, 63129, 63112, 63110, 63112, 63104, 63116, 63359, 63112, 63110, 63116, 63106, 63114, 63116, 63357, 63414, 63460, 63465, 63467, 63464, 63464, 63448, 63446, 63465, 63467, 63465, 63464, 63469, 63447, 63408, 63426, 63457, 63424, 63454, 63486, 63462, 63459, 63486, 63457, 63462, 63431, 63430, 63465, 63459, 63487, 63460, 63462, 63464, 63418, 63465, 63467, 63465, 63448, 63444, 63461, 63461, 63460, 63465, 63459, 63469, 63447, 63469, 63463, 63327, 63324, 63297, 63300, 63324, 63292, 63294, 63327, 63264, 63278, 63285, 63307, 63302, 63303, 63305, 63303, 63286, 63282, 63299, 63299, 63301, 63302, 63300, 63298, 63325, 63297, 63303, 63268, 63269, 63466, 63306, 63308, 63309, 63323, 63421, 63460, 63484, 63483, 63461, 63464, 63461, 63463, 63441, 63439, 63426, 63457, 63424, 63454, 63486, 63462, 63459, 63486, 63457, 63462, 63431, 63430, 63465, 63459, 63487, 63460, 63462, 63464, 63413, 63486, 63447, 63442, 63481, 63459, 63452, 63446, 63485, 63462, 63458};
        }

        private getSDKReferenceNumber() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v14 */
        public static Object[] AuthenticationRequestParameters(Context context, int i11, int i12) {
            int i13 = 1;
            int i14 = 0;
            if (context == null) {
                Object[] objArr = {new int[]{i11}, new int[]{i ^ (i << 5)}, new int[]{i11}, null};
                int i15 = ~i11;
                int iA = l1.a((~(i11 | (-76155816))) | (~(i15 | 106370893)), AppConstants.REQUEST_CODE_ORDER_VIEW, (((~((-76155816) | i15)) | (~(i11 | 106370893))) * AppConstants.REQUEST_CODE_ORDER_VIEW) + 1654213423, i12);
                int i16 = iA ^ (iA << 13);
                int i17 = i16 ^ (i16 >>> 17);
                return objArr;
            }
            try {
                Object[] objArr2 = new Object[1];
                a(TextUtils.indexOf("", ""), (char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 39, objArr2);
                Object[] objArr3 = (Object[]) Array.newInstance(Class.forName(((String) objArr2[0]).intern()), 2);
                float f11 = 0.0f;
                Object[] objArr4 = new Object[1];
                a(38 - ExpandableListView.getPackedPositionType(0L), (char) (15450 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 30, objArr4);
                try {
                    Object[] objArr5 = {((String) objArr4[0]).intern()};
                    Object[] objArr6 = new Object[1];
                    a(KeyEvent.getMaxKeyCode() >> 16, (char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 39, objArr6);
                    objArr3[0] = Class.forName(((String) objArr6[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr5);
                    Object[] objArr7 = new Object[1];
                    b("\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, new int[]{0, 31, 0, 0}, objArr7);
                    try {
                        Object[] objArr8 = {((String) objArr7[0]).intern()};
                        Object[] objArr9 = new Object[1];
                        a(TextUtils.lastIndexOf("", '0') + 1, (char) (Process.myPid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 38, objArr9);
                        objArr3[1] = Class.forName(((String) objArr9[0]).intern()).getDeclaredConstructor(String.class).newInstance(objArr8);
                        try {
                            char c3 = 23;
                            Object[] objArr10 = new Object[1];
                            b("\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", false, new int[]{31, 23, 0, 20}, objArr10);
                            Class<?> cls = Class.forName(((String) objArr10[0]).intern());
                            Object[] objArr11 = new Object[1];
                            a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 68, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 17 - TextUtils.indexOf("", "", 0), objArr11);
                            Object objInvoke = cls.getMethod(((String) objArr11[0]).intern(), null).invoke(context, null);
                            try {
                                Object[] objArr12 = new Object[1];
                                b("\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", false, new int[]{31, 23, 0, 20}, objArr12);
                                Class<?> cls2 = Class.forName(((String) objArr12[0]).intern());
                                Object[] objArr13 = new Object[1];
                                b(null, true, new int[]{54, 14, 162, 3}, objArr13);
                                try {
                                    Object[] objArr14 = {cls2.getMethod(((String) objArr13[0]).intern(), null).invoke(context, null), 64};
                                    Object[] objArr15 = new Object[1];
                                    b("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, new int[]{68, 33, 0, 0}, objArr15);
                                    Class<?> cls3 = Class.forName(((String) objArr15[0]).intern());
                                    Object[] objArr16 = new Object[1];
                                    b("\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000", false, new int[]{101, 14, 0, 8}, objArr16);
                                    Object objInvoke2 = cls3.getMethod(((String) objArr16[0]).intern(), String.class, Integer.TYPE).invoke(objInvoke, objArr14);
                                    Object[] objArr17 = new Object[1];
                                    b("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001", false, new int[]{115, 30, 98, 21}, objArr17);
                                    Class<?> cls4 = Class.forName(((String) objArr17[0]).intern());
                                    Object[] objArr18 = new Object[1];
                                    a(86 - TextUtils.getOffsetAfter("", 0), (char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, objArr18);
                                    Object[] objArr19 = (Object[]) cls4.getField(((String) objArr18[0]).intern()).get(objInvoke2);
                                    int length = objArr19.length;
                                    int i18 = 0;
                                    while (i18 < length) {
                                        Object obj = objArr19[i18];
                                        char c7 = c3;
                                        Object[] objArr20 = new Object[i13];
                                        b("\u0000\u0001\u0001\u0001\u0000", i13, new int[]{145, 5, 145, i14}, objArr20);
                                        try {
                                            Object[] objArr21 = {((String) objArr20[i14]).intern()};
                                            float f12 = f11;
                                            Object[] objArr22 = new Object[i13];
                                            a((PointF.length(f12, f12) > f12 ? 1 : (PointF.length(f12, f12) == f12 ? 0 : -1)) + 96, (char) (9458 - TextUtils.getCapsMode("", i14, i14)), 37 - (ViewConfiguration.getTouchSlop() >> 8), objArr22);
                                            Class<?> cls5 = Class.forName(((String) objArr22[i14]).intern());
                                            int i19 = i14;
                                            Object[] objArr23 = new Object[i13];
                                            a(TextUtils.indexOf("", "", i14) + 133, (char) Color.argb(i14, i14, i14, i14), (ViewConfiguration.getPressedStateDuration() >> 16) + 11, objArr23);
                                            Object objInvoke3 = cls5.getMethod(((String) objArr23[i19]).intern(), String.class).invoke(null, objArr21);
                                            try {
                                                Object[] objArr24 = new Object[i13];
                                                b("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", i13, new int[]{150, 28, i19, i19}, objArr24);
                                                Class<?> cls6 = Class.forName(((String) objArr24[i19]).intern());
                                                Object[] objArr25 = objArr19;
                                                Object[] objArr26 = new Object[1];
                                                b("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", false, new int[]{178, 11, 0, 0}, objArr26);
                                                try {
                                                    Object[] objArr27 = {new ByteArrayInputStream((byte[]) cls6.getMethod(((String) objArr26[0]).intern(), null).invoke(obj, null))};
                                                    Object[] objArr28 = new Object[1];
                                                    a(MotionEvent.axisFromString("") + 97, (char) (9458 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (Process.myPid() >> 22) + 37, objArr28);
                                                    Class<?> cls7 = Class.forName(((String) objArr28[0]).intern());
                                                    Object[] objArr29 = new Object[1];
                                                    a(((byte) KeyEvent.getModifierMetaStateMask()) + 145, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 18 - ImageFormat.getBitsPerPixel(0), objArr29);
                                                    Object objInvoke4 = cls7.getMethod(((String) objArr29[0]).intern(), InputStream.class).invoke(objInvoke3, objArr27);
                                                    for (int i21 = 0; i21 < 2; i21++) {
                                                        Object obj2 = objArr3[i21];
                                                        try {
                                                            Object[] objArr30 = new Object[1];
                                                            a(163 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13415), 34 - Color.blue(0), objArr30);
                                                            Class<?> cls8 = Class.forName(((String) objArr30[0]).intern());
                                                            Object[] objArr31 = new Object[1];
                                                            a(197 - ExpandableListView.getPackedPositionType(0L), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10263), 23 - (Process.myTid() >> 22), objArr31);
                                                            if (obj2.equals(cls8.getMethod(((String) objArr31[0]).intern(), null).invoke(objInvoke4, null))) {
                                                                Object[] objArr32 = {new int[]{i11}, new int[1], new int[]{i11 ^ 1}, null};
                                                                int iNextInt = new Random().nextInt();
                                                                int i22 = ~iNextInt;
                                                                int iD = a0.D((~(846004734 | i22)) | (-1064248832), 859, (((~(iNextInt | (-218244098))) | (~(1028531443 | i22))) * 859) + (((iNextInt | 1028531443) * (-859)) - 203632390), 16, i12);
                                                                int i23 = iD ^ (iD << 13);
                                                                int i24 = i23 ^ (i23 >>> 17);
                                                                ((int[]) objArr32[1])[0] = i24 ^ (i24 << 5);
                                                                return objArr32;
                                                            }
                                                        } catch (Throwable th2) {
                                                            Throwable cause = th2.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    i18++;
                                                    c3 = c7;
                                                    objArr19 = objArr25;
                                                    i13 = 1;
                                                    i14 = 0;
                                                    f11 = 0.0f;
                                                } catch (Throwable th3) {
                                                    Throwable cause2 = th3.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (Throwable th4) {
                                                Throwable cause3 = th4.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th4;
                                            }
                                        } catch (Throwable th5) {
                                            Throwable cause4 = th5.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th5;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    Throwable cause5 = th6.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                Throwable cause6 = th7.getCause();
                                if (cause6 != null) {
                                    throw cause6;
                                }
                                throw th7;
                            }
                        } catch (Throwable th8) {
                            Throwable cause7 = th8.getCause();
                            if (cause7 != null) {
                                throw cause7;
                            }
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        Throwable cause8 = th9.getCause();
                        if (cause8 != null) {
                            throw cause8;
                        }
                        throw th9;
                    }
                } catch (Throwable th10) {
                    Throwable cause9 = th10.getCause();
                    if (cause9 != null) {
                        throw cause9;
                    }
                    throw th10;
                }
            } catch (Throwable unused) {
            }
            Object[] objArr33 = {new int[]{i11}, new int[]{i ^ (i << 5)}, new int[]{i11}, null};
            int iA2 = l1.a((~((~i11) | 719688115)) | (-522396956), 398, (((~(719688115 | i11)) | (-522396956)) * 398) + 852787604, i12);
            int i25 = iA2 ^ (iA2 << 13);
            int i26 = i25 ^ (i25 >>> 17);
            return objArr33;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x02cb  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x02cc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r32, char r33, int r34, java.lang.Object[] r35) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 727
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.p.getAdditionalDetails.getSDKReferenceNumber.a(int, char, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00f3, code lost:
        
            r0 = r0[r7];
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00f7, code lost:
        
            r1 = new java.lang.Object[r28];
            r1[1] = java.lang.Integer.valueOf(r5);
            r1[0] = java.lang.Integer.valueOf(r0);
            r0 = atd.e.ChallengeResult.getSDKTransactionID(788825057);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x010d, code lost:
        
            if (r0 != null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x010f, code lost:
        
            r0 = (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3095;
            r2 = (char) (14367 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
            r20 = android.widget.ExpandableListView.getPackedPositionGroup(0) + 18;
            r4 = (byte) (-atd.p.getAdditionalDetails.getSDKReferenceNumber.$$a[1]);
            r5 = (byte) (r4 + 1);
            r0 = atd.e.ChallengeResult.getDeviceData(r0, r2, r20, -210991631, false, $$c(r4, r5, (byte) (r5 + 2)), new java.lang.Class[]{r12, r12});
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0158, code lost:
        
            r3[r7] = ((java.lang.Character) ((java.lang.reflect.Method) r0).invoke(null, r1)).charValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x015a, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(java.lang.String r28, boolean r29, int[] r30, java.lang.Object[] r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 751
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.p.getAdditionalDetails.getSDKReferenceNumber.b(java.lang.String, boolean, int[], java.lang.Object[]):void");
        }

        public static void init$0() {
            $$a = new byte[]{69, 1, -84, -84};
            $$b = AppConstants.PERMISSIONS_REQUEST_USE_LOCATION;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }

    public /* synthetic */ getAdditionalDetails(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
