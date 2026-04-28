package is;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f24151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24152c;

    public a(boolean z11, c cVar, boolean z12) {
        this.f24150a = z11;
        this.f24151b = cVar;
        this.f24152c = z12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f24150a) {
            this.f24151b.invoke(Boolean.valueOf(!this.f24152c));
        }
        return Unit.f26487a;
    }
}
