package x80;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.internal.UndeliveredElementException;
import v80.n2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f44081m;

    public r(int i11, a aVar, Function1 function1) {
        super(i11, function1);
        this.f44081m = aVar;
        if (aVar == a.SUSPEND) {
            e40.a.h("This implementation does not support suspension for senders, use ", Reflection.getOrCreateKotlinClass(i.class).getSimpleName(), " instead");
            throw null;
        }
        if (i11 >= 1) {
            return;
        }
        i4.a.i(r8.k.h(i11, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    @Override // x80.i
    public final boolean B() {
        return this.f44081m == a.DROP_OLDEST;
    }

    public final Object N(Object obj, boolean z11) {
        Function1 function1;
        UndeliveredElementException undeliveredElementExceptionB;
        if (this.f44081m == a.DROP_LATEST) {
            Object objH = super.h(obj);
            if (!(objH instanceof o) || (objH instanceof n)) {
                return objH;
            }
            if (!z11 || (function1 = this.f44052b) == null || (undeliveredElementExceptionB = a90.g.b(function1, obj, null)) == null) {
                return Unit.f26487a;
            }
            throw undeliveredElementExceptionB;
        }
        Object obj2 = obj;
        Object obj3 = k.f44058d;
        q qVar = (q) i.f44047h.get(this);
        while (true) {
            long andIncrement = i.f44043d.getAndIncrement(this);
            long j9 = 1152921504606846975L & andIncrement;
            boolean zY = y(andIncrement, false);
            int i11 = k.f44056b;
            long j11 = i11;
            long j12 = j9 / j11;
            int i12 = (int) (j9 % j11);
            if (qVar.f1048c != j12) {
                q qVarG = i.g(this, j12, qVar);
                if (qVarG != null) {
                    qVar = qVarG;
                } else if (zY) {
                    return new n(v());
                }
            }
            int iK = i.k(this, qVar, i12, obj2, j9, obj3, zY);
            if (iK == 0) {
                qVar.a();
                return Unit.f26487a;
            }
            if (iK == 1) {
                return Unit.f26487a;
            }
            if (iK == 2) {
                if (zY) {
                    qVar.i();
                    return new n(v());
                }
                n2 n2Var = obj3 instanceof n2 ? (n2) obj3 : null;
                if (n2Var != null) {
                    n2Var.a(qVar, i12 + i11);
                }
                p((qVar.f1048c * j11) + ((long) i12));
                return Unit.f26487a;
            }
            if (iK == 3) {
                h2.b("unexpected");
                return null;
            }
            if (iK == 4) {
                if (j9 < i.f44044e.get(this)) {
                    qVar.a();
                }
                return new n(v());
            }
            if (iK == 5) {
                qVar.a();
            }
            obj2 = obj;
        }
    }

    @Override // x80.i, x80.x
    public final Object f(Object obj, x70.c cVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionB;
        if (!(N(obj, true) instanceof n)) {
            return Unit.f26487a;
        }
        Function1 function1 = this.f44052b;
        if (function1 == null || (undeliveredElementExceptionB = a90.g.b(function1, obj, null)) == null) {
            throw v();
        }
        u70.e.a(undeliveredElementExceptionB, v());
        throw undeliveredElementExceptionB;
    }

    @Override // x80.i, x80.x
    public final Object h(Object obj) {
        return N(obj, false);
    }
}
