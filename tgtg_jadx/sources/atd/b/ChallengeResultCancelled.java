package atd.b;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.app.tgtg.model.local.AppConstants;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeResultCancelled extends getDeviceData<String> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = 100 - r7
            byte[] r0 = atd.b.ChallengeResultCancelled.$$a
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r6
            r3 = r0
            r4 = r2
            r0 = r8
            goto L30
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L30:
            int r6 = r6 + r0
            r0 = r7
            r7 = r6
            r6 = r0
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.ChallengeResultCancelled.$$c(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters = 711855219;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChallengeResultCancelled() throws Throwable {
        Object[] objArr = new Object[1];
        a(false, 283 - View.resolveSizeAndState(0, 0, 0), "\u000b\u0012￼\u0001\ufffa\u0005\u0005\ufffe\u0007\u0000\ufffe\uffe7\b\uffde\u0007\r", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, ((byte) KeyEvent.getModifierMetaStateMask()) + 17, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(true, (ViewConfiguration.getScrollBarSize() >> 8) + 269, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, TextUtils.getCapsMode("", 0, 0) + 1, View.MeasureSpec.getSize(0) + 1, objArr2);
        super(strIntern, ((String) objArr2[0]).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(boolean r32, int r33, java.lang.String r34, int r35, int r36, java.lang.Object[] r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.ChallengeResultCancelled.a(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{125, 105, -35, 39};
        $$b = 189;
    }

    @Override // atd.b.getDeviceData
    public final /* bridge */ /* synthetic */ boolean getSDKReferenceNumber(String str) {
        int i11 = getDeviceData + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        getSDKReferenceNumber = i11 % 128;
        return i11 % 2 != 0;
    }
}
