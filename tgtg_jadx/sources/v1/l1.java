package v1;

import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f41779a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e90.c f41780b = e90.d.a();

    public static final void a(l1 l1Var, k1 k1Var) {
        AtomicReference atomicReference = l1Var.f41779a;
        while (true) {
            k1 k1Var2 = (k1) atomicReference.get();
            if (k1Var2 != null && k1Var.f41776a.compareTo(k1Var2.f41776a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(k1Var2, k1Var)) {
                if (atomicReference.get() != k1Var2) {
                    break;
                }
            }
            if (k1Var2 != null) {
                k1Var2.f41777b.a(new MutationInterruptedException("Mutation interrupted"));
                return;
            }
            return;
        }
    }

    public static Object b(l1 l1Var, Function1 function1, z70.i iVar) {
        j1 j1Var = j1.Default;
        l1Var.getClass();
        return v80.f0.n(new b0.c2(j1Var, l1Var, function1, (x70.c) null), iVar);
    }
}
