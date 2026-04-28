package av;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class e extends o0 {
    public final AtomicBoolean l = new AtomicBoolean(false);

    @Override // androidx.lifecycle.k0
    public final void e(LifecycleOwner lifecycleOwner, p0 p0Var) {
        lifecycleOwner.getClass();
        p0Var.getClass();
        super.e(lifecycleOwner, new d(0, this, p0Var));
    }

    @Override // androidx.lifecycle.k0
    public final void k(Object obj) {
        this.l.set(true);
        super.k(obj);
    }
}
