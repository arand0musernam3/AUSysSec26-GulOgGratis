package e7;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import qz.z;
import wa.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15806c;

    public a(List list, int i11, Throwable th2) {
        this.f15804a = 2;
        pd.g.m(list, "initCallbacks cannot be null");
        this.f15806c = new ArrayList(list);
        this.f15805b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15804a) {
            case 0:
                t10.c cVar = (t10.c) this.f15806c;
                int i11 = this.f15805b;
                w6.a aVar = (w6.a) cVar.f39648a;
                if (aVar != null) {
                    aVar.i(i11);
                }
                break;
            case 1:
                ((h20.h) this.f15806c).j(this.f15805b);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) this.f15806c;
                int size = arrayList.size();
                int i12 = 0;
                if (this.f15805b == 1) {
                    while (i12 < size) {
                        ((l8.h) arrayList.get(i12)).b();
                        i12++;
                    }
                } else {
                    while (i12 < size) {
                        ((l8.h) arrayList.get(i12)).a();
                        i12++;
                    }
                }
                break;
            case 3:
                ((p20.e) this.f15806c).f34159h.o(this.f15805b, 4);
                break;
            case 4:
                ((z) this.f15806c).d(this.f15805b);
                break;
            case 5:
                ((RecyclerView) this.f15806c).m0(this.f15805b);
                break;
            default:
                ((x10.i) this.f15806c).f43664h.m0(this.f15805b);
                break;
        }
    }

    public a(int i11, m mVar) {
        this.f15804a = 5;
        this.f15805b = i11;
        this.f15806c = mVar;
    }

    public /* synthetic */ a(Object obj, int i11, int i12) {
        this.f15804a = i12;
        this.f15806c = obj;
        this.f15805b = i11;
    }

    public a(p20.e eVar) {
        this.f15804a = 3;
        this.f15806c = eVar;
        this.f15805b = -1;
    }
}
