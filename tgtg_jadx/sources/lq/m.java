package lq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import mv.r0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m extends LinearLayout implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p70.g f28144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f28146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f28147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f28148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public mq.a f28149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28150g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        if (!isInEditMode()) {
            c();
        }
        this.f28150g = -1;
    }

    @Override // r70.b
    public final Object a() {
        if (this.f28144a == null) {
            this.f28144a = new p70.g(this);
        }
        return this.f28144a.a();
    }

    public void b() {
        Context context = getContext();
        context.getClass();
        View view = this.f28148e;
        if (this.f28150g == -1) {
            int iA = d70.b.a(327);
            int iWidth = (int) (((double) d70.b.c().width()) * 0.85d);
            if (iWidth <= iA && !r0.r(context)) {
                iA = iWidth;
            }
            this.f28150g = iA;
        }
        int i11 = this.f28150g;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i11;
        }
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }

    public void c() {
        if (this.f28145b) {
            return;
        }
        this.f28145b = true;
        ((n) a()).getClass();
    }

    @Nullable
    public final Function0<Unit> getFavoriteOnClickLister() {
        return this.f28147d;
    }

    @Nullable
    public mq.a getItem() {
        return this.f28149f;
    }

    @Nullable
    public final View getItemContainer() {
        return this.f28148e;
    }

    @Nullable
    public final Function1<BasicItem, Unit> getOnCardClicked() {
        return this.f28146c;
    }

    public final void setFavoriteOnClickLister(@Nullable Function0<Unit> function0) {
        this.f28147d = function0;
    }

    public void setItem(@Nullable mq.a aVar) {
        this.f28149f = aVar;
    }

    public final void setItemContainer(@Nullable View view) {
        this.f28148e = view;
    }

    public final void setOnCardClicked(@Nullable Function1<? super BasicItem, Unit> function1) {
        this.f28146c = function1;
    }
}
