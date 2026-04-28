package q1;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class c0 implements Map.Entry, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f35728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f35729c;

    public /* synthetic */ c0(int i11, Object obj, Object obj2) {
        this.f35727a = i11;
        this.f35728b = obj;
        this.f35729c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f35727a) {
            case 1:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && Intrinsics.areEqual(entry.getKey(), this.f35728b) && Intrinsics.areEqual(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f35727a) {
        }
        return this.f35728b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f35727a) {
        }
        return this.f35729c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f35727a) {
            case 1:
                Object obj = this.f35728b;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f35727a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f35727a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f35728b);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
