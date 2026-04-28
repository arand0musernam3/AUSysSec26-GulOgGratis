package q1;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35818a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35819b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o80.j f35820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f35821d;

    public r0(w0 w0Var) {
        this.f35821d = w0Var;
        this.f35820c = o80.l.a(new v0(w0Var, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f35818a) {
        }
        return this.f35820c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f35818a) {
        }
        return this.f35820c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f35818a) {
            case 0:
                int i11 = this.f35819b;
                if (i11 != -1) {
                    ((s0) this.f35821d).f35828b.h(i11);
                    this.f35819b = -1;
                }
                break;
            default:
                int i12 = this.f35819b;
                if (i12 != -1) {
                    ((w0) this.f35821d).f35852b.m(i12);
                    this.f35819b = -1;
                }
                break;
        }
    }

    public r0(s0 s0Var) {
        this.f35821d = s0Var;
        this.f35820c = o80.l.a(new q0(s0Var, this, null));
    }
}
