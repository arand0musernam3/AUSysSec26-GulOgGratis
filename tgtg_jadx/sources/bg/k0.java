package bg;

import a3.n2;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.util.Consumer;
import com.airbnb.lottie.LottieAnimationView;
import com.app.tgtg.R;
import com.app.tgtg.customview.BottomFadingScrollView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f6170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f6171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f6173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f6176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f6177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6178i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6179j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6180k;
    public Function0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y.a f6181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Function0 f6182n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Function0 f6183o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f6184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f6186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public uh.b f6187s;

    public k0(Activity activity) {
        this.f6170a = activity;
    }

    public static void d(TextView textView, CharSequence charSequence) {
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setVisibility(8);
        }
    }

    public final void a(int i11) {
        Resources resources;
        Activity activity = this.f6170a;
        this.f6172c = (activity == null || (resources = activity.getResources()) == null) ? null : resources.getString(i11);
    }

    public final void b(int i11) {
        Resources resources;
        Activity activity = this.f6170a;
        this.f6174e = (activity == null || (resources = activity.getResources()) == null) ? null : resources.getString(i11);
    }

    public final void c(int i11) {
        Resources resources;
        Activity activity = this.f6170a;
        this.f6173d = (activity == null || (resources = activity.getResources()) == null) ? null : resources.getString(i11);
    }

    public final void e(int i11) {
        Resources resources;
        Activity activity = this.f6170a;
        this.f6171b = (activity == null || (resources = activity.getResources()) == null) ? null : resources.getString(i11);
    }

    public final PopupWindow f() {
        Activity activity = this.f6170a;
        if (activity == null || activity.isFinishing()) {
            return null;
        }
        e0 e0Var = new e0(activity);
        Point point = new Point();
        activity.getWindowManager().getDefaultDisplay().getSize(point);
        int iA = point.x - d70.b.a(32);
        int iA2 = point.y - d70.b.a(32);
        View.inflate(e0Var.getContext(), R.layout.confirm_popup, e0Var);
        e0Var.f6143a = iA2;
        final PopupWindow popupWindow = new PopupWindow(e0Var, iA, -2);
        TextView textView = (TextView) e0Var.findViewById(R.id.tvTitle);
        TextView textView2 = (TextView) e0Var.findViewById(R.id.tvDescription);
        TextView textView3 = (TextView) e0Var.findViewById(R.id.tvHelperText);
        Button button = (Button) e0Var.findViewById(R.id.btnPositive);
        Button button2 = (Button) e0Var.findViewById(R.id.btnNegative);
        Button button3 = (Button) e0Var.findViewById(R.id.btnMiddle);
        ImageView imageView = (ImageView) e0Var.findViewById(R.id.ivCover);
        View viewFindViewById = e0Var.findViewById(R.id.animation);
        viewFindViewById.getClass();
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
        View viewFindViewById2 = e0Var.findViewById(R.id.svDescription);
        viewFindViewById2.getClass();
        BottomFadingScrollView bottomFadingScrollView = (BottomFadingScrollView) viewFindViewById2;
        textView.getClass();
        d(textView, this.f6171b);
        int i11 = this.f6178i;
        if (i11 != -1) {
            imageView.setImageResource(i11);
        } else {
            imageView.setVisibility(8);
        }
        int i12 = 1;
        if (this.f6186r != null) {
            lottieAnimationView.setVisibility(0);
            he.o.b(activity, this.f6186r).b(new y(lottieAnimationView, i12));
        } else {
            lottieAnimationView.setVisibility(8);
        }
        if (this.f6185q > 0) {
            imageView.getLayoutParams().height = this.f6185q;
        }
        if (textView.getVisibility() == 8) {
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(0, d70.b.a(24), 0, 0);
            textView2.setLayoutParams(layoutParams2);
        }
        if (this.f6187s == null || this.f6172c == null) {
            textView2.getClass();
            d(textView2, this.f6172c);
        } else {
            textView2.setLinkTextColor(androidx.core.app.e.b(activity, R.color.primary_40));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            String str = this.f6172c;
            str.getClass();
            SpannableString spannableString = new SpannableString(m0.c.c0(str));
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
            uRLSpanArr.getClass();
            int length = uRLSpanArr.length;
            int i13 = 0;
            while (i13 < length) {
                URLSpan uRLSpan = uRLSpanArr[i13];
                URLSpan[] uRLSpanArr2 = uRLSpanArr;
                int i14 = length;
                n2 n2Var = new n2(25, this, uRLSpan);
                String url = uRLSpan.getURL();
                url.getClass();
                mv.g0 g0Var = new mv.g0(activity, n2Var, url);
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(g0Var, spanStart, spanEnd, 0);
                i13++;
                uRLSpanArr = uRLSpanArr2;
                length = i14;
            }
            textView2.setText(spannableString);
        }
        textView3.getClass();
        textView3.setVisibility(8);
        Integer num = this.f6176g;
        if (num != null) {
            button.setBackground(b0.a0.x(activity, num.intValue()));
        }
        button.getClass();
        d(button, this.f6173d);
        final int i15 = 0;
        button.setOnClickListener(new pt.c(new Consumer(this) { // from class: bg.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f6158b;

            {
                this.f6158b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i15) {
                    case 0:
                        Function0 function0 = this.f6158b.l;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        popupWindow.dismiss();
                        break;
                    default:
                        Function0 function02 = this.f6158b.f6182n;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        popupWindow.dismiss();
                        break;
                }
            }
        }));
        button3.getClass();
        d(button3, this.f6175f);
        mv.d.x(button3, new a3.p(10, this, popupWindow));
        ViewGroup.LayoutParams layoutParams3 = button2.getLayoutParams();
        layoutParams3.getClass();
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.setMargins(0, d70.b.a(4), 0, 0);
        button2.setLayoutParams(layoutParams4);
        button2.setAllCaps(false);
        d(button2, this.f6174e);
        Integer num2 = this.f6177h;
        if (num2 != null) {
            button2.setTextColor(activity.getColor(num2.intValue()));
        }
        button2.setTypeface(w6.j.b(activity, R.font.tenon_bold));
        final int i16 = 1;
        button2.setOnClickListener(new pt.c(new Consumer(this) { // from class: bg.h0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f6158b;

            {
                this.f6158b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i16) {
                    case 0:
                        Function0 function0 = this.f6158b.l;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        popupWindow.dismiss();
                        break;
                    default:
                        Function0 function02 = this.f6158b.f6182n;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        popupWindow.dismiss();
                        break;
                }
            }
        }));
        popupWindow.setOnDismissListener(new i0(this, 0));
        popupWindow.setFocusable(this.f6179j);
        popupWindow.setOutsideTouchable(this.f6179j);
        if (this.f6180k) {
            popupWindow.setAnimationStyle(R.anim.fade_in_duration_500);
        }
        View view = this.f6184p;
        if (view != null) {
            popupWindow.showAtLocation(view, 17, 0, 0);
            na0.a.l0(popupWindow);
        } else {
            try {
                View viewFindViewById3 = activity.findViewById(android.R.id.content);
                viewFindViewById3.post(new k(popupWindow, viewFindViewById3, 1));
            } catch (Throwable unused) {
                return null;
            }
        }
        ViewTreeObserver viewTreeObserver = bottomFadingScrollView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(new j0(0, bottomFadingScrollView, imageView));
        }
        return popupWindow;
    }
}
