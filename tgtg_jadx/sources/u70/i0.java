package u70;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f40847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f40848b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new g(getValue());
    }

    @Override // u70.j
    public final Object getValue() {
        if (this.f40848b == e0.f40836a) {
            Function0 function0 = this.f40847a;
            function0.getClass();
            this.f40848b = function0.invoke();
            this.f40847a = null;
        }
        return this.f40848b;
    }

    public final String toString() {
        return this.f40848b != e0.f40836a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
