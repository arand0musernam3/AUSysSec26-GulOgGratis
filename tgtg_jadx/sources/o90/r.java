package o90;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import n90.e0;
import n90.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f32194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f32195j;

    @Override // o90.n
    public final n90.n I() {
        return new n90.b0((LinkedHashMap) this.f32183h);
    }

    @Override // o90.n
    public final void L(String str, n90.n nVar) {
        str.getClass();
        nVar.getClass();
        if (!this.f32195j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f32183h;
            String str2 = this.f32194i;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tag");
                str2 = null;
            }
            linkedHashMap.put(str2, nVar);
            this.f32195j = true;
            return;
        }
        if (nVar instanceof g0) {
            this.f32194i = ((g0) nVar).b();
            this.f32195j = false;
        } else {
            if (nVar instanceof n90.b0) {
                throw k.b(e0.f30758b);
            }
            if (nVar instanceof n90.e) {
                throw k.b(n90.g.f30763b);
            }
            e40.a.f();
        }
    }
}
