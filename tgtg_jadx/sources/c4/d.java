package c4;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import b5.m0;
import c5.y;
import g4.c0;
import g4.g0;
import j5.v;
import q1.h0;
import q1.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends k implements g4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se.b f7025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f7026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f7027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k5.b f7028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f7030f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AutofillId f7031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0 f7032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7033i;

    public d(se.b bVar, v vVar, y yVar, k5.b bVar2, String str) {
        this.f7025a = bVar;
        this.f7026b = vVar;
        this.f7027c = yVar;
        this.f7028d = bVar2;
        this.f7029e = str;
        yVar.setImportantForAutofill(1);
        AutofillId autofillId = yVar.getAutofillId();
        if (autofillId == null) {
            throw b3.i.D("Required value was null.");
        }
        this.f7031g = autofillId;
        this.f7032h = new h0();
    }

    @Override // g4.j
    public final void a(c0 c0Var, g0 g0Var) {
        m0 m0VarG;
        j5.n nVarY;
        m0 m0VarG2;
        j5.n nVarY2;
        if (c0Var != null && (m0VarG2 = b5.m.g(c0Var)) != null && (nVarY2 = m0VarG2.y()) != null) {
            t0 t0Var = nVarY2.f24682a;
            if (t0Var.a(j5.m.f24663g) || t0Var.a(j5.m.f24664h)) {
                ((AutofillManager) this.f7025a.f39010b).notifyViewExited(this.f7027c, m0VarG2.f5866b);
            }
        }
        if (g0Var == null || (m0VarG = b5.m.g(g0Var)) == null || (nVarY = m0VarG.y()) == null) {
            return;
        }
        t0 t0Var2 = nVarY.f24682a;
        if (t0Var2.a(j5.m.f24663g) || t0Var2.a(j5.m.f24664h)) {
            int i11 = m0VarG.f5866b;
            this.f7028d.f25958a.v(i11, new b(this, i11));
        }
    }
}
