package z3;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.h2;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable, d0, Set, RandomAccess, KMutableSet {

    @NotNull
    public static final Parcelable.Creator<y> CREATOR = new q(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h0 f47086a;

    public y() {
        s3.b bVar = s3.b.f38818e;
        h0 h0Var = new h0(l.j().g(), bVar);
        if (l.f47037b.j() != null) {
            h0Var.f47000b = new h0(1, bVar);
        }
        this.f47086a = h0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i11;
        s3.b bVar;
        g gVarJ;
        boolean zA;
        do {
            synchronized (z.f47087a) {
                h0 h0Var = this.f47086a;
                h0Var.getClass();
                h0 h0Var2 = (h0) l.h(h0Var);
                i11 = h0Var2.f47012d;
                bVar = h0Var2.f47011c;
            }
            bVar.getClass();
            s3.b bVarD = bVar.d(obj);
            if (Intrinsics.areEqual(bVarD, bVar)) {
                return false;
            }
            h0 h0Var3 = this.f47086a;
            h0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zA = z.a((h0) l.w(h0Var3, this, gVarJ), i11, bVarD);
            }
            l.n(gVarJ, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i11;
        s3.b bVar;
        g gVarJ;
        boolean zA;
        do {
            synchronized (z.f47087a) {
                h0 h0Var = this.f47086a;
                h0Var.getClass();
                h0 h0Var2 = (h0) l.h(h0Var);
                i11 = h0Var2.f47012d;
                bVar = h0Var2.f47011c;
            }
            bVar.getClass();
            s3.c cVar = new s3.c(bVar);
            cVar.addAll(collection);
            s3.b bVarD = cVar.d();
            if (Intrinsics.areEqual(bVarD, bVar)) {
                return false;
            }
            h0 h0Var3 = this.f47086a;
            h0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zA = z.a((h0) l.w(h0Var3, this, gVarJ), i11, bVarD);
            }
            l.n(gVarJ, this);
        } while (!zA);
        return true;
    }

    @Override // z3.d0
    public final f0 b() {
        return this.f47086a;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        g gVarJ;
        h0 h0Var = this.f47086a;
        h0Var.getClass();
        synchronized (l.f47038c) {
            gVarJ = l.j();
            h0 h0Var2 = (h0) l.w(h0Var, this, gVarJ);
            synchronized (z.f47087a) {
                h0Var2.f47011c = s3.b.f38818e;
                h0Var2.f47012d++;
            }
        }
        l.n(gVarJ, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return z.b(this).f47011c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return z.b(this).f47011c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // z3.d0
    public final void e(f0 f0Var) {
        f0Var.f47000b = this.f47086a;
        this.f47086a = (h0) f0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return z.b(this).f47011c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g0(this, z.b(this).f47011c.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i11;
        s3.b bVar;
        g gVarJ;
        boolean zA;
        do {
            synchronized (z.f47087a) {
                h0 h0Var = this.f47086a;
                h0Var.getClass();
                h0 h0Var2 = (h0) l.h(h0Var);
                i11 = h0Var2.f47012d;
                bVar = h0Var2.f47011c;
            }
            bVar.getClass();
            s3.b bVarE = bVar.e(obj);
            if (Intrinsics.areEqual(bVarE, bVar)) {
                return false;
            }
            h0 h0Var3 = this.f47086a;
            h0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zA = z.a((h0) l.w(h0Var3, this, gVarJ), i11, bVarE);
            }
            l.n(gVarJ, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i11;
        s3.b bVar;
        g gVarJ;
        boolean zA;
        do {
            synchronized (z.f47087a) {
                h0 h0Var = this.f47086a;
                h0Var.getClass();
                h0 h0Var2 = (h0) l.h(h0Var);
                i11 = h0Var2.f47012d;
                bVar = h0Var2.f47011c;
            }
            bVar.getClass();
            s3.c cVar = new s3.c(bVar);
            cVar.removeAll(collection);
            s3.b bVarD = cVar.d();
            if (Intrinsics.areEqual(bVarD, bVar)) {
                return false;
            }
            h0 h0Var3 = this.f47086a;
            h0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zA = z.a((h0) l.w(h0Var3, this, gVarJ), i11, bVarD);
            }
            l.n(gVarJ, this);
        } while (!zA);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i11;
        s3.b bVar;
        boolean zRetainAll;
        g gVarJ;
        boolean zA;
        do {
            synchronized (z.f47087a) {
                h0 h0Var = this.f47086a;
                h0Var.getClass();
                h0 h0Var2 = (h0) l.h(h0Var);
                i11 = h0Var2.f47012d;
                bVar = h0Var2.f47011c;
            }
            if (bVar == null) {
                h2.b("No set to mutate");
                return false;
            }
            s3.c cVar = new s3.c(bVar);
            zRetainAll = cVar.retainAll(CollectionsKt.v0(collection));
            s3.b bVarD = cVar.d();
            if (Intrinsics.areEqual(bVarD, bVar)) {
                break;
            }
            h0 h0Var3 = this.f47086a;
            h0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zA = z.a((h0) l.w(h0Var3, this, gVarJ), i11, bVarD);
            }
            l.n(gVarJ, this);
        } while (!zA);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return z.b(this).f47011c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final String toString() {
        h0 h0Var = this.f47086a;
        h0Var.getClass();
        return "SnapshotStateSet(value=" + ((h0) l.h(h0Var)).f47011c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        s3.b bVar = z.b(this).f47011c;
        parcel.writeInt(size());
        Iterator it = bVar.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }
}
