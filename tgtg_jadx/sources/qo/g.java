package qo;

import com.app.tgtg.model.remote.item.response.ItemType;
import com.braze.h2;
import et.z;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u70.q;
import v80.b0;
import y80.m1;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f37206j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37207k;
    public final /* synthetic */ h l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f37206j = i11;
        this.l = hVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f37206j) {
            case 0:
                return new g(this.l, cVar, 0);
            case 1:
                return new g(this.l, cVar, 1);
            default:
                return new g(this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f37206j) {
        }
        return ((g) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37206j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f37207k;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    h hVar = this.l;
                    String strB = hVar.b();
                    if (strB != null) {
                        z zVar = hVar.f37210c;
                        this.f37207k = 1;
                        if (zVar.a(strB, this) == aVar) {
                        }
                    }
                }
                break;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f37207k;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                        ((q) obj).getClass();
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    h hVar2 = this.l;
                    String strB2 = hVar2.b();
                    if (strB2 != null) {
                        hVar2.l = true;
                        z zVar2 = hVar2.f37210c;
                        this.f37207k = 1;
                        if (zVar2.k(strB2, this) == aVar2) {
                        }
                    }
                }
                break;
            default:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                int i13 = this.f37207k;
                if (i13 != 0) {
                    if (i13 == 1 || i13 == 2 || i13 == 3) {
                        ba0.g.M(obj);
                    } else {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    h hVar3 = this.l;
                    ItemType itemTypeA = hVar3.a();
                    ArrayList arrayList = hVar3.f37216i;
                    m1 m1Var = hVar3.f37217j;
                    if (itemTypeA == ItemType.MANUFACTURER) {
                        f fVar = f.END;
                        this.f37207k = 1;
                        if (m1Var.emit(fVar, this) == aVar3) {
                        }
                    } else if (arrayList.isEmpty()) {
                        f fVar2 = f.END;
                        this.f37207k = 3;
                        if (m1Var.emit(fVar2, this) == aVar3) {
                        }
                    } else {
                        f fVar3 = (f) arrayList.remove(0);
                        fVar3.a();
                        this.f37207k = 2;
                        if (m1Var.emit(fVar3, this) == aVar3) {
                        }
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
