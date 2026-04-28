package com.app.tgtg.customview;

import a8.c;
import a8.k;
import ag.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import com.app.tgtg.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class LargeIconButton extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LargeIconButton(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i13 = h1.f34887u;
        DataBinderMapperImpl dataBinderMapperImpl = c.f965a;
        h1 h1Var = (h1) k.Z(layoutInflaterFrom, R.layout.large_icon_button, this, true, null);
        h1Var.getClass();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f1451f, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            CharSequence text = getResources().getText(typedArrayObtainStyledAttributes.getResourceId(1, R.string.me_menu_tab_title_store_login_sign_up_your_store));
            text.getClass();
            h1Var.f34889t.setText(text);
            h1Var.f34888s.setImageResource(typedArrayObtainStyledAttributes.getResourceId(0, R.drawable.system_icon_store_sign_up));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeIconButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeIconButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LargeIconButton(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ LargeIconButton(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
