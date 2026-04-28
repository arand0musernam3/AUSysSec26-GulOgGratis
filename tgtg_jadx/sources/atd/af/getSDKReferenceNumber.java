package atd.af;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.app.tgtg.model.local.AppConstants;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class getSDKReferenceNumber {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static int getDeviceData;
    private static long getSDKReferenceNumber;
    private static char[] getSDKTransactionID;
    private String AuthenticationRequestParameters;
    private String getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(byte r6, short r7, byte r8) {
        /*
            byte[] r0 = atd.af.getSDKReferenceNumber.$$d
            int r8 = r8 * 4
            int r1 = 1 - r8
            int r7 = r7 + 103
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.af.getSDKReferenceNumber.$$f(byte, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        BuildConfig = 1;
        getSDKTransactionID = new char[]{11593, 42309, 15741, 62556, 31822, 58473, 5176, 39981, 49862, 19161, 54011, 62565, 31860, 58444};
        getSDKReferenceNumber = -2627953581000000483L;
    }

    public getSDKReferenceNumber(JSONObject jSONObject) throws Throwable {
        Object[] objArr = new Object[1];
        b((char) Color.alpha(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4, ExpandableListView.getPackedPositionChild(0L) + 12, objArr);
        this.getSDKAppID = jSONObject.optString(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        b((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55596), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, ViewConfiguration.getScrollBarSize() >> 8, objArr2);
        this.AuthenticationRequestParameters = jSONObject.getString(((String) objArr2[0]).intern());
    }

    public static getSDKReferenceNumber AuthenticationRequestParameters(JSONObject jSONObject) throws Throwable {
        BuildConfig = (getDeviceData + 19) % 128;
        Object[] objArr = new Object[1];
        b((char) (55597 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), KeyEvent.keyCodeFromString("") + 3, ViewConfiguration.getWindowTouchSlop() >> 8, objArr);
        String string = jSONObject.getString(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        b((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 3 - Color.green(0), TextUtils.getOffsetAfter("", 0) + 3, objArr2);
        if (((String) objArr2[0]).intern().equals(string)) {
            return new getDeviceData(jSONObject);
        }
        Object[] objArr3 = new Object[1];
        b((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 57459), TextUtils.indexOf("", "", 0, 0) + 2, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, objArr3);
        if (!((String) objArr3[0]).intern().equals(string)) {
            Object[] objArr4 = new Object[1];
            b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13991), 3 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 9, objArr4);
            if (((String) objArr4[0]).intern().equals(string)) {
                return new getSDKAppID(jSONObject);
            }
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.getDeviceData();
        }
        AuthenticationRequestParameters authenticationRequestParameters = new AuthenticationRequestParameters(jSONObject);
        int i11 = getDeviceData + 69;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(char r33, int r34, int r35, java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.af.getSDKReferenceNumber.b(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.getDeviceData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r3.isInstance(r2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        atd.af.getSDKReferenceNumber.BuildConfig = (atd.af.getSDKReferenceNumber.getDeviceData + 81) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void getSDKReferenceNumber(atd.af.getSDKReferenceNumber r2, java.lang.Class<? extends atd.af.getSDKReferenceNumber> r3) {
        /*
            int r0 = atd.af.getSDKReferenceNumber.getDeviceData
            int r0 = r0 + 63
            int r1 = r0 % 128
            atd.af.getSDKReferenceNumber.BuildConfig = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            boolean r2 = r3.isInstance(r2)
            r3 = 91
            int r3 = r3 / 0
            if (r2 == 0) goto L26
            goto L1d
        L17:
            boolean r2 = r3.isInstance(r2)
            if (r2 == 0) goto L26
        L1d:
            int r2 = atd.af.getSDKReferenceNumber.getDeviceData
            int r2 = r2 + 81
            int r2 = r2 % 128
            atd.af.getSDKReferenceNumber.BuildConfig = r2
            return
        L26:
            atd.aa.getSDKReferenceNumber r2 = atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE
            com.adyen.threeds2.exception.SDKRuntimeException r2 = r2.getDeviceData()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.af.getSDKReferenceNumber.getSDKReferenceNumber(atd.af.getSDKReferenceNumber, java.lang.Class):void");
    }

    public static void init$0() {
        $$d = new byte[]{36, -23, 54, -2};
        $$e = 160;
    }

    public final String getMessageVersion() {
        int i11 = getDeviceData;
        int i12 = i11 + 111;
        BuildConfig = i12 % 128;
        int i13 = i12 % 2;
        String str = this.getSDKAppID;
        if (i13 == 0) {
            throw null;
        }
        int i14 = i11 + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        BuildConfig = i14 % 128;
        if (i14 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public getSDKReferenceNumber(String str, String str2) {
        this.getSDKAppID = str;
        this.AuthenticationRequestParameters = str2;
    }

    public void AuthenticationRequestParameters() {
        int i11 = getDeviceData + 55;
        int i12 = i11 % 128;
        BuildConfig = i12;
        if (i11 % 2 == 0) {
            this.getSDKAppID = null;
            this.AuthenticationRequestParameters = null;
            int i13 = 65 / 0;
        } else {
            this.getSDKAppID = null;
            this.AuthenticationRequestParameters = null;
        }
        int i14 = i12 + 79;
        getDeviceData = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }
}
