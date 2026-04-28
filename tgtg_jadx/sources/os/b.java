package os;

import c5.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f33737b;

    public /* synthetic */ b(f1 f1Var, int i11) {
        this.f33736a = i11;
        this.f33737b = f1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f33736a;
        String str = (String) obj;
        str.getClass();
        switch (i11) {
            case 0:
                this.f33737b.a(str);
                break;
            case 1:
                this.f33737b.a(str);
                break;
            case 2:
                this.f33737b.a(str);
                break;
            default:
                this.f33737b.a(str);
                break;
        }
        return Unit.f26487a;
    }
}
