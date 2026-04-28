package eb;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import c1.q;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class d extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f15909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f15910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f15911i;

    public d(WindowLayoutComponent windowLayoutComponent, ab.f fVar) {
        super(windowLayoutComponent, fVar);
        this.f15909g = new ReentrantLock();
        this.f15910h = new LinkedHashMap();
        this.f15911i = new LinkedHashMap();
    }

    @Override // eb.c, eb.a, db.a
    public final void a(q qVar) {
        LinkedHashMap linkedHashMap = this.f15910h;
        LinkedHashMap linkedHashMap2 = this.f15911i;
        ReentrantLock reentrantLock = this.f15909g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(qVar);
            if (context == null) {
                return;
            }
            h hVar = (h) linkedHashMap.get(context);
            if (hVar == null) {
                return;
            }
            ReentrantLock reentrantLock2 = hVar.f15913b;
            reentrantLock2.lock();
            try {
                hVar.f15915d.remove(qVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(qVar);
                if (hVar.f15915d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.f15903a.removeWindowLayoutInfoListener(hVar);
                }
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // eb.c, eb.a, db.a
    public final void b(Context context, l0.b bVar, q qVar) {
        LinkedHashMap linkedHashMap = this.f15910h;
        ReentrantLock reentrantLock = this.f15909g;
        reentrantLock.lock();
        try {
            h hVar = (h) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f15911i;
            if (hVar != null) {
                hVar.a(qVar);
                linkedHashMap2.put(qVar, context);
            } else {
                h hVar2 = new h(context);
                linkedHashMap.put(context, hVar2);
                linkedHashMap2.put(qVar, context);
                hVar2.a(qVar);
                this.f15903a.addWindowLayoutInfoListener(context, hVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
