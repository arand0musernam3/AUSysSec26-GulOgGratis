package fd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f17555e;

    public d(e eVar) {
        this.f17551a = CollectionsKt.t0(eVar.f17556a);
        this.f17552b = CollectionsKt.t0(eVar.f17557b);
        this.f17553c = CollectionsKt.t0(eVar.f17558c);
        List list = (List) eVar.f17561f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new cw.b((Pair) it.next(), 13));
        }
        this.f17554d = arrayList;
        List list2 = (List) eVar.f17562g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new c((id.k) it2.next(), 1));
        }
        this.f17555e = arrayList2;
    }

    public void a(kd.h hVar, KClass kClass) {
        this.f17554d.add(new ep.l(6, hVar, kClass));
    }

    public void b(nd.a aVar, KClass kClass) {
        this.f17552b.add(new Pair(aVar, kClass));
    }

    public void c(tc.g gVar, Class cls) {
        this.f17554d.add(new Pair(gVar, cls));
    }

    public void d(wc.a aVar, Class cls) {
        this.f17552b.add(new Pair(aVar, cls));
    }

    public d(pc.a aVar) {
        this.f17551a = CollectionsKt.t0(aVar.f34636a);
        this.f17552b = CollectionsKt.t0(aVar.f34637b);
        this.f17553c = CollectionsKt.t0(aVar.f34638c);
        this.f17554d = CollectionsKt.t0(aVar.f34639d);
        this.f17555e = CollectionsKt.t0(aVar.f34640e);
    }
}
