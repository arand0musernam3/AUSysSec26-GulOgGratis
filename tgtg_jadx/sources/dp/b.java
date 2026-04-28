package dp;

import java.util.LinkedHashMap;
import java.util.List;
import m3.b1;
import z4.u0;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f15044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f6.s f15045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f6.n f15046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f15047e;

    public /* synthetic */ b(b1 b1Var, f6.s sVar, f6.n nVar, b1 b1Var2, int i11) {
        this.f15043a = i11;
        this.f15044b = b1Var;
        this.f15045c = sVar;
        this.f15046d = nVar;
        this.f15047e = b1Var2;
    }

    @Override // z4.u0
    public final v0 c(w0 w0Var, List list, long j9) {
        switch (this.f15043a) {
            case 0:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.f15044b.getValue();
                long jF = this.f15045c.f(j9, w0Var.getLayoutDirection(), this.f15046d, list, linkedHashMap);
                this.f15047e.getValue();
                return w0.f(w0Var, (int) (jF >> 32), (int) (jF & 4294967295L), new a(this.f15045c, list, linkedHashMap, 0));
            case 1:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                this.f15044b.getValue();
                long jF2 = this.f15045c.f(j9, w0Var.getLayoutDirection(), this.f15046d, list, linkedHashMap2);
                this.f15047e.getValue();
                return w0.f(w0Var, (int) (jF2 >> 32), (int) (jF2 & 4294967295L), new a(this.f15045c, list, linkedHashMap2, 1));
            case 2:
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                this.f15044b.getValue();
                long jF3 = this.f15045c.f(j9, w0Var.getLayoutDirection(), this.f15046d, list, linkedHashMap3);
                this.f15047e.getValue();
                return w0.f(w0Var, (int) (jF3 >> 32), (int) (jF3 & 4294967295L), new a(this.f15045c, list, linkedHashMap3, 2));
            case 3:
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                this.f15044b.getValue();
                long jF4 = this.f15045c.f(j9, w0Var.getLayoutDirection(), this.f15046d, list, linkedHashMap4);
                this.f15047e.getValue();
                return w0.f(w0Var, (int) (jF4 >> 32), (int) (jF4 & 4294967295L), new a(this.f15045c, list, linkedHashMap4, 3));
            default:
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                this.f15044b.getValue();
                long jF5 = this.f15045c.f(j9, w0Var.getLayoutDirection(), this.f15046d, list, linkedHashMap5);
                this.f15047e.getValue();
                return w0.f(w0Var, (int) (jF5 >> 32), (int) (jF5 & 4294967295L), new a(this.f15045c, list, linkedHashMap5, 4));
        }
    }
}
