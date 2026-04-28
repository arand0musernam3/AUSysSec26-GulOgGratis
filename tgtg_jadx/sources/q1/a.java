package q1;

import com.braze.h2;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f35708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f35709e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i11) {
        this(eVar.f35782c);
        this.f35708d = i11;
        switch (i11) {
            case 1:
                this.f35709e = eVar;
                this(eVar.f35782c);
                break;
            default:
                this.f35709e = eVar;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35706b < this.f35705a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objG;
        if (!hasNext()) {
            m0.i1.c();
            return null;
        }
        int i11 = this.f35706b;
        switch (this.f35708d) {
            case 0:
                objG = ((e) this.f35709e).g(i11);
                break;
            case 1:
                objG = ((e) this.f35709e).j(i11);
                break;
            default:
                objG = ((f) this.f35709e).f35750b[i11];
                break;
        }
        this.f35706b++;
        this.f35707c = true;
        return objG;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f35707c) {
            h2.b("Call next() before removing an element.");
            return;
        }
        int i11 = this.f35706b - 1;
        this.f35706b = i11;
        switch (this.f35708d) {
            case 0:
                ((e) this.f35709e).h(i11);
                break;
            case 1:
                ((e) this.f35709e).h(i11);
                break;
            default:
                ((f) this.f35709e).b(i11);
                break;
        }
        this.f35705a--;
        this.f35707c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f35751c);
        this.f35708d = 2;
        this.f35709e = fVar;
    }

    public a(int i11) {
        this.f35705a = i11;
    }
}
