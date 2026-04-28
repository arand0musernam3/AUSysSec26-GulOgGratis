package pg;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f2 extends a8.k {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f34861y = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TabLayout f34862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ViewPager2 f34863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AppCompatButton f34864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AppCompatButton f34865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AppCompatButton f34866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AppCompatImageView f34867x;

    public f2(a8.b bVar, View view, TabLayout tabLayout, ViewPager2 viewPager2, AppCompatButton appCompatButton, AppCompatButton appCompatButton2, AppCompatButton appCompatButton3, AppCompatImageView appCompatImageView) {
        super(0, view, bVar);
        this.f34862s = tabLayout;
        this.f34863t = viewPager2;
        this.f34864u = appCompatButton;
        this.f34865v = appCompatButton2;
        this.f34866w = appCompatButton3;
        this.f34867x = appCompatImageView;
    }
}
