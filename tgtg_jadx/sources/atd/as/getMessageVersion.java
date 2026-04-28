package atd.as;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.adyen.threeds2.Warning;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/UnsecuredDeviceWarning;", "Lcom/adyen/threeds2/internal/security/warning/AppWarning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMessageVersion implements getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;

    @NotNull
    public static final getMessageVersion getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, short r6, short r7) {
        /*
            int r7 = 106 - r7
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r5 = r5 * 4
            int r5 = 4 - r5
            byte[] r1 = atd.as.getMessageVersion.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r5]
        L26:
            int r7 = r7 + r3
            int r5 = r5 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.getMessageVersion.$$c(int, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        ChallengeResult = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        getDeviceData();
        getDeviceData = new getMessageVersion();
        ChallengeResultCancelled = (ChallengeResult + 81) % 128;
    }

    private getMessageVersion() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r27, char r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.getMessageVersion.a(int, char, int, java.lang.Object[]):void");
    }

    public static void getDeviceData() {
        AuthenticationRequestParameters = new char[]{47251, 46845, 42029, 37831, 26049, 27543, 31012, 20107, 23641, 11746, 13215, 282, 5798, 58442, 62865, 64370, 51486, 57047, 44087, 48588, 33601, 37055, 26258, 29742, 17854, 19282, 22779, 11894, 15361, 3567, 4902, 57554, 63097, 51199, 54745, 56083, 43164, 48753, 36781, 40395, 25357, 28838, 18010, 22464, 9586, 11008, 14467, 3647, 8077, 60760, 62187, 49347, 54789, 42942, 46421, 47871, 34936, 40469, 28583, 32125};
        getSDKTransactionID = -1537214975415747996L;
    }

    public static void init$0() {
        $$a = new byte[]{47, -7, -1, 23};
        $$b = 122;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getID() throws Throwable {
        Object obj;
        int i11 = getSDKAppID + 53;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getKeyRepeatTimeout() >> 90, (char) ((SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)) + 7161), 3 >> (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19661), 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        getSDKReferenceNumber = (getSDKAppID + 121) % 128;
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getMessage() throws Throwable {
        getSDKReferenceNumber = (getSDKAppID + 35) % 128;
        Object[] objArr = new Object[1];
        a(Color.alpha(0) + 4, (char) (TextUtils.lastIndexOf("", '0') + 37276), 55 - TextUtils.lastIndexOf("", '0'), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = getSDKReferenceNumber + 3;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 73 / 0;
        }
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final Warning.Severity getSeverity() {
        int i11 = getSDKReferenceNumber + 47;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return Warning.Severity.MEDIUM;
        }
        Warning.Severity severity = Warning.Severity.LOW;
        throw null;
    }
}
