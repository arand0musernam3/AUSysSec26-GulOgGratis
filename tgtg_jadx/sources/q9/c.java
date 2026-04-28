package q9;

import j4.s;
import java.util.LinkedHashSet;
import w.z;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f36365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f36366b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f36367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f36368d;

    public c(z zVar) {
        this.f36365a = zVar;
        new LinkedHashSet();
        this.f36367c = new LinkedHashSet();
        this.f36368d = new LinkedHashSet();
    }

    public static void a(c cVar, e eVar) {
        cVar.getClass();
        eVar.getClass();
        if (cVar.f36367c.add(eVar)) {
            i iVar = cVar.f36366b;
            iVar.getClass();
            if (eVar.f36375g != null) {
                e40.a.h("Handler '", eVar, "' is already registered with a dispatcher");
                return;
            }
            iVar.f36384e.addFirst(eVar);
            eVar.f36375g = cVar;
            iVar.b();
        }
    }

    public final void b(h hVar) {
        if (this.f36368d.add(hVar)) {
            this.f36366b.a(this, hVar, -1);
        }
    }

    public final void c(o oVar, int i11) {
        if (i11 != 1 && i11 != 0) {
            i4.a.i(s.f(i11, "Unsupported priority value: "));
        } else if (this.f36368d.add(oVar)) {
            this.f36366b.a(this, oVar, i11);
        }
    }

    public final void d(h hVar, b bVar) {
        i iVar = this.f36366b;
        iVar.getClass();
        if (iVar.f36386g != 0) {
            return;
        }
        e eVarC = iVar.c(-1);
        iVar.f36385f = eVarC;
        iVar.f36386g = -1;
        iVar.f36387h = hVar;
        if (bVar != null) {
            if (eVarC != null) {
                eVarC.f36372d = new k(bVar, -1);
                eVarC.d(bVar);
            }
            a2 a2Var = iVar.f36380a;
            k kVar = new k(bVar, -1);
            a2Var.getClass();
            a2Var.k(null, kVar);
        }
    }
}
