package b5;

import android.view.View;
import androidx.compose.ui.node.Owner;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements m3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5960b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5961c;

    public r2(m0 m0Var) {
        this.f5959a = m0Var;
        this.f5961c = m0Var;
    }

    public final void a() {
        this.f5960b.clear();
        this.f5961c = this.f5959a;
        ((m0) this.f5959a).S();
    }

    @Override // m3.c
    public final void c(int i11, Object obj) {
        ((m0) this.f5961c).C(i11, (m0) obj);
    }

    @Override // m3.c
    public final void d(Object obj) {
        this.f5960b.add(this.f5961c);
        this.f5961c = obj;
    }

    @Override // m3.c
    public final void f() {
        k5.b rectManager;
        c4.d dVar;
        k5.b rectManager2;
        m0 m0Var = (m0) this.f5961c;
        l1 l1Var = m0Var.G;
        if (!m0Var.I()) {
            y4.a.a("onReuse is only expected on attached node");
        }
        c6.d0 d0Var = m0Var.f5879p;
        if (d0Var != null) {
            View view = d0Var.f7700b;
            if (view.getParent() != d0Var) {
                d0Var.addView(view);
            } else {
                d0Var.f7704f.invoke();
            }
        }
        z4.q0 q0Var = m0Var.I;
        if (q0Var != null) {
            q0Var.h(false);
        }
        m0Var.f5884u = false;
        if (m0Var.T) {
            m0Var.T = false;
        } else {
            b4.s parent$ui = m0Var.G.f5859e;
            for (b4.s parent$ui2 = parent$ui; parent$ui2 != null; parent$ui2 = parent$ui2.getParent$ui()) {
                if (parent$ui2.isAttached()) {
                    parent$ui2.reset$ui();
                }
            }
            for (b4.s parent$ui3 = parent$ui; parent$ui3 != null; parent$ui3 = parent$ui3.getParent$ui()) {
                if (parent$ui3.isAttached()) {
                    parent$ui3.runDetachLifecycle$ui();
                }
            }
            while (parent$ui != null) {
                if (parent$ui.isAttached()) {
                    parent$ui.markAsDetached$ui();
                }
                parent$ui = parent$ui.getParent$ui();
            }
        }
        int i11 = m0Var.f5866b;
        Owner owner = m0Var.f5878o;
        if (owner != null && (rectManager2 = ((c5.y) owner).getRectManager()) != null) {
            rectManager2.h(m0Var);
        }
        m0Var.f5866b = j5.r.f24691a.addAndGet(1);
        Owner owner2 = m0Var.f5878o;
        if (owner2 != null) {
            c5.y yVar = (c5.y) owner2;
            yVar.m68getLayoutNodes().g(i11);
            yVar.m68getLayoutNodes().i(m0Var.f5866b, m0Var);
        }
        for (b4.s child$ui = l1Var.f5860f; child$ui != null; child$ui = child$ui.getChild$ui()) {
            child$ui.markAsAttached$ui();
        }
        l1Var.e();
        if (l1Var.d(8)) {
            m0Var.G();
        }
        m0.Z(m0Var);
        Owner owner3 = m0Var.f5878o;
        if (owner3 != null && (dVar = ((c5.y) owner3).L) != null) {
            c5.y yVar2 = dVar.f7027c;
            se.b bVar = dVar.f7025a;
            q1.h0 h0Var = dVar.f7032h;
            if (h0Var.e(i11)) {
                bVar.s(yVar2, i11, false);
            }
            j5.n nVarY = m0Var.y();
            if (nVarY != null && nVarY.f24682a.a(j5.x.f24722q)) {
                h0Var.b(m0Var.f5866b);
                bVar.s(yVar2, m0Var.f5866b, true);
            }
        }
        Owner owner4 = m0Var.f5878o;
        if (owner4 == null || (rectManager = ((c5.y) owner4).getRectManager()) == null) {
            return;
        }
        rectManager.f(m0Var, true);
    }

    @Override // m3.c
    public final void g(int i11, int i12, int i13) {
        ((m0) this.f5961c).M(i11, i12, i13);
    }

    @Override // m3.c
    public final void h(int i11, int i12) {
        ((m0) this.f5961c).T(i11, i12);
    }

    @Override // m3.c
    public final void j() {
        this.f5961c = this.f5960b.remove(r0.size() - 1);
    }

    @Override // m3.c
    public final /* bridge */ /* synthetic */ void n(int i11, Object obj) {
    }

    @Override // m3.c
    public final void o() {
        Owner owner = ((m0) this.f5959a).f5878o;
        if (owner != null) {
            ((c5.y) owner).x();
        }
    }

    @Override // m3.c
    public final Object p() {
        return this.f5961c;
    }
}
