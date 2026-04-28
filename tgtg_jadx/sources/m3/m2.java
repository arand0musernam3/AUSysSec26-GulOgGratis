package m3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements a4.f, Iterable, KMappedMarker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29338b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29341e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29344h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HashMap f29346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q1.g0 f29347k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f29337a = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f29339c = new Object[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f29342f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f29345i = new ArrayList();

    public final int b(a aVar) {
        if (this.f29343g) {
            v.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!aVar.a()) {
            s1.a("Anchor refers to a group that was removed");
        }
        return aVar.f29174a;
    }

    public final void d() {
        this.f29346j = new HashMap();
    }

    public final l2 e() {
        if (this.f29343g) {
            com.braze.h2.b("Cannot read while a writer is pending");
            return null;
        }
        this.f29341e++;
        return new l2(this);
    }

    public final q2 g() {
        if (this.f29343g) {
            v.a("Cannot start a writer when another writer is pending");
        }
        if (this.f29341e > 0) {
            v.a("Cannot start a writer when a reader is pending");
        }
        this.f29343g = true;
        this.f29344h++;
        return new q2(this);
    }

    public final boolean h(a aVar) {
        int iD;
        return aVar.a() && (iD = o2.d(this.f29345i, aVar.f29174a, this.f29338b)) >= 0 && Intrinsics.areEqual(this.f29345i.get(iD), aVar);
    }

    public final q0 i(int i11) {
        int i12;
        ArrayList arrayList;
        int iD;
        HashMap map = this.f29346j;
        if (map != null) {
            if (this.f29343g) {
                v.a("use active SlotWriter to crate an anchor for location instead");
            }
            a aVar = (i11 < 0 || i11 >= (i12 = this.f29338b) || (iD = o2.d((arrayList = this.f29345i), i11, i12)) < 0) ? null : (a) arrayList.get(iD);
            if (aVar != null) {
                return (q0) map.get(aVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p0(this, 0, this.f29338b);
    }
}
