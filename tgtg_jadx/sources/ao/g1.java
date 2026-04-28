package ao;

import com.app.tgtg.model.remote.item.requests.ItemRequest;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.CateringItem;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f4252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4253k;
    public final /* synthetic */ r1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f4254m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(r1 r1Var, String str, x70.c cVar, int i11) {
        super(2, cVar);
        this.f4252j = i11;
        this.l = r1Var;
        this.f4254m = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f4252j) {
            case 0:
                return new g1(this.l, this.f4254m, cVar, 0);
            case 1:
                return new g1(this.l, this.f4254m, cVar, 1);
            case 2:
                return new g1(this.l, this.f4254m, cVar, 2);
            default:
                return new g1(this.l, this.f4254m, cVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f4252j) {
        }
        return ((g1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object objE;
        Object objE2;
        Object objE3;
        int i11 = this.f4252j;
        r1 r1Var = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f4253k;
                if (i12 == 0) {
                    ba0.g.M(obj);
                    kt.f fVar = r1Var.f4418b;
                    this.f4253k = 1;
                    objD = fVar.d(this.f4254m, this);
                    if (objD == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    objD = ((u70.q) obj).f40851a;
                }
                return new u70.q(objD);
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f4253k;
                if (i13 == 0) {
                    ba0.g.M(obj);
                    kt.f fVar2 = r1Var.f4418b;
                    ItemRequest itemRequest = new ItemRequest(null);
                    String strL = r1.l();
                    String strF = r1Var.f();
                    this.f4253k = 1;
                    objE = fVar2.e(this.f4254m, itemRequest, strL, strF, this);
                    if (objE == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    objE = ((u70.q) obj).f40851a;
                }
                u70.o oVar = u70.q.f40850b;
                if (!(objE instanceof u70.p)) {
                    try {
                        BasicItem basicItem = (BasicItem) objE;
                        if (basicItem == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.app.tgtg.model.remote.item.response.ManufacturerItem");
                        }
                        objE = (ManufacturerItem) basicItem;
                    } catch (Throwable th2) {
                        u70.o oVar2 = u70.q.f40850b;
                        objE = new u70.p(th2);
                    }
                }
                return new u70.q(objE);
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i14 = this.f4253k;
                if (i14 == 0) {
                    ba0.g.M(obj);
                    kt.f fVar3 = r1Var.f4418b;
                    ItemRequest itemRequest2 = new ItemRequest(null);
                    String strL2 = r1.l();
                    String strF2 = r1Var.f();
                    this.f4253k = 1;
                    objE2 = fVar3.e(this.f4254m, itemRequest2, strL2, strF2, this);
                    if (objE2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    objE2 = ((u70.q) obj).f40851a;
                }
                u70.o oVar3 = u70.q.f40850b;
                if (!(objE2 instanceof u70.p)) {
                    try {
                        BasicItem basicItem2 = (BasicItem) objE2;
                        if (basicItem2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.app.tgtg.model.remote.item.response.CharityItem");
                        }
                        objE2 = (CharityItem) basicItem2;
                    } catch (Throwable th3) {
                        u70.o oVar4 = u70.q.f40850b;
                        objE2 = new u70.p(th3);
                    }
                }
                return new u70.q(objE2);
            default:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                int i15 = this.f4253k;
                if (i15 == 0) {
                    ba0.g.M(obj);
                    kt.f fVar4 = r1Var.f4418b;
                    ItemRequest itemRequest3 = new ItemRequest(null);
                    String strL3 = r1.l();
                    String strF3 = r1Var.f();
                    this.f4253k = 1;
                    objE3 = fVar4.e(this.f4254m, itemRequest3, strL3, strF3, this);
                    if (objE3 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ba0.g.M(obj);
                    objE3 = ((u70.q) obj).f40851a;
                }
                u70.o oVar5 = u70.q.f40850b;
                if (!(objE3 instanceof u70.p)) {
                    try {
                        BasicItem basicItem3 = (BasicItem) objE3;
                        if (basicItem3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.app.tgtg.model.remote.item.response.CateringItem");
                        }
                        objE3 = (CateringItem) basicItem3;
                    } catch (Throwable th4) {
                        u70.o oVar6 = u70.q.f40850b;
                        objE3 = new u70.p(th4);
                    }
                }
                return new u70.q(objE3);
        }
    }
}
