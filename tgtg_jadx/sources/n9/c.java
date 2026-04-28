package n9;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f30735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f30736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f30737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u3.d f30738d;

    public c(KClass kClass, Function1 function1, Map map, u3.d dVar) {
        this.f30735a = kClass;
        this.f30736b = function1;
        this.f30737c = map;
        this.f30738d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f30735a, cVar.f30735a) && Intrinsics.areEqual(this.f30736b, cVar.f30736b) && Intrinsics.areEqual(this.f30737c, cVar.f30737c) && Intrinsics.areEqual(this.f30738d, cVar.f30738d);
    }

    public final int hashCode() {
        return this.f30738d.hashCode() + a0.f(this.f30737c, k.d(this.f30735a.hashCode() * 31, 31, this.f30736b), 31);
    }

    public final String toString() {
        return "EntryClassProvider(clazz=" + this.f30735a + ", clazzContentKey=" + this.f30736b + ", metadata=" + this.f30737c + ", content=" + this.f30738d + ')';
    }
}
