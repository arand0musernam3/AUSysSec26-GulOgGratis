package b0;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f5182b;

    public /* synthetic */ f3(List list, int i11) {
        this.f5181a = i11;
        this.f5182b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z11;
        switch (this.f5181a) {
            case 0:
                Iterator it = this.f5182b.iterator();
                while (it.hasNext()) {
                    ((s0.x0) it.next()).b();
                }
                return Unit.f26487a;
            case 1:
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                List list = this.f5182b;
                lVar.r(list.size(), null, new cn.n(list, 15), new u3.d(new oi.c(list, 0), true, 802480018));
                return Unit.f26487a;
            case 2:
                f2.l lVar2 = (f2.l) obj;
                lVar2.getClass();
                f2.l.q(lVar2, null, oi.a.f32558b, 3);
                List list2 = this.f5182b;
                lVar2.r(list2.size(), null, new cn.n(list2, 16), new u3.d(new oi.c(list2, 1), true, 802480018));
                f2.l.q(lVar2, null, oi.a.f32559c, 3);
                return Unit.f26487a;
            case 3:
                f2.l lVar3 = (f2.l) obj;
                lVar3.getClass();
                for (qk.m mVar : this.f5182b) {
                    f2.l.q(lVar3, mVar.f37191a, new u3.d(new a3.m2(mVar, 22), true, 889816353), 2);
                }
                return Unit.f26487a;
            case 4:
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) obj;
                baseItemMnuV2.getClass();
                List list3 = this.f5182b;
                if (list3 == null || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.areEqual(((BasketBriefItem) it2.next()).getItemId(), baseItemMnuV2.m393getItemIdFvU5WIY())) {
                            z11 = true;
                        }
                    }
                    z11 = false;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            default:
                return ((um.d) this.f5182b.get(((Integer) obj).intValue())).a();
        }
    }
}
