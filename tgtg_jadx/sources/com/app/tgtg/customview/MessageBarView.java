package com.app.tgtg.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bg.f0;
import c50.w;
import com.app.tgtg.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.g;
import pg.e2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class MessageBarView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8911b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e2 f8912a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.message_bar_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i12 = R.id.icon;
        ImageView imageView = (ImageView) g.t(R.id.icon, viewInflate);
        if (imageView != null) {
            i12 = R.id.label;
            TextView textView = (TextView) g.t(R.id.label, viewInflate);
            if (textView != null) {
                this.f8912a = new e2((ConstraintLayout) viewInflate, imageView, textView);
                return;
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
        throw null;
    }

    public final void a() {
        this.f8912a.f34844b.setImageResource(R.drawable.system_icon_heart_active_primary_30);
        this.f8912a.f34845c.setText(getContext().getString(R.string.added_to_favorites_snack_message));
        setAlpha(0.0f);
        setTranslationY(-10.0f);
        setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
        viewPropertyAnimatorAnimate.setDuration(200L);
        viewPropertyAnimatorAnimate.alpha(1.0f);
        viewPropertyAnimatorAnimate.translationY(0.0f);
        viewPropertyAnimatorAnimate.setStartDelay(0L);
        viewPropertyAnimatorAnimate.withEndAction(new f0(this, 0));
        viewPropertyAnimatorAnimate.start();
    }

    @NotNull
    public final e2 getBinding() {
        return this.f8912a;
    }

    public final void setBinding(@NotNull e2 e2Var) {
        e2Var.getClass();
        this.f8912a = e2Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageBarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ MessageBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
