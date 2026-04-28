package f2;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.b1;
import z4.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f17178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f17180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f17181e;

    public /* synthetic */ r(b1 b1Var, ArrayList arrayList, List list, boolean z11, int i11) {
        this.f17177a = i11;
        this.f17178b = b1Var;
        this.f17179c = arrayList;
        this.f17180d = list;
        this.f17181e = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        l1 l1Var = (l1) obj;
        switch (this.f17177a) {
            case 0:
                l1Var.f47177a = true;
                ArrayList arrayList = this.f17179c;
                int size = arrayList.size();
                int i11 = 0;
                while (true) {
                    boolean z11 = this.f17181e;
                    if (i11 >= size) {
                        List list = this.f17180d;
                        int size2 = list.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            ((t) list.get(i12)).m(l1Var, z11);
                        }
                        l1Var.f47177a = false;
                        this.f17178b.getValue();
                    } else {
                        ((t) arrayList.get(i11)).m(l1Var, z11);
                        i11++;
                    }
                    break;
                }
                break;
            default:
                l1Var.f47177a = true;
                ArrayList arrayList2 = this.f17179c;
                int size3 = arrayList2.size();
                int i13 = 0;
                while (true) {
                    boolean z12 = this.f17181e;
                    if (i13 >= size3) {
                        List list2 = this.f17180d;
                        int size4 = list2.size();
                        for (int i14 = 0; i14 < size4; i14++) {
                            ((g2.s) list2.get(i14)).a(l1Var, z12);
                        }
                        l1Var.f47177a = false;
                        this.f17178b.getValue();
                    } else {
                        ((g2.s) arrayList2.get(i13)).a(l1Var, z12);
                        i13++;
                    }
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
