package n9;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import m3.b1;
import m3.k0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f30731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f30733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f30734d;

    public b(Set set, Object obj, Set set2, b1 b1Var) {
        this.f30731a = set;
        this.f30732b = obj;
        this.f30733c = set2;
        this.f30734d = b1Var;
    }

    @Override // m3.k0
    public final void a() {
        Set set = this.f30731a;
        Object obj = this.f30732b;
        boolean zRemove = set.remove(obj);
        if (this.f30733c.contains(obj) || !zRemove) {
            return;
        }
        List list = (List) this.f30734d.getValue();
        if (!(list instanceof RandomAccess)) {
            Iterator it = CollectionsKt.f0(list).iterator();
            while (it.hasNext()) {
                ((f) it.next()).f30745a.invoke(obj);
            }
            return;
        }
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i11 = size - 1;
            ((f) list.get(size)).f30745a.invoke(obj);
            if (i11 < 0) {
                return;
            } else {
                size = i11;
            }
        }
    }
}
