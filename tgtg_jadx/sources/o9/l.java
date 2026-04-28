package o9;

import java.util.List;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9.e f32145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f32146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f32147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u3.d f32148e = new u3.d(new lk.a(this, 25), true, -322904035);

    public l(Object obj, n9.e eVar, List list) {
        this.f32144a = obj;
        this.f32145b = eVar;
        this.f32146c = list;
        this.f32147d = c0.c(eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Intrinsics.areEqual(this.f32144a, lVar.f32144a) && Intrinsics.areEqual(this.f32145b, lVar.f32145b) && Intrinsics.areEqual(this.f32146c, lVar.f32146c) && Intrinsics.areEqual(this.f32147d, lVar.f32147d)) {
                return true;
            }
        }
        return false;
    }

    @Override // o9.d
    public final Function2 getContent() {
        return this.f32148e;
    }

    @Override // o9.d
    public final List getEntries() {
        return this.f32147d;
    }

    @Override // o9.d
    public final Object getKey() {
        return this.f32144a;
    }

    @Override // o9.d
    public final List getPreviousEntries() {
        return this.f32146c;
    }

    public final int hashCode() {
        return (this.f32147d.hashCode() * 31) + (this.f32146c.hashCode() * 31) + (this.f32145b.hashCode() * 31) + (this.f32144a.hashCode() * 31);
    }

    public final String toString() {
        return "SinglePaneScene(key=" + this.f32144a + ", entry=" + this.f32145b + ", previousEntries=" + this.f32146c + ", entries=" + this.f32147d + ')';
    }
}
