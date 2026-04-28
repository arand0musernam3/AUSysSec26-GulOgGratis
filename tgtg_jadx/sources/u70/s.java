package u70;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements j, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final r f40852c = new r(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f40853d = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Function0 f40854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f40855b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new g(getValue());
    }

    @Override // u70.j
    public final Object getValue() {
        Object obj = this.f40855b;
        e0 e0Var = e0.f40836a;
        if (obj != e0Var) {
            return obj;
        }
        Function0 function0 = this.f40854a;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40853d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, e0Var, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != e0Var) {
                }
            }
            this.f40854a = null;
            return objInvoke;
        }
        return this.f40855b;
    }

    public final String toString() {
        return this.f40855b != e0.f40836a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
