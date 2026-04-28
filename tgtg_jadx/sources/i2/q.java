package i2;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends h2.q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i80.o f22887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f22888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a3.j f22889e;

    public q(i80.o oVar, Function1 function1, int i11) {
        this.f22887c = oVar;
        this.f22888d = function1;
        a3.j jVar = new a3.j(2, (byte) 0);
        jVar.e(i11, new m(function1, oVar));
        this.f22889e = jVar;
    }

    @Override // h2.q
    public final a3.j k() {
        return this.f22889e;
    }
}
