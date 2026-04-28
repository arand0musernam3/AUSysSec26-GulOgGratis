package com.braze.ui.contentcards;

import a90.p;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i0;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.n0;
import androidx.recyclerview.widget.p0;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s1;
import androidx.recyclerview.widget.y1;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ba0.g;
import c90.f;
import com.app.tgtg.R;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.SdkDataWipeEvent;
import com.braze.h2;
import com.braze.models.inappmessage.m;
import com.braze.support.BrazeLogger;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.contentcards.adapters.EmptyContentCardsAdapter;
import com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler;
import com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.recycler.ContentCardsDividerItemDecoration;
import com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import oa.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.i1;
import x70.c;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0001hB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\tH\u0004¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\tH\u0004¢\u0006\u0004\b\"\u0010\u0004J\u0017\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0004¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0084@¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tH\u0084@¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u00020\t2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+H\u0004¢\u0006\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R.\u00107\u001a\u0004\u0018\u0001062\b\u0010\b\u001a\u0004\u0018\u0001068\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR*\u0010O\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010N8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR*\u0010V\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010N8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bV\u0010P\u001a\u0004\bW\u0010R\"\u0004\bX\u0010TR\u001a\u0010Y\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\u0007R$\u0010\\\u001a\u0004\u0018\u00010\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\\\u0010Z\u001a\u0004\b]\u0010\u0007\"\u0004\b^\u0010\u000bR\u001a\u0010_\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010\u000eR$\u0010b\u001a\u0004\u0018\u00010\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bb\u0010`\u001a\u0004\bc\u0010\u000e\"\u0004\bd\u0010\u0010R\u0018\u0010g\u001a\u0006\u0012\u0002\b\u00030+8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006i"}, d2 = {"Lcom/braze/ui/contentcards/ContentCardsFragment;", "Landroidx/fragment/app/Fragment;", "Loa/h;", "<init>", "()V", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "getContentCardUpdateHandler", "()Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "value", "", "setContentCardUpdateHandler", "(Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;)V", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "getContentCardsViewBindingHandler", "()Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "setContentCardsViewBindingHandler", "(Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onRefresh", "onResume", "onPause", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onViewStateRestored", "initializeRecyclerView", "attachSwipeHelperCallback", "Lcom/braze/events/ContentCardsUpdatedEvent;", "event", "handleContentCardsUpdatedEvent", "(Lcom/braze/events/ContentCardsUpdatedEvent;)V", "contentCardsUpdate", "(Lcom/braze/events/ContentCardsUpdatedEvent;Lx70/c;)Ljava/lang/Object;", "networkUnavailable", "(Lx70/c;)Ljava/lang/Object;", "Landroidx/recyclerview/widget/l1;", "newAdapter", "swapRecyclerViewAdapter", "(Landroidx/recyclerview/widget/l1;)V", "Lv80/i1;", "networkUnavailableJob", "Lv80/i1;", "getNetworkUnavailableJob", "()Lv80/i1;", "setNetworkUnavailableJob", "(Lv80/i1;)V", "Landroidx/recyclerview/widget/RecyclerView;", "contentCardsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getContentCardsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setContentCardsRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "cardAdapter", "Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "defaultEmptyContentCardsAdapter", "Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "getDefaultEmptyContentCardsAdapter", "()Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "setDefaultEmptyContentCardsAdapter", "(Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;)V", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "contentCardsSwipeLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getContentCardsSwipeLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setContentCardsSwipeLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "Lcom/braze/events/IEventSubscriber;", "contentCardsUpdatedSubscriber", "Lcom/braze/events/IEventSubscriber;", "getContentCardsUpdatedSubscriber", "()Lcom/braze/events/IEventSubscriber;", "setContentCardsUpdatedSubscriber", "(Lcom/braze/events/IEventSubscriber;)V", "Lcom/braze/events/SdkDataWipeEvent;", "sdkDataWipeEventSubscriber", "getSdkDataWipeEventSubscriber", "setSdkDataWipeEventSubscriber", "defaultContentCardUpdateHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "getDefaultContentCardUpdateHandler", "customContentCardUpdateHandler", "getCustomContentCardUpdateHandler", "setCustomContentCardUpdateHandler", "defaultContentCardsViewBindingHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "getDefaultContentCardsViewBindingHandler", "customContentCardsViewBindingHandler", "getCustomContentCardsViewBindingHandler", "setCustomContentCardsViewBindingHandler", "getEmptyCardsAdapter", "()Landroidx/recyclerview/widget/l1;", "emptyCardsAdapter", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContentCardsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentCardsFragment.kt\ncom/braze/ui/contentcards/ContentCardsFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1755#2,3:379\n1863#2,2:382\n*S KotlinDebug\n*F\n+ 1 ContentCardsFragment.kt\ncom/braze/ui/contentcards/ContentCardsFragment\n*L\n321#1:379,3\n330#1:382,2\n*E\n"})
public class ContentCardsFragment extends Fragment implements h {
    private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500;

    @NotNull
    private static final String KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY = "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY";

    @NotNull
    private static final String LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY = "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY";
    private static final int MAX_CONTENT_CARDS_TTL_SECONDS = 60;
    private static final long NETWORK_PROBLEM_WARNING_MS = 5000;

    @NotNull
    private static final String UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY = "UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY";

    @NotNull
    private static final String VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY = "VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY";

    @Nullable
    public ContentCardAdapter cardAdapter;

    @Nullable
    private RecyclerView contentCardsRecyclerView;

    @Nullable
    private SwipeRefreshLayout contentCardsSwipeLayout;

    @Nullable
    private IEventSubscriber<ContentCardsUpdatedEvent> contentCardsUpdatedSubscriber;

    @Nullable
    private IContentCardsUpdateHandler customContentCardUpdateHandler;

    @Nullable
    private IContentCardsViewBindingHandler customContentCardsViewBindingHandler;

    @Nullable
    private i1 networkUnavailableJob;

    @Nullable
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;

    @NotNull
    private EmptyContentCardsAdapter defaultEmptyContentCardsAdapter = new EmptyContentCardsAdapter();

    @NotNull
    private final IContentCardsUpdateHandler defaultContentCardUpdateHandler = new DefaultContentCardsUpdateHandler();

    @NotNull
    private final IContentCardsViewBindingHandler defaultContentCardsViewBindingHandler = new DefaultContentCardsViewBindingHandler();

    /* JADX INFO: renamed from: com.braze.ui.contentcards.ContentCardsFragment$contentCardsUpdate$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.braze.ui.contentcards.ContentCardsFragment$contentCardsUpdate$5", f = "ContentCardsFragment.kt", l = {312}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass5 extends i implements Function1<c<? super Unit>, Object> {
        int label;

        public AnonymousClass5(c<? super AnonymousClass5> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return ContentCardsFragment.this.new AnonymousClass5(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(c<? super Unit> cVar) {
            return ((AnonymousClass5) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ContentCardsFragment contentCardsFragment = ContentCardsFragment.this;
                this.label = 1;
                if (contentCardsFragment.networkUnavailable(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.contentcards.ContentCardsFragment$handleContentCardsUpdatedEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.braze.ui.contentcards.ContentCardsFragment$handleContentCardsUpdatedEvent$1", f = "ContentCardsFragment.kt", l = {272}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 0, 0})
    public static final class AnonymousClass1 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ ContentCardsUpdatedEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ContentCardsUpdatedEvent contentCardsUpdatedEvent, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$event = contentCardsUpdatedEvent;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ContentCardsFragment.this.new AnonymousClass1(this.$event, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ContentCardsFragment contentCardsFragment = ContentCardsFragment.this;
                ContentCardsUpdatedEvent contentCardsUpdatedEvent = this.$event;
                this.label = 1;
                if (contentCardsFragment.contentCardsUpdate(contentCardsUpdatedEvent, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.contentcards.ContentCardsFragment$onRefresh$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.braze.ui.contentcards.ContentCardsFragment$onRefresh$1", f = "ContentCardsFragment.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C01451 extends i implements Function1<c<? super Unit>, Object> {
        int label;

        public C01451(c<? super C01451> cVar) {
            super(1, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(c<?> cVar) {
            return ContentCardsFragment.this.new C01451(cVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(c<? super Unit> cVar) {
            return ((C01451) create(cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            SwipeRefreshLayout contentCardsSwipeLayout = ContentCardsFragment.this.getContentCardsSwipeLayout();
            if (contentCardsSwipeLayout != null) {
                contentCardsSwipeLayout.setRefreshing(false);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.contentcards.ContentCardsFragment$onViewStateRestored$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.braze.ui.contentcards.ContentCardsFragment$onViewStateRestored$1", f = "ContentCardsFragment.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 0, 0})
    public static final class C01461 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ Bundle $savedInstanceState;
        int label;
        final /* synthetic */ ContentCardsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01461(Bundle bundle, ContentCardsFragment contentCardsFragment, c<? super C01461> cVar) {
            super(2, cVar);
            this.$savedInstanceState = bundle;
            this.this$0 = contentCardsFragment;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return new C01461(this.$savedInstanceState, this.this$0, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C01461) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            ArrayList<String> stringArrayList;
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            int i11 = Build.VERSION.SDK_INT;
            Bundle bundle = this.$savedInstanceState;
            Parcelable parcelable = i11 >= 33 ? (Parcelable) bundle.getParcelable(ContentCardsFragment.LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY, Parcelable.class) : bundle.getParcelable(ContentCardsFragment.LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY);
            RecyclerView contentCardsRecyclerView = this.this$0.getContentCardsRecyclerView();
            if (contentCardsRecyclerView != null) {
                y1 layoutManager = contentCardsRecyclerView.getLayoutManager();
                if (parcelable != null && layoutManager != null) {
                    layoutManager.onRestoreInstanceState(parcelable);
                }
            }
            ContentCardAdapter contentCardAdapter = this.this$0.cardAdapter;
            if (contentCardAdapter != null && (stringArrayList = this.$savedInstanceState.getStringArrayList(ContentCardsFragment.KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY)) != null) {
                contentCardAdapter.setImpressedCardIds(stringArrayList);
            }
            return Unit.f26487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$10(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        return "Updating Content Cards views in response to ContentCardsUpdatedEvent: " + contentCardsUpdatedEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$11() {
        return "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$12() {
        return "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000 ms.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String networkUnavailable$lambda$16() {
        return "Displaying network unavailable toast.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPause$lambda$4() {
        return "Invoked com.braze.ui.contentcards.ContentCardsFragment.onPause()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0(ContentCardsFragment contentCardsFragment, ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        contentCardsUpdatedEvent.getClass();
        contentCardsFragment.handleContentCardsUpdatedEvent(contentCardsUpdatedEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$2(ContentCardsFragment contentCardsFragment, SdkDataWipeEvent sdkDataWipeEvent) {
        sdkDataWipeEvent.getClass();
        contentCardsFragment.handleContentCardsUpdatedEvent(ContentCardsUpdatedEvent.INSTANCE.getEmptyUpdate());
    }

    public final void attachSwipeHelperCallback() {
        p0 p0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter == null || (recyclerView2 = (p0Var = new p0(new SimpleItemTouchHelperCallback(contentCardAdapter))).f3866r) == (recyclerView = this.contentCardsRecyclerView)) {
            return;
        }
        i0 i0Var = p0Var.f3874z;
        if (recyclerView2 != null) {
            recyclerView2.f0(p0Var);
            RecyclerView recyclerView3 = p0Var.f3866r;
            recyclerView3.f3604q.remove(i0Var);
            if (recyclerView3.f3606r == i0Var) {
                recyclerView3.f3606r = null;
            }
            ArrayList arrayList = p0Var.f3866r.C;
            if (arrayList != null) {
                arrayList.remove(p0Var);
            }
            ArrayList arrayList2 = p0Var.f3864p;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                j0 j0Var = (j0) arrayList2.get(0);
                j0Var.f3782g.cancel();
                p0Var.f3861m.clearView(p0Var.f3866r, j0Var.f3780e);
            }
            arrayList2.clear();
            p0Var.f3871w = null;
            VelocityTracker velocityTracker = p0Var.f3868t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                p0Var.f3868t = null;
            }
            n0 n0Var = p0Var.f3873y;
            if (n0Var != null) {
                n0Var.f3824a = false;
                p0Var.f3873y = null;
            }
            if (p0Var.f3872x != null) {
                p0Var.f3872x = null;
            }
        }
        p0Var.f3866r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            p0Var.f3855f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            p0Var.f3856g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            p0Var.f3865q = ViewConfiguration.get(p0Var.f3866r.getContext()).getScaledTouchSlop();
            p0Var.f3866r.i(p0Var);
            p0Var.f3866r.f3604q.add(i0Var);
            p0Var.f3866r.j(p0Var);
            p0Var.f3873y = new n0(p0Var);
            p0Var.f3872x = new GestureDetector(p0Var.f3866r.getContext(), p0Var.f3873y);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[LOOP:0: B:35:0x00c2->B:37:0x00c8, LOOP_END] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object contentCardsUpdate(@org.jetbrains.annotations.NotNull com.braze.events.ContentCardsUpdatedEvent r11, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.ui.contentcards.ContentCardsFragment.contentCardsUpdate(com.braze.events.ContentCardsUpdatedEvent, x70.c):java.lang.Object");
    }

    @NotNull
    public final IContentCardsUpdateHandler getContentCardUpdateHandler() {
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        return iContentCardsUpdateHandler == null ? this.defaultContentCardUpdateHandler : iContentCardsUpdateHandler;
    }

    @Nullable
    public final RecyclerView getContentCardsRecyclerView() {
        return this.contentCardsRecyclerView;
    }

    @Nullable
    public final SwipeRefreshLayout getContentCardsSwipeLayout() {
        return this.contentCardsSwipeLayout;
    }

    @Nullable
    public final IEventSubscriber<ContentCardsUpdatedEvent> getContentCardsUpdatedSubscriber() {
        return this.contentCardsUpdatedSubscriber;
    }

    @NotNull
    public final IContentCardsViewBindingHandler getContentCardsViewBindingHandler() {
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        return iContentCardsViewBindingHandler == null ? this.defaultContentCardsViewBindingHandler : iContentCardsViewBindingHandler;
    }

    @Nullable
    public final IContentCardsUpdateHandler getCustomContentCardUpdateHandler() {
        return this.customContentCardUpdateHandler;
    }

    @Nullable
    public final IContentCardsViewBindingHandler getCustomContentCardsViewBindingHandler() {
        return this.customContentCardsViewBindingHandler;
    }

    @NotNull
    public final IContentCardsUpdateHandler getDefaultContentCardUpdateHandler() {
        return this.defaultContentCardUpdateHandler;
    }

    @NotNull
    public final IContentCardsViewBindingHandler getDefaultContentCardsViewBindingHandler() {
        return this.defaultContentCardsViewBindingHandler;
    }

    @NotNull
    public final EmptyContentCardsAdapter getDefaultEmptyContentCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    @NotNull
    public final l1 getEmptyCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    @Nullable
    public final i1 getNetworkUnavailableJob() {
        return this.networkUnavailableJob;
    }

    @Nullable
    public final IEventSubscriber<SdkDataWipeEvent> getSdkDataWipeEventSubscriber() {
        return this.sdkDataWipeEventSubscriber;
    }

    public final void handleContentCardsUpdatedEvent(@NotNull ContentCardsUpdatedEvent event) {
        event.getClass();
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        f fVar = v80.p0.f42144a;
        f0.B(brazeCoroutineScope, p.f1044a, null, new AnonymousClass1(event, null), 2);
    }

    public final void initializeRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ContentCardAdapter contentCardAdapter = new ContentCardAdapter(contextRequireContext, linearLayoutManager, new ArrayList(), getContentCardsViewBindingHandler());
        this.cardAdapter = contentCardAdapter;
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(contentCardAdapter);
        }
        RecyclerView recyclerView2 = this.contentCardsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        attachSwipeHelperCallback();
        RecyclerView recyclerView3 = this.contentCardsRecyclerView;
        s1 itemAnimator = recyclerView3 != null ? recyclerView3.getItemAnimator() : null;
        if (itemAnimator instanceof r) {
            ((r) itemAnimator).f3888g = false;
        }
        RecyclerView recyclerView4 = this.contentCardsRecyclerView;
        if (recyclerView4 != null) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            recyclerView4.i(new ContentCardsDividerItemDecoration(contextRequireContext2));
        }
    }

    @Nullable
    public final Object networkUnavailable(@NotNull c<? super Unit> cVar) {
        Context applicationContext;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new m(26), 6, (Object) null);
        Context context = getContext();
        if (context != null && (applicationContext = context.getApplicationContext()) != null) {
            Toast.makeText(applicationContext, applicationContext.getString(com.braze.ui.R.string.com_braze_feed_connection_error_title), 1).show();
        }
        swapRecyclerViewAdapter(getEmptyCardsAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return Unit.f26487a;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        View viewInflate = inflater.inflate(com.braze.ui.R.layout.com_braze_content_cards, container, false);
        this.contentCardsRecyclerView = (RecyclerView) viewInflate.findViewById(com.braze.ui.R.id.com_braze_content_cards_recycler);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(com.braze.ui.R.id.braze_content_cards_swipe_container);
        this.contentCardsSwipeLayout = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setColorSchemeResources(com.braze.ui.R.color.com_braze_content_cards_swipe_refresh_color_1, com.braze.ui.R.color.com_braze_content_cards_swipe_refresh_color_2, com.braze.ui.R.color.com_braze_content_cards_swipe_refresh_color_3, com.braze.ui.R.color.com_braze_content_cards_swipe_refresh_color_4);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new m(29), 6, (Object) null);
        Braze.Companion companion = Braze.INSTANCE;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        companion.getInstance(contextRequireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        Context contextRequireContext2 = requireContext();
        contextRequireContext2.getClass();
        companion.getInstance(contextRequireContext2).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        i1 i1Var = this.networkUnavailableJob;
        if (i1Var != null) {
            i1Var.a(null);
        }
        this.networkUnavailableJob = null;
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.markOnScreenCardsAsRead();
        }
    }

    @Override // oa.h
    public void onRefresh() {
        Braze.Companion companion = Braze.INSTANCE;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        companion.getInstance(contextRequireContext).requestContentCardsRefresh();
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS), null, new C01451(null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Braze.Companion companion = Braze.INSTANCE;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        companion.getInstance(contextRequireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        if (this.contentCardsUpdatedSubscriber == null) {
            final int i11 = 0;
            this.contentCardsUpdatedSubscriber = new IEventSubscriber(this) { // from class: com.braze.ui.contentcards.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ContentCardsFragment f10912b;

                {
                    this.f10912b = this;
                }

                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) {
                    switch (i11) {
                        case 0:
                            ContentCardsFragment.onResume$lambda$0(this.f10912b, (ContentCardsUpdatedEvent) obj);
                            break;
                        default:
                            ContentCardsFragment.onResume$lambda$2(this.f10912b, (SdkDataWipeEvent) obj);
                            break;
                    }
                }
            };
        }
        IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber = this.contentCardsUpdatedSubscriber;
        if (iEventSubscriber != null) {
            Context contextRequireContext2 = requireContext();
            contextRequireContext2.getClass();
            companion.getInstance(contextRequireContext2).subscribeToContentCardsUpdates(iEventSubscriber);
        }
        Context contextRequireContext3 = requireContext();
        contextRequireContext3.getClass();
        companion.getInstance(contextRequireContext3).requestContentCardsRefreshFromCache();
        Context contextRequireContext4 = requireContext();
        contextRequireContext4.getClass();
        companion.getInstance(contextRequireContext4).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        if (this.sdkDataWipeEventSubscriber == null) {
            final int i12 = 1;
            this.sdkDataWipeEventSubscriber = new IEventSubscriber(this) { // from class: com.braze.ui.contentcards.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ContentCardsFragment f10912b;

                {
                    this.f10912b = this;
                }

                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) {
                    switch (i12) {
                        case 0:
                            ContentCardsFragment.onResume$lambda$0(this.f10912b, (ContentCardsUpdatedEvent) obj);
                            break;
                        default:
                            ContentCardsFragment.onResume$lambda$2(this.f10912b, (SdkDataWipeEvent) obj);
                            break;
                    }
                }
            };
        }
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber2 = this.sdkDataWipeEventSubscriber;
        if (iEventSubscriber2 != null) {
            Context contextRequireContext5 = requireContext();
            contextRequireContext5.getClass();
            companion.getInstance(contextRequireContext5).addSingleSynchronousSubscription(iEventSubscriber2, SdkDataWipeEvent.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        y1 layoutManager;
        outState.getClass();
        super.onSaveInstanceState(outState);
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            outState.putParcelable(LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY, layoutManager.onSaveInstanceState());
        }
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            outState.putStringArrayList(KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY, new ArrayList<>(contentCardAdapter.getImpressedCardIds()));
        }
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        if (iContentCardsViewBindingHandler != null) {
            outState.putParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY, iContentCardsViewBindingHandler);
        }
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        if (iContentCardsUpdateHandler != null) {
            outState.putParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY, iContentCardsUpdateHandler);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            int i11 = Build.VERSION.SDK_INT;
            IContentCardsUpdateHandler iContentCardsUpdateHandler = i11 >= 33 ? (IContentCardsUpdateHandler) savedInstanceState.getParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY, IContentCardsUpdateHandler.class) : (IContentCardsUpdateHandler) savedInstanceState.getParcelable(UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY);
            if (iContentCardsUpdateHandler != null) {
                setContentCardUpdateHandler(iContentCardsUpdateHandler);
            }
            IContentCardsViewBindingHandler iContentCardsViewBindingHandler = i11 >= 33 ? (IContentCardsViewBindingHandler) savedInstanceState.getParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY, IContentCardsViewBindingHandler.class) : (IContentCardsViewBindingHandler) savedInstanceState.getParcelable(VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY);
            if (iContentCardsViewBindingHandler != null) {
                setContentCardsViewBindingHandler(iContentCardsViewBindingHandler);
            }
            BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
            f fVar = v80.p0.f42144a;
            f0.B(brazeCoroutineScope, p.f1044a, null, new C01461(savedInstanceState, this, null), 2);
        }
        initializeRecyclerView();
    }

    public final void setContentCardUpdateHandler(@Nullable IContentCardsUpdateHandler value) {
        this.customContentCardUpdateHandler = value;
    }

    public final void setContentCardsRecyclerView(@Nullable RecyclerView recyclerView) {
        this.contentCardsRecyclerView = recyclerView;
    }

    public final void setContentCardsSwipeLayout(@Nullable SwipeRefreshLayout swipeRefreshLayout) {
        this.contentCardsSwipeLayout = swipeRefreshLayout;
    }

    public final void setContentCardsUpdatedSubscriber(@Nullable IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber) {
        this.contentCardsUpdatedSubscriber = iEventSubscriber;
    }

    public final void setContentCardsViewBindingHandler(@Nullable IContentCardsViewBindingHandler value) {
        this.customContentCardsViewBindingHandler = value;
    }

    public final void setCustomContentCardUpdateHandler(@Nullable IContentCardsUpdateHandler iContentCardsUpdateHandler) {
        this.customContentCardUpdateHandler = iContentCardsUpdateHandler;
    }

    public final void setCustomContentCardsViewBindingHandler(@Nullable IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.customContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
    }

    public final void setDefaultEmptyContentCardsAdapter(@NotNull EmptyContentCardsAdapter emptyContentCardsAdapter) {
        emptyContentCardsAdapter.getClass();
        this.defaultEmptyContentCardsAdapter = emptyContentCardsAdapter;
    }

    public final void setNetworkUnavailableJob(@Nullable i1 i1Var) {
        this.networkUnavailableJob = i1Var;
    }

    public final void setSdkDataWipeEventSubscriber(@Nullable IEventSubscriber<SdkDataWipeEvent> iEventSubscriber) {
        this.sdkDataWipeEventSubscriber = iEventSubscriber;
    }

    public final void swapRecyclerViewAdapter(@NotNull l1 newAdapter) {
        newAdapter.getClass();
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView == null || recyclerView.getAdapter() == newAdapter) {
            return;
        }
        recyclerView.setAdapter(newAdapter);
    }
}
