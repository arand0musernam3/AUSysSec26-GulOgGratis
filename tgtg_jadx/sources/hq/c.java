package hq;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.e2;
import androidx.recyclerview.widget.y1;
import com.app.tgtg.R;
import com.app.tgtg.feature.bucketlist.ui.BucketListActivity;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.response.BasicItem;
import g3.q9;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mv.e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pg.h0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends p {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f22343r = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f22344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayoutManager f22345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lq.l f22346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22348j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public vz.a f22349k;
    public Consumer l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Consumer f22350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public nq.d f22351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h0 f22352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Function1 f22354q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        super(context, 0);
        context.getClass();
        final int i11 = 0;
        if (!isInEditMode()) {
            b();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i12 = h0.f34883v;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        final int i13 = 1;
        h0 h0Var = (h0) a8.k.Z(layoutInflaterFrom, R.layout.discover_bucket_view, this, true, null);
        h0Var.getClass();
        this.f22352o = h0Var;
        setLayoutParams(new RecyclerView.a(-1, -2));
        lq.l lVar = new lq.l();
        this.f22346h = lVar;
        lVar.f28139d = new Consumer(this) { // from class: hq.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f22342b;

            {
                this.f22342b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i14 = i11;
                c cVar = this.f22342b;
                switch (i14) {
                    case 0:
                        lq.m mVar = (lq.m) obj;
                        int i15 = c.f22343r;
                        mVar.getClass();
                        vz.a aVar = cVar.f22349k;
                        if (aVar != null) {
                            aVar.accept(mVar, cVar.f22346h);
                        }
                        break;
                    default:
                        mq.a aVar2 = (mq.a) obj;
                        if (aVar2 == null) {
                            int i16 = c.f22343r;
                        } else {
                            Consumer consumer = cVar.l;
                            if (consumer != null) {
                                consumer.accept(aVar2);
                            }
                        }
                        break;
                }
            }
        };
        lVar.f28140e = new Consumer(this) { // from class: hq.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f22342b;

            {
                this.f22342b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i14 = i13;
                c cVar = this.f22342b;
                switch (i14) {
                    case 0:
                        lq.m mVar = (lq.m) obj;
                        int i15 = c.f22343r;
                        mVar.getClass();
                        vz.a aVar = cVar.f22349k;
                        if (aVar != null) {
                            aVar.accept(mVar, cVar.f22346h);
                        }
                        break;
                    default:
                        mq.a aVar2 = (mq.a) obj;
                        if (aVar2 == null) {
                            int i16 = c.f22343r;
                        } else {
                            Consumer consumer = cVar.l;
                            if (consumer != null) {
                                consumer.accept(aVar2);
                            }
                        }
                        break;
                }
            }
        };
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f22345g = linearLayoutManager;
        linearLayoutManager.setOrientation(0);
        this.f22352o.f34885t.setLayoutManager(this.f22345g);
        this.f22352o.f34885t.setAdapter(lVar);
        this.f22352o.f34885t.k(new b0(this, 4));
        this.f22352o.f34885t.j(new fn.p(this, 1));
    }

    public final void c(boolean z11) {
        if (z11) {
            getImpressionHelper().f30176b.clear();
        }
        nq.d dVar = this.f22351n;
        DiscoverBucket discoverBucket = dVar instanceof DiscoverBucket ? (DiscoverBucket) dVar : null;
        if (discoverBucket != null) {
            e0 impressionHelper = getImpressionHelper();
            ArrayList arrayList = this.f22346h.f28136a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof BasicItem) {
                    arrayList2.add(obj);
                }
            }
            y1 layoutManager = this.f22352o.f34885t.getLayoutManager();
            layoutManager.getClass();
            e0.e(impressionHelper, arrayList2, (LinearLayoutManager) layoutManager, cv.g.DISCOVER, discoverBucket.getFillerType(), this.f22353p, new q9(this, 14), 32);
        }
    }

    public final void d(DiscoverBucket discoverBucket) {
        int i11 = BucketListActivity.f8968i;
        Context context = getContext();
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) BucketListActivity.class);
        intent.putExtra("FILLER_TYPE", discoverBucket.getFillerType());
        intent.putExtra("DISPLAY_TYPE", discoverBucket.getDisplayType());
        intent.putExtra("TITLE", discoverBucket.getTitle());
        Context contextD = p70.g.d(getContext());
        contextD.getClass();
        Activity activity = (Activity) contextD;
        activity.startActivity(intent, mv.a.b(activity));
    }

    @NotNull
    public final h0 getBinding() {
        return this.f22352o;
    }

    @Nullable
    public final Function1<cv.e, Unit> getBucketImpressionListener() {
        return this.f22354q;
    }

    @NotNull
    public final e0 getImpressionHelper() {
        e0 e0Var = this.f22344f;
        if (e0Var != null) {
            return e0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("impressionHelper");
        return null;
    }

    public final boolean getShouldShowSpecialRewards() {
        return this.f22347i;
    }

    public final void setBinding(@NotNull h0 h0Var) {
        h0Var.getClass();
        this.f22352o = h0Var;
    }

    public final void setBucketImpressionListener(@Nullable Function1<? super cv.e, Unit> function1) {
        this.f22354q = function1;
    }

    @Override // hq.j
    public void setDiscoverRow(@NotNull nq.d dVar) {
        Consumer consumer;
        dVar.getClass();
        this.f22351n = dVar;
        this.f22352o.f34886u.setText(dVar.getTitle());
        boolean z11 = dVar instanceof DiscoverBucket;
        lq.l lVar = this.f22346h;
        if (z11) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            this.f22345g = linearLayoutManager;
            linearLayoutManager.setOrientation(0);
            this.f22352o.f34885t.setLayoutManager(this.f22345g);
            this.f22352o.f34885t.setPadding(d70.b.a(8), 0, d70.b.a(32), 0);
            DiscoverBucket discoverBucket = (DiscoverBucket) dVar;
            this.f22346h.a(discoverBucket.getItems(), discoverBucket.getDisplayType(), discoverBucket.getFillerType(), this.f22347i, this.f22348j);
            lVar.f28141f = new ep.l(25, this, dVar);
            TextView textView = this.f22352o.f34884s;
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            TextView textView2 = this.f22352o.f34884s;
            textView2.getClass();
            mv.d.x(textView2, new hb0.o(3, this, dVar));
            if (getParent() == null) {
                c(true);
            }
        }
        lVar.getClass();
        if (z11 && Intrinsics.areEqual(((DiscoverBucket) dVar).getDisplayType(), "FAVORITES") && (consumer = this.f22350m) != null) {
            consumer.accept(lVar);
        }
    }

    public final void setFavoriteAdapterConsumer(@Nullable Consumer<lq.l> consumer) {
        this.f22350m = consumer;
    }

    public final void setFavoriteClickConsumer(@Nullable Consumer<mq.a> consumer) {
        this.l = consumer;
    }

    public final void setFavoritesCustomReminderEnabled(boolean z11) {
        this.f22348j = z11;
    }

    public final void setImpressionHelper(@NotNull e0 e0Var) {
        e0Var.getClass();
        this.f22344f = e0Var;
    }

    public final void setItemConsumer(@Nullable vz.a aVar) {
        this.f22349k = aVar;
    }

    public final void setShouldShowSpecialRewards(boolean z11) {
        this.f22347i = z11;
    }

    public final void setVerticalPosition(int i11) {
        this.f22353p = i11;
    }

    public final void setViewPool(@NotNull e2 e2Var) {
        e2Var.getClass();
        this.f22352o.f34885t.setRecycledViewPool(e2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        final int i11 = 0;
        if (!isInEditMode()) {
            b();
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i12 = h0.f34883v;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        final int i13 = 1;
        h0 h0Var = (h0) a8.k.Z(layoutInflaterFrom, R.layout.discover_bucket_view, this, true, null);
        h0Var.getClass();
        this.f22352o = h0Var;
        setLayoutParams(new RecyclerView.a(-1, -2));
        lq.l lVar = new lq.l();
        this.f22346h = lVar;
        lVar.f28139d = new Consumer(this) { // from class: hq.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f22342b;

            {
                this.f22342b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i14 = i11;
                c cVar = this.f22342b;
                switch (i14) {
                    case 0:
                        lq.m mVar = (lq.m) obj;
                        int i15 = c.f22343r;
                        mVar.getClass();
                        vz.a aVar = cVar.f22349k;
                        if (aVar != null) {
                            aVar.accept(mVar, cVar.f22346h);
                        }
                        break;
                    default:
                        mq.a aVar2 = (mq.a) obj;
                        if (aVar2 == null) {
                            int i16 = c.f22343r;
                        } else {
                            Consumer consumer = cVar.l;
                            if (consumer != null) {
                                consumer.accept(aVar2);
                            }
                        }
                        break;
                }
            }
        };
        lVar.f28140e = new Consumer(this) { // from class: hq.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f22342b;

            {
                this.f22342b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                int i14 = i13;
                c cVar = this.f22342b;
                switch (i14) {
                    case 0:
                        lq.m mVar = (lq.m) obj;
                        int i15 = c.f22343r;
                        mVar.getClass();
                        vz.a aVar = cVar.f22349k;
                        if (aVar != null) {
                            aVar.accept(mVar, cVar.f22346h);
                        }
                        break;
                    default:
                        mq.a aVar2 = (mq.a) obj;
                        if (aVar2 == null) {
                            int i16 = c.f22343r;
                        } else {
                            Consumer consumer = cVar.l;
                            if (consumer != null) {
                                consumer.accept(aVar2);
                            }
                        }
                        break;
                }
            }
        };
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f22345g = linearLayoutManager;
        linearLayoutManager.setOrientation(0);
        this.f22352o.f34885t.setLayoutManager(this.f22345g);
        this.f22352o.f34885t.setAdapter(lVar);
        this.f22352o.f34885t.k(new b0(this, 4));
        this.f22352o.f34885t.j(new fn.p(this, 1));
    }
}
