package ev;

import android.content.Context;
import java.util.Map;
import kotlin.collections.p0;
import oz.m;
import ye.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mv.b f16480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ye.b f16482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ye.b f16483f;

    public a(Context context, String str, mv.b bVar) {
        str.getClass();
        bVar.getClass();
        this.f16478a = context;
        this.f16479b = str;
        this.f16480c = bVar;
        try {
            this.f16482e = a("prodAmplitude", "3a7436e9f6c51cd41018fd2668f3065f");
            ye.b bVarA = a("testAmplitude", "6696bb54b2c9cc63be8f447e7c07969b");
            bVarA.f().c(kf.a.DEBUG);
            this.f16483f = bVarA;
            sa0.a.f38953a.f("Amplitude successfully initialized", new Object[0]);
            this.f16481d = true;
        } catch (Throwable th2) {
            this.f16481d = false;
            this.f16482e = null;
            this.f16483f = null;
            sa0.a.f38953a.d(th2);
        }
    }

    public final ye.b a(String str, String str2) {
        p0 p0Var = p0.f26531a;
        c0 c0Var = new c0();
        c0Var.f45880a.add("carrier");
        c0Var.f45880a.add("lat_lng");
        c0Var.f45880a.add("ip_address");
        return new ye.b(new ye.g(str2, this.f16478a, str, c0Var, p0Var));
    }

    public final ye.b b() {
        if (this.f16481d) {
            return !this.f16480c.f30152c.getProduction() ? this.f16483f : this.f16482e;
        }
        return null;
    }

    public final void c(Map map) {
        map.getClass();
        if (!this.f16481d) {
            sa0.a.f38953a.i("Not tracking to Amplitude", new Object[0]);
            return;
        }
        m mVar = new m(5);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            sa0.a.f38953a.f("setting " + ((dv.a) entry.getKey()).c() + " to " + value, new Object[0]);
            String strC = ((dv.a) entry.getKey()).c();
            strC.getClass();
            value.getClass();
            mVar.z(pf.c.SET, strC, value);
        }
        try {
            ye.b bVarB = b();
            if (bVarB != null) {
                ye.b.h(bVarB, mVar);
            }
        } catch (Throwable th2) {
            this.f16481d = false;
            this.f16482e = null;
            this.f16483f = null;
            sa0.a.f38953a.d(th2);
        }
    }
}
