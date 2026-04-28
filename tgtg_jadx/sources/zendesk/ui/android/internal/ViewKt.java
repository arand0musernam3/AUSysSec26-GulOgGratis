package zendesk.ui.android.internal;

import a3.l0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupMenu;
import com.braze.ui.inappmessage.views.c;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import n20.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import yl.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\u0007*\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u000b\u001a-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\b\b\u0000\u0010\u0010*\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0017\u001a\u00020\u0007*\u00020\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001aC\u0010\u001e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u001a\u001a\u00020\u00012\b\b\u0003\u0010\u001b\u001a\u00020\u00012\b\b\u0003\u0010\u001c\u001a\u00020\u00012\b\b\u0003\u0010\u001d\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010%\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a/\u0010(\u001a\u00020'*\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u0001H\u0000¢\u0006\u0004\b(\u0010)\u001a9\u0010*\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\b\b\u0003\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b*\u0010&\u001a#\u0010/\u001a\u00020.*\u00020\u00002\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+H\u0000¢\u0006\u0004\b/\u00100\"\u0014\u00101\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Landroid/view/View;", "", "borderColor", "", "borderRadius", "borderWidth", "backgroundColor", "", "outlinedBoxBackground", "(Landroid/view/View;IFFI)V", "focusAndShowKeyboard", "(Landroid/view/View;)V", "Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;", "requestLayoutOnKeyBoardShown", "(Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;)V", "showKeyboardNow", "T", "viewId", "Lu70/j;", "lazyViewById", "(Landroid/view/View;I)Lu70/j;", "Lkotlin/Function0;", "performAction", "onKeyboardShown", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "parent", "extraPaddingTop", "extraPaddingBottom", "extraPaddingStart", "extraPaddingEnd", "expandTouchArea", "(Landroid/view/View;Landroid/view/View;IIII)V", "focusedDrawableId", "strokeDimenId", "strokeColor", "Landroid/graphics/drawable/Drawable;", "defaultDrawable", "addFocusedState", "(Landroid/view/View;IIILandroid/graphics/drawable/Drawable;)V", "Landroid/graphics/drawable/GradientDrawable;", "addBorderToDrawable", "(Landroid/view/View;III)Landroid/graphics/drawable/GradientDrawable;", "addAccessibilityFocusedState", "", "Lzendesk/ui/android/internal/ContextualMenuOption;", "options", "Landroid/widget/PopupMenu;", "createCellContextualMenu", "(Landroid/view/View;Ljava/util/List;)Landroid/widget/PopupMenu;", "KEYBOARD_HEIGHT_RATIO", "F", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nzendesk/ui/android/internal/ViewKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,288:1\n1869#2,2:289\n*S KotlinDebug\n*F\n+ 1 View.kt\nzendesk/ui/android/internal/ViewKt\n*L\n278#1:289,2\n*E\n"})
public final class ViewKt {
    public static final float KEYBOARD_HEIGHT_RATIO = 0.15f;

    /* JADX INFO: renamed from: zendesk.ui.android.internal.ViewKt$requestLayoutOnKeyBoardShown$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"zendesk/ui/android/internal/ViewKt$requestLayoutOnKeyBoardShown$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC04671 implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ MaterialAutoCompleteTextView $this_requestLayoutOnKeyBoardShown;

        public ViewTreeObserverOnGlobalLayoutListenerC04671(MaterialAutoCompleteTextView materialAutoCompleteTextView) {
            this.$this_requestLayoutOnKeyBoardShown = materialAutoCompleteTextView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onGlobalLayout$lambda$0(MaterialAutoCompleteTextView materialAutoCompleteTextView, ViewTreeObserverOnGlobalLayoutListenerC04671 viewTreeObserverOnGlobalLayoutListenerC04671) {
            if (materialAutoCompleteTextView.isPopupShowing()) {
                materialAutoCompleteTextView.requestLayout();
            }
            materialAutoCompleteTextView.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC04671);
            return Unit.f26487a;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = this.$this_requestLayoutOnKeyBoardShown;
            ViewKt.onKeyboardShown(materialAutoCompleteTextView, new e(11, materialAutoCompleteTextView, this));
        }
    }

    public static final void addAccessibilityFocusedState(@NotNull final View view, final int i11, final int i12, final int i13, @NotNull final Drawable drawable) {
        view.getClass();
        drawable.getClass();
        view.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: zendesk.ui.android.internal.ViewKt.addAccessibilityFocusedState.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                host.getClass();
                info.getClass();
                super.onInitializeAccessibilityNodeInfo(host, info);
                boolean zIsAccessibilityFocused = info.isAccessibilityFocused();
                View view2 = view;
                if (!zIsAccessibilityFocused) {
                    view2.setBackground(drawable);
                } else {
                    view.setBackground(ViewKt.addBorderToDrawable(view2, i11, i12, i13));
                }
            }
        });
    }

    public static /* synthetic */ void addAccessibilityFocusedState$default(View view, int i11, int i12, int i13, Drawable drawable, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        if ((i14 & 8) != 0) {
            drawable = view.getBackground();
        }
        addAccessibilityFocusedState(view, i11, i12, i13, drawable);
    }

    @NotNull
    public static final GradientDrawable addBorderToDrawable(@NotNull View view, int i11, int i12, int i13) {
        view.getClass();
        Drawable drawable = view.getContext().getDrawable(i11);
        drawable.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.mutate();
        gradientDrawable.setStroke(view.getResources().getDimensionPixelSize(i12), i13);
        return gradientDrawable;
    }

    public static /* synthetic */ GradientDrawable addBorderToDrawable$default(View view, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        return addBorderToDrawable(view, i11, i12, i13);
    }

    public static final void addFocusedState(@NotNull View view, int i11, int i12, int i13, @NotNull Drawable drawable) {
        view.getClass();
        drawable.getClass();
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable2 = view.getContext().getDrawable(i11);
        drawable2.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
        gradientDrawable.mutate();
        gradientDrawable.setStroke(view.getResources().getDimensionPixelSize(i12), i13);
        stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable);
        stateListDrawable.addState(new int[0], drawable);
        view.setBackground(stateListDrawable);
    }

    public static /* synthetic */ void addFocusedState$default(View view, int i11, int i12, int i13, Drawable drawable, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        if ((i14 & 8) != 0) {
            drawable = view.getBackground();
        }
        addFocusedState(view, i11, i12, i13, drawable);
    }

    @NotNull
    public static final PopupMenu createCellContextualMenu(@NotNull View view, @Nullable List<ContextualMenuOption> list) {
        view.getClass();
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        if (list != null) {
            for (ContextualMenuOption contextualMenuOption : list) {
                popupMenu.getMenu().add(0, contextualMenuOption.getOptionId(), 0, contextualMenuOption.getOptionTitle());
            }
        }
        return popupMenu;
    }

    public static final void expandTouchArea(@NotNull final View view, @NotNull final View view2, final int i11, final int i12, final int i13, final int i14) {
        view.getClass();
        view2.getClass();
        view2.post(new Runnable() { // from class: zendesk.ui.android.internal.a
            @Override // java.lang.Runnable
            public final void run() {
                ViewKt.expandTouchArea$lambda$3(view, i11, i13, i14, i12, view2);
            }
        });
    }

    public static /* synthetic */ void expandTouchArea$default(View view, View view2, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            i11 = view.getResources().getDimensionPixelSize(zendesk.ui.android.R.dimen.zuia_default_expanded_touch_area);
        }
        int i16 = i11;
        if ((i15 & 4) != 0) {
            i12 = view.getResources().getDimensionPixelSize(zendesk.ui.android.R.dimen.zuia_default_expanded_touch_area);
        }
        int i17 = i12;
        if ((i15 & 8) != 0) {
            i13 = view.getResources().getDimensionPixelSize(zendesk.ui.android.R.dimen.zuia_default_expanded_touch_area);
        }
        int i18 = i13;
        if ((i15 & 16) != 0) {
            i14 = view.getResources().getDimensionPixelSize(zendesk.ui.android.R.dimen.zuia_default_expanded_touch_area);
        }
        expandTouchArea(view, view2, i16, i17, i18, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void expandTouchArea$lambda$3(View view, int i11, int i12, int i13, int i14, View view2) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i11;
        rect.left -= i12;
        rect.right += i13;
        rect.bottom += i14;
        view2.setTouchDelegate(new TouchDelegate(rect, view));
    }

    public static final void focusAndShowKeyboard(@NotNull final View view) {
        view.getClass();
        view.requestFocus();
        if (view.hasWindowFocus()) {
            showKeyboardNow(view);
        } else {
            view.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: zendesk.ui.android.internal.ViewKt.focusAndShowKeyboard.1
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public void onWindowFocusChanged(boolean hasFocus) {
                    if (hasFocus) {
                        view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                        ViewKt.showKeyboardNow(view);
                    }
                }
            });
        }
    }

    @NotNull
    public static final <T extends View> j lazyViewById(@NotNull View view, int i11) {
        view.getClass();
        return l.b(new l0(view, i11, 12));
    }

    public static final void onKeyboardShown(@NotNull View view, @NotNull Function0<Unit> function0) {
        view.getClass();
        function0.getClass();
        view.getWindowVisibleDisplayFrame(new Rect());
        if (r2 - r0.bottom > view.getRootView().getHeight() * 0.15f) {
            function0.invoke();
        }
    }

    public static final void outlinedBoxBackground(@NotNull View view, int i11, float f11, float f12, int i12) {
        view.getClass();
        n20.j jVarE = n20.j.e(view.getContext(), 0.0f, null);
        jVarE.t(ColorStateList.valueOf(i12));
        jVarE.A(f12);
        jVarE.z(ColorStateList.valueOf(i11));
        n nVarH = jVarE.f30345b.f30318a.h();
        nVarH.b(f11);
        jVarE.setShapeAppearanceModel(nVarH.a());
        view.setBackground(jVarE);
    }

    public static void outlinedBoxBackground$default(View view, int i11, float f11, float f12, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            Context context = view.getContext();
            context.getClass();
            i11 = ColorExtKt.adjustAlpha(ColorExtKt.resolveColorAttr(context, com.app.tgtg.R.attr.colorOnSurface), 0.12f);
        }
        if ((i13 & 2) != 0) {
            f11 = view.getResources().getDimension(zendesk.ui.android.R.dimen.zuia_message_cell_radius);
        }
        if ((i13 & 4) != 0) {
            f12 = view.getResources().getDimension(zendesk.ui.android.R.dimen.zuia_divider_size);
        }
        if ((i13 & 8) != 0) {
            i12 = view.getContext().getColor(zendesk.ui.android.R.color.zuia_color_transparent);
        }
        outlinedBoxBackground(view, i11, f11, f12, i12);
    }

    public static final void requestLayoutOnKeyBoardShown(@NotNull MaterialAutoCompleteTextView materialAutoCompleteTextView) {
        materialAutoCompleteTextView.getClass();
        materialAutoCompleteTextView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC04671(materialAutoCompleteTextView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showKeyboardNow(View view) {
        if (view.isFocused()) {
            view.post(new c(7, view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showKeyboardNow$lambda$1(View view) {
        Object systemService = view.getContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).showSoftInput(view, 1);
    }
}
