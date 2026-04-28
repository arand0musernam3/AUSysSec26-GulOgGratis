package ad;

import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import com.app.tgtg.model.remote.item.response.BasicItem;
import g3.ea;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lh.w;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1232d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i11) {
        this.f1229a = i11;
        this.f1230b = obj;
        this.f1231c = obj2;
        this.f1232d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1229a) {
            case 0:
                f fVar = (f) this.f1230b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f1231c;
                k kVar = (k) this.f1232d;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(kVar);
                } else {
                    fVar.f1225a.getViewTreeObserver().removeOnPreDrawListener(kVar);
                }
                break;
            case 1:
                KeyEvent keyEvent = ((u4.b) obj).f40734a;
                b1 b1Var = (b1) this.f1231c;
                ea eaVar = (ea) this.f1230b;
                if (!eaVar.b()) {
                    b1Var.setValue(Boolean.FALSE);
                } else if (u4.c.c(keyEvent) == 2 && u4.a.a(u4.c.a(keyEvent.getKeyCode()), u4.a.f40728u)) {
                    ((b1) this.f1232d).setValue(Boolean.FALSE);
                    eaVar.a();
                }
                break;
            case 2:
                ((BasicItem) obj).getClass();
                jd.f fVar2 = (jd.f) this.f1230b;
                BasicItem basicItem = (BasicItem) this.f1231c;
                String str = (String) this.f1232d;
                fVar2.getClass();
                basicItem.getClass();
                w wVar = (w) fVar2.f24983b;
                wVar.f27834f.i(new lh.d(basicItem, str));
                break;
            default:
                ud.f fVar3 = (ud.f) this.f1230b;
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.f1231c;
                k kVar2 = (k) this.f1232d;
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnPreDrawListener(kVar2);
                } else {
                    fVar3.f41058a.getViewTreeObserver().removeOnPreDrawListener(kVar2);
                }
                break;
        }
        return Unit.f26487a;
    }
}
