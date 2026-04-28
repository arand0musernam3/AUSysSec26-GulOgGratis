package ib;

import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.h1;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f23741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23743c;

    public j0(Class cls) {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.f23741a = uuidRandomUUID;
        String string = ((UUID) this.f23741a).toString();
        string.getClass();
        this.f23742b = new qb.o(string, (g0) null, cls.getName(), (String) null, (h) null, (h) null, 0L, 0L, 0L, (e) null, 0, (a) null, 0L, 0L, 0L, 0L, false, (d0) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        this.f23743c = h1.d(cls.getName());
    }

    public k0 a() {
        k0 k0VarB = b();
        e eVar = ((qb.o) this.f23742b).f36837j;
        boolean z11 = !eVar.f23719i.isEmpty() || eVar.f23715e || eVar.f23713c || eVar.f23714d;
        qb.o oVar = (qb.o) this.f23742b;
        if (oVar.f36843q) {
            if (z11) {
                i4.a.f("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (oVar.f36834g > 0) {
                i4.a.f("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = oVar.f36850x;
        if (str == null) {
            List listSplit$default = StringsKt__StringsKt.split$default(oVar.f36830c, new String[]{"."}, false, 0, 6, null);
            String strX = listSplit$default.size() == 1 ? (String) listSplit$default.get(0) : (String) CollectionsKt.W(listSplit$default);
            if (strX.length() > 127) {
                strX = kotlin.text.b0.x(127, strX);
            }
            oVar.f36850x = strX;
        } else if (str.length() > 127) {
            ((qb.o) this.f23742b).f36850x = kotlin.text.b0.x(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.f23741a = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        qb.o oVar2 = (qb.o) this.f23742b;
        oVar2.getClass();
        this.f23742b = new qb.o(string, oVar2.f36829b, oVar2.f36830c, oVar2.f36831d, new h(oVar2.f36832e), new h(oVar2.f36833f), oVar2.f36834g, oVar2.f36835h, oVar2.f36836i, new e(oVar2.f36837j), oVar2.f36838k, oVar2.l, oVar2.f36839m, oVar2.f36840n, oVar2.f36841o, oVar2.f36842p, oVar2.f36843q, oVar2.f36844r, oVar2.f36845s, oVar2.f36847u, oVar2.f36848v, oVar2.f36849w, oVar2.f36850x, oVar2.f36851y, 524288);
        return k0VarB;
    }

    public abstract k0 b();

    public j0(lv.f fVar, lv.f fVar2, lv.f fVar3) {
        this.f23741a = fVar;
        this.f23742b = fVar2;
        this.f23743c = fVar3;
    }
}
