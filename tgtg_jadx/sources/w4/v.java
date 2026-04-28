package w4;

import java.util.ArrayList;
import kotlin.collections.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f43181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f43182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f43183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f43184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f43185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f43186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f43187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f43188k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f43189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f43190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v f43191o;

    public v(long j9, long j11, long j12, boolean z11, float f11, long j13, long j14, boolean z12, boolean z13, int i11, long j15) {
        this.f43178a = j9;
        this.f43179b = j11;
        this.f43180c = j12;
        this.f43181d = z11;
        this.f43182e = f11;
        this.f43183f = j13;
        this.f43184g = j14;
        this.f43185h = z12;
        this.f43186i = i11;
        this.f43187j = j15;
        this.l = 0L;
        this.f43189m = z13;
        this.f43190n = z13;
    }

    public final void a() {
        v vVar = this.f43191o;
        if (vVar == null) {
            this.f43189m = true;
            this.f43190n = true;
        } else if (vVar != null) {
            vVar.a();
        }
    }

    public final boolean b() {
        v vVar = this.f43191o;
        return vVar != null ? vVar.b() : this.f43189m || this.f43190n;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) u.j(this.f43178a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f43179b);
        sb2.append(", position=");
        sb2.append((Object) h4.b.h(this.f43180c));
        sb2.append(", pressed=");
        sb2.append(this.f43181d);
        sb2.append(", pressure=");
        sb2.append(this.f43182e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f43183f);
        sb2.append(", previousPosition=");
        sb2.append((Object) h4.b.h(this.f43184g));
        sb2.append(", previousPressed=");
        sb2.append(this.f43185h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        sb2.append((Object) d0.a(this.f43186i));
        sb2.append(", historical=");
        Object obj = this.f43188k;
        if (obj == null) {
            obj = n0.f26529a;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) h4.b.h(this.f43187j));
        sb2.append(')');
        return sb2.toString();
    }

    public v(long j9, long j11, long j12, boolean z11, float f11, long j13, long j14, boolean z12, int i11, ArrayList arrayList, long j15, long j16) {
        this(j9, j11, j12, z11, f11, j13, j14, z12, false, i11, j15);
        this.f43188k = arrayList;
        this.l = j16;
    }
}
