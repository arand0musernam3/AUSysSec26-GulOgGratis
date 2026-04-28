package c1;

import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import s0.x0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends x0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e6.l f6892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e6.i f6893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x0 f6894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o f6895q;

    public m(int i11, Size size) {
        super(i11, size);
        e6.i iVar = new e6.i();
        iVar.f15778c = new e6.n();
        e6.l lVar = new e6.l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = a0.class;
        try {
            this.f6893o = iVar;
            iVar.f15776a = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e5) {
            lVar.b(e5);
        }
        this.f6892n = lVar;
    }

    @Override // s0.x0
    public final void a() {
        super.a();
        a.a.K(new i(this, 2));
    }

    @Override // s0.x0
    public final ListenableFuture f() {
        return this.f6892n;
    }

    public final boolean g(x0 x0Var, Runnable runnable) {
        boolean z11;
        Size size = this.f38472h;
        a.a.t();
        x0Var.getClass();
        int i11 = x0Var.f38473i;
        Size size2 = x0Var.f38472h;
        x0 x0Var2 = this.f6894p;
        if (x0Var2 == x0Var) {
            return false;
        }
        pd.g.n("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", x0Var2 == null);
        pd.g.i("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i12 = this.f38473i;
        pd.g.i(r8.k.g(i12, i11, "The provider's format(", ") must match the parent(", ")"), i12 == i11);
        synchronized (this.f38465a) {
            z11 = this.f38467c;
        }
        pd.g.n("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z11);
        this.f6894p = x0Var;
        x0.g.e(true, x0Var.c(), this.f6893o, w.b.F());
        x0Var.d();
        x0.g.d(this.f38469e).a(new j(x0Var, 1), w.b.F());
        x0.g.d(x0Var.f38471g).a(runnable, w.b.U());
        return true;
    }
}
