package gl;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.app.tgtg.R;
import com.app.tgtg.customview.npsratingview.NpsRatingView;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.about.ManufacturerAboutActivity;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import mv.m0;
import pg.f2;
import pg.t2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends wa.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20543b;

    public i() {
        this.f20542a = 4;
        this.f20543b = new ArrayList(3);
    }

    @Override // wa.i
    public void a(int i11) {
        switch (this.f20542a) {
            case 3:
                ((va.c) this.f20543b).b(false);
                break;
            case 4:
                try {
                    Iterator it = ((ArrayList) this.f20543b).iterator();
                    while (it.hasNext()) {
                        ((wa.i) it.next()).a(i11);
                        break;
                    }
                } catch (ConcurrentModificationException e5) {
                    wy.o.k("Adding and removing callbacks during dispatch to callbacks is not supported", e5);
                    return;
                }
                break;
        }
    }

    @Override // wa.i
    public void b(int i11, float f11, int i12) {
        switch (this.f20542a) {
            case 4:
                try {
                    Iterator it = ((ArrayList) this.f20543b).iterator();
                    while (it.hasNext()) {
                        ((wa.i) it.next()).b(i11, f11, i12);
                        break;
                    }
                } catch (ConcurrentModificationException e5) {
                    wy.o.k("Adding and removing callbacks during dispatch to callbacks is not supported", e5);
                    return;
                }
                break;
        }
    }

    @Override // wa.i
    public final void c(int i11) {
        int i12 = this.f20542a;
        ArrayList arrayList = null;
        Object obj = this.f20543b;
        switch (i12) {
            case 0:
                l lVar = (l) obj;
                if (i11 == 2) {
                    m0 m0Var = sa0.a.f38953a;
                    m0Var.h("OnboardingSurvey");
                    m0Var.c("Page changed to last page (2)", new Object[0]);
                }
                q qVarR = lVar.r();
                if (i11 == 0) {
                    qVarR.f20571e.d(cv.i.SCREEN_ONBOARDING, dv.a.SOURCE, "Its_A_Surprise");
                }
                l.o(lVar);
                boolean z11 = i11 == 0;
                t2 t2Var = lVar.f20556h;
                t2Var.getClass();
                boolean z12 = !z11;
                l.u((Button) t2Var.f35167d, z12);
                t2 t2Var2 = lVar.f20556h;
                t2Var2.getClass();
                l.u((Button) t2Var2.f35168e, z11);
                t2 t2Var3 = lVar.f20556h;
                t2Var3.getClass();
                l.u((Button) t2Var3.f35170g, z12);
                if (i11 == 1 && lVar.f20557i) {
                    t2 t2Var4 = lVar.f20556h;
                    t2Var4.getClass();
                    AppCompatImageView appCompatImageView = (AppCompatImageView) t2Var4.f35171h;
                    appCompatImageView.setAlpha(0.0f);
                    appCompatImageView.animate().alpha(1.0f).setDuration(700L).start();
                    lVar.f20557i = false;
                    break;
                }
                break;
            case 1:
                lm.i iVar = (lm.i) obj;
                pg.b bVar = iVar.f27926p;
                if (i11 == 0) {
                    bVar.getClass();
                    s20.g gVarH = ((TabLayout) bVar.f34790k).h(0);
                    if (gVarH != null) {
                        mm.a aVar = iVar.f27923m;
                        if (aVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
                            aVar = null;
                        }
                        pg.b bVar2 = iVar.f27926p;
                        bVar2.getClass();
                        s20.g gVarH2 = ((TabLayout) bVar2.f34790k).h(0);
                        View view = gVarH2 != null ? gVarH2.f38792e : null;
                        view.getClass();
                        aVar.k(0, view);
                        gVarH.a(view);
                    }
                    pg.b bVar3 = iVar.f27926p;
                    bVar3.getClass();
                    s20.g gVarH3 = ((TabLayout) bVar3.f34790k).h(1);
                    if (gVarH3 != null) {
                        mm.a aVar2 = iVar.f27923m;
                        if (aVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
                            aVar2 = null;
                        }
                        pg.b bVar4 = iVar.f27926p;
                        bVar4.getClass();
                        s20.g gVarH4 = ((TabLayout) bVar4.f34790k).h(1);
                        View view2 = gVarH4 != null ? gVarH4.f38792e : null;
                        view2.getClass();
                        aVar2.l(1, view2);
                        gVarH3.a(view2);
                    }
                    ft.c.H(0);
                    iVar.f27921j = 0;
                    iVar.y(true);
                } else {
                    bVar.getClass();
                    s20.g gVarH5 = ((TabLayout) bVar.f34790k).h(0);
                    if (gVarH5 != null) {
                        mm.a aVar3 = iVar.f27923m;
                        if (aVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
                            aVar3 = null;
                        }
                        pg.b bVar5 = iVar.f27926p;
                        bVar5.getClass();
                        s20.g gVarH6 = ((TabLayout) bVar5.f34790k).h(0);
                        View view3 = gVarH6 != null ? gVarH6.f38792e : null;
                        view3.getClass();
                        aVar3.l(0, view3);
                        gVarH5.a(view3);
                    }
                    pg.b bVar6 = iVar.f27926p;
                    bVar6.getClass();
                    s20.g gVarH7 = ((TabLayout) bVar6.f34790k).h(1);
                    if (gVarH7 != null) {
                        mm.a aVar4 = iVar.f27923m;
                        if (aVar4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewPagerAdapter");
                            aVar4 = null;
                        }
                        pg.b bVar7 = iVar.f27926p;
                        bVar7.getClass();
                        s20.g gVarH8 = ((TabLayout) bVar7.f34790k).h(1);
                        View view4 = gVarH8 != null ? gVarH8.f38792e : null;
                        view4.getClass();
                        aVar4.k(1, view4);
                        gVarH7.a(view4);
                    }
                    ft.c.H(1);
                    iVar.f27921j = 1;
                    iVar.y(false);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                if (i11 == 0) {
                    layoutParams.addRule(3, R.id.sortByView);
                } else {
                    layoutParams.addRule(10);
                    layoutParams.addRule(12);
                }
                pg.b bVar8 = iVar.f27926p;
                bVar8.getClass();
                ((ViewPager2) bVar8.f34783d).setLayoutParams(layoutParams);
                break;
            case 2:
                NpsRatingView npsRatingView = (NpsRatingView) obj;
                if (i11 >= 0) {
                    ArrayList arrayList2 = npsRatingView.f8948c;
                    if (arrayList2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ratingList");
                        arrayList2 = null;
                    }
                    if (arrayList2.size() > i11) {
                        mg.i iVar2 = npsRatingView.f8947b;
                        if (iVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("parentRatingCallback");
                            iVar2 = null;
                        }
                        ArrayList arrayList3 = npsRatingView.f8948c;
                        if (arrayList3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ratingList");
                        } else {
                            arrayList = arrayList3;
                        }
                        iVar2.q((mg.a) arrayList.get(i11), i11);
                    }
                }
                break;
            case 3:
                ((va.c) obj).b(false);
                break;
            case 4:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((wa.i) it.next()).c(i11);
                        break;
                    }
                } catch (ConcurrentModificationException e5) {
                    wy.o.k("Adding and removing callbacks during dispatch to callbacks is not supported", e5);
                    return;
                }
                break;
            default:
                ManufacturerAboutActivity manufacturerAboutActivity = (ManufacturerAboutActivity) obj;
                if (i11 == 0) {
                    f2 f2Var = manufacturerAboutActivity.f9121e;
                    f2Var.getClass();
                    AppCompatButton appCompatButton = f2Var.f34864u;
                    appCompatButton.getClass();
                    appCompatButton.setVisibility(8);
                    manufacturerAboutActivity.f9123g = true;
                    break;
                } else {
                    f2 f2Var2 = manufacturerAboutActivity.f9121e;
                    if (i11 == 2) {
                        f2Var2.getClass();
                        AppCompatButton appCompatButton2 = f2Var2.f34865v;
                        appCompatButton2.getClass();
                        p30.b.E(appCompatButton2, true);
                        f2 f2Var3 = manufacturerAboutActivity.f9121e;
                        f2Var3.getClass();
                        AppCompatButton appCompatButton3 = f2Var3.f34864u;
                        appCompatButton3.getClass();
                        appCompatButton3.setVisibility(8);
                        f2 f2Var4 = manufacturerAboutActivity.f9121e;
                        f2Var4.getClass();
                        AppCompatButton appCompatButton4 = f2Var4.f34866w;
                        appCompatButton4.getClass();
                        appCompatButton4.setVisibility(8);
                        f2 f2Var5 = manufacturerAboutActivity.f9121e;
                        f2Var5.getClass();
                        AppCompatButton appCompatButton5 = f2Var5.f34865v;
                        appCompatButton5.getClass();
                        appCompatButton5.setAlpha(0.0f);
                        appCompatButton5.animate().alpha(1.0f).setDuration(700L).start();
                        break;
                    } else {
                        f2Var2.getClass();
                        AppCompatButton appCompatButton6 = f2Var2.f34864u;
                        appCompatButton6.getClass();
                        p30.b.E(appCompatButton6, true);
                        f2 f2Var6 = manufacturerAboutActivity.f9121e;
                        f2Var6.getClass();
                        AppCompatButton appCompatButton7 = f2Var6.f34866w;
                        appCompatButton7.getClass();
                        p30.b.E(appCompatButton7, true);
                        f2 f2Var7 = manufacturerAboutActivity.f9121e;
                        f2Var7.getClass();
                        AppCompatButton appCompatButton8 = f2Var7.f34865v;
                        appCompatButton8.getClass();
                        appCompatButton8.setVisibility(8);
                        if (i11 == 1 && manufacturerAboutActivity.f9123g) {
                            f2 f2Var8 = manufacturerAboutActivity.f9121e;
                            f2Var8.getClass();
                            AppCompatButton appCompatButton9 = f2Var8.f34864u;
                            appCompatButton9.getClass();
                            appCompatButton9.setAlpha(0.0f);
                            appCompatButton9.animate().alpha(1.0f).setDuration(700L).start();
                            manufacturerAboutActivity.f9123g = false;
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ i(Object obj, int i11) {
        this.f20542a = i11;
        this.f20543b = obj;
    }
}
