package bn;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ym.z f6480b;

    public /* synthetic */ k(ym.z zVar, int i11) {
        this.f6479a = i11;
        this.f6480b = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6479a) {
            case 0:
                ym.z zVar = this.f6480b;
                if (zVar != null) {
                    zVar.f();
                }
                break;
            default:
                ym.z zVar2 = this.f6480b;
                if (zVar2 != null) {
                    zVar2.f();
                }
                break;
        }
        return Unit.f26487a;
    }
}
