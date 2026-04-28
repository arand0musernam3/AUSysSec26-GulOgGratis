package t20;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f39725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f39727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f39728e;

    public n(p pVar, int i11, TextView textView, int i12, TextView textView2) {
        this.f39728e = pVar;
        this.f39724a = i11;
        this.f39725b = textView;
        this.f39726c = i12;
        this.f39727d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        int i11 = this.f39724a;
        p pVar = this.f39728e;
        pVar.f39742n = i11;
        pVar.l = null;
        TextView textView = this.f39725b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f39726c == 1 && (appCompatTextView = pVar.f39746r) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f39727d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f39727d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
