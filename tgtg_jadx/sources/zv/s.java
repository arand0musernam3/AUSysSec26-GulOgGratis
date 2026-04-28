package zv;

import com.braze.managers.w;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f48148b;

    public /* synthetic */ s(int i11, w wVar) {
        this.f48147a = i11;
        this.f48148b = wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f48147a) {
            case 0:
                return w.c(this.f48148b);
            case 1:
                return w.a(this.f48148b);
            case 2:
                return w.b(this.f48148b);
            case 3:
                return w.e(this.f48148b);
            default:
                return w.d(this.f48148b);
        }
    }
}
