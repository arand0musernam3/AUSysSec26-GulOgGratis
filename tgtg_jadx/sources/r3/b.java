package r3;

import androidx.constraintlayout.widget.z;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class b extends kotlin.collections.k implements Map, KMappedMarker {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f37577f = new b(l.f37600e, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f37578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37579e;

    public b(l lVar, int i11) {
        this.f37578d = lVar;
        this.f37579e = i11;
    }

    @Override // kotlin.collections.k
    public final Set a() {
        return new j(this, 0);
    }

    @Override // kotlin.collections.k
    public final Set b() {
        return new j(this, 1);
    }

    @Override // kotlin.collections.k, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f37578d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.k
    public final int d() {
        return this.f37579e;
    }

    @Override // kotlin.collections.k
    public final Collection e() {
        return new kotlin.collections.j(this, 2);
    }

    public d g() {
        return new d(this);
    }

    @Override // kotlin.collections.k, java.util.Map
    public Object get(Object obj) {
        return this.f37578d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public /* bridge */ d h() {
        return g();
    }

    public final b i(Object obj, s3.a aVar) {
        z zVarU = this.f37578d.u(obj != null ? obj.hashCode() : 0, obj, aVar, 0);
        return zVarU == null ? this : new b((l) zVarU.f2543c, this.f37579e + zVarU.f2542b);
    }
}
