package m5;

import android.graphics.Canvas;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u5.d f29511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f29513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n5.i f29514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f29515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f29516f;

    /* JADX WARN: Removed duplicated region for block: B:103:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(u5.d r22, int r23, int r24, long r25) {
        /*
            Method dump skipped, instruction units count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.b.<init>(u5.d, int, int, long):void");
    }

    public final n5.i a(int i11, int i12, TextUtils.TruncateAt truncateAt, int i13, int i14, int i15, int i16, int i17, CharSequence charSequence) {
        z zVar;
        float fD = d();
        u5.d dVar = this.f29511a;
        u5.e eVar = dVar.f40773g;
        int i18 = dVar.l;
        n5.f fVar = dVar.f40775i;
        u0 u0Var = dVar.f40768b;
        u5.b bVar = u5.c.f40766a;
        b0 b0Var = u0Var.f29657c;
        return new n5.i(charSequence, fD, eVar, i11, truncateAt, i18, (b0Var == null || (zVar = b0Var.f29518b) == null) ? false : zVar.f29674a, i13, i15, i16, i17, i14, i12, fVar);
    }

    public final float b() {
        return this.f29514d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(h4.c r12, int r13, m0.i1 r14) {
        /*
            r11 = this;
            android.graphics.RectF r4 = i4.g0.A(r12)
            r12 = 1
            r8 = 0
            if (r13 != 0) goto L9
            goto Ld
        L9:
            if (r13 != r12) goto Ld
            r13 = r12
            goto Le
        Ld:
            r13 = r8
        Le:
            lk.a r6 = new lk.a
            r0 = 16
            r6.<init>(r14, r0)
            n5.i r0 = r11.f29514d
            android.text.Layout r1 = r0.f30531f
            int r14 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r14 < r2) goto L25
            int[] r13 = h7.i0.n(r0, r4, r13, r6)
            goto Lba
        L25:
            androidx.lifecycle.n1 r2 = r0.c()
            if (r13 != r12) goto L3c
            k8.d r13 = new k8.d
            java.lang.CharSequence r14 = r1.getText()
            mv.b0 r3 = r0.j()
            r5 = 25
            r13.<init>(r5, r14, r3)
        L3a:
            r5 = r13
            goto L53
        L3c:
            java.lang.CharSequence r13 = r1.getText()
            android.text.TextPaint r3 = r0.f30526a
            r5 = 29
            if (r14 < r5) goto L4d
            o5.b r14 = new o5.b
            r14.<init>(r13, r3)
        L4b:
            r13 = r14
            goto L3a
        L4d:
            o5.c r14 = new o5.c
            r14.<init>(r13)
            goto L4b
        L53:
            float r13 = r4.top
            int r13 = (int) r13
            int r13 = r1.getLineForVertical(r13)
            float r14 = r4.top
            float r3 = r0.e(r13)
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 <= 0) goto L6b
            int r13 = r13 + 1
            int r14 = r0.f30532g
            if (r13 < r14) goto L6b
            goto Laa
        L6b:
            r3 = r13
            float r13 = r4.bottom
            int r13 = (int) r13
            int r13 = r1.getLineForVertical(r13)
            if (r13 != 0) goto L80
            float r14 = r4.bottom
            float r7 = r0.g(r8)
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 >= 0) goto L80
            goto Laa
        L80:
            r7 = 1
            int r14 = ox.h.D(r0, r1, r2, r3, r4, r5, r6, r7)
        L85:
            r9 = r3
            r10 = -1
            if (r14 != r10) goto L93
            if (r9 >= r13) goto L93
            int r3 = r9 + 1
            r7 = 1
            int r14 = ox.h.D(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L85
        L93:
            if (r14 != r10) goto L96
            goto Laa
        L96:
            r7 = 0
            r3 = r13
            int r13 = ox.h.D(r0, r1, r2, r3, r4, r5, r6, r7)
        L9c:
            if (r13 != r10) goto La8
            if (r9 >= r3) goto La8
            int r3 = r3 + (-1)
            r7 = 0
            int r13 = ox.h.D(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L9c
        La8:
            if (r13 != r10) goto Lac
        Laa:
            r13 = 0
            goto Lba
        Lac:
            int r14 = r14 + r12
            int r14 = r5.n(r14)
            int r13 = r13 - r12
            int r13 = r5.o(r13)
            int[] r13 = new int[]{r14, r13}
        Lba:
            if (r13 != 0) goto Lbf
            long r12 = m5.t0.f29648b
            return r12
        Lbf:
            r14 = r13[r8]
            r12 = r13[r12]
            long r12 = m5.k0.b(r14, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.b.c(h4.c, int, m0.i1):long");
    }

    public final float d() {
        return z5.a.i(this.f29513c);
    }

    public final void e(i4.t tVar) {
        Canvas canvasA = i4.d.a(tVar);
        n5.i iVar = this.f29514d;
        if (iVar.f30529d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i11 = iVar.f30533h;
        if (canvasA.getClipBounds(iVar.f30540p)) {
            if (i11 != 0) {
                canvasA.translate(0.0f, i11);
            }
            ThreadLocal threadLocal = n5.j.f30542a;
            Object hVar = threadLocal.get();
            if (hVar == null) {
                hVar = new n5.h();
                threadLocal.set(hVar);
            }
            n5.h hVar2 = (n5.h) hVar;
            hVar2.f30525a = canvasA;
            try {
                iVar.f30531f.draw(hVar2);
                if (i11 != 0) {
                    canvasA.translate(0.0f, (-1) * i11);
                }
            } finally {
                hVar2.f30525a = null;
            }
        }
        if (iVar.f30529d) {
            canvasA.restore();
        }
    }

    public final void f(i4.t tVar, long j9, i4.u0 u0Var, x5.l lVar, k4.e eVar) {
        u5.e eVar2 = this.f29511a.f40773g;
        int i11 = eVar2.f40780c;
        eVar2.d(j9);
        eVar2.f(u0Var);
        eVar2.g(lVar);
        eVar2.e(eVar);
        eVar2.b(3);
        e(tVar);
        eVar2.b(i11);
    }

    public final void g(i4.t tVar, i4.r rVar, float f11, i4.u0 u0Var, x5.l lVar, k4.e eVar) {
        u5.e eVar2 = this.f29511a.f40773g;
        int i11 = eVar2.f40780c;
        float fD = d();
        eVar2.c(rVar, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f11);
        eVar2.f(u0Var);
        eVar2.g(lVar);
        eVar2.e(eVar);
        eVar2.b(3);
        e(tVar);
        eVar2.b(i11);
    }
}
