package y9;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f45682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f45683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f45684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f45685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xw.a f45686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xw.a f45687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f45688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f45689h;

    public k(v vVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.f45682a = vVar;
        p0 p0Var = new p0(vVar, linkedHashMap, linkedHashMap2, strArr, vVar.f45766k, new al.d(1, this, k.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 28));
        this.f45683b = p0Var;
        this.f45684c = new LinkedHashMap();
        this.f45685d = new ReentrantLock();
        this.f45686e = new xw.a(this, 14);
        this.f45687f = new xw.a(this, 15);
        h hVar = new h();
        hVar.f45666a = vVar;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.getClass();
        hVar.f45667b = setNewSetFromMap;
        this.f45688g = hVar;
        this.f45689h = new Object();
        p0Var.f45731k = new y.a(this, 5);
    }

    public final Object a(z70.i iVar) {
        Object objF = this.f45683b.f(iVar);
        return objF == y70.a.COROUTINE_SUSPENDED ? objF : Unit.f26487a;
    }
}
