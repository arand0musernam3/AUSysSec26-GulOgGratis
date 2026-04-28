package b0;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.a f5065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k3 f5066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile x2 f5067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5068d;

    public b1(t70.a aVar, k3 k3Var) {
        aVar.getClass();
        k3Var.getClass();
        this.f5065a = aVar;
        this.f5066b = k3Var;
        this.f5068d = new AtomicBoolean(false);
    }

    public static final x2 l(b1 b1Var) {
        if (b1Var.f5068d.get()) {
            throw new CancellationException("UseCaseCameraRequestControl is closed");
        }
        x2 x2Var = b1Var.f5067c;
        if (x2Var != null) {
            return x2Var;
        }
        x2 x2Var2 = (x2) b1Var.f5065a.get();
        if (b1Var.f5068d.get()) {
            x2Var2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        b1Var.f5067c = x2Var2;
        x2Var2.getClass();
        return x2Var2;
    }

    @Override // b0.o2
    public final Object a(z70.i iVar) {
        x2 x2Var = this.f5067c;
        return x2Var != null ? x2Var.a(iVar) : v80.f0.K(v80.f0.q(this.f5066b.f5269e), new y0(this, null, 0), iVar);
    }

    @Override // b0.o2
    public final v80.i0 b() {
        x2 x2Var = this.f5067c;
        return x2Var != null ? x2Var.b() : v80.f0.f(this.f5066b.f5270f, null, null, new y0(this, null, 2), 3);
    }

    @Override // b0.o2
    public final v80.i0 c(b bVar, Map map) {
        map.getClass();
        x2 x2Var = this.f5067c;
        return x2Var != null ? x2Var.c(bVar, map) : v80.f0.f(this.f5066b.f5270f, null, null, new a3.x1(this, (x70.c) null, bVar, map, 8), 3);
    }

    @Override // b0.o2
    public final void close() {
        if (this.f5068d.getAndSet(true)) {
            return;
        }
        v80.f0.B(this.f5066b.f5270f, null, null, new a3.y((x70.c) null, this, 2), 3);
    }

    @Override // b0.o2
    public final List d(ArrayList arrayList, int i11, int i12, int i13) {
        int size = arrayList.size();
        x2 x2Var = this.f5067c;
        if (x2Var != null) {
            return x2Var.d(arrayList, i11, i12, i13);
        }
        v80.j0 j0VarF = v80.f0.f(this.f5066b.f5270f, null, null, new z0(this, null, arrayList, i11, i12, i13), 3);
        ArrayList arrayList2 = new ArrayList(size);
        for (int i14 = 0; i14 < size; i14++) {
            arrayList2.add(v80.f0.f(this.f5066b.f5270f, null, null, new a1(j0VarF, i14, null, 0), 3));
        }
        return arrayList2;
    }

    @Override // b0.o2
    public final v80.i0 e(int i11) {
        x2 x2Var = this.f5067c;
        return x2Var != null ? x2Var.e(i11) : v80.f0.f(this.f5066b.f5270f, null, null, new a1(this, null, i11), 3);
    }

    @Override // b0.o2
    public final v80.i0 f(Map map, n2 n2Var, s0.t0 t0Var) {
        n2Var.getClass();
        t0Var.getClass();
        x2 x2Var = this.f5067c;
        return x2Var != null ? x2Var.f(map, n2Var, t0Var) : v80.f0.f(this.f5066b.f5270f, null, null, new al.n(this, (x70.c) null, map, n2Var, t0Var, 5), 3);
    }

    @Override // b0.o2
    public final v80.i0 g(LinkedHashSet linkedHashSet, boolean z11) {
        x2 x2Var = this.f5067c;
        if (x2Var != null) {
            return x2Var.g(linkedHashSet, z11);
        }
        return v80.f0.f(this.f5066b.f5270f, null, null, new v(this, (x70.c) null, z11, linkedHashSet, 1), 3);
    }

    @Override // b0.o2
    public final v80.i0 h() {
        x2 x2Var = this.f5067c;
        return x2Var != null ? x2Var.h() : v80.f0.f(this.f5066b.f5270f, null, null, new y0(this, null, 1), 3);
    }

    @Override // b0.o2
    public final v80.i0 i(Map map, n2 n2Var, s0.t0 t0Var) {
        map.getClass();
        n2Var.getClass();
        t0Var.getClass();
        x2 x2Var = this.f5067c;
        return x2Var != null ? x2Var.i(map, n2Var, t0Var) : v80.f0.f(this.f5066b.f5270f, null, null, new al.n(this, (x70.c) null, map, n2Var, t0Var, 4), 3);
    }

    @Override // b0.o2
    public final v80.i0 j(List list, n2 n2Var) {
        list.getClass();
        n2Var.getClass();
        x2 x2Var = this.f5067c;
        return x2Var != null ? x2Var.j(list, n2Var) : v80.f0.f(this.f5066b.f5270f, null, null, new a3.x1(this, (x70.c) null, list, n2Var, 7), 3);
    }
}
