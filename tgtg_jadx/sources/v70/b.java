package v70;

import com.braze.h2;
import java.util.AbstractList;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMutableListIterator;
import m0.i1;
import z3.r;
import z3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ListIterator, KMutableListIterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42023b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f42026e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42022a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42024c = -1;

    public b(r rVar, int i11) {
        this.f42026e = rVar;
        this.f42023b = i11 - 1;
        this.f42025d = s.d(rVar);
    }

    public void a() {
        if (((AbstractList) ((c) this.f42026e).f42031e).modCount == this.f42025d) {
            return;
        }
        org.bouncycastle.jce.provider.a.o();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f42022a) {
            case 0:
                a();
                c cVar = (c) this.f42026e;
                int i11 = this.f42023b;
                this.f42023b = i11 + 1;
                cVar.add(i11, obj);
                this.f42024c = -1;
                this.f42025d = ((AbstractList) cVar).modCount;
                break;
            case 1:
                b();
                e eVar = (e) this.f42026e;
                int i12 = this.f42023b;
                this.f42023b = i12 + 1;
                eVar.add(i12, obj);
                this.f42024c = -1;
                this.f42025d = ((AbstractList) eVar).modCount;
                break;
            default:
                d();
                r rVar = (r) this.f42026e;
                rVar.add(this.f42023b + 1, obj);
                this.f42024c = -1;
                this.f42023b++;
                this.f42025d = s.d(rVar);
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((e) this.f42026e)).modCount == this.f42025d) {
            return;
        }
        org.bouncycastle.jce.provider.a.o();
    }

    public void d() {
        if (s.d((r) this.f42026e) == this.f42025d) {
            return;
        }
        org.bouncycastle.jce.provider.a.o();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f42022a) {
            case 0:
                return this.f42023b < ((c) this.f42026e).f42029c;
            case 1:
                return this.f42023b < ((e) this.f42026e).f42035b;
            default:
                return this.f42023b < ((r) this.f42026e).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f42022a) {
            case 0:
                if (this.f42023b > 0) {
                }
                break;
            case 1:
                if (this.f42023b > 0) {
                }
                break;
            default:
                if (this.f42023b >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f42022a) {
            case 0:
                a();
                int i11 = this.f42023b;
                c cVar = (c) this.f42026e;
                if (i11 >= cVar.f42029c) {
                    i1.c();
                    return null;
                }
                this.f42023b = i11 + 1;
                this.f42024c = i11;
                return cVar.f42027a[cVar.f42028b + i11];
            case 1:
                b();
                int i12 = this.f42023b;
                e eVar = (e) this.f42026e;
                if (i12 >= eVar.f42035b) {
                    i1.c();
                    return null;
                }
                this.f42023b = i12 + 1;
                this.f42024c = i12;
                return eVar.f42034a[i12];
            default:
                d();
                int i13 = this.f42023b + 1;
                this.f42024c = i13;
                r rVar = (r) this.f42026e;
                s.a(i13, rVar.size());
                Object obj = rVar.get(i13);
                this.f42023b = i13;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f42022a) {
            case 0:
                return this.f42023b;
            case 1:
                return this.f42023b;
            default:
                return this.f42023b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f42022a) {
            case 0:
                a();
                int i11 = this.f42023b;
                if (i11 <= 0) {
                    i1.c();
                    return null;
                }
                int i12 = i11 - 1;
                this.f42023b = i12;
                this.f42024c = i12;
                c cVar = (c) this.f42026e;
                return cVar.f42027a[cVar.f42028b + i12];
            case 1:
                b();
                int i13 = this.f42023b;
                if (i13 <= 0) {
                    i1.c();
                    return null;
                }
                int i14 = i13 - 1;
                this.f42023b = i14;
                this.f42024c = i14;
                return ((e) this.f42026e).f42034a[i14];
            default:
                d();
                int i15 = this.f42023b;
                r rVar = (r) this.f42026e;
                s.a(i15, rVar.size());
                int i16 = this.f42023b;
                this.f42024c = i16;
                this.f42023b--;
                return rVar.get(i16);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i11;
        switch (this.f42022a) {
            case 0:
                i11 = this.f42023b;
                break;
            case 1:
                i11 = this.f42023b;
                break;
            default:
                return this.f42023b;
        }
        return i11 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f42022a) {
            case 0:
                c cVar = (c) this.f42026e;
                a();
                int i11 = this.f42024c;
                if (i11 == -1) {
                    h2.b("Call next() or previous() before removing element from the iterator.");
                } else {
                    cVar.d(i11);
                    this.f42023b = this.f42024c;
                    this.f42024c = -1;
                    this.f42025d = ((AbstractList) cVar).modCount;
                }
                break;
            case 1:
                e eVar = (e) this.f42026e;
                b();
                int i12 = this.f42024c;
                if (i12 == -1) {
                    h2.b("Call next() or previous() before removing element from the iterator.");
                } else {
                    eVar.d(i12);
                    this.f42023b = this.f42024c;
                    this.f42024c = -1;
                    this.f42025d = ((AbstractList) eVar).modCount;
                }
                break;
            default:
                d();
                r rVar = (r) this.f42026e;
                rVar.remove(this.f42024c);
                this.f42023b--;
                this.f42024c = -1;
                this.f42025d = s.d(rVar);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f42022a) {
            case 0:
                a();
                int i11 = this.f42024c;
                if (i11 == -1) {
                    h2.b("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((c) this.f42026e).set(i11, obj);
                }
                break;
            case 1:
                b();
                int i12 = this.f42024c;
                if (i12 == -1) {
                    h2.b("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((e) this.f42026e).set(i12, obj);
                }
                break;
            default:
                r rVar = (r) this.f42026e;
                d();
                int i13 = this.f42024c;
                if (i13 < 0) {
                    h2.b("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                } else {
                    rVar.set(i13, obj);
                    this.f42025d = s.d(rVar);
                }
                break;
        }
    }

    public b(e eVar, int i11) {
        this.f42026e = eVar;
        this.f42023b = i11;
        this.f42025d = ((AbstractList) eVar).modCount;
    }

    public b(c cVar, int i11) {
        this.f42026e = cVar;
        this.f42023b = i11;
        this.f42025d = ((AbstractList) cVar).modCount;
    }
}
