package g9;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import com.braze.h2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends p {
    public final void l(LifecycleOwner lifecycleOwner) {
        Lifecycle lifecycle;
        lifecycleOwner.getClass();
        l9.f fVar = this.f20186b;
        androidx.lifecycle.s sVar = fVar.f27548r;
        if (Intrinsics.areEqual(lifecycleOwner, fVar.f27544n)) {
            return;
        }
        LifecycleOwner lifecycleOwner2 = fVar.f27544n;
        if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
            lifecycle.d(sVar);
        }
        fVar.f27544n = lifecycleOwner;
        lifecycleOwner.getLifecycle().a(sVar);
    }

    public final void m(ViewModelStore viewModelStore) {
        viewModelStore.getClass();
        l9.f fVar = this.f20186b;
        fVar.getClass();
        if (Intrinsics.areEqual(fVar.f27545o, wd.a.x(viewModelStore))) {
            return;
        }
        if (fVar.f27537f.isEmpty()) {
            fVar.f27545o = wd.a.x(viewModelStore);
        } else {
            h2.b("ViewModelStore should be set before setGraph call");
        }
    }
}
