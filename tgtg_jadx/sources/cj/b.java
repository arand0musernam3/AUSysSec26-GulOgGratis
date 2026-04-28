package cj;

import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8175k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f8176m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q qVar, int i11, x70.c cVar) {
        super(2, cVar);
        this.f8174j = 2;
        this.f8176m = qVar;
        this.l = i11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8174j) {
            case 0:
                return new b(this.f8176m, cVar, 0);
            case 1:
                return new b(this.f8176m, cVar, 1);
            default:
                return new b(this.f8176m, this.l, cVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8174j) {
        }
        return ((b) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        int i12;
        int i13 = this.f8174j;
        q qVar = this.f8176m;
        switch (i13) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.l;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    int iIntValue = ((Number) qVar.f8358t.getValue()).intValue() + 1;
                    Integer num = qVar.V;
                    if (num == null || iIntValue <= num.intValue()) {
                        a2 a2Var = qVar.f8358t;
                        Integer num2 = new Integer(iIntValue);
                        this.f8175k = iIntValue;
                        this.l = 1;
                        a2Var.getClass();
                        a2Var.k(null, num2);
                        if (Unit.f26487a != aVar) {
                            i11 = iIntValue;
                        }
                    }
                } else if (i14 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i11 = this.f8175k;
                    ba0.g.M(obj);
                }
                h8.e eVar = q.f8330j0;
                qVar.t();
                int i15 = qVar.U;
                if (i11 > i15) {
                    qVar.U = i15 + 5;
                    qVar.T += 5;
                    qVar.j();
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i16 = this.l;
                if (i16 == 0) {
                    ba0.g.M(obj);
                    int iIntValue2 = ((Number) qVar.f8358t.getValue()).intValue() - 1;
                    if (iIntValue2 != 0) {
                        a2 a2Var2 = qVar.f8358t;
                        Integer num3 = new Integer(iIntValue2);
                        this.f8175k = iIntValue2;
                        this.l = 1;
                        a2Var2.getClass();
                        a2Var2.k(null, num3);
                        if (Unit.f26487a != aVar2) {
                            i12 = iIntValue2;
                        }
                    }
                } else if (i16 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i12 = this.f8175k;
                    ba0.g.M(obj);
                }
                h8.e eVar2 = q.f8330j0;
                qVar.t();
                int i17 = qVar.T;
                if (i12 < i17 && i17 != 1) {
                    qVar.T = i17 - 5;
                    qVar.U -= 5;
                    qVar.j();
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i18 = this.f8175k;
                if (i18 == 0) {
                    ba0.g.M(obj);
                    a2 a2Var3 = qVar.f8358t;
                    Integer num4 = new Integer(this.l);
                    this.f8175k = 1;
                    a2Var3.getClass();
                    a2Var3.k(null, num4);
                    if (Unit.f26487a == aVar3) {
                    }
                } else if (i18 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ba0.g.M(obj);
                }
                h8.e eVar3 = q.f8330j0;
                qVar.t();
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(q qVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8174j = i11;
        this.f8176m = qVar;
    }
}
