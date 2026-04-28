package com.app.tgtg.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import c50.w;
import com.app.tgtg.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.g;
import pg.y0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class FavoriteIconView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8904b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f8905a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteIconView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.favorite_icon_view, (ViewGroup) this, false);
        addView(viewInflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i12 = R.id.icon;
        ImageView imageView = (ImageView) g.t(R.id.icon, viewInflate);
        if (imageView != null) {
            i12 = R.id.iconBackground;
            ImageView imageView2 = (ImageView) g.t(R.id.iconBackground, viewInflate);
            if (imageView2 != null) {
                this.f8905a = new y0(constraintLayout, imageView, imageView2);
                return;
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i12)));
        throw null;
    }

    public static /* synthetic */ void setIsFavorite$default(FavoriteIconView favoriteIconView, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z13 = false;
        }
        favoriteIconView.setIsFavorite(z11, z12, z13);
    }

    @NotNull
    public final y0 getBinding() {
        return this.f8905a;
    }

    public final void setBinding(@NotNull y0 y0Var) {
        y0Var.getClass();
        this.f8905a = y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setIsFavorite(boolean r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            pg.y0 r0 = r4.f8905a
            android.widget.ImageView r1 = r0.f35278c
            android.widget.ImageView r0 = r0.f35277b
            r2 = 0
            if (r7 != 0) goto Lb
            r3 = r2
            goto Ld
        Lb:
            r3 = 8
        Ld:
            r1.setVisibility(r3)
            if (r5 == 0) goto L52
            if (r6 == 0) goto L37
            android.content.Context r5 = r4.getContext()
            r5.getClass()
            android.app.Activity r5 = mv.r0.e(r5)
            if (r5 == 0) goto L37
            android.content.Context r5 = r4.getContext()
            r5.getClass()
            android.app.Activity r5 = mv.r0.e(r5)
            if (r5 == 0) goto L43
            bg.u r6 = new bg.u
            r6.<init>(r0, r7, r2)
            r5.runOnUiThread(r6)
            goto L43
        L37:
            if (r7 == 0) goto L3d
            r5 = 2131231949(0x7f0804cd, float:1.8079993E38)
            goto L40
        L3d:
            r5 = 2131231948(0x7f0804cc, float:1.8079991E38)
        L40:
            r0.setBackgroundResource(r5)
        L43:
            android.content.Context r5 = r4.getContext()
            r6 = 2132020095(0x7f140b7f, float:1.9678543E38)
            java.lang.String r5 = r5.getString(r6)
            r0.setContentDescription(r5)
            return
        L52:
            if (r7 == 0) goto L58
            r5 = 2131231952(0x7f0804d0, float:1.808E38)
            goto L5b
        L58:
            r5 = 2131231951(0x7f0804cf, float:1.8079998E38)
        L5b:
            r0.setBackgroundResource(r5)
            android.content.Context r5 = r4.getContext()
            r6 = 2132020079(0x7f140b6f, float:1.967851E38)
            java.lang.String r5 = r5.getString(r6)
            r0.setContentDescription(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.tgtg.customview.FavoriteIconView.setIsFavorite(boolean, boolean, boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FavoriteIconView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FavoriteIconView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ FavoriteIconView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
