package br;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.order.OrderType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.u2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends LinearLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f6646e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2 f6647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function2 f6648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function2 f6649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function1 f6650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i12 = u2.J;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        u2 u2Var = (u2) a8.k.Z(layoutInflaterFrom, R.layout.order_list_item_new, this, true, null);
        u2Var.getClass();
        this.f6647a = u2Var;
    }

    @Nullable
    public final Function1<Long, Unit> getOnHandleTime() {
        return this.f6650d;
    }

    @Nullable
    public final Function2<String, OrderType, Unit> getOnOrderClickedInvitation() {
        return this.f6648b;
    }

    @Nullable
    public final Function2<OrderId, OrderType, Unit> getOnOrderClickedOrder() {
        return this.f6649c;
    }

    public final void setOnHandleTime(@Nullable Function1<? super Long, Unit> function1) {
        this.f6650d = function1;
    }

    public final void setOnOrderClickedInvitation(@Nullable Function2<? super String, ? super OrderType, Unit> function2) {
        this.f6648b = function2;
    }

    public final void setOnOrderClickedOrder(@Nullable Function2<? super OrderId, ? super OrderType, Unit> function2) {
        this.f6649c = function2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ m(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }
}
