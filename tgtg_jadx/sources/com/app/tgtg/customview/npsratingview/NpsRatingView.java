package com.app.tgtg.customview.npsratingview;

import ae.c;
import ak.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import c50.w;
import com.app.tgtg.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m0.i1;
import mg.a;
import mg.h;
import mg.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.g;
import pg.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class NpsRatingView extends LinearLayout implements i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8945e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f8946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f8947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f8948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8949d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NpsRatingView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.nps_rating_root, (ViewGroup) this, false);
        int i11 = R.id.aboutTabLayout;
        TabLayout tabLayout = (TabLayout) g.t(R.id.aboutTabLayout, viewInflate);
        if (tabLayout != null) {
            i11 = R.id.npsViewPager2;
            ViewPager2 viewPager2 = (ViewPager2) g.t(R.id.npsViewPager2, viewInflate);
            if (viewPager2 != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.f8946a = new b1(linearLayout, tabLayout, viewPager2, linearLayout, 2);
                addView(linearLayout);
                viewPager2.b(new gl.i(this, 2));
                return;
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        throw null;
    }

    public final void a(ArrayList arrayList, int i11, i iVar) {
        arrayList.getClass();
        this.f8948c = new ArrayList(arrayList);
        this.f8947b = iVar;
        b1 b1Var = this.f8946a;
        LinearLayout linearLayout = (LinearLayout) b1Var.f34794b;
        linearLayout.getClass();
        linearLayout.setAlpha(1.0f);
        linearLayout.setScaleX(1.0f);
        linearLayout.setScaleY(1.0f);
        b bVar = new b(this, new ArrayList(arrayList));
        ViewPager2 viewPager2 = (ViewPager2) b1Var.f34797e;
        viewPager2.setAdapter(bVar);
        if (i11 >= 0 && i11 < arrayList.size()) {
            viewPager2.setCurrentItem(i11);
        }
        int size = arrayList.size();
        TabLayout tabLayout = (TabLayout) b1Var.f34796d;
        if (size > 1) {
            new c(tabLayout, viewPager2, new i1(4)).b();
        } else {
            tabLayout.setVisibility(8);
            viewPager2.setPadding(0, 0, 0, d70.b.a(16));
        }
    }

    @Override // mg.i
    public final void c(int i11) {
        if (this.f8949d) {
            return;
        }
        b1 b1Var = this.f8946a;
        LinearLayout linearLayout = (LinearLayout) b1Var.f34795c;
        LinearLayout linearLayout2 = (LinearLayout) b1Var.f34794b;
        linearLayout.requestFocus();
        Object systemService = linearLayout2.getContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(linearLayout2.getWindowToken(), 0);
        ArrayList arrayList = this.f8948c;
        i iVar = null;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ratingList");
            arrayList = null;
        }
        if (arrayList.size() <= 1) {
            this.f8949d = true;
            linearLayout2.getClass();
            linearLayout2.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(100L).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new c70.b(null, new h(this, i11, 0), 13)).start();
        } else {
            i iVar2 = this.f8947b;
            if (iVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parentRatingCallback");
            } else {
                iVar = iVar2;
            }
            iVar.c(i11);
        }
    }

    @Override // mg.i
    public final void q(a aVar, int i11) {
        aVar.getClass();
        i iVar = this.f8947b;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("parentRatingCallback");
            iVar = null;
        }
        iVar.q(aVar, i11);
    }

    public /* synthetic */ NpsRatingView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }
}
