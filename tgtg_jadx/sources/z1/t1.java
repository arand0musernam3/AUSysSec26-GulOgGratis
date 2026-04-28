package z1;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f46692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o1 f46693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r1 f46694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q1 f46695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p1 f46696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z3 f46697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x0.e f46698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f46699h = 9205357640488583168L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.j f46700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a60.y f46701j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a60.y f46702k;
    public long l;

    public t1(f1 f1Var) {
        this.f46692a = f1Var;
        a60.y yVar = new a60.y();
        yVar.f940a = new ArrayList();
        this.f46701j = yVar;
        a60.y yVar2 = new a60.y();
        yVar2.f940a = new ArrayList();
        this.f46702k = yVar2;
        this.l = 0L;
    }

    public static void c(t1 t1Var, t4.b bVar, long j9, long j11, int i11) {
        if ((i11 & 4) != 0) {
            j11 = 0;
        }
        f1 f1Var = t1Var.f46692a;
        q1 q1Var = t1Var.f46695d;
        if (q1Var == null) {
            q1Var = new q1();
            q1Var.f46641b = null;
            q1Var.f46642c = LongCompanionObject.MAX_VALUE;
            q1Var.f46643d = false;
            t1Var.f46695d = q1Var;
        }
        q1Var.f46641b = bVar;
        q1Var.f46642c = j9;
        androidx.recyclerview.widget.j jVar = t1Var.f46700i;
        h2 h2Var = f1Var.f46497q;
        if (jVar == null) {
            t1Var.f46700i = new androidx.recyclerview.widget.j(h2Var, 2);
        } else {
            jVar.f3775c = h2Var;
            jVar.f3774b = j11;
        }
        q1Var.f46643d = false;
        t1Var.f46697f = q1Var;
    }

    public final void a() {
        o1 o1Var = this.f46693b;
        if (o1Var == null) {
            n1 n1Var = n1.NotInitialized;
            o1Var = new o1();
            o1Var.f46622b = n1Var;
            o1Var.f46623c = false;
            this.f46693b = o1Var;
        }
        o1Var.f46622b = n1.NotInitialized;
        o1Var.f46623c = false;
        this.f46697f = o1Var;
    }

    public final void b(t4.b bVar, long j9, androidx.recyclerview.widget.j jVar) {
        p1 p1Var = this.f46696e;
        if (p1Var == null) {
            p1Var = new p1();
            p1Var.f46633b = null;
            p1Var.f46634c = LongCompanionObject.MAX_VALUE;
            this.f46696e = p1Var;
        }
        p1Var.f46633b = bVar;
        p1Var.f46634c = j9;
        jVar.f3774b = 0L;
        this.f46697f = p1Var;
    }

    public final x0.e d() {
        x0.e eVar = this.f46698g;
        if (eVar != null) {
            return eVar;
        }
        i4.a.f("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(t4.b bVar, t4.a aVar, long j9) {
        f1 f1Var = this.f46692a;
        long jZ = b5.m.f(f1Var).z(0L);
        if (!h4.b.b(this.f46699h, 9205357640488583168L) && !h4.b.b(jZ, this.f46699h)) {
            this.l = h4.b.f(this.l, h4.b.e(jZ, this.f46699h));
        }
        this.f46699h = jZ;
        h2 h2Var = f1Var.f46497q;
        h2Var.getClass();
        le.v vVar = j1.f46557a;
        if (Math.abs(Float.intBitsToFloat((int) (h2Var == h2.Vertical ? j9 & 4294967295L : j9 >> 32))) > 2.0f) {
            z3.a(d(), bVar, f1Var.f46497q, aVar, this.f46701j, this.l);
            a60.y yVar = this.f46702k;
            ArrayList arrayList = yVar.f940a;
            if (arrayList.size() == 3) {
                int i11 = yVar.f941b;
                yVar.f941b = i11 + 1;
                arrayList.set(i11, new h4.b(j9));
            } else {
                arrayList.add(new h4.b(j9));
            }
            if (yVar.f941b == 3) {
                yVar.f941b = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((h4.b) arrayList.get(i12)).f21378a >> 32))));
            }
            float fG = (float) CollectionsKt.G(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((h4.b) arrayList.get(i13)).f21378a & 4294967295L))));
            }
            f1Var.W0(new n0((((long) Float.floatToRawIntBits((float) CollectionsKt.G(arrayList3))) & 4294967295L) | (((long) Float.floatToRawIntBits(fG)) << 32), true));
        }
    }

    public final void f(t4.b bVar, t4.b bVar2, t4.a aVar, long j9) {
        if (this.f46698g == null) {
            this.f46698g = new x0.e(1);
        }
        this.l = 0L;
        x0.e eVarD = d();
        f1 f1Var = this.f46692a;
        z3.a(eVarD, bVar, f1Var.f46497q, aVar, this.f46701j, this.l);
        long jE = h4.b.e(z3.f(bVar2, f1Var.f46497q, aVar), j9);
        if (((Boolean) f1Var.f46498r.invoke(new w4.d0(1))).booleanValue()) {
            this.f46699h = b5.m.f(f1Var).z(0L);
            f1Var.W0(new o0(jE));
        }
        a60.y yVar = this.f46702k;
        yVar.f941b = 0;
        yVar.f940a.clear();
    }
}
