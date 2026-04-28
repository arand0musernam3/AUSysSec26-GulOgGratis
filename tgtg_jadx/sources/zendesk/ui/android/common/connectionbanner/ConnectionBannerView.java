package zendesk.ui.android.common.connectionbanner;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.n;
import zendesk.messaging.android.internal.conversationscreen.o;
import zendesk.ui.android.R;
import zendesk.ui.android.Renderer;
import zendesk.ui.android.common.connectionbanner.ConnectionBannerState;
import zendesk.ui.android.internal.DimensionExtKt;
import zendesk.ui.android.internal.ThrottledOnClickListenerKt;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003$%&B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u001a\u001a\u00020\u001bH\u0014J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0014J\u001c\u0010\u001f\u001a\u00020\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030!H\u0016J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerView;", "Landroid/widget/FrameLayout;", "Lzendesk/ui/android/Renderer;", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerRendering;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttrs", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "rendering", "connectionBanner", "Landroid/view/View;", AnnotatedPrivateKey.LABEL, "Landroid/widget/TextView;", "retryButton", "Landroid/widget/ImageView;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "shouldAnimate", "", "animationTime", "", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "", "state", "render", "renderingUpdate", "Lkotlin/Function1;", "renderConnectionState", "startAnimation", "SavedState", "ConnectionStateParceler", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConnectionBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionBannerView.kt\nzendesk/ui/android/common/connectionbanner/ConnectionBannerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,245:1\n255#2:246\n*S KotlinDebug\n*F\n+ 1 ConnectionBannerView.kt\nzendesk/ui/android/common/connectionbanner/ConnectionBannerView\n*L\n154#1:246\n*E\n"})
public final class ConnectionBannerView extends FrameLayout implements Renderer<ConnectionBannerRendering> {
    private static final long FADE_DURATION = 300;
    private final long animationTime;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final View connectionBanner;

    @NotNull
    private final TextView label;

    @NotNull
    private ConnectionBannerRendering rendering;

