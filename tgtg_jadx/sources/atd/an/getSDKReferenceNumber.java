package atd.an;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.app.tgtg.model.local.AppConstants;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKReferenceNumber implements getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final String getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 2
            int r5 = 3 - r5
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = atd.an.getSDKReferenceNumber.$$a
            int r7 = r7 * 2
            int r7 = r7 + 98
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L28:
            r3 = r1[r5]
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.an.getSDKReferenceNumber.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        ChallengeResultCancelled = 1;
        getSDKTransactionID = 0;
        getSDKReferenceNumber = 1;
        getDeviceData();
        KeyEvent.getModifierMetaStateMask();
        TextUtils.indexOf((CharSequence) "", '0');
        TextUtils.indexOf("", "", 0, 0);
        int i11 = getDeviceData + 107;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 40 / 0;
        }
    }

    private getSDKReferenceNumber(String str) throws Throwable {
        if (str == null) {
            Object[] objArr = new Object[1];
            a(false, (ViewConfiguration.getWindowTouchSlop() >> 8) + 193, "\u0007￼\ufffe\f\r\u0001\u000b\ufffe\ufffe�\fￋ\ufff8\t\u000b\ufffe\uffff\ufffe\u000b\ufffe", Color.blue(0) + 4, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20, objArr);
            str = ((String) objArr[0]).intern();
        }
        this.getSDKAppID = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(boolean r25, int r26, java.lang.String r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.an.getSDKReferenceNumber.a(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
    }

    public static void getDeviceData() {
        AuthenticationRequestParameters = 711855261;
    }

    public static getSDKReferenceNumber getSDKTransactionID() throws Throwable {
        Object obj;
        int i11 = getSDKTransactionID + 23;
        getSDKReferenceNumber = i11 % 128;
        int i12 = i11 % 2;
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (i12 == 0) {
            Object[] objArr = new Object[1];
            a(true, 1573 - (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)), "\u0007￼\ufffe\f\r\u0001\u000b\ufffe\ufffe�\fￋ\ufff8\t\u000b\ufffe\uffff\ufffe\u000b\ufffe", 6 / AndroidCharacter.getMirror((char) 20), 48 % (Process.myPid() >>> 51), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(false, (elapsedCpuTime > 0L ? 1 : (elapsedCpuTime == 0L ? 0 : -1)) + BERTags.PRIVATE, "\u0007￼\ufffe\f\r\u0001\u000b\ufffe\ufffe�\fￋ\ufff8\t\u000b\ufffe\uffff\ufffe\u000b\ufffe", AndroidCharacter.getMirror('0') - ',', 20 - (Process.myPid() >> 22), objArr2);
            obj = objArr2[0];
        }
        return getSDKTransactionID(((String) obj).intern());
    }

    public static void init$0() {
        $$a = new byte[]{27, 20, 100, 39};
        $$b = 112;
    }

    @Override // atd.an.getSDKTransactionID
    public final String getSDKReferenceNumber(Context context, String str) {
        getSDKTransactionID = (getSDKReferenceNumber + 41) % 128;
        String string = context.getSharedPreferences(this.getSDKAppID, 0).getString(str, null);
        int i11 = getSDKTransactionID + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return string;
        }
        throw null;
    }

    private static getSDKReferenceNumber getSDKTransactionID(String str) {
        getSDKReferenceNumber getsdkreferencenumber = new getSDKReferenceNumber(str);
        int i11 = getSDKReferenceNumber + 11;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return getsdkreferencenumber;
        }
        throw null;
    }

    @Override // atd.an.getSDKTransactionID
    public final void getSDKTransactionID(Context context, String str, String str2) {
        int i11 = getSDKReferenceNumber + 7;
        getSDKTransactionID = i11 % 128;
        int i12 = i11 % 2;
        context.getSharedPreferences(this.getSDKAppID, 0).edit().putString(str, str2).apply();
        int i13 = getSDKTransactionID + 93;
        getSDKReferenceNumber = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }
}
