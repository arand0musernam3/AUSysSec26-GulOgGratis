package a40;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f734b;

    public k(x xVar, g40.b bVar) {
        this.f733a = xVar;
        this.f734b = new j(bVar);
    }

    public final void a(String str) {
        j jVar = this.f734b;
        synchronized (jVar) {
            if (!Objects.equals(jVar.f731b, str)) {
                j.a(jVar.f730a, str, jVar.f732c);
                jVar.f731b = str;
            }
        }
    }
}
