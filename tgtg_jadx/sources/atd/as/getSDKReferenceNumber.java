package atd.as;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.Warning;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/BootloaderUnlockedWarning;", "Lcom/adyen/threeds2/internal/security/warning/AppWarning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber implements getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;

    @NotNull
    public static final getSDKReferenceNumber getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, int r6, byte r7) {
        /*
            byte[] r0 = atd.as.getSDKReferenceNumber.$$a
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r5 = r5 * 4
            int r1 = 1 - r5
            int r6 = r6 * 2
            int r6 = r6 + 98
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L19
            r6 = r5
            r4 = r7
            r3 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r7]
            int r3 = r3 + 1
        L29:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.getSDKReferenceNumber.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getMessageVersion = 1;
        getSDKReferenceNumber = 0;
        getSDKTransactionID = 1;
        getSDKAppID();
        getDeviceData = new getSDKReferenceNumber();
        AuthenticationRequestParameters = (getMessageVersion + 87) % 128;
    }

    private getSDKReferenceNumber() {
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(boolean r25, int r26, java.lang.String r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.getSDKReferenceNumber.a(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
    }

    public static void getSDKAppID() {
        getSDKAppID = 711855267;
    }

    public static void init$0() {
        $$a = new byte[]{49, -90, -82, 29};
        $$b = 195;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getID() throws Throwable {
        getSDKTransactionID = (getSDKReferenceNumber + 3) % 128;
        Object[] objArr = new Object[1];
        a(false, ((Process.getThreadPriority(0) + 20) >> 6) + 166, "\uffef\u0011\u0015￮", 1 - KeyEvent.keyCodeFromString(""), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = getSDKTransactionID + 87;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final String getMessage() throws Throwable {
        getSDKReferenceNumber = (getSDKTransactionID + 5) % 128;
        Object[] objArr = new Object[1];
        a(true, 192 - MotionEvent.axisFromString(""), "\u0012\u0006ￃ\u0015\u0012ￃ\u0007\b\u0017\u0012\u0012\u0015ￃ\u0016\fￃ\u0017\fￃ\u0017\u0004\u000b\u0017ￃ\b\u0017\u0004\u0006\f\u0007\u0011\fￃ\u001c\u0004\u0010ￃ\u000b\u0006\f\u000b\u001aￃￏ\u0007\b\u000e\u0006\u0012\u000f\u0011\u0018ￃ\u0016\fￃ\u0015\b\u0007\u0004\u0012\u000f\u0017\u0012\u0012\u0005ￃ\u0016ￊ\b\u0006\f\u0019\b\u0007ￃ\b\u000b\ufff7\uffd1\u0007\b\u0016\f\u0010\u0012\u0015\u0013\u0010", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 80, 90 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = getSDKReferenceNumber + 121;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.Warning
    @NotNull
    public final Warning.Severity getSeverity() {
        int i11 = getSDKTransactionID + 75;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return Warning.Severity.HIGH;
        }
        int i12 = 1 / 0;
        return Warning.Severity.HIGH;
    }
}
