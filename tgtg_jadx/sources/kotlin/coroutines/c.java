package kotlin.coroutines;

import com.braze.h2;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import rk.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f26546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext.Element f26547b;

    public c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        element.getClass();
        this.f26546a = coroutineContext;
        this.f26547b = element;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iB = b();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[iB];
        Ref.IntRef intRef = new Ref.IntRef();
        fold(Unit.f26487a, new a0(18, coroutineContextArr, intRef));
        if (intRef.element == iB) {
            return new x70.b(coroutineContextArr);
        }
        h2.b("Check failed.");
        return null;
    }

    public final int b() {
        int i11 = 2;
        c cVar = this;
        while (true) {
            CoroutineContext coroutineContext = cVar.f26546a;
            cVar = coroutineContext instanceof c ? (c) coroutineContext : null;
            if (cVar == null) {
                return i11;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zAreEqual;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.b() == b()) {
                c cVar2 = this;
                while (true) {
                    CoroutineContext.Element element = cVar2.f26547b;
                    if (!Intrinsics.areEqual(cVar.get(element.getKey()), element)) {
                        zAreEqual = false;
                        break;
                    }
                    CoroutineContext coroutineContext = cVar2.f26546a;
                    if (!(coroutineContext instanceof c)) {
                        coroutineContext.getClass();
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
                        zAreEqual = Intrinsics.areEqual(cVar.get(element2.getKey()), element2);
                        break;
                    }
                    cVar2 = (c) coroutineContext;
                }
                if (zAreEqual) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(this.f26546a.fold(obj, function2), this.f26547b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        fVar.getClass();
        c cVar = this;
        while (true) {
            CoroutineContext.Element element = cVar.f26547b.get(fVar);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = cVar.f26546a;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.get(fVar);
            }
            cVar = (c) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.f26547b.hashCode() + this.f26546a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        fVar.getClass();
        CoroutineContext.Element element = this.f26547b;
        CoroutineContext.Element element2 = element.get(fVar);
        CoroutineContext coroutineContext = this.f26546a;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(fVar);
        return coroutineContextMinusKey == coroutineContext ? this : coroutineContextMinusKey == g.f26549a ? element : new c(element, coroutineContextMinusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == g.f26549a ? this : (CoroutineContext) coroutineContext.fold(this, new u60.a(19));
    }

    public final String toString() {
        return l1.f(new StringBuilder("["), (String) fold("", new u60.a(18)), ']');
    }
}
