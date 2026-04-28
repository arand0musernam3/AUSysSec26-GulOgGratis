package m2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f29101b;

    public /* synthetic */ w(e2 e2Var, int i11) {
        this.f29100a = i11;
        this.f29101b = e2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f29100a) {
            case 0:
                e2 e2Var = this.f29101b;
                return Boolean.valueOf(e2Var != null ? ((Boolean) new w(e2Var, 2).invoke()).booleanValue() : false);
            case 1:
                e2 e2Var2 = this.f29101b;
                return Boolean.valueOf(e2Var2 != null ? ((Boolean) new w(e2Var2, 2).invoke()).booleanValue() : false);
            default:
                e2 e2Var3 = this.f29101b;
                m5.h hVar = e2Var3.f28844b;
                m5.q0 q0Var = (m5.q0) e2Var3.f28843a.getValue();
                return Boolean.valueOf(Intrinsics.areEqual(hVar, q0Var != null ? q0Var.f29617a.f29603a : null));
        }
    }
}
