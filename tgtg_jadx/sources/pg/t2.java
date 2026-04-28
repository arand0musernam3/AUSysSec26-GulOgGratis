package pg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.app.tgtg.R;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35164a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f35165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f35166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f35167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f35168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f35169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f35170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f35171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewGroup f35172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f35173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f35174k;

    public t2(ConstraintLayout constraintLayout, LinearLayout linearLayout, View view, TextView textView, FrameLayout frameLayout, TextView textView2, LinearLayout linearLayout2, LinearLayout linearLayout3, View view2, TextView textView3) {
        this.f35165b = constraintLayout;
        this.f35166c = linearLayout;
        this.f35167d = view;
        this.f35168e = textView;
        this.f35169f = frameLayout;
        this.f35170g = textView2;
        this.f35171h = linearLayout2;
        this.f35172i = linearLayout3;
        this.f35173j = view2;
        this.f35174k = textView3;
    }

    public static t2 a(LayoutInflater layoutInflater, bq.c cVar) {
        View viewInflate = layoutInflater.inflate(R.layout.store_view_description, (ViewGroup) cVar, false);
        cVar.addView(viewInflate);
        int i11 = R.id.badgeLayout;
        LinearLayout linearLayout = (LinearLayout) pd.g.t(R.id.badgeLayout, viewInflate);
        if (linearLayout != null) {
            i11 = R.id.badgeSeparator;
            View viewT = pd.g.t(R.id.badgeSeparator, viewInflate);
            if (viewT != null) {
                i11 = R.id.description;
                TextView textView = (TextView) pd.g.t(R.id.description, viewInflate);
                if (textView != null) {
                    i11 = R.id.descriptionMapViewContainer;
                    FrameLayout frameLayout = (FrameLayout) pd.g.t(R.id.descriptionMapViewContainer, viewInflate);
                    if (frameLayout != null) {
                        i11 = R.id.legalAbout;
                        TextView textView2 = (TextView) pd.g.t(R.id.legalAbout, viewInflate);
                        if (textView2 != null) {
                            i11 = R.id.mealSavedLayout;
                            LinearLayout linearLayout2 = (LinearLayout) pd.g.t(R.id.mealSavedLayout, viewInflate);
                            if (linearLayout2 != null) {
                                i11 = R.id.monthOnPlatformLayout;
                                LinearLayout linearLayout3 = (LinearLayout) pd.g.t(R.id.monthOnPlatformLayout, viewInflate);
                                if (linearLayout3 != null) {
                                    i11 = R.id.onClickLayout;
                                    View viewT2 = pd.g.t(R.id.onClickLayout, viewInflate);
                                    if (viewT2 != null) {
                                        i11 = R.id.title;
                                        TextView textView3 = (TextView) pd.g.t(R.id.title, viewInflate);
                                        if (textView3 != null) {
                                            return new t2((ConstraintLayout) viewInflate, linearLayout, viewT, textView, frameLayout, textView2, linearLayout2, linearLayout3, viewT2, textView3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f35164a) {
        }
        return this.f35165b;
    }

    public t2(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, Button button4, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, TabLayout tabLayout, ViewPager2 viewPager2, ComposeView composeView) {
        this.f35165b = constraintLayout;
        this.f35167d = button;
        this.f35168e = button2;
        this.f35169f = button3;
        this.f35170g = button4;
        this.f35166c = constraintLayout2;
        this.f35171h = appCompatImageView;
        this.f35172i = tabLayout;
        this.f35173j = viewPager2;
        this.f35174k = composeView;
    }
}
