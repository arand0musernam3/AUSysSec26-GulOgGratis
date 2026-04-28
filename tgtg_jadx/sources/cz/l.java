package cz;

import com.google.firebase.messaging.a0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements yy.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.a f13647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.a f13648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bz.d f13649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t70.a f13650d;

    public l(t70.a aVar, t70.a aVar2, bz.d dVar, t70.a aVar3) {
        this.f13647a = aVar;
        this.f13648b = aVar2;
        this.f13649c = dVar;
        this.f13650d = aVar3;
    }

    @Override // t70.a
    public final Object get() {
        return new a0(3, (Executor) this.f13647a.get(), (dz.g) this.f13648b.get(), (a8.h) this.f13649c.get(), (dz.g) this.f13650d.get());
    }
}
