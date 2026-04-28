package re;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import he.g0;
import he.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ke.q;
import ke.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements je.e, ke.a, oe.g {
    public float A;
    public BlurMaskFilter B;
    public ie.a C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f37896a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f37897b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f37898c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ie.a f37899d = new ie.a(1, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ie.a f37900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ie.a f37901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ie.a f37902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ie.a f37903h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final RectF f37904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f37905j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f37906k;
    public final RectF l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f37907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f37908n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z f37909o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h f37910p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j30.g f37911q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ke.i f37912r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b f37913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b f37914t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f37915u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f37916v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r f37917w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f37918x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f37919y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ie.a f37920z;

    public b(z zVar, h hVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f37900e = new ie.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f37901f = new ie.a(mode2);
        ie.a aVar = new ie.a(1, 0);
        this.f37902g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        ie.a aVar2 = new ie.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f37903h = aVar2;
        this.f37904i = new RectF();
        this.f37905j = new RectF();
        this.f37906k = new RectF();
        this.l = new RectF();
        this.f37907m = new RectF();
        this.f37908n = new Matrix();
        this.f37916v = new ArrayList();
        this.f37918x = true;
        this.A = 0.0f;
        this.f37909o = zVar;
        this.f37910p = hVar;
        List list = hVar.f37929h;
        if (hVar.f37941u == g.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        pe.d dVar = hVar.f37930i;
        dVar.getClass();
        r rVar = new r(dVar);
        this.f37917w = rVar;
        rVar.b(this);
        if (list != null && !list.isEmpty()) {
            j30.g gVar = new j30.g(list);
            this.f37911q = gVar;
            Iterator it = ((ArrayList) gVar.f24502b).iterator();
            while (it.hasNext()) {
                ((ke.e) it.next()).a(this);
            }
            for (ke.e eVar : (ArrayList) this.f37911q.f24503c) {
                f(eVar);
                eVar.a(this);
            }
        }
        h hVar2 = this.f37910p;
        if (hVar2.f37940t.isEmpty()) {
            if (true != this.f37918x) {
                this.f37918x = true;
                this.f37909o.invalidateSelf();
                return;
            }
            return;
        }
        ke.i iVar = new ke.i(hVar2.f37940t);
        this.f37912r = iVar;
        iVar.f26302b = true;
        iVar.a(new q(this, 3));
        boolean z11 = ((Float) this.f37912r.f()).floatValue() == 1.0f;
        if (z11 != this.f37918x) {
            this.f37918x = z11;
            this.f37909o.invalidateSelf();
        }
        f(this.f37912r);
    }

    @Override // ke.a
    public final void a() {
        this.f37909o.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0208  */
    @Override // je.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, ve.a r24) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.b(android.graphics.Canvas, android.graphics.Matrix, int, ve.a):void");
    }

    @Override // oe.g
    public final void d(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
        b bVar = this.f37913s;
        h hVar = this.f37910p;
        if (bVar != null) {
            String str = bVar.f37910p.f37924c;
            oe.f fVar3 = new oe.f(fVar2);
            fVar3.f32474a.add(str);
            if (fVar.a(i11, this.f37913s.f37910p.f37924c)) {
                b bVar2 = this.f37913s;
                oe.f fVar4 = new oe.f(fVar3);
                fVar4.f32475b = bVar2;
                arrayList.add(fVar4);
            }
            if (fVar.c(i11, this.f37913s.f37910p.f37924c) && fVar.d(i11, hVar.f37924c)) {
                this.f37913s.p(fVar, fVar.b(i11, this.f37913s.f37910p.f37924c) + i11, arrayList, fVar3);
            }
        }
        String str2 = hVar.f37924c;
        String str3 = hVar.f37924c;
        if (fVar.c(i11, str2)) {
            if (!"__container".equals(str3)) {
                oe.f fVar5 = new oe.f(fVar2);
                fVar5.f32474a.add(str3);
                if (fVar.a(i11, str3)) {
                    oe.f fVar6 = new oe.f(fVar5);
                    fVar6.f32475b = this;
                    arrayList.add(fVar6);
                }
                fVar2 = fVar5;
            }
            if (fVar.d(i11, str3)) {
                p(fVar, fVar.b(i11, str3) + i11, arrayList, fVar2);
            }
        }
    }

    @Override // je.e
    public void e(RectF rectF, Matrix matrix, boolean z11) {
        this.f37904i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f37908n;
        matrix2.set(matrix);
        if (z11) {
            List list = this.f37915u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.f37915u.get(size)).f37917w.e());
                }
            } else {
                b bVar = this.f37914t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f37917w.e());
                }
            }
        }
        matrix2.preConcat(this.f37917w.e());
    }

    public final void f(ke.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f37916v.add(eVar);
    }

    @Override // oe.g
    public void h(Object obj, ub.a aVar) {
        this.f37917w.c(obj, aVar);
    }

    public final void i() {
        if (this.f37915u != null) {
            return;
        }
        if (this.f37914t == null) {
            this.f37915u = Collections.EMPTY_LIST;
            return;
        }
        this.f37915u = new ArrayList();
        for (b bVar = this.f37914t; bVar != null; bVar = bVar.f37914t) {
            this.f37915u.add(bVar);
        }
    }

    public final void j(Canvas canvas) {
        he.a aVar = he.e.f21898a;
        RectF rectF = this.f37904i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f37903h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i11, ve.a aVar);

    public jb.b l() {
        return this.f37910p.f37943w;
    }

    public final boolean m() {
        j30.g gVar = this.f37911q;
        return (gVar == null || ((ArrayList) gVar.f24502b).isEmpty()) ? false : true;
    }

    public final void n() {
        g0 g0Var = this.f37909o.f21981a.f21926a;
        String str = this.f37910p.f37924c;
        HashMap map = g0Var.f21914c;
        if (g0Var.f21912a) {
            ve.f fVar = (ve.f) map.get(str);
            if (fVar == null) {
                fVar = new ve.f();
                map.put(str, fVar);
            }
            int i11 = fVar.f42265a + 1;
            fVar.f42265a = i11;
            if (i11 == Integer.MAX_VALUE) {
                fVar.f42265a = i11 / 2;
            }
            if (str.equals("__container")) {
                q1.f fVar2 = g0Var.f21913b;
                fVar2.getClass();
                q1.a aVar = new q1.a(fVar2);
                if (aVar.hasNext()) {
                    aVar.next().getClass();
                    org.bouncycastle.jce.provider.a.c();
                }
            }
        }
    }

    public final void o(ke.e eVar) {
        this.f37916v.remove(eVar);
    }

    public void q(boolean z11) {
        if (z11 && this.f37920z == null) {
            this.f37920z = new ie.a();
        }
        this.f37919y = z11;
    }

    public void r(float f11) {
        he.a aVar = he.e.f21898a;
        r rVar = this.f37917w;
        ke.e eVar = rVar.f26355p;
        if (eVar != null) {
            eVar.j(f11);
        }
        ke.e eVar2 = rVar.f26361v;
        if (eVar2 != null) {
            eVar2.j(f11);
        }
        ke.e eVar3 = rVar.f26362w;
        if (eVar3 != null) {
            eVar3.j(f11);
        }
        ke.e eVar4 = rVar.l;
        if (eVar4 != null) {
            eVar4.j(f11);
        }
        ke.e eVar5 = rVar.f26352m;
        if (eVar5 != null) {
            eVar5.j(f11);
        }
        ke.e eVar6 = rVar.f26353n;
        if (eVar6 != null) {
            eVar6.j(f11);
        }
        ke.e eVar7 = rVar.f26354o;
        if (eVar7 != null) {
            eVar7.j(f11);
        }
        ke.i iVar = rVar.f26356q;
        if (iVar != null) {
            iVar.j(f11);
        }
        ke.i iVar2 = rVar.f26357r;
        if (iVar2 != null) {
            iVar2.j(f11);
        }
        ke.i iVar3 = rVar.f26358s;
        if (iVar3 != null) {
            iVar3.j(f11);
        }
        ke.i iVar4 = rVar.f26359t;
        if (iVar4 != null) {
            iVar4.j(f11);
        }
        ke.i iVar5 = rVar.f26360u;
        if (iVar5 != null) {
            iVar5.j(f11);
        }
        int i11 = 0;
        j30.g gVar = this.f37911q;
        if (gVar != null) {
            ArrayList arrayList = (ArrayList) gVar.f24502b;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((ke.e) arrayList.get(i12)).j(f11);
            }
            he.a aVar2 = he.e.f21898a;
        }
        ke.i iVar6 = this.f37912r;
        if (iVar6 != null) {
            iVar6.j(f11);
        }
        b bVar = this.f37913s;
        if (bVar != null) {
            bVar.r(f11);
        }
        while (true) {
            ArrayList arrayList2 = this.f37916v;
            if (i11 >= arrayList2.size()) {
                he.a aVar3 = he.e.f21898a;
                return;
            } else {
                ((ke.e) arrayList2.get(i11)).j(f11);
                i11++;
            }
        }
    }

    @Override // je.c
    public final void c(List list, List list2) {
    }

    public void p(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
    }
}
