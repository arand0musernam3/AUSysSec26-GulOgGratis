package oa0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f32371b;

    public /* synthetic */ r(d dVar, int i11) {
        this.f32370a = i11;
        this.f32371b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32370a) {
            case 0:
                this.f32371b.cancel();
                break;
            case 1:
                this.f32371b.cancel();
                break;
            default:
                this.f32371b.cancel();
                break;
        }
        return Unit.f26487a;
    }
}
