package n90;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f30752a = new LinkedHashMap();

    public final b0 a() {
        return new b0(this.f30752a);
    }

    public final n b(String str, n nVar) {
        str.getClass();
        nVar.getClass();
        return (n) this.f30752a.put(str, nVar);
    }
}
