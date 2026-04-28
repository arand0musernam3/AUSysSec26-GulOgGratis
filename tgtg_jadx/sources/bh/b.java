package bh;

import al.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f6266c;

    public /* synthetic */ b(Function1 function1, h hVar, int i11) {
        this.f6264a = i11;
        this.f6265b = function1;
        this.f6266c = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6264a) {
            case 0:
                this.f6265b.invoke(this.f6266c);
                break;
            default:
                this.f6265b.invoke(this.f6266c);
                break;
        }
        return Unit.f26487a;
    }
}
