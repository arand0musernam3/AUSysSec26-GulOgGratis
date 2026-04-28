package atd.e;

import atd.w.ProgressDialog;
import java.util.ArrayList;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private ArrayList<Object> getSDKAppID = new ArrayList<>();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r7, short r8, byte r9) {
        /*
            int r9 = r9 * 4
            int r9 = 3 - r9
            int r7 = r7 * 2
            int r7 = r7 + 98
            byte[] r0 = atd.e.getSDKTransactionID.$$c
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r8
            r3 = r0
            r5 = r2
            r0 = r9
            goto L2e
        L18:
            r3 = r2
        L19:
            int r9 = r9 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r9]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L2e:
            int r9 = -r9
            int r7 = r7 + r9
            r9 = r0
            r0 = r3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKTransactionID.$$g(int, short, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getSDKTransactionID = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters = 711855255;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x1b92  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x1bc1 A[Catch: GeneralSecurityException | JSONException -> 0x225d, GeneralSecurityException | JSONException -> 0x225d, TRY_ENTER, TRY_LEAVE, TryCatch #6 {GeneralSecurityException | JSONException -> 0x225d, blocks: (B:75:0x0c75, B:77:0x0c8c, B:78:0x0cca, B:80:0x0ced, B:82:0x0d32, B:86:0x0d58, B:86:0x0d58, B:88:0x0d5e, B:88:0x0d5e, B:89:0x0d99, B:89:0x0d99, B:109:0x1282, B:109:0x1282, B:112:0x12a0, B:112:0x12a0, B:119:0x1556, B:119:0x1556, B:128:0x16ce, B:128:0x16ce, B:129:0x16d1, B:129:0x16d1, B:131:0x16da, B:131:0x16da, B:132:0x1715, B:132:0x1715, B:134:0x1737, B:134:0x1737, B:135:0x177d, B:135:0x177d, B:139:0x17ac, B:139:0x17ac, B:141:0x17b2, B:141:0x17b2, B:142:0x17f6, B:142:0x17f6, B:203:0x1fb8, B:203:0x1fb8, B:206:0x1fcf, B:206:0x1fcf, B:211:0x2105, B:211:0x2105, B:215:0x222b, B:215:0x222b, B:217:0x2231, B:217:0x2231, B:218:0x2232, B:218:0x2232, B:144:0x1927, B:144:0x1927, B:148:0x1b81, B:148:0x1b81, B:150:0x1b87, B:150:0x1b87, B:167:0x1bc1, B:167:0x1bc1, B:159:0x1bac, B:159:0x1bac, B:164:0x1bb9, B:164:0x1bb9, B:155:0x1b8e, B:155:0x1b8e, B:169:0x1bdb, B:169:0x1bdb, B:176:0x1d90, B:176:0x1d90, B:178:0x1d96, B:178:0x1d96, B:179:0x1dd7, B:179:0x1dd7, B:181:0x1df4, B:181:0x1df4, B:183:0x1e01, B:183:0x1e01, B:184:0x1e42, B:184:0x1e42, B:186:0x1e58, B:186:0x1e58, B:187:0x1e98, B:187:0x1e98, B:201:0x1fb2, B:201:0x1fb2, B:202:0x1fb7, B:202:0x1fb7, B:188:0x1ea0, B:188:0x1ea0, B:190:0x1ea9, B:190:0x1ea9, B:191:0x1ee2, B:191:0x1ee2, B:193:0x1efa, B:193:0x1efa, B:195:0x1f07, B:195:0x1f07, B:196:0x1f43, B:196:0x1f43, B:198:0x1f58, B:198:0x1f58, B:220:0x2234, B:220:0x2234, B:222:0x223a, B:222:0x223a, B:223:0x223b, B:223:0x223b, B:225:0x223d, B:225:0x223d, B:227:0x2243, B:227:0x2243, B:228:0x2244, B:228:0x2244, B:114:0x1344, B:114:0x1344, B:118:0x13c5, B:118:0x13c5, B:230:0x2246, B:230:0x2246, B:232:0x224c, B:232:0x224c, B:233:0x224d, B:233:0x224d, B:92:0x0e97, B:92:0x0e97, B:96:0x1176, B:96:0x1176, B:98:0x117c, B:98:0x117c, B:99:0x11bc, B:99:0x11bc, B:101:0x11d4, B:101:0x11d4, B:103:0x11e1, B:103:0x11e1, B:104:0x1221, B:104:0x1221, B:106:0x1236, B:106:0x1236, B:107:0x1274, B:107:0x1274, B:234:0x224e, B:234:0x224e, B:235:0x2253, B:235:0x2253, B:237:0x2255, B:237:0x2255, B:239:0x225b, B:239:0x225b, B:240:0x225c, B:240:0x225c), top: B:266:0x0c75 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0535  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object AuthenticationRequestParameters(java.lang.Object[] r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 8822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKTransactionID.AuthenticationRequestParameters(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r23, java.lang.String r24, boolean r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKTransactionID.a(int, java.lang.String, boolean, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 65
            byte[] r0 = atd.e.getSDKTransactionID.$$a
            int r1 = 31 - r8
            int r7 = 151 - r7
            byte[] r1 = new byte[r1]
            int r8 = 30 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r6 = r8
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2f
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r6 = r6 + r7
            int r6 = r6 + 1
            r7 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKTransactionID.b(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = 60 - r9
            byte[] r0 = atd.e.getSDKTransactionID.$$d
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 65
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r0
            r4 = r2
            r0 = r9
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r0
            r0 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r0 = r0 + r8
            int r8 = r0 + (-2)
            r0 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKTransactionID.c(int, short, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) {
        int i17 = ~i16;
        int i18 = i11 | i17;
        int i19 = (~(i15 | i16)) | i11;
        int i21 = ~i15;
        int i22 = (~(i16 | i15 | i11)) | (~(i17 | i21)) | (~((~i11) | i21));
        int i23 = (23068672 * i12) + ((-2101346304) * i14) + (543162368 * i13) + (1033423461 * i22) + ((-2066846922) * i19) + (i18 * 1033423461) + (1576585830 * i11) + (((-490261092) * i15) - 1772093440);
        int iC = a0.c(i12, 1307081305, (1609234610 * i14) + i15 + i11 + i13);
        return a0.e(iC, -2011693056, (i12 * (-73506199)) + ((i14 * (-770635566)) + ((i13 * 273352337) + ((i22 * 309) + ((i19 * (-618)) + ((i18 * 309) + ((i11 * 273352646) + ((i15 * 273352028) + 245730370))))))), 1080557568, ((-2103967744) * iC) + i23) != 1 ? AuthenticationRequestParameters(objArr) : getSDKReferenceNumber(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getSDKReferenceNumber(java.lang.Object[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.getSDKTransactionID.getSDKReferenceNumber(java.lang.Object[]):java.lang.Object");
    }

    public static void init$0() {
        $$a = new byte[]{101, -112, -32, 38, -3, 14, -49, 32, 16, -14, -7, 1, -34, 28, 18, -20, -3, 14, -34, -16, 6, -11, 46, -1, -40, -6, 36, -8, 10, -1, -8, 8, -8, -3, -20, 18, 13, 1, -10, 7, -3, 14, -34, -16, 6, -7, 42, -9, -4, 7, -9, 12, -18, 10, -29, 36, -20, 9, -4, -7, -25, 25, 19, -3, 14, -40, 23, 13, -1, -19, 5, -3, -16, 14, 12, 0, -11, 5, -2, 36, -8, 10, -1, -8, 8, -8, -3, -20, 18, 13, 1, -10, 7, -50, 29, 12, -12, 1, 6, -1, -8, -2, -3, 14, -34, -16, 6, 6, 18, 0, -2, 12, -14, 8, -12, 1, -24, 38, -9, -12, 2, 12, 51, -2, -13, -4, 8, 5, -12, -7, -3, 18, -12, 5, -2, -29, 18, 11, 3, -17, 13, 0, -37, 16, 16, -18, 11, -9, 14, -16, 12, 0, -3, 14, -34, -16, 6, 8, 29, -18, 12, 4, -19, 1, 16, -12, 5, -2, -38, -6};
        $$b = 155;
    }

    public static void init$1() {
        $$d = new byte[]{125, 105, -35, 39, -21, 14, 52, -54, -3, 51, -59, 0, -17, 31, 13, -9, 4, -45, 6, 1, -10, 6, -15, 15, -13, 26, -39, 17, -12, 1, 4, 22, -28, -22, 0, -17, 31, 13, -9, -9, -21, -3, -1, -15, 11, -11, 9, -4, 21, -41, 6, 9, -5, -15, -21, 14, 52, -75, 71, -29, -39, 3, -13, 9, 6, -13, 1, -19, 19, 17, -21, -16, -4, 7, -10, 78, -31, -54, -1, 10, 1, -11, -8, 9, 4, 0, -21, 9, -8, -1, 26, -21, -14, -6, 14, -16, -3, 34, -19, -19, 15, -14, 6, -17, 13, -15, -3, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, -21, 14, 52, -76, 72, -23, -39, 5, -13, -2, 5, -11, 5, 0, 17, -21, -16, -4, 7, -10, 45, -47, -2, 1, -5, 76, -69, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -21, 14, 52, -53, -19, 66, -59, 0, -17, 46, -35, -19, 11, 4, -4, 31, -31, -21, 17, -21, 14, 52, -63, 59, -23, -39, 5, -13, -2, 5, -11, 5, 0, 17, -21, -16, -4, 7, -10, 30, -23, -6, 6, -12, -8, -1, 78, -31, -54, -1, 10, 1, -11, -8, 9, 4, 0, -21, 9, -8, -1, 26, -21, -14, -6, 14, -16, -3, 34, -19, -19, 15, -14, 6, -17, 13, -15, -3, -54, -1, 10, 1, -11, -8, 9, 4, 0, -21, 9, -8, -1, 26, -21, -14, -6, 14, -16, -3, 34, -19, -19, 15, -14, 6, -17, 13, -15, -3, -21, 14, 52, -77, 73, -59, 0, -17, 30, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 25, -35, 17, -21, -3, 0, 77, -69, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 46, -35, -19, 11, 4, -4, 31, -31, -21, 17};
        $$e = 40;
    }

    public static void init$2() {
        $$c = new byte[]{64, 105, 71, -25};
        $$f = 86;
    }

    public final void getSDKTransactionID() {
        int deviceData = ProgressDialog.getSDKReferenceNumber.getDeviceData();
        int deviceData2 = ProgressDialog.getSDKReferenceNumber.getDeviceData();
        int deviceData3 = ProgressDialog.getSDKReferenceNumber.getDeviceData();
        getDeviceData(1382795071, ProgressDialog.getSDKReferenceNumber.getDeviceData(), deviceData2, deviceData3, new Object[]{this}, -1382795070, deviceData);
    }

    public final atd.ae.getSDKEphemeralPublicKey AuthenticationRequestParameters(atd.ae.getSDKReferenceNumber getsdkreferencenumber, JSONObject jSONObject) {
        int deviceData = ProgressDialog.getSDKReferenceNumber.getDeviceData();
        int deviceData2 = ProgressDialog.getSDKReferenceNumber.getDeviceData();
        int deviceData3 = ProgressDialog.getSDKReferenceNumber.getDeviceData();
        return (atd.ae.getSDKEphemeralPublicKey) getDeviceData(200606345, ProgressDialog.getSDKReferenceNumber.getDeviceData(), deviceData2, deviceData3, new Object[]{this, getsdkreferencenumber, jSONObject}, -200606345, deviceData);
    }
}
