package o6;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class g implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f32006d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32009g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f32003a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32004b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32005c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f32007e = f.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32010h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f32011i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f32012j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f32013k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public g(t tVar) {
        this.f32006d = tVar;
    }

    @Override // o6.e
    public final void a(e eVar) {
        ArrayList<g> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).f32012j) {
                return;
            }
        }
        this.f32005c = true;
        t tVar = this.f32003a;
        if (tVar != null) {
            tVar.a(this);
        }
        if (this.f32004b) {
            this.f32006d.a(this);
            return;
        }
        g gVar = null;
        int i11 = 0;
        for (g gVar2 : arrayList) {
            if (!(gVar2 instanceof h)) {
                i11++;
                gVar = gVar2;
            }
        }
        if (gVar != null && i11 == 1 && gVar.f32012j) {
            h hVar = this.f32011i;
            if (hVar != null) {
                if (!hVar.f32012j) {
                    return;
                } else {
                    this.f32008f = this.f32010h * hVar.f32009g;
                }
            }
            d(gVar.f32009g + this.f32008f);
        }
        t tVar2 = this.f32003a;
        if (tVar2 != null) {
            tVar2.a(this);
        }
    }

    public final void b(t tVar) {
        this.f32013k.add(tVar);
        if (this.f32012j) {
            tVar.a(tVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.f32013k.clear();
        this.f32012j = false;
        this.f32009g = 0;
        this.f32005c = false;
        this.f32004b = false;
    }

    public void d(int i11) {
        if (this.f32012j) {
            return;
        }
        this.f32012j = true;
        this.f32009g = i11;
        for (e eVar : this.f32013k) {
            eVar.a(eVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32006d.f32030b.f30596l0);
        sb2.append(":");
        sb2.append(this.f32007e);
        sb2.append("(");
        sb2.append(this.f32012j ? Integer.valueOf(this.f32009g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.l.size());
        sb2.append(":d=");
        sb2.append(this.f32013k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
