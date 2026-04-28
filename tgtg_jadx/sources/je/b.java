package je;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import he.d0;
import he.z;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements ke.a, k, e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f24994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final re.b f24995f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f24997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ie.a f24998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ke.i f24999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ke.f f25000k;
    public final ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ke.i f25001m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ke.s f25002n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ke.e f25003o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f25004p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f24990a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f24991b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f24992c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f24993d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f24996g = new ArrayList();

    public b(z zVar, re.b bVar, Paint.Cap cap, Paint.Join join, float f11, pe.a aVar, pe.b bVar2, ArrayList arrayList, pe.b bVar3) {
        ie.a aVar2 = new ie.a(1, 0);
        this.f24998i = aVar2;
        this.f25004p = 0.0f;
        this.f24994e = zVar;
        this.f24995f = bVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f11);
        this.f25000k = (ke.f) aVar.g();
        this.f24999j = bVar2.g();
        if (bVar3 == null) {
            this.f25001m = null;
        } else {
            this.f25001m = bVar3.g();
        }
        this.l = new ArrayList(arrayList.size());
        this.f24997h = new float[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            this.l.add(((pe.b) arrayList.get(i11)).g());
        }
        bVar.f(this.f25000k);
        bVar.f(this.f24999j);
        for (int i12 = 0; i12 < this.l.size(); i12++) {
            bVar.f((ke.e) this.l.get(i12));
        }
        ke.i iVar = this.f25001m;
        if (iVar != null) {
            bVar.f(iVar);
        }
        this.f25000k.a(this);
        this.f24999j.a(this);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            ((ke.e) this.l.get(i13)).a(this);
        }
        ke.i iVar2 = this.f25001m;
        if (iVar2 != null) {
            iVar2.a(this);
        }
        if (bVar.l() != null) {
            ke.i iVarG = ((pe.b) bVar.l().f24851a).g();
            this.f25003o = iVarG;
            iVarG.a(this);
            bVar.f(this.f25003o);
        }
    }

    @Override // ke.a
    public final void a() {
        this.f24994e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01f8  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // je.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23, ve.a r24) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: je.b.b(android.graphics.Canvas, android.graphics.Matrix, int, ve.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    @Override // je.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List r8, java.util.List r9) {
        /*
            r7 = this;
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        La:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            je.c r3 = (je.c) r3
            boolean r4 = r3 instanceof je.v
            if (r4 == 0) goto L1f
            je.v r3 = (je.v) r3
            qe.y r4 = r3.f25126c
            qe.y r5 = qe.y.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto La
        L22:
            if (r2 == 0) goto L27
            r2.d(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2d:
            java.util.ArrayList r0 = r7.f24996g
            if (r8 < 0) goto L68
            java.lang.Object r3 = r9.get(r8)
            je.c r3 = (je.c) r3
            boolean r4 = r3 instanceof je.v
            if (r4 == 0) goto L53
            r4 = r3
            je.v r4 = (je.v) r4
            qe.y r5 = r4.f25126c
            qe.y r6 = qe.y.INDIVIDUALLY
            if (r5 != r6) goto L53
            if (r1 == 0) goto L49
            r0.add(r1)
        L49:
            je.a r0 = new je.a
            r0.<init>(r4)
            r4.d(r7)
            r1 = r0
            goto L65
        L53:
            boolean r0 = r3 instanceof je.n
            if (r0 == 0) goto L65
            if (r1 != 0) goto L5e
            je.a r1 = new je.a
            r1.<init>(r2)
        L5e:
            java.util.ArrayList r0 = r1.f24988a
            je.n r3 = (je.n) r3
            r0.add(r3)
        L65:
            int r8 = r8 + (-1)
            goto L2d
        L68:
            if (r1 == 0) goto L6d
            r0.add(r1)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je.b.c(java.util.List, java.util.List):void");
    }

    @Override // oe.g
    public final void d(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
        ve.g.g(fVar, i11, arrayList, fVar2, this);
    }

    @Override // je.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        he.a aVar = he.e.f21898a;
        Path path = this.f24991b;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f24996g;
            if (i11 >= arrayList.size()) {
                RectF rectF2 = this.f24993d;
                path.computeBounds(rectF2, false);
                float fM = this.f24999j.m() / 2.0f;
                rectF2.set(rectF2.left - fM, rectF2.top - fM, rectF2.right + fM, rectF2.bottom + fM);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                he.a aVar2 = he.e.f21898a;
                return;
            }
            a aVar3 = (a) arrayList.get(i11);
            for (int i12 = 0; i12 < aVar3.f24988a.size(); i12++) {
                path.addPath(((n) aVar3.f24988a.get(i12)).g(), matrix);
            }
            i11++;
        }
    }

    @Override // oe.g
    public void h(Object obj, ub.a aVar) {
        PointF pointF = d0.f21873a;
        if (obj == 4) {
            this.f25000k.k(aVar);
            return;
        }
        if (obj == d0.f21888q) {
            this.f24999j.k(aVar);
            return;
        }
        ColorFilter colorFilter = d0.I;
        re.b bVar = this.f24995f;
        if (obj == colorFilter) {
            ke.s sVar = this.f25002n;
            if (sVar != null) {
                bVar.o(sVar);
            }
            ke.s sVar2 = new ke.s(null, aVar);
            this.f25002n = sVar2;
            sVar2.a(this);
            bVar.f(this.f25002n);
            return;
        }
        if (obj == d0.f21877e) {
            ke.e eVar = this.f25003o;
            if (eVar != null) {
                eVar.k(aVar);
                return;
            }
            ke.s sVar3 = new ke.s(null, aVar);
            this.f25003o = sVar3;
            sVar3.a(this);
            bVar.f(this.f25003o);
        }
    }
}
