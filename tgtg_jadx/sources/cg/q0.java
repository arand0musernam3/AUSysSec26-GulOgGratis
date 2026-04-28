package cg;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.b1;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8065k;
    public final /* synthetic */ b1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(b1 b1Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8064j = i11;
        this.l = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8064j) {
            case 0:
                return new q0(this.l, cVar, 0);
            case 1:
                return new q0(this.l, cVar, 1);
            case 2:
                return new q0(this.l, cVar, 2);
            case 3:
                return new q0(this.l, cVar, 3);
            case 4:
                return new q0(this.l, cVar, 4);
            case 5:
                return new q0(this.l, cVar, 5);
            case 6:
                return new q0(this.l, cVar, 6);
            case 7:
                return new q0(this.l, cVar, 7);
            default:
                return new q0(this.l, cVar, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8064j) {
        }
        return ((q0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f8064j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f8065k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f8065k = 1;
                    if (v80.f0.o(800L, this) == aVar) {
                    }
                }
                this.l.setValue(Boolean.TRUE);
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f8065k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f8065k = 1;
                    if (v80.f0.o(800L, this) == aVar2) {
                    }
                }
                this.l.setValue(Boolean.TRUE);
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f8065k;
                if (i13 != 0) {
                    if (i13 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f8065k = 1;
                    if (v80.f0.o(800L, this) == aVar3) {
                    }
                }
                this.l.setValue(Boolean.TRUE);
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f8065k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f8065k = 1;
                    if (v80.f0.o(ConversationFragment.COORDINATOR_INITIALIZATION_TIMEOUT, this) == aVar4) {
                    }
                }
                this.l.setValue(Boolean.FALSE);
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f8065k;
                if (i15 != 0) {
                    if (i15 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f8065k = 1;
                    if (v80.f0.o(500L, this) == aVar5) {
                    }
                }
                this.l.setValue(Boolean.TRUE);
                break;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.f8065k;
                if (i16 != 0) {
                    if (i16 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f8065k = 1;
                    if (v80.f0.o(500L, this) == aVar6) {
                    }
                }
                this.l.setValue(Boolean.TRUE);
                break;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                int i17 = this.f8065k;
                if (i17 != 0) {
                    if (i17 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f8065k = 1;
                    if (v80.f0.o(4000L, this) == aVar7) {
                    }
                }
                this.l.setValue(Boolean.FALSE);
                break;
            case 7:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f8065k;
                if (i18 != 0) {
                    if (i18 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f8065k = 1;
                    if (v80.f0.o(500L, this) == aVar8) {
                    }
                }
                this.l.setValue(Boolean.TRUE);
                break;
            default:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                int i19 = this.f8065k;
                if (i19 != 0) {
                    if (i19 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    this.f8065k = 1;
                    if (v80.f0.o(1000L, this) == aVar9) {
                    }
                }
                this.l.setValue(Boolean.TRUE);
                break;
        }
        return Unit.f26487a;
    }
}
