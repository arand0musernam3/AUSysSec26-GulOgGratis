package vd;

import id.l;
import id.r;
import kotlin.jvm.functions.Function1;
import t1.w1;
import td.o;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w1 f42230g = new w1(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f42231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f42232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f42233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f42234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42236f;

    public f(r rVar, o oVar, c cVar, Function1 function1, boolean z11, boolean z12) {
        this.f42231a = rVar;
        this.f42232b = oVar;
        this.f42233c = cVar;
        this.f42234d = function1;
        this.f42235e = z11;
        this.f42236f = z12;
    }

    @Override // id.l
    public final Object a(x70.c cVar) {
        return f0.K(kotlin.coroutines.g.f26549a, new rf.c(new rv.a(this, 15), null, 15), (z70.c) cVar);
    }
}
