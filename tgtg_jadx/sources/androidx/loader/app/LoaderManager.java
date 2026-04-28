package androidx.loader.app;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.s1;
import b9.a;
import b9.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class LoaderManager {
    public static e b(LifecycleOwner lifecycleOwner) {
        return new e(lifecycleOwner, ((s1) lifecycleOwner).getViewModelStore());
    }

    public abstract void a();

    public abstract c9.e c(int i11, a aVar);
}
