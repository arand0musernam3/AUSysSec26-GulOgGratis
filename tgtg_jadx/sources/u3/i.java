package u3;

import androidx.constraintlayout.widget.z;
import m3.c0;
import m3.f3;
import m3.u1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends r3.b implements c0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f40658g = new i(r3.l.f37600e, 0);

    @Override // r3.b, kotlin.collections.k, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof u1) {
            return super.containsKey((u1) obj);
        }
        return false;
    }

    @Override // kotlin.collections.k, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof f3) {
            return super.containsValue((f3) obj);
        }
        return false;
    }

    @Override // r3.b
    public final r3.d g() {
        h hVar = new h(this);
        hVar.f40657g = this;
        return hVar;
    }

    @Override // r3.b, kotlin.collections.k, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof u1) {
            return (f3) super.get((u1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof u1) ? obj2 : (f3) super.getOrDefault((u1) obj, (f3) obj2);
    }

    @Override // r3.b
    public final r3.d h() {
        h hVar = new h(this);
        hVar.f40657g = this;
        return hVar;
    }

    public final i j(u1 u1Var, f3 f3Var) {
        z zVarU = this.f37578d.u(u1Var.hashCode(), u1Var, f3Var, 0);
        return zVarU == null ? this : new i((r3.l) zVarU.f2543c, this.f37579e + zVarU.f2542b);
    }
}
