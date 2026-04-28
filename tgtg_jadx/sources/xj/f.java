package xj;

import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.braze.h2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qc.y;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f44376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f44377k;
    public final /* synthetic */ k l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f44378m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(k kVar, String str, x70.c cVar, int i11) {
        super(2, cVar);
        this.f44376j = i11;
        this.l = kVar;
        this.f44378m = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f44376j) {
            case 0:
                return new f(this.l, this.f44378m, cVar, 0);
            default:
                return new f(this.l, this.f44378m, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f44376j) {
        }
        return ((f) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f44376j) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f44377k;
                String str = this.f44378m;
                k kVar = this.l;
                if (i11 != 0) {
                    if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    wj.d dVar = kVar.f44407b;
                    this.f44377k = 1;
                    Object objA = dVar.f43506b.a(str, this);
                    if (objA != aVar) {
                        objA = Unit.f26487a;
                    }
                    if (objA == aVar) {
                    }
                }
                List<BasicItem> list = (List) kVar.f44417m.getValue();
                if (list != null) {
                    for (BasicItem basicItem : list) {
                        if (ItemId.m201equalsimpl0(str, basicItem.getInformation().mo340getItemIdFvU5WIY())) {
                            basicItem.setSubscribedForNotification(true);
                        }
                    }
                    y.h("Collection contains no element matching the predicate.");
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f44377k;
                String str2 = this.f44378m;
                k kVar2 = this.l;
                if (i12 != 0) {
                    if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ba0.g.M(obj);
                    }
                    break;
                } else {
                    ba0.g.M(obj);
                    wj.d dVar2 = kVar2.f44407b;
                    this.f44377k = 1;
                    Object objF = dVar2.f43506b.f(str2, this);
                    if (objF != aVar2) {
                        objF = Unit.f26487a;
                    }
                    if (objF == aVar2) {
                    }
                }
                List<BasicItem> list2 = (List) kVar2.f44417m.getValue();
                if (list2 != null) {
                    for (BasicItem basicItem2 : list2) {
                        if (ItemId.m201equalsimpl0(str2, basicItem2.getInformation().mo340getItemIdFvU5WIY())) {
                            basicItem2.setSubscribedForNotification(false);
                        }
                    }
                    y.h("Collection contains no element matching the predicate.");
                }
                break;
        }
        return Unit.f26487a;
    }
}
