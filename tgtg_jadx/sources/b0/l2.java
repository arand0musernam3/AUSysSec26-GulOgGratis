package b0;

import android.util.Log;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0.j f5292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f5293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o2 f5294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t70.a f5295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t70.a f5296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t70.a f5297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r80.a f5299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u70.t f5300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u70.t f5301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u70.t f5302k;

    public l2(a0.j jVar, k3 k3Var, o2 o2Var, t70.a aVar, t70.a aVar2, t70.a aVar3) {
        jVar.getClass();
        k3Var.getClass();
        o2Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.f5292a = jVar;
        this.f5293b = k3Var;
        this.f5294c = o2Var;
        this.f5295d = aVar;
        this.f5296e = aVar2;
        this.f5297f = aVar3;
        r80.b bVar = m2.f5316a;
        bVar.getClass();
        this.f5298g = r80.b.f37780b.incrementAndGet(bVar);
        this.f5299h = w.b.p(false);
        if (wd.a.B(3, "CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        final int i11 = 0;
        this.f5300i = u70.l.b(new Function0(this) { // from class: b0.i2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l2 f5232b;

            {
                this.f5232b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return (i3) this.f5232b.f5295d.get();
                    case 1:
                        return (w.l0) this.f5232b.f5296e.get();
                    default:
                        return (o) this.f5232b.f5297f.get();
                }
            }
        });
        final int i12 = 1;
        this.f5301j = u70.l.b(new Function0(this) { // from class: b0.i2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l2 f5232b;

            {
                this.f5232b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return (i3) this.f5232b.f5295d.get();
                    case 1:
                        return (w.l0) this.f5232b.f5296e.get();
                    default:
                        return (o) this.f5232b.f5297f.get();
                }
            }
        });
        final int i13 = 2;
        this.f5302k = u70.l.b(new Function0(this) { // from class: b0.i2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l2 f5232b;

            {
                this.f5232b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return (i3) this.f5232b.f5295d.get();
                    case 1:
                        return (w.l0) this.f5232b.f5296e.get();
                    default:
                        return (o) this.f5232b.f5297f.get();
                }
            }
        });
    }

    public final String toString() {
        return "UseCaseCamera-" + this.f5298g;
    }
}
