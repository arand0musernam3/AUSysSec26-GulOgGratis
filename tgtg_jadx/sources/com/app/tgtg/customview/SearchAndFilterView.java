package com.app.tgtg.customview;

import a3.f1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.q;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.f0;
import bg.l0;
import bg.m0;
import bg.n0;
import bg.z;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.customview.SearchAndFilterView;
import cv.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mv.d;
import mv.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.g;
import pg.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class SearchAndFilterView extends z implements LifecycleOwner {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f8913k = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f8914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f8915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function1 f8916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function0 f8917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function0 f8918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Function0 f8919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f0 f8920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f8921j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchAndFilterView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        final int i13 = 1;
        this.f8920i = new f0(this, true);
        final int i14 = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.search_and_filter_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i15 = R.id.clearSearchButton;
        ConstraintLayout constraintLayout = (ConstraintLayout) g.t(R.id.clearSearchButton, viewInflate);
        if (constraintLayout != null) {
            i15 = R.id.content;
            if (((ConstraintLayout) g.t(R.id.content, viewInflate)) != null) {
                i15 = R.id.filtersBox;
                AppCompatImageView appCompatImageView = (AppCompatImageView) g.t(R.id.filtersBox, viewInflate);
                if (appCompatImageView != null) {
                    i15 = R.id.locationButton;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) g.t(R.id.locationButton, viewInflate);
                    if (appCompatImageView2 != null) {
                        i15 = R.id.locationButtonCompose;
                        ComposeView composeView = (ComposeView) g.t(R.id.locationButtonCompose, viewInflate);
                        if (composeView != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                            i15 = R.id.searchBox;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) g.t(R.id.searchBox, viewInflate);
                            if (constraintLayout3 != null) {
                                i15 = R.id.searchText;
                                EditText editText = (EditText) g.t(R.id.searchText, viewInflate);
                                if (editText != null) {
                                    i15 = R.id.startIcon;
                                    ImageView imageView = (ImageView) g.t(R.id.startIcon, viewInflate);
                                    if (imageView != null) {
                                        a aVar = new a(constraintLayout2, constraintLayout, appCompatImageView, appCompatImageView2, composeView, constraintLayout3, editText, imageView);
                                        this.f8921j = aVar;
                                        editText.clearFocus();
                                        editText.setOnFocusChangeListener(new l0(i14, this, aVar));
                                        editText.setOnEditorActionListener(new m0(this, 0));
                                        constraintLayout.setOnClickListener(new n0(i14, this, aVar));
                                        d.x(appCompatImageView, new Function1(this) { // from class: bg.o0

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ SearchAndFilterView f6211b;

                                            {
                                                this.f6211b = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                int i16 = i14;
                                                SearchAndFilterView searchAndFilterView = this.f6211b;
                                                View view = (View) obj;
                                                switch (i16) {
                                                    case 0:
                                                        int i17 = SearchAndFilterView.f8913k;
                                                        view.getClass();
                                                        Function0 function0 = searchAndFilterView.f8917f;
                                                        if (function0 != null) {
                                                            function0.invoke();
                                                        }
                                                        break;
                                                    default:
                                                        int i18 = SearchAndFilterView.f8913k;
                                                        view.getClass();
                                                        Function0 function02 = searchAndFilterView.f8918g;
                                                        if (function02 != null) {
                                                            function02.invoke();
                                                        }
                                                        break;
                                                }
                                                return Unit.f26487a;
                                            }
                                        });
                                        d.x(appCompatImageView2, new Function1(this) { // from class: bg.o0

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final /* synthetic */ SearchAndFilterView f6211b;

                                            {
                                                this.f6211b = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                int i16 = i13;
                                                SearchAndFilterView searchAndFilterView = this.f6211b;
                                                View view = (View) obj;
                                                switch (i16) {
                                                    case 0:
                                                        int i17 = SearchAndFilterView.f8913k;
                                                        view.getClass();
                                                        Function0 function0 = searchAndFilterView.f8917f;
                                                        if (function0 != null) {
                                                            function0.invoke();
                                                        }
                                                        break;
                                                    default:
                                                        int i18 = SearchAndFilterView.f8913k;
                                                        view.getClass();
                                                        Function0 function02 = searchAndFilterView.f8918g;
                                                        if (function02 != null) {
                                                            function02.invoke();
                                                        }
                                                        break;
                                                }
                                                return Unit.f26487a;
                                            }
                                        });
                                        if (getExperimentManager().c()) {
                                            getFilterBox().setVisibility(8);
                                            appCompatImageView2.setVisibility(8);
                                            composeView.setVisibility(0);
                                            composeView.setContent(new u3.d(new f1(this, 9), true, 1088098473));
                                            editText.setContentDescription(getContext().getString(R.string.a11y_browse_complex_quick_filters_search));
                                            constraintLayout3.setBackgroundResource(R.drawable.bg_search_box_rounded);
                                            setSearchBoxExpanded();
                                            q qVar = new q();
                                            qVar.e(constraintLayout2);
                                            qVar.f(constraintLayout3.getId(), 7, composeView.getId(), 6);
                                            qVar.b(constraintLayout2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i15)));
        throw null;
    }

    private final String getSearchText() {
        return ((EditText) this.f8921j.f34765g).getText().toString();
    }

    public static void j(SearchAndFilterView searchAndFilterView, int i11, KeyEvent keyEvent) {
        if (i11 == 6 || (keyEvent != null && keyEvent.getKeyCode() == 66)) {
            InputMethodManager inputMethodManager = (InputMethodManager) searchAndFilterView.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(searchAndFilterView.getWindowToken(), 0);
            }
            String searchText = searchAndFilterView.getSearchText();
            searchAndFilterView.k(true);
            Function1 function1 = searchAndFilterView.f8916e;
            if (function1 != null) {
                function1.invoke(searchText);
            }
        }
    }

    @NotNull
    public final b getEventTrackingManager() {
        b bVar = this.f8914c;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
        return null;
    }

    @NotNull
    public final u getExperimentManager() {
        u uVar = this.f8915d;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentManager");
        return null;
    }

    @NotNull
    public final AppCompatImageView getFilterBox() {
        return (AppCompatImageView) this.f8921j.f34762d;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.f8920i;
    }

    @Nullable
    public final Function0<Unit> getOnCancelListener() {
        return this.f8919h;
    }

    @Nullable
    public final Function0<Unit> getOnFilterListener() {
        return this.f8917f;
    }

    @Nullable
    public final Function0<Unit> getOnLocationBtnListener() {
        return this.f8918g;
    }

    @Nullable
    public final Function1<String, Unit> getOnSearchListener() {
        return this.f8916e;
    }

    @NotNull
    public final EditText getSearchBox() {
        return (EditText) this.f8921j.f34765g;
    }

    public final void k(boolean z11) {
        boolean zC = getExperimentManager().c();
        a aVar = this.f8921j;
        if (z11) {
            ((ImageView) aVar.f34764f).setImageResource(R.drawable.system_icon_search_primary_30);
            ((ConstraintLayout) aVar.f34763e).setBackgroundResource(zC ? R.drawable.bg_search_box_rounded_green_border : R.drawable.bg_filter_btn_green_border);
        } else {
            ((EditText) aVar.f34765g).clearFocus();
            ((EditText) aVar.f34765g).setText("");
            ((ImageView) aVar.f34764f).setImageResource(R.drawable.system_icon_search_neutral_60);
            ((ConstraintLayout) aVar.f34763e).setBackgroundResource(zC ? R.drawable.bg_search_box_rounded : R.drawable.bg_filter_btn);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8920i.i(Lifecycle.State.RESUMED);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8920i.i(Lifecycle.State.DESTROYED);
    }

    public final void setEventTrackingManager(@NotNull b bVar) {
        bVar.getClass();
        this.f8914c = bVar;
    }

    public final void setExperimentManager(@NotNull u uVar) {
        uVar.getClass();
        this.f8915d = uVar;
    }

    public final void setOnCancelListener(@Nullable Function0<Unit> function0) {
        this.f8919h = function0;
    }

    public final void setOnFilterListener(@Nullable Function0<Unit> function0) {
        this.f8917f = function0;
    }

    public final void setOnLocationBtnListener(@Nullable Function0<Unit> function0) {
        this.f8918g = function0;
    }

    public final void setOnSearchListener(@Nullable Function1<? super String, Unit> function1) {
        this.f8916e = function1;
    }

    public final void setSearchBoxExpanded() {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.search_box_height_expanded);
        a aVar = this.f8921j;
        ViewGroup.LayoutParams layoutParams = ((ConstraintLayout) aVar.f34763e).getLayoutParams();
        ConstraintLayout.a aVar2 = layoutParams instanceof ConstraintLayout.a ? (ConstraintLayout.a) layoutParams : null;
        if (aVar2 != null) {
            ((ViewGroup.MarginLayoutParams) aVar2).height = dimensionPixelSize;
            ((ConstraintLayout) aVar.f34763e).setLayoutParams(aVar2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchAndFilterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchAndFilterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchAndFilterView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ SearchAndFilterView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
