package y80;

import com.google.android.gms.internal.measurement.cg;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class e extends z80.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f45466d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f45467e;

    /* JADX WARN: Multi-variable type inference failed */
    public e(Function2 function2, CoroutineContext coroutineContext, int i11, x80.a aVar) {
        super(coroutineContext, i11, aVar);
        this.f45467e = (z70.i) function2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z80.d
    public Object c(x80.u uVar, x70.c cVar) {
        switch (this.f45466d) {
            case 0:
                Object objInvoke = ((z70.i) this.f45467e).invoke(uVar, cVar);
                if (objInvoke != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                z80.w wVar = new z80.w(uVar);
                Iterator it = ((Iterable) this.f45467e).iterator();
                while (it.hasNext()) {
                    v80.f0.B(uVar, null, null, new z1.a2((i) it.next(), wVar, null, 7), 3);
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, z70.i] */
    @Override // z80.d
    public z80.d d(CoroutineContext coroutineContext, int i11, x80.a aVar) {
        switch (this.f45466d) {
            case 0:
                return new e((Function2) this.f45467e, coroutineContext, i11, aVar);
            default:
                return new e((Iterable) this.f45467e, coroutineContext, i11, aVar);
        }
    }

    @Override // z80.d
    public x80.w f(v80.b0 b0Var) {
        switch (this.f45466d) {
            case 1:
                Function2 a2Var = new z1.a2(this, null, 5);
                x80.a aVar = x80.a.SUSPEND;
                v80.d0 d0Var = v80.d0.DEFAULT;
                x80.t tVar = new x80.t(v80.v.b(b0Var, this.f47360a), cg.a(this.f47361b, aVar, null, 4));
                tVar.k0(d0Var, tVar, a2Var);
                return tVar;
            default:
                return super.f(b0Var);
        }
    }

    @Override // z80.d
    public String toString() {
        switch (this.f45466d) {
            case 0:
                return "block[" + ((z70.i) this.f45467e) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    public e(Iterable iterable, CoroutineContext coroutineContext, int i11, x80.a aVar) {
        super(coroutineContext, i11, aVar);
        this.f45467e = iterable;
    }
}
