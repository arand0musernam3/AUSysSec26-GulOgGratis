package atd.z;

import android.app.Application;
import android.graphics.Color;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointFqdnProvider;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "get", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusHandler implements completed {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static char[] getSDKTransactionID;

    @NotNull
    private final Application getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = atd.z.ChallengeStatusHandler.$$a
            int r6 = r6 + 107
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L16
            r6 = r8
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2d
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r1
            r1 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = r6 + r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.z.ChallengeStatusHandler.$$c(int, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getDeviceData = 1;
        getSDKTransactionID = new char[]{63414, 63486, 63486, 63477};
    }

    public ChallengeStatusHandler(@NotNull Application application) {
        application.getClass();
        this.getSDKReferenceNumber = application;
    }

    private static void a(int[] iArr, String str, boolean z11, Object[] objArr) throws Throwable {
        long j9;
        int i11;
        int length;
        char[] cArr;
        int i12;
        byte[] bArr;
        int i13;
        String str2 = str;
        int i14 = $10;
        $11 = (i14 + 11) % 128;
        int i15 = 0;
        Object bytes = str2;
        if (str2 != null) {
            int i16 = i14 + 31;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 43 / 0;
                bytes = str2.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            } else {
                bytes = str2.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
        }
        byte[] bArr2 = (byte[]) bytes;
        atd.bb.ChallengeResultError challengeResultError = new atd.bb.ChallengeResultError();
        int i18 = iArr[0];
        byte b8 = 1;
        int i19 = iArr[1];
        int i21 = iArr[2];
        int i22 = iArr[3];
        char[] cArr2 = getSDKTransactionID;
        Class cls = Integer.TYPE;
        if (cArr2 != null) {
            j9 = 0;
            int i23 = $10 + 59;
            $11 = i23 % 128;
            if (i23 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i12 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i12 = 0;
            }
            int i24 = i12;
            while (i24 < length) {
                try {
                    byte b11 = b8;
                    Object[] objArr2 = {Integer.valueOf(cArr2[i24])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(754517312);
                    if (sDKTransactionID == null) {
                        bArr = bArr2;
                        i13 = i24;
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(View.getDefaultSize(i15, i15) + 2943, (char) ((ExpandableListView.getPackedPositionForChild(i15, i15) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i15, i15) == 0L ? 0 : -1)) + 1), 37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -258931888, false, $$c(b12, b13, (byte) (b13 + 1)), new Class[]{cls});
                    } else {
                        bArr = bArr2;
                        i13 = i24;
                    }
                    cArr[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i24 = i13 + 1;
                    b8 = b11;
                    bArr2 = bArr;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        } else {
            j9 = 0;
        }
        byte[] bArr3 = bArr2;
        byte b14 = b8;
        char[] cArr3 = new char[i19];
        System.arraycopy(cArr2, i18, cArr3, 0, i19);
        if (bArr3 != null) {
            $10 = ($11 + 27) % 128;
            char[] cArr4 = new char[i19];
            challengeResultError.AuthenticationRequestParameters = 0;
            char c3 = 0;
            while (true) {
                int i25 = challengeResultError.AuthenticationRequestParameters;
                if (i25 >= i19) {
                    break;
                }
                byte b15 = b14;
                if (bArr3[i25] == b15) {
                    char c7 = cArr3[i25];
                    Object[] objArr3 = new Object[2];
                    objArr3[b15] = Integer.valueOf(c3);
                    objArr3[0] = Integer.valueOf(c7);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(788825057);
                    if (sDKTransactionID2 == null) {
                        byte b16 = (byte) 1;
                        byte b17 = (byte) (-b16);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ExpandableListView.getPackedPositionForChild(0, 0) > j9 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j9 ? 0 : -1)) + 3096, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14366), 18 - View.resolveSizeAndState(0, 0, 0), -210991631, false, $$c(b16, b17, (byte) (b17 + 1)), new Class[]{cls, cls});
                    }
                    cArr4[i25] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i25]), Integer.valueOf(c3)};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-565071239);
                    if (sDKTransactionID3 == null) {
                        byte b18 = (byte) 3;
                        byte b19 = (byte) (b18 - 4);
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(2773 - Process.getGidForName(""), (char) (TextUtils.getOffsetAfter("", 0) + 13060), 24 - (ExpandableListView.getPackedPositionForChild(0, 0) > j9 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j9 ? 0 : -1)), 37336169, false, $$c(b18, b19, (byte) (b19 + 1)), new Class[]{cls, cls});
                    }
                    cArr4[i25] = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr4[challengeResultError.AuthenticationRequestParameters];
                Object[] objArr5 = {challengeResultError, challengeResultError};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(2107237619);
                if (sDKTransactionID4 == null) {
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2279 - (ViewConfiguration.getGlobalActionKeyTimeout() > j9 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j9 ? 0 : -1)), (char) (65522 - View.MeasureSpec.getMode(0)), Color.blue(0) + 34, -1577983261, false, "m", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
                b14 = 1;
            }
            $11 = ($10 + 75) % 128;
            cArr3 = cArr4;
        }
        if (i22 > 0) {
            char[] cArr5 = new char[i19];
            i11 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i19);
            int i26 = i19 - i22;
            System.arraycopy(cArr5, 0, cArr3, i26, i22);
            System.arraycopy(cArr5, i22, cArr3, 0, i26);
        } else {
            i11 = 0;
        }
        if (z11) {
            $11 = ($10 + 21) % 128;
            char[] cArr6 = new char[i19];
            challengeResultError.AuthenticationRequestParameters = i11;
            while (true) {
                int i27 = challengeResultError.AuthenticationRequestParameters;
                if (i27 >= i19) {
                    break;
                }
                cArr6[i27] = cArr3[(i19 - i27) - 1];
                challengeResultError.AuthenticationRequestParameters = i27 + 1;
            }
            cArr3 = cArr6;
        }
        if (i21 > 0) {
            $10 = ($11 + 13) % 128;
            challengeResultError.AuthenticationRequestParameters = 0;
            while (true) {
                int i28 = challengeResultError.AuthenticationRequestParameters;
                if (i28 >= i19) {
                    break;
                }
                cArr3[i28] = (char) (cArr3[i28] - iArr[2]);
                challengeResultError.AuthenticationRequestParameters = i28 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void init$0() {
        $$a = new byte[]{76, -58, -49, 5};
        $$b = 254;
    }

    @Override // atd.z.completed
    @Nullable
    public final String AuthenticationRequestParameters() throws Throwable {
        WifiManager wifiManager;
        Application application = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a(new int[]{0, 4, 10, 0}, "\u0001\u0001\u0001\u0000", true, objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        if (systemService instanceof WifiManager) {
            wifiManager = (WifiManager) systemService;
        } else {
            getDeviceData = (getSDKAppID + 27) % 128;
            wifiManager = null;
        }
        if (wifiManager != null) {
            int i11 = getSDKAppID + 93;
            getDeviceData = i11 % 128;
            if (i11 % 2 == 0) {
                wifiManager.getConnectionInfo();
                throw null;
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getPasspointFqdn();
            }
        }
        return null;
    }
}
