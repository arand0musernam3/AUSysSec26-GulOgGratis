package eb;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import c1.q;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.n0;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f15903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.f f15904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f15905c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f15906d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f15907e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f15908f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, ab.f fVar) {
        this.f15903a = windowLayoutComponent;
        this.f15904b = fVar;
    }

    @Override // eb.a, db.a
    public void a(q qVar) {
        LinkedHashMap linkedHashMap = this.f15906d;
        LinkedHashMap linkedHashMap2 = this.f15907e;
        ReentrantLock reentrantLock = this.f15905c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(qVar);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.f4136d;
            ReentrantLock reentrantLock2 = multicastConsumer.f4134b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(qVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(qVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    ab.e eVar = (ab.e) this.f15908f.remove(multicastConsumer);
                    if (eVar != null) {
                        eVar.f1202a.invoke(eVar.f1203b, eVar.f1204c);
                    }
                }
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // eb.a, db.a
    public void b(Context context, l0.b bVar, q qVar) {
        LinkedHashMap linkedHashMap = this.f15906d;
        ReentrantLock reentrantLock = this.f15905c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f15907e;
            if (multicastConsumer != null) {
                multicastConsumer.a(qVar);
                linkedHashMap2.put(qVar, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(qVar, context);
                multicastConsumer2.a(qVar);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(n0.f26529a));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f15908f.put(multicastConsumer2, this.f15904b.a(this.f15903a, Reflection.getOrCreateKotlinClass(WindowLayoutInfo.class), (Activity) context, new b(1, multicastConsumer2, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
