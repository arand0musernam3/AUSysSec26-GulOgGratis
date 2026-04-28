package ow;

import com.braze.triggers.actions.c;
import com.braze.triggers.managers.f;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.triggers.events.b f33766b;

    public /* synthetic */ b(com.braze.triggers.events.b bVar, int i11) {
        this.f33765a = i11;
        this.f33766b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f33765a) {
            case 0:
                return c.c(this.f33766b);
            case 1:
                return c.d(this.f33766b);
            case 2:
                return f.e(this.f33766b);
            case 3:
                return f.b(this.f33766b);
            default:
                return f.c(this.f33766b);
        }
    }
}
