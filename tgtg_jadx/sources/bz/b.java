package bz;

import a8.h;
import dz.g;
import java.util.concurrent.Executor;
import xy.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements yy.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.a f6773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.a f6774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f6775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t70.a f6776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t70.a f6777e;

    public b(t70.a aVar, t70.a aVar2, d dVar, t70.a aVar3, t70.a aVar4) {
        this.f6773a = aVar;
        this.f6774b = aVar2;
        this.f6775c = dVar;
        this.f6776d = aVar3;
        this.f6777e = aVar4;
    }

    @Override // t70.a
    public final Object get() {
        return new a((Executor) this.f6773a.get(), (f) this.f6774b.get(), (h) this.f6775c.get(), (g) this.f6776d.get(), (g) this.f6777e.get());
    }
}
