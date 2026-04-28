package atd.b;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeResult extends getSDKReferenceNumber {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static byte[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static short[] getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(short r6, int r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 101
            byte[] r0 = atd.b.ChallengeResult.$$d
            int r8 = r8 * 4
            int r1 = 1 - r8
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L1a
            r3 = r0
            r4 = r2
            r0 = r7
            r7 = r6
            goto L30
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r0
            int r7 = r7 + 1
            r0 = r7
            r7 = r6
            r6 = r0
            r0 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.ChallengeResult.$$f(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        BuildConfig = 1;
        getDeviceData();
        ViewConfiguration.getScrollBarFadeDuration();
        AudioTrack.getMaxVolume();
        ExpandableListView.getPackedPositionGroup(0L);
        ExpandableListView.getPackedPositionChild(0L);
        View.resolveSizeAndState(0, 0, 0);
        int i11 = BuildConfig + 51;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 45 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChallengeResult(List<String> list) throws Throwable {
        Object[] objArr = new Object[1];
        b((byte) ((-78) - Color.green(0)), (-43) - ((Process.getThreadPriority(0) + 20) >> 6), 1738650684 + (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (79 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (-153654648) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        super(TextUtils.join(((String) objArr[0]).intern(), list));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01ac A[PHI: r3
      0x01ac: PHI (r3v10 int) = (r3v9 int), (r3v56 int) binds: [B:42:0x01aa, B:39:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ae A[PHI: r3
      0x01ae: PHI (r3v53 int) = (r3v9 int), (r3v56 int) binds: [B:42:0x01aa, B:39:0x019d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r31, int r32, int r33, short r34, int r35, java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.ChallengeResult.b(byte, int, int, short, int, java.lang.Object[]):void");
    }

    public static void getDeviceData() {
        getSDKTransactionID = -1456316441;
        getSDKAppID = 829166601;
        getSDKReferenceNumber = 944013702;
        AuthenticationRequestParameters = new byte[]{-12};
    }

    public static void init$0() {
        $$d = new byte[]{26, -110, -23, -5};
        $$e = 150;
    }
}
