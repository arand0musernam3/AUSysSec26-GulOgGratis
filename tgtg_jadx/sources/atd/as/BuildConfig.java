package atd.as;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ExpandableListView;
import com.adyen.threeds2.Warning;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/RootedDeviceWarning;", "Lcom/adyen/threeds2/Warning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig implements Warning {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;

    @NotNull
    public static final BuildConfig getDeviceData;
    private static long getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, byte r6, short r7) {
        /*
            byte[] r0 = atd.as.BuildConfig.$$a
            int r7 = r7 + 103
            int r5 = r5 * 2
            int r5 = 4 - r5
            int r6 = r6 * 2
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r7 = r5
            r4 = r6
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r5]
        L27:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.BuildConfig.$$c(int, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters = 0;
        getSDKTransactionID = 1;
        getSDKTransactionID();
        getDeviceData = new BuildConfig();
        BuildConfig = (ChallengeResultCancelled + 9) % 128;
    }

    private BuildConfig() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0137, code lost:
    
        r4[r5] = (char) r2[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x013d, code lost:
    
        r0 = new java.lang.Object[r8];
        r0[1] = r1;
        r0[r3] = r1;
        r1 = atd.e.ChallengeResult.getSDKTransactionID(464282390);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0147, code lost:
    
        if (r1 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0149, code lost:
    
        r1 = (byte) r3;
        r2 = r1;
        r1 = atd.e.ChallengeResult.getDeviceData(2646 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.text.TextUtils.getTrimmedLength(""), 23 - android.view.MotionEvent.axisFromString(""), -943430394, false, $$c(r1, r2, (byte) (r2 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0172, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0177, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r26, char r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.BuildConfig.a(int, char, int, java.lang.Object[]):void");
    }

    public static void getSDKTransactionID() {
        getSDKReferenceNumber = new char[]{14991, 36305, 21592, 7395, 62554, 17212, 39647, 53792, 10498, 24745, 47204, 63249, 20157, 34369, 56746, 5305, 27717, 48060, 62096, 18983, 33217, 55424, 4159, 28612, 42792};
        getSDKAppID = 3149671189293056852L;
    }

    public static void init$0() {
        $$a = new byte[]{35, -37, -44, 56};
        $$b = 62;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getID() throws Throwable {
        AuthenticationRequestParameters = (getSDKTransactionID + 39) % 128;
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.indexOf((CharSequence) "", '0') + 52947), Color.rgb(0, 0, 0) + 16777220, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = getSDKTransactionID + 21;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getMessage() throws Throwable {
        getSDKTransactionID = (AuthenticationRequestParameters + 119) % 128;
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3, (char) Color.alpha(0), KeyEvent.getDeadChar(0, 0) + 21, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = AuthenticationRequestParameters + 7;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final Warning.Severity getSeverity() {
        getSDKTransactionID = (AuthenticationRequestParameters + 113) % 128;
        Warning.Severity severity = Warning.Severity.HIGH;
        AuthenticationRequestParameters = (getSDKTransactionID + 47) % 128;
        return severity;
    }
}
