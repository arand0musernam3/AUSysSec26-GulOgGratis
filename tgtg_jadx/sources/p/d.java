package p;

import android.content.Context;
import android.view.View;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o.v {
    public final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.a f33874m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.widget.a aVar, Context context, o.d0 d0Var, View view) {
        super(context, d0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f33874m = aVar;
        if ((d0Var.A.f31592x & 32) != 32) {
            View view2 = aVar.f2128j;
            this.f31610e = view2 == null ? (View) aVar.f31499h : view2;
        }
        m1.a aVar2 = aVar.f2141x;
        this.f31613h = aVar2;
        o.t tVar = this.f31614i;
        if (tVar != null) {
            tVar.j(aVar2);
        }
    }

    @Override // o.v
    public final void c() {
        switch (this.l) {
            case 0:
                androidx.appcompat.widget.a aVar = this.f33874m;
                aVar.f2138u = null;
                aVar.f2142y = 0;
                super.c();
                break;
            default:
                androidx.appcompat.widget.a aVar2 = this.f33874m;
                o.l lVar = aVar2.f31494c;
                if (lVar != null) {
                    lVar.c(true);
                }
                aVar2.f2137t = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.widget.a aVar, Context context, o.l lVar, View view) {
        super(context, lVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f33874m = aVar;
        this.f31611f = 8388613;
        m1.a aVar2 = aVar.f2141x;
        this.f31613h = aVar2;
        o.t tVar = this.f31614i;
        if (tVar != null) {
            tVar.j(aVar2);
        }
    }
}
