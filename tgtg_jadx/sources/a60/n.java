package a60;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia0.y f885b;

    public /* synthetic */ n(String[] strArr, ia0.y yVar) {
        this.f884a = strArr;
        this.f885b = yVar;
    }

    public static n a(String... strArr) {
        try {
            ia0.j[] jVarArr = new ia0.j[strArr.length];
            ia0.g gVar = new ia0.g();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                q.H(gVar, strArr[i11]);
                gVar.readByte();
                jVarArr[i11] = gVar.q(gVar.f23643b);
            }
            String[] strArr2 = (String[]) strArr.clone();
            int i12 = ia0.y.f23687d;
            return new n(strArr2, ia0.b.f(jVarArr));
        } catch (IOException e5) {
            i4.a.d(e5);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006d, TryCatch #0 {IOException -> 0x006d, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a60.n b(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6d
            ia0.j[] r0 = new ia0.j[r0]     // Catch: java.io.IOException -> L6d
            ia0.g r1 = new ia0.g     // Catch: java.io.IOException -> L6d
            r1.<init>()     // Catch: java.io.IOException -> L6d
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6d
            if (r3 >= r4) goto L5b
            r4 = r12[r3]     // Catch: java.io.IOException -> L6d
            java.lang.String[] r5 = ue.d.f41063e     // Catch: java.io.IOException -> L6d
            r6 = 34
            r1.z0(r6)     // Catch: java.io.IOException -> L6d
            int r7 = r4.length()     // Catch: java.io.IOException -> L6d
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6d
            r11 = 128(0x80, float:1.8E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6d
            if (r10 != 0) goto L38
            goto L42
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.E0(r9, r8, r4)     // Catch: java.io.IOException -> L6d
        L3d:
            r1.F0(r10)     // Catch: java.io.IOException -> L6d
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.E0(r9, r7, r4)     // Catch: java.io.IOException -> L6d
        L4a:
            r1.z0(r6)     // Catch: java.io.IOException -> L6d
            r1.readByte()     // Catch: java.io.IOException -> L6d
            long r4 = r1.f23643b     // Catch: java.io.IOException -> L6d
            ia0.j r4 = r1.q(r4)     // Catch: java.io.IOException -> L6d
            r0[r3] = r4     // Catch: java.io.IOException -> L6d
            int r3 = r3 + 1
            goto La
        L5b:
            a60.n r1 = new a60.n     // Catch: java.io.IOException -> L6d
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6d
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6d
            int r2 = ia0.y.f23687d     // Catch: java.io.IOException -> L6d
            ia0.y r0 = ia0.b.f(r0)     // Catch: java.io.IOException -> L6d
            r1.<init>(r12, r0)     // Catch: java.io.IOException -> L6d
            return r1
        L6d:
            r12 = move-exception
            i4.a.d(r12)
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a60.n.b(java.lang.String[]):a60.n");
    }
}
