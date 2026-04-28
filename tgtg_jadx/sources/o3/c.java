package o3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import q1.c1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements List, KMutableList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f31824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31826d;

    public /* synthetic */ c(List list, int i11, int i12, int i13) {
        this.f31823a = i13;
        this.f31824b = list;
        this.f31825c = i11;
        this.f31826d = i12;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i11, Object obj) {
        switch (this.f31823a) {
            case 0:
                this.f31824b.add(i11 + this.f31825c, obj);
                this.f31826d++;
                break;
            default:
                this.f31824b.add(i11 + this.f31825c, obj);
                this.f31826d++;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        switch (this.f31823a) {
            case 0:
                this.f31824b.addAll(i11 + this.f31825c, collection);
                int size = collection.size();
                this.f31826d += size;
                if (size > 0) {
                }
                break;
            default:
                collection.getClass();
                this.f31824b.addAll(i11 + this.f31825c, collection);
                this.f31826d = collection.size() + this.f31826d;
                if (collection.size() > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f31823a) {
            case 0:
                int i11 = this.f31826d - 1;
                int i12 = this.f31825c;
                if (i12 <= i11) {
                    while (true) {
                        this.f31824b.remove(i11);
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                }
                this.f31826d = i12;
                break;
            default:
                int i13 = this.f31826d - 1;
                int i14 = this.f31825c;
                if (i14 <= i13) {
                    while (true) {
                        this.f31824b.remove(i13);
                        if (i13 != i14) {
                            i13--;
                        }
                    }
                }
                this.f31826d = i14;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f31823a) {
            case 0:
                int i11 = this.f31826d;
                for (int i12 = this.f31825c; i12 < i11; i12++) {
                    if (Intrinsics.areEqual(this.f31824b.get(i12), obj)) {
                    }
                    break;
                }
                break;
            default:
                int i13 = this.f31826d;
                for (int i14 = this.f31825c; i14 < i13; i14++) {
                    if (Intrinsics.areEqual(this.f31824b.get(i14), obj)) {
                    }
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f31823a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                collection.getClass();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i11) {
        switch (this.f31823a) {
            case 0:
                f.a(i11, this);
                return this.f31824b.get(i11 + this.f31825c);
            default:
                c1.a(i11, this);
                return this.f31824b.get(i11 + this.f31825c);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f31823a) {
            case 0:
                int i11 = this.f31826d;
                int i12 = this.f31825c;
                for (int i13 = i12; i13 < i11; i13++) {
                    if (Intrinsics.areEqual(this.f31824b.get(i13), obj)) {
                        return i13 - i12;
                    }
                }
                return -1;
            default:
                int i14 = this.f31826d;
                int i15 = this.f31825c;
                for (int i16 = i15; i16 < i14; i16++) {
                    if (Intrinsics.areEqual(this.f31824b.get(i16), obj)) {
                        return i16 - i15;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f31823a) {
            case 0:
                if (this.f31826d == this.f31825c) {
                }
                break;
            default:
                if (this.f31826d == this.f31825c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f31823a) {
            case 0:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f31823a) {
            case 0:
                int i11 = this.f31826d - 1;
                int i12 = this.f31825c;
                if (i12 <= i11) {
                    while (!Intrinsics.areEqual(this.f31824b.get(i11), obj)) {
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                    return i11 - i12;
                }
                return -1;
            default:
                int i13 = this.f31826d - 1;
                int i14 = this.f31825c;
                if (i14 <= i13) {
                    while (!Intrinsics.areEqual(this.f31824b.get(i13), obj)) {
                        if (i13 != i14) {
                            i13--;
                        }
                    }
                    return i13 - i14;
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f31823a) {
            case 0:
                return new d(this, 0, 0);
            default:
                return new d(this, 0, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f31823a) {
            case 0:
                int i11 = this.f31826d;
                for (int i12 = this.f31825c; i12 < i11; i12++) {
                    ?? r22 = this.f31824b;
                    if (Intrinsics.areEqual(r22.get(i12), obj)) {
                        r22.remove(i12);
                        this.f31826d--;
                    }
                    break;
                }
                break;
            default:
                int i13 = this.f31826d;
                for (int i14 = this.f31825c; i14 < i13; i14++) {
                    ?? r23 = this.f31824b;
                    if (Intrinsics.areEqual(r23.get(i14), obj)) {
                        r23.remove(i14);
                        this.f31826d--;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f31823a) {
            case 0:
                int i11 = this.f31826d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i11 != this.f31826d) {
                }
                break;
            default:
                collection.getClass();
                int i12 = this.f31826d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i12 != this.f31826d) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f31823a) {
            case 0:
                int i11 = this.f31826d;
                int i12 = i11 - 1;
                int i13 = this.f31825c;
                if (i13 <= i12) {
                    while (true) {
                        ?? r32 = this.f31824b;
                        if (!collection.contains(r32.get(i12))) {
                            r32.remove(i12);
                            this.f31826d--;
                        }
                        if (i12 != i13) {
                            i12--;
                        }
                    }
                }
                if (i11 != this.f31826d) {
                }
                break;
            default:
                collection.getClass();
                int i14 = this.f31826d;
                int i15 = i14 - 1;
                int i16 = this.f31825c;
                if (i16 <= i15) {
                    while (true) {
                        ?? r33 = this.f31824b;
                        if (!collection.contains(r33.get(i15))) {
                            r33.remove(i15);
                            this.f31826d--;
                        }
                        if (i15 != i16) {
                            i15--;
                        }
                    }
                }
                if (i14 != this.f31826d) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        switch (this.f31823a) {
            case 0:
                f.a(i11, this);
                return this.f31824b.set(i11 + this.f31825c, obj);
            default:
                c1.a(i11, this);
                return this.f31824b.set(i11 + this.f31825c, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i11;
        int i12;
        switch (this.f31823a) {
            case 0:
                i11 = this.f31826d;
                i12 = this.f31825c;
                break;
            default:
                i11 = this.f31826d;
                i12 = this.f31825c;
                break;
        }
        return i11 - i12;
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        switch (this.f31823a) {
            case 0:
                f.b(this, i11, i12);
                return new c(this, i11, i12, 0);
            default:
                c1.b(this, i11, i12);
                return new c(this, i11, i12, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f31823a) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return CollectionToArray.toArray(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f31823a) {
        }
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        switch (this.f31823a) {
            case 0:
                return new d(this, i11, 0);
            default:
                return new d(this, i11, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f31823a) {
            case 0:
                int i11 = this.f31826d;
                this.f31826d = i11 + 1;
                this.f31824b.add(i11, obj);
                break;
            default:
                int i12 = this.f31826d;
                this.f31826d = i12 + 1;
                this.f31824b.add(i12, obj);
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f31823a) {
            case 0:
                this.f31824b.addAll(this.f31826d, collection);
                int size = collection.size();
                this.f31826d += size;
                if (size > 0) {
                }
                break;
            default:
                collection.getClass();
                this.f31824b.addAll(this.f31826d, collection);
                this.f31826d = collection.size() + this.f31826d;
                if (collection.size() > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i11) {
        switch (this.f31823a) {
            case 0:
                f.a(i11, this);
                this.f31826d--;
                return this.f31824b.remove(i11 + this.f31825c);
            default:
                c1.a(i11, this);
                this.f31826d--;
                return this.f31824b.remove(i11 + this.f31825c);
        }
    }
}
