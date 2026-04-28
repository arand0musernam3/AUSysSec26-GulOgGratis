package gn;

import ao.p2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f20623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f20624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f20625d;

    public /* synthetic */ k(List list, Function1 function1, Function1 function12, int i11) {
        this.f20622a = i11;
        this.f20623b = list;
        this.f20624c = function1;
        this.f20625d = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f2.l lVar = (f2.l) obj;
        switch (this.f20622a) {
            case 0:
                lVar.getClass();
                List list = this.f20623b;
                lVar.r(list.size(), null, new cn.n(list, 4), new u3.d(new p(list, this.f20624c, this.f20625d, 0), true, 802480018));
                break;
            case 1:
                lVar.getClass();
                List list2 = this.f20623b;
                lVar.r(list2.size(), null, new cn.n(list2, 8), new u3.d(new p(list2, this.f20624c, this.f20625d, 1), true, 802480018));
                break;
            case 2:
                lVar.getClass();
                f2.l.q(lVar, null, lp.d.f28032q, 3);
                List list3 = this.f20623b;
                lVar.r(list3.size(), null, new cn.n(list3, 13), new u3.d(new p(list3, this.f20624c, this.f20625d, 4), true, 802480018));
                f2.l.q(lVar, null, lp.d.f28033r, 3);
                break;
            default:
                lVar.getClass();
                nv.a aVar = new nv.a(23);
                List list4 = this.f20623b;
                lVar.r(list4.size(), new p2(17, aVar, list4), new cn.n(list4, 19), new u3.d(new p(list4, this.f20624c, this.f20625d, 5), true, 802480018));
                break;
        }
        return Unit.f26487a;
    }
}
