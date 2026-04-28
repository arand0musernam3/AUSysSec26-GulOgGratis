package je;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import he.d0;
import he.z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e, ke.a, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f25024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ie.a f25025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final re.b f25026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f25029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ke.f f25030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ke.f f25031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ke.s f25032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f25033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ke.e f25034k;
    public float l;

    public g(z zVar, re.b bVar, qe.r rVar) {
        Path path = new Path();
        this.f25024a = path;
        this.f25025b = new ie.a(1, 0);
        this.f25029f = new ArrayList();
        this.f25026c = bVar;
        String str = rVar.f37007c;
        pe.a aVar = rVar.f37009e;
        pe.a aVar2 = rVar.f37008d;
        this.f25027d = str;
        this.f25028e = rVar.f37010f;
        this.f25033j = zVar;
        if (bVar.l() != null) {
            ke.i iVarG = ((pe.b) bVar.l().f24851a).g();
            this.f25034k = iVarG;
            iVarG.a(this);
            bVar.f(this.f25034k);
        }
        if (aVar2 == null) {
            this.f25030g = null;
            this.f25031h = null;
            return;
        }
        path.setFillType(rVar.f37006b);
        ke.e eVarG = aVar2.g();
        this.f25030g = (ke.f) eVarG;
        eVarG.a(this);
        bVar.f(eVarG);
        ke.e eVarG2 = aVar.g();
        this.f25031h = (ke.f) eVarG2;
        eVarG2.a(this);
        bVar.f(eVarG2);
    }

    @Override // ke.a
    public final void a() {
        this.f25033j.invalidateSelf();
    }

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
    public final void b(Canvas canvas, Matrix matrix, int i11, ve.a aVar) {
        MaskFilter maskFilter;
        if (this.f25028e) {
            return;
        }
        he.a aVar2 = he.e.f21898a;
        ke.f fVar = this.f25030g;
        float fIntValue = ((Integer) this.f25031h.f()).intValue() / 100.0f;
        int iC = (ve.g.c((int) (i11 * fIntValue)) << 24) | (fVar.m(fVar.b(), fVar.d()) & 16777215);
        ie.a aVar3 = this.f25025b;
        aVar3.setColor(iC);
        ke.s sVar = this.f25032i;
        if (sVar != null) {
            aVar3.setColorFilter((ColorFilter) sVar.f());
        }
        ke.e eVar = this.f25034k;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.f()).floatValue();
            if (fFloatValue == 0.0f) {
                aVar3.setMaskFilter(null);
            } else if (fFloatValue != this.l) {
                re.b bVar = this.f25026c;
                if (bVar.A == fFloatValue) {
                    maskFilter = bVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    bVar.B = blurMaskFilter;
                    bVar.A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                aVar3.setMaskFilter(maskFilter);
            }
            this.l = fFloatValue;
        }
        if (aVar != null) {
            aVar.a((int) (fIntValue * 255.0f), aVar3);
        } else {
            aVar3.clearShadowLayer();
        }
        Path path = this.f25024a;
        path.reset();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f25029f;
            if (i12 >= arrayList.size()) {
                canvas.drawPath(path, aVar3);
                he.a aVar4 = he.e.f21898a;
                return;
            } else {
                path.addPath(((n) arrayList.get(i12)).g(), matrix);
                i12++;
            }
        }
    }

    @Override // je.c
    public final void c(List list, List list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            c cVar = (c) list2.get(i11);
            if (cVar instanceof n) {
                this.f25029f.add((n) cVar);
            }
        }
    }

    @Override // oe.g
    public final void d(oe.f fVar, int i11, ArrayList arrayList, oe.f fVar2) {
        ve.g.g(fVar, i11, arrayList, fVar2, this);
    }

    @Override // je.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        Path path = this.f25024a;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f25029f;
            if (i11 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i11)).g(), matrix);
                i11++;
            }
        }
    }

    @Override // je.c
    public final String getName() {
        return this.f25027d;
    }

    @Override // oe.g
    public final void h(Object obj, ub.a aVar) {
        PointF pointF = d0.f21873a;
        if (obj == 1) {
            this.f25030g.k(aVar);
            return;
        }
        if (obj == 4) {
            this.f25031h.k(aVar);
            return;
        }
        ColorFilter colorFilter = d0.I;
        re.b bVar = this.f25026c;
        if (obj == colorFilter) {
            ke.s sVar = this.f25032i;
            if (sVar != null) {
                bVar.o(sVar);
            }
            ke.s sVar2 = new ke.s(null, aVar);
            this.f25032i = sVar2;
            sVar2.a(this);
            bVar.f(this.f25032i);
            return;
        }
        if (obj == d0.f21877e) {
            ke.e eVar = this.f25034k;
            if (eVar != null) {
                eVar.k(aVar);
                return;
            }
            ke.s sVar3 = new ke.s(null, aVar);
            this.f25034k = sVar3;
            sVar3.a(this);
            bVar.f(this.f25034k);
        }
    }
}
