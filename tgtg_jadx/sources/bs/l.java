package bs;

import androidx.lifecycle.o0;
import ao.r1;
import com.app.tgtg.model.remote.item.requests.ListItemRequest;
import com.app.tgtg.model.remote.item.response.ListItemResponse;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u70.p;
import u70.q;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f6690k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, x70.c cVar) {
        super(2, cVar);
        this.f6690k = oVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new l(this.f6690k, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f6689j;
        o oVar = this.f6690k;
        if (i11 == 0) {
            ba0.g.M(obj);
            r1 r1Var = oVar.f6695a;
            ListItemRequest listItemRequestBuild = new ListItemRequest.Builder(null, 0.0d, 0, 0, false, false, false, false, null, null, false, null, 4095, null).setLocation(ft.c.z()).setHiddenOnly(true).build();
            this.f6689j = 1;
            Object objH = r1Var.h(listItemRequestBuild, this);
            if (objH == aVar) {
                return aVar;
            }
            obj2 = objH;
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
            obj2 = ((q) obj).f40851a;
        }
        u70.o oVar2 = q.f40850b;
        if (!(obj2 instanceof p)) {
            ((o0) oVar.f6698d.getValue()).i(((ListItemResponse) obj2).getItems());
        }
        return Unit.f26487a;
    }
}
