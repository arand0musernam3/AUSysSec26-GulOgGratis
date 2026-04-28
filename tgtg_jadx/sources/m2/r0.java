package m2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import z1.z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f29056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29057k;
    public final /* synthetic */ w4.y l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l1 f29058m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(w4.y yVar, l1 l1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f29056j = i11;
        this.l = yVar;
        this.f29058m = l1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f29056j) {
            case 0:
                return new r0(this.l, this.f29058m, cVar, 0);
            case 1:
                return new r0(this.l, this.f29058m, cVar, 1);
            default:
                return new r0(this.l, this.f29058m, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f29056j) {
        }
        return ((r0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29056j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f29057k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f29057k = 1;
                    if (g0.s(this.l, this.f29058m, this) == aVar) {
                    }
                }
                break;
            case 1:
                Object obj2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f29057k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f29057k = 1;
                    Object objE = z3.e(this.l, new a3.g2(this.f29058m, (x70.c) null, 1), this);
                    if (objE != obj2) {
                        objE = Unit.f26487a;
                    }
                    if (objE == obj2) {
                    }
                }
                break;
            default:
                Object obj3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f29057k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f29057k = 1;
                    final l1 l1Var = this.f29058m;
                    a3.z0 z0Var = new a3.z0(l1Var, 2);
                    final int i14 = 0;
                    Function0 function0 = new Function0() { // from class: m2.h1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    l1Var.b();
                                    break;
                                default:
                                    l1Var.onCancel();
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    final int i15 = 1;
                    Object objE2 = z1.y0.e(this.l, z0Var, function0, new Function0() { // from class: m2.h1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    l1Var.b();
                                    break;
                                default:
                                    l1Var.onCancel();
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    }, new lk.a(l1Var, 11), this);
                    if (objE2 != obj3) {
                        objE2 = Unit.f26487a;
                    }
                    if (objE2 == obj3) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
