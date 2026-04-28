package ke;

import android.graphics.Color;
import android.graphics.Matrix;
import androidx.lifecycle.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final re.b f26311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final re.b f26312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f26313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f26314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f26315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f26316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f26317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Matrix f26318h;

    public h(re.b bVar, re.b bVar2, n1 n1Var) {
        this.f26312b = bVar;
        this.f26311a = bVar2;
        e eVarG = ((pe.a) n1Var.f3499a).g();
        this.f26313c = (f) eVarG;
        eVarG.a(this);
        bVar2.f(eVarG);
        i iVarG = ((pe.b) n1Var.f3500b).g();
        this.f26314d = iVarG;
        iVarG.a(this);
        bVar2.f(iVarG);
        i iVarG2 = ((pe.b) n1Var.f3501c).g();
        this.f26315e = iVarG2;
        iVarG2.a(this);
        bVar2.f(iVarG2);
        i iVarG3 = ((pe.b) n1Var.f3502d).g();
        this.f26316f = iVarG3;
        iVarG3.a(this);
        bVar2.f(iVarG3);
        i iVarG4 = ((pe.b) n1Var.f3503e).g();
        this.f26317g = iVarG4;
        iVarG4.a(this);
        bVar2.f(iVarG4);
    }

    @Override // ke.a
    public final void a() {
        this.f26312b.a();
    }

    public final ve.a b(Matrix matrix, int i11) {
        float fM = this.f26315e.m() * 0.017453292f;
        float fFloatValue = ((Float) this.f26316f.f()).floatValue();
        double d3 = fM;
        float fSin = ((float) Math.sin(d3)) * fFloatValue;
        float fCos = ((float) Math.cos(d3 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.f26317g.f()).floatValue();
        int iIntValue = ((Integer) this.f26313c.f()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.f26314d.f()).floatValue() * i11) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        ve.a aVar = new ve.a();
        aVar.f42241a = fFloatValue2 * 0.33f;
        aVar.f42242b = fSin;
        aVar.f42243c = fCos;
        aVar.f42244d = iArgb;
        aVar.f42245e = null;
        aVar.c(matrix);
        if (this.f26318h == null) {
            this.f26318h = new Matrix();
        }
        this.f26311a.f37917w.e().invert(this.f26318h);
        aVar.c(this.f26318h);
        return aVar;
    }

    public final void c(ub.a aVar) {
        this.f26314d.k(new g(aVar));
    }
}
