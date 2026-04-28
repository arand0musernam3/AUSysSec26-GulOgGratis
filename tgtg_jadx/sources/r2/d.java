package r2;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f37545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f37546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f37547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f37548d;

    public d(e eVar, b bVar, b bVar2, View view) {
        this.f37545a = eVar;
        this.f37546b = bVar;
        this.f37547c = bVar2;
        this.f37548d = view;
    }

    public final boolean a(Menu menu) {
        int i11;
        p2.c cVar = (p2.c) this.f37546b.invoke();
        if (Intrinsics.areEqual(cVar, (Object) null)) {
            return false;
        }
        menu.clear();
        List list = cVar.f34130a;
        int size = list.size();
        int i12 = 1;
        int i13 = 1;
        for (int i14 = 0; i14 < size; i14++) {
            p2.b bVar = (p2.b) list.get(i14);
            if (bVar instanceof p2.d) {
                i11 = i12 + 1;
                p2.d dVar = (p2.d) bVar;
                MenuItem menuItemAdd = menu.add(i13, i12, i12, dVar.f34131b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new c(0, dVar, this));
            } else {
                if (bVar instanceof p2.h) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i11 = i12 + 1;
                        p2.h hVar = (p2.h) bVar;
                        p.a(menu, i12, this.f37548d.getContext(), hVar.f34140b, hVar.f34141c);
                    }
                } else if (bVar instanceof p2.f) {
                    i13++;
                }
            }
            i12 = i11;
        }
        return true;
    }
}
