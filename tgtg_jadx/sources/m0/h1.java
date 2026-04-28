package m0;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException;
import androidx.core.util.Consumer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28514a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f28515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f28516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s0.i0 f28517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f28518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e6.l f28519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e6.i f28520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e6.l f28521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e6.i f28522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e6.i f28523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e1 f28524k;
    public j l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g1 f28525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Executor f28526n;

    static {
        Range range = s0.n.f38401h;
    }

    public h1(Size size, s0.i0 i0Var, boolean z11, c0 c0Var, c1.h hVar) {
        this.f28515b = size;
        this.f28517d = i0Var;
        this.f28518e = z11;
        pd.g.i("SurfaceRequest's DynamicRange must always be fully specified.", c0Var.b());
        this.f28516c = c0Var;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        e6.i iVar = new e6.i();
        iVar.f15778c = new e6.n();
        e6.l lVar = new e6.l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = w.a0.class;
        try {
            atomicReference.set(iVar);
            iVar.f15776a = str.concat("-cancellation");
        } catch (Exception e5) {
            lVar.b(e5);
        }
        e6.i iVar2 = (e6.i) atomicReference.get();
        iVar2.getClass();
        this.f28523j = iVar2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        e6.i iVar3 = new e6.i();
        iVar3.f15778c = new e6.n();
        e6.l lVar2 = new e6.l(iVar3);
        iVar3.f15777b = lVar2;
        iVar3.f15776a = w.a0.class;
        try {
            atomicReference2.set(iVar3);
            iVar3.f15776a = str.concat("-status");
        } catch (Exception e11) {
            lVar2.b(e11);
        }
        this.f28521h = lVar2;
        lVar2.a(new x0.f(0, lVar2, new b0(2, iVar2, lVar)), w.b.F());
        e6.i iVar4 = (e6.i) atomicReference2.get();
        iVar4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        e6.i iVar5 = new e6.i();
        iVar5.f15778c = new e6.n();
        e6.l lVar3 = new e6.l(iVar5);
        iVar5.f15777b = lVar3;
        iVar5.f15776a = w.a0.class;
        try {
            atomicReference3.set(iVar5);
            iVar5.f15776a = str.concat("-Surface");
        } catch (Exception e12) {
            lVar3.b(e12);
        }
        this.f28519f = lVar3;
        e6.i iVar6 = (e6.i) atomicReference3.get();
        iVar6.getClass();
        this.f28520g = iVar6;
        e1 e1Var = new e1(this, size);
        this.f28524k = e1Var;
        ListenableFuture listenableFutureD = x0.g.d(e1Var.f38469e);
        lVar3.a(new x0.f(0, lVar3, new j30.g(listenableFutureD, iVar4, str)), w.b.F());
        listenableFutureD.a(new c1.c(this, 1), w.b.F());
        w0.a aVarF = w.b.F();
        AtomicReference atomicReference4 = new AtomicReference(null);
        e6.l lVarA = ox.h.A(new a50.d(22, this, atomicReference4));
        lVarA.a(new x0.f(0, lVarA, new jb.b(hVar)), aVarF);
        e6.i iVar7 = (e6.i) atomicReference4.get();
        iVar7.getClass();
        this.f28522i = iVar7;
    }

    public final void a(final Surface surface, Executor executor, final Consumer consumer) {
        if (!surface.isValid()) {
            final int i11 = 0;
            executor.execute(new Runnable() { // from class: m0.d1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            consumer.accept(new i(2, surface));
                            break;
                        case 1:
                            consumer.accept(new i(3, surface));
                            break;
                        default:
                            consumer.accept(new i(4, surface));
                            break;
                    }
                }
            });
            return;
        }
        if (!this.f28520g.b(surface)) {
            e6.l lVar = this.f28519f;
            if (!lVar.isCancelled()) {
                pd.g.n(null, lVar.f15782b.isDone());
                try {
                    lVar.get();
                    final int i12 = 1;
                    executor.execute(new Runnable() { // from class: m0.d1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    consumer.accept(new i(2, surface));
                                    break;
                                case 1:
                                    consumer.accept(new i(3, surface));
                                    break;
                                default:
                                    consumer.accept(new i(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i13 = 2;
                    executor.execute(new Runnable() { // from class: m0.d1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    consumer.accept(new i(2, surface));
                                    break;
                                case 1:
                                    consumer.accept(new i(3, surface));
                                    break;
                                default:
                                    consumer.accept(new i(4, surface));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        b0 b0Var = new b0(3, consumer, surface);
        e6.l lVar2 = this.f28521h;
        lVar2.a(new x0.f(0, lVar2, b0Var), executor);
    }

    public final void b(Executor executor, g1 g1Var) {
        j jVar;
        synchronized (this.f28514a) {
            this.f28525m = g1Var;
            this.f28526n = executor;
            jVar = this.l;
        }
        if (jVar != null) {
            executor.execute(new c1(g1Var, jVar, 1));
        }
    }

    public final void c() {
        this.f28520g.d(new DeferrableSurface$SurfaceUnavailableException("Surface request will not complete."));
    }
}
