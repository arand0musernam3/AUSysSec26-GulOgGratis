package zv;

import com.braze.managers.k0;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f48126b;

    public /* synthetic */ j(k0 k0Var, int i11) {
        this.f48125a = i11;
        this.f48126b = k0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f48125a) {
            case 0:
                return k0.b(this.f48126b);
            default:
                return k0.a(this.f48126b);
        }
    }
}
