package jy;

import d40.t1;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class y extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0.e f25453b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(a0.e eVar, int i11) {
        super(0);
        this.f25452a = i11;
        this.f25453b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25452a) {
            case 0:
                Object objH = t1.H(3000L, new ky.n((ky.o) this.f25453b.f59j, 1));
                kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
                if (objH instanceof u70.p) {
                    objH = n0Var;
                }
                return new r0((List) objH);
            case 1:
                ((se.d) this.f25453b.f60k).s("auto_punctuate").getClass();
                return new s0();
            case 2:
                ((se.d) this.f25453b.f60k).s("auto_replace").getClass();
                return new t0();
            case 3:
                ((se.d) this.f25453b.f60k).s("time_12_24").getClass();
                return new u0();
            case 4:
                Object objH2 = t1.H(1000L, new ky.l((k8.d) this.f25453b.f51b, 0));
                if (objH2 instanceof u70.p) {
                    objH2 = 0L;
                }
                ((Number) objH2).longValue();
                return new w0();
            case 5:
                Object objH3 = t1.H(1000L, new ky.l((k8.d) this.f25453b.f51b, 1));
                if (objH3 instanceof u70.p) {
                    objH3 = 0L;
                }
                ((Number) objH3).longValue();
                return new x0();
            case 6:
                ((se.d) this.f25453b.f60k).r("touch_exploration_enabled").getClass();
                return new y0();
            case 7:
                ((se.d) this.f25453b.f60k).o("transition_animation_scale").getClass();
                return new z0();
            default:
                ((se.d) this.f25453b.f60k).o("window_animation_scale").getClass();
                return new a1();
        }
    }
}
