package d8;

import b0.r2;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import java.io.IOException;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f14653j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14654k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y yVar, x70.c cVar) {
        super(3, cVar);
        this.l = yVar;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f14653j) {
            case 0:
                return new m((y) this.l, (x70.c) obj3).invokeSuspend(Unit.f26487a);
            default:
                ((Boolean) obj2).getClass();
                m mVar = new m(3, (x70.c) obj3);
                mVar.l = (a0) obj;
                return mVar.invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws IOException {
        switch (this.f14653j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f14654k;
                if (i11 == 0) {
                    ba0.g.M(obj);
                    y yVar = (y) this.l;
                    this.f14654k = 1;
                    if (y.b(yVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                }
                return Unit.f26487a;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f14654k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    a0 a0Var = (a0) this.l;
                    this.f14654k = 1;
                    if (!a0Var.f14572c.get()) {
                        Object objI = cg.i(a0Var.f14570a, new r2(a0Var, (x70.c) null, 2), this);
                        return objI == aVar2 ? aVar2 : objI;
                    }
                    h2.b("This scope has already been closed.");
                } else {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                        return obj;
                    }
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    public /* synthetic */ m(int i11, x70.c cVar) {
        super(i11, cVar);
    }
}
