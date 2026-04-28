package o80;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f32108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f32110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Sequence f32111e;

    public e(i iVar) {
        this.f32107a = 2;
        this.f32111e = iVar;
        this.f32108b = ((Sequence) iVar.f32124c).iterator();
        this.f32109c = -1;
    }

    public void a() {
        Object next;
        f fVar = (f) this.f32111e;
        do {
            Iterator it = this.f32108b;
            if (!it.hasNext()) {
                this.f32109c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) fVar.f32114c.invoke(next)).booleanValue() != fVar.f32113b);
        this.f32110d = next;
        this.f32109c = 1;
    }

    public void b() {
        Iterator it = this.f32108b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((i) this.f32111e).f32123b.invoke(next)).booleanValue()) {
                this.f32109c = 1;
                this.f32110d = next;
                return;
            }
        }
        this.f32109c = 0;
    }

    public boolean d() {
        Iterator it;
        Iterator it2 = (Iterator) this.f32110d;
        if (it2 != null && it2.hasNext()) {
            this.f32109c = 1;
            return true;
        }
        do {
            Iterator it3 = this.f32108b;
            if (!it3.hasNext()) {
                this.f32109c = 2;
                this.f32110d = null;
                return false;
            }
            Object next = it3.next();
            g gVar = (g) this.f32111e;
            it = (Iterator) gVar.f32117c.invoke(gVar.f32116b.invoke(next));
        } while (!it.hasNext());
        this.f32110d = it;
        this.f32109c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f32107a) {
            case 0:
                if (this.f32109c == -1) {
                    a();
                }
                return this.f32109c == 1;
            case 1:
                int i11 = this.f32109c;
                if (i11 == 1) {
                    return true;
                }
                if (i11 == 2) {
                    return false;
                }
                return d();
            default:
                if (this.f32109c == -1) {
                    b();
                }
                return this.f32109c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f32107a) {
            case 0:
                if (this.f32109c == -1) {
                    a();
                }
                if (this.f32109c == 0) {
                    i1.c();
                } else {
                    Object obj = this.f32110d;
                    this.f32110d = null;
                    this.f32109c = -1;
                }
                break;
            case 1:
                int i11 = this.f32109c;
                if (i11 == 2) {
                    i1.c();
                } else if (i11 == 0 && !d()) {
                    i1.c();
                } else {
                    this.f32109c = 0;
                    Iterator it = (Iterator) this.f32110d;
                    it.getClass();
                }
                break;
            default:
                if (this.f32109c == -1) {
                    b();
                }
                if (this.f32109c == 0) {
                    i1.c();
                } else {
                    Object obj2 = this.f32110d;
                    this.f32110d = null;
                    this.f32109c = -1;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f32107a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(g gVar) {
        this.f32107a = 1;
        this.f32111e = gVar;
        this.f32108b = gVar.f32115a.iterator();
    }

    public e(f fVar) {
        this.f32107a = 0;
        this.f32111e = fVar;
        this.f32108b = fVar.f32112a.iterator();
        this.f32109c = -1;
    }
}
