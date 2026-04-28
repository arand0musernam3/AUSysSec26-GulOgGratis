package lq;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f28161k = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ComposeView f28162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28163i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28164j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f28163i = true;
        Context context2 = getContext();
        context2.getClass();
        ComposeView composeView = new ComposeView(context2, null, 0, 6, null);
        this.f28162h = composeView;
        addView(composeView);
    }

    @Override // lq.m
    @Nullable
    public mq.a getItem() {
        return super.getItem();
    }

    public final boolean getShouldShowSpecialReward() {
        return this.f28164j;
    }

    public final void setIsDiscover(boolean z11) {
        this.f28163i = z11;
    }

    @Override // lq.m
    public void setItem(@Nullable mq.a aVar) {
        super.setItem(aVar);
        ComposeView composeView = this.f28162h;
        if (composeView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("composeView");
            composeView = null;
        }
        composeView.setContent(new u3.d(new kq.c(4, aVar, this), true, -1675497686));
    }

    public final void setShouldShowSpecialReward(boolean z11) {
        this.f28164j = z11;
    }

    public /* synthetic */ s(Context context) {
        this(context, null, 0);
    }
}
