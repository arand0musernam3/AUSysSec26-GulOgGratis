package a3;

import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f602b;

    public /* synthetic */ v2(int i11, ArrayList arrayList) {
        this.f601a = i11;
        this.f602b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f601a) {
            case 0:
                z4.l1 l1Var = (z4.l1) obj;
                ArrayList arrayList = this.f602b;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    l1Var.j((z4.m1) arrayList.get(i11), 0, 0, 0.0f);
                }
                return Unit.f26487a;
            case 1:
                z4.l1 l1Var2 = (z4.l1) obj;
                ArrayList arrayList2 = this.f602b;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    i2.g gVar = (i2.g) arrayList2.get(i12);
                    List list = gVar.f22847b;
                    boolean z11 = gVar.f22852g;
                    if (gVar.f22856k == Integer.MIN_VALUE) {
                        c2.a.a("position() should be called first");
                    }
                    int size3 = list.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        z4.m1 m1Var = (z4.m1) list.get(i13);
                        int[] iArr = gVar.f22854i;
                        int i14 = i13 * 2;
                        int i15 = i12;
                        long jD = z5.j.d((((long) iArr[i14 + 1]) & 4294967295L) | (((long) iArr[i14]) << 32), gVar.f22848c);
                        if (z11) {
                            z4.l1.w(l1Var2, m1Var, jD);
                        } else {
                            z4.l1.q(l1Var2, m1Var, jD);
                        }
                        i13++;
                        i12 = i15;
                    }
                    i12++;
                }
                return Unit.f26487a;
            case 2:
                z4.l1 l1Var3 = (z4.l1) obj;
                ArrayList arrayList3 = this.f602b;
                int size4 = arrayList3.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    z4.l1.o(l1Var3, (z4.m1) arrayList3.get(i16), 0, 0);
                }
                return Unit.f26487a;
            case 3:
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                ArrayList arrayList4 = this.f602b;
                f2.l.s(lVar, arrayList4.size(), new v2(4, arrayList4), new u3.d(new z1(arrayList4, 12), true, 1807102470), 4);
                return Unit.f26487a;
            case 4:
                return ((BasketItem) this.f602b.get(((Integer) obj).intValue())).getItemId();
            default:
                return ((wi.c) this.f602b.get(((Integer) obj).intValue())).a();
        }
    }
}
