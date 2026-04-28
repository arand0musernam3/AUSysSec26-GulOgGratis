package jh;

import com.app.tgtg.model.remote.badge.Badge;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f25255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Badge f25256c;

    public /* synthetic */ d(Function1 function1, Badge badge, int i11) {
        this.f25254a = i11;
        this.f25255b = function1;
        this.f25256c = badge;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25254a) {
            case 0:
                this.f25255b.invoke(Integer.valueOf(this.f25256c.getId()));
                break;
            default:
                this.f25255b.invoke(Integer.valueOf(this.f25256c.getId()));
                break;
        }
        return Unit.f26487a;
    }
}
