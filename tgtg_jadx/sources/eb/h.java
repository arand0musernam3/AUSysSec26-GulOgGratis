package eb;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import c1.q;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Consumer, Consumer2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15912a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cb.h f15914c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f15913b = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f15915d = new LinkedHashSet();

    public h(Context context) {
        this.f15912a = context;
    }

    public final void a(q qVar) {
        ReentrantLock reentrantLock = this.f15913b;
        reentrantLock.lock();
        try {
            cb.h hVar = this.f15914c;
            if (hVar != null) {
                qVar.accept(hVar);
            }
            this.f15915d.add(qVar);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.f15913b;
        reentrantLock.lock();
        try {
            cb.h hVarB = g.b(this.f15912a, windowLayoutInfo);
            this.f15914c = hVarB;
            Iterator it = this.f15915d.iterator();
            while (it.hasNext()) {
                ((Consumer) it.next()).accept(hVarB);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
