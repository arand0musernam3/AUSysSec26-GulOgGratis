package zv;

import com.braze.managers.w;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.models.n f48150b;

    public /* synthetic */ t(com.braze.models.n nVar, int i11) {
        this.f48149a = i11;
        this.f48150b = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f48149a) {
            case 0:
                return w.b(this.f48150b);
            case 1:
                return w.c(this.f48150b);
            case 2:
                return w.d(this.f48150b);
            case 3:
                return w.f(this.f48150b);
            case 4:
                return w.a(this.f48150b);
            default:
                return w.e(this.f48150b);
        }
    }
}
