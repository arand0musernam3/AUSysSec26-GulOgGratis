package m2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2.w f28914b;

    public /* synthetic */ j(x2.w wVar, int i11) {
        this.f28913a = i11;
        this.f28914b = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f28913a) {
            case 0:
                break;
            case 1:
                x2.w wVar = this.f28914b;
                x2.b0 b0Var = (x2.b0) wVar.f43798s.getValue();
                x2.b0 b0Var2 = x2.b0.Cursor;
                if (b0Var == b0Var2) {
                    b0Var2 = x2.b0.None;
                }
                wVar.w(b0Var2);
                break;
            default:
                this.f28914b.d();
                break;
        }
        return Unit.f26487a;
    }
}
