package atd.b;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getMessageVersion extends getDeviceData<String> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static long getDeviceData;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, short r6, byte r7) {
        /*
            byte[] r0 = atd.b.getMessageVersion.$$a
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r5 = r5 * 3
            int r1 = r5 + 1
            int r6 = r6 * 2
            int r6 = r6 + 97
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
        L28:
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getMessageVersion.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getSDKTransactionID = 1;
        getDeviceData = -8311331213712891565L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getMessageVersion() throws Throwable {
        Object[] objArr = new Object[1];
        a("\uf8c9퇡ꪶ荣尩㛤ྂ\ud86a넢诠撡㵫ᘡ\ue0ef리", 10558 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        super(((String) objArr[0]).intern(), atd.h.getDeviceData.Y.name());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getMessageVersion.a(java.lang.String, int, java.lang.Object[]):void");
    }

    private static boolean getSDKTransactionID(String str) {
        AuthenticationRequestParameters = (getSDKTransactionID + 41) % 128;
        if (atd.h.getDeviceData.getSDKReferenceNumber(str) == null) {
            return false;
        }
        int i11 = AuthenticationRequestParameters + 59;
        getSDKTransactionID = i11 % 128;
        return i11 % 2 != 0;
    }

    public static void init$0() {
        $$a = new byte[]{126, 54, -127, -24};
        $$b = 191;
    }

    @Override // atd.b.getDeviceData
    public final /* synthetic */ boolean getSDKReferenceNumber(String str) {
        int i11 = AuthenticationRequestParameters + 27;
        getSDKTransactionID = i11 % 128;
        String str2 = str;
        if (i11 % 2 == 0) {
            getSDKTransactionID(str2);
            throw null;
        }
        boolean sDKTransactionID = getSDKTransactionID(str2);
        int i12 = AuthenticationRequestParameters + 11;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 != 0) {
            return sDKTransactionID;
        }
        throw null;
    }
}
