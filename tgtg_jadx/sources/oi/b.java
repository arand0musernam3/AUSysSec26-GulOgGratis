package oi;

import ba0.g;
import com.braze.h2;
import g3.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import v80.b0;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f32562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32563k;
    public final /* synthetic */ w6 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function0 f32564m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(w6 w6Var, Function0 function0, x70.c cVar, int i11) {
        super(2, cVar);
        this.f32562j = i11;
        this.l = w6Var;
        this.f32564m = function0;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f32562j) {
            case 0:
                return new b(this.l, this.f32564m, cVar, 0);
            case 1:
                return new b(this.l, this.f32564m, cVar, 1);
            case 2:
                return new b(this.l, this.f32564m, cVar, 2);
            case 3:
                return new b(this.l, this.f32564m, cVar, 3);
            case 4:
                return new b(this.l, this.f32564m, cVar, 4);
            case 5:
                return new b(this.l, this.f32564m, cVar, 5);
            case 6:
                return new b(this.l, this.f32564m, cVar, 6);
            case 7:
                return new b(this.l, this.f32564m, cVar, 7);
            default:
                return new b(this.l, this.f32564m, cVar, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f32562j) {
        }
        return ((b) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f32562j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f32563k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        g.M(obj);
                    }
                    break;
                } else {
                    g.M(obj);
                    this.f32563k = 1;
                    if (this.l.e(this) == aVar) {
                    }
                }
                this.f32564m.invoke();
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f32563k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        g.M(obj);
                    }
                    break;
                } else {
                    g.M(obj);
                    this.f32563k = 1;
                    if (this.l.e(this) == aVar2) {
                    }
                }
                this.f32564m.invoke();
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f32563k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        g.M(obj);
                    }
                    break;
                } else {
                    g.M(obj);
                    this.f32563k = 1;
                    if (this.l.e(this) == aVar3) {
                    }
                }
                this.f32564m.invoke();
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f32563k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        g.M(obj);
                    }
                    break;
                } else {
                    g.M(obj);
                    this.f32563k = 1;
                    if (this.l.e(this) == aVar4) {
                    }
                }
                this.f32564m.invoke();
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f32563k;
                if (i15 != 0) {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        g.M(obj);
                    }
                    break;
                } else {
                    g.M(obj);
                    this.f32563k = 1;
                    if (this.l.e(this) == aVar5) {
                    }
                }
                this.f32564m.invoke();
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f32563k;
                if (i16 != 0) {
                    if (i16 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        g.M(obj);
                    }
                    break;
                } else {
                    g.M(obj);
                    this.f32563k = 1;
                    if (this.l.e(this) == aVar6) {
                    }
                }
                this.f32564m.invoke();
                break;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f32563k;
                if (i17 != 0) {
                    if (i17 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        g.M(obj);
                    }
                    break;
                } else {
                    g.M(obj);
                    this.f32563k = 1;
                    if (this.l.e(this) == aVar7) {
                    }
                }
                this.f32564m.invoke();
                break;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f32563k;
                if (i18 != 0) {
                    if (i18 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        g.M(obj);
                    }
                    break;
                } else {
                    g.M(obj);
                    this.f32563k = 1;
                    if (this.l.e(this) == aVar8) {
                    }
                }
                this.f32564m.invoke();
                break;
            default:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f32563k;
                if (i19 != 0) {
                    if (i19 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        g.M(obj);
                    }
                    break;
                } else {
                    g.M(obj);
                    this.f32563k = 1;
                    if (this.l.e(this) == aVar9) {
                    }
                }
                this.f32564m.invoke();
                break;
        }
        return Unit.f26487a;
    }
}