    @NotNull
    private final ImageView retryButton;
    private boolean shouldAnimate;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerView$ConnectionStateParceler;", "", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "create", "(Landroid/os/Parcel;)Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;", "", "flags", "", "write", "(Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;Landroid/os/Parcel;I)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConnectionStateParceler {
        public static final int $stable = 0;

        @NotNull
        public static final ConnectionStateParceler INSTANCE = new ConnectionStateParceler();

        private ConnectionStateParceler() {
        }

        @NotNull
        public ConnectionBannerState.ConnectionState create(@NotNull Parcel parcel) {
            parcel.getClass();
            SavedState.Companion companion = SavedState.INSTANCE;
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            return companion.parseConnectionStateValue(string);
        }

        @NotNull
        public ConnectionBannerState.ConnectionState[] newArray(int i11) {
            throw new n("Generated by Android Extensions automatically");
        }

        public void write(@NotNull ConnectionBannerState.ConnectionState connectionState, @NotNull Parcel parcel, int i11) {
            connectionState.getClass();
            parcel.getClass();
            parcel.writeString(connectionState.getStateValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        this.rendering = new ConnectionBannerRendering();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        context.getTheme().applyStyle(R.style.ThemeOverlay_ZendeskComponents_ConnectionBannerStyle, false);
        View.inflate(context, R.layout.zuia_view_connection_banner, this);
        View viewFindViewById = findViewById(R.id.zuia_connection_banner);
        viewFindViewById.getClass();
        this.connectionBanner = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.zuia_banner_label);
        viewFindViewById2.getClass();
        this.label = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.zuia_retry_button);
        viewFindViewById3.getClass();
        ImageView imageView = (ImageView) viewFindViewById3;
        this.retryButton = imageView;
        this.animationTime = getResources().getInteger(R.integer.zuia_connection_banner_animation_duration);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(DimensionExtKt.resolveDimensionAttr(context, new int[]{R.attr.connectionBannerRadius}));
        ViewKt.expandTouchArea$default(imageView, this, 0, 0, 0, 0, 30, null);
        setVisibility(8);
        render(new o(25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionBannerRendering _init_$lambda$1(ConnectionBannerRendering connectionBannerRendering) {
        connectionBannerRendering.getClass();
        return connectionBannerRendering;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionBannerRendering onRestoreInstanceState$lambda$3(Parcelable parcelable, ConnectionBannerRendering connectionBannerRendering) {
        connectionBannerRendering.getClass();
        return connectionBannerRendering.toBuilder().showRetry(((SavedState) parcelable).getShowRetry()).state(new zendesk.core.android.internal.a(parcelable, 6)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionBannerState onRestoreInstanceState$lambda$3$lambda$2(Parcelable parcelable, ConnectionBannerState connectionBannerState) {
        connectionBannerState.getClass();
        return ConnectionBannerState.copy$default(connectionBannerState, ((SavedState) parcelable).getConnectionState(), 0, 0, 0, 0, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$4(ConnectionBannerView connectionBannerView) {
        connectionBannerView.rendering.getOnRetryClicked$zendesk_ui_ui_android().invoke();
        return Unit.f26487a;
    }

    private final void renderConnectionState() {
        CharSequence text;
        ConnectionBannerState.ConnectionState connectionState$zendesk_ui_ui_android = this.rendering.getState().getConnectionState$zendesk_ui_ui_android();
        int i11 = 0;
        if (Intrinsics.areEqual(connectionState$zendesk_ui_ui_android, ConnectionBannerState.ConnectionState.Disconnected.INSTANCE)) {
            this.backgroundDrawable.setColor(this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android());
            this.label.setTextColor(this.rendering.getState().getLabelColor$zendesk_ui_ui_android());
            this.label.setText(R.string.zuia_connection_banner_label_disconnected);
            this.shouldAnimate = true;
            text = ((Object) this.label.getText()) + " " + ((Object) this.retryButton.getContentDescription());
        } else if (Intrinsics.areEqual(connectionState$zendesk_ui_ui_android, ConnectionBannerState.ConnectionState.Connected.INSTANCE)) {
            this.backgroundDrawable.setColor(this.rendering.getState().getSuccessBackgroundColor$zendesk_ui_ui_android());
            this.label.setTextColor(this.rendering.getState().getOnSuccessColor$zendesk_ui_ui_android());
            this.label.setText(R.string.zuia_connection_banner_label_connected);
            this.shouldAnimate = true;
            text = ((Object) this.label.getText()) + " " + ((Object) this.retryButton.getContentDescription());
        } else {
            if (Intrinsics.areEqual(connectionState$zendesk_ui_ui_android, ConnectionBannerState.ConnectionState.Reconnecting.INSTANCE)) {
                this.backgroundDrawable.setColor(this.rendering.getState().getBackgroundColor$zendesk_ui_ui_android());
                this.label.setTextColor(this.rendering.getState().getLabelColor$zendesk_ui_ui_android());
                this.label.setText(R.string.zuia_connection_banner_label_reconnecting);
                this.shouldAnimate = false;
                text = this.label.getText();
            } else {
                if (!Intrinsics.areEqual(connectionState$zendesk_ui_ui_android, ConnectionBannerState.ConnectionState.Reconnected.INSTANCE)) {
                    e40.a.f();
                    return;
                }
                this.label.setText(R.string.zuia_connection_banner_label_state_reconnected);
                this.backgroundDrawable.setColor(this.rendering.getState().getSuccessBackgroundColor$zendesk_ui_ui_android());
                this.label.setTextColor(this.rendering.getState().getOnSuccessColor$zendesk_ui_ui_android());
                this.shouldAnimate = getVisibility() == 0;
                onSaveInstanceState();
                text = this.label.getText();
            }
            i11 = 8;
        }
        this.connectionBanner.setContentDescription(text);
        ViewCompat.d0(this.label, text);
        this.retryButton.getDrawable().setTint(this.rendering.getState().getLabelColor$zendesk_ui_ui_android());
        this.connectionBanner.setBackground(this.backgroundDrawable);
        this.retryButton.setVisibility(this.rendering.getShowRetry() ? i11 : 8);
        if (this.shouldAnimate) {
            startAnimation();
        }
    }

    private final void startAnimation() {
        animate().setDuration(FADE_DURATION).setStartDelay(this.animationTime);
        if (Intrinsics.areEqual(this.rendering.getState().getConnectionState$zendesk_ui_ui_android(), ConnectionBannerState.ConnectionState.Disconnected.INSTANCE)) {
            final int i11 = 0;
            animate().alpha(1.0f).withStartAction(new Runnable(this) { // from class: zendesk.ui.android.common.connectionbanner.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ConnectionBannerView f47789b;

                {
                    this.f47789b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.f47789b.setVisibility(0);
                            break;
                        default:
                            this.f47789b.setVisibility(8);
                            break;
                    }
                }
            }).start();
        }
        if (Intrinsics.areEqual(this.rendering.getState().getConnectionState$zendesk_ui_ui_android(), ConnectionBannerState.ConnectionState.Reconnected.INSTANCE)) {
            final int i12 = 1;
            animate().alpha(0.0f).withEndAction(new Runnable(this) { // from class: zendesk.ui.android.common.connectionbanner.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ConnectionBannerView f47789b;

                {
                    this.f47789b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.f47789b.setVisibility(0);
                            break;
                        default:
                            this.f47789b.setVisibility(8);
                            break;
                    }
                }
            }).start();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        setVisibility(savedState.getVisibility());
        render(new zendesk.core.android.internal.a(savedState, 7));
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), getVisibility(), this.rendering.getShowRetry(), this.rendering.getState().getConnectionState$zendesk_ui_ui_android());
    }

    @Override // zendesk.ui.android.Renderer
    public void render(@NotNull Function1<? super ConnectionBannerRendering, ? extends ConnectionBannerRendering> renderingUpdate) {
        renderingUpdate.getClass();
        this.rendering = (ConnectionBannerRendering) renderingUpdate.invoke(this.rendering);
        this.retryButton.setOnClickListener(ThrottledOnClickListenerKt.throttledOnClickListener$default(0L, new y.a(this, 24), 1, null));
        if (getVisibility() == 0 || Intrinsics.areEqual(this.rendering.getState().getConnectionState$zendesk_ui_ui_android(), ConnectionBannerState.ConnectionState.Disconnected.INSTANCE)) {
            renderConnectionState();
        } else {
            animate().cancel();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerView$SavedState;", "Landroid/view/View$BaseSavedState;", "state", "Landroid/os/Parcelable;", "visibility", "", "showRetry", "", "connectionState", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;", "<init>", "(Landroid/os/Parcelable;IZLzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;)V", "getState", "()Landroid/os/Parcelable;", "getVisibility", "()I", "setVisibility", "(I)V", "getShowRetry", "()Z", "setShowRetry", "(Z)V", "getConnectionState", "()Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;", "setConnectionState", "(Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;)V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @NotNull
        private ConnectionBannerState.ConnectionState connectionState;
        private boolean showRetry;

        @Nullable
        private final Parcelable state;
        private int visibility;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        public static final int $stable = 8;

        public /* synthetic */ SavedState(Parcelable parcelable, int i11, boolean z11, ConnectionBannerState.ConnectionState connectionState, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcelable, (i12 & 2) != 0 ? 8 : i11, (i12 & 4) != 0 ? true : z11, (i12 & 8) != 0 ? ConnectionBannerState.ConnectionState.Connected.INSTANCE : connectionState);
        }

        @NotNull
        public final ConnectionBannerState.ConnectionState getConnectionState() {
            return this.connectionState;
        }

        public final boolean getShowRetry() {
            return this.showRetry;
        }

        @Nullable
        public final Parcelable getState() {
            return this.state;
        }

        public final int getVisibility() {
            return this.visibility;
        }

        public final void setConnectionState(@NotNull ConnectionBannerState.ConnectionState connectionState) {
            connectionState.getClass();
            this.connectionState = connectionState;
        }

        public final void setShowRetry(boolean z11) {
            this.showRetry = z11;
        }

        public final void setVisibility(int i11) {
            this.visibility = i11;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeParcelable(this.state, flags);
            dest.writeInt(this.visibility);
            dest.writeInt(this.showRetry ? 1 : 0);
            ConnectionStateParceler.INSTANCE.write(this.connectionState, dest, flags);
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerView$SavedState$Companion;", "", "<init>", "()V", "parseConnectionStateValue", "Lzendesk/ui/android/common/connectionbanner/ConnectionBannerState$ConnectionState;", "stateValue", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ConnectionBannerState.ConnectionState parseConnectionStateValue(@NotNull String stateValue) {
                stateValue.getClass();
                int iHashCode = stateValue.hashCode();
                if (iHashCode != -1217068453) {
                    if (iHashCode != -273361386) {
                        if (iHashCode == 115735883 && stateValue.equals("Reconnecting")) {
                            return ConnectionBannerState.ConnectionState.Reconnecting.INSTANCE;
                        }
                    } else if (stateValue.equals("Reconnected")) {
                        return ConnectionBannerState.ConnectionState.Reconnected.INSTANCE;
                    }
                } else if (stateValue.equals("Disconnected")) {
                    return ConnectionBannerState.ConnectionState.Disconnected.INSTANCE;
                }
                return ConnectionBannerState.ConnectionState.Connected.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0, ConnectionStateParceler.INSTANCE.create(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@Nullable Parcelable parcelable, int i11, boolean z11, @NotNull ConnectionBannerState.ConnectionState connectionState) {
            super(parcelable);
            connectionState.getClass();
            this.state = parcelable;
            this.visibility = i11;
            this.showRetry = z11;
            this.connectionState = connectionState;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/ui/android/common/connectionbanner/ConnectionBannerView$Companion;", "", "<init>", "()V", "FADE_DURATION", "", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ ConnectionBannerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionBannerView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
