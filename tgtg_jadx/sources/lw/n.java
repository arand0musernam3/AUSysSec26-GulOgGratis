package lw;

import com.braze.managers.h0;
import com.braze.storage.t1;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.models.k f28325b;

    public /* synthetic */ n(com.braze.models.k kVar, int i11) {
        this.f28324a = i11;
        this.f28325b = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f28324a) {
            case 0:
                return com.braze.storage.j.c(this.f28325b);
            case 1:
                return t1.b(this.f28325b);
            case 2:
                return com.braze.dispatch.h.a(this.f28325b);
            case 3:
                return h0.b(this.f28325b);
            case 4:
                return com.braze.managers.r.b(this.f28325b);
            case 5:
                return com.braze.managers.r.c(this.f28325b);
            case 6:
                return com.braze.managers.r.d(this.f28325b);
            case 7:
                return com.braze.managers.r.e(this.f28325b);
            default:
                return com.braze.managers.r.f(this.f28325b);
        }
    }
}
