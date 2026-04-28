package gr;

import ag.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import com.app.tgtg.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f20805a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        j(context, context.obtainStyledAttributes(attributeSet, n.f1446a, 0, 0));
    }

    @NotNull
    public final l getBinding() {
        l lVar = this.f20805a;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void j(Context context, TypedArray typedArray) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i11 = l.f34964w;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        l lVar = (l) a8.k.Z(layoutInflaterFrom, R.layout.bullet_text_view, this, true, null);
        lVar.getClass();
        setBinding(lVar);
        if (typedArray != null) {
            try {
                getBinding().f0(typedArray.getString(0));
                getBinding().f34965s.setPadding(0, (int) typedArray.getDimension(1, d70.b.a(10)), 0, (int) typedArray.getDimension(1, d70.b.a(10)));
                getBinding().f34967u.setTextAppearance(typedArray.getResourceId(2, R.style.Body2_Black));
            } finally {
                typedArray.recycle();
            }
        }
    }

    public final void setBinding(@NotNull l lVar) {
        lVar.getClass();
        this.f20805a = lVar;
    }

    public final void setContent(@NotNull Spanned spanned) {
        spanned.getClass();
        getBinding().f34966t.setText(spanned);
        TextView textView = getBinding().f34966t;
        textView.getClass();
        p30.b.E(textView, true);
    }

    public final void setTitle(int i11) {
        getBinding().f0(getContext().getString(i11));
    }

    public final void setTitle(@Nullable String str) {
        getBinding().f0(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@Nullable Context context) {
        super(context);
        context.getClass();
        j(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        j(context, context.obtainStyledAttributes(attributeSet, n.f1446a, i11, 0));
    }
}
