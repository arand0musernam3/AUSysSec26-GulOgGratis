package o00;

import java.util.UUID;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements v80.u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f31727c = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jd.f f31728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f31729b;

    public p(h hVar, boolean z11) {
        f fVar;
        this.f31729b = hVar;
        jd.f fVar2 = new jd.f(13);
        if (z11) {
            m mVar = (m) c.f31631e.get();
            fVar = mVar.f31706b;
            if (fVar != null) {
                int i11 = g.f31661a;
            } else {
                int i12 = f.f31652b;
                d dVar = d.f31639c;
                long jA = dVar.a() & (-61441);
                long jA2 = dVar.a() >>> 2;
                UUID uuid = dVar.f31640a;
                String strConcat = "tk-trace-id: ".concat(String.valueOf(Long.toString(new UUID(jA ^ uuid.getMostSignificantBits(), jA2 ^ uuid.getLeastSignificantBits()).getLeastSignificantBits() >>> 1, 36)));
                x xVar = (x) c.f31628b.get();
                if (!xVar.isEmpty()) {
                    xVar.forEach(new e());
                }
                fVar = new f(strConcat, mVar);
            }
        } else {
            fVar = null;
        }
        fVar2.f24983b = fVar;
        this.f31728a = fVar2;
    }

    @Override // v80.e2
    public final void Q(CoroutineContext coroutineContext, Object obj) {
        n nVar = (n) obj;
        coroutineContext.getClass();
        nVar.getClass();
        m mVar = (m) c.f31631e.get();
        c.a(mVar, nVar.f31713a, 3);
        mVar.f31708d = nVar.f31714b;
        mVar.f31707c = nVar.f31715c;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return f31727c;
    }

    @Override // v80.e2
    public final Object i0(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        m mVar = (m) c.f31631e.get();
        jd.f fVar = mVar.f31708d;
        f fVar2 = mVar.f31706b;
        f fVar3 = mVar.f31707c;
        jd.f fVar4 = this.f31728a;
        if (fVar3 == null) {
            mVar.f31707c = fVar2 != null ? fVar2 : (f) fVar4.f24983b;
        }
        mVar.f31708d = fVar4;
        c.a(mVar, (f) fVar4.f24983b, 1);
        return new n(fVar2, fVar, fVar3);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }
}
