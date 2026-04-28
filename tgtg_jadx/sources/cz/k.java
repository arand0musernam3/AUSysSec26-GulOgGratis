package cz;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements yy.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.a f13640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.a f13641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.a f13642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bz.d f13643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t70.a f13644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t70.a f13645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t70.a f13646g;

    public k(t70.a aVar, t70.a aVar2, t70.a aVar3, bz.d dVar, t70.a aVar4, t70.a aVar5, t70.a aVar6) {
        this.f13640a = aVar;
        this.f13641b = aVar2;
        this.f13642c = aVar3;
        this.f13643d = dVar;
        this.f13644e = aVar4;
        this.f13645f = aVar5;
        this.f13646g = aVar6;
    }

    @Override // t70.a
    public final Object get() {
        Context context = (Context) this.f13640a.get();
        xy.f fVar = (xy.f) this.f13641b.get();
        dz.g gVar = (dz.g) this.f13642c.get();
        a8.h hVar = (a8.h) this.f13643d.get();
        Executor executor = (Executor) this.f13644e.get();
        dz.g gVar2 = (dz.g) this.f13645f.get();
        n20.f fVar2 = new n20.f(16);
        r40.d dVar = new r40.d();
        dz.g gVar3 = (dz.g) this.f13646g.get();
        j jVar = new j();
        jVar.f13631a = context;
        jVar.f13632b = fVar;
        jVar.f13633c = gVar;
        jVar.f13636f = hVar;
        jVar.f13637g = executor;
        jVar.f13634d = gVar2;
        jVar.f13638h = fVar2;
        jVar.f13639i = dVar;
        jVar.f13635e = gVar3;
        return jVar;
    }
}
