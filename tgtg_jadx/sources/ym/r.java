package ym;

import bg.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f46230b;

    public /* synthetic */ r(u uVar, int i11) {
        this.f46229a = i11;
        this.f46230b = uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f46229a) {
            case 0:
                this.f46230b.z("");
                return Unit.f26487a;
            default:
                return new w0(this.f46230b.requireContext());
        }
    }
}
