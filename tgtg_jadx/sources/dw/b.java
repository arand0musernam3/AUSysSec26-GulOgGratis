package dw;

import com.braze.managers.c0;
import com.braze.managers.g0;
import com.braze.managers.j;
import com.braze.managers.k0;
import com.braze.managers.n;
import com.braze.managers.r;
import com.braze.managers.s;
import com.braze.managers.w;
import com.braze.triggers.managers.f;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import v2.h;
import y2.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f15182b;

    public /* synthetic */ b(long j9, int i11) {
        this.f15181a = i11;
        this.f15182b = j9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15181a) {
            case 0:
                return com.braze.models.outgoing.event.a.b(this.f15182b);
            case 1:
                return com.braze.triggers.managers.d.a(this.f15182b);
            case 2:
                return f.a(this.f15182b);
            case 3:
                return com.braze.dispatch.f.c(this.f15182b);
            case 4:
                n0 n0Var = n0.f26529a;
                return new h("", this.f15182b, new ub.a((y2.d) null, new e(n0Var, n0Var, 100)));
            case 5:
                return c0.a(this.f15182b);
            case 6:
                return g0.a(this.f15182b);
            case 7:
                return g0.c(this.f15182b);
            case 8:
                return j.a(this.f15182b);
            case 9:
                return k0.a(this.f15182b);
            case 10:
                return n.c(this.f15182b);
            case 11:
                return n.a(this.f15182b);
            case 12:
                return r.b(this.f15182b);
            case 13:
                return s.a(this.f15182b);
            default:
                return w.a(this.f15182b);
        }
    }
}
