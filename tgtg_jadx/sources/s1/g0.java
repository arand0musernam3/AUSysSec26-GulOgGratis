package s1;

import kotlin.jvm.functions.Function0;
import t1.q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f38599b;

    public /* synthetic */ g0(q1 q1Var, int i11) {
        this.f38598a = i11;
        this.f38599b = q1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38598a) {
            case 0:
                return this.f38599b.f39540d.getValue();
            default:
                return this.f38599b.f();
        }
    }
}
