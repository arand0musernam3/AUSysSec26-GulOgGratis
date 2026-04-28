package hq;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f22398b;

    public /* synthetic */ q(r rVar, int i11) {
        this.f22397a = i11;
        this.f22398b = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22397a) {
            case 0:
                Function0 function0 = this.f22398b.f22401e;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f26487a;
            default:
                return r.c(this.f22398b);
        }
    }
}
