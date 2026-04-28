package qj;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f37079b;

    public /* synthetic */ f(i iVar, int i11) {
        this.f37078a = i11;
        this.f37079b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f37078a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i11) {
            case 0:
                this.f37079b.f37100a.f39042a.a(new sj.a(iIntValue, true));
                break;
            default:
                this.f37079b.f37100a.f39042a.a(new sj.a(iIntValue, false));
                break;
        }
        return Unit.f26487a;
    }
}
