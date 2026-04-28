package com.app.tgtg.customview;

import a3.x0;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.f0;
import ax.s;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import ft.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mv.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.g;
import pg.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class DiscoverLocationView extends FrameLayout implements LifecycleOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f8889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f8890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f8891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverLocationView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        int i13 = 1;
        this.f8889a = new f0(this, true);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.discover_location_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i14 = R.id.chevron;
        if (((ImageView) g.t(R.id.chevron, viewInflate)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i14 = R.id.ivMapMarker;
            ImageView imageView = (ImageView) g.t(R.id.ivMapMarker, viewInflate);
            if (imageView != null) {
                i14 = R.id.tvAddress;
                TextView textView = (TextView) g.t(R.id.tvAddress, viewInflate);
                if (textView != null) {
                    i14 = R.id.tvLocationTitle;
                    TextView textView2 = (TextView) g.t(R.id.tvLocationTitle, viewInflate);
                    if (textView2 != null) {
                        this.f8890b = new k(constraintLayout, constraintLayout, imageView, textView, textView2, 1);
                        if (constraintLayout != null) {
                            constraintLayout.setOnClickListener(new s(this, i13));
                            return;
                        }
                        return;
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
        throw null;
    }

    public static Unit a(DiscoverLocationView discoverLocationView, String str) {
        str.getClass();
        k kVar = discoverLocationView.f8890b;
        if (kVar != null) {
            TextView textView = (TextView) kVar.f34931e;
            TextView textView2 = (TextView) kVar.f34932f;
            String strR = c.r();
            int iHashCode = strR.hashCode();
            if (iHashCode != 144935802) {
                if (iHashCode != 279677154) {
                    if (iHashCode == 1883980571 && strR.equals(AppConstants.LOCATION_PICKER_NO_SELECTED_LOCATION)) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) kVar.f34929c;
                        constraintLayout.getClass();
                        constraintLayout.setVisibility(8);
                        c.l0(null);
                    }
                } else if (strR.equals(AppConstants.LOCATION_PICKER_YOUR_LOCATION)) {
                    textView2.setText(discoverLocationView.getResources().getString(R.string.location_picker_your_location));
                    textView.setText(str);
                    discoverLocationView.setLocationIcon(R.drawable.ic_near_me_location);
                }
            } else if (strR.equals(AppConstants.LOCATION_PICKER_SELECTED_LOCATION)) {
                textView2.setText(discoverLocationView.getResources().getString(R.string.location_picker_chosen_location));
                textView.setText(str);
                discoverLocationView.setLocationIcon(R.drawable.ic_my_location);
            }
        }
        return Unit.f26487a;
    }

    private final void setLocationIcon(int i11) {
        k kVar = this.f8890b;
        if (kVar != null) {
            ((ImageView) kVar.f34930d).setBackground(getContext().getDrawable(i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[PHI: r0
      0x0082: PHI (r0v6 java.lang.String) = (r0v4 java.lang.String), (r0v7 java.lang.String) binds: [B:27:0x008c, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setNewLocationHeaderView(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.customview.DiscoverLocationView.setNewLocationHeaderView(java.lang.String):void");
    }

    public static /* synthetic */ void setupLocation$default(DiscoverLocationView discoverLocationView, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        discoverLocationView.setupLocation(z11, str);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.f8889a;
    }

    @Nullable
    public final Function0<Unit> getOnChangeLocation() {
        return this.f8891c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8889a.i(Lifecycle.State.RESUMED);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8889a.i(Lifecycle.State.DESTROYED);
    }

    public final void setOnChangeLocation(@Nullable Function0<Unit> function0) {
        this.f8891c = function0;
    }

    public final void setupLocation(boolean z11, @Nullable String str) {
        if (z11) {
            if (str == null) {
                str = "";
            }
            setNewLocationHeaderView(str);
        } else {
            SharedPreferences sharedPreferencesX = c.x();
            String strD = c.d();
            String string = getResources().getString(R.string.location_picker_your_location);
            string.getClass();
            sharedPreferencesX.getClass();
            new o0(sharedPreferencesX, strD, string).e(this, new al.c(new x0(this, 12), 2));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverLocationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverLocationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverLocationView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ DiscoverLocationView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
