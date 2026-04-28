package b2;

import java.util.ArrayList;
import kotlin.Unit;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f5558c;

    public /* synthetic */ f(ArrayList arrayList, b1 b1Var, int i11) {
        this.f5556a = i11;
        this.f5557b = arrayList;
        this.f5558c = b1Var;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        switch (this.f5556a) {
            case 0:
                j jVar = (j) obj;
                boolean z11 = jVar instanceof d;
                ArrayList arrayList = this.f5557b;
                if (z11) {
                    arrayList.add(jVar);
                } else if (jVar instanceof e) {
                    arrayList.remove(((e) jVar).f5555a);
                }
                this.f5558c.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                j jVar2 = (j) obj;
                boolean z12 = jVar2 instanceof h;
                ArrayList arrayList2 = this.f5557b;
                if (z12) {
                    arrayList2.add(jVar2);
                } else if (jVar2 instanceof i) {
                    arrayList2.remove(((i) jVar2).f5562a);
                }
                this.f5558c.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
            default:
                j jVar3 = (j) obj;
                boolean z13 = jVar3 instanceof n;
                ArrayList arrayList3 = this.f5557b;
                if (z13) {
                    arrayList3.add(jVar3);
                } else if (jVar3 instanceof o) {
                    arrayList3.remove(((o) jVar3).f5566a);
                } else if (jVar3 instanceof m) {
                    arrayList3.remove(((m) jVar3).f5564a);
                }
                this.f5558c.setValue(Boolean.valueOf(!arrayList3.isEmpty()));
                break;
        }
        return Unit.f26487a;
    }
}
