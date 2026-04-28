package com.app.tgtg.feature.tabdiscover.discoveritems;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lk.a;
import lq.c;
import lq.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class DiscoverFavoritesPromoItemView extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9294k = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9295h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ComposeView f9296i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9297j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverFavoritesPromoItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        if (!isInEditMode()) {
            c();
        }
        Context context2 = getContext();
        context2.getClass();
        ComposeView composeView = new ComposeView(context2, null, 0, 6, null);
        this.f9296i = composeView;
        addView(composeView);
        ComposeView composeView2 = this.f9296i;
        if (composeView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("composeView");
            composeView2 = null;
        }
        composeView2.setContent(new d(new a(this, 5), true, 1532865535));
    }

    @Override // lq.m
    public final void c() {
        if (this.f9295h) {
            return;
        }
        this.f9295h = true;
        ((c) a()).getClass();
    }

    @Override // lq.m
    @Nullable
    public mq.a getItem() {
        return super.getItem();
    }

    public final void setCustomReminderAvailable(boolean z11) {
        this.f9297j = z11;
    }

    @Override // lq.m
    public void setItem(@Nullable mq.a aVar) {
        super.setItem(aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverFavoritesPromoItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverFavoritesPromoItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DiscoverFavoritesPromoItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
