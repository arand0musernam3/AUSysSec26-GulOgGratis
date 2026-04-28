package s3;

import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import o80.h;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements KMutableIterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f38826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f38827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38829h;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(c cVar) {
        Object obj = cVar.f38823b;
        r3.d dVar = cVar.f38825d;
        super(obj, dVar);
        this.f38826e = cVar;
        this.f38829h = dVar.f37587e;
    }

    @Override // o80.h, java.util.Iterator
    public final Object next() {
        if (this.f38826e.f38825d.f37587e != this.f38829h) {
            org.bouncycastle.jce.provider.a.o();
            return null;
        }
        Object next = super.next();
        this.f38827f = next;
        this.f38828g = true;
        return next;
    }

    @Override // o80.h, java.util.Iterator
    public final void remove() {
        if (!this.f38828g) {
            y.e();
            return;
        }
        Object obj = this.f38827f;
        c cVar = this.f38826e;
        TypeIntrinsics.asMutableCollection(cVar).remove(obj);
        this.f38827f = null;
        this.f38828g = false;
        this.f38829h = cVar.f38825d.f37587e;
        this.f32120c--;
    }
}
