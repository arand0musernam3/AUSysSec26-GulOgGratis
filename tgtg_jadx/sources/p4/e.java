package p4;

import i4.x0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f34283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f34285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f34286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f34287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f34288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f34289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f34290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f34291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34292k;

    public e(String str, float f11, float f12, float f13, float f14, long j9, int i11, boolean z11, int i12) {
        str = (i12 & 1) != 0 ? "" : str;
        long j11 = (i12 & 32) != 0 ? i4.v.f23315h : j9;
        int i13 = (i12 & 64) != 0 ? 5 : i11;
        boolean z12 = (i12 & 128) != 0 ? false : z11;
        this.f34282a = str;
        this.f34283b = f11;
        this.f34284c = f12;
        this.f34285d = f13;
        this.f34286e = f14;
        this.f34287f = j11;
        this.f34288g = i13;
        this.f34289h = z12;
        ArrayList arrayList = new ArrayList();
        this.f34290i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f34291j = dVar;
        arrayList.add(dVar);
    }

    public static void a(e eVar, ArrayList arrayList, x0 x0Var) {
        if (eVar.f34292k) {
            y4.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((d) j4.s.d(1, eVar.f34290i)).f34280j.add(new k0("", arrayList, 0, x0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final f b() {
        if (this.f34292k) {
            y4.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f34290i;
            if (arrayList.size() <= 1) {
                d dVar = this.f34291j;
                f fVar = new f(this.f34282a, this.f34283b, this.f34284c, this.f34285d, this.f34286e, new g0(dVar.f34271a, dVar.f34272b, dVar.f34273c, dVar.f34274d, dVar.f34275e, dVar.f34276f, dVar.f34277g, dVar.f34278h, dVar.f34279i, dVar.f34280j), this.f34287f, this.f34288g, this.f34289h);
                this.f34292k = true;
                return fVar;
            }
            if (this.f34292k) {
                y4.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            d dVar2 = (d) arrayList.remove(arrayList.size() - 1);
            ((d) j4.s.d(1, arrayList)).f34280j.add(new g0(dVar2.f34271a, dVar2.f34272b, dVar2.f34273c, dVar2.f34274d, dVar2.f34275e, dVar2.f34276f, dVar2.f34277g, dVar2.f34278h, dVar2.f34279i, dVar2.f34280j));
        }
    }
}
