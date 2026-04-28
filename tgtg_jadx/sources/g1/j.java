package g1;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import s0.f0;
import s0.u0;
import s0.u1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f18110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18112d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(f0 f0Var) {
        this(f0Var, (byte) 0);
        this.f18111c = 1;
        this.f18112d = f0Var;
    }

    @Override // s0.f0
    public final void a(u1 u1Var) {
        this.f18110b.a(u1Var);
    }

    @Override // s0.f0
    public final void b() {
        this.f18110b.b();
    }

    @Override // s0.f0
    public final void c(int i11) {
        this.f18110b.c(i11);
    }

    @Override // s0.f0
    public ListenableFuture d(ArrayList arrayList, int i11, int i12) {
        switch (this.f18111c) {
            case 0:
                pd.g.i("Only support one capture config.", arrayList.size() == 1);
                final ListenableFuture listenableFutureJ = this.f18110b.j(i11);
                final int i13 = 0;
                final int i14 = 1;
                return new x0.j(new ArrayList(Collections.singletonList(x0.g.f(x0.g.f(x0.g.f(listenableFutureJ instanceof x0.d ? (x0.d) listenableFutureJ : new x0.d(listenableFutureJ), new x0.a() { // from class: g1.i
                    @Override // x0.a
                    public final ListenableFuture apply(Object obj) {
                        switch (i13) {
                            case 0:
                                return ((r0.g) listenableFutureJ.get()).a();
                            default:
                                return ((r0.g) listenableFutureJ.get()).b();
                        }
                    }
                }, w.b.F()), new a50.d(15, this, arrayList), w.b.F()), new x0.a() { // from class: g1.i
                    @Override // x0.a
                    public final ListenableFuture apply(Object obj) {
                        switch (i14) {
                            case 0:
                                return ((r0.g) listenableFutureJ.get()).a();
                            default:
                                return ((r0.g) listenableFutureJ.get()).b();
                        }
                    }
                }, w.b.F()))), true, w.b.F());
            default:
                return this.f18110b.d(arrayList, i11, i12);
        }
    }

    @Override // s0.f0
    public ListenableFuture e(boolean z11) {
        switch (this.f18111c) {
            case 1:
                return ((f0) this.f18112d).e(z11);
            default:
                return this.f18110b.e(z11);
        }
    }

    @Override // s0.f0
    public final u0 f() {
        return this.f18110b.f();
    }

    @Override // s0.f0
    public final void g(u0 u0Var) {
        this.f18110b.g(u0Var);
    }

    @Override // s0.f0
    public final void h(y0.f fVar) {
        this.f18110b.h(fVar);
    }

    @Override // s0.f0
    public final void i() {
        this.f18110b.i();
    }

    @Override // s0.f0
    public final ListenableFuture j(int i11) {
        return this.f18110b.j(i11);
    }

    public j(f0 f0Var, byte b8) {
        this.f18110b = f0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(f0 f0Var, e.b bVar) {
        this(f0Var, (byte) 0);
        this.f18111c = 0;
        this.f18112d = bVar;
    }
}
