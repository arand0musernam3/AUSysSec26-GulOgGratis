package d10;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends qz.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f13718b;

    public n(qz.j jVar) {
        super(jVar);
        this.f13718b = new ArrayList();
        jVar.h("TaskOnStopCallback", this);
    }

    @Override // qz.i
    public final void h() {
        ArrayList arrayList = this.f13718b;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m mVar = (m) ((WeakReference) it.next()).get();
                    if (mVar != null) {
                        mVar.b();
                    }
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
