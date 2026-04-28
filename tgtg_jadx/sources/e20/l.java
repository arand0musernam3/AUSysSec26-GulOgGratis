package e20;

import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends o.l {
    @Override // o.l, android.view.Menu
    public final SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        o.n nVarA = a(i11, i12, i13, charSequence);
        y yVar = new y(this.f31544a, this, nVarA);
        nVarA.f31583o = yVar;
        yVar.setHeaderTitle(nVarA.f31574e);
        return yVar;
    }
}
