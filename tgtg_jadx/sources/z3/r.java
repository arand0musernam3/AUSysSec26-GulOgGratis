package z3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import m3.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable, d0, List, RandomAccess, KMutableList {

    @NotNull
    public static final Parcelable.Creator<r> CREATOR = new q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a0 f47055a;

    public r(q3.c cVar) {
        g gVarJ = l.j();
        a0 a0Var = new a0(gVarJ.g(), cVar);
        if (!(gVarJ instanceof b)) {
            a0Var.f47000b = new a0(1, cVar);
        }
        this.f47055a = a0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i11;
        q3.c cVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (s.f47056a) {
                a0 a0Var = this.f47055a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.h(a0Var);
                i11 = a0Var2.f46972d;
                cVar = a0Var2.f46971c;
            }
            cVar.getClass();
            q3.c cVarE = cVar.e(obj);
            if (Intrinsics.areEqual(cVarE, cVar)) {
                return false;
            }
            a0 a0Var3 = this.f47055a;
            a0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zB = s.b((a0) l.w(a0Var3, this, gVarJ), i11, cVarE, true);
            }
            l.n(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i11;
        q3.c cVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (s.f47056a) {
                a0 a0Var = this.f47055a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.h(a0Var);
                i11 = a0Var2.f46972d;
                cVar = a0Var2.f46971c;
            }
            cVar.getClass();
            q3.c cVarG = cVar.g(collection);
            if (Intrinsics.areEqual(cVarG, cVar)) {
                return false;
            }
            a0 a0Var3 = this.f47055a;
            a0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zB = s.b((a0) l.w(a0Var3, this, gVarJ), i11, cVarG, true);
            }
            l.n(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // z3.d0
    public final f0 b() {
        return this.f47055a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        g gVarJ;
        a0 a0Var = this.f47055a;
        a0Var.getClass();
        synchronized (l.f47038c) {
            gVarJ = l.j();
            a0 a0Var2 = (a0) l.w(a0Var, this, gVarJ);
            synchronized (s.f47056a) {
                a0Var2.f46971c = q3.i.f35977c;
                a0Var2.f46972d++;
                a0Var2.f46973e++;
            }
        }
        l.n(gVarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return s.c(this).f46971c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return s.c(this).f46971c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // z3.d0
    public final void e(f0 f0Var) {
        f0Var.f47000b = this.f47055a;
        this.f47055a = (a0) f0Var;
    }

    public final void g(int i11, int i12) {
        int i13;
        q3.c cVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (s.f47056a) {
                a0 a0Var = this.f47055a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.h(a0Var);
                i13 = a0Var2.f46972d;
                cVar = a0Var2.f46971c;
            }
            cVar.getClass();
            q3.f fVarH = cVar.h();
            fVarH.subList(i11, i12).clear();
            q3.c cVarE = fVarH.e();
            if (Intrinsics.areEqual(cVarE, cVar)) {
                return;
            }
            a0 a0Var3 = this.f47055a;
            a0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zB = s.b((a0) l.w(a0Var3, this, gVarJ), i13, cVarE, true);
            }
            l.n(gVarJ, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final Object get(int i11) {
        return s.c(this).f46971c.get(i11);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return s.c(this).f46971c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return s.c(this).f46971c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return s.c(this).f46971c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new v70.b(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i11;
        q3.c cVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (s.f47056a) {
                a0 a0Var = this.f47055a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.h(a0Var);
                i11 = a0Var2.f46972d;
                cVar = a0Var2.f46971c;
            }
            cVar.getClass();
            int iIndexOf = cVar.indexOf(obj);
            q3.c cVarJ = iIndexOf != -1 ? cVar.j(iIndexOf) : cVar;
            if (Intrinsics.areEqual(cVarJ, cVar)) {
                return false;
            }
            a0 a0Var3 = this.f47055a;
            a0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zB = s.b((a0) l.w(a0Var3, this, gVarJ), i11, cVarJ, true);
            }
            l.n(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i11;
        q3.c cVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (s.f47056a) {
                a0 a0Var = this.f47055a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.h(a0Var);
                i11 = a0Var2.f46972d;
                cVar = a0Var2.f46971c;
            }
            cVar.getClass();
            q3.c cVarI = cVar.i(new q3.b(0, collection));
            if (Intrinsics.areEqual(cVarI, cVar)) {
                return false;
            }
            a0 a0Var3 = this.f47055a;
            a0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zB = s.b((a0) l.w(a0Var3, this, gVarJ), i11, cVarI, true);
            }
            l.n(gVarJ, this);
        } while (!zB);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return s.e(this, new q3.b(3, collection));
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        int i12;
        q3.c cVar;
        g gVarJ;
        boolean zB;
        Object obj2 = get(i11);
        do {
            synchronized (s.f47056a) {
                a0 a0Var = this.f47055a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.h(a0Var);
                i12 = a0Var2.f46972d;
                cVar = a0Var2.f46971c;
            }
            cVar.getClass();
            q3.c cVarL = cVar.l(i11, obj);
            if (Intrinsics.areEqual(cVarL, cVar)) {
                break;
            }
            a0 a0Var3 = this.f47055a;
            a0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zB = s.b((a0) l.w(a0Var3, this, gVarJ), i12, cVarL, false);
            }
            l.n(gVarJ, this);
        } while (!zB);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return s.c(this).f46971c.size();
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        if (!(i11 >= 0 && i11 <= i12 && i12 <= size())) {
            s1.a("fromIndex or toIndex are out of bounds");
        }
        return new j0(this, i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final String toString() {
        a0 a0Var = this.f47055a;
        a0Var.getClass();
        return "SnapshotStateList(value=" + ((a0) l.h(a0Var)).f46971c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        q3.c cVar = s.c(this).f46971c;
        int size = cVar.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeValue(cVar.get(i12));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        return new v70.b(this, i11);
    }

    public r() {
        this(q3.i.f35977c);
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        q3.c cVar;
        g gVarJ;
        boolean zB;
        do {
            synchronized (s.f47056a) {
                a0 a0Var = this.f47055a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.h(a0Var);
                i12 = a0Var2.f46972d;
                cVar = a0Var2.f46971c;
            }
            cVar.getClass();
            q3.c cVarD = cVar.d(i11, obj);
            if (Intrinsics.areEqual(cVarD, cVar)) {
                return;
            }
            a0 a0Var3 = this.f47055a;
            a0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zB = s.b((a0) l.w(a0Var3, this, gVarJ), i12, cVarD, true);
            }
            l.n(gVarJ, this);
        } while (!zB);
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        return s.e(this, new b3.q(i11, collection, 6));
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        int i12;
        q3.c cVar;
        g gVarJ;
        boolean zB;
        Object obj = get(i11);
        do {
            synchronized (s.f47056a) {
                a0 a0Var = this.f47055a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.h(a0Var);
                i12 = a0Var2.f46972d;
                cVar = a0Var2.f46971c;
            }
            cVar.getClass();
            q3.c cVarJ = cVar.j(i11);
            if (Intrinsics.areEqual(cVarJ, cVar)) {
                break;
            }
            a0 a0Var3 = this.f47055a;
            a0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zB = s.b((a0) l.w(a0Var3, this, gVarJ), i12, cVarJ, true);
            }
            l.n(gVarJ, this);
        } while (!zB);
        return obj;
    }
}
