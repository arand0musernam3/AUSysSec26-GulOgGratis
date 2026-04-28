package xl;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;
import y80.m1;
import y80.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f44457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44458k;
    public final /* synthetic */ m l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f44457j = i11;
        this.l = mVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f44457j) {
            case 0:
                return new k(this.l, cVar, 0);
            default:
                return new k(this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f44457j) {
        }
        return ((k) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f44457j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f44458k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    m1 m1Var = this.l.f44465e;
                    this.f44458k = 1;
                    if (m1Var.emit(a.f44442a, this) == aVar) {
                    }
                }
                break;
            default:
                Object obj2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f44458k;
                m mVar = this.l;
                int i13 = 2;
                if (i12 != 0) {
                    if (i12 == 1) {
                        ba0.g.M(obj);
                    } else if (i12 != 2) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f44458k = 1;
                    Object objR = xz.b.r(mVar.f44462b, new w1(i13, null, 1), this);
                    if (objR != obj2) {
                        objR = Unit.f26487a;
                    }
                    if (objR == obj2) {
                    }
                }
                m1 m1Var2 = mVar.f44465e;
                this.f44458k = 2;
                if (m1Var2.emit(b.f44443a, this) == obj2) {
                }
                break;
        }
        return Unit.f26487a;
    }
}
