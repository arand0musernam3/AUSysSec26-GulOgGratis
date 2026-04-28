package qe;

import he.a0;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f36982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36983b;

    public l(String str, k kVar, boolean z11) {
        this.f36982a = kVar;
        this.f36983b = z11;
    }

    @Override // qe.b
    public final je.c a(he.z zVar, he.k kVar, re.b bVar) {
        if (((HashSet) zVar.f21992m.f39010b).contains(a0.MergePathsApi19)) {
            return new je.m(this);
        }
        ve.c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f36982a + '}';
    }
}
