package je;

import android.graphics.Path;
import android.graphics.PointF;
import ax.g0;
import he.d0;
import he.z;
import java.util.ArrayList;
import java.util.List;
import qe.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n, ke.a, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f25018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ke.j f25019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ke.e f25020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qe.a f25021f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25023h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f25016a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0 f25022g = new g0(1);

    public f(z zVar, re.b bVar, qe.a aVar) {
        this.f25017b = aVar.f36950a;
        this.f25018c = zVar;
        ke.e eVarG = aVar.f36952c.g();
        this.f25019d = (ke.j) eVarG;
        ke.e eVarG2 = aVar.f36951b.g();
        this.f25020e = eVarG2;
        this.f25021f = aVar;
        bVar.f(eVarG);
        bVar.f(eVarG2);
        eVarG.a(this);
        eVarG2.a(this);
    }

    @Override // ke.a
    public final void a() {
        this.f25023h = false;
        this.f25018c.invalidateSelf();
    }

    @Override // je.c
    public final void c(List list, List list2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i11 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i11);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.f25126c == y.SIMULTANEOUSLY) {
                    this.f25022g.f4909a.add(vVar);
                    vVar.d(this);
                }
            }
            i11++;
        }
    }

    @Override // oe.g
    public final void d(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
        ve.g.g(fVar, i11, arrayList, fVar2, this);
    }

    @Override // je.n
    public final Path g() {
        boolean z11 = this.f25023h;
        Path path = this.f25016a;
        if (z11) {
            return path;
        }
        path.reset();
        qe.a aVar = this.f25021f;
        if (aVar.f36954e) {
            this.f25023h = true;
            return path;
        }
        PointF pointF = (PointF) this.f25019d.f();
        float f11 = pointF.x / 2.0f;
        float f12 = pointF.y / 2.0f;
        float f13 = f11 * 0.55228f;
        float f14 = f12 * 0.55228f;
        path.reset();
        if (aVar.f36953d) {
            float f15 = -f12;
            path.moveTo(0.0f, f15);
            float f16 = 0.0f - f13;
            float f17 = -f11;
            float f18 = 0.0f - f14;
            path.cubicTo(f16, f15, f17, f18, f17, 0.0f);
            float f19 = f14 + 0.0f;
            path.cubicTo(f17, f19, f16, f12, 0.0f, f12);
            float f20 = f13 + 0.0f;
            path.cubicTo(f20, f12, f11, f19, f11, 0.0f);
            path.cubicTo(f11, f18, f20, f15, 0.0f, f15);
        } else {
            float f21 = -f12;
            path.moveTo(0.0f, f21);
            float f22 = f13 + 0.0f;
            float f23 = 0.0f - f14;
            path.cubicTo(f22, f21, f11, f23, f11, 0.0f);
            float f24 = f14 + 0.0f;
            path.cubicTo(f11, f24, f22, f12, 0.0f, f12);
            float f25 = 0.0f - f13;
            float f26 = -f11;
            path.cubicTo(f25, f12, f26, f24, f26, 0.0f);
            path.cubicTo(f26, f23, f25, f21, 0.0f, f21);
        }
        PointF pointF2 = (PointF) this.f25020e.f();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f25022g.f(path);
        this.f25023h = true;
        return path;
    }

    @Override // je.c
    public final String getName() {
        return this.f25017b;
    }

    @Override // oe.g
    public final void h(Object obj, ub.a aVar) {
        if (obj == d0.f21878f) {
            this.f25019d.k(aVar);
        } else if (obj == d0.f21881i) {
            this.f25020e.k(aVar);
        }
    }
}
