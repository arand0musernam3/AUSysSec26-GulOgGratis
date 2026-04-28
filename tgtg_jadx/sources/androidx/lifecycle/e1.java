package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements ViewModelProvider$Factory {
    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final l1 create(KClass kClass, CreationExtras creationExtras) {
        kClass.getClass();
        return new h1();
    }
}
