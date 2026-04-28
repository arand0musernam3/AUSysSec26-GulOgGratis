package atd.g;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DataVersion;", "", "version", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "V1_6", "V1_7", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ a80.a $ENTRIES = null;
    private static final /* synthetic */ getDeviceData[] $VALUES;
    private static int AuthenticationRequestParameters;
    public static final getDeviceData V1_6;
    public static final getDeviceData V1_7;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final String version;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, int r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 98
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r6 = r6 + 4
            byte[] r1 = atd.g.getDeviceData.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r1
            r4 = r2
            r1 = r8
            r8 = r6
            goto L2e
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
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
            int r6 = r6 + r1
            r1 = r8
            r8 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.g.getDeviceData.$$c(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKReferenceNumber = 1;
        getDeviceData = 0;
        getSDKTransactionID = 1;
        getSDKAppID();
        Object[] objArr = new Object[1];
        a(false, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 183, "￪\u0018\uffef\u000f", (ViewConfiguration.getWindowTouchSlop() >> 8) + 3, TextUtils.getOffsetAfter("", 0) + 4, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(false, Process.getGidForName("") + 162, "\u0005\u0000�", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 3 - (Process.myPid() >> 22), objArr2);
        V1_6 = new getDeviceData(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(false, 183 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\ufff0\u000f￪\u0018", TextUtils.indexOf("", "") + 1, (ViewConfiguration.getPressedStateDuration() >> 16) + 4, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(false, 162 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0005\uffff￼", View.resolveSize(0, 0) + 1, 3 - TextUtils.indexOf("", ""), objArr4);
        V1_7 = new getDeviceData(strIntern2, 1, ((String) objArr4[0]).intern());
        getDeviceData[] getdevicedataArrAuthenticationRequestParameters = AuthenticationRequestParameters();
        $VALUES = getdevicedataArrAuthenticationRequestParameters;
        n.w(getdevicedataArrAuthenticationRequestParameters);
        getSDKReferenceNumber = (getSDKAppID + 89) % 128;
    }

    private getDeviceData(String str, int i11, String str2) {
        this.version = str2;
    }

    private static final /* synthetic */ getDeviceData[] AuthenticationRequestParameters() {
        getDeviceData[] getdevicedataArr;
        int i11 = getSDKTransactionID;
        int i12 = i11 + 37;
        getDeviceData = i12 % 128;
        if (i12 % 2 != 0) {
            getdevicedataArr = new getDeviceData[2];
            getdevicedataArr[0] = V1_6;
            getdevicedataArr[0] = V1_7;
        } else {
            getdevicedataArr = new getDeviceData[]{V1_6, V1_7};
        }
        getDeviceData = (i11 + 117) % 128;
        return getdevicedataArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(boolean r25, int r26, java.lang.String r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.g.getDeviceData.a(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = 711855287;
    }

    public static void init$0() {
        $$a = new byte[]{48, -109, -115, -11};
        $$b = 116;
    }

    public static getDeviceData valueOf(String str) {
        int i11 = getSDKTransactionID + 113;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            Enum.valueOf(getDeviceData.class, str);
            throw null;
        }
        getDeviceData getdevicedata = (getDeviceData) Enum.valueOf(getDeviceData.class, str);
        int i12 = getDeviceData + 83;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 != 0) {
            return getdevicedata;
        }
        throw null;
    }

    public static getDeviceData[] values() {
        getDeviceData[] getdevicedataArr;
        int i11 = getSDKTransactionID + 27;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            getdevicedataArr = (getDeviceData[]) $VALUES.clone();
            int i12 = 92 / 0;
        } else {
            getdevicedataArr = (getDeviceData[]) $VALUES.clone();
        }
        int i13 = getDeviceData + 43;
        getSDKTransactionID = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 38 / 0;
        }
        return getdevicedataArr;
    }

    @NotNull
    public final String getSDKReferenceNumber() {
        int i11 = (getDeviceData + 57) % 128;
        getSDKTransactionID = i11;
        String str = this.version;
        int i12 = i11 + 63;
        getDeviceData = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
