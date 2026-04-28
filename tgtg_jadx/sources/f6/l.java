package f6;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a50.c f17405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17406c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17407d = new ArrayList();

    public final d a() {
        int i11 = this.f17406c;
        this.f17406c = i11 + 1;
        ArrayList arrayList = this.f17407d;
        d dVar = (d) CollectionsKt.Q(i11, arrayList);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(Integer.valueOf(this.f17406c));
        arrayList.add(dVar2);
        return dVar2;
    }

    public final a50.c b() {
        a50.c cVar = this.f17405b;
        if (cVar != null) {
            return cVar;
        }
        a50.c cVar2 = new a50.c(this, 19);
        this.f17405b = cVar2;
        return cVar2;
    }

    public final void c() {
        this.f17399a.f24739e.clear();
        this.f17406c = 0;
    }
}
