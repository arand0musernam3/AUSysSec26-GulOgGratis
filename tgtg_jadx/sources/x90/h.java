package x90;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ia0.j f44115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f44116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f44117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f44118d;

    static {
        ia0.j jVar = ia0.j.f23646d;
        f44115a = r40.d.p("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f44116b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f44117c = new String[64];
        String[] strArr = new String[256];
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            binaryString.getClass();
            String strReplace = r90.g.d("%8s", binaryString).replace(' ', '0');
            strReplace.getClass();
            strArr[i11] = strReplace;
        }
        f44118d = strArr;
        String[] strArr2 = f44117c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = iArr[0];
        strArr2[i12 | 8] = r8.k.p(new StringBuilder(), strArr2[i12], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            int i15 = iArr[0];
            String[] strArr3 = f44117c;
            int i16 = i15 | i14;
            strArr3[i16] = strArr3[i15] + '|' + strArr3[i14];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i15]);
            sb2.append('|');
            strArr3[i16 | 8] = r8.k.p(sb2, strArr3[i14], "|PADDED");
        }
        int length = f44117c.length;
        for (int i17 = 0; i17 < length; i17++) {
            String[] strArr4 = f44117c;
            if (strArr4[i17] == null) {
                strArr4[i17] = f44118d[i17];
            }
        }
    }

    public static String a(int i11) {
        String[] strArr = f44116b;
        return i11 < strArr.length ? strArr[i11] : r90.g.d("0x%02x", Integer.valueOf(i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            java.lang.String r0 = a(r6)
            if (r7 != 0) goto L9
            java.lang.String r6 = ""
            goto L58
        L9:
            r1 = 2
            java.lang.String[] r2 = x90.h.f44118d
            if (r6 == r1) goto L56
            r1 = 3
            if (r6 == r1) goto L56
            r1 = 4
            if (r6 == r1) goto L4d
            r1 = 6
            if (r6 == r1) goto L4d
            r1 = 7
            if (r6 == r1) goto L56
            r1 = 8
            if (r6 == r1) goto L56
            java.lang.String[] r1 = x90.h.f44117c
            int r3 = r1.length
            if (r7 >= r3) goto L29
            r1 = r1[r7]
            r1.getClass()
            goto L2b
        L29:
            r1 = r2[r7]
        L2b:
            r2 = 5
            r3 = 0
            if (r6 != r2) goto L3c
            r2 = r7 & 4
            if (r2 == 0) goto L3c
            java.lang.String r6 = "HEADERS"
            java.lang.String r7 = "PUSH_PROMISE"
            java.lang.String r6 = kotlin.text.y.n(r1, r6, r7, r3)
            goto L58
        L3c:
            if (r6 != 0) goto L4b
            r6 = r7 & 32
            if (r6 == 0) goto L4b
            java.lang.String r6 = "PRIORITY"
            java.lang.String r7 = "COMPRESSED"
            java.lang.String r6 = kotlin.text.y.n(r1, r6, r7, r3)
            goto L58
        L4b:
            r6 = r1
            goto L58
        L4d:
            r6 = 1
            if (r7 != r6) goto L53
            java.lang.String r6 = "ACK"
            goto L58
        L53:
            r6 = r2[r7]
            goto L58
        L56:
            r6 = r2[r7]
        L58:
            if (r8 == 0) goto L5d
            java.lang.String r7 = "<<"
            goto L5f
        L5d:
            java.lang.String r7 = ">>"
        L5f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r7, r4, r5, r0, r6}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = r90.g.d(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x90.h.b(int, int, int, int, boolean):java.lang.String");
    }

    public static String c(boolean z11, int i11, int i12, long j9) {
        return r90.g.d("%s 0x%08x %5d %-13s %d", z11 ? "<<" : ">>", Integer.valueOf(i11), Integer.valueOf(i12), a(8), Long.valueOf(j9));
    }
}
