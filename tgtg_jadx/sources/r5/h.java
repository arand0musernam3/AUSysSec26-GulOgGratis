package r5;

import java.util.List;
import kotlin.collections.CollectionsKt;
import m5.k0;
import m5.t0;
import m90.z0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f37674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f37675b;

    public final y a(List list) {
        g gVar;
        g gVar2 = null;
        try {
            int size = list.size();
            int i11 = 0;
            g gVar3 = null;
            while (i11 < size) {
                try {
                    gVar = (g) list.get(i11);
                } catch (Exception e5) {
                    e = e5;
                    gVar2 = gVar3;
                }
                try {
                    gVar.a(this.f37675b);
                    i11++;
                    gVar3 = gVar;
                } catch (Exception e11) {
                    e = e11;
                    gVar2 = gVar;
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb3.append(((mv.b0) this.f37675b.f37681f).p());
                    sb3.append(", composition=");
                    sb3.append(this.f37675b.c());
                    sb3.append(", selection=");
                    i iVar = this.f37675b;
                    sb3.append((Object) t0.i(k0.b(iVar.f37677b, iVar.f37678c)));
                    sb3.append("):");
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    CollectionsKt.T(list, sb2, "\n", null, null, new z0(20, gVar2, this), 60);
                    throw new RuntimeException(sb2.toString(), e);
                }
            }
            i iVar2 = this.f37675b;
            iVar2.getClass();
            m5.h hVar = new m5.h(((mv.b0) iVar2.f37681f).toString());
            i iVar3 = this.f37675b;
            long jB = k0.b(iVar3.f37677b, iVar3.f37678c);
            t0 t0Var = t0.h(this.f37674a.f37715b) ? null : new t0(jB);
            y yVar = new y(hVar, t0Var != null ? t0Var.f29650a : k0.b(t0.f(jB), t0.g(jB)), this.f37675b.c());
            this.f37674a = yVar;
            return yVar;
        } catch (Exception e12) {
            e = e12;
        }
    }
}
