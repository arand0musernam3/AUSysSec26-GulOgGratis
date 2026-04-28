package h20;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.l f21308a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21310c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21311d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21312e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f21309b = new ArrayList();

    public j(o.l lVar) {
        this.f21308a = lVar;
        b();
    }

    public final MenuItem a(int i11) {
        return (MenuItem) this.f21309b.get(i11);
    }

    public final void b() {
        ArrayList arrayList = this.f21309b;
        arrayList.clear();
        this.f21310c = 0;
        this.f21311d = 0;
        this.f21312e = 0;
        int i11 = 0;
        while (true) {
            o.l lVar = this.f21308a;
            if (i11 >= lVar.f31549f.size()) {
                break;
            }
            MenuItem item = lVar.getItem(i11);
            if (item.hasSubMenu()) {
                if (!arrayList.isEmpty() && !(j4.s.d(1, arrayList) instanceof a) && item.isVisible()) {
                    arrayList.add(new a());
                }
                arrayList.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i12 = 0; i12 < subMenu.size(); i12++) {
                    MenuItem item2 = subMenu.getItem(i12);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    arrayList.add(item2);
                    this.f21310c++;
                    if (item2.isVisible()) {
                        this.f21311d++;
                    }
                }
                arrayList.add(new a());
            } else {
                arrayList.add(item);
                this.f21310c++;
                if (item.isVisible()) {
                    this.f21311d++;
                    this.f21312e++;
                }
            }
            i11++;
        }
        if (arrayList.isEmpty() || !(j4.s.d(1, arrayList) instanceof a)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
    }
}
