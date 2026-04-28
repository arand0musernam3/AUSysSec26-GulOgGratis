package hq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.m1;
import androidx.lifecycle.s1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.DiscoverNotLiveHereView;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.google.firebase.messaging.a0;
import g3.q9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f22399h = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u70.t f22400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function0 f22401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function1 f22402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pg.v f22403g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@NotNull Context context) {
        super(context);
        context.getClass();
        this.f22400d = u70.l.b(new q(this, 1));
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.discover_not_live_here_view, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            c50.w.l("rootView");
            throw null;
        }
        DiscoverNotLiveHereView discoverNotLiveHereView = (DiscoverNotLiveHereView) viewInflate;
        this.f22403g = new pg.v(discoverNotLiveHereView, discoverNotLiveHereView, 3);
        int i11 = getContext().getResources().getDisplayMetrics().widthPixels;
        int i12 = getContext().getResources().getDisplayMetrics().heightPixels;
        Context contextD = p70.g.d(getContext());
        contextD.getClass();
        setLayoutParams(new RecyclerView.a(i11, (i12 - ((MainActivity) contextD).e0()) - d70.b.a(200)));
    }

    public static s c(r rVar) {
        s1 s1VarB = m1.b(rVar);
        s1VarB.getClass();
        ViewModelStore viewModelStore = s1VarB.getViewModelStore();
        boolean z11 = s1VarB instanceof androidx.lifecycle.p;
        ViewModelProvider$Factory defaultViewModelProviderFactory = z11 ? ((androidx.lifecycle.p) s1VarB).getDefaultViewModelProviderFactory() : a9.b.f1000a;
        CreationExtras defaultViewModelCreationExtras = z11 ? ((androidx.lifecycle.p) s1VarB).getDefaultViewModelCreationExtras() : y8.a.f45423b;
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        a0 a0Var = new a0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(s.class);
        orCreateKotlinClass.getClass();
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            return (s) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        }
        i4.a.f("Local and anonymous classes can not be ViewModels");
        return null;
    }

    private final s getViewModel() {
        return (s) this.f22400d.getValue();
    }

    @Nullable
    public final Function0<Unit> getOnChangeLocationClicked() {
        return this.f22401e;
    }

    @Nullable
    public final Function1<String, Unit> getOnInstagramClick() {
        return this.f22402f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((DiscoverNotLiveHereView) this.f22403g.f35202c).setInstagramUrl(getViewModel().f22404a.n().getInstagramUrl());
    }

    @Override // hq.j
    public void setDiscoverRow(@NotNull nq.d dVar) {
        dVar.getClass();
        if (dVar instanceof nq.h) {
            DiscoverBucket discoverBucket = ((nq.h) dVar).f31360a;
            DiscoverNotLiveHereView discoverNotLiveHereView = (DiscoverNotLiveHereView) this.f22403g.f35202c;
            if (discoverBucket == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bucket");
                discoverBucket = null;
            }
            discoverNotLiveHereView.setBucket(discoverBucket);
            discoverNotLiveHereView.setInstagramUrl(null);
            discoverNotLiveHereView.setOnChangeLocationClicked(new q(this, 0));
            discoverNotLiveHereView.setOnFollowClick(new q9(this, 16));
        }
    }

    public final void setOnChangeLocationClicked(@Nullable Function0<Unit> function0) {
        this.f22401e = function0;
    }

    public final void setOnInstagramClick(@Nullable Function1<? super String, Unit> function1) {
        this.f22402f = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f22400d = u70.l.b(new q(this, 1));
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.discover_not_live_here_view, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate != null) {
            DiscoverNotLiveHereView discoverNotLiveHereView = (DiscoverNotLiveHereView) viewInflate;
            this.f22403g = new pg.v(discoverNotLiveHereView, discoverNotLiveHereView, 3);
            int i11 = getContext().getResources().getDisplayMetrics().widthPixels;
            int i12 = getContext().getResources().getDisplayMetrics().heightPixels;
            Context contextD = p70.g.d(getContext());
            contextD.getClass();
            setLayoutParams(new RecyclerView.a(i11, (i12 - ((MainActivity) contextD).e0()) - d70.b.a(200)));
            return;
        }
        c50.w.l("rootView");
        throw null;
    }
}
