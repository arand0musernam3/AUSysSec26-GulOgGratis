package v70;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Map.Entry, KMutableMap.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f42038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42040c;

    public h(i iVar, int i11) {
        iVar.getClass();
        this.f42038a = iVar;
        this.f42039b = i11;
        this.f42040c = iVar.f42050h;
    }

    public final void a() {
        if (this.f42038a.f42050h != this.f42040c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f42038a.f42043a[this.f42039b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f42038a.f42044b;
        objArr.getClass();
        return objArr[this.f42039b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        i iVar = this.f42038a;
        iVar.d();
        Object[] objArr = iVar.f42044b;
        if (objArr == null) {
            int length = iVar.f42043a.length;
            if (length < 0) {
                i4.a.f("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            iVar.f42044b = objArr;
        }
        int i11 = this.f42039b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
