package u30;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    m a(o oVar);

    default Object b(Class cls) {
        return e(o.a(cls));
    }

    default t40.b c(Class cls) {
        return g(o.a(cls));
    }

    t40.b d(o oVar);

    default Object e(o oVar) {
        t40.b bVarG = g(oVar);
        if (bVarG == null) {
            return null;
        }
        return bVarG.get();
    }

    default Set f(o oVar) {
        return (Set) d(oVar).get();
    }

    t40.b g(o oVar);
}
