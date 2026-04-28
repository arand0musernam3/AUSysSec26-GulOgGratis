package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26496b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26497c;

    public d1(List list) {
        list.getClass();
        this.f26497c = list;
    }

    @Override // kotlin.collections.a
    public final int b() {
        switch (this.f26496b) {
            case 0:
                return ((List) this.f26497c).size();
            default:
                return ((kotlin.text.l) this.f26497c).f26614a.groupCount() + 1;
        }
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f26496b) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public final Object get(int i11) {
        switch (this.f26496b) {
            case 0:
                return ((List) this.f26497c).get(j0.z(i11, this));
            default:
                String strGroup = ((kotlin.text.l) this.f26497c).f26614a.group(i11);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f26496b) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // kotlin.collections.f, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f26496b) {
            case 0:
                return new c1(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f26496b) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // kotlin.collections.f, java.util.List
    public ListIterator listIterator() {
        switch (this.f26496b) {
            case 0:
                return new c1(this, 0);
            default:
                return super.listIterator();
        }
    }

    public d1(kotlin.text.l lVar) {
        this.f26497c = lVar;
    }

    @Override // kotlin.collections.f, java.util.List
    public ListIterator listIterator(int i11) {
        switch (this.f26496b) {
            case 0:
                return new c1(this, i11);
            default:
                return super.listIterator(i11);
        }
    }
}
