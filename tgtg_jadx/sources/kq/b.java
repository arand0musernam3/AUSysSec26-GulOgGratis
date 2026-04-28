package kq;

import cn.n;
import f2.l;
import ii.a0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f26648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f26649c;

    public /* synthetic */ b(List list, Function1 function1, int i11) {
        this.f26647a = i11;
        this.f26648b = list;
        this.f26649c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l lVar = (l) obj;
        switch (this.f26647a) {
            case 0:
                lVar.getClass();
                List list = this.f26648b;
                lVar.r(list.size(), null, new n(list, 9), new d(new a0(list, this.f26649c, 1), true, 802480018));
                break;
            case 1:
                lVar.getClass();
                List list2 = this.f26648b;
                lVar.r(list2.size(), null, new n(list2, 18), new d(new a0(list2, this.f26649c, 2), true, 802480018));
                break;
            default:
                lVar.getClass();
                List list3 = this.f26648b;
                if (list3 != null) {
                    l.s(lVar, list3.size(), null, new d(new ps.b(list3, this.f26649c, 1), true, -983584784), 6);
                } else {
                    l.q(lVar, null, ps.a.f35615c, 3);
                }
                break;
        }
        return Unit.f26487a;
    }
}
