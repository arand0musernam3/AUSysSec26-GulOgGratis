package atd.ah;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
final class getSDKReferenceNumber extends getDeviceData {
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static char[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r6, byte r7, short r8) {
        /*
            byte[] r0 = atd.ah.getSDKReferenceNumber.$$c
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r7 = 106 - r7
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2d:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.getSDKReferenceNumber.$$g(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getMessageVersion = 1;
        getDeviceData = 0;
        getSDKTransactionID = 1;
        ChallengeResultCancelled();
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getMinimumFlingVelocity();
        PointF.length(0.0f, 0.0f);
        TextUtils.lastIndexOf("", '0');
        TextUtils.lastIndexOf("", '0', 0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getFadingEdgeLength();
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getScrollDefaultDelay();
        ImageFormat.getBitsPerPixel(0);
        getMessageVersion = (getSDKReferenceNumber + 57) % 128;
    }

    public static void ChallengeResultCancelled() {
        getSDKAppID = new char[]{32817, 28515, 24070, 19758, 15547, 11160, 6911, 2483, 63784, 59409, 55062, 50739, 46558, 62543, 7017, 10777, 50782, 10616, 6152, 2902, 31444, 28151, 23696, 20446, 48991, 44646, 37128, 32826, 62386, 58101, 54658, 50341, 13435, 10004, 5685, 31198, 62534, 6977, 10795, 14603, 18645, 24556, 28291, 32210, 36139, 39946};
        AuthenticationRequestParameters = 4505406450332801836L;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r33, char r34, int r35, java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.getSDKReferenceNumber.a(int, char, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$c = new byte[]{116, -8, -122, 111};
        $$f = 8;
    }

    @Override // atd.ad.AuthenticationRequestParameters
    public final String AuthenticationRequestParameters() throws Throwable {
        getDeviceData = (getSDKTransactionID + 53) % 128;
        Object[] objArr = new Object[1];
        a(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29822), 12 - TextUtils.lastIndexOf("", '0', 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        getDeviceData = (getSDKTransactionID + 45) % 128;
        return strIntern;
    }

    @Override // atd.ah.getDeviceData
    public final int BuildConfig() {
        int i11 = (getSDKTransactionID + 115) % 128;
        getDeviceData = i11;
        int i12 = i11 + 61;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 77 / 0;
        }
        return 16;
    }

    @Override // atd.ah.getDeviceData
    public final String getDeviceData() throws Throwable {
        Object obj;
        int i11 = getSDKTransactionID + 109;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(98 % TextUtils.indexOf("", "", 1, 1), (char) (17829 >>> (ViewConfiguration.getScrollDefaultDelay() - 114)), Drawable.resolveOpacity(1, 1) + 55, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(16 - TextUtils.indexOf("", "", 0, 0), (char) (12817 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 20 - Drawable.resolveOpacity(0, 0), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // atd.ah.getDeviceData
    public final String getSDKAppID() throws Throwable {
        getSDKTransactionID = (getDeviceData + 83) % 128;
        Object[] objArr = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 13, (char) View.MeasureSpec.getSize(0), 3 - ExpandableListView.getPackedPositionGroup(0L), objArr);
        String strIntern = ((String) objArr[0]).intern();
        getSDKTransactionID = (getDeviceData + 89) % 128;
        return strIntern;
    }

    @Override // atd.ah.getDeviceData
    public final String getSDKEphemeralPublicKey() throws Throwable {
        Object obj;
        int i11 = getDeviceData + 73;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a((AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)) * 112, (char) (ViewConfiguration.getJumpTapTimeout() / 97), 111 - (ViewConfiguration.getScrollBarSize() * 38), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(36 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 10, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // atd.ah.getDeviceData
    public final int getSDKReferenceNumber() {
        int i11 = getSDKTransactionID + 111;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return 256;
        }
        throw null;
    }

    @Override // atd.ah.getDeviceData
    public final int getSDKTransactionID() {
        getDeviceData = (getSDKTransactionID + 113) % 128;
        return 16;
    }
}
