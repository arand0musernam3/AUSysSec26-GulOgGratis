package d6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import z4.l1;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14458b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i11, ArrayList arrayList) {
        super(1);
        this.f14457a = i11;
        this.f14458b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14457a) {
            case 0:
                l1 l1Var = (l1) obj;
                ArrayList arrayList = this.f14458b;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    l1.o(l1Var, (m1) arrayList.get(i11), 0, 0);
                }
                break;
            case 1:
                l1 l1Var2 = (l1) obj;
                ArrayList arrayList2 = this.f14458b;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    int i12 = 0;
                    while (true) {
                        l1.o(l1Var2, (m1) arrayList2.get(i12), 0, 0);
                        if (i12 != size2) {
                            i12++;
                        }
                    }
                }
                break;
            case 2:
                List list = (List) obj;
                list.getClass();
                int iIntValue = ((Number) list.get(0)).intValue() + 1;
                IntRange intRange = new IntRange(iIntValue, ((Number) list.get(1)).intValue() - 1, 1);
                if (intRange.isEmpty()) {
                }
                break;
            case 3:
                l1 l1Var3 = (l1) obj;
                ArrayList arrayList3 = this.f14458b;
                int size3 = arrayList3.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    l1Var3.j((m1) arrayList3.get(i13), 0, 0, 0.0f);
                }
                break;
            default:
                l1 l1Var4 = (l1) obj;
                ArrayList arrayList4 = this.f14458b;
                int size4 = arrayList4.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    l1.p(l1Var4, (m1) arrayList4.get(i14), 0, 0);
                }
                break;
        }
        return Unit.f26487a;
    }
}
