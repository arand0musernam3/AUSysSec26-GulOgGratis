package zendesk.ui.android.conversation.quickreply;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rk.z;
import rv.a;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.conversation.quickreply.QuickReplyOptionView;
import zendesk.ui.android.internal.ColorExtKt;
import zendesk.ui.android.internal.ThrottledOnClickListenerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001 B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0019H\u0014J\u0016\u0010\u001c\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eH\u0014J\u0016\u0010\u001f\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eH\u0014R\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "quickReplyOptionContainer", "quickReplyOptionTextView", "Landroid/widget/TextView;", "rendering", "render", "", "renderingUpdate", "Lkotlin/Function1;", "setupQuickReplyStateBackground", "tappedBackgroundColor", "untappedBackgroundColor", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "dispatchSaveInstanceState", "container", "Landroid/util/SparseArray;", "dispatchRestoreInstanceState", "SavedState", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuickReplyOptionView extends FrameLayout implements Renderer<QuickReplyOptionRendering> {
    public static final int $stable = 8;

    @NotNull
    private final FrameLayout quickReplyOptionContainer;

    @NotNull
    private final TextView quickReplyOptionTextView;

    @NotNull
    private QuickReplyOptionRendering rendering;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickReplyOptionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new QuickReplyOptionRendering();
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_QuickReplyOption, false);
        View.inflate(context, R.layout.zuia_view_quick_reply_option, this);
        View viewFindViewById = findViewById(R.id.zuia_quick_reply_options_view_container);
        viewFindViewById.getClass();
        this.quickReplyOptionContainer = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_quick_reply_options_view);
        viewFindViewById2.getClass();
        this.quickReplyOptionTextView = (TextView) viewFindViewById2;
        render(new z(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickReplyOptionRendering _init_$lambda$0(QuickReplyOptionRendering quickReplyOptionRendering) {
        quickReplyOptionRendering.getClass();
        return quickReplyOptionRendering;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickReplyOptionRendering onRestoreInstanceState$lambda$6(QuickReplyOptionRendering quickReplyOptionRendering) {
        quickReplyOptionRendering.getClass();
        return quickReplyOptionRendering;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$3(QuickReplyOptionView quickReplyOptionView) {
        Function2<String, String, Unit> onOptionClicked$zendesk_ui_ui_android = quickReplyOptionView.rendering.getOnOptionClicked$zendesk_ui_ui_android();
        if (onOptionClicked$zendesk_ui_ui_android != null) {
            onOptionClicked$zendesk_ui_ui_android.invoke(quickReplyOptionView.rendering.getState().getId$zendesk_ui_ui_android(), quickReplyOptionView.rendering.getState().getText$zendesk_ui_ui_android());
            quickReplyOptionView.setSelected(true);
            quickReplyOptionView.render(new z(4));
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickReplyOptionRendering render$lambda$3$lambda$2$lambda$1(QuickReplyOptionRendering quickReplyOptionRendering) {
        quickReplyOptionRendering.getClass();
        return quickReplyOptionRendering;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$4(QuickReplyOptionView quickReplyOptionView, int i11, int i12, View view, boolean z11) {
        if (!z11) {
            quickReplyOptionView.setupQuickReplyStateBackground(i11, i12);
            return;
        }
        Drawable drawable = quickReplyOptionView.getContext().getDrawable(R.drawable.zuia_quick_reply_option_background);
        drawable.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.mutate();
        gradientDrawable.setStroke(quickReplyOptionView.getResources().getDimensionPixelSize(R.dimen.zuia_message_composer_stroke_width), i11);
        quickReplyOptionView.quickReplyOptionTextView.setBackground(gradientDrawable);
    }

    private final void setupQuickReplyStateBackground(int tappedBackgroundColor, int untappedBackgroundColor) {
        Drawable drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable2 = getContext().getDrawable(R.drawable.zuia_quick_reply_option_background);
        drawable2.getClass();
        GradientDrawable gradientDrawable = (GradientDrawable) drawable2;
        gradientDrawable.setColor(ColorExtKt.adjustAlpha(tappedBackgroundColor, 0.3f));
        gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.zuia_quick_reply_options_width), tappedBackgroundColor);
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, gradientDrawable);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        Drawable drawable3 = getContext().getDrawable(R.drawable.zuia_quick_reply_option_background);
        drawable3.getClass();
        GradientDrawable gradientDrawable2 = (GradientDrawable) drawable3;
        gradientDrawable2.setColor(untappedBackgroundColor);
        gradientDrawable2.setStroke(getResources().getDimensionPixelSize(R.dimen.zuia_quick_reply_options_width), tappedBackgroundColor);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable2);
        TextView textView = this.quickReplyOptionTextView;
        boolean zIsSelected = isSelected();
        FrameLayout frameLayout = this.quickReplyOptionContainer;
        if (zIsSelected) {
            frameLayout.setEnabled(false);
            drawable = gradientDrawable;
        } else {
            frameLayout.setEnabled(true);
            drawable = stateListDrawable;
        }
        textView.setBackground(drawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NotNull SparseArray<Parcelable> container) {
        container.getClass();
        dispatchThawSelfOnly(container);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(@NotNull SparseArray<Parcelable> container) {
        container.getClass();
        dispatchFreezeSelfOnly(container);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable state) {
        state.getClass();
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        setSelected(Boolean.parseBoolean(savedState.getIsSelected()));
        render(new z(5));
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.setSelected$zendesk_ui_ui_android(String.valueOf(isSelected()));
        return savedState;
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super QuickReplyOptionRendering, ? extends QuickReplyOptionRendering> renderingUpdate) {
        renderingUpdate.getClass();
        QuickReplyOptionState state = this.rendering.getState();
        QuickReplyOptionRendering quickReplyOptionRendering = (QuickReplyOptionRendering) renderingUpdate.invoke(this.rendering);
        this.rendering = quickReplyOptionRendering;
        if (Intrinsics.areEqual(state, quickReplyOptionRendering.getState())) {
            return;
        }
        final int color$zendesk_ui_ui_android = this.rendering.getState().getColor$zendesk_ui_ui_android();
        final int backgroundColor$zendesk_ui_ui_android = this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android();
        setupQuickReplyStateBackground(color$zendesk_ui_ui_android, backgroundColor$zendesk_ui_ui_android);
        this.quickReplyOptionTextView.setText(this.rendering.getState().getText$zendesk_ui_ui_android());
        this.quickReplyOptionTextView.setTextColor(color$zendesk_ui_ui_android);
        this.quickReplyOptionContainer.setOnClickListener(ThrottledOnClickListenerKt.throttledOnClickListener$default(0L, new a(this, 2), 1, null));
        FrameLayout frameLayout = this.quickReplyOptionContainer;
        CharSequence text = this.quickReplyOptionTextView.getText();
        frameLayout.setContentDescription(((Object) text) + ". " + getResources().getString(R.string.zuia_quick_reply_button_accessibility_label));
        this.quickReplyOptionContainer.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sb0.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                QuickReplyOptionView.render$lambda$4(this.f38960a, color$zendesk_ui_ui_android, backgroundColor$zendesk_ui_ui_android, view, z11);
            }
        });
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionView$SavedState;", "Landroid/view/View$BaseSavedState;", "superState", "Landroid/os/Parcelable;", "<init>", "(Landroid/os/Parcelable;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "isSelected", "", "isSelected$zendesk_ui_ui_android", "()Ljava/lang/String;", "setSelected$zendesk_ui_ui_android", "(Ljava/lang/String;)V", "writeToParcel", "", "out", "flags", "", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @Nullable
        private String isSelected;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @NotNull
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: zendesk.ui.android.conversation.quickreply.QuickReplyOptionView$SavedState$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            public QuickReplyOptionView.SavedState createFromParcel(Parcel source) {
                source.getClass();
                return new QuickReplyOptionView.SavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            public QuickReplyOptionView.SavedState[] newArray(int size) {
                return new QuickReplyOptionView.SavedState[size];
            }
        };

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcel parcel) {
            super(parcel);
            parcel.getClass();
            this.isSelected = "false";
            this.isSelected = parcel.readString();
        }

        @Nullable
        /* JADX INFO: renamed from: isSelected$zendesk_ui_ui_android, reason: from getter */
        public final String getIsSelected() {
            return this.isSelected;
        }

        public final void setSelected$zendesk_ui_ui_android(@Nullable String str) {
            this.isSelected = str;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            out.getClass();
            super.writeToParcel(out, flags);
            out.writeString(this.isSelected);
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionView$SavedState$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lzendesk/ui/android/conversation/quickreply/QuickReplyOptionView$SavedState;", "getCREATOR$annotations", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public static /* synthetic */ void getCREATOR$annotations() {
            }
        }

        public SavedState(@Nullable Parcelable parcelable) {
            super(parcelable);
            this.isSelected = "false";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickReplyOptionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickReplyOptionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ QuickReplyOptionView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickReplyOptionView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
