package kp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c50.w;
import com.app.tgtg.R;
import com.app.tgtg.feature.recipegenerator.ui.DiscoverRecipeGeneratorPromoView;
import hq.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pg.t0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f26638j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function0 f26639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f26640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f26641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0 f26642i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull Context context) {
        super(context, 6);
        context.getClass();
        if (!isInEditMode()) {
            b();
        }
        this.f26639f = new jq.a(8);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.discover_recipe_generator_promo_view, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            w.l("rootView");
            throw null;
        }
        DiscoverRecipeGeneratorPromoView discoverRecipeGeneratorPromoView = (DiscoverRecipeGeneratorPromoView) viewInflate;
        this.f26642i = new t0(discoverRecipeGeneratorPromoView, discoverRecipeGeneratorPromoView);
        setLayoutParams(new RecyclerView.a(-1, -2));
    }

    @NotNull
    public final t0 getBinding() {
        return this.f26642i;
    }

    @NotNull
    public final nq.d getBucket() {
        b bVar = this.f26641h;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("discoverRow");
        return null;
    }

    @NotNull
    public final Function0<Unit> getOnRecipeGeneratorPromoCardClicked() {
        return this.f26639f;
    }

    public final void setBinding(@NotNull t0 t0Var) {
        t0Var.getClass();
        this.f26642i = t0Var;
    }

    @Override // hq.j
    public void setDiscoverRow(@NotNull nq.d dVar) {
        dVar.getClass();
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            this.f26641h = bVar;
            this.f26642i.f35161b.setBucket(bVar.f26634a);
            final int i11 = 0;
            this.f26642i.f35161b.setOnRecipeGeneratorPromoCardClicked(new Function0(this) { // from class: kp.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f26637b;

                {
                    this.f26637b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            this.f26637b.f26639f.invoke();
                            break;
                        default:
                            Runnable runnable = this.f26637b.f26640g;
                            if (runnable != null) {
                                runnable.run();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            });
            final int i12 = 1;
            this.f26642i.f35161b.setOnDismiss(new Function0(this) { // from class: kp.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f26637b;

                {
                    this.f26637b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            this.f26637b.f26639f.invoke();
                            break;
                        default:
                            Runnable runnable = this.f26637b.f26640g;
                            if (runnable != null) {
                                runnable.run();
                            }
                            break;
                    }
                    return Unit.f26487a;
                }
            });
        }
    }

    public final void setOnRecipeGeneratorPromoCardClicked(@NotNull Function0<Unit> function0) {
        function0.getClass();
        this.f26639f = function0;
    }

    public final void setSelfRemovalRunnable(@NotNull Runnable runnable) {
        runnable.getClass();
        this.f26640g = runnable;
    }
}
