package h20;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import e20.i0;
import e20.x;
import java.util.ArrayList;
import java.util.Iterator;
import o.c0;
import p.a2;
import p.g0;
import pg.r1;
import pg.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21360b;

    public /* synthetic */ u(Object obj, int i11) {
        this.f21359a = i11;
        this.f21360b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Activity activity;
        int bottom;
        int iA;
        switch (this.f21359a) {
            case 0:
                NavigationView navigationView = (NavigationView) this.f21360b;
                int[] iArr = navigationView.f12514k;
                navigationView.getLocationOnScreen(iArr);
                boolean z11 = true;
                boolean z12 = iArr[1] == 0;
                x xVar = navigationView.f12512i;
                if (xVar.f15721x != z12) {
                    xVar.f15721x = z12;
                    int i11 = (xVar.f15700b.getChildCount() <= 0 && xVar.f15721x) ? xVar.f15723z : 0;
                    NavigationMenuView navigationMenuView = xVar.f15699a;
                    navigationMenuView.setPadding(0, i11, 0, navigationMenuView.getPaddingBottom());
                }
                navigationView.setDrawTopInsetForeground(z12 && navigationView.f12516n);
                boolean z13 = navigationView.getLayoutDirection() == 1;
                int i12 = iArr[0];
                navigationView.setDrawLeftInsetForeground((i12 == 0 || navigationView.getWidth() + i12 == 0) && (!z13 ? !navigationView.f12518p : !navigationView.f12519q));
                Context context = navigationView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity != null) {
                    Rect rectJ = i0.j(activity);
                    navigationView.setDrawBottomInsetForeground((rectJ.height() - navigationView.getHeight() == iArr[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.f12517o);
                    if ((rectJ.width() != iArr[0] && rectJ.width() - navigationView.getWidth() != iArr[0]) || (!z13 ? !navigationView.f12519q : !navigationView.f12518p)) {
                        z11 = false;
                    }
                    navigationView.setDrawRightInsetForeground(z11);
                }
                break;
            case 1:
                o.f fVar = (o.f) this.f21360b;
                ArrayList arrayList = fVar.f31511h;
                if (fVar.a() && arrayList.size() > 0 && !((o.e) arrayList.get(0)).f31502a.f34063y) {
                    View view = fVar.f31517o;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((o.e) it.next()).f31502a.show();
                        }
                    } else {
                        fVar.dismiss();
                    }
                    break;
                }
                break;
            case 2:
                c0 c0Var = (c0) this.f21360b;
                a2 a2Var = c0Var.f31480h;
                if (c0Var.a() && !a2Var.f34063y) {
                    View view2 = c0Var.f31484m;
                    if (view2 != null && view2.isShown()) {
                        a2Var.show();
                    } else {
                        c0Var.dismiss();
                    }
                    break;
                }
                break;
            case 3:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) this.f21360b;
                if (!appCompatSpinner.getInternalPopup().a()) {
                    appCompatSpinner.f2021f.m(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 4:
                g0 g0Var = (g0) this.f21360b;
                AppCompatSpinner appCompatSpinner2 = g0Var.G;
                if (appCompatSpinner2.isAttachedToWindow() && appCompatSpinner2.getGlobalVisibleRect(g0Var.E)) {
                    g0Var.r();
                    g0Var.show();
                } else {
                    g0Var.dismiss();
                }
                break;
            default:
                uk.q qVar = (uk.q) this.f21360b;
                s1 s1Var = qVar.f41370x;
                ((r1) s1Var.f35151e).f35119d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (((r1) s1Var.f35151e).f35119d.getBottom() == 0) {
                    bottom = ((r1) s1Var.f35151e).f35128n.getBottom();
                    iA = d70.b.a(80);
                } else {
                    bottom = ((r1) s1Var.f35151e).f35119d.getBottom();
                    iA = d70.b.a(12);
                }
                int i13 = iA + bottom;
                ViewPropertyAnimator viewPropertyAnimatorAlpha = ((r1) s1Var.f35151e).f35119d.animate().alpha(1.0f);
                c70.b bVar = new c70.b(null, null, 15);
                bVar.f7799c = new mg.h(qVar, i13, 2);
                viewPropertyAnimatorAlpha.setListener(bVar).start();
                break;
        }
    }
}
