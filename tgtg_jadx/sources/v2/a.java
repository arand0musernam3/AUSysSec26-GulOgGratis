package v2;

import java.util.List;
import kotlin.Pair;
import m5.t0;
import w2.j0;
import w2.k0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f41919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f41920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ub.a f41921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f41923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o3.e f41924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Pair f41925g;

    public a(b bVar, ub.a aVar, j0 j0Var, int i11) {
        o3.e eVar = null;
        aVar = (i11 & 2) != 0 ? null : aVar;
        this.f41919a = (i11 & 8) != 0 ? null : j0Var;
        k0 k0Var = new k0();
        k0Var.f42953a = bVar;
        k0Var.f42955c = -1;
        k0Var.f42956d = -1;
        this.f41920b = k0Var;
        this.f41921c = aVar != null ? new ub.a(aVar) : null;
        long j9 = bVar.f41929d;
        List list = bVar.f41926a;
        this.f41922d = j9;
        this.f41923e = bVar.f41930e;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            m5.f[] fVarArr = new m5.f[size];
            for (int i12 = 0; i12 < size; i12++) {
                fVarArr[i12] = (m5.f) list.get(i12);
            }
            eVar = new o3.e(fVarArr, size);
        }
        this.f41924f = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v2.b g(v2.a r9, long r10, m5.t0 r12, int r13) {
        /*
            r0 = r13 & 1
            if (r0 == 0) goto L6
            long r10 = r9.f41922d
        L6:
            r2 = r10
            r10 = r13 & 2
            if (r10 == 0) goto Ld
            m5.t0 r12 = r9.f41923e
        Ld:
            r4 = r12
            o3.e r10 = r9.f41924f
            r11 = 0
            if (r10 == 0) goto L22
            java.util.List r10 = r10.f()
            r12 = r10
            o3.b r12 = (o3.b) r12
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L22
            r6 = r10
            goto L23
        L22:
            r6 = r11
        L23:
            v2.b r0 = new v2.b
            w2.k0 r9 = r9.f41920b
            java.lang.String r1 = r9.toString()
            r5 = 0
            r8 = 8
            r7 = 0
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.a.g(v2.a, long, m5.t0, int):v2.b");
    }

    public final ub.a a() {
        ub.a aVar = this.f41921c;
        if (aVar != null) {
            return aVar;
        }
        ub.a aVar2 = new ub.a((ub.a) null);
        this.f41921c = aVar2;
        return aVar2;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            k0 k0Var = this.f41920b;
            b(k0Var.length(), k0Var.length(), charSequence.length());
            k0Var.a(k0Var.length(), k0Var.length(), charSequence.length(), charSequence);
        }
        return this;
    }

    public final void b(int i11, int i12, int i13) {
        int i14;
        ub.a aVarA = a();
        if (i11 != i12 || i13 != 0) {
            int iMin = Math.min(i11, i12);
            int iMax = Math.max(i11, i12);
            int i15 = i13 - (iMax - iMin);
            int i16 = 0;
            w2.j jVar = null;
            boolean z11 = false;
            while (true) {
                o3.e eVar = (o3.e) aVarA.f40981b;
                if (i16 >= eVar.f31832c) {
                    break;
                }
                w2.j jVar2 = (w2.j) eVar.f31830a[i16];
                int i17 = jVar2.f42941a;
                if ((iMin > i17 || i17 > iMax) && ((iMin > (i14 = jVar2.f42942b) || i14 > iMax) && ((iMin > i14 || i17 > iMin) && (iMax > i14 || i17 > iMax)))) {
                    if (i17 > iMax && !z11) {
                        aVarA.k(jVar, iMin, iMax, i15);
                        z11 = true;
                    }
                    if (z11) {
                        jVar2.f42941a += i15;
                        jVar2.f42942b += i15;
                    }
                    ((o3.e) aVarA.f40982c).b(jVar2);
                } else if (jVar == null) {
                    jVar = jVar2;
                } else {
                    jVar.f42942b = jVar2.f42942b;
                    jVar.f42944d = jVar2.f42944d;
                }
                i16++;
            }
            if (!z11) {
                aVarA.k(jVar, iMin, iMax, i15);
            }
            o3.e eVar2 = (o3.e) aVarA.f40981b;
            aVarA.f40981b = (o3.e) aVarA.f40982c;
            aVarA.f40982c = eVar2;
            eVar2.g();
        }
        j0 j0Var = this.f41919a;
        if (j0Var != null) {
            j0Var.c(i11, i12, i13);
        }
        this.f41922d = k.b(i11, i12, i13, this.f41922d);
    }

    public final void c(int i11, int i12, CharSequence charSequence) {
        int length = charSequence.length();
        if (i11 > i12) {
            c2.a.a("Expected start=" + i11 + " <= end=" + i12);
        }
        if (length < 0) {
            c2.a.a("Expected textStart=0 <= textEnd=" + length);
        }
        b(i11, i12, length);
        this.f41920b.a(i11, i12, length, charSequence);
        e(null);
        this.f41925g = null;
    }

    public final void d(List list, int i11, int i12) {
        k0 k0Var = this.f41920b;
        if (i11 < 0 || i11 > k0Var.length()) {
            org.bouncycastle.jce.provider.a.e(k0Var.length(), org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "start (", ") offset is outside of text region "));
            return;
        }
        if (i12 < 0 || i12 > k0Var.length()) {
            org.bouncycastle.jce.provider.a.e(k0Var.length(), org.bouncycastle.jcajce.provider.asymmetric.a.k(i12, "end (", ") offset is outside of text region "));
            return;
        }
        if (i11 >= i12) {
            i4.a.f(r8.k.k("Do not set reversed or empty range: ", i11, i12, " > "));
            return;
        }
        e(new t0(m5.k0.b(i11, i12)));
        o3.e eVar = this.f41924f;
        if (eVar != null) {
            eVar.g();
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.f41924f == null) {
            this.f41924f = new o3.e(new m5.f[16], 0);
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            m5.f fVar = (m5.f) list.get(i13);
            o3.e eVar2 = this.f41924f;
            if (eVar2 != null) {
                eVar2.b(m5.f.a(fVar, null, fVar.f29530b + i11, fVar.f29531c + i11, 9));
            }
        }
    }

    public final void e(t0 t0Var) {
        if (t0Var != null && !t0.d(t0Var.f29650a)) {
            this.f41923e = t0Var;
            return;
        }
        this.f41923e = null;
        o3.e eVar = this.f41924f;
        if (eVar != null) {
            eVar.g();
        }
    }

    public final void f(long j9) {
        long jB = m5.k0.b(0, this.f41920b.length());
        if (!t0.a(jB, j9)) {
            c2.a.a("Expected " + ((Object) t0.i(j9)) + " to be in " + ((Object) t0.i(jB)));
        }
        this.f41922d = j9;
        this.f41925g = null;
    }

    public final String toString() {
        return this.f41920b.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c3) {
        k0 k0Var = this.f41920b;
        b(k0Var.length(), k0Var.length(), 1);
        int length = k0Var.length();
        int length2 = k0Var.length();
        String strValueOf = String.valueOf(c3);
        k0Var.a(length, length2, strValueOf.length(), strValueOf);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i11, int i12) {
        if (charSequence != null) {
            k0 k0Var = this.f41920b;
            b(k0Var.length(), k0Var.length(), i12 - i11);
            int length = k0Var.length();
            int length2 = k0Var.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i11, i12);
            k0Var.a(length, length2, charSequenceSubSequence.length(), charSequenceSubSequence);
        }
        return this;
    }
}
