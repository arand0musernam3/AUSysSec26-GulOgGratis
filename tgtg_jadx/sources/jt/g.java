package jt;

import android.content.Context;
import android.os.Bundle;
import androidx.core.util.Consumer;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.m1;
import androidx.navigation.fragment.NavHostFragment;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabdiscover.discoverbuckets.quickFilters.FilterNoResultView;
import com.app.tgtg.feature.tabdiscover.discoveritems.DiscoverLocalHeroItemView;
import com.app.tgtg.feature.tabprofile.manageaccount.paymentoptions.PaymentOptionsActivity;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.braze.enums.CardKey;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.h2;
import com.braze.requests.n;
import com.braze.storage.EventDuplicationValidatorDataStoreProvider$Companion;
import com.braze.storage.i3;
import com.braze.storage.t0;
import com.braze.storage.t1;
import com.braze.storage.u3;
import com.braze.storage.w0;
import g9.f0;
import g9.g0;
import g9.u0;
import i3.u;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.KTypeParameterBase;
import lo.l;
import lo.m;
import lq.k;
import lq.p;
import lq.s;
import m2.e1;
import m2.y1;
import m3.h1;
import m90.c1;
import org.bouncycastle.iana.AEADAlgorithm;
import u70.t;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25406b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f25405a = i11;
        this.f25406b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.os.Bundle] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Consumer consumer;
        int i11 = this.f25405a;
        int i12 = 3;
        int i13 = 1;
        Object obj = this.f25406b;
        switch (i11) {
            case 0:
                return w.h(new jd.a((h) obj, 4));
            case 1:
                return com.braze.requests.framework.queue.d.a((n) obj);
            case 2:
                ((k2.g) obj).O.invoke(Boolean.valueOf(!r5.N));
                return Unit.f26487a;
            case 3:
                return Float.valueOf(((u) obj).invoke() < 1.0f ? 0.3f : 1.0f);
            case 4:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context context = navHostFragment.getContext();
                if (context == null) {
                    h2.b("NavController cannot be created before the fragment is attached");
                    return null;
                }
                f0 f0Var = new f0(context);
                f0Var.l(navHostFragment);
                ViewModelStore viewModelStore = navHostFragment.getViewModelStore();
                viewModelStore.getClass();
                f0Var.m(viewModelStore);
                l9.f fVar = f0Var.f20186b;
                u0 u0Var = fVar.f27549s;
                Context contextRequireContext = navHostFragment.requireContext();
                contextRequireContext.getClass();
                FragmentManager childFragmentManager = navHostFragment.getChildFragmentManager();
                childFragmentManager.getClass();
                u0Var.a(new k9.d(contextRequireContext, childFragmentManager));
                u0 u0Var2 = fVar.f27549s;
                Context contextRequireContext2 = navHostFragment.requireContext();
                contextRequireContext2.getClass();
                FragmentManager childFragmentManager2 = navHostFragment.getChildFragmentManager();
                childFragmentManager2.getClass();
                int id2 = navHostFragment.getId();
                if (id2 == 0 || id2 == -1) {
                    id2 = R.id.nav_host_fragment_container;
                }
                u0Var2.a(new k9.g(contextRequireContext2, childFragmentManager2, id2));
                Bundle bundleA = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
                if (bundleA != null) {
                    f0Var.j(bundleA);
                }
                navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new androidx.activity.g(f0Var, 2));
                Bundle bundleA2 = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
                if (bundleA2 != null) {
                    navHostFragment.f3562c = bundleA2.getInt("android-support-nav:fragment:graphId");
                }
                navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new androidx.activity.g(navHostFragment, i12));
                int i14 = navHostFragment.f3562c;
                t tVar = f0Var.f20193i;
                if (i14 != 0) {
                    fVar.v(((g0) tVar.getValue()).b(i14), null);
                } else {
                    Bundle arguments = navHostFragment.getArguments();
                    int i15 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
                    bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : 0;
                    if (i15 != 0) {
                        fVar.v(((g0) tVar.getValue()).b(i15), bundle);
                    }
                }
                return f0Var;
            case 5:
                k90.e eVar = (k90.e) obj;
                return Integer.valueOf(c1.f(eVar, eVar.f26232k));
            case 6:
                ih.i iVar = (ih.i) obj;
                cv.i iVar2 = cv.i.SCREEN_BADGE;
                iVar.getClass();
                iVar2.getClass();
                iVar.f23860h.b(iVar2);
                return Unit.f26487a;
            case 7:
                ((h1) obj).i(-1);
                return Unit.f26487a;
            case 8:
                ((ki.i) obj).g(cv.i.ACTION_DECLINE);
                return Unit.f26487a;
            case 9:
                return ArrayIteratorKt.iterator((Object[]) obj);
            case 10:
                return ((Iterable) obj).iterator();
            case 11:
                return KTypeParameterBase.javaContainingDeclaration_delegate$lambda$0((KTypeParameterBase) obj);
            case 12:
                ((FilterNoResultView) obj).l.invoke();
                return Unit.f26487a;
            case 13:
                int i16 = PaymentOptionsActivity.f9428g;
                ((PaymentOptionsActivity) obj).getOnBackPressedDispatcher().d();
                return Unit.f26487a;
            case 14:
                return com.braze.requests.util.b.a((com.braze.requests.util.b) obj);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                m mVar = (m) obj;
                v80.f0.B(m1.d(mVar), null, null, new l(mVar, bundle, i13), 3);
                return Unit.f26487a;
            case 16:
                lq.h hVar = (lq.h) obj;
                mq.a item = hVar.f28125a.getItem();
                FlashSalesItem flashSalesItem = item instanceof FlashSalesItem ? (FlashSalesItem) item : null;
                if (flashSalesItem != null && (consumer = hVar.f28126b.f28132f) != null) {
                    consumer.accept(flashSalesItem);
                }
                return Unit.f26487a;
            case 17:
                k kVar = (k) obj;
                Consumer consumer2 = kVar.f28134b.f28140e;
                if (consumer2 != null) {
                    lq.m mVar2 = kVar.f28133a;
                    if ((mVar2 instanceof p) || (mVar2 instanceof s)) {
                        consumer2.accept(mVar2.getItem());
                    }
                }
                return Unit.f26487a;
            case 18:
                Function0 function0 = ((DiscoverLocalHeroItemView) obj).f9300i;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f26487a;
            case 19:
                return EventDuplicationValidatorDataStoreProvider$Companion.migrateEventDuplicationMap$lambda$3$lambda$2((f8.d) obj);
            case 20:
                return i3.a((i3) obj);
            case 21:
                return com.braze.storage.p.a(Boolean.TRUE, (CardKey) obj);
            case 22:
                return t0.a((DelayedInitializationAnalyticsBehavior) obj);
            case 23:
                return t0.a((t0) obj);
            case 24:
                return t1.a((Map.Entry) obj);
            case 25:
                return u3.a((u3) obj);
            case 26:
                return w0.a((w0) obj);
            case 27:
                return (m5.h) obj;
            case 28:
                return ((e1) obj).d();
            default:
                return new y1((z1.h2) obj, 0.0f);
        }
    }
}
