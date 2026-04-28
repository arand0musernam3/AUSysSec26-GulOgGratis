package u70;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f40856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f40857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40858c;

    public t(Function0 function0, Object obj, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i11 & 2) != 0 ? null : obj;
        function0.getClass();
        this.f40856a = function0;
        this.f40857b = e0.f40836a;
        this.f40858c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new g(getValue());
    }

    public final boolean a() {
        return this.f40857b != e0.f40836a;
    }

    @Override // u70.j
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f40857b;
        e0 e0Var = e0.f40836a;
        if (obj != e0Var) {
            return obj;
        }
        synchronized (this.f40858c) {
            objInvoke = this.f40857b;
            if (objInvoke == e0Var) {
                Function0 function0 = this.f40856a;
                function0.getClass();
                objInvoke = function0.invoke();
                this.f40857b = objInvoke;
                this.f40856a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
