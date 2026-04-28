package atd.f;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.af.getSDKReferenceNumber;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static long getSDKAppID;
    private getSDKReferenceNumber getDeviceData;
    private getSDKReferenceNumber getSDKReferenceNumber;
    private String getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r0 = atd.f.AuthenticationRequestParameters.$$a
            int r8 = r8 + 103
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r3 = -r3
            int r8 = r8 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.f.AuthenticationRequestParameters.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters = new char[]{7136, 62367, 51976, 41651, 47621, 37272, 26890, 16519, 22585, 14225, 3841, 59029, 65080, 54689, 18137, 44723, 38459, 65432, 59182, 52403, 13345, 7596, 1298, 27322, 21034, 48062, 41747, 34954, 62575, 7184, 9351, 19756, 21928, 32307};
        getSDKAppID = -5156335830382404493L;
    }

    public AuthenticationRequestParameters(JSONObject jSONObject) throws Throwable {
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 61327), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15, objArr);
        this.getSDKReferenceNumber = getSDKReferenceNumber.AuthenticationRequestParameters(jSONObject.getJSONObject(((String) objArr[0]).intern()));
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14, (char) (45731 - TextUtils.lastIndexOf("", '0', 0, 0)), View.MeasureSpec.getMode(0) + 14, objArr2);
        this.getDeviceData = getSDKReferenceNumber.AuthenticationRequestParameters(jSONObject.getJSONObject(((String) objArr2[0]).intern()));
        Object[] objArr3 = new Object[1];
        a(Color.green(0) + 28, (char) KeyEvent.normalizeMetaState(0), 6 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        this.getSDKTransactionID = jSONObject.getString(((String) objArr3[0]).intern());
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r29, char r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.f.AuthenticationRequestParameters.a(int, char, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{28, -116, 103, -92};
        $$b = 218;
    }

    public final String getDeviceData() {
        int i11 = (ChallengeResult + 39) % 128;
        ChallengeResultCancelled = i11;
        String str = this.getSDKTransactionID;
        int i12 = i11 + 43;
        ChallengeResult = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void getSDKReferenceNumber() {
        getSDKReferenceNumber getsdkreferencenumber = this.getSDKReferenceNumber;
        if (getsdkreferencenumber != null) {
            ChallengeResultCancelled = (ChallengeResult + 27) % 128;
            getsdkreferencenumber.AuthenticationRequestParameters();
            this.getSDKReferenceNumber = null;
        }
        getSDKReferenceNumber getsdkreferencenumber2 = this.getDeviceData;
        if (getsdkreferencenumber2 != null) {
            ChallengeResult = (ChallengeResultCancelled + 71) % 128;
            getsdkreferencenumber2.AuthenticationRequestParameters();
            this.getDeviceData = null;
            ChallengeResult = (ChallengeResultCancelled + 101) % 128;
        }
        this.getSDKTransactionID = null;
    }

    public final getSDKReferenceNumber getSDKTransactionID() {
        int i11 = ChallengeResult + 89;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        getSDKReferenceNumber getsdkreferencenumber = this.getSDKReferenceNumber;
        if (i12 != 0) {
            return getsdkreferencenumber;
        }
        throw null;
    }
}
