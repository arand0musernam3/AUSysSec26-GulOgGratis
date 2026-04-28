package v2;

import java.util.List;
import kotlin.collections.d0;
import m3.k1;
import m5.k0;
import m5.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f, y3.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f41932b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f41933c = new e(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41934a;

    public /* synthetic */ e(int i11) {
        this.f41934a = i11;
    }

    @Override // y3.i
    public Object e(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        Object obj4 = list.get(2);
        Object obj5 = list.get(3);
        obj2.getClass();
        String str = (String) obj2;
        obj3.getClass();
        int iIntValue = ((Integer) obj3).intValue();
        obj4.getClass();
        long jB = k0.b(iIntValue, ((Integer) obj4).intValue());
        obj5.getClass();
        obj5.getClass();
        List list2 = (List) obj5;
        Object obj6 = list2.get(0);
        Object obj7 = list2.get(1);
        y2.d dVar = obj6 != null ? (y2.d) y2.d.f45375i.e(obj6) : null;
        obj7.getClass();
        return new h(str, jB, new ub.a(dVar, (y2.e) k.f41942a.e(obj7)));
    }

    @Override // y3.i
    public Object i(y3.a aVar, Object obj) {
        List listH;
        h hVar = (h) obj;
        String string = hVar.b().f41928c.toString();
        long j9 = hVar.b().f41929d;
        int i11 = t0.f29649c;
        Integer numValueOf = Integer.valueOf((int) (j9 >> 32));
        Integer numValueOf2 = Integer.valueOf((int) (hVar.b().f41929d & 4294967295L));
        ub.a aVar2 = hVar.f41935a;
        y2.d dVar = (y2.d) ((k1) aVar2.f40982c).getValue();
        if (dVar != null) {
            Integer numValueOf3 = Integer.valueOf(dVar.f45376a);
            String str = dVar.f45377b;
            String str2 = dVar.f45378c;
            long j11 = dVar.f45379d;
            int i12 = t0.f29649c;
            Integer numValueOf4 = Integer.valueOf((int) (j11 >> 32));
            Integer numValueOf5 = Integer.valueOf((int) (j11 & 4294967295L));
            long j12 = dVar.f45380e;
            listH = d0.h(numValueOf3, str, str2, numValueOf4, numValueOf5, Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) (j12 & 4294967295L)), Long.valueOf(dVar.f45381f));
        } else {
            listH = null;
        }
        return d0.h(string, numValueOf, numValueOf2, d0.h(listH, k.f41942a.i(aVar, (y2.e) aVar2.f40981b)));
    }

    public String toString() {
        switch (this.f41934a) {
            case 0:
                return "TextFieldLineLimits.SingleLine";
            default:
                return super.toString();
        }
    }
}
