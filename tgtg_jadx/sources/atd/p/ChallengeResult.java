package atd.p;

import android.app.Application;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DevelopmentSettingsEnabled;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDevelopmentSettingsEnabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DevelopmentSettingsEnabled.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DevelopmentSettingsEnabled\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class ChallengeResult extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r7, int r8, int r9) {
        /*
            byte[] r0 = atd.p.ChallengeResult.$$a
            int r9 = r9 * 3
            int r9 = 1 - r9
            int r8 = r8 * 3
            int r8 = r8 + 120
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResult.$$d(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        BuildConfig = 1;
        getDeviceData = 0;
        getSDKAppID = 1;
        getSDKAppID();
        TextUtils.getOffsetBefore("", 0);
        new getSDKAppID((byte) 0);
        AuthenticationRequestParameters = (BuildConfig + 27) % 128;
    }

    private ChallengeResult(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = getsdkreferencenumber;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        long j9;
        int i12 = $11 + 61;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.completed completedVar = new atd.bb.completed();
        char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(getSDKReferenceNumber ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i13 = completedVar.getSDKTransactionID;
            if (i13 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            $10 = ($11 + 93) % 128;
            int i14 = i13 - 4;
            completedVar.getSDKAppID = i14;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i13] ^ sDKTransactionID[i13 % 4]), Long.valueOf(i14), Long.valueOf(getSDKReferenceNumber)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 2774;
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13060);
                    int i15 = 24 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte b8 = (byte) 0;
                    j9 = 0;
                    byte b11 = b8;
                    String str$$d = $$d(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(pressedStateDuration, scrollBarFadeDuration, i15, -1416626223, false, str$$d, new Class[]{cls, cls, cls});
                } else {
                    j9 = 0;
                }
                sDKTransactionID[i13] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(408 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) View.combineMeasuredStates(0, 0), 29 - ExpandableListView.getPackedPositionChild(j9), 144017174, false, "y", new Class[]{Object.class, Object.class});
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
        getSDKReferenceNumber = -1408773218186851886L;
    }

    public static void init$0() {
        $$a = new byte[]{ByteCompanionObject.MAX_VALUE, -77, -86, -36};
        $$b = 227;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[PHI: r0
      0x0041: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v17 java.lang.String) binds: [B:8:0x003f, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = atd.p.ChallengeResult.getSDKAppID
            int r0 = r0 + 3
            int r1 = r0 % 128
            atd.p.ChallengeResult.getDeviceData = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r5.getSDKTransactionID
            java.lang.String r2 = "⏐靏춻\uec07⎴頪폍셢ᾼ\udc20韋蕪宵အ寏䥘鞣吪῏൳펹校쏜\uf174ྏ갪蟕땦䮲\ue023䯞祣"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L2a
            int r0 = android.view.View.resolveSizeAndState(r3, r3, r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r2, r0, r3)
            r0 = r3[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L60
            goto L41
        L2a:
            int r0 = android.view.View.resolveSizeAndState(r4, r4, r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r2, r0, r3)
            r0 = r3[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L60
        L41:
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            if (r0 == 0) goto L60
            int r1 = atd.p.ChallengeResult.getDeviceData
            int r1 = r1 + 95
            int r2 = r1 % 128
            atd.p.ChallengeResult.getSDKAppID = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L5b
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = w.a0.h(r0)
            r1 = 74
            int r1 = r1 / r4
            return r0
        L5b:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = w.a0.h(r0)
            return r0
        L60:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResult.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DevelopmentSettingsEnabled$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static char[] AuthenticationRequestParameters;
        private static int getDeviceData;
        private static char getSDKAppID;
        private static int getSDKReferenceNumber;
        private static char[] getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(byte r7, int r8, int r9) {
            /*
                int r7 = r7 * 3
                int r7 = r7 + 1
                int r8 = r8 + 4
                byte[] r0 = atd.p.ChallengeResult.getSDKAppID.$$c
                int r9 = 122 - r9
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r9 = r8
                r3 = r0
                r5 = r2
                r0 = r7
                goto L2b
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L22
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L22:
                int r8 = r8 + 1
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r0
                r0 = r6
            L2b:
                int r8 = r8 + r0
                r0 = r9
                r9 = r8
                r8 = r0
                r0 = r3
                r3 = r5
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResult.getSDKAppID.$$e(byte, int, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKReferenceNumber = 0;
            getDeviceData = 1;
            AuthenticationRequestParameters = new char[]{30895, 30884, 30911, 30883, 30899, 30967, 30898, 30882, 30887, 30896, 30891, 30908, 30880, 30892, 30885, 30900, 30910, 30890, 30897, 30902, 30888, 30952, 30881, 30886, 30903, 30866, 30894, 30955, 31580, 30893, 30889, 30873, 30901, 30965, 30953, 30960};
            getSDKAppID = (char) 19802;
            getSDKTransactionID = new char[]{63466, 63324, 63314, 63319, 63296, 63325, 63421, 63460, 63485, 63487, 63425, 63424, 63486, 63487, 63462, 63459, 63459, 63460, 63454, 63455, 63481, 63481, 63484, 63459, 63462, 63426, 63426, 63464, 63464, 63486, 63458, 63468, 63469, 63460, 63483, 63484, 63235, 63124, 63125, 63131, 63128, 63125, 63150, 63121, 63129, 63128, 63347, 63118, 63148, 63420, 63461, 63460, 63459, 63486, 63462, 63261, 63139, 63163, 63166, 63143, 63147, 63140, 63420, 63466, 63468, 63461, 63459, 63460, 63483, 63458, 63460, 63419, 63460, 63460, 63465, 63461, 63455, 63429, 63457, 63460, 63468, 63467, 63431, 63455, 63415, 63456, 63486, 63486, 63459, 63486, 63339, 63341, 63339, 63342, 63316, 63315, 63311, 63304, 63342, 63413, 63484, 63460, 63462, 63457, 63485, 63486, 63408, 63476, 63484, 63487, 63457, 63487, 63486, 63484, 63480, 63456, 63458, 63479, 63479, 63477, 63482, 63484, 63474, 63484, 63483, 63474, 63465, 63297, 63327, 63319, 63312, 63312, 63419, 63457, 63461, 63463, 63461, 63467, 63469, 63462, 63484, 63482, 63338, 63305, 63299, 63333, 63343, 63318, 63316, 63342, 63312, 63416, 63461, 63461, 63460, 63467, 63468, 63465, 63460, 63463, 63470, 63462, 63460, 63487, 63485, 63486, 63421, 63459, 63454, 63454, 63459, 63429, 63454, 63481, 63481, 63454, 63429, 63467, 63461, 63487, 63461, 63461, 63462, 63429, 63452, 63481, 63486, 63460, 63461, 63244, 63118, 63342, 63334, 63115, 63119, 63118, 63341, 63334, 63108, 63117, 63117, 63107, 63107, 63334, 63336, 63110, 63432, 63236, 63239, 63246, 63473, 63468, 63465, 63416, 63460, 63466, 63461, 63454, 63425, 63462, 63459, 63484, 63481, 63481, 63454, 63460, 63350, 63121, 63121, 63124, 63131, 63134, 63353, 63348, 63130, 63106, 63132, 63384, 63455, 63487, 63462, 63462, 63462, 63458, 63453, 63425, 63460, 63466, 63310, 63293, 63475, 63295, 63414, 63487, 63425, 63431, 63460, 63456, 63461, 63463, 63430, 63428, 63460, 63486, 63484, 63414, 63484, 63486, 63457, 63460, 63460, 63461, 63414, 63455, 63454, 63484, 63457, 63457, 63485, 63460, 63461, 63486, 63484, 63459, 63467, 63468, 63469, 63471, 63462, 63486, 63456, 63487, 63455, 63455, 63481, 63384, 63426, 63465, 63469, 63462, 63458, 63426, 63431, 63461, 63461, 63469, 63430, 63422, 63431, 63426, 63465, 63469, 63462, 63458, 63426, 63431, 63461, 63461, 63469, 63430, 63392, 63425, 63460, 63482, 63332, 63325, 63287, 63320, 63355, 63329, 63353, 63315, 63321, 63328, 63332, 63357, 63353, 63321, 63326, 63356, 63413, 63459, 63462, 63425, 63431, 63466, 63460, 63425, 63393, 63430, 63457, 63481, 63454, 63392, 63454, 63481, 63481, 63384, 63454, 63481, 63481, 63484, 63459, 63462, 63425, 63431, 63466, 63460, 63425, 63429, 63468, 63466, 63461, 63456, 63461, 63468, 63466, 63429, 63414, 63481, 63481, 63484, 63459, 63462, 63425, 63452, 63458, 63466, 63460, 63425, 63392, 63462, 63324, 63326, 63326, 63325, 63297, 63265, 63269, 63302, 63303, 63299, 63294, 63270, 63302, 63327, 63326, 63264, 63386, 63435, 63428, 63420, 63393, 63434, 63384, 63454, 63484, 63486, 63486, 63485, 63457, 63411, 63457, 63465, 63461, 63458, 63456, 63424, 63452, 63481, 63486, 63460, 63461, 63463, 63459, 63454, 63454, 63459, 63429, 63454, 63481, 63481, 63454};
        }

        private getSDKAppID() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = 8 - r8
                int r6 = r6 * 2
                int r6 = 4 - r6
                byte[] r0 = atd.p.ChallengeResult.getSDKAppID.$$a
                int r7 = r7 + 101
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r7
                r4 = r2
                r7 = r6
                goto L25
            L13:
                r3 = r2
            L14:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L23:
                r3 = r0[r8]
            L25:
                int r7 = r7 + r3
                int r7 = r7 + (-22)
                int r8 = r8 + 1
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResult.getSDKAppID.a(byte, int, short, java.lang.Object[]):void");
        }

        private static void b(String str, int i11, byte b8, Object[] objArr) throws Throwable {
            int i12;
            long j9;
            char c3;
            char c7;
            char c8;
            int i13;
            int i14;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
            char[] cArr = AuthenticationRequestParameters;
            Class cls = Integer.TYPE;
            int i15 = -317146529;
            int i16 = 6;
            int i17 = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i18 = 0;
                while (i18 < length) {
                    $10 = ($11 + 117) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i18])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i15);
                        if (sDKTransactionID == null) {
                            int threadPriority = ((Process.getThreadPriority(i17) + 20) >> i16) + 2158;
                            i13 = i15;
                            char gidForName = (char) (Process.getGidForName("") + 1);
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36;
                            i14 = i16;
                            byte b11 = (byte) $$d;
                            byte b12 = (byte) (b11 - 1);
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(threadPriority, gidForName, keyRepeatTimeout, 829471823, false, $$e(b11, b12, (byte) (b12 & 57)), new Class[]{cls});
                        } else {
                            i13 = i15;
                            i14 = i16;
                        }
                        cArr2[i18] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i18++;
                        $10 = ($11 + 63) % 128;
                        i15 = i13;
                        i16 = i14;
                        i17 = 0;
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
            int i19 = i15;
            int i21 = i16;
            Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i19);
            long j11 = 0;
            if (sDKTransactionID2 == null) {
                int packedPositionChild = 2157 - ExpandableListView.getPackedPositionChild(0L);
                char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i22 = 35 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte b13 = (byte) $$d;
                byte b14 = (byte) (b13 - 1);
                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(packedPositionChild, scrollDefaultDelay, i22, 829471823, false, $$e(b13, b14, (byte) (b14 & 57)), new Class[]{cls});
            }
            char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i11];
            if (i11 % 2 != 0) {
                i12 = i11 - 1;
                cArr3[i12] = (char) (charArray[i12] - b8);
            } else {
                i12 = i11;
            }
            if (i12 > 1) {
                $11 = ($10 + 87) % 128;
                challengeResultKt.getSDKReferenceNumber = 0;
                while (true) {
                    int i23 = challengeResultKt.getSDKReferenceNumber;
                    if (i23 >= i12) {
                        break;
                    }
                    char c11 = charArray[i23];
                    challengeResultKt.getDeviceData = c11;
                    char c12 = charArray[i23 + 1];
                    challengeResultKt.getSDKAppID = c12;
                    if (c11 == c12) {
                        $11 = ($10 + 83) % 128;
                        cArr3[i23] = (char) (c11 - b8);
                        cArr3[i23 + 1] = (char) (c12 - b8);
                        j9 = j11;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = challengeResultKt;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = challengeResultKt;
                        objArr4[9] = challengeResultKt;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = challengeResultKt;
                        objArr4[i21] = challengeResultKt;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = challengeResultKt;
                        objArr4[3] = challengeResultKt;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = challengeResultKt;
                        j9 = j11;
                        objArr4[0] = challengeResultKt;
                        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                        if (sDKTransactionID3 == null) {
                            int edgeSlop = 1258 - (ViewConfiguration.getEdgeSlop() >> 16);
                            c3 = '\n';
                            char c13 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > j9 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j9 ? 0 : -1)) + 34414);
                            int iResolveSize = View.resolveSize(0, 0) + 41;
                            byte b15 = (byte) $$d;
                            c7 = 2;
                            byte b16 = (byte) (b15 - 1);
                            c8 = '\t';
                            String str$$e = $$e(b15, b16, (byte) (b16 & 55));
                            Class cls2 = Integer.TYPE;
                            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(edgeSlop, c13, iResolveSize, -307955329, false, str$$e, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                        } else {
                            c3 = '\n';
                            c7 = 2;
                            c8 = '\t';
                        }
                        int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                        int i24 = challengeResultKt.ChallengeResultCancelled;
                        if (iIntValue == i24) {
                            Object[] objArr5 = new Object[11];
                            objArr5[c3] = challengeResultKt;
                            objArr5[c8] = Integer.valueOf(cCharValue);
                            objArr5[8] = challengeResultKt;
                            objArr5[7] = Integer.valueOf(cCharValue);
                            objArr5[i21] = Integer.valueOf(cCharValue);
                            objArr5[5] = challengeResultKt;
                            objArr5[4] = challengeResultKt;
                            objArr5[3] = Integer.valueOf(cCharValue);
                            objArr5[c7] = Integer.valueOf(cCharValue);
                            objArr5[1] = challengeResultKt;
                            objArr5[0] = challengeResultKt;
                            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                            if (sDKTransactionID4 == null) {
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 2224;
                                char keyRepeatTimeout2 = (char) (53070 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                int i25 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 20;
                                int i26 = $$d;
                                byte b17 = (byte) i26;
                                String str$$e2 = $$e(b17, (byte) (b17 - 1), (byte) i26);
                                Class cls3 = Integer.TYPE;
                                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(iIndexOf, keyRepeatTimeout2, i25, 246098488, false, str$$e2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                            int i27 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                            int i28 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i28] = cArr[iIntValue2];
                            cArr3[i28 + 1] = cArr[i27];
                        } else {
                            int i29 = challengeResultKt.AuthenticationRequestParameters;
                            int i31 = challengeResultKt.getSDKTransactionID;
                            int i32 = challengeResultKt.getMessageVersion;
                            if (i29 == i31) {
                                int iC = k.c(i32, cCharValue, 1, cCharValue);
                                challengeResultKt.getMessageVersion = iC;
                                int iC2 = k.c(i24, cCharValue, 1, cCharValue);
                                challengeResultKt.ChallengeResultCancelled = iC2;
                                int i33 = (i31 * cCharValue) + iC2;
                                int i34 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i34] = cArr[(i29 * cCharValue) + iC];
                                cArr3[i34 + 1] = cArr[i33];
                            } else {
                                int i35 = (i29 * cCharValue) + i24;
                                int i36 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i36] = cArr[i35];
                                cArr3[i36 + 1] = cArr[(i31 * cCharValue) + i32];
                            }
                            challengeResultKt.getSDKReferenceNumber += 2;
                            j11 = j9;
                        }
                    }
                    challengeResultKt.getSDKReferenceNumber += 2;
                    j11 = j9;
                }
            }
            for (int i37 = 0; i37 < i11; i37++) {
                cArr3[i37] = (char) (cArr3[i37] ^ 13722);
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00f3 A[PHI: r7
          0x00f3: PHI (r7v4 char) = (r7v3 char), (r7v17 char) binds: [B:34:0x00f1, B:31:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0157  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(java.lang.String r28, boolean r29, int[] r30, java.lang.Object[] r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 616
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResult.getSDKAppID.c(java.lang.String, boolean, int[], java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:141:0x10fe  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x1251  */
        /* JADX WARN: Removed duplicated region for block: B:208:0x17a4  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x1b03  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x1b06 A[Catch: Exception -> 0x1b03, TRY_LEAVE, TryCatch #14 {Exception -> 0x1b03, blocks: (B:230:0x1a50, B:239:0x1acc, B:241:0x1af3, B:244:0x1afd, B:248:0x1b06, B:256:0x1b86, B:259:0x1bb2, B:267:0x1c30, B:269:0x1c36, B:270:0x1c39, B:272:0x1c3f, B:273:0x1c40, B:274:0x1c41, B:276:0x1c47, B:277:0x1c48, B:278:0x1c49, B:280:0x1c4f, B:281:0x1c50, B:260:0x1bd9, B:262:0x1be3, B:265:0x1c25, B:249:0x1b2b, B:251:0x1b35, B:254:0x1b7d, B:231:0x1a73, B:233:0x1a7d, B:236:0x1ac0), top: B:526:0x1a50, inners: #3, #10, #13 }] */
        /* JADX WARN: Removed duplicated region for block: B:311:0x2101  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0530  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x061f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0723  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object[] getSDKAppID$712102a0(int r83, java.lang.Object r84) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 13363
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.p.ChallengeResult.getSDKAppID.getSDKAppID$712102a0(int, java.lang.Object):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{ByteCompanionObject.MAX_VALUE, -77, -86, -36, 11, 29, 30, -30, 23, 17, 23};
            $$b = 58;
        }

        public static void init$1() {
            $$c = new byte[]{78, 97, 15, -120};
            $$d = 0;
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResult(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
