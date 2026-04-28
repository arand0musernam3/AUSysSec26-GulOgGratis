package tv;

import com.braze.dispatch.f;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f40481b;

    public /* synthetic */ c(f fVar, int i11) {
        this.f40480a = i11;
        this.f40481b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40480a) {
            case 0:
                return f.a(this.f40481b);
            case 1:
                return f.c(this.f40481b);
            case 2:
                return f.d(this.f40481b);
            default:
                return f.b(this.f40481b);
        }
    }
}
