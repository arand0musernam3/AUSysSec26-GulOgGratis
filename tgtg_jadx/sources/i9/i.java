package i9;

import g9.i0;
import g9.s0;
import g9.t0;
import g9.z;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@s0("composable")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Li9/i;", "Lg9/t0;", "Li9/h;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposeNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,142:1\n1863#2,2:143\n*S KotlinDebug\n*F\n+ 1 ComposeNavigator.kt\nandroidx/navigation/compose/ComposeNavigator\n*L\n57#1:143,2\n*E\n"})
public final class i extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f23515c = m3.i.w(Boolean.FALSE);

    @Override // g9.t0
    public final z a() {
        return new h(this, c.f23504a);
    }

    @Override // g9.t0
    public final void d(List list, i0 i0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().i((g9.l) it.next());
        }
        this.f23515c.setValue(Boolean.FALSE);
    }

    @Override // g9.t0
    public final void i(g9.l lVar, boolean z11) {
        b().f(lVar, z11);
        this.f23515c.setValue(Boolean.TRUE);
    }
}
