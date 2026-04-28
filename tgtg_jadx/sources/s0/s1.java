package s0;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface s1 extends u0 {
    @Override // s0.u0
    default Object a(g gVar, t0 t0Var) {
        return getConfig().a(gVar, t0Var);
    }

    @Override // s0.u0
    default Set b(g gVar) {
        return getConfig().b(gVar);
    }

    @Override // s0.u0
    default Set c() {
        return getConfig().c();
    }

    @Override // s0.u0
    default Object d(g gVar) {
        return getConfig().d(gVar);
    }

    @Override // s0.u0
    default t0 f(g gVar) {
        return getConfig().f(gVar);
    }

    @Override // s0.u0
    default boolean g(g gVar) {
        return getConfig().g(gVar);
    }

    u0 getConfig();

    @Override // s0.u0
    default Object i(g gVar, Object obj) {
        return getConfig().i(gVar, obj);
    }

    @Override // s0.u0
    default void j(a50.d dVar) {
        getConfig().j(dVar);
    }
}
