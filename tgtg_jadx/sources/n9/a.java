package n9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import m3.b1;
import m3.k0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f30726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f30727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f30728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f30729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f30730e;

    public a(Object obj, Set set, Set set2, b1 b1Var, b1 b1Var2) {
        this.f30726a = obj;
        this.f30727b = set;
        this.f30728c = set2;
        this.f30729d = b1Var;
        this.f30730e = b1Var2;
    }

    @Override // m3.k0
    public final void a() {
        ArrayList arrayList;
        List list = (List) this.f30729d.getValue();
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((e) list.get(i11)).f30742b);
            }
        } else {
            arrayList = new ArrayList(e0.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((e) it.next()).f30742b);
            }
        }
        Object obj = this.f30726a;
        if (!(arrayList.contains(obj) ? false : this.f30727b.remove(obj)) || this.f30728c.contains(obj)) {
            return;
        }
        List list2 = (List) this.f30730e.getValue();
        if (!(list2 instanceof RandomAccess)) {
            Iterator it2 = CollectionsKt.f0(list2).iterator();
            while (it2.hasNext()) {
                ((f) it2.next()).f30745a.invoke(obj);
            }
            return;
        }
        int size2 = list2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i12 = size2 - 1;
            ((f) list2.get(size2)).f30745a.invoke(obj);
            if (i12 < 0) {
                return;
            } else {
                size2 = i12;
            }
        }
    }
}
