package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class p1 implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static p1 f3507a;

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final l1 create(KClass kClass, CreationExtras creationExtras) {
        kClass.getClass();
        return create(y9.w.v(kClass), creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public l1 create(Class cls, CreationExtras creationExtras) {
        cls.getClass();
        creationExtras.getClass();
        return create(cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public l1 create(Class cls) {
        cls.getClass();
        return w.b.E(cls);
    }
}
