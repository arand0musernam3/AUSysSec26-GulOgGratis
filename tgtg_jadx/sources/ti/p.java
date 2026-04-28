package ti;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f40255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40256b;

    public p(s sVar, int i11) {
        this.f40255a = sVar;
        this.f40256b = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DayOfWeek dayOfWeekOf = DayOfWeek.of(this.f40256b + 1);
        dayOfWeekOf.getClass();
        s sVar = this.f40255a;
        sVar.getClass();
        a2 a2Var = sVar.f40264e;
        ArrayList arrayListT0 = CollectionsKt.t0((Collection) a2Var.getValue());
        if (arrayListT0.contains(dayOfWeekOf)) {
            arrayListT0.remove(dayOfWeekOf);
        } else {
            arrayListT0.add(dayOfWeekOf);
        }
        a2Var.k(null, arrayListT0);
        sVar.b(new sr.r(20));
        return Unit.f26487a;
    }
}
