package atd.as;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.Warning;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/SdkIntegrityTamperedWarning;", "Lcom/adyen/threeds2/Warning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey implements Warning {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static short[] ChallengeResult;
    private static int ChallengeResultCancelled;

    @NotNull
    public static final getSDKEphemeralPublicKey getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static byte[] getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 101
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = atd.as.getSDKEphemeralPublicKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L1a
            r6 = r8
            r3 = r1
            r4 = r2
            r1 = r7
            goto L31
        L1a:
            r3 = r2
        L1b:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r1
            r1 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L31:
            int r6 = r6 + r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.getSDKEphemeralPublicKey.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        BuildConfig = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKAppID();
        getDeviceData = new getSDKEphemeralPublicKey();
        int i11 = getMessageVersion + 67;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private getSDKEphemeralPublicKey() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r29, int r30, int r31, byte r32, short r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.getSDKEphemeralPublicKey.a(int, int, int, byte, short, java.lang.Object[]):void");
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = -1771538856;
        getSDKAppID = 829166642;
        getSDKReferenceNumber = 1348729044;
        getSDKTransactionID = new byte[]{-48, 6, -35, 0, 57, 76, 121, 117, -117, 115, -123, -118, 107, -46, 52, -113, -122, -123, -60, 43, -108, ByteCompanionObject.MAX_VALUE, -50, 83, -127, 119, -75, 61, 123, 114, -46, 60, 113, -55, 33, -125, -115, 113, -115, -124, 119, ByteCompanionObject.MIN_VALUE, -125, -49, 61, 123, -110};
    }

    public static void init$0() {
        $$a = new byte[]{52, -114, -70, 47};
        $$b = 28;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getID() throws Throwable {
        getSDKEphemeralPublicKey = (BuildConfig + 97) % 128;
        Object[] objArr = new Object[1];
        a((-1628433572) - View.combineMeasuredStates(0, 0), TextUtils.indexOf("", "", 0) - 18, 1492884869 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (38 - MotionEvent.axisFromString("")), (short) TextUtils.indexOf("", ""), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = BuildConfig + 55;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getMessage() throws Throwable {
        getSDKEphemeralPublicKey = (BuildConfig + 27) % 128;
        Object[] objArr = new Object[1];
        a((-1628433570) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-19) - TextUtils.lastIndexOf("", '0', 0), 40377 - AndroidCharacter.getMirror('0'), (byte) (TextUtils.lastIndexOf("", '0') - 90), (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        getSDKEphemeralPublicKey = (BuildConfig + 113) % 128;
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final Warning.Severity getSeverity() {
        int i11 = getSDKEphemeralPublicKey + 77;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            return Warning.Severity.HIGH;
        }
        Warning.Severity severity = Warning.Severity.LOW;
        throw null;
    }
}
