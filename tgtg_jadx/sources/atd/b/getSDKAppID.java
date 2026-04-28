package atd.b;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.completed;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class getSDKAppID extends getDeviceData<String> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(short r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 2
            int r0 = r5 + 1
            byte[] r1 = atd.b.getSDKAppID.$$d
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 * 4
            int r7 = r7 + 120
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r5
            r7 = r6
            r3 = r2
            goto L2a
        L17:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L26:
            r4 = r1[r7]
            int r3 = r3 + 1
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getSDKAppID.$$f(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 7361224688982078136L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getSDKAppID(String str) throws Throwable {
        Object[] objArr = new Object[1];
        b("ϩΊ樞帜⣘䁭븳⍡툭汩ዊ䷠ꃜ뷧⒝掁睲쌙\uf578", TextUtils.indexOf("", "", 0, 0), objArr);
        super(((String) objArr[0]).intern(), str);
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            int i12 = $10 + 17;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                charArray = str.toCharArray();
                int i13 = 49 / 0;
            } else {
                charArray = str.toCharArray();
            }
        } else {
            charArray = str;
        }
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(getSDKAppID ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i14 = completedVar.getSDKTransactionID;
            if (i14 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            $11 = ($10 + 73) % 128;
            int i15 = i14 - 4;
            completedVar.getSDKAppID = i15;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i14] ^ sDKTransactionID[i14 % 4]), Long.valueOf(i15), Long.valueOf(getSDKAppID)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int i16 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2774;
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 13061);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 25;
                    byte b8 = (byte) ($$d[0] - 1);
                    byte b11 = b8;
                    String str$$f = $$f(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(i16, cLastIndexOf, iResolveOpacity, -1416626223, false, str$$f, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i14] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((Process.myTid() >> 22) + 408, (char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void init$0() {
        $$d = new byte[]{1, 115, -127, -107};
        $$e = 97;
    }
}
