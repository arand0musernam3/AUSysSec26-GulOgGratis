package zendesk.ui.android.internal;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.vectordrawable.graphics.drawable.c;
import androidx.vectordrawable.graphics.drawable.h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yi.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/widget/ImageView;", "", "avdResId", "Landroidx/vectordrawable/graphics/drawable/h;", "applyLoopingAnimatedVectorDrawable", "(Landroid/widget/ImageView;I)Landroidx/vectordrawable/graphics/drawable/h;", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ImageViewExtensionKt {

    /* JADX INFO: renamed from: zendesk.ui.android.internal.ImageViewExtensionKt$applyLoopingAnimatedVectorDrawable$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"zendesk/ui/android/internal/ImageViewExtensionKt$applyLoopingAnimatedVectorDrawable$1", "Landroidx/vectordrawable/graphics/drawable/c;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "onAnimationEnd", "(Landroid/graphics/drawable/Drawable;)V", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        final /* synthetic */ h $animated;
        final /* synthetic */ ImageView $this_applyLoopingAnimatedVectorDrawable;

        public AnonymousClass1(ImageView imageView, h hVar) {
            this.$this_applyLoopingAnimatedVectorDrawable = imageView;
            this.$animated = hVar;
        }

        @Override // androidx.vectordrawable.graphics.drawable.c
        public void onAnimationEnd(Drawable drawable) {
            this.$this_applyLoopingAnimatedVectorDrawable.post(new a0(this.$animated, 6));
        }
    }

    @Nullable
    public static final h applyLoopingAnimatedVectorDrawable(@NotNull ImageView imageView, int i11) {
        imageView.getClass();
        h hVarA = h.a(imageView.getContext(), i11);
        hVarA.b(new AnonymousClass1(imageView, hVarA));
        imageView.setImageDrawable(hVarA);
        hVarA.start();
        return hVarA;
    }
}
