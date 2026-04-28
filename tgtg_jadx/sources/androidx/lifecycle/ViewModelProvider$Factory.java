package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"androidx/lifecycle/ViewModelProvider$Factory", "", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ViewModelProvider$Factory {
    default l1 create(KClass kClass, CreationExtras creationExtras) {
        kClass.getClass();
        creationExtras.getClass();
        return create(y9.w.v(kClass), creationExtras);
    }

    default l1 create(Class cls, CreationExtras creationExtras) {
        cls.getClass();
        creationExtras.getClass();
        return create(cls);
    }

    default l1 create(Class cls) {
        cls.getClass();
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
