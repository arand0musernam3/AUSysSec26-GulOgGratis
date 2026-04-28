package lq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.app.tgtg.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends m {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    @Override // lq.m
    public final void b() {
        View.inflate(getContext(), R.layout.discover_empty_favorite_view, this);
        setItemContainer(findViewById(R.id.clContainer));
        super.b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        b();
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }
}
