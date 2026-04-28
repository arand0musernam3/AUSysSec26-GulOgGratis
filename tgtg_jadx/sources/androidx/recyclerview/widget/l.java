package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f3811c;

    public /* synthetic */ l(r rVar, ArrayList arrayList, int i11) {
        this.f3809a = i11;
        this.f3811c = rVar;
        this.f3810b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3809a) {
            case 0:
                ArrayList arrayList = this.f3810b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    r rVar = this.f3811c;
                    if (!zHasNext) {
                        arrayList.clear();
                        rVar.f3893m.remove(arrayList);
                    } else {
                        q qVar = (q) it.next();
                        r2 r2Var = qVar.f3875a;
                        int i11 = qVar.f3876b;
                        int i12 = qVar.f3877c;
                        int i13 = qVar.f3878d;
                        int i14 = qVar.f3879e;
                        rVar.getClass();
                        View view = r2Var.itemView;
                        int i15 = i13 - i11;
                        int i16 = i14 - i12;
                        if (i15 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i16 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        rVar.f3896p.add(r2Var);
                        viewPropertyAnimatorAnimate.setDuration(rVar.f3916e).setListener(new n(rVar, r2Var, i15, view, i16, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = this.f3810b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    r rVar2 = this.f3811c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        rVar2.l.remove(arrayList2);
                    } else {
                        r2 r2Var2 = (r2) it2.next();
                        rVar2.getClass();
                        View view2 = r2Var2.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        rVar2.f3895o.add(r2Var2);
                        viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(rVar2.f3914c).setListener(new m(rVar2, r2Var2, view2, viewPropertyAnimatorAnimate2)).start();
                    }
                    break;
                }
                break;
        }
    }
}
