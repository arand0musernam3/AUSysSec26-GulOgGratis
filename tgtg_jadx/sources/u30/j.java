package u30;

import c50.w;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements q40.c, q40.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f40695a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f40696b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f40697c;

    public j(Executor executor) {
        this.f40697c = executor;
    }

    public final synchronized void a(Executor executor, q40.a aVar) {
        try {
            executor.getClass();
            if (!this.f40695a.containsKey(p30.b.class)) {
                this.f40695a.put(p30.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f40695a.get(p30.b.class)).put(aVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(w wVar) {
        wVar.getClass();
        if (this.f40695a.containsKey(p30.b.class)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f40695a.get(p30.b.class);
            concurrentHashMap.remove(wVar);
            if (concurrentHashMap.isEmpty()) {
                this.f40695a.remove(p30.b.class);
            }
        }
    }
}
