package q9;

import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f36369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f36370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f36371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f36372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f36375g;

    public e(g gVar, boolean z11, int i11) {
        gVar.getClass();
        this.f36369a = gVar;
        n0 n0Var = n0.f26529a;
        this.f36370b = n0Var;
        this.f36371c = n0Var;
        this.f36372d = j.f36393a;
        this.f36373e = z11;
        this.f36374f = false;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(b bVar);

    public abstract void d(b bVar);

    public final void f() {
        c cVar = this.f36375g;
        if (cVar == null || !cVar.f36367c.remove(this)) {
            return;
        }
        i iVar = cVar.f36366b;
        iVar.getClass();
        if (Intrinsics.areEqual(this, iVar.f36385f)) {
            int i11 = iVar.f36386g;
            j jVar = j.f36393a;
            if (i11 == -1) {
                this.f36372d = jVar;
                a();
            } else if (i11 == 1) {
                this.f36372d = jVar;
                e();
            }
            iVar.f36385f = null;
            iVar.f36386g = 0;
            iVar.f36387h = null;
        }
        iVar.f36383d.remove(this);
        iVar.f36384e.remove(this);
        this.f36375g = null;
        iVar.b();
    }

    public final void g(boolean z11) {
        i iVar;
        if (this.f36373e == z11) {
            return;
        }
        this.f36373e = z11;
        c cVar = this.f36375g;
        if (cVar == null || (iVar = cVar.f36366b) == null) {
            return;
        }
        iVar.b();
    }

    public void e() {
    }
}
