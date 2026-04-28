package x10;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.y;
import b0.a0;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.app.tgtg.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class j<S> extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f43670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f43671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f43673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f43674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f43675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f43676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f43677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f43678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f43679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f43680k;
    public CharSequence l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f43681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f43682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f43683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f43684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f43685q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f43686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f43687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CheckableImageButton f43688t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n20.j f43689u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f43690v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f43691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f43692x;

    public j() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f43670a = new LinkedHashSet();
        this.f43671b = new LinkedHashSet();
    }

    public static int q(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarB = r.b();
        calendarB.set(5, 1);
        Calendar calendarA = r.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean r(Context context, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ex.i.I(context, i.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i11});
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z11;
    }

    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f43670a.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f43672c = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            org.bouncycastle.jce.provider.a.c();
            return;
        }
        this.f43674e = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            org.bouncycastle.jce.provider.a.c();
            return;
        }
        this.f43676g = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f43677h = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f43679j = bundle.getInt("INPUT_MODE_KEY");
        this.f43680k = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.l = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f43681m = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f43682n = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f43683o = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f43684p = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f43685q = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f43686r = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f43677h;
        if (text == null) {
            text = requireContext().getResources().getText(this.f43676g);
        }
        this.f43691w = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.f43692x = text;
    }

    @Override // androidx.fragment.app.y
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int i11 = this.f43672c;
        if (i11 == 0) {
            p();
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i11);
        Context context = dialog.getContext();
        this.f43678i = r(context, android.R.attr.windowFullscreen);
        this.f43689u = new n20.j(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j10.a.f24432z, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f43689u.p(context);
        this.f43689u.t(ColorStateList.valueOf(color));
        this.f43689u.s(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f43678i ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f43678i) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(q(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(q(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f43688t = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f43687s = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.f43688t.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f43688t;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, a0.x(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], a0.x(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f43688t.setChecked(this.f43679j != 0);
        ViewCompat.b0(this.f43688t, null);
        CheckableImageButton checkableImageButton2 = this.f43688t;
        this.f43688t.setContentDescription(this.f43679j == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f43688t.setOnClickListener(new ax.s(this, 27));
        p();
        throw null;
    }

    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f43671b.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f43672c);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f43674e;
        a aVar = new a();
        int i11 = a.f43639b;
        int i12 = a.f43639b;
        long j9 = bVar.f43641a.f43700f;
        long j11 = bVar.f43642b.f43700f;
        aVar.f43640a = Long.valueOf(bVar.f43644d.f43700f);
        int i13 = bVar.f43645e;
        c cVar = bVar.f43643c;
        i iVar = this.f43675f;
        l lVar = iVar == null ? null : iVar.f43660d;
        if (lVar != null) {
            aVar.f43640a = Long.valueOf(lVar.f43700f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", cVar);
        l lVarC = l.c(j9);
        l lVarC2 = l.c(j11);
        c cVar2 = (c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = aVar.f43640a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(lVarC, lVarC2, cVar2, l == null ? null : l.c(l.longValue()), i13));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f43676g);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f43677h);
        bundle.putInt("INPUT_MODE_KEY", this.f43679j);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f43680k);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.l);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f43681m);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f43682n);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f43683o);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f43684p);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f43685q);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f43686r);
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f43678i) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f43689u);
            if (!this.f43690v) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListM = b6.a.m(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListM != null ? Integer.valueOf(colorStateListM.getDefaultColor()) : null;
                boolean z11 = false;
                boolean z12 = numValueOf == null || numValueOf.intValue() == 0;
                int iZ = w0.e.z(window.getContext(), android.R.attr.colorBackground, RoundCornerImageView.DEFAULT_STROKE_COLOR);
                if (z12) {
                    numValueOf = Integer.valueOf(iZ);
                }
                v0.n.G(window, false);
                window.getContext();
                int iE = Build.VERSION.SDK_INT < 27 ? x6.c.e(w0.e.z(window.getContext(), android.R.attr.navigationBarColor, RoundCornerImageView.DEFAULT_STROKE_COLOR), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iE);
                new WindowInsetsControllerCompat(window, window.getDecorView()).d(w0.e.C(0) || w0.e.C(numValueOf.intValue()));
                boolean zC = w0.e.C(iZ);
                if (w0.e.C(iE) || (iE == 0 && zC)) {
                    z11 = true;
                }
                new WindowInsetsControllerCompat(window, window.getDecorView()).c(z11);
                ViewCompat.k0(viewFindViewById, new r5.i(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight()));
                this.f43690v = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f43689u, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new y10.a(requireDialog(), rect));
        }
        requireContext();
        int i11 = this.f43672c;
        if (i11 == 0) {
            p();
            throw null;
        }
        p();
        b bVar = this.f43674e;
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i11);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f43644d);
        iVar.setArguments(bundle);
        this.f43675f = iVar;
        p pVar = iVar;
        if (this.f43679j == 1) {
            p();
            b bVar2 = this.f43674e;
            k kVar = new k();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i11);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            kVar.setArguments(bundle2);
            pVar = kVar;
        }
        this.f43673d = pVar;
        this.f43687s.setText((this.f43679j == 1 && getResources().getConfiguration().orientation == 2) ? this.f43692x : this.f43691w);
        p();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onStop() {
        this.f43673d.f43712a.clear();
        super.onStop();
    }

    public final void p() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        org.bouncycastle.jce.provider.a.c();
    }
}
