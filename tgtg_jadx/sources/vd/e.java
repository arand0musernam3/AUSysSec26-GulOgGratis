package vd;

import ia0.i;
import id.k;
import id.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f42226a = c.f42221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f42227b = f.f42230g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42228c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42229d = true;

    @Override // id.k
    public final l a(kd.k kVar, o oVar) {
        if (!Intrinsics.areEqual(kVar.f26293b, "image/svg+xml")) {
            i iVarP0 = kVar.f26292a.p0();
            if (!iVarP0.X(0L, a.f42219b) || iVarP0.z(1024L, a.f42218a) == -1) {
                return null;
            }
        }
        return new f(kVar.f26292a, oVar, this.f42226a, this.f42227b, this.f42228c, this.f42229d);
    }
}
