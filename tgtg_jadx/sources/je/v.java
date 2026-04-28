package je;

import java.util.ArrayList;
import java.util.List;
import qe.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements c, ke.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f25125b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f25126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ke.i f25127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ke.i f25128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ke.i f25129f;

    public v(re.b bVar, qe.o oVar) {
        this.f25124a = oVar.f36998d;
        this.f25126c = (y) oVar.f36996b;
        ke.i iVarG = oVar.f36997c.g();
        this.f25127d = iVarG;
        ke.i iVarG2 = ((pe.b) oVar.f36999e).g();
        this.f25128e = iVarG2;
        ke.i iVarG3 = ((pe.b) oVar.f37000f).g();
        this.f25129f = iVarG3;
        bVar.f(iVarG);
        bVar.f(iVarG2);
        bVar.f(iVarG3);
        iVarG.a(this);
        iVarG2.a(this);
        iVarG3.a(this);
    }

    @Override // ke.a
    public final void a() {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f25125b;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((ke.a) arrayList.get(i11)).a();
            i11++;
        }
    }

    public final void d(ke.a aVar) {
        this.f25125b.add(aVar);
    }

    @Override // je.c
    public final void c(List list, List list2) {
    }
}
