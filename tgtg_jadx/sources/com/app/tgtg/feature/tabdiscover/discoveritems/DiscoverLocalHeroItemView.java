package com.app.tgtg.feature.tabdiscover.discoveritems;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lk.a;
import lq.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class DiscoverLocalHeroItemView extends m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f9298j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ComposeView f9299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function0 f9300i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverLocalHeroItemView(Context context, AttributeSet attributeSet, int i11, Function0 function0) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f9300i = function0;
        Context context2 = getContext();
        context2.getClass();
        ComposeView composeView = new ComposeView(context2, null, 0, 6, null);
        this.f9299h = composeView;
        setItemContainer(composeView);
        View view = this.f9299h;
        ComposeView composeView2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("composeView");
            view = null;
        }
        addView(view);
        b();
        ComposeView composeView3 = this.f9299h;
        if (composeView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("composeView");
        } else {
            composeView2 = composeView3;
        }
        composeView2.setContent(new d(new a(this, 6), true, 1500663485));
    }

    @Override // lq.m
    @Nullable
    public mq.a getItem() {
        return super.getItem();
    }

    @Override // lq.m
    public void setItem(@Nullable mq.a aVar) {
        super.setItem(aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverLocalHeroItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverLocalHeroItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, null, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DiscoverLocalHeroItemView(@NotNull Context context) {
        this(context, null, 0, null, 14, null);
        context.getClass();
    }

    public /* synthetic */ DiscoverLocalHeroItemView(Context context, AttributeSet attributeSet, int i11, Function0 function0, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : function0);
    }
}
