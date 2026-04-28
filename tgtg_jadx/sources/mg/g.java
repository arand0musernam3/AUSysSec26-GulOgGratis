package mg;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.r2;
import c1.q;
import com.app.tgtg.R;
import com.app.tgtg.customview.npsratingview.NpsRatingView;
import java.util.ArrayList;
import pg.p2;
import zendesk.messaging.android.internal.conversationscreen.ConversationFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f29951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView[] f29952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NpsRatingView f29954d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p2 p2Var, ArrayList arrayList) {
        super(p2Var.f986f);
        p2Var.getClass();
        arrayList.getClass();
        this.f29951a = p2Var;
        this.f29952b = new TextView[0];
        this.f29953c = true;
    }

    public static void a(TextView textView, boolean z11) {
        Resources resources = textView.getResources();
        int i11 = z11 ? R.color.neutral_10 : R.color.neutral_80;
        ThreadLocal threadLocal = w6.j.f43256a;
        textView.setTextColor(resources.getColor(i11, null));
        Drawable background = textView.getBackground();
        background.getClass();
        ((GradientDrawable) background).setColor(textView.getResources().getColor(z11 ? R.color.primary_30 : R.color.opacity_white_00, null));
    }

    public final void b(a aVar) {
        j jVar = j.ViewStateFeedback;
        jVar.getClass();
        aVar.f29929b = jVar;
        p2 p2Var = this.f29951a;
        p2Var.f35073y.f986f.setVisibility(8);
        mc.a aVar2 = p2Var.f35069u;
        ((ConstraintLayout) aVar2.f29922b).setVisibility(0);
        p2Var.f35074z.f986f.setVisibility(8);
        p2Var.f35071w.setVisibility(0);
        EditText editText = (EditText) aVar2.f29924d;
        String str = aVar.f29932e;
        if (str == null) {
            str = "";
        }
        editText.setText(str);
    }

    public final void c(a aVar) {
        j jVar = j.ViewStateRating;
        jVar.getClass();
        aVar.f29929b = jVar;
        p2 p2Var = this.f29951a;
        p2Var.f35073y.f986f.setVisibility(0);
        ((ConstraintLayout) p2Var.f35069u.f29922b).setVisibility(8);
        p2Var.f35074z.f986f.setVisibility(8);
        p2Var.f35071w.setVisibility(4);
    }

    public final void d(a aVar, int i11) {
        j jVar = j.ViewStateThankYou;
        jVar.getClass();
        aVar.f29929b = jVar;
        p2 p2Var = this.f29951a;
        p2Var.f35073y.f986f.setVisibility(8);
        ((ConstraintLayout) p2Var.f35069u.f29922b).setVisibility(8);
        p2Var.f35074z.f986f.setVisibility(0);
        p2Var.f35071w.setVisibility(4);
        new Handler(Looper.getMainLooper()).postDelayed(new b0.h(this, i11, 4), ConversationFragment.COORDINATOR_INITIALIZATION_TIMEOUT);
    }

    public final void e(final View view, View view2, final a aVar, boolean z11, final j jVar, final int i11) {
        final float width = this.f29951a.f35068t.getWidth();
        if (!z11) {
            width = -width;
        }
        if (!z11) {
            view2.setTranslationX(width);
        }
        float f11 = -width;
        view.animate().translationXBy(f11).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new c70.b(null, new Consumer() { // from class: mg.d
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((Animator) obj).getClass();
                View view3 = view;
                view3.clearAnimation();
                view3.setVisibility(8);
                view3.animate().translationXBy(width).setDuration(0L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            }
        }, 13)).start();
        if (z11) {
            view2.setTranslationX(width);
        }
        view2.animate().translationXBy(f11).setStartDelay(100L).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).setListener(new c70.b(new q(view2, 5), new Consumer() { // from class: mg.e
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                ((Animator) obj).getClass();
                int i12 = f.$EnumSwitchMapping$0[jVar.ordinal()];
                g gVar = this;
                a aVar2 = aVar;
                if (i12 == 1) {
                    gVar.c(aVar2);
                    return;
                }
                if (i12 == 2) {
                    gVar.b(aVar2);
                } else if (i12 == 3) {
                    gVar.d(aVar2, i11);
                } else {
                    e40.a.f();
                }
            }
        }, 12)).start();
        jVar.getClass();
        aVar.f29929b = jVar;
        NpsRatingView npsRatingView = this.f29954d;
        if (npsRatingView != null) {
            npsRatingView.q(aVar, i11);
        }
    }
}
