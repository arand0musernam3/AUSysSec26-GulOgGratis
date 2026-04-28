package y80;

import com.braze.h2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends z80.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f45460f = AtomicIntegerFieldUpdater.newUpdater(d.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x80.w f45461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f45462e;

    public /* synthetic */ d(x80.w wVar, boolean z11) {
        this(wVar, z11, kotlin.coroutines.g.f26549a, -3, x80.a.SUSPEND);
    }

    @Override // z80.d
    public final String b() {
        return "channel=" + this.f45461d;
    }

    @Override // z80.d
    public final Object c(x80.u uVar, x70.c cVar) throws Throwable {
        Object objO = r.o(new z80.w(uVar), this.f45461d, this.f45462e, cVar);
        return objO == y70.a.COROUTINE_SUSPENDED ? objO : Unit.f26487a;
    }

    @Override // z80.d, y80.i
    public final Object collect(j jVar, x70.c cVar) throws Throwable {
        if (this.f47361b != -3) {
            Object objCollect = super.collect(jVar, cVar);
            return objCollect == y70.a.COROUTINE_SUSPENDED ? objCollect : Unit.f26487a;
        }
        boolean z11 = this.f45462e;
        if (z11 && f45460f.getAndSet(this, 1) == 1) {
            h2.b("ReceiveChannel.consumeAsFlow can be collected just once");
            return null;
        }
        Object objO = r.o(jVar, this.f45461d, z11, cVar);
        return objO == y70.a.COROUTINE_SUSPENDED ? objO : Unit.f26487a;
    }

    @Override // z80.d
    public final z80.d d(CoroutineContext coroutineContext, int i11, x80.a aVar) {
        return new d(this.f45461d, this.f45462e, coroutineContext, i11, aVar);
    }

    @Override // z80.d
    public final i e() {
        return new d(this.f45461d, this.f45462e);
    }

    @Override // z80.d
    public final x80.w f(v80.b0 b0Var) {
        if (!this.f45462e || f45460f.getAndSet(this, 1) != 1) {
            return this.f47361b == -3 ? this.f45461d : super.f(b0Var);
        }
        h2.b("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public d(x80.w wVar, boolean z11, CoroutineContext coroutineContext, int i11, x80.a aVar) {
        super(coroutineContext, i11, aVar);
        this.f45461d = wVar;
        this.f45462e = z11;
    }
}
