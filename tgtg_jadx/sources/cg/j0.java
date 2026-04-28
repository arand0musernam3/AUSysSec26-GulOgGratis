package cg;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f7997b;

    public /* synthetic */ j0(b1 b1Var, int i11) {
        this.f7996a = i11;
        this.f7997b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7996a) {
            case 0:
                this.f7997b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 1:
                this.f7997b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            default:
                this.f7997b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
        }
        return Unit.f26487a;
    }
}
