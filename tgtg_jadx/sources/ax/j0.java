package ax;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends AbstractList {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f4935e = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f4936a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4938c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4937b = String.valueOf(Integer.valueOf(f4935e.incrementAndGet()));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f4939d = new ArrayList();

    public j0(h0... h0VarArr) {
        List listAsList = Arrays.asList(h0VarArr);
        listAsList.getClass();
        this.f4938c = new ArrayList(listAsList);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h0 h0Var = (h0) obj;
        h0Var.getClass();
        return this.f4938c.add(h0Var);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f4938c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof h0) {
            return super.contains((h0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return (h0) this.f4938c.get(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof h0) {
            return super.indexOf((h0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof h0) {
            return super.lastIndexOf((h0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof h0) {
            return super.remove((h0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        h0 h0Var = (h0) obj;
        h0Var.getClass();
        return (h0) this.f4938c.set(i11, h0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4938c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        h0 h0Var = (h0) obj;
        h0Var.getClass();
        this.f4938c.add(i11, h0Var);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        return (h0) this.f4938c.remove(i11);
    }

    public j0(List list) {
        this.f4938c = new ArrayList(list);
    }
}
