package u5;

import android.graphics.Paint;
import android.text.TextPaint;
import i0.w;
import i4.g0;
import i4.r;
import i4.u0;
import i4.v;
import kotlin.jvm.internal.Intrinsics;
import m3.i0;
import x5.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f40778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f40779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0 f40781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f40782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f40783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i0 f40784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h4.e f40785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k4.e f40786i;

    public final w a() {
        w wVar = this.f40778a;
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this);
        this.f40778a = wVar2;
        return wVar2;
    }

    public final void b(int i11) {
        if (i11 == this.f40780c) {
            return;
        }
        a().G(i11);
        this.f40780c = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(i4.r r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f40784g = r0
            r5.f40783f = r0
            r5.f40785h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof i4.x0
            if (r1 == 0) goto L1d
            i4.x0 r6 = (i4.x0) r6
            long r6 = r6.f23332a
            long r6 = h0.g.z(r9, r6)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof i4.t0
            if (r1 == 0) goto L72
            i4.r r1 = r5.f40783f
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            h4.e r1 = r5.f40785h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f21392a
            boolean r1 = h4.e.a(r3, r7)
        L36:
            if (r1 != 0) goto L59
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L59
            r5.f40783f = r6
            h4.e r1 = new h4.e
            r1.<init>(r7)
            r5.f40785h = r1
            com.braze.c1 r1 = new com.braze.c1
            r2 = 4
            r1.<init>(r2, r7, r6)
            m3.i0 r6 = m3.i.q(r1)
            r5.f40784g = r6
        L59:
            i0.w r6 = r5.a()
            m3.i0 r7 = r5.f40784g
            if (r7 == 0) goto L68
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L69
        L68:
            r7 = r0
        L69:
            r6.L(r7)
            r5.f40782e = r0
            u5.j.b(r5, r9)
            return
        L72:
            e40.a.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.e.c(i4.r, long, float):void");
    }

    public final void d(long j9) {
        v vVar = this.f40782e;
        if (vVar == null ? false : v.c(vVar.f23317a, j9)) {
            return;
        }
        if (j9 != 16) {
            this.f40782e = new v(j9);
            setColor(g0.C(j9));
            this.f40784g = null;
            this.f40783f = null;
            this.f40785h = null;
            setShader(null);
        }
    }

    public final void e(k4.e eVar) {
        if (eVar == null || Intrinsics.areEqual(this.f40786i, eVar)) {
            return;
        }
        this.f40786i = eVar;
        if (Intrinsics.areEqual(eVar, k4.g.f25943a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(eVar instanceof k4.h)) {
            e40.a.f();
            return;
        }
        a().R(1);
        k4.h hVar = (k4.h) eVar;
        a().Q(hVar.f25944a);
        w wVarA = a();
        ((Paint) wVarA.f22746c).setStrokeMiter(hVar.f25945b);
        a().P(hVar.f25947d);
        a().O(hVar.f25946c);
        a().K(hVar.f25948e);
    }

    public final void f(u0 u0Var) {
        if (u0Var == null || Intrinsics.areEqual(this.f40781d, u0Var)) {
            return;
        }
        this.f40781d = u0Var;
        if (Intrinsics.areEqual(u0Var, u0.f23305d)) {
            clearShadowLayer();
            return;
        }
        u0 u0Var2 = this.f40781d;
        float f11 = u0Var2.f23308c;
        if (f11 == 0.0f) {
            f11 = Float.MIN_VALUE;
        }
        setShadowLayer(f11, Float.intBitsToFloat((int) (u0Var2.f23307b >> 32)), Float.intBitsToFloat((int) (this.f40781d.f23307b & 4294967295L)), g0.C(this.f40781d.f23306a));
    }

    public final void g(l lVar) {
        if (lVar == null || Intrinsics.areEqual(this.f40779b, lVar)) {
            return;
        }
        this.f40779b = lVar;
        int i11 = lVar.f43856a;
        setUnderlineText((i11 | 1) == i11);
        int i12 = this.f40779b.f43856a;
        setStrikeThruText((i12 | 2) == i12);
    }
}
