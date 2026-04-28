package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f19347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19348k;
    public final /* synthetic */ w6 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(w6 w6Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f19347j = i11;
        this.l = w6Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f19347j) {
            case 0:
                return new q3(this.l, cVar, 0);
            case 1:
                return new q3(this.l, cVar, 1);
            case 2:
                return new q3(this.l, cVar, 2);
            case 3:
                return new q3(this.l, cVar, 3);
            case 4:
                return new q3(this.l, cVar, 4);
            case 5:
                return new q3(this.l, cVar, 5);
            case 6:
                return new q3(this.l, cVar, 6);
            case 7:
                return new q3(this.l, cVar, 7);
            case 8:
                return new q3(this.l, cVar, 8);
            case 9:
                return new q3(this.l, cVar, 9);
            case 10:
                return new q3(this.l, cVar, 10);
            case 11:
                return new q3(this.l, cVar, 11);
            case 12:
                return new q3(this.l, cVar, 12);
            case 13:
                return new q3(this.l, cVar, 13);
            default:
                return new q3(this.l, cVar, 14);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f19347j) {
        }
        return ((q3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19347j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f19348k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.g(this) == aVar) {
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f19348k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.e(this) == aVar2) {
                    }
                }
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f19348k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.h(this) == aVar3) {
                    }
                }
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f19348k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.e(this) == aVar4) {
                    }
                }
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f19348k;
                if (i15 != 0) {
                    if (i15 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.c(this) == aVar5) {
                    }
                }
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f19348k;
                if (i16 != 0) {
                    if (i16 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.h(this) == aVar6) {
                    }
                }
                break;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f19348k;
                if (i17 != 0) {
                    if (i17 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.c(this) == aVar7) {
                    }
                }
                break;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f19348k;
                if (i18 != 0) {
                    if (i18 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.g(this) == aVar8) {
                    }
                }
                break;
            case 8:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f19348k;
                if (i19 != 0) {
                    if (i19 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.e(this) == aVar9) {
                    }
                }
                break;
            case 9:
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                int i21 = this.f19348k;
                if (i21 != 0) {
                    if (i21 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.e(this) == aVar10) {
                    }
                }
                break;
            case 10:
                y70.a aVar11 = y70.a.COROUTINE_SUSPENDED;
                int i22 = this.f19348k;
                if (i22 != 0) {
                    if (i22 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.e(this) == aVar11) {
                    }
                }
                break;
            case 11:
                y70.a aVar12 = y70.a.COROUTINE_SUSPENDED;
                int i23 = this.f19348k;
                if (i23 != 0) {
                    if (i23 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.e(this) == aVar12) {
                    }
                }
                break;
            case 12:
                y70.a aVar13 = y70.a.COROUTINE_SUSPENDED;
                int i24 = this.f19348k;
                if (i24 != 0) {
                    if (i24 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.e(this) == aVar13) {
                    }
                }
                break;
            case 13:
                y70.a aVar14 = y70.a.COROUTINE_SUSPENDED;
                int i25 = this.f19348k;
                if (i25 != 0) {
                    if (i25 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.e(this) == aVar14) {
                    }
                }
                break;
            default:
                y70.a aVar15 = y70.a.COROUTINE_SUSPENDED;
                int i26 = this.f19348k;
                if (i26 != 0) {
                    if (i26 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f19348k = 1;
                    if (this.l.e(this) == aVar15) {
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
