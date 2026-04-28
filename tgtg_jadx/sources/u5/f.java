package u5;

import android.text.style.ClickableSpan;
import android.view.View;
import m5.o;
import m5.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f40787a;

    public f(o oVar) {
        this.f40787a = oVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        o oVar = this.f40787a;
        p pVarA = oVar.a();
        if (pVarA != null) {
            pVarA.a(oVar);
        }
    }
}
