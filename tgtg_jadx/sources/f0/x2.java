package f0;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7.e f16984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1 f16985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f16987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f16988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y2 f16989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f16990h;

    public x2(ArrayList arrayList, d7.e eVar, s2 s2Var, int i11, Map map, Integer num, y2 y2Var, r rVar) {
        s2Var.getClass();
        map.getClass();
        this.f16983a = arrayList;
        this.f16984b = eVar;
        this.f16985c = s2Var;
        this.f16986d = i11;
        this.f16987e = map;
        this.f16988f = num;
        this.f16989g = y2Var;
        this.f16990h = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return Intrinsics.areEqual(this.f16983a, x2Var.f16983a) && Intrinsics.areEqual(this.f16984b, x2Var.f16984b) && Intrinsics.areEqual(this.f16985c, x2Var.f16985c) && this.f16986d == x2Var.f16986d && Intrinsics.areEqual(this.f16987e, x2Var.f16987e) && Intrinsics.areEqual(this.f16988f, x2Var.f16988f) && Intrinsics.areEqual(this.f16989g, x2Var.f16989g) && Intrinsics.areEqual(this.f16990h, x2Var.f16990h);
    }

    public final int hashCode() {
        int iHashCode = (this.f16989g.hashCode() + ((this.f16988f.hashCode() + w.a0.f(this.f16987e, r8.k.b(this.f16986d, (this.f16985c.hashCode() + ((this.f16984b.hashCode() + ((this.f16983a.hashCode() + (Integer.hashCode(2) * 31)) * 31)) * 31)) * 31, 31), 31)) * 31)) * 31;
        r rVar = this.f16990h;
        return iHashCode + (rVar == null ? 0 : rVar.hashCode());
    }

    public final String toString() {
        return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.f16983a + ", executor=" + this.f16984b + ", stateCallback=" + this.f16985c + ", sessionTemplateId=" + this.f16986d + ", sessionParameters=" + this.f16987e + ", extensionMode=" + this.f16988f + ", extensionStateCallback=" + this.f16989g + ", postviewOutputConfiguration=" + this.f16990h + ')';
    }
}
