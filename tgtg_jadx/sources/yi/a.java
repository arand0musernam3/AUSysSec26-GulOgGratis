package yi;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f45957b;

    public /* synthetic */ a(r rVar, int i11) {
        this.f45956a = i11;
        this.f45957b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f45956a) {
            case 0:
                this.f45957b.v().Y = (Boolean) obj;
                break;
            default:
                ((androidx.activity.y) obj).getClass();
                this.f45957b.w();
                break;
        }
        return Unit.f26487a;
    }
}
