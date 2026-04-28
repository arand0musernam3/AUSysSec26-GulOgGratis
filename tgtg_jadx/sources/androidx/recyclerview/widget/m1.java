package androidx.recyclerview.widget;

import android.database.Observable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((n1) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i11, int i12) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((n1) ((Observable) this).mObservers.get(size)).d(i11, i12);
        }
    }

    public final void d(int i11, int i12, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((n1) ((Observable) this).mObservers.get(size)).b(i11, i12, obj);
        }
    }

    public final void e(int i11, int i12) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((n1) ((Observable) this).mObservers.get(size)).c(i11, i12);
        }
    }

    public final void f(int i11, int i12) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((n1) ((Observable) this).mObservers.get(size)).e(i11, i12);
        }
    }

    public final void g() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((n1) ((Observable) this).mObservers.get(size)).f();
        }
    }
}
