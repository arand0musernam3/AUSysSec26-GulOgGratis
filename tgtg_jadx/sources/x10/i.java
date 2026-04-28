package x10;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h1;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i<S> extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f43659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f43660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f43661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ub.a f43662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f43663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f43664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f43665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f43666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f43667k;
    public View l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MaterialButton f43668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AccessibilityManager f43669n;

    public final void o(l lVar) {
        o oVar = (o) this.f43664h.getAdapter();
        int iE = oVar.f43709a.f43641a.e(lVar);
        AccessibilityManager accessibilityManager = this.f43669n;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iE2 = iE - oVar.f43709a.f43641a.e(this.f43660d);
            boolean z11 = Math.abs(iE2) > 3;
            boolean z12 = iE2 > 0;
            this.f43660d = lVar;
            if (z11 && z12) {
                this.f43664h.j0(iE - 3);
                this.f43664h.post(new e7.a(this, iE, 6));
            } else {
                RecyclerView recyclerView = this.f43664h;
                if (z11) {
                    recyclerView.j0(iE + 3);
                    this.f43664h.post(new e7.a(this, iE, 6));
                } else {
                    recyclerView.post(new e7.a(this, iE, 6));
                }
            }
        } else {
            this.f43660d = lVar;
            this.f43664h.j0(iE);
        }
        q(iE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f43658b = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            org.bouncycastle.jce.provider.a.c();
            return;
        }
        this.f43659c = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.f43660d = (l) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            org.bouncycastle.jce.provider.a.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        int i12;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f43658b);
        this.f43662f = new ub.a(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f43669n = (AccessibilityManager) requireContext().getSystemService("accessibility");
        l lVar = this.f43659c.f43641a;
        int i13 = 0;
        int i14 = 1;
        if (j.r(contextThemeWrapper, R.attr.windowFullscreen)) {
            i11 = com.app.tgtg.R.layout.mtrl_calendar_vertical;
            i12 = 1;
        } else {
            i11 = com.app.tgtg.R.layout.mtrl_calendar_horizontal;
            i12 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i11, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.app.tgtg.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.app.tgtg.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.app.tgtg.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.app.tgtg.R.dimen.mtrl_calendar_days_of_week_height);
        int i15 = m.f43702d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.app.tgtg.R.dimen.mtrl_calendar_month_vertical_padding) * (i15 - 1)) + (resources.getDimensionPixelSize(com.app.tgtg.R.dimen.mtrl_calendar_day_height) * i15) + resources.getDimensionPixelOffset(com.app.tgtg.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.app.tgtg.R.id.mtrl_calendar_days_of_week);
        ViewCompat.b0(gridView, new j8.c(3));
        int i16 = this.f43659c.f43645e;
        gridView.setAdapter((ListAdapter) (i16 > 0 ? new d(i16) : new d()));
        gridView.setNumColumns(lVar.f43698d);
        gridView.setEnabled(false);
        this.f43664h = (RecyclerView) viewInflate.findViewById(com.app.tgtg.R.id.mtrl_calendar_months);
        this.f43664h.setLayoutManager(new f(this, getContext(), i12, i12));
        this.f43664h.setTag("MONTHS_VIEW_GROUP_TAG");
        o oVar = new o(contextThemeWrapper, this.f43659c, new m1.a(this));
        this.f43664h.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(com.app.tgtg.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.app.tgtg.R.id.mtrl_calendar_year_selector_frame);
        this.f43663g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f43663g.setLayoutManager(new GridLayoutManager(contextThemeWrapper, integer, 1));
            this.f43663g.setAdapter(new t(this));
            this.f43663g.i(new bs.e(this));
        }
        View viewFindViewById = viewInflate.findViewById(com.app.tgtg.R.id.month_navigation_fragment_toggle);
        b bVar = oVar.f43709a;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.app.tgtg.R.id.month_navigation_fragment_toggle);
            this.f43668m = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.b0(this.f43668m, new g(this));
            View viewFindViewById2 = viewInflate.findViewById(com.app.tgtg.R.id.month_navigation_previous);
            this.f43665i = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(com.app.tgtg.R.id.month_navigation_next);
            this.f43666j = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.f43667k = viewInflate.findViewById(com.app.tgtg.R.id.mtrl_calendar_year_selector_frame);
            this.l = viewInflate.findViewById(com.app.tgtg.R.id.mtrl_calendar_day_selector_frame);
            p(h.DAY);
            this.f43668m.setText(this.f43660d.d());
            this.f43664h.k(new hq.n(this, oVar));
            this.f43668m.setOnClickListener(new e20.m(this, 5));
            this.f43666j.setOnClickListener(new e(this, oVar, i14));
            this.f43665i.setOnClickListener(new e(this, oVar, i13));
            q(bVar.f43641a.e(this.f43660d));
        }
        if (!j.r(contextThemeWrapper, R.attr.windowFullscreen)) {
            new h1().attachToRecyclerView(this.f43664h);
        }
        this.f43664h.j0(bVar.f43641a.e(this.f43660d));
        ViewCompat.b0(this.f43664h, new j8.c(4));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f43658b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f43659c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f43660d);
    }

    public final void p(h hVar) {
        this.f43661e = hVar;
        if (hVar == h.YEAR) {
            this.f43663g.getLayoutManager().scrollToPosition(this.f43660d.f43697c - ((t) this.f43663g.getAdapter()).f43715a.f43659c.f43641a.f43697c);
            this.f43667k.setVisibility(0);
            this.l.setVisibility(8);
            this.f43665i.setVisibility(8);
            this.f43666j.setVisibility(8);
            return;
        }
        if (hVar == h.DAY) {
            this.f43667k.setVisibility(8);
            this.l.setVisibility(0);
            this.f43665i.setVisibility(0);
            this.f43666j.setVisibility(0);
            o(this.f43660d);
        }
    }

    public final void q(int i11) {
        this.f43666j.setEnabled(i11 + 1 < this.f43664h.getAdapter().getItemCount());
        this.f43665i.setEnabled(i11 - 1 >= 0);
    }
}
