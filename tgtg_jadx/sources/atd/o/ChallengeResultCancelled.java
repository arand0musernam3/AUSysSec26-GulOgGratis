package atd.o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isMacAddress", "", "", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCancelled {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static short[] getSDKReferenceNumber;
    private static byte[] getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, int r6, short r7) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r5 = r5 * 4
            int r5 = 4 - r5
            byte[] r1 = atd.o.ChallengeResultCancelled.$$a
            int r6 = r6 * 4
            int r6 = 105 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r4 = r1[r5]
            int r3 = r3 + 1
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.o.ChallengeResultCancelled.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResult = 1;
        AuthenticationRequestParameters = 930999557;
        getSDKAppID = 829166621;
        getDeviceData = 1847305569;
        getSDKTransactionID = new byte[]{-57, 46, -46, 123, 114, 124, -119, -66, 92, -87, 77, 105, -104, -80, -69, 45, -33, 55, -118, -40, 46, -46, 123, 114, 124, -119, -66, 92, -87, 77, 105, -104, -80, 86};
    }

    public static final boolean AuthenticationRequestParameters(@NotNull String str) throws Throwable {
        str.getClass();
        Object[] objArr = new Object[1];
        a((-1601679642) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) - 63, (-101841190) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (70 - (Process.myTid() >> 22)), (short) Color.red(0), objArr);
        boolean zE = new Regex(((String) objArr[0]).intern()).e(str);
        int i11 = BuildConfig + 111;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            return zE;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01a0 A[PHI: r7
      0x01a0: PHI (r7v7 int) = (r7v6 int), (r7v23 int) binds: [B:44:0x019e, B:41:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a3 A[PHI: r7
      0x01a3: PHI (r7v20 int) = (r7v6 int), (r7v23 int) binds: [B:44:0x019e, B:41:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r28, int r29, int r30, byte r31, short r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.o.ChallengeResultCancelled.a(int, int, int, byte, short, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{47, 95, 67, 92};
        $$b = 29;
    }
}
