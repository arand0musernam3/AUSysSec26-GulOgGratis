package y00;

import android.os.Bundle;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f44959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f44960c;

    public /* synthetic */ m2(t2 t2Var, Bundle bundle, int i11) {
        this.f44958a = i11;
        this.f44960c = bundle;
        this.f44959b = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44958a) {
            case 0:
                t2 t2Var = this.f44959b;
                t2Var.p();
                t2Var.q();
                Bundle bundle = this.f44960c;
                String string = bundle.getString("name");
                com.google.android.gms.common.internal.i0.e(string);
                n1 n1Var = (n1) t2Var.f21216b;
                if (!n1Var.e()) {
                    w0 w0Var = n1Var.f44987f;
                    n1.m(w0Var);
                    w0Var.f45267o.a("Conditional property not cleared since app measurement is disabled");
                } else {
                    o4 o4Var = new o4(0L, null, string, "");
                    try {
                        r4 r4Var = n1Var.f44990i;
                        n1.k(r4Var);
                        bundle.getString("app_id");
                        n1Var.p().I(new e(bundle.getString("app_id"), "", o4Var, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), r4Var.X(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            default:
                t2 t2Var2 = this.f44959b;
                u6.f fVar = t2Var2.f45167w;
                n1 n1Var2 = (n1) t2Var2.f21216b;
                Bundle bundle2 = this.f44960c;
                if (!bundle2.isEmpty()) {
                    e1 e1Var = n1Var2.f44986e;
                    r4 r4Var2 = n1Var2.f44990i;
                    g gVar = n1Var2.f44985d;
                    w0 w0Var2 = n1Var2.f44987f;
                    n1.k(e1Var);
                    Bundle bundle3 = new Bundle(e1Var.f44729z.c0());
                    for (String str : bundle2.keySet()) {
                        Object obj = bundle2.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            n1.k(r4Var2);
                            if (r4.C0(obj)) {
                                r4.H(fVar, null, 27, null, null, 0);
                            }
                            n1.m(w0Var2);
                            w0Var2.l.c("Invalid default event parameter type. Name, value", str, obj);
                        } else if (r4.U(str)) {
                            n1.m(w0Var2);
                            w0Var2.l.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle3.remove(str);
                        } else {
                            n1.k(r4Var2);
                            gVar.getClass();
                            if (r4Var2.t("param", str, 500, obj)) {
                                r4Var2.G(bundle3, str, obj);
                            }
                        }
                    }
                    n1.k(r4Var2);
                    r4 r4Var3 = ((n1) gVar.f21216b).f44990i;
                    n1.k(r4Var3);
                    int i11 = r4Var3.a0(201500000) ? 100 : 25;
                    if (bundle3.size() > i11) {
                        int i12 = 0;
                        for (String str2 : new TreeSet(bundle3.keySet())) {
                            i12++;
                            if (i12 > i11) {
                                bundle3.remove(str2);
                            }
                        }
                        n1.k(r4Var2);
                        r4.H(fVar, null, 26, null, null, 0);
                        n1.m(w0Var2);
                        w0Var2.l.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle2 = bundle3;
                }
                e1 e1Var2 = n1Var2.f44986e;
                n1.k(e1Var2);
                e1Var2.f44729z.d0(bundle2);
                n1Var2.p().u(bundle2);
                break;
        }
    }
}
