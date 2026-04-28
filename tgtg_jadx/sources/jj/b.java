package jj;

import b4.q;
import b4.t;
import bn.p;
import com.app.tgtg.model.remote.mapService.response.FilterCategory;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import java.util.List;
import java.util.Set;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m3.n;
import m3.s;
import m3.w1;
import u3.e;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f25289a = d0.h(new FilterCategory("meals", "Meals", (String) null, (String) null, 12, (DefaultConstructorMarker) null), new FilterCategory("groceries", "Groceries", (String) null, (String) null, 12, (DefaultConstructorMarker) null), new FilterCategory("baked", "Baked goods", (String) null, (String) null, 12, (DefaultConstructorMarker) null), new FilterCategory("plants", "Plant & flowers", (String) null, (String) null, 12, (DefaultConstructorMarker) null), new FilterCategory("pet", "Pet food", (String) null, (String) null, 12, (DefaultConstructorMarker) null), new FilterCategory("other", "Other", (String) null, (String) null, 12, (DefaultConstructorMarker) null));

    public static final void a(List list, Set set, Function1 function1, t tVar, n nVar, int i11) {
        t tVar2;
        list.getClass();
        set.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(-860235338);
        int i12 = (sVar.h(list) ? 4 : 2) | i11 | (sVar.h(set) ? 32 : 16) | (sVar.h(function1) ? 256 : 128) | 3072;
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            PantryThemeKt.PantryTheme(false, null, e.e(-1391484296, sVar, new p((m) sVar.j(PantryThemeKt.getLocalPantrySpacing()), list, function1, set)), sVar, 390, 2);
            tVar2 = q.f5711a;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a(list, set, function1, tVar2, i11, 0);
        }
    }
}
