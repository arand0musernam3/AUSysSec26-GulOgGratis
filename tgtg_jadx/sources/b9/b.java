package b9;

import androidx.lifecycle.o0;
import androidx.lifecycle.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends o0 implements c9.d {
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c9.e f6063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f6064n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f6065o;

    public b(int i11, c9.e eVar) {
        this.l = i11;
        this.f6063m = eVar;
        eVar.registerListener(i11, this);
    }

    @Override // androidx.lifecycle.k0
    public final void g() {
        this.f6063m.startLoading();
    }

    @Override // androidx.lifecycle.k0
    public final void h() {
        this.f6063m.stopLoading();
    }

    @Override // androidx.lifecycle.k0
    public final void j(p0 p0Var) {
        super.j(p0Var);
        this.f6064n = null;
        this.f6065o = null;
    }

    public final void l() {
        c9.e eVar = this.f6063m;
        eVar.cancelLoad();
        eVar.abandon();
        c cVar = this.f6065o;
        if (cVar != null) {
            j(cVar);
            if (cVar.f6068c) {
                cVar.f6067b.onLoaderReset(cVar.f6066a);
            }
        }
        eVar.unregisterListener(this);
        if (cVar != null) {
            boolean z11 = cVar.f6068c;
        }
        eVar.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.LifecycleOwner, java.lang.Object] */
    public final void m() {
        ?? r02 = this.f6064n;
        c cVar = this.f6065o;
        if (r02 == 0 || cVar == null) {
            return;
        }
        super.j(cVar);
        e(r02, cVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #");
        sb2.append(this.l);
        sb2.append(" : ");
        Class<?> cls = this.f6063m.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
