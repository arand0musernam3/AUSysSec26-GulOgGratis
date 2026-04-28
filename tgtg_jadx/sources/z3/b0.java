package z3;

import java.util.Map;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Map.Entry, KMutableMap.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f46975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f46976c;

    public b0(c0 c0Var) {
        this.f46976c = c0Var;
        Map.Entry entry = c0Var.f46989d;
        entry.getClass();
        this.f46974a = entry.getKey();
        Map.Entry entry2 = c0Var.f46989d;
        entry2.getClass();
        this.f46975b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f46974a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f46975b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        c0 c0Var = this.f46976c;
        u uVar = c0Var.f46986a;
        if (uVar.f().f47058d != c0Var.f46988c) {
            org.bouncycastle.jce.provider.a.o();
            return null;
        }
        Object obj2 = this.f46975b;
        uVar.put(this.f46974a, obj);
        this.f46975b = obj;
        return obj2;
    }
}
