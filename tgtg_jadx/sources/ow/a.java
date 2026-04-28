package ow;

import com.braze.triggers.actions.c;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f33764b;

    public /* synthetic */ a(c cVar, int i11) {
        this.f33763a = i11;
        this.f33764b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f33763a) {
            case 0:
                return c.b(this.f33764b);
            default:
                return c.a(this.f33764b);
        }
    }
}
