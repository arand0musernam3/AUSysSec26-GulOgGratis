package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import com.app.tgtg.R;
import p.b1;
import p.b3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f2157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f2159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f2160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f2161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f2162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f2164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f2165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CharSequence f2166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f2167k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f2168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f2170o;

    public h(Toolbar toolbar, boolean z11) {
        Drawable drawable;
        this.f2169n = 0;
        this.f2157a = toolbar;
        this.f2164h = toolbar.getTitle();
        this.f2165i = toolbar.getSubtitle();
        this.f2163g = this.f2164h != null;
        this.f2162f = toolbar.getNavigationIcon();
        j30.g gVarT = j30.g.t(toolbar.getContext(), null, j.a.f24253a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        int i11 = 15;
        this.f2170o = gVarT.k(15);
        if (z11) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f2163g = true;
                this.f2164h = text;
                if ((this.f2158b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f2163g) {
                        ViewCompat.d0(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f2165i = text2;
                if ((this.f2158b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableK = gVarT.k(20);
            if (drawableK != null) {
                this.f2161e = drawableK;
                c();
            }
            Drawable drawableK2 = gVarT.k(17);
            if (drawableK2 != null) {
                this.f2160d = drawableK2;
                c();
            }
            if (this.f2162f == null && (drawable = this.f2170o) != null) {
                this.f2162f = drawable;
                if ((this.f2158b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f2159c;
                if (view != null && (this.f2158b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f2159c = viewInflate;
                if (viewInflate != null && (this.f2158b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f2158b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f2170o = toolbar.getNavigationIcon();
            } else {
                i11 = 11;
            }
            this.f2158b = i11;
        }
        gVarT.v();
        if (R.string.abc_action_bar_up_description != this.f2169n) {
            this.f2169n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i12 = this.f2169n;
                this.f2166j = i12 != 0 ? toolbar.getContext().getString(i12) : null;
                b();
            }
        }
        this.f2166j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new b3(this));
    }

    public final void a(int i11) {
        View view;
        int i12 = this.f2158b ^ i11;
        this.f2158b = i11;
        if (i12 != 0) {
            int i13 = i12 & 4;
            Toolbar toolbar = this.f2157a;
            if (i13 != 0) {
                if ((i11 & 4) != 0) {
                    b();
                }
                if ((this.f2158b & 4) != 0) {
                    Drawable drawable = this.f2162f;
                    if (drawable == null) {
                        drawable = this.f2170o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i12 & 3) != 0) {
                c();
            }
            if ((i12 & 8) != 0) {
                if ((i11 & 8) != 0) {
                    toolbar.setTitle(this.f2164h);
                    toolbar.setSubtitle(this.f2165i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i12 & 16) == 0 || (view = this.f2159c) == null) {
                return;
            }
            if ((i11 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f2158b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f2166j);
            Toolbar toolbar = this.f2157a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f2169n);
            } else {
                toolbar.setNavigationContentDescription(this.f2166j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i11 = this.f2158b;
        if ((i11 & 2) == 0) {
            drawable = null;
        } else if ((i11 & 1) == 0 || (drawable = this.f2161e) == null) {
            drawable = this.f2160d;
        }
        this.f2157a.setLogo(drawable);
    }
}
