package xf;

import c90.f;
import c90.l;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v80.f0;
import v80.p0;
import v80.x;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f44251b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f44252c = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2 f44253a;

    public c(b bVar) {
        bVar.f44247c.getClass();
        ub.a aVar = new ub.a(bVar);
        f fVar = p0.f42144a;
        c90.e.f7834b.getClass();
        x xVarZ0 = l.f7848b.z0(1);
        q2 q2Var = new q2();
        q2Var.f48333a = aVar;
        q2Var.f48334b = f0.b(kotlin.coroutines.e.c(f0.d(), xVarZ0));
        q2Var.f48335c = new ReentrantReadWriteLock(true);
        q2Var.f48336d = new a(null, null);
        q2Var.f48337e = new Object();
        q2Var.f48338f = new LinkedHashSet();
        q2Var.g0(aVar.z(), e.Initialized);
        this.f44253a = q2Var;
    }
}
