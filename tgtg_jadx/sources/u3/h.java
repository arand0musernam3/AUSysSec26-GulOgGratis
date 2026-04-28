package u3;

import m3.f3;
import m3.u1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends r3.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f40657g;

    @Override // r3.d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof u1) {
            return super.containsKey((u1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof f3) {
            return super.containsValue((f3) obj);
        }
        return false;
    }

    @Override // r3.d, java.util.AbstractMap, java.util.Map
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

    @Override // r3.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final i g() {
        r3.l lVar = this.f37585c;
        i iVar = this.f40657g;
        if (lVar != iVar.f37578d) {
            this.f37584b = new t3.b();
            iVar = new i(this.f37585c, d());
        }
        this.f40657g = iVar;
        return iVar;
    }

    @Override // r3.d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof u1) {
            return (f3) super.remove((u1) obj);
        }
        return null;
    }
}
