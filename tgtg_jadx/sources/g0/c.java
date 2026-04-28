package g0;

import a3.n2;
import a4.h;
import android.os.Trace;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import m3.e2;
import m3.f2;
import m3.j;
import q1.i1;
import q1.j1;
import q1.u0;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f17998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f18001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f18003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f18004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f18005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f18006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f18007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f18008k;

    public c(e eVar, q2 q2Var) {
        this.f17999b = eVar;
        this.f17998a = q2Var;
        int i11 = 2;
        this.f18000c = s70.a.a(new a0.b(eVar, this, 1, i11));
        this.f18001d = s70.a.a(new a0.b(eVar, this, 2, i11));
        this.f18004g = new a0.b(eVar, this, 4, i11);
        this.f18005h = new a0.b(eVar, this, 5, i11);
        this.f18006i = new a0.b(eVar, this, 6, i11);
        this.f18007j = new a0.b(eVar, this, 7, i11);
        this.f18008k = new a0.b(eVar, this, 8, i11);
        this.f18002e = s70.a.a(new a0.b(eVar, this, 3, i11));
        this.f18003f = s70.a.a(new a0.b(eVar, this, 0, i11));
    }

    public static final boolean f(f2 f2Var, o3.e eVar) {
        Object[] objArr = eVar.f31830a;
        int i11 = eVar.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            e2 e2Var = ((f2) objArr[i12]).f29279a;
            if (e2Var instanceof u3.g) {
                o3.e eVar2 = ((u3.g) e2Var).f40656b;
                if (eVar2.j(f2Var) || f(f2Var, eVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a() {
        this.f17998a = null;
        this.f17999b = null;
        o3.e eVar = (o3.e) this.f18000c;
        eVar.g();
        ((u0) this.f18001d).e();
        this.f18002e = eVar;
        ((o3.e) this.f18003f).g();
        ((o3.e) this.f18004g).g();
        this.f18005h = null;
        this.f18006i = null;
        this.f18007j = null;
    }

    public void b() {
        Set set = (Set) this.f17998a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                e2 e2Var = (e2) it.next();
                it.remove();
                e2Var.b();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void c() {
        o3.e eVar = (o3.e) this.f18000c;
        o3.e eVar2 = (o3.e) this.f18003f;
        Set set = (Set) this.f17998a;
        if (set == null) {
            return;
        }
        this.f18008k = null;
        if (eVar2.f31832c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                u0 u0Var = (u0) this.f18005h;
                int i11 = eVar2.f31832c;
                while (true) {
                    i11--;
                    if (-1 >= i11) {
                        break;
                    }
                    Object obj = eVar2.f31830a[i11];
                    try {
                        if (obj instanceof f2) {
                            e2 e2Var = ((f2) obj).f29279a;
                            set.remove(e2Var);
                            e2Var.c();
                        }
                        if (obj instanceof j) {
                            if (u0Var == null || !u0Var.a(obj)) {
                                ((j) obj).b();
                            } else {
                                ((j) obj).a();
                            }
                        }
                    } catch (Throwable th2) {
                        a4.g gVar = (a4.g) this.f17999b;
                        if (gVar != null) {
                            a4.e.b(th2, new n2(2, (h) gVar, obj));
                        }
                        throw th2;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (eVar.f31832c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.f17998a;
                if (set2 != null) {
                    Object[] objArr = eVar.f31830a;
                    int i12 = eVar.f31832c;
                    for (int i13 = 0; i13 < i12; i13++) {
                        f2 f2Var = (f2) objArr[i13];
                        e2 e2Var2 = f2Var.f29279a;
                        set2.remove(e2Var2);
                        try {
                            e2Var2.d();
                        } catch (Throwable th3) {
                            a4.g gVar2 = (a4.g) this.f17999b;
                            if (gVar2 != null) {
                                a4.e.b(th3, new n2(2, (h) gVar2, f2Var));
                            }
                            throw th3;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void d() {
        o3.e eVar = (o3.e) this.f18004g;
        if (eVar.f31832c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eVar.f31830a;
                int i11 = eVar.f31832c;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((Function0) objArr[i12]).invoke();
                }
                eVar.g();
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    public void e(f2 f2Var) {
        o3.e eVar = (o3.e) this.f18000c;
        if (!((u0) this.f18001d).a(f2Var)) {
            i1 i1Var = (i1) this.f18008k;
            if (i1Var == null || !i1Var.a(f2Var)) {
                ((o3.e) this.f18003f).b(f2Var);
                return;
            }
            return;
        }
        ((u0) this.f18001d).l(f2Var);
        if (!((o3.e) this.f18002e).j(f2Var) && !eVar.j(f2Var)) {
            f(f2Var, eVar);
        }
        Set set = (Set) this.f17998a;
        if (set == null) {
            return;
        }
        set.add(f2Var.f29279a);
    }

    public void g(Set set, h hVar) {
        a();
        this.f17998a = set;
        this.f17999b = hVar;
    }

    public c() {
        o3.e eVar = new o3.e(new f2[16], 0);
        this.f18000c = eVar;
        u0 u0Var = j1.f35777a;
        this.f18001d = new u0();
        this.f18002e = eVar;
        this.f18003f = new o3.e(new Object[16], 0);
        this.f18004g = new o3.e(new Function0[16], 0);
    }
}
