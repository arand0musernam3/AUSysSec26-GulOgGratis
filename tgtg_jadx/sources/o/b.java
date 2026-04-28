package o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends n1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31472j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f31473k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f31473k = actionMenuItemView;
    }

    @Override // p.n1
    public final b0 b() {
        p.d dVar;
        switch (this.f31472j) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f31473k).f1908f;
                if (cVar == null || (dVar = ((p.e) cVar).f33878a.f2138u) == null) {
                    return null;
                }
                return dVar.a();
            default:
                p.d dVar2 = ((p.g) this.f31473k).f33898a.f2137t;
                if (dVar2 == null) {
                    return null;
                }
                return dVar2.a();
        }
    }

    @Override // p.n1
    public final boolean c() {
        b0 b0VarB;
        switch (this.f31472j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f31473k;
                k kVar = actionMenuItemView.f1906d;
                return kVar != null && kVar.c(actionMenuItemView.f1903a) && (b0VarB = b()) != null && b0VarB.a();
            default:
                ((p.g) this.f31473k).f33898a.n();
                return true;
        }
    }

    @Override // p.n1
    public boolean d() {
        switch (this.f31472j) {
            case 1:
                androidx.appcompat.widget.a aVar = ((p.g) this.f31473k).f33898a;
                if (aVar.f2139v != null) {
                    return false;
                }
                aVar.g();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p.g gVar, p.g gVar2) {
        super(gVar2);
        this.f31473k = gVar;
    }
}
