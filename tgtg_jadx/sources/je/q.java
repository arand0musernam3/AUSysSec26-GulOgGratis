package je;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import ax.g0;
import he.d0;
import he.z;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements ke.a, k, n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f25092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ke.e f25093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ke.e f25094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ke.i f25095h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25098k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f25088a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f25089b = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g0 f25096i = new g0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ke.e f25097j = null;

    public q(z zVar, re.b bVar, qe.o oVar) {
        this.f25090c = (String) oVar.f36996b;
        this.f25091d = oVar.f36998d;
        this.f25092e = zVar;
        ke.e eVarG = oVar.f36999e.g();
        this.f25093f = eVarG;
        ke.e eVarG2 = ((pe.e) oVar.f37000f).g();
        this.f25094g = eVarG2;
        ke.i iVarG = oVar.f36997c.g();
        this.f25095h = iVarG;
        bVar.f(eVarG);
        bVar.f(eVarG2);
        bVar.f(iVarG);
        eVarG.a(this);
        eVarG2.a(this);
        iVarG.a(this);
    }

    @Override // ke.a
    public final void a() {
        this.f25098k = false;
        this.f25092e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // je.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L35
            java.lang.Object r0 = r0.get(r6)
            je.c r0 = (je.c) r0
            boolean r1 = r0 instanceof je.v
            if (r1 == 0) goto L28
            r1 = r0
            je.v r1 = (je.v) r1
            qe.y r2 = r1.f25126c
            qe.y r3 = qe.y.SIMULTANEOUSLY
            if (r2 != r3) goto L28
            ax.g0 r0 = r4.f25096i
            java.util.ArrayList r0 = r0.f4909a
            r0.add(r1)
            r1.d(r4)
            goto L32
        L28:
            boolean r1 = r0 instanceof je.s
            if (r1 == 0) goto L32
            je.s r0 = (je.s) r0
            ke.e r0 = r0.f25110b
            r4.f25097j = r0
        L32:
            int r6 = r6 + 1
            goto L1
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je.q.c(java.util.List, java.util.List):void");
    }

    @Override // oe.g
    public final void d(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
        ve.g.g(fVar, i11, arrayList, fVar2, this);
    }

    @Override // je.n
    public final Path g() {
        float f11;
        ke.e eVar;
        boolean z11 = this.f25098k;
        Path path = this.f25088a;
        if (z11) {
            return path;
        }
        path.reset();
        if (this.f25091d) {
            this.f25098k = true;
            return path;
        }
        PointF pointF = (PointF) this.f25094g.f();
        float f12 = pointF.x / 2.0f;
        float f13 = pointF.y / 2.0f;
        ke.i iVar = this.f25095h;
        float fM = iVar == null ? 0.0f : iVar.m();
        if (fM == 0.0f && (eVar = this.f25097j) != null) {
            fM = Math.min(((Float) eVar.f()).floatValue(), Math.min(f12, f13));
        }
        float fMin = Math.min(f12, f13);
        if (fM > fMin) {
            fM = fMin;
        }
        PointF pointF2 = (PointF) this.f25093f.f();
        path.moveTo(pointF2.x + f12, (pointF2.y - f13) + fM);
        path.lineTo(pointF2.x + f12, (pointF2.y + f13) - fM);
        RectF rectF = this.f25089b;
        if (fM > 0.0f) {
            float f14 = pointF2.x + f12;
            float f15 = fM * 2.0f;
            f11 = 2.0f;
            float f16 = pointF2.y + f13;
            rectF.set(f14 - f15, f16 - f15, f14, f16);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f11 = 2.0f;
        }
        path.lineTo((pointF2.x - f12) + fM, pointF2.y + f13);
        if (fM > 0.0f) {
            float f17 = pointF2.x - f12;
            float f18 = pointF2.y + f13;
            float f19 = fM * f11;
            rectF.set(f17, f18 - f19, f19 + f17, f18);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f12, (pointF2.y - f13) + fM);
        if (fM > 0.0f) {
            float f20 = pointF2.x - f12;
            float f21 = pointF2.y - f13;
            float f22 = fM * f11;
            rectF.set(f20, f21, f20 + f22, f22 + f21);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f12) - fM, pointF2.y - f13);
        if (fM > 0.0f) {
            float f23 = pointF2.x + f12;
            float f24 = fM * f11;
            float f25 = pointF2.y - f13;
            rectF.set(f23 - f24, f25, f23, f24 + f25);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f25096i.f(path);
        this.f25098k = true;
        return path;
    }

    @Override // je.c
    public final String getName() {
        return this.f25090c;
    }

    @Override // oe.g
    public final void h(Object obj, ub.a aVar) {
        if (obj == d0.f21879g) {
            this.f25094g.k(aVar);
        } else if (obj == d0.f21881i) {
            this.f25093f.k(aVar);
        } else if (obj == d0.f21880h) {
            this.f25095h.k(aVar);
        }
    }
}
