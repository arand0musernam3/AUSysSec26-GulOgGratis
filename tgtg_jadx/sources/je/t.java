package je;

import android.graphics.Path;
import ax.g0;
import he.d0;
import he.z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements n, ke.a, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f25115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ke.n f25116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25117f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f25112a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0 f25118g = new g0(1);

    public t(z zVar, re.b bVar, qe.t tVar) {
        this.f25113b = tVar.f37014a;
        this.f25114c = tVar.f37017d;
        this.f25115d = zVar;
        ke.n nVar = new ke.n((List) tVar.f37016c.f21216b);
        this.f25116e = nVar;
        bVar.f(nVar);
        nVar.a(this);
    }

    @Override // ke.a
    public final void a() {
        this.f25117f = false;
        this.f25115d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    @Override // je.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List r6, java.util.List r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            r1 = r6
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            if (r0 >= r2) goto L41
            java.lang.Object r1 = r1.get(r0)
            je.c r1 = (je.c) r1
            boolean r2 = r1 instanceof je.v
            if (r2 == 0) goto L29
            r2 = r1
            je.v r2 = (je.v) r2
            qe.y r3 = r2.f25126c
            qe.y r4 = qe.y.SIMULTANEOUSLY
            if (r3 != r4) goto L29
            ax.g0 r1 = r5.f25118g
            java.util.ArrayList r1 = r1.f4909a
            r1.add(r2)
            r2.d(r5)
            goto L3e
        L29:
            boolean r2 = r1 instanceof je.s
            if (r2 == 0) goto L3e
            if (r7 != 0) goto L34
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L34:
            je.s r1 = (je.s) r1
            ke.e r2 = r1.f25110b
            r2.a(r5)
            r7.add(r1)
        L3e:
            int r0 = r0 + 1
            goto L2
        L41:
            ke.n r6 = r5.f25116e
            r6.f26330m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je.t.c(java.util.List, java.util.List):void");
    }

    @Override // oe.g
    public final void d(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
        ve.g.g(fVar, i11, arrayList, fVar2, this);
    }

    @Override // je.n
    public final Path g() {
        boolean z11 = this.f25117f;
        ke.n nVar = this.f25116e;
        Path path = this.f25112a;
        if (z11 && nVar.f26305e == null) {
            return path;
        }
        path.reset();
        if (this.f25114c) {
            this.f25117f = true;
            return path;
        }
        Path path2 = (Path) nVar.f();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f25118g.f(path);
        this.f25117f = true;
        return path;
    }

    @Override // je.c
    public final String getName() {
        return this.f25113b;
    }

    @Override // oe.g
    public final void h(Object obj, ub.a aVar) {
        if (obj == d0.N) {
            this.f25116e.k(aVar);
        }
    }
}
