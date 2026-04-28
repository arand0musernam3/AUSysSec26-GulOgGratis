package androidx.lifecycle;

import java.io.Closeable;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l1 {

    @Nullable
    private final a9.d impl = new a9.d();

    public final void addCloseable(@NotNull String str, @NotNull AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        str.getClass();
        autoCloseable.getClass();
        a9.d dVar = this.impl;
        if (dVar != null) {
            if (dVar.f1004d) {
                a9.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.f1001a) {
                autoCloseable2 = (AutoCloseable) dVar.f1002b.put(str, autoCloseable);
            }
            a9.d.a(autoCloseable2);
        }
    }

    public final void clear$lifecycle_viewmodel() {
        a9.d dVar = this.impl;
        if (dVar != null && !dVar.f1004d) {
            dVar.f1004d = true;
            synchronized (dVar.f1001a) {
                try {
                    Iterator it = dVar.f1002b.values().iterator();
                    while (it.hasNext()) {
                        a9.d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.f1003c.iterator();
                    while (it2.hasNext()) {
                        a9.d.a((AutoCloseable) it2.next());
                    }
                    dVar.f1003c.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        onCleared();
    }

    @Nullable
    public final <T extends AutoCloseable> T getCloseable(@NotNull String str) {
        T t9;
        str.getClass();
        a9.d dVar = this.impl;
        if (dVar == null) {
            return null;
        }
        synchronized (dVar.f1001a) {
            t9 = (T) dVar.f1002b.get(str);
        }
        return t9;
    }

    public void onCleared() {
    }

    public void addCloseable(@NotNull AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        a9.d dVar = this.impl;
        if (dVar != null) {
            if (dVar.f1004d) {
                a9.d.a(autoCloseable);
                return;
            }
            synchronized (dVar.f1001a) {
                dVar.f1003c.add(autoCloseable);
            }
        }
    }

    @u70.d
    public void addCloseable(Closeable closeable) {
        closeable.getClass();
        a9.d dVar = this.impl;
        if (dVar != null) {
            if (dVar.f1004d) {
                a9.d.a(closeable);
                return;
            }
            synchronized (dVar.f1001a) {
                dVar.f1003c.add(closeable);
            }
        }
    }
}
